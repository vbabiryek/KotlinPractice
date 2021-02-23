package com.example.kotlinpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

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

        //Create a fragment that makes a network call to some API to return a recyclerview of those items
        //Upon pressing the button up to 20 count, it opens the fragment and we have out list to view
        //Create a button that takes us to a third activity that holds a viewpager - MVVM arch

    }
}