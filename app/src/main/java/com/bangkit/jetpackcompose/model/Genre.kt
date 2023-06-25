package com.bangkit.jetpackcompose.model

import androidx.compose.ui.graphics.Color
import com.bangkit.jetpackcompose.ui.theme.genre.*

sealed class Genre(val text: String, val color: Color){
    object Adventure : Genre("Adventure",ColAdventure)
    object Action : Genre("Action", ColAction)
    object ActionAdventure : Genre("Action Adventure", ColActionAdventure)
    object Comedy : Genre("Comedy",ColComedy)
    object Crime : Genre("Crime",ColCrime)
    object Drama : Genre("Drama",ColDrama)
    object Fantasy : Genre("Fantasy",ColFantasy)
    object FictionWest : Genre("FictionWest",ColFictionWest)
    object Mystery : Genre("Mystery",ColMystery)
    object Science : Genre("Science",ColScience)
    object SciFi : Genre("Sci-Fi",ColSciFi)
    object TVSeriWestern : Genre("TV SeriWestern",ColTVSeriWestern)
    object WarPolitics : Genre("War Politics",ColWarPolitics)
}
