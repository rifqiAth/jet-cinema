package com.bangkit.jetpackcompose.ui.screen.home

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bangkit.jetpackcompose.model.Movie
import com.bangkit.jetpackcompose.model.MoviesData
import com.bangkit.jetpackcompose.ui.component.MovieListItem
import com.bangkit.jetpackcompose.ui.component.ScrollToTopButton
import com.bangkit.jetpackcompose.ui.theme.JetpackComposeTheme
import kotlinx.coroutines.launch

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    navigateToDetail: (Int) -> Unit,
) {
    HomeContent(
        moviesItem = MoviesData.movies,
        modifier = modifier,
        navigateToDetail = navigateToDetail,
    )
}

@Composable
fun HomeContent(
    moviesItem: List<Movie>,
    modifier: Modifier = Modifier,
    navigateToDetail: (Int) -> Unit,
) {
    Box(modifier = modifier) {
        val scope = rememberCoroutineScope()
        val listState = rememberLazyListState()
        val showButton: Boolean by remember {
            derivedStateOf { listState.firstVisibleItemIndex > 0 }
        }
        Spacer(modifier = Modifier.height(4.dp))
        LazyColumn(
            state = listState, modifier = modifier
        ) {
            items(moviesItem, key = { it.id }) { movie ->
                MovieListItem(
                    movie = movie,
                    modifier = Modifier.clickable {
                            navigateToDetail(movie.id-1)
                        })
            }
        }
        AnimatedVisibility(
            visible = showButton,
            enter = fadeIn() + slideInVertically(),
            exit = fadeOut() + slideOutVertically(),
            modifier = Modifier
                .padding(bottom = 30.dp)
                .align(Alignment.BottomCenter)
        ) {
            ScrollToTopButton(onClick = {
                scope.launch {
                    listState.animateScrollToItem(index = 0)
                }
            })
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    JetpackComposeTheme {
        HomeContent(
            moviesItem = MoviesData.movies,
            modifier = Modifier,
            navigateToDetail = {
            },
        )
    }
}
