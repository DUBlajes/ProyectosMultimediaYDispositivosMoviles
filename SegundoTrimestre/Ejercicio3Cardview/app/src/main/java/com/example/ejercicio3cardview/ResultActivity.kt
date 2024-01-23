package com.example.ejercicio3cardview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        // Recuperar valores de ingresos y edad
        val ingresos = intent.getIntExtra("ingresos", 0)
        val edad = intent.getIntExtra("edad", 0)
        val anosTrabajados=intent.getIntExtra("Años trabajados", 0)
        val opcionSeleccionada = intent.getStringExtra("opcionSeleccionada") ?: ""


        // Hacer lo que necesites con los valores
        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        tvResultado.text = "Ingresos: $ingresos al mes, " +
                "\nEdad: $edad años" +
                "\nAños trabajados: $anosTrabajados" +
                "\nOpción $opcionSeleccionada"
    }
}