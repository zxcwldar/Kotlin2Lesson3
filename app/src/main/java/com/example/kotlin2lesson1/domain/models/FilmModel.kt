package com.example.kotlin2lesson1.domain.models

data class FilmModel(
    val id: String,
    val title: String,
    val originalTitle: String,
    val originalTitleRomanised: String,
    val image: String,
    val movieBanner: String,
    val description: String,
    val director: String,
    val producer: String,
    val releaseDate: String,
    val runningTime: String,
    val rtScore: String,
    val people: List<String>,
    val species: List<String>,
    val locations: List<String>,
    val vehicles: List<String>,
    val url: String
)
