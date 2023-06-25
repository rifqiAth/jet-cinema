package com.bangkit.jetpackcompose.ui.screen.detail

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.bangkit.jetpackcompose.model.Movie
import com.bangkit.jetpackcompose.model.MoviesData.getIndexData
import com.bangkit.jetpackcompose.ui.component.GenreItem
import com.bangkit.jetpackcompose.ui.theme.JetpackComposeTheme

@Composable
fun DetailScreen(
    modifier: Modifier = Modifier,
    movieId: Int,
) {
    val movie = getIndexData(movieId)
    DetailContent(
        movie = movie,
        modifier = modifier,
    )
}

@Composable
fun DetailContent(
    movie: Movie,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = movie.name,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
        )
        Spacer(modifier = Modifier.height(8.dp))
        AsyncImage(
            model = movie.photoUrl,
            contentDescription = "Poster Movie",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .height(200.dp)
                .width(160.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = movie.date, style = MaterialTheme.typography.bodySmall.copy(
                    fontStyle = FontStyle.Italic
                )
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = movie.rating.toString(),
                style = MaterialTheme.typography.bodyMedium,
                textAlign = TextAlign.End,
            )
            Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "Like",
                tint = Color.Yellow,
            )

        }
        Spacer(modifier = Modifier.height(8.dp))
        LazyRow(modifier = modifier) {
            items(movie.genre) { genre ->
                GenreItem(genre)
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Sinopsis",
            style = MaterialTheme.typography.bodyMedium.copy(
                fontWeight = FontWeight.Bold
            )
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = movie.description,
            style = MaterialTheme.typography.bodyMedium,
            textAlign = TextAlign.Justify,
        )
    }

}

@Preview(showBackground = true)
@Composable
fun DetailScreenPreview() {
    JetpackComposeTheme {
        DetailContent(movie = getIndexData(1))
    }
}