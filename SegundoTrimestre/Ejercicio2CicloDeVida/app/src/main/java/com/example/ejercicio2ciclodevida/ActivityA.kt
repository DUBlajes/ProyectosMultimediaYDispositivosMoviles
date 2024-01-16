package com.example.ejercicio2ciclodevida

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class ActivityA : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity)
        Log.d("Ciclo de vida", "onCreate")

        val btnOpenActivityB: Button = findViewById(R.id.btnAbrirActivityB)
        btnOpenActivityB.setOnClickListener {
            val intent = Intent(this, ActivityB::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("Ciclo de vida", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Ciclo de vida", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Ciclo de vida", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Ciclo de vida", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Ciclo de vida", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Ciclo de vida", "onDestroy")
    }
}

