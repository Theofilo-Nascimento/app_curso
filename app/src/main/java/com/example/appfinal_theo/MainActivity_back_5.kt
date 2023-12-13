package com.example.appfinal_theo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity_back_5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_front_5)

        val buttonRestart = findViewById<Button>(R.id.buttonRestart)

        buttonRestart.setOnClickListener {
            irParaQuartaTela()
        }
    }
    private fun irParaQuartaTela() {
        val irQuartaTela = Intent(this, MainActivity_back_4::class.java)
        startActivity(irQuartaTela)
    }
}


