package com.shrey.retrofitwithmvvm

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.shrey.retrofitwithmvvm.api.QuoteService
import com.shrey.retrofitwithmvvm.api.RetrofitHelper
import com.shrey.retrofitwithmvvm.repository.QuoteRepository
import com.shrey.retrofitwithmvvm.viewmodels.MainViewModel
import com.shrey.retrofitwithmvvm.viewmodels.MainViewModelFactory

class MainActivity : AppCompatActivity() {
    lateinit var mainVewModel: MainViewModel // Declare a lateinit variable for the MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Create an instance of the QuoteService interface from RetrofitHelper
        val service = RetrofitHelper.getInstance().create(QuoteService::class.java)

        // Create a repository instance with the QuoteService
        val repository = QuoteRepository(service)

        // Initialize the MainViewModel with the repository using ViewModelProvider
        mainVewModel =
            ViewModelProvider(this, MainViewModelFactory(repository)).get(MainViewModel::class.java)

        // Observe the quotes LiveData in the MainViewModel
        mainVewModel.quotes.observe(this, Observer {
            // Log the results of the quotes LiveData when it changes
            Log.d("Blinder", it.results.toString())
        })

    }
}
