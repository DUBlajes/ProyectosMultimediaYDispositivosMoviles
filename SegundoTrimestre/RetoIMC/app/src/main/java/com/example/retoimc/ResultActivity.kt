package com.example.retoimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {

    private lateinit var tvTuResultado:TextView
    private lateinit var tvResultadoLetras:TextView
    private lateinit var tvResultadoNumeros:TextView
    private lateinit var tvMensajeResultado:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val resultado:Double=intent.extras?getDouble(IMC_KEY)?:-1.0
        initComponents()
        initUI()
    }

    private fun initComponents(){

        tvResultadoNumeros=findViewById(R.id.tvResultadoNumeros)
        tvResultadoLetras=findViewById(R.id.tvResultadoLetras)
        tvTuResultado=findViewById(R.id.tvTuResultado)
        tvMensajeResultado=findViewById(R.id.tvMensajeResultado)
    }

    private fun initUI(){

    }
}