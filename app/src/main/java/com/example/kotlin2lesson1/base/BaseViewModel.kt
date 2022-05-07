package com.example.kotlin2lesson1.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.domain.either.Either
import com.example.kotlin2lesson1.presentation.ui.state.UiState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

abstract class BaseViewModel : ViewModel() {
    protected fun <T> mutableUiStateFlow() = MutableStateFlow<UiState<T>>(UiState.Idle())

    protected fun <T, S> Flow<Either<String, T>>.gatherRequest(
        state: MutableStateFlow<UiState<S>>,
        mapData: (data: T) -> S,

        ) {
        viewModelScope.launch(Dispatchers.IO) {
            state.value = UiState.Loading()
            this@gatherRequest.collect {
                when (it) {
                    is Either.Left -> state.value = UiState.Error(it.value)
                    is Either.Right -> state.value = UiState.Success(mapData(it.value))
                }
            }

        }
    }


}
