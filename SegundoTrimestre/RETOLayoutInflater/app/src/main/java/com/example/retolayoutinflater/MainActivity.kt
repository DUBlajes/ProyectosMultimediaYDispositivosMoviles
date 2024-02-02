package com.example.retolayoutinflater

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Inflar el diseño XML
        val rootView:View=LayoutInflater.from(this).inflate(R.layout.activity_main, null)

        // Obtener referencia al linearLayout (puedes usar el tipo de layout que estés utilizando)

        val linearLayout=rootView.findViewById<LinearLayout>(R.id.linearLayoutContainer)

        //Creamos los 4 textviews dinámicamente

        val tvNuevo=TextView(this)
        tvNuevo.text="Hola, Alberto"
        tvNuevo.textSize=25F
        val tvNuevo2=TextView(this)
        tvNuevo2.text="¿Esto cuanta como reto?"
        val tvNuevo3=TextView(this)
        tvNuevo3.text="Espero yo que sí"
        val tvNuevo4=TextView(this)
        tvNuevo4.text="Que algo me ha costado entenderlo"

        //Con esto agregamos los textView al contenedor
        linearLayout.addView(tvNuevo)
        linearLayout.addView(tvNuevo2)
        linearLayout.addView(tvNuevo3)
        linearLayout.addView(tvNuevo4)

        //Establecemos la vista inflada en la actividad
        setContentView(rootView)

    }
}