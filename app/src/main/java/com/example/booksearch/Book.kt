package com.example.booksearch

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "books")
data class Book(
    @PrimaryKey val isbn13: String,
    val title: String,
    val subtitle: String,
    val price: String,
    val image: String,
    val url: String
)
