package com.example.ejercicio2simulacro

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.widget.VideoView

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        val videoView = findViewById<VideoView>(R.id.video_view)

        // Especifica la ruta del video
        val videoPath = "android.resource://${packageName}/${R.raw.diablo}"
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
        val btnGoToC=findViewById<Button>(R.id.btnGoToC)
        btnGoToC.setOnClickListener {
            val intent = Intent(this, Activity3::class.java)
            Log.d("Lifecycle", "Vas a ver el primer curso")
            Toast.makeText(this, "Pulsado el botón Segundo Curso", Toast.LENGTH_LONG).show()
            startActivity(intent)
        }

        }
    }