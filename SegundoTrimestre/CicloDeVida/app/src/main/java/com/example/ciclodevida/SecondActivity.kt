package com.example.ciclodevida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    override fun onStart(){
        super.onStart()

        Log.d("Ciclo de vida","SecondActivity - onStart")
        Log.d("Ciclo de vida","secondActivity, onStart de nuevo")
    }

    override fun onResume(){
        super.onResume()
        Log.d("Ciclo de vida","SecondActivity - onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Lifecycle", "SecondActivity - onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Lifecycle", "SecondActivity - onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Lifecycle", "SecondActivity - onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Lifecycle", "SecondActivity - onDestroy")
    }

    fun goBackToMainActivity(view: View) {
        finish()
    }
}
