package com.example.proyectomultimedia
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Encuentra el ImageView en el layout
        val imageView = findViewById<ImageView>(R.id.imageView)

        // Cargar la animación desde un archivo XML
        val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.rotation)

        // Aplicar la animación al ImageView
        imageView.startAnimation(animation)
    }
}
