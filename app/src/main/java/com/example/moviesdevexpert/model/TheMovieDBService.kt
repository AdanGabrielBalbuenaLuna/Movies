package com.example.moviesdevexpert.model

import retrofit2.http.GET
import retrofit2.http.Query

interface TheMovieDBService {

    @GET("movie/popular")
    suspend fun listPopularMovies(
        @Query("api_key") apikey: String,
        @Query("region") region: String,
    ): MovieDbResult
}