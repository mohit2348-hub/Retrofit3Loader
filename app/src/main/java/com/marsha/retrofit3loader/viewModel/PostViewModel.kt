package com.marsha.retrofit3loader.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import android.util.Log
import com.marsha.retrofit3loader.apiService.RetrofitClient
import kotlinx.coroutines.launch

class PostViewModel : ViewModel() {
    fun fetchPosts() {
        viewModelScope.launch {
            try {
                val posts = RetrofitClient.api.getPosts()
                posts.forEach {
                    Log.d("POST", "Title: ${it.title}")
                }

            } catch (e: Exception) {
                Log.e("ERROR", "Error: ${e.message}")
            }
        }
    }
}