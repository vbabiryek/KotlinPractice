package com.example.kotlinpractice.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.kotlinpractice.R
import com.example.kotlinpractice.models.Article


class ArticleAdapter(val context: Context) : RecyclerView.Adapter<ArticleAdapter.ArticleViewHolder>(){

    var articleList : List<Article> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_item, parent, false)
        return ArticleViewHolder(view)
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        holder.title.text = articleList[position].title
        holder.publishedAt.text = articleList[position].publishedAt
        holder.articleDesc.text = articleList[position].description
        holder.articleContentView.text = articleList[position].content
        Glide.with(context)
                .load(articleList[position].urlToImage)
                .into(holder.imgViewCover)
    }

    override fun getItemCount(): Int {
        return articleList.size
    }

    class ArticleViewHolder(private val containerView: View) : RecyclerView.ViewHolder(containerView) {

        val imgViewCover: ImageView = containerView.findViewById(R.id.imgViewCover)
        val title: TextView = containerView.findViewById(R.id.articleTitle)
        val publishedAt : TextView = containerView.findViewById(R.id.articleAuthorAndPublishedAt)
        val articleDesc: TextView = containerView.findViewById(R.id.articleDescription)
        val articleContentView : TextView = containerView.findViewById(R.id.articleContentView)

    }
}