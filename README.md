# Books Search
## Table of contents
 
- [Introduction](#introduction)
- [Demo](#demo)
- [Run](#run)
- [Technology](#technology)
- [Features](#features)
- [Database Models](#database)
- [Color Palette](#colors)
- [License](#license)
 
## Introduction
 
Books App(Android Assessment) is an Android application that fetches a list of books from the Stephen King API and displays them using a RecyclerView. The app uses Room for local database storage and follows the MVVM architecture.
 
 
NOTE: Please read the RUN section before opening an issue.
 
## Demo

 ![Screenshot (53)](https://github.com/user-attachments/assets/9ce44ce6-b29b-4a01-8019-69a4b705aa84)

![Screenshot (51)](https://github.com/user-attachments/assets/7137f13f-c215-4a49-89d7-b5a020898de2)


 
 
The app displays a list of books with details such as title, publisher, ISBN, and year. You can view the list of books fetched from the API and stored locally in the database.
## Run
 
To run this application, you need to set up the necessary environment and dependencies. Follow these steps:
 
1. **Clone the repository**:
   ```bash
   git clone https:https://github.com/HemanthSai03/BookApp
 
2.Open the project in Android Studio.
 
3.Install dependencies: Open build.gradle files and ensure that all dependencies are included.
 
4:API Configuration:
 
Update the base URL in MainActivity.kt if needed:
 
Api:private val URL_BASE = "https://api.itbook.store/1.0/search/%7Bquery%7D"
 
 
## Technology
 
 
The application is built with:
 
-Kotlin
-Android SDK
-Room for local database
-Retrofit for network operations
-RecyclerView for displaying lists
-MVVM architecture
-ViewModel
-LiveData
-Coroutines
-Gson for JSON serialization
 
## Features
 
The application provides the following features:
 
-Fetches book data from the Stephen King API.
-Stores book data locally using Room Database.
-Displays a list of books with details including ID, title, publisher, ISBN, and year.
-Implements MVVM architecture for a clean and maintainable codebase.
 
 
## Database
 
Database Models
Book Entity
The Book entity represents a book in the Room database.
 
-id (Int) - Book ID from the API
-title (String) - Title of the book
-subtitle (String) - Subtitle of the Book
-isbn (String) - ISBN of the book
-price (Int) - Price of book
-image(String) - Url for the image 
- Url (String) - Url for the Book Store
 
 
## Colors
 
Below is the color palette used in this application:
 
- ![#478ba2](https://via.placeholder.com/15/478ba2/000000?text=+) `#478ba2`
 
