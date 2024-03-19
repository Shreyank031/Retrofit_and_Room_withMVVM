package com.shrey.retrofitwithmvvm.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.shrey.retrofitwithmvvm.models.QuoteList
import com.shrey.retrofitwithmvvm.repository.QuoteRepository
import kotlinx.coroutines.launch

class MainViewModel(val repository: QuoteRepository) : ViewModel() {

    // Initialize the ViewModel
    init {
        // Call getQuotes() from the repository within a coroutine to fetch quotes asynchronously
        viewModelScope.launch {
            repository.getQuotes(1) // Fetch quotes for page 1
        }
    }

    // Expose quotes LiveData from the repository
    val quotes: LiveData<QuoteList>
        get() = repository.quotes // Get the LiveData from the repository
}
