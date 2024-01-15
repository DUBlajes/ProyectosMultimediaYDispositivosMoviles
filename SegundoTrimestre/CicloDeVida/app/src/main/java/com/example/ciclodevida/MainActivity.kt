package com.example.ciclodevida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
        override fun onStart() {
            super.onStart()
            Log.d("Lifecycle", "MainActivity - onStart")
        }

        override fun onResume() {
            super.onResume()
            Log.d("Lifecycle", "MainActivity - onResume")
        }

        override fun onPause() {
            super.onPause()
            Log.d("Lifecycle", "MainActivity - onPause")
        }

        override fun onStop() {
            super.onStop()
            Log.d("Lifecycle", "MainActivity - onStop")
        }

        override fun onRestart() {
            super.onRestart()
            Log.d("Lifecycle", "MainActivity - onRestart")
        }

        override fun onDestroy() {
            super.onDestroy()
            Log.d("Lifecycle", "MainActivity - onDestroy")
        }

        fun goToSecondActivity(view: View) {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
