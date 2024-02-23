package com.example.ejercicio2simulacro

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.widget.VideoView
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText

class Activity1 : AppCompatActivity() {


    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)
        val videoView = findViewById<VideoView>(R.id.video_view)

        // Especifica la ruta del video
        val videoPath = "android.resource://${packageName}/${R.raw.rick}"
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

        val btnGoToB = findViewById<AppCompatButton>(R.id.btnGoToB)
        val btnGoToW = findViewById<AppCompatButton>(R.id.btnGoToW)


        btnGoToW.setOnClickListener {
            val intent = Intent(this, Activity0::class.java)
            Log.d("Lifecycle", "Cambiaste a la segunda pantalla")
            Toast.makeText(this, "Pulsado el botón Curso Anterior", Toast.LENGTH_LONG)
                .show()
            startActivity(intent)
        }


        btnGoToB.setOnClickListener {
            val intent = Intent(this, Activity2::class.java)
            Log.d("Lifecycle", "Vas a ver el primer curso")
            Toast.makeText(this, "Pulsado el botón Primer Curso", Toast.LENGTH_LONG).show()
            startActivity(intent)
        }
    }
}

