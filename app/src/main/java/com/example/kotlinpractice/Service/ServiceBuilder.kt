package com.example.kotlinpractice.Service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ServiceBuilder {
    object RestClient {

        private val BASE_URL = "https://newsapi.org/"
        private var mRetrofit: Retrofit? = null


        val client: Retrofit
            get() {
                if (mRetrofit == null) {
                    mRetrofit = Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()
                }
                return this.mRetrofit!!
            }
    }

}