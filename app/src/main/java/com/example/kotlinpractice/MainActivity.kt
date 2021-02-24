package com.example.kotlinpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myBtn = findViewById<Button>(R.id.mybutton)
        val myTxtView = findViewById<TextView>(R.id.textView)

        var timesClicked = 0

        myBtn.setOnClickListener {
            Toast.makeText(this, "Click me 10 times!", Toast.LENGTH_SHORT).show()
            timesClicked += 1
            myTxtView.text = timesClicked.toString()
            if (timesClicked == 10) {
                val myIntent = Intent(this,SecondActivity::class.java)
                myIntent.putExtra("timesClicked", timesClicked.toString())
                println("intent extra passed on here is: " + myIntent.getStringExtra("timesClicked"))
                startActivity(myIntent)
            }
        }
    }
}