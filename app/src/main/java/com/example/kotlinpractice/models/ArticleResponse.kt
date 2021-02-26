package com.example.kotlinpractice.models

data class ArticleResponse(var status: String, var totalResults: Int, var articles: List<Article>)