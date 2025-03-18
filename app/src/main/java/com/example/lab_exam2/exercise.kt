package com.example.lab_exam2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class exercise : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise)


        val back: ImageView = findViewById(R.id.leftArrow)

        back.setOnClickListener {
            val intent = Intent(this, category::class.java)
            startActivity(intent)
            finish()
        }


        val btn : Button = findViewById(R.id.button6)

        btn.setOnClickListener {
            val intent = Intent(this,exercise1::class.java)
            startActivity(intent)
        }

    }
}