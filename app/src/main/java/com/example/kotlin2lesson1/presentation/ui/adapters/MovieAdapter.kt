package com.example.kotlin2lesson1.presentation.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin2lesson1.base.BaseDiffUtil
import com.example.kotlin2lesson1.databinding.ItemMovieBinding
import com.example.kotlin2lesson1.presentation.models.FilmUI

class MovieAdapter :
    ListAdapter<FilmUI, MovieAdapter.MovieViewHolder>(BaseDiffUtil()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        return MovieViewHolder(
            ItemMovieBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }


    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        getItem(position)?.let { holder.onBind(it) }
    }

    inner class MovieViewHolder(private val binding: ItemMovieBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(data: FilmUI) {
            binding.apply {
                tvTitle.text = data.title
            }


        }
    }
}