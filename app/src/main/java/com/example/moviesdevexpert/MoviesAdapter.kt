package com.example.moviesdevexpert

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moviesdevexpert.databinding.ViewMovieListItemBinding

class MoviesAdapter: RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        val binding = ViewMovieListItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return MoviesViewHolder(binding)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    class MoviesViewHolder(binding: ViewMovieListItemBinding): RecyclerView.ViewHolder(binding.root)
}