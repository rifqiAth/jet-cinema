package com.bangkit.jetpackcompose.ui.navigation

sealed class Screen(val route: String) {
    object Home : Screen("Home")
    object About : Screen("About")
    object DetailMovie : Screen("Home/{movieId}") {
        fun createRoute(movieId: Int) = "Home/$movieId"
    }
}
