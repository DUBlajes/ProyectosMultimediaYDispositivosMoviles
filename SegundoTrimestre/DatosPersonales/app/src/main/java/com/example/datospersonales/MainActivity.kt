package com.example.datospersonales


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var dataManager: DataManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dataManager = DataManager(this)

        val etNombre = findViewById<EditText>(R.id.etNombre)
        val etApellidos = findViewById<EditText>(R.id.etApellidos)
        val etDireccion = findViewById<EditText>(R.id.etDireccion)
        val etCodigoPostal = findViewById<EditText>(R.id.etCodigoPostal)
        val etCiudad = findViewById<EditText>(R.id.etCiudad)
        val etProvincia = findViewById<EditText>(R.id.etProvincia)
        val etTelefono = findViewById<EditText>(R.id.etTelefono)
        val etId = findViewById<EditText>(R.id.etId)
        val btnAgregar = findViewById<Button>(R.id.btnAgregar)
        val btnEliminar = findViewById<Button>(R.id.btnEliminar)
        val btnMostrar = findViewById<Button>(R.id.btnMostrar)
        val tvMuestraNombre = findViewById<TextView>(R.id.tvMuestraNombre)

        btnAgregar.setOnClickListener {
            val nombre = etNombre.text.toString()
            val apellidos = etApellidos.text.toString()
            val direccion = etDireccion.text.toString()
            val codigoPostal = etCodigoPostal.text.toString().toInt()
            val ciudad = etCiudad.text.toString()
            val provincia = etProvincia.text.toString()
            val telefono = etTelefono.text.toString().toInt()
            dataManager.addData(nombre, apellidos, direccion, codigoPostal, ciudad, provincia, telefono)
            Toast.makeText(this, "Se agregó a la base de datos todos los valores de: $nombre, $apellidos", Toast.LENGTH_SHORT).show()
            etNombre.text.clear()
            etApellidos.text.clear()
            etDireccion.text.clear()
            etCodigoPostal.text.clear()
            etCiudad.text.clear()
            etProvincia.text.clear()
            etTelefono.text.clear()
        } // e

        // muestra los datos
        btnMostrar.setOnClickListener {
            if(etId.text.isNotBlank()) {
                val values = dataManager.getData(this)

                etNombre.setText(values[0])
                etApellidos.setText(values[1])
                etDireccion.setText(values[2])
                etCodigoPostal.setText(values[3])
                etCiudad.setText(values[4])
                etProvincia.setText(values[5])
                etTelefono.setText(values[6])
            } else {
                val data = dataManager.getAllData(this)
                tvMuestraNombre.text = data //nos muestra los nombres que hay en la tabla
            } // else

        } // e

        btnEliminar.setOnClickListener {
            val id = etId.text.toString().toInt()
            dataManager.eliminateData(id)
            Toast.makeText(this, "Se borró el registro con el id $id", Toast.LENGTH_SHORT).show()
        } // e
    } // fun
} // class