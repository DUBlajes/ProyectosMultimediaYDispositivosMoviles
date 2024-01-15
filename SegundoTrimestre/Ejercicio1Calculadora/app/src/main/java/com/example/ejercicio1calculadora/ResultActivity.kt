package com.example.ejercicio1calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvResult=findViewById<TextView>(R.id.tvResult)
        val operationType = intent.getStringExtra("OPERATION_TYPE")

        // Coge los operadores de los intent
        val operador1 = intent.getIntExtra("OPERADOR1", 0)
        val operador2 = intent.getIntExtra("OPERADOR2", 0)

        // Hace la operación correspondiente dependiendo del tipo de operacion
        val resultado = when (operationType) {
            "SUMAR" -> operador1 + operador2
            "RESTAR" -> operador1 - operador2
            "MULTIPLICAR" -> operador1 * operador2
            "DIVIDIR" -> if (operador2 != 0) operador1 / operador2 else 0
            else -> 0
        }

        // Muestra el resultado
        tvResult.text = "Resultado: $resultado"
    }
}