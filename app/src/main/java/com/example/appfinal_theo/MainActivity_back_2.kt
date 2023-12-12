package com.example.appfinal_theo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button

class MainActivity_back_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_front_2)

        val buttonPlay = findViewById<Button>(R.id.buttonPlay)
        val buttonRules = findViewById<Button>(R.id.buttonRules)

        buttonPlay.setOnClickListener {
            irParaTerceiraTela()
        }
        buttonRules.setOnClickListener {
            irParaRegras()
        }
    }
    private fun irParaTerceiraTela() {
        val irTerceiraTela = Intent(this, MainActivity_back_3::class.java)
        startActivity(irTerceiraTela)
    }
    private fun irParaRegras() {
        val irRegras = Intent(this, MainActivity_back_rules::class.java)
        startActivity(irRegras)
    }
}