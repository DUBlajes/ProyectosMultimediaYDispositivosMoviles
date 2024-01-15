package com.example.ejercicio1calculadora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val btnSumar = findViewById<AppCompatButton>(R.id.btnSumar)
        val btnRestar = findViewById<AppCompatButton>(R.id.btnRestar)
        val btnMultiplicar = findViewById<AppCompatButton>(R.id.btnMultiplicar)
        val btnDividir = findViewById<AppCompatButton>(R.id.btnDividir)
        val etOperador1 = findViewById<AppCompatEditText>(R.id.etOperador1)
        val etOperador2 = findViewById<AppCompatEditText>(R.id.etOperador2)

        btnSumar.setOnClickListener {
            val operador1 = etOperador1.text.toString().toInt()
            val operador2 = etOperador2.text.toString().toInt()
            val intent1 = Intent(this, ResultActivity::class.java).apply {
                putExtra("OPERATION_TYPE", "SUMAR")
                putExtra("OPERADOR1", operador1)
                putExtra("OPERADOR2", operador2)
            }
            startActivity(intent1)
        }
        btnRestar.setOnClickListener {
            val operador1 = etOperador1.text.toString().toInt()
            val operador2 = etOperador2.text.toString().toInt()
            val intent2 = Intent(this, ResultActivity::class.java).apply {
                putExtra("OPERATION_TYPE", "RESTAR")
                putExtra("OPERADOR1", operador1)
                putExtra("OPERADOR2", operador2)
            }
            startActivity(intent2)
        }
        btnMultiplicar.setOnClickListener {
            val operador1 = etOperador1.text.toString().toInt()
            val operador2 = etOperador2.text.toString().toInt()
            val intent3 = Intent(this, ResultActivity::class.java).apply {
                putExtra("OPERATION_TYPE", "MULTIPLICAR")
                putExtra("OPERADOR1", operador1)
                putExtra("OPERADOR2", operador2)
            }
            startActivity(intent3)
        }
        btnDividir.setOnClickListener {
            val operador1 = etOperador1.text.toString().toInt()
            val operador2 = etOperador2.text.toString().toInt()
            val intent4 = Intent(this, ResultActivity::class.java).apply {
                putExtra("OPERATION_TYPE", "DIVIDIR")
                putExtra("OPERADOR1", operador1)
                putExtra("OPERADOR2", operador2)
            }
            startActivity(intent4)
        }
    }
}