package com.shrey.retrofitwithmvvm.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    // Base URL for the API
    private const val BASE_URL = "https://quotable.io"

    // Function to create a Retrofit instance
    fun getInstance(): Retrofit {
        // Create and configure a Retrofit instance
        return Retrofit.Builder()
            // Set the base URL
            .baseUrl(BASE_URL)
            // Add GsonConverterFactory to convert JSON response to objects
            .addConverterFactory(GsonConverterFactory.create())
            // Build and return the Retrofit instance
            .build()
    }
}
