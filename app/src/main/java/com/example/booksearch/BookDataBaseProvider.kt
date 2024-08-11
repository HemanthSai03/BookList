
package com.example.booksearch

import android.content.Context
import androidx.room.Room

object BookDatabaseProvider {
    @Volatile
    private var INSTANCE: BookDatabase? = null

    fun getDatabase(context: Context): BookDatabase {
        return INSTANCE ?: synchronized(this) {
            val instance = Room.databaseBuilder(
                context.applicationContext,
                BookDatabase::class.java,
                "book_database"
            ).build()
            INSTANCE = instance
            instance
        }
    }
}
