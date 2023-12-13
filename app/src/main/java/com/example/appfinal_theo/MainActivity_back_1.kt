package com.example.appfinal_theo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class MainActivity_back_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_front_1)

        supportActionBar?.hide()

        Handler(Looper.getMainLooper()).postDelayed({
            val startApp = Intent(this, MainActivity_back_2::class.java)
            startActivity(startApp)
        },7000)
    }
}
