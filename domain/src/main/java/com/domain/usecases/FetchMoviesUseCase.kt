package com.domain.usecases

import com.domain.repositories.MovieRepository
import javax.inject.Inject

class FetchMoviesUseCase @Inject constructor(private val repository: MovieRepository) {
    operator fun invoke() = repository.fetchMovies()
}