package com.example.kotlinpractice.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinpractice.R
import com.example.kotlinpractice.adapters.ArticleAdapter
import com.example.kotlinpractice.databinding.FragmentSecondActBinding
import com.example.kotlinpractice.models.ArticleResponse
import com.example.kotlinpractice.services.APIRequest
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SecondActFrag : Fragment() {

    lateinit var recyclerView: RecyclerView
    lateinit var articleAdapter: ArticleAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {

        recyclerView = view?.findViewById(R.id.myRecyclerView)!!
        articleAdapter = ArticleAdapter(requireContext())
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = articleAdapter

        val apiRequest = APIRequest.create().getArticles("d775b57a33d1471b8d31893ecf1d3079")
        apiRequest.enqueue(object : Callback<ArticleResponse> {
            override fun onResponse(
                call: Call<ArticleResponse>,
                response: Response<ArticleResponse>
            ) {

            }

            override fun onFailure(call: Call<ArticleResponse>, t: Throwable) {
                println(t.stackTrace)
            }
        })
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentSecondActBinding>(inflater, R.layout.fragment_second_act, container, false)
        return binding.root
    }

}