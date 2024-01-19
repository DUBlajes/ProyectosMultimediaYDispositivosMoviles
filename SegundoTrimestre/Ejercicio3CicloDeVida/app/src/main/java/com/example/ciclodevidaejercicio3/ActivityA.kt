package com.example.ciclodevidaejercicio3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class ActivityA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
        Log.d("Lifecycle", "Activity A - onCreate")

    }

    override fun onStart() {
        super.onStart()
        Log.d("Lifecycle", "Activity A - onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Lifecycle", "Activity A - onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Lifecycle", "Activity A - onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Lifecycle", "Activity A - onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Lifecycle", "Activity A - onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Lifecycle", "Activity A - onDestroy")
    }

    fun goToActivityB(view: View) {
        val intent = Intent(this, ActivityB::class.java)
        Log.d("Lifecycle", "Cambiaste a la pantalla B")
        startActivity(intent)
    }

}