package com.lomaxso.t7.a2.reto


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.lomaxso.t7.a2.R

class RetoActivity : AppCompatActivity() {

    private lateinit var dataManager: DataManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reto)

        dataManager = DataManager(this)

        val etMarca = findViewById<EditText>(R.id.etMarca)
        val etModelo = findViewById<EditText>(R.id.etModelo)
        val etAnio = findViewById<EditText>(R.id.etAnio)
        val etTipo = findViewById<EditText>(R.id.etTipo)
        val etTalla = findViewById<EditText>(R.id.etTalla)
        val etCodFabric = findViewById<EditText>(R.id.etCodFabric)
        val etCodDepo = findViewById<EditText>(R.id.etCodDepo)
        val etId = findViewById<EditText>(R.id.etId)
        val btnAgregar = findViewById<Button>(R.id.btnAgregar)
        val btnModificar = findViewById<Button>(R.id.btnModificar)
        val btnEliminar = findViewById<Button>(R.id.btnEliminar)
        val btnMostrar = findViewById<Button>(R.id.btnMostrar)
        val tvMuestraNombre = findViewById<TextView>(R.id.tvMuestraNombre)

        btnAgregar.setOnClickListener {
            val marca = etMarca.text.toString()
            val modelo = etModelo.text.toString()
            val anio = etAnio.text.toString().toInt()
            val tipo = etTipo.text.toString()
            val talla = etTalla.text.toString()
            val codFabric = etCodFabric.text.toString().toInt()
            val codDepo = etCodDepo.text.toString().toInt()
            dataManager.addData(marca, modelo, anio, tipo, talla, codFabric, codDepo)
            Toast.makeText(this, "Se agregó a la base de datos todos los valores de: $marca, $modelo", Toast.LENGTH_SHORT).show()
            etMarca.text.clear() //limpiamos el compononente editext
            etModelo.text.clear()
            etAnio.text.clear()
            etTipo.text.clear()
            etTalla.text.clear()
            etCodFabric.text.clear()
            etCodDepo.text.clear()
        } // e

        // muestra los datos
        btnMostrar.setOnClickListener {
            if(etId.text.isNotBlank()) {
                val values = dataManager.getData(this)

                etMarca.setText(values[0])
                etModelo.setText(values[1])
                etAnio.setText(values[2])
                etTipo.setText(values[3])
                etTalla.setText(values[4])
                etCodFabric.setText(values[5])
                etCodDepo.setText(values[6])
            } else {
                val data = dataManager.getAllData(this)
                tvMuestraNombre.text = data //nos muestra los nombres que hay en la tabla
            } // else

        } // e

        btnModificar.setOnClickListener {
            val id = etId.text.toString().toInt()
            val marca = etMarca.text.toString()
            val modelo = etModelo.text.toString()
            val anio = etAnio.text.toString().toInt()
            val tipo = etTipo.text.toString()
            val talla = etTalla.text.toString()
            val codFabric = etCodFabric.text.toString().toInt()
            val codDepo = etCodDepo.text.toString().toInt()
            dataManager.modifyData(id, marca, modelo, anio, tipo, talla, codFabric, codDepo)
            Toast.makeText(this, "Se modificó el registro con el id $id", Toast.LENGTH_SHORT).show()
        } // e

        btnEliminar.setOnClickListener {
            val id = etId.text.toString().toInt()
            dataManager.eliminateData(id)
            Toast.makeText(this, "Se borró el registro con el id $id", Toast.LENGTH_SHORT).show()
        } // e
    } // fun
} // class