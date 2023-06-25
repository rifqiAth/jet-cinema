package com.bangkit.jetpackcompose.model

data class Movie(
    var id: Int,
    var name: String,
    var date: String,
    var genre: List<Genre>,
    var rating: Float,
    var description: String,
    var photoUrl: String,
)
