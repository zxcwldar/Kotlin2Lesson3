package com.example.kotlin2lesson1.data

import com.example.kotlin2lesson1.base.BaseRepository
import com.example.kotlin2lesson1.data.remote.apisrvice.MovieApiService
import javax.inject.Inject

class MovieRepository @Inject constructor(
    private val movieApiService: MovieApiService
) : BaseRepository() {

    fun fetchMovies() = sendRequest {
        movieApiService.getTvShows()


    }
}