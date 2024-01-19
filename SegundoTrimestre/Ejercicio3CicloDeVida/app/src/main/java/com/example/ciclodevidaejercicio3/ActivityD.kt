package com.example.ciclodevidaejercicio3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class ActivityD : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d)
        Log.d("Lifecycle", "Activity D - onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Lifecycle", "Activity D - onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Lifecycle", "Activity D - onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Lifecycle", "Activity D - onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Lifecycle", "Activity D - onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Lifecycle", "Activity D - onDestroy")
    }

    fun goToActivityA(view: View) {
        val intent = Intent(this, ActivityA::class.java)
        startActivity(intent)
    }
}