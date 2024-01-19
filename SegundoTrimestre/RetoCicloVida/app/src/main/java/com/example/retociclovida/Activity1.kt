package com.example.retociclovida

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText

class Activity1 : AppCompatActivity() {


    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)
        Log.d("Lifecycle", "Activity 1 - onCreate")

        val btnGoToB=findViewById<AppCompatButton>(R.id.btnGoToB)
        val etName=findViewById<AppCompatEditText>(R.id.etName)

        btnGoToB.setOnClickListener{
            val name= etName.text.toString()

            if(name.isNotEmpty()){
                val intent = Intent(this, Activity2::class.java)
                Log.d("Lifecycle", "Cambiaste a la segunda pantalla")

                intent.putExtra("EXTRA_NAME", name)
                startActivity(intent)
            }else{
                val intent = Intent(this, Activity0::class.java)
                Log.d("Lifecycle", "Cambiaste a la segunda pantalla sin introducir nombre")
                startActivity(intent)
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("Lifecycle", "Activity 1 - onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Lifecycle", "Activity 1 - onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Lifecycle", "Activity 1 - onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Lifecycle", "Activity 1 - onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Lifecycle", "Activity 1 - onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Lifecycle", "Activity 1 - onDestroy")
    }

}