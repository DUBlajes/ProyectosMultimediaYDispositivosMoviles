package com.example.retociclovida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        val tvResult=findViewById<TextView>(R.id.tvResult)
        val name:String=intent.extras?.getString("EXTRA_NAME").orEmpty()
        tvResult.text="Hola, $name."
        Log.d("Lifecycle", "Activity 2 - onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Lifecycle", "Activity 2 - onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Lifecycle", "Activity 2 - onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Lifecycle", "Activity 2 - onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Lifecycle", "Activity 2 - onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Lifecycle", "Activity 2 - onDestroy")
    }

    fun goToActivityC(view: View) {
        val intent = Intent(this, Activity3::class.java)
        Log.d("Lifecycle", "Cambiaste a la tercera pantalla")
        startActivity(intent)
    }
}