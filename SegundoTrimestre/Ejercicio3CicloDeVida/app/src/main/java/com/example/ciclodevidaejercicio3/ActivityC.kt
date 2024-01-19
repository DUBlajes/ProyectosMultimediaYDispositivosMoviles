package com.example.ciclodevidaejercicio3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class ActivityC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)
        Log.d("Lifecycle", "Activity C - onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Lifecycle", "Activity C - onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Lifecycle", "Activity C - onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Lifecycle", "Activity C - onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Lifecycle", "Activity C - onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Lifecycle", "Activity C - onDestroy")
    }

    fun goToActivityD(view: View) {
        val intent = Intent(this, ActivityD::class.java)
        startActivity(intent)
    }
}