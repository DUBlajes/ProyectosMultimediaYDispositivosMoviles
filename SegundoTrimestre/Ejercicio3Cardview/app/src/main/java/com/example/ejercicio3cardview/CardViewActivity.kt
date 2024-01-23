package com.example.ejercicio3cardview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.google.android.material.slider.RangeSlider
import com.google.android.material.floatingactionbutton.FloatingActionButton
import android.widget.Button
import androidx.cardview.widget.CardView

class CardViewActivity : AppCompatActivity() {
    private lateinit var tvIngresos: TextView
    private val incrementoDeIngresos = 100
    private lateinit var opcionSeleccionada: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val rangeSlider = findViewById<RangeSlider>(R.id.rsEdad)
        val tvAnos = findViewById<TextView>(R.id.tvAnos)
        val rangeSlider2 = findViewById<RangeSlider>(R.id.rsAnosTrabajados)
        val tvAnos2 = findViewById<TextView>(R.id.tvAnos2)
        val btnAceptar = findViewById<Button>(R.id.btnAceptar)
        val cardView1: CardView = findViewById<CardView>(R.id.cardView1)
        val cardView2: CardView = findViewById<CardView>(R.id.cardView2)
        val btnMayor = findViewById<FloatingActionButton>(R.id.btnMayor)
        val btnMenor = findViewById<FloatingActionButton>(R.id.btnMenor)
        tvIngresos = findViewById(R.id.tvIngresos)

        rangeSlider.addOnChangeListener { slider, value, fromUser ->
            // Actualiza el texto del TextView con el valor seleccionado
            tvAnos.text = "${value.toInt()} años"
        }
        rangeSlider2.addOnChangeListener { slider, value, fromUser ->
            // Actualiza el texto del TextView con el valor seleccionado
            tvAnos2.text = "${value.toInt()} años"
        }

        btnMayor.setOnClickListener {
            aumentarIngresos()
        }

        btnMenor.setOnClickListener {
            disminuirIngresos()
        }
        //pulsar un carview u otro
        cardView1.setOnClickListener {
            handleCardViewClick(cardView1)
        }

        cardView2.setOnClickListener {
            handleCardViewClick(cardView2)
        }
        // Abrir con el botón Aceptar la segunda activity
        btnAceptar.setOnClickListener {
            // Obtener valores de ingresos y edad
            val ingresos = tvIngresos.text.toString().toInt()
            val edad = rangeSlider.values[0].toInt()
            val anosTrabajados=rangeSlider2.values[0].toInt()
            opcionSeleccionada = "CardView1 elegida"//values se usa en el caso
            // que quiera usar uno de los valores del lado izquiero o derecho


            // Crear un Intent para pasar a la segunda actividad
            val intent = Intent(this, ResultActivity::class.java)

            // Agregar datos extra al Intent
            intent.putExtra("ingresos", ingresos)
            intent.putExtra("edad", edad)
            intent.putExtra("Años trabajados",anosTrabajados)
            intent.putExtra("opcionSeleccionada", opcionSeleccionada)


            // Iniciar la segunda actividad
            startActivity(intent)
        }
    }

    private fun aumentarIngresos() {
        val valorActual = tvIngresos.text.toString().toInt()
        val nuevoValor = valorActual + incrementoDeIngresos

        // Asegura que el nuevo valor no exceda el límite superior
        if (nuevoValor <= Int.MAX_VALUE) {
            tvIngresos.text = nuevoValor.toString()
        }
    }

    private fun disminuirIngresos() {
        val valorActual = tvIngresos.text.toString().toInt()
        val nuevoValor = valorActual - incrementoDeIngresos

        // Asegura que el nuevo valor no sea inferior a cero
        if (nuevoValor >= 0) {
            tvIngresos.text = nuevoValor.toString()
        }
    }

    private fun handleCardViewClick(cardView: CardView) {
        when (cardView.id) {
            R.id.cardView1 -> {
                // Acciones cuando se pulsa cardView1
                println("Se ha pulsado cardView1")
                Log.d(" CardView1", "has pulsado cardView1")
                opcionSeleccionada = "CardView1 elegida"
            }

            R.id.cardView2 -> {
                // Acciones cuando se pulsa cardView2
                println("Se ha pulsado cardView2")
                Log.d(" CardView2", "has pulsado cardView2")
            }

        }
    }
}