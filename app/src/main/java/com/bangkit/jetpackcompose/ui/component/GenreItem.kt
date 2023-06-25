package com.bangkit.jetpackcompose.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bangkit.jetpackcompose.model.Genre
import com.bangkit.jetpackcompose.ui.theme.JetpackComposeTheme
import com.bangkit.jetpackcompose.ui.theme.Shapes

@Composable
fun GenreItem(
    genre: Genre
) {
    Box(
        modifier = Modifier
            .padding(1.5.dp)
    ) {
        Text(
            text = genre.text,
            color = Color.White,
            style = MaterialTheme.typography.labelSmall,
            modifier = Modifier
                .background(genre.color, Shapes.medium)
                .padding(vertical = 0.dp, horizontal = 4.dp)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun GenreItemPreview() {
    JetpackComposeTheme {
        GenreItem(Genre.Action)
    }
}