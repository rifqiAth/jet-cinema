package com.bangkit.jetpackcompose

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.bangkit.jetpackcompose.ui.navigation.Screen
import com.bangkit.jetpackcompose.ui.screen.about.AboutScreen
import com.bangkit.jetpackcompose.ui.screen.detail.DetailScreen
import com.bangkit.jetpackcompose.ui.screen.home.HomeScreen
import com.bangkit.jetpackcompose.ui.theme.JetpackComposeTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun JetMovieApp(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBar(
                navigationIcon = {
                    if (currentRoute != Screen.Home.route) {
                        IconButton(onClick = { navController.navigateUp() }) {
                            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Back")
                        }
                    }
                },
                title = {
                    Text(
                        text = if (currentRoute != Screen.DetailMovie.route) currentRoute.toString() else {
                            "Detail Movie"
                        }
                    )
                },
                actions = {
                    if (currentRoute == Screen.Home.route) {
                        IconButton(onClick = { navController.navigate(Screen.About.route) }) {
                            Icon(imageVector = Icons.Default.Person, contentDescription = "About")
                        }
                    }
                })
        },
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(Screen.Home.route) {
                HomeScreen(navigateToDetail = { movieId ->
                    navController.navigate(Screen.DetailMovie.createRoute(movieId))
                })
            }
            composable(Screen.About.route) {
                AboutScreen()
            }
            composable(
                route = Screen.DetailMovie.route,
                arguments = listOf(navArgument("movieId") { type = NavType.IntType }),
            ) {
                val id = it.arguments?.getInt("movieId") ?: 1
                DetailScreen(
                    movieId = id,
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun JetMoviePreview() {
    JetpackComposeTheme {
        JetMovieApp()
    }
}