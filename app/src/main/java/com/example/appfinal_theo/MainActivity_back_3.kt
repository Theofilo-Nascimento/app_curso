package com.example.appfinal_theo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity_back_3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_front_3)

        val button3 = findViewById<Button>(R.id.button3)

        button3.setOnClickListener {
            irParaQuartaTela()
        }
    }
    private fun irParaQuartaTela() {
        val irQuartaTela = Intent(this, MainActivity_back_4::class.java)
        startActivity(irQuartaTela)
    }
}