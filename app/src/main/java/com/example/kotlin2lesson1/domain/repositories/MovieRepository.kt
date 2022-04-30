package com.example.kotlin2lesson1.domain.repositories

import com.example.kotlin2lesson1.domain.either.Either
import com.example.kotlin2lesson1.domain.models.FilmModel
import kotlinx.coroutines.flow.Flow

interface MovieRepository {

    fun fetchMovies(): Flow<Either<String, List<FilmModel>>>
}