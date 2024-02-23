package com.example.ejercicio2simulacro

import android.content.Intent
import android.net.Uri
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
import android.widget.VideoView

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)
        Log.d("Lifecycle", "Activity 3 - onCreate")

        val videoView = findViewById<VideoView>(R.id.video_view)

        // Especifica la ruta del video
        val videoPath = "android.resource://${packageName}/${R.raw.tia}"
        val videoUri = Uri.parse(videoPath)

        // Configura el VideoView para reproducir el video
        videoView.setVideoURI(videoUri)

        // Configura los controles de reproducción del video
        val mediaController = android.widget.MediaController(this)
        videoView.setMediaController(mediaController)
        mediaController.setAnchorView(videoView)

        val buttonPlay = findViewById<Button>(R.id.btnPlay)
        buttonPlay.setOnClickListener {
            // Reinicia la reproducción del video
            videoView.seekTo(0)
            videoView.start()
        }


        val imageView = findViewById<ImageView>(R.id.imageView)

        // Cargar la animación desde un archivo XML
        val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.slide_in)

        // Aplicar la animación al ImageView
        imageView.startAnimation(animation)

    }

    override fun onStart() {
        super.onStart()
        Log.d("Lifecycle", "Activity 3 - onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Lifecycle", "Activity 3 - onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Lifecycle", "Activity 3 - onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Lifecycle", "Activity 3 - onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Lifecycle", "Activity 3 - onDestroy")
    }

    fun goToActivityD(view: View) {
        val intent = Intent(this, Activity4::class.java)
        Log.d("Lifecycle", "Cambiaste a la cuarta pantalla")
        startActivity(intent)
    }
}