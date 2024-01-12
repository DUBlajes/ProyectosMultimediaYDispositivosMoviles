package com.example.appcondosactivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.util.*
import com.example.appcondosactivities.R

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvResult=findViewById<TextView>(R.id.tvResult)
        val name:String=intent.extras?.getString("EXTRA_NAME").orEmpty()
        tvResult.text="Hola, $name"
    }
}