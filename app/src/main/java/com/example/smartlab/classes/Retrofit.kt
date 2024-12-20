package com.example.smartlab.classes
import com.example.smartlab.network.SupabaseClient
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.converter.gson.GsonConverterFactory
import  retrofit2.Retrofit

object Retrofit {
    private val login = HttpLoggingInterceptor().apply {
        setLevel(HttpLoggingInterceptor.Level.BODY)
    }
    private val client = OkHttpClient.Builder()
        .addInterceptor(login)
        .build()
    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("https://your-supabase-url.supabase.co/rest/v1/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()
    }
val  api: SupabaseApi by lazy {
    retrofit.create(SupabaseApi::class.java)
}

}