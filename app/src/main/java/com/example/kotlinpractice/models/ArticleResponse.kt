package com.example.kotlinpractice.models

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName




class ArticleResponse {
    @SerializedName("status")
    @Expose
    private var status: String? = null

    @SerializedName("totalResults")
    @Expose
    private var totalResults: Int? = null

    @SerializedName("articles")
    @Expose
    private var articles: List<Article?>? = null

    fun getStatus(): String? {
        return status
    }

    fun setStatus(status: String?) {
        this.status = status
    }

    fun getTotalResults(): Int? {
        return totalResults
    }

    fun setTotalResults(totalResults: Int?) {
        this.totalResults = totalResults
    }

    fun getArticles(): List<Article?>? {
        return articles
    }

    fun setArticles(articles: List<Article?>?) {
        this.articles = articles
    }
}