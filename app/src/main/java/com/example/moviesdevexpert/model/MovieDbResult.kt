package com.example.moviesdevexpert.model

import com.google.gson.annotations.SerializedName

data class MovieDbResult(
    val page: Int,
    val results: List<Movie>,
    val total_pages: Int,
    @SerializedName("total_result")
    val total_results: Int
)