package com.example.booksearch

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var bookAdapter: BookAdapter
    private lateinit var bookViewModel: BookViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        bookAdapter = BookAdapter(this, mutableListOf())
        recyclerView.adapter = bookAdapter

        val factory = BookViewModelFactory(application)
        bookViewModel = ViewModelProvider(this, factory).get(BookViewModel::class.java)
        bookViewModel.books.observe(this) { books ->
            bookAdapter.updateBooks(books)
        }

        fetchBooks("android") // Example query
    }

    private fun fetchBooks(query: String) {
        bookViewModel.searchBooks(query)
    }
}
