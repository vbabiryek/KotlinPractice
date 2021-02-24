package com.example.kotlinpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val myCounter = findViewById<TextView>(R.id.counterTv)
        val myFragBtn = findViewById<Button>(R.id.openFragBtn)

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
            }
        }

        //Upon pressing the button up to 20 count, it opens the fragment and we have list items held in recyclerview
        //Using explicit intent and getActivity() create a button in that takes us to a third
        //activity that holds a viewpager of more general list items - MVVM arch

    }
}