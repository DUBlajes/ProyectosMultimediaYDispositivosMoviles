package com.example.ejercicio2simulacro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class Activity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4)
        Log.d("Lifecycle", "Activity 4 - onCreate")
        val btnLayoutInflater=findViewById<Button>(R.id.btnLayoutInflater)

        btnLayoutInflater.setOnClickListener {
            val rootView: View = LayoutInflater.from(this).inflate(R.layout.activity_4, null)

            // Obtener referencia al linearLayout (puedes usar el tipo de layout que estés utilizando)

            val linearLayout=rootView.findViewById<LinearLayout>(R.id.linearLayoutContainer)

            //Creamos los 4 textviews dinámicamente

            val tvNuevo= TextView(this)
            tvNuevo.text="Aplicación realizada por Álvaro Guerrero" +
                    "\nDesarrollo de Aplicaciones Multimedia y Dispositivos Móviles"

            linearLayout.addView(tvNuevo)

            //Establecemos la vista inflada en la actividad
            setContentView(rootView)

        }

        val imageView = findViewById<ImageView>(R.id.imageView)

        // Cargar la animación desde un archivo XML
        val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.scale)

        // Aplicar la animación al ImageView
        imageView.startAnimation(animation)
    }

    override fun onStart() {
        super.onStart()
        Log.d("Lifecycle", "Activity 4 - onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Lifecycle", "Activity 4 - onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Lifecycle", "Activity 4 - onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Lifecycle", "Activity 4 - onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Lifecycle", "Activity 4 - onDestroy")
    }



    fun goToActivityA(view: View) {
        val intent = Intent(this, Activity1::class.java)
        Log.d("Lifecycle", "Has vuelto a la primera pantalla")
        startActivity(intent)
    }
}