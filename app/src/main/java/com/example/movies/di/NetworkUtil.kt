package com.example.movies.di

import com.example.movies.Const
import com.example.movies.data.repository.network.MovieApi
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkUtil {

    fun getMovieApi(): MovieApi {
        return getRetrofit()
            .build()
            .create(MovieApi::class.java)
    }

    private fun getRetrofit(): Retrofit.Builder {
        return Retrofit.Builder()
            .baseUrl(Const.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(getGson()))
            .client(getOkhttpClient())
    }

    private fun getOkhttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .build()
    }

    private fun getGson(): Gson {
        return GsonBuilder()
            .serializeNulls()
            .setLenient()
            .enableComplexMapKeySerialization()
            .create()
    }
}