package com.bangkit.jetpackcompose.ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
import com.bangkit.jetpackcompose.ui.theme.Image
import com.bangkit.jetpackcompose.ui.theme.JetpackComposeTheme
import com.bangkit.jetpackcompose.ui.theme.Shapes

@Composable
fun MovieListItem(
    movie: Movie,
    modifier: Modifier = Modifier,
) {
    Card(
        shape = MaterialTheme.shapes.medium,
        modifier = modifier
            .padding(vertical = 4.dp, horizontal = 8.dp)
            .clip(Shapes.medium)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            AsyncImage(
                model = movie.photoUrl,
                contentDescription = "Poster Movie",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(160.dp)
                    .width(110.dp)
                    .clip(Image.medium)
            )
            Column(
                modifier = Modifier
                    .weight(1f)
                    .height(160.dp)
                    .padding(8.dp)
            ) {
                Text(
                    text = movie.name,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                )
                Text(
                    text = movie.date, style = MaterialTheme.typography.bodySmall.copy(
                        fontStyle = FontStyle.Italic
                    )
                )
                Spacer(modifier = Modifier.height(8.dp))
                LazyRow(modifier = modifier.weight(1f)) {
                    items(movie.genre) { genre ->
                        GenreItem(genre)
                    }
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        text = movie.rating.toString(),
                        style = MaterialTheme.typography.bodyMedium,
                        modifier = Modifier.weight(1f),
                        textAlign = TextAlign.End,
                    )
                    Icon(
                        modifier = Modifier.padding(4.dp, 0.dp),
                        imageVector = Icons.Default.Star,
                        contentDescription = "Like",
                        tint = Color.Yellow,
                    )

                }
            }

        }
    }


}

@Preview(showBackground = true)
@Composable
fun MovieListItemPreview() {
    JetpackComposeTheme {
        MovieListItem(
            movie = getIndexData(9)
        )
    }
}