package com.example.examenparcial


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class SegundaPantalla : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_pantalla)
        val btnLayoutInflater=findViewById<Button>(R.id.btnLayoutInflater)
        val tvResult=findViewById<TextView>(R.id.tvmensaje)
        val name: String = intent.extras?.getString("EXTRA_NOMBRE").orEmpty()
        val apellido:String = intent.extras?.getString("EXTRA_APELLIDO").orEmpty()
        val fecha:String = intent.extras?.getString("EXTRA_FECHA").orEmpty()
        val especialista:String = intent.extras?.getString("EXTRA_ESPECIALISTA").orEmpty()
        val citaU:String = intent.extras?.getString("EXTRA_CITA").orEmpty()
        tvResult.text = "\tCita Médica solicitada" +
                "\n" +
                "\nNombre del paciente: $name" +
                "\nApellidos del paciente: $apellido" +
                "\nFecha de la cita: $fecha" +
                "\n" +
                "Especialista: $especialista" +
                "\n" +
                "\n$citaU "

        btnLayoutInflater.setOnClickListener {
            val rootView: View = LayoutInflater.from(this).inflate(R.layout.activity_segunda_pantalla, null)

            // Obtener referencia al linearLayout (puedes usar el tipo de layout que estés utilizando)

            val linearLayout=rootView.findViewById<LinearLayout>(R.id.linearLayoutContainer)

            //Creamos los 4 textviews dinámicamente

            val tvNuevo=TextView(this)
            tvNuevo.text="Aplicación realizada por Álvaro Guerrero" +
                    "\nDesarrollo de Aplicaciones Multimedia y Dispositivos Móviles"

            linearLayout.addView(tvNuevo)

            //Establecemos la vista inflada en la actividad
            setContentView(rootView)

        }
    }
}
