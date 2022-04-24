package com.example.kotlin2lesson1.data.remote.apisrvice

import com.example.kotlin2lesson1.data.remote.dtos.FilmDtoX
import retrofit2.http.GET

interface MovieApiService {

    @GET("films")
    suspend fun getTvShows(): List<FilmDtoX>
}