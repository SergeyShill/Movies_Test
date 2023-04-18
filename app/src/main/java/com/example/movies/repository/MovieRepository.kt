package com.example.movies.repository

import com.example.movies.mapper.bodyToModel
import com.example.movies.model.Movie250
import com.example.movies.network.NetworkUtil

class MovieRepository {

    fun getMovie250List(): List<Movie250> {
        val response = NetworkUtil.getMovieApi().getTop250Movies()
        return if (response.isSuccessful && response.body() != null)
            response.body()?.items?.map { it.bodyToModel() } ?: listOf()
        else listOf()
    }
}