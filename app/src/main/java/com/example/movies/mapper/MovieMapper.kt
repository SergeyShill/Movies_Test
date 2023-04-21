package com.example.movies.mapper


import com.example.movies.data.model.`object`.Movie250
import com.example.movies.data.model.body.Top250DataDetail

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
