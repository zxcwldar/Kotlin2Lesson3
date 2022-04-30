package com.example.kotlin2lesson1.presentation.ui.fragments

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kotlin2lesson1.R
import com.example.kotlin2lesson1.presentation.ui.adapters.MovieAdapter
import com.example.kotlin2lesson1.base.BaseFragment
import com.example.kotlin2lesson1.databinding.FragmentMovieBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MovieFragment : BaseFragment<FragmentMovieBinding, MovieViewModel>(R.layout.fragment_movie) {
    override val binding by viewBinding(FragmentMovieBinding::bind)
    override val viewModel: MovieViewModel by viewModels()
    private val movieAdapter = MovieAdapter()


    override fun assembleViews() {
        setupAdapter()
    }

    private fun setupAdapter() {
        binding.recyclerview.apply {
            adapter = movieAdapter
        }

    }

    override fun launchObservers() {
        viewModel.movieState.spectateUiState(error = { print(" ты меня не достойна , fuck you") },
            success = {
                movieAdapter.submitList(it)
            })
    }

}

