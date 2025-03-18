package com.example.lab_exam2

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_profile)


        val layout1: View = findViewById(R.id.layout1)

        layout1.setOnClickListener {
            val intent = Intent(this, account::class.java)
            startActivity(intent)
        }

        val layout2: View = findViewById(R.id.layout2)

        layout2.setOnClickListener {
            val intent = Intent(this, workouts::class.java)
            startActivity(intent)
        }

        val layout3: View = findViewById(R.id.layout3)

        layout3.setOnClickListener {
            val intent = Intent(this, reminder::class.java)
            startActivity(intent)
        }

        val layout4: View = findViewById(R.id.layout4)

        layout4.setOnClickListener {
            val intent = Intent(this, progress::class.java)
            startActivity(intent)
        }

        val logout: View = findViewById(R.id.logout)

        logout.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }


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