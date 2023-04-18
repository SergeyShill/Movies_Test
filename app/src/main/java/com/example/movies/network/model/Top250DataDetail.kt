package com.example.movies.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Top250DataDetail {
    @Expose
    @SerializedName("id")
    val id: String? = null

    @Expose
    @SerializedName("rank")
    val rank: String? = null

    @Expose
    @SerializedName("title")
    val title: String? = null

    @Expose
    @SerializedName("fullTitle")
    val fullTitle: String? = null

    @Expose
    @SerializedName("year")
    val year: String? = null

    @Expose
    @SerializedName("image")
    val image: String? = null

    @Expose
    @SerializedName("crew")
    val crew: String? = null

    @Expose
    @SerializedName("imDbRating")
    val imDbRating: String? = null

    @Expose
    @SerializedName("imDbRatingCount")
    val imDbRatingCount: String? = null

}