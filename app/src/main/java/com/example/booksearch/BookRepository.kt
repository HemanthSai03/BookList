package com.example.booksearch

import android.content.Context
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class BookRepository private constructor(context: Context) {

    private val apiService = RetrofitClient.instance

    fun searchBooks(query: String, callback: (List<Book>) -> Unit) {
        apiService.searchBooks(query).enqueue(object : Callback<BookResponse> {
            override fun onResponse(call: Call<BookResponse>, response: Response<BookResponse>) {
                response.body()?.books?.let { callback(it) }
            }

            override fun onFailure(call: Call<BookResponse>, t: Throwable) {
                // Handle failure
            }
        })
    }

    suspend fun getAllBooks(): List<Book> {
        return withContext(Dispatchers.IO) {
            // Assuming you have a local database or another way to fetch all books
            // For example, using Room database:
            // return@withContext bookDao.getAllBooks()

            // For demonstration purposes, let's return an empty list
            emptyList()
        }
    }

    companion object {
        @Volatile
        private var INSTANCE: BookRepository? = null

        fun getInstance(context: Context): BookRepository =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: BookRepository(context).also { INSTANCE = it }
            }
    }
}
