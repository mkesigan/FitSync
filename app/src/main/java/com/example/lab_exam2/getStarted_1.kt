package com.example.lab_exam2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class getStarted_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_started1)


        val getStartedButton: Button = findViewById(R.id.button)


        getStartedButton.setOnClickListener {
            val intent = Intent(this, getStarted_2::class.java)
            startActivity(intent)
            finish()
        }


        val signInText: TextView = findViewById(R.id.textView77)

        signInText.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
