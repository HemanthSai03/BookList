package com.example.booksearch

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class BookViewModel(application: Application?) : ViewModel() {

    private val bookRepository = BookRepository.getInstance(requireNotNull(application).applicationContext)
    private val _books = MutableLiveData<List<Book>>()
    val books: LiveData<List<Book>> get() = _books

    init {
        loadBooksFromDatabase()
    }

    private fun loadBooksFromDatabase() {
        viewModelScope.launch {
            val books = bookRepository.getAllBooks()
            _books.postValue(books)
        }
    }

    fun searchBooks(query: String) {
        bookRepository.searchBooks(query) { books ->
            _books.postValue(books)
        }
    }
}
