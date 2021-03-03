package com.example.kotlinpractice
//TO-DO: Upon pressing the button up to 20 count, it opens the fragment and we have list items held in recyclerview
//Using explicit intent and getActivity() create a button in that takes us to a third
//activity that holds a viewpager of more general list items - MVVM arch

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.kotlinpractice.fragments.SecondActFrag

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val myCounter = findViewById<TextView>(R.id.counterTv)
        val myFragBtn = findViewById<Button>(R.id.openFragBtn)
        val fragmentLayout = findViewById<FrameLayout>(R.id.secondActFragFrameLayout)

        val intentStr: Intent = intent
        var counterString = intentStr.getStringExtra("timesClicked")
        println("intent extra is: " + intentStr.getStringExtra("timesClicked"))
        var timesClicked = Integer.valueOf(counterString.toString())
        myCounter.text = counterString

        Toast.makeText(this, "Hit the button 10 more times", Toast.LENGTH_LONG).show()

        myFragBtn.setOnClickListener {
            myCounter.text = timesClicked.toString()
            timesClicked += 1
            if(timesClicked == 20){
                Toast.makeText(this, "You've hit 20!", Toast.LENGTH_SHORT).show()
                val fragmentManager: FragmentManager = supportFragmentManager
                val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
                val secondActFrag = SecondActFrag()
                fragmentTransaction.replace(R.id.content, secondActFrag)

                println("fragmentTransaction" + fragmentTransaction.isEmpty)
                fragmentTransaction.commit()
            }
        }
    }
}