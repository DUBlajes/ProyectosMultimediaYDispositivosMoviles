package com.example.retoimc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.example.retoimc.MainActivity.Companion.RESULTADO_IMC

class ResultActivity : AppCompatActivity() {

    private lateinit var tvTuResultado: TextView
    private lateinit var tvResultadoLetras: TextView
    private lateinit var tvResultadoNumeros: TextView
    private lateinit var tvMensajeResultado: TextView
    private lateinit var botonRecalcular: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val resultado: Double = intent.extras?.getDouble(RESULTADO_IMC) ?: -1.0
        initComponents()
        initUI(resultado)
        initListeners()
    }

    private fun initListeners() {
        botonRecalcular.setOnClickListener{
            volverAtras()
        }
    }

    private fun volverAtras() {
        val intent= Intent(this,MainActivity::class.java)
        startActivity(intent)
    }

    private fun initComponents() {

        tvResultadoNumeros = findViewById(R.id.tvResultadoNumeros)
        tvResultadoLetras = findViewById(R.id.tvResultadoLetras)
        tvTuResultado = findViewById(R.id.tvTuResultado)
        tvMensajeResultado = findViewById(R.id.tvMensajeResultado)
        botonRecalcular=findViewById(R.id.botonRecalcular)
    }

    private fun initUI(resultado: Double) {
        tvResultadoNumeros.text=resultado.toString()
        when (resultado) {
            in 0.00..18.50 -> { //Bajo peso
                tvResultadoLetras.text=getString(R.string.titulo_bajo)
                tvResultadoLetras.setTextColor(ContextCompat.getColor(this,R.color.orange))
                tvMensajeResultado.text=getString(R.string.descripcion_bajo)
            }

            in 18.51..24.99 -> { //Peso normal
                tvResultadoLetras.text=getString(R.string.titulo_normal)
                tvResultadoLetras.setTextColor(ContextCompat.getColor(this,R.color.green))
                tvMensajeResultado.text=getString(R.string.descripcion_normal)
            }

            in 25.00..29.99 -> { //Sobrepeso
                tvResultadoLetras.text=getString(R.string.titulo_sobrepeso)
                tvResultadoLetras.setTextColor(ContextCompat.getColor(this,R.color.yellow))
                tvMensajeResultado.text=getString(R.string.descripcion_sobrepeso)
            }

            in 30.00..99.99 -> { //Obesidad
                tvResultadoLetras.text=getString(R.string.titulo_obesidad)
                tvResultadoLetras.setTextColor(ContextCompat.getColor(this,R.color.red))
                tvMensajeResultado.text=getString(R.string.descripcion_obesidad)
            }

            else -> { //Error
                tvResultadoLetras.text = getString(R.string.error)
                tvResultadoLetras.setTextColor(ContextCompat.getColor(this,R.color.red))
                tvResultadoNumeros.text = getString(R.string.error)
                tvMensajeResultado.text = getString(R.string.error)
            }
        }

    }
}