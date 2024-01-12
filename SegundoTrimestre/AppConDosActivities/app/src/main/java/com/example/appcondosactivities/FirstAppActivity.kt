package com.example.appcondosactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)

        val btnStart=findViewById<AppCompatButton>(R.id.btnStart)
        val etName=findViewById<AppCompatEditText>(R.id.etName)

        btnStart.setOnClickListener{
            val name= etName.text.toString()

            if(name.isNotEmpty()){
                val intent= Intent(this,ResultActivity::class.java)
                intent.putExtra("EXTRA_NAME", name)
                startActivity(intent)
            }
        }
    }
}