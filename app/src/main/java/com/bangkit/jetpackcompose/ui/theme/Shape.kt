package com.bangkit.jetpackcompose.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

val Shapes = Shapes(
    small = RoundedCornerShape(4.dp),
    medium = RoundedCornerShape(8.dp),
)

val Image = Shapes(
    small = RoundedCornerShape(4.dp,0.dp,0.dp,4.dp),
    medium = RoundedCornerShape(8.dp,0.dp,0.dp,8.dp),
)