package com.example.moviesdevexpert.model

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface TheMovieDBService {

    @GET("movie/popular")
    fun listPopularMovies(@Query("api_key")apikey: String): Call<MovieDbResult> //@Query is the needed argument to pass into the URL
}