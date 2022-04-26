package com.example.kotlin2lesson1.ui.fragments

import com.example.kotlin2lesson1.base.BaseViewModel
import com.example.kotlin2lesson1.data.MovieRepository
import com.example.kotlin2lesson1.data.remote.dtos.FilmDtoX
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class MovieViewModel @Inject constructor(
    private val movieRepository: MovieRepository
) : BaseViewModel() {

    private val _movieState = mutableUiStateFlow<List<FilmDtoX>>()
    var movieState = _movieState.asStateFlow()

    init {
        fetchMovies()
    }

    fun fetchMovies() = movieRepository.fetchMovies().gatherRequest(_movieState)


}