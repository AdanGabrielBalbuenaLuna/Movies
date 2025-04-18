package com.example.moviesdevexpert

import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi // Call requires API level 33
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.moviesdevexpert.databinding.ActivityDetailBinding
import com.example.moviesdevexpert.model.Movie

class DetailActivity : AppCompatActivity() {

    companion object {
        val EXTRA_MOVIE = "DetailActivity:title"
    }
    @RequiresApi(Build.VERSION_CODES.TIRAMISU) // Call requires API level 33 (current min is 24): android. content. Intent#getParcelableExtra Toggle info (Ctrl+F1)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val movie = intent.getParcelableExtra(EXTRA_MOVIE, Movie::class.java) // Call requires API level 33 (current min is 24)

        if (movie != null) {
            binding.textView.text = movie.title
            Glide
                .with(this)
                .load("https://image.tmdb.org/t/p/w185${movie.backdrop_path}")
                .into(binding.backdrop)
        }
    }
}