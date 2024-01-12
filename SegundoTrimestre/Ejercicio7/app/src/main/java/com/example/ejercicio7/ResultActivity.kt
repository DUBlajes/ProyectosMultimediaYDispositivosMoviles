package com.example.ejercicio7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvResult=findViewById<TextView>(R.id.tvResult)
        val nombre:String=intent.extras?.getString("EXTRA_NOMBRE").orEmpty()
        val apellidos:String=intent.extras?.getString("EXTRA_APELLIDO").orEmpty()
        val curso:String=intent.extras?.getString("EXTRA_CURSO").orEmpty()
        val asignatura:String=intent.extras?.getString("EXTRA_ASIGNATURA").orEmpty()
        val nota:String=intent.extras?.getString("EXTRA_NOTA").orEmpty()
        tvResult.text="Hola, $nombre" +
                "\nDetalles:" +
                "\nApellidos: $apellidos" +
                "\nCurso: $curso" +
                "\nAsignatura: $asignatura" +
                "\nNota: $nota"
    }
}