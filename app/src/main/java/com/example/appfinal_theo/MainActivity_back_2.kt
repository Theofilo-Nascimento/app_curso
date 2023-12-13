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
            irParaQuartaTela()
        }
        buttonRules.setOnClickListener {
            irParaRegras()
        }
    }
    private fun irParaQuartaTela() {
        val irQuartaTela = Intent(this, MainActivity_back_4::class.java)
        startActivity(irQuartaTela)
    }
    private fun irParaRegras() {
        val irRegras = Intent(this, MainActivity_back_rules::class.java)
        startActivity(irRegras)
    }
}