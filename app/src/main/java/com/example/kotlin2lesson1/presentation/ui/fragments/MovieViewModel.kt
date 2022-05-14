package com.example.kotlin2lesson1.presentation.ui.fragments

import com.domain.models.FilmModel
import com.domain.usecases.FetchMoviesUseCase
import com.example.kotlin2lesson1.base.BaseViewModel
import com.example.kotlin2lesson1.presentation.models.FilmUI
import com.example.kotlin2lesson1.presentation.models.toUI
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class MovieViewModel @Inject constructor(
    private val fetchMoviesUseCase: FetchMoviesUseCase
) :
    BaseViewModel() {

    private val _movieState = mutableUiStateFlow<List<FilmUI>>()
    var movieState = _movieState.asStateFlow()


    init {
        fetchMovies()
    }

    fun fetchMovies() =
        fetchMoviesUseCase().gatherRequest(_movieState) { it -> it.map { it.toUI() } }

}