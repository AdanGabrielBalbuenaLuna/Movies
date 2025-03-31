package com.example.moviesdevexpert

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.lifecycleScope
import com.example.moviesdevexpert.databinding.ActivityMainBinding
import com.example.moviesdevexpert.model.MovieDbClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val moviesAdapter = MoviesAdapter(
            emptyList()
        ) { movie ->
            Toast.makeText(this@MainActivity, movie.title, Toast.LENGTH_SHORT).show()
        }

        binding.recycler.adapter = moviesAdapter

        lifecycleScope.launch {
            val apiKey = getString(R.string.api_key)
            val listPopularMovies = MovieDbClient.service.listPopularMovies(apiKey)
            moviesAdapter.movieList = listPopularMovies.results
            moviesAdapter.notifyDataSetChanged()
        }
    }
}