package com.example.movies.presentation.adapterRV

import androidx.recyclerview.widget.DiffUtil
import com.example.movies.data.model.`object`.Movie250

class MoviesDiffUtil : DiffUtil.ItemCallback<Movie250>() {

    override fun areItemsTheSame(oldItem: Movie250, newItem: Movie250): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Movie250, newItem: Movie250): Boolean {
        return oldItem == newItem
    }


}