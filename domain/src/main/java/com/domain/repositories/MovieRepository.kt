package com.domain.repositories

import com.domain.either.Either
import com.domain.models.FilmModel
import kotlinx.coroutines.flow.Flow

interface MovieRepository {

    fun fetchMovies(): Flow<Either<String, List<FilmModel>>>
}