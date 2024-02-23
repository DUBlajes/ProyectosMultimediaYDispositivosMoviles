package com.example.examenparcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.core.view.marginTop


class MainActivity : AppCompatActivity() {
    private var opcionSeleccionada: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnSiguiente = findViewById<Button>(R.id.btnEntrar)
        val etName = findViewById<EditText>(R.id.Nombre)
        val etApellido = findViewById<EditText>(R.id.Apellidos)
        val etFecha = findViewById<EditText>(R.id.Fecha)
        val etEspecialista = findViewById<EditText>(R.id.Especialista)
        val citaU = findViewById<CardView>(R.id.cardView)

        citaU.setOnClickListener {
            handleCardViewClick(citaU)
        }

        btnSiguiente.setOnClickListener {
            val apellido = etApellido.text.toString()
            val nombre = etName.text.toString()
            val fecha = etFecha.text.toString()
            val especialista = etEspecialista.text.toString()
            if (apellido.isNotEmpty() && nombre.isNotEmpty() &&
                fecha.isNotEmpty() && especialista.isNotEmpty()) {

                val intent = Intent(this, SegundaPantalla::class.java)
                intent.putExtra("EXTRA_APELLIDO", apellido)
                intent.putExtra("EXTRA_NOMBRE", nombre)
                intent.putExtra("EXTRA_FECHA", fecha)
                intent.putExtra("EXTRA_ESPECIALISTA", especialista)
                intent.putExtra("EXTRA_CITA", opcionSeleccionada)
                startActivity(intent)
            }
            else{
                Toast.makeText(this,"No se ha rellenado ningún dato",Toast.LENGTH_LONG).show()
        }
        }


    }

    private fun handleCardViewClick(cardView: CardView) {
        when (cardView.id) {
            R.id.cardView -> {
                println("Cita urgente concertada")
                Log.d("Cita Urgente cardview", "Has pulsado el cardview de cita urgente")
                opcionSeleccionada = "Ha solicitado una cita urgente"
                Toast.makeText(this,"Cita urgente seleccionada",Toast.LENGTH_LONG).show()

            }
        }
    }
}
