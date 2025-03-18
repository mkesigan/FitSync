package com.example.lab_exam2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Trainings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trainings)

        val homeIcon : ImageView = findViewById(R.id.homeIcon)
        val trainingsIcon : ImageView = findViewById(R.id.trainingsIcon)
        val activityIcon : ImageView = findViewById(R.id.activityIcon)
        val profileIcon : ImageView = findViewById(R.id.profileIcon)


        homeIcon.setOnClickListener {
            val intent = Intent(this,Home::class.java)
            startActivity(intent)
        }

        trainingsIcon.setOnClickListener {
            val intent = Intent(this, Trainings::class.java)
            startActivity(intent)
        }

        activityIcon.setOnClickListener {
            val intent = Intent(this,fitnessActivity::class.java)
            startActivity(intent)
        }

        profileIcon.setOnClickListener {
            val intent = Intent(this, profile::class.java)
            startActivity(intent)
        }


    }
}