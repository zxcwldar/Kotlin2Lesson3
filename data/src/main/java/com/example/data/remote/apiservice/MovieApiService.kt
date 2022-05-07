package com.example.data.remote.apiservice

import com.example.data.dtos.FilmDto
import retrofit2.http.GET

interface MovieApiService {

    @GET("films")
    suspend fun getTvShows(): List<FilmDto>
}