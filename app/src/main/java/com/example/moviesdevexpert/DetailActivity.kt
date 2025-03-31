package com.example.moviesdevexpert

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.moviesdevexpert.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    companion object {
        val EXTRA_TITLE = "DetailActivity:title"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val stringExtra = intent.getStringExtra(EXTRA_TITLE)

        binding.textView.text = stringExtra

    }
}