package com.lomaxso.t7.a2.act1


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.lomaxso.t7.a2.R

class MainActivity : AppCompatActivity() {

    private lateinit var dataManager: DataManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)

        dataManager = DataManager(this)

        val etNombre = findViewById<EditText>(R.id.etNombre)
        val btnAgregar = findViewById<Button>(R.id.btnAgregar)
        val btnMostrar = findViewById<Button>(R.id.btnMostrar)
        val tvMuestraNombre = findViewById<TextView>(R.id.tvMuestraNombre)

        btnAgregar.setOnClickListener {
            val nombre = etNombre.text.toString()
            dataManager.addData(nombre)
            Toast.makeText(this, "Se agregó a la base de datos: $nombre", Toast.LENGTH_SHORT).show()
            etNombre.text.clear() //limpiamos el compononente editext
        }

        // muestra todos los datos
        btnMostrar.setOnClickListener {
            // estamos instanciando la clase datamanager
            val data = dataManager.getAllData(this)
            tvMuestraNombre.text = data //nos muestra los nombres que hay en la tabla
        }
    }
}