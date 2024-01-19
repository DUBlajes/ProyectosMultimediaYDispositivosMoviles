package com.example.retociclovida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)
        Log.d("Lifecycle", "Activity 3 - onCreate")
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