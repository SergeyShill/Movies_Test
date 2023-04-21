package com.example.movies.presentation.adapterRV

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.movies.data.model.`object`.Movie250
import com.example.movies.databinding.ItemMovieBinding

class MoviesAdapter() : ListAdapter<Movie250, MoviesViewHolder>(MoviesDiffUtil()){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        val binding = ItemMovieBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return MoviesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

}