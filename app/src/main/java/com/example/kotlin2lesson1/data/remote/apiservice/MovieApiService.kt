package com.example.kotlin2lesson1.data.remote.apiservice

import com.example.kotlin2lesson1.data.dtos.FilmDto
import retrofit2.http.GET

interface MovieApiService {

    @GET("films")
    suspend fun getTvShows(): List<FilmDto>
}