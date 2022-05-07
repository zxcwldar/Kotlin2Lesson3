package com.data.remote.apiservice

import com.data.dtos.FilmDto
import retrofit2.http.GET

interface MovieApiService {

    @GET("films")
    suspend fun getTvShows(): List<FilmDto>
}