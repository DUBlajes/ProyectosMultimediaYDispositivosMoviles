package com.example.ejercicio2simulacro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView

class Activity0 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_0)
        Log.d("Lifecycle", "Activity 0 - onCreate")

        // Encuentra el ImageView en el layout
        val imageView = findViewById<ImageView>(R.id.imageView)

        // Cargar la animación desde un archivo XML
        val animation: Animation = AnimationUtils.loadAnimation(this,R.anim.rotation)

        // Aplicar la animación al ImageView
        imageView.startAnimation(animation)
    }


}
