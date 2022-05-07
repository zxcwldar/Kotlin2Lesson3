package com.data.repository

import com.data.dtos.toDomain
import com.data.remote.apiservice.MovieApiService
import com.data.repository.base.BaseRepository
import com.domain.repositories.MovieRepository
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(
    private val movieApiService: MovieApiService
) : BaseRepository(), MovieRepository {

    override fun fetchMovies() = sendRequest {
        movieApiService.getTvShows().map { it.toDomain() }


    }
}