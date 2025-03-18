package com.example.lab_exam2

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val homeIcon :ImageView = findViewById(R.id.homeIcon)
        val trainingsIcon :ImageView = findViewById(R.id.trainingsIcon)
        val activityIcon :ImageView = findViewById(R.id.activityIcon)
        val profileIcon :ImageView = findViewById(R.id.profileIcon)
        val btn :Button = findViewById(R.id.button2)

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

        btn.setOnClickListener {
            val intent = Intent(this, Trainings::class.java)
            startActivity(intent)
        }


        val view: TextView = findViewById(R.id.viewAll)

        view.setOnClickListener {
            val intent = Intent(this, category::class.java)
            startActivity(intent)
            finish()
        }



    }
}
