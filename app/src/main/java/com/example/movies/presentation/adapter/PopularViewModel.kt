package com.example.movies.presentation.adapter

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.movies.data.model.`object`.Movie250
import com.example.movies.data.repository.MovieRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class PopularViewModel(
    private val moviesRepository: MovieRepository
) : ViewModel() {

    private val _movies = MutableLiveData(emptyList<Movie250>())
    val movies: LiveData<List<Movie250>> = _movies

    private val _isLoading = MutableLiveData(true)
    val isLoading: LiveData<Boolean> = _isLoading

    init {
        viewModelScope.launch(Dispatchers.IO) {
            runCatching {
                moviesRepository.getMovie250List()
            }.onSuccess {
                withContext(Dispatchers.Main) {
                    _movies.value = it
                    _isLoading.value = false
                }
            }.onFailure {
                withContext(Dispatchers.Main) {
                    _isLoading.value = false
                }
                it.printStackTrace()
            }
        }

    }

}