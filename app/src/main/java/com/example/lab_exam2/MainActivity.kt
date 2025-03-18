package com.example.lab_exam2  // Use your actual package name

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Delay for splash screen before navigating to GetStarted activity
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, getStarted_1::class.java)  // Navigate to the first Get Started screen
            startActivity(intent)
            finish() // Close splash screen
        }, 3000) // 3 seconds delay
    }
}
