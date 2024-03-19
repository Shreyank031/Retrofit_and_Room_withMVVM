package com.shrey.retrofitwithmvvm.api

import com.shrey.retrofitwithmvvm.models.QuoteList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface QuoteService {

    // https://quotable.io/quotes?page=1
    //API endpoint
    @GET("/quotes") //It's a GET request
    suspend fun getQuotes(@Query("page") page: Int): Response<QuoteList>
}