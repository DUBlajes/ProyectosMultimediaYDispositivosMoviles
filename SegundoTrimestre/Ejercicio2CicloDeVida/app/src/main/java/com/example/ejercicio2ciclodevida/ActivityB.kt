package com.example.ejercicio2ciclodevida
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityB : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        Log.d("ActivityB", "onCreate")

        val btnCloseActivityB: Button = findViewById(R.id.btnCerrarActivityB)
        btnCloseActivityB.setOnClickListener {
            finish() // Cierra ActivityB y vuelve a ActivityA
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("ActivityB", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("ActivityB", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("ActivityB", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("ActivityB", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("ActivityB", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ActivityB", "onDestroy")
    }
}