package com.example.kotlin2lesson1.domain.usecases

import com.example.kotlin2lesson1.domain.repositories.MovieRepository
import javax.inject.Inject

class FetchMoviesUseCase @Inject constructor(private val repository: MovieRepository) {
    operator fun invoke() = repository.fetchMovies()
}