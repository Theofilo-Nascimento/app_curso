package com.example.appfinal_theo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity_back_rules : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_front_rules)

        val buttonBack = findViewById<Button>(R.id.buttonBack)

        buttonBack.setOnClickListener {
            irParaSegundaTela()
        }
    }
    private fun irParaSegundaTela() {
        val irSegundaTela = Intent(this, MainActivity_back_2::class.java)
        startActivity(irSegundaTela)
    }
}