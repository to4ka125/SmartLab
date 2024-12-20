package com.example.smartlab.classes

import com.example.smartlab.data.Action
import com.example.smartlab.data.News
import com.example.smartlab.data.Product
import com.example.smartlab.data.SearchResult
import retrofit2.http.GET
import retrofit2.http.Query

interface SupabaseApi {
    @GET("news")
    suspend fun getNews(): List<News>
    @GET("products")
    suspend fun getProducts(): List<Product>
    @GET("actions")
    suspend fun getActions(): List<Action>
    @GET("search")
    suspend fun search(@Query("query") query: String): List<SearchResult>
}