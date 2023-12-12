package com.example.appfinal_theo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity_back_4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_front_4)

        val button4 = findViewById<Button>(R.id.button4)

        button4.setOnClickListener {
            irParaQuintaTela()
        }
    }
    private fun irParaQuintaTela() {
        val irQuintaTela = Intent(this, MainActivity_back_5::class.java)
        startActivity(irQuintaTela)
    }
}