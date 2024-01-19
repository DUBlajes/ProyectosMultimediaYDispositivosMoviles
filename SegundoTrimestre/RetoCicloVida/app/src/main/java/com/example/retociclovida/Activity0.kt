package com.example.retociclovida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class Activity0 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_0)
        Log.d("Lifecycle", "Activity 0 - onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Lifecycle", "Activity 0 - onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Lifecycle", "Activity 0 - onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Lifecycle", "Activity 0 - onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Lifecycle", "Activity 0 - onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Lifecycle", "Activity 0 - onDestroy")
    }

    fun goToActivityA(view: View) {
        val intent = Intent(this, Activity1::class.java)
        Log.d("Lifecycle", "Has vuelto a la primera pantalla")
        startActivity(intent)
    }
}
