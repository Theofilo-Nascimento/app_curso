package com.example.appfinal_theo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity_back_4 : AppCompatActivity() {

    private val temas = mutableListOf("comando1", "comando2")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_front_4)

        val jogador = findViewById<EditText>(R.id.editJogador)
        val temas = findViewById<EditText>(R.id.editTemas)

        val button4 = findViewById<Button>(R.id.button4)

        button4.setOnClickListener {
            irParaQuintaTela()
        }
    }
    private fun irParaQuintaTela() {
        val irQuintaTela = Intent(this, MainActivity_back_5::class.java)
        startActivity(irQuintaTela)
    }
    fun executeOrAddTemas(view: View) {

        val command = temas.toString()

        if (temas.contains(command)) {
            // Executar ação com base no comando
            when (command) {
                "comando1" -> {
                    // Execute ação 1
                    Toast.makeText(this, "Comando 1 executado", Toast.LENGTH_SHORT).show()
                }
                "comando2" -> {
                    // Execute ação 2
                    Toast.makeText(this, "Comando 2 executado", Toast.LENGTH_SHORT).show()
                }
            }
        } else {
            // Adicionar novo comando ao array
            temas.add(command)
            Toast.makeText(this, "Comando adicionado: $command", Toast.LENGTH_SHORT).show()
        }
    }
}