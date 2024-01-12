package com.example.ejercicio7

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
        val etApellido=findViewById<AppCompatEditText>(R.id.etapellido)
        val etCurso=findViewById<AppCompatEditText>(R.id.etCurso)
        val etAsignatura=findViewById<AppCompatEditText>(R.id.etAsignatura)
        val etNota=findViewById<AppCompatEditText>(R.id.etNota)

        btnStart.setOnClickListener{
            val nombre= etName.text.toString()
            val apellido=etApellido.text.toString()
            val curso=etCurso.text.toString()
            val asignatura=etAsignatura.text.toString()
            val nota=etNota.text.toString()

            if(nombre.isNotEmpty()){
                val intent= Intent(this,ResultActivity::class.java)
                intent.putExtra("EXTRA_NOMBRE", nombre)
                intent.putExtra("EXTRA_APELLIDO",apellido)
                intent.putExtra("EXTRA_CURSO",curso)
                intent.putExtra("EXTRA_ASIGNATURA",asignatura)
                intent.putExtra("EXTRA_NOTA",nota)
                startActivity(intent)
            }
        }
    }
}