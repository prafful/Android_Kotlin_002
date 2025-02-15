package com.example.a002activitylogic

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Get a reference/handle/pointer to the button
        val tapMeButton = findViewById<Button>(R.id.buttontap)
        //capture the click event for the button -> write a event handler
        //in this case, event handler is -> click event handler

        //the click event handler will execute the function, the moment
        //button is clicked/tapped
        tapMeButton.setOnClickListener{
            //inside click event handler, we implement the code
            //to navigate to second activity

            //intention is to navigate to secondactivity
            val intent = Intent(this, SecondActivity::class.java)
            //start the new activity
            startActivity(intent)
        }

        //create button in second activity
        //give it the constraint and label -> Home
        //tapping home button must navigate user to Main activity





    }
}