package com.example.movies.network

import com.example.movies.network.model.Movie250Body
import retrofit2.Response
import retrofit2.http.GET

interface MovieApi {

    @GET("en/API/Top250Movies/k_z5wssqlz")
    fun getTop250Movies(): Response<Movie250Body>


}