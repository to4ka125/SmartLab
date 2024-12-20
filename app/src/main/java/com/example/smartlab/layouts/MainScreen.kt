package com.example.smartlab.layouts

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.smartlab.classes.MainViewModel
import com.example.smartlab.data.Action
import com.example.smartlab.data.News
import com.example.smartlab.data.Product

@Composable
fun MainScreen(viewModel: MainViewModel) {
    val news by viewModel.news.collectAsState()
    val products by viewModel.products.collectAsState()
    val actions by viewModel.actions.collectAsState()
    Column {
        SearchBar(onSearch = { viewModel.search(it) })
        if (news.isNotEmpty()) {
            NewsSection(news)
        }
        if (actions.isNotEmpty()) {
            ActionsSection(actions)
        }
        if (products.isNotEmpty()) {
            ProductsSection(products)
        }
    }
}

@Composable
fun SearchBar(onSearch: (String) -> Unit) {
    var query by remember { mutableStateOf("") }
    TextField(
        value = query,
        onValueChange = {
            query = it
            if (query.length >= 3) {
                onSearch(query)
            }
        },
        label = { Text("Search") }
    )
}
@Composable
fun NewsSection(news: List<News>) {
    LazyRow {
        items(news) { item ->
            Text(item.name)
        }
    }
}
@Composable
fun ActionsSection(actions: List<Action>) {
    LazyRow {
        items(actions) { item ->
            Text(item.title)
        }
    }
}
@Composable
fun ProductsSection(products: List<Product>) {
    LazyColumn {
        items(products) { item ->
            Text(item.name)
        }
    }
}
