package com.example.kotlinpractice.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinpractice.R
import com.example.kotlinpractice.adapters.ArticleAdapter
import com.example.kotlinpractice.models.ArticleResponse
import com.example.kotlinpractice.services.APIRequest
import kotlinx.android.synthetic.main.fragment_second_act.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class SecondActFrag : Fragment() {

    private var myLayoutManager: RecyclerView.LayoutManager? = null
    private var myAdapter: RecyclerView.Adapter<ArticleAdapter.ArticleViewHolder>? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_second_act, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val data = MutableLiveData<ArticleResponse>()

        myRecyclerView.apply {
            myLayoutManager = LinearLayoutManager(activity)
            myAdapter = ArticleAdapter(context)
        }

        val apiRequest = APIRequest.create().getArticles("d775b57a33d1471b8d31893ecf1d3079")
        apiRequest.enqueue(object : Callback<ArticleResponse> {
            override fun onResponse(
                call: Call<ArticleResponse>,
                response: Response<ArticleResponse>
            ) {
                if (response.body() != null) {
                    data.value = response.body()
                }
            }

            override fun onFailure(call: Call<ArticleResponse>, t: Throwable) {
                println(t.stackTrace)
            }
        })
    }

}