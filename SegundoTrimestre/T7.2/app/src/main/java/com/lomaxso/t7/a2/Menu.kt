package com.lomaxso.t7.a2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.lomaxso.t7.a2.reto.RetoActivity

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val boton1 = findViewById<Button>(R.id.btn1)
        val boton2 = findViewById<Button>(R.id.btn2)
        val boton3 = findViewById<Button>(R.id.btn3)
        val boton4 = findViewById<Button>(R.id.btn4)

        boton1.setOnClickListener {
            val intent = Intent(this, com.lomaxso.t7.a2.act1.MainActivity::class.java)
            startActivity(intent)
        } // btn

        boton2.setOnClickListener {
            val intent = Intent(this, com.lomaxso.t7.a2.act2.MainActivity::class.java)
            startActivity(intent)
        } // btn

        boton3.setOnClickListener {
            val intent = Intent(this, com.lomaxso.t7.a2.act3.MainActivity::class.java)
            startActivity(intent)
        } // btn

        boton4.setOnClickListener {
            val intent = Intent(this, RetoActivity::class.java)
            startActivity(intent)
        } // btn

    } // fun
} // class