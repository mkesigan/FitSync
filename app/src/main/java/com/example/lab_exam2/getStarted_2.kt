package com.example.lab_exam2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class getStarted_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_started2)


        val nextButton: Button = findViewById(R.id.button)


        nextButton.setOnClickListener {
            val intent = Intent(this, getStarted_3::class.java)
            startActivity(intent)
            finish()
        }
    }
}
