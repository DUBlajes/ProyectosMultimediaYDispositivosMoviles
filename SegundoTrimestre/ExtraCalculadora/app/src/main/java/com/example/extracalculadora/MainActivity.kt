package com.example.extracalculadora

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var displayTextView: TextView
    private var operador1: Double = 0.0
    private var operador: String = ""
    private var hayOperador1: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        displayTextView = findViewById(R.id.displayTextView)

        displayTextView = findViewById(R.id.displayTextView)
        val btnC = findViewById<Button>(R.id.btnCancelar)

        // Configurar el OnClickListener para el botón "C"
        btnC.setOnClickListener {
            // Lógica para limpiar el contenido del TextView
            limpiarPantalla()
        }

        // Set click listeners for number buttons
        val numberButtons = arrayOf(
            R.id.btn0, R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4,
            R.id.btn5, R.id.btn6, R.id.btn7, R.id.btn8, R.id.btn9
        )

        for (buttonId in numberButtons) {
            findViewById<Button>(buttonId).setOnClickListener {
                onNumberButtonClick(it)
            }
        }

        // Set click listeners for operator buttons
        val operatorButtons = arrayOf(
            R.id.btnSumar, R.id.btnRestar, R.id.btnMultiplicar, R.id.btnDividir
        )

        for (buttonId in operatorButtons) {
            findViewById<Button>(buttonId).setOnClickListener {
                onOperatorButtonClick(it)
            }
        }

        // Set click listener for equal button
        findViewById<Button>(R.id.btnIgual).setOnClickListener {
            onEqualButtonClick()
        }

        // Set click listener for dot button
        findViewById<Button>(R.id.btnPunto).setOnClickListener {
            onDotButtonClick()
        }
    }

    private fun limpiarPantalla() {
        displayTextView.text = "0"
        //
    }

    private fun onNumberButtonClick(view: View) {
        val buttonText = (view as Button).text.toString()

        if (displayTextView.text.toString() == "0" || !hayOperador1) {
            displayTextView.text = buttonText
            hayOperador1 = true
        } else {
            displayTextView.append(buttonText)
        }
    }

    private fun onOperatorButtonClick(view: View) {
        operador = (view as Button).text.toString()
        operador1 = displayTextView.text.toString().toDouble()
        hayOperador1 = false
    }

    private fun onEqualButtonClick() {
        if (hayOperador1) {
            val operador2 = displayTextView.text.toString().toDouble()
            val result = when (operador) {
                "+" -> operador1 + operador2
                "-" -> operador1 - operador2
                "*" -> operador1 * operador2
                "/" -> if (operador2 != 0.0) operador1 / operador2 else Double.NaN
                else -> Double.NaN
            }

            displayTextView.text = result.formatResult()
            hayOperador1 = false
        }
    }

    private fun onDotButtonClick() {
        if (!displayTextView.text.contains(".")) {
            displayTextView.append(".")
        }
    }

    private fun Double.formatResult(): String {
        return if (this.isNaN() || this.isInfinite()) {
            "Error"
        } else {
            String.format("%.2f", this)
        }
    }
}
