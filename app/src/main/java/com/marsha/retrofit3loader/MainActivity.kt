package com.marsha.retrofit3loader

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.marsha.retrofit3loader.viewModel.PostViewModel

class MainActivity : AppCompatActivity() {
    private val viewModel = PostViewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.fetchPosts()

    }
}