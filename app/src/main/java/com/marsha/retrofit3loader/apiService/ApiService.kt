package com.marsha.retrofit3loader.apiService

import com.marsha.retrofit3loader.model.Post
import retrofit2.http.GET

interface ApiService {
    @GET("posts")
    suspend fun getPosts(): List<Post>
}