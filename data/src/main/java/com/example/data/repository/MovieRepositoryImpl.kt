package com.example.data.repository

import com.example.data.dtos.toDomain
import com.example.data.remote.apiservice.MovieApiService
import com.example.data.repository.base.BaseRepository
import com.domain.repositories.MovieRepository
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(
    private val movieApiService: MovieApiService
) : BaseRepository(), MovieRepository {

    override fun fetchMovies() = sendRequest {
        movieApiService.getTvShows().map { it.toDomain() }


    }
}