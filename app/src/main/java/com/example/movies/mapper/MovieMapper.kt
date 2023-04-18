package com.example.movies.mapper


import com.example.movies.model.Movie250
import com.example.movies.network.model.Top250DataDetail

fun Top250DataDetail.bodyToModel(): Movie250 {
    return Movie250(
        id = this.id ?: "",
        rank = this.rank ?: "",
        title = this.title ?: "",
        fullTitle = this.fullTitle ?: "",
        year = this.year ?: "",
        image = this.image ?: "",
        crew = this.crew ?: "",
        imDbRating = this.imDbRating ?: "",
        imDbRatingCount = this.imDbRatingCount ?: ""
    )
}
