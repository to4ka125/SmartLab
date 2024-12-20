package com.example.smartlab.classes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.smartlab.data.Action
import com.example.smartlab.data.News
import com.example.smartlab.data.Product
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    private val _news = MutableStateFlow<List<News>>(emptyList())
    val news: StateFlow<List<News>> = _news
    private val _products = MutableStateFlow<List<Product>>(emptyList())
    val products: StateFlow<List<Product>> = _products
    private val _actions = MutableStateFlow<List<Action>>(emptyList())
    val actions: StateFlow<List<Action>> = _actions

    init {
        fetchNews()
        fetchProducts()
        fetchActions()
    }

    private fun fetchNews() {
        viewModelScope.launch {
            _news.value = Retrofit.api.getNews()
        }
    }

    private fun fetchProducts() {
        viewModelScope.launch {
            _products.value = Retrofit.api.getProducts()
        }
    }

    private fun fetchActions() {
        viewModelScope.launch {
            _actions.value = Retrofit.api.getActions()
        }
    }

    fun search(query: String) {
        viewModelScope.launch {
        }
    }
}