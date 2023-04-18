package com.example.movies.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Movie250Body {

    @Expose
    @SerializedName("items")
    val items: List<Top250DataDetail>? = null

    @Expose
    @SerializedName("items")
    val errorMessage: String? = null
}