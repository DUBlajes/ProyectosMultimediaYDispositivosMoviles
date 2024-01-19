package com.example.ciclodevidaejercicio3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        Log.d("Lifecycle", "Activity B - onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Lifecycle", "Activity B - onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Lifecycle", "Activity B - onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Lifecycle", "Activity B - onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Lifecycle", "Activity B - onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Lifecycle", "Activity B - onDestroy")
    }

    fun goToActivityC(view: View) {
        val intent = Intent(this, ActivityC::class.java)
        startActivity(intent)
    }
}