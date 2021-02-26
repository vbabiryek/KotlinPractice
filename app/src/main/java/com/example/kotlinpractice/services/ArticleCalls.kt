package com.example.kotlinpractice.services

import com.example.kotlinpractice.models.Article
import com.example.kotlinpractice.models.ArticleResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class ArticleCalls{

    val apiRequest = APIRequest.create().getArticles("d775b57a33d1471b8d31893ecf1d3079")

}