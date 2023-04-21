package com.example.movies.data.repository.network

import com.example.movies.data.model.body.Movie250Body
import retrofit2.Response
import retrofit2.http.GET

interface MovieApi {

    @GET("en/API/Top250Movies/k_z5wssqlz")
    fun getTop250Movies(): Response<Movie250Body>


}