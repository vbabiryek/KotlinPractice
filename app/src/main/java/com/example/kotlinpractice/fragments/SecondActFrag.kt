package com.example.kotlinpractice.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.kotlinpractice.R
import com.example.kotlinpractice.databinding.FragmentSecondActBinding

class SecondActFrag : Fragment() {

    //build retrofit service for API call to return list items

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentSecondActBinding>(inflater, R.layout.fragment_second_act, container, false)
        return binding.root
    }
}