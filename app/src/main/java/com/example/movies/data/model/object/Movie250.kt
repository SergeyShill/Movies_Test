package com.example.movies.data.model.`object`

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Movie250(
    val id: String,
    val rank: String,
    val title: String,
    val fullTitle: String,
    val year: String,
    val image: String,
    val crew: String,
    val imDbRating: String,
    val imDbRatingCount: String
) : Parcelable