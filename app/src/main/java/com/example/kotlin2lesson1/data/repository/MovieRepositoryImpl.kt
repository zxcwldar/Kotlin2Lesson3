package com.example.kotlin2lesson1.data.repository

import com.example.kotlin2lesson1.base.BaseRepository
import com.example.kotlin2lesson1.data.dtos.toDomain
import com.example.kotlin2lesson1.data.remote.apiservice.MovieApiService
import com.example.kotlin2lesson1.domain.repositories.MovieRepository
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(
    private val movieApiService: MovieApiService
) : BaseRepository(), MovieRepository {

    override fun fetchMovies() = sendRequest {
        movieApiService.getTvShows().map { it.toDomain() }


    }
}