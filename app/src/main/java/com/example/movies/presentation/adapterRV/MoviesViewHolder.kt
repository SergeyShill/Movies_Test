package com.example.movies.presentation.adapterRV

import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.movies.data.model.`object`.Movie250
import com.example.movies.databinding.ItemMovieBinding

class MoviesViewHolder(private val binding: ItemMovieBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(movies250: Movie250) {
        binding.imageMovie.load(movies250.image)
        binding.header.text = movies250.title

    }

}