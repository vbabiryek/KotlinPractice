package com.example.kotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val myWelcome = findViewById<TextView>(R.id.welcome);
        val myCounter = findViewById<TextView>(R.id.counterTv);
        val myFragBtn = findViewById<Button>(R.id.openFragBtn);

        //We need to grab our current count from our extras in the intent that got us here
        //We need to set up another onClick listener for a count up to 20
        //Then we need to create a fragment that makes a network call to some API to return a recyclerview of those items
        //Then upon pressing the button up to 20 count, it opens the fragment and we have out list to view
        //Then a button that takes us to a third activity that holds a viewpager created in mvvm architecture

    }
}