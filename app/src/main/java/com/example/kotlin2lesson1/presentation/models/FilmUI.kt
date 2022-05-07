package com.example.kotlin2lesson1.presentation.models

import com.domain.models.FilmModel
import com.example.kotlin2lesson1.base.BaseDiffModel


data class FilmUI(
    override val id: String,
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
) : BaseDiffModel

fun FilmModel.toUI() = FilmUI(
    id, title, originalTitle,
    originalTitleRomanised, image,
    movieBanner, description,
    director, producer, releaseDate, runningTime, rtScore, people, species, locations, vehicles, url
)