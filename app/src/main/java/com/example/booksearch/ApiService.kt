package com.example.booksearch

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("1.0/search/{query}")
    fun searchBooks(@Path("query") query: String): Call<BookResponse>
}
