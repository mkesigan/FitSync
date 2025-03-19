package com.example.lab_exam2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class summary : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_summary)



        val back: ImageView = findViewById(R.id.leftArrow)

        back.setOnClickListener {
            val intent = Intent(this, exercise1::class.java)
            startActivity(intent)
            finish()
        }

        val save: Button = findViewById(R.id.save)

        save.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
            finish()
        }

    }
}