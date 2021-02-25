package com.example.kotlinpractice.models

class Article {
    private var title: String? = null
    private var author: String? = null
    private var urlToImage: String? = null
    private var publishedAt: String? = null
    private var description: String? = null
    private var content: String? = null

    fun getContent(): String? {
        return content
    }

    fun setContent(content: String?) {
        this.content = content
    }

    fun getTitle(): String? {
        return title
    }

    fun setTitle(title: String?) {
        this.title = title
    }

    fun getAuthor(): String? {
        return author
    }

    fun setAuthor(author: String?) {
        this.author = author
    }

    fun getUrlToImage(): String? {
        return urlToImage
    }

    fun setUrlToImage(urlToImage: String?) {
        this.urlToImage = urlToImage
    }

    fun getPublishedAt(): String? {
        return publishedAt
    }

    fun setPublishedAt(publishedAt: String?) {
        this.publishedAt = publishedAt
    }

    fun getDescription(): String? {
        return description
    }

    fun setDescription(description: String?) {
        this.description = description
    }
}