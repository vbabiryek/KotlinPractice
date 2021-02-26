package com.example.kotlinpractice.services

import com.example.kotlinpractice.models.ArticleResponse
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

import retrofit2.http.GET
import retrofit2.http.Query


interface APIRequest {

    @GET("/v2/top-headlines?sources=bbc-news&apiKey=d775b57a33d1471b8d31893ecf1d3079")
    fun getArticles(
        @Query("apikey") apiKey: String?
    ): Call<ArticleResponse>

    companion object RestClient {

        private const val BASE_URL = "https://newsapi.org/"

        fun create(): APIRequest {
            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return retrofit.create(APIRequest::class.java)
        }
    }
}