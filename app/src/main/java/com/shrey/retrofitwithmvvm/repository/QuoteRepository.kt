package com.shrey.retrofitwithmvvm.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.shrey.retrofitwithmvvm.api.QuoteService
import com.shrey.retrofitwithmvvm.models.QuoteList

class QuoteRepository(val quoteService: QuoteService) {

    // LiveData to hold the list of quotes
    private val quotesLiveData = MutableLiveData<QuoteList>()

    // Expose the quotesLiveData as LiveData to prevent external modifications
    val quotes: LiveData<QuoteList>
        get() = quotesLiveData

    // Function to fetch quotes from the API
    suspend fun getQuotes(page: Int) {
        // Make a network call to fetch quotes
        val result = quoteService.getQuotes(page)

        // Check if the result is not null and has a body
        if (result?.body() != null) {
            // Post the result to the quotesLiveData
            quotesLiveData.postValue(result.body())
        }
    }
}
