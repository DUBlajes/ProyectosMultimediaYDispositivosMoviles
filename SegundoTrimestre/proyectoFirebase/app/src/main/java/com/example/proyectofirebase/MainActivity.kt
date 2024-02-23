package com.example.proyectofirebase

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.firestore.FirebaseFirestore


class MainActivity : AppCompatActivity() {
    private var editTextNombre: EditText? = null
    private var editTextApellido: EditText? = null
    private var editTextEdad: EditText? = null
    private lateinit var btnAgregar: Button
    private lateinit var btnMostrar: Button
    private lateinit var btnEliminar:Button
    private lateinit var btnActualizar:Button
    private var textViewDatos: TextView? = null
    private var db: FirebaseFirestore? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

// Inicializar Firestore
        db = FirebaseFirestore.getInstance()
        editTextNombre = findViewById(R.id.editTextNombre)
        editTextApellido = findViewById(R.id.editTextApellido)
        editTextEdad = findViewById(R.id.editTextEdad)
        btnAgregar = findViewById(R.id.btnAgregar)
        btnMostrar = findViewById(R.id.btnMostrar)
        btnEliminar = findViewById(R.id.btnEliminar)
        btnActualizar = findViewById(R.id.btnActualizar)
        textViewDatos = findViewById(R.id.textViewDatos)
        btnAgregar.setOnClickListener(View.OnClickListener { agregarDatos() })
        btnMostrar.setOnClickListener(View.OnClickListener { mostrarDatos() })
        btnEliminar.setOnClickListener(View.OnClickListener { eliminarRegistro() })
        btnActualizar.setOnClickListener(View.OnClickListener { actualizarDatos() })

    }

    private fun agregarDatos() {
        val nombre = editTextNombre!!.text.toString().trim { it <= ' ' }
        val apellido = editTextApellido!!.text.toString().trim { it <= ' ' }
        val edad = editTextEdad!!.text.toString().trim { it <= ' ' }.toInt()
        val user: MutableMap<String, Any> = HashMap()
        user["nombre"] = nombre
        user["apellido"] = apellido
        user["edad"] = edad
        db!!.collection("usuarios")
            .add(user)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    Toast.makeText(
                        this@MainActivity,
                        "Datos agregados correctamente",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    Toast.makeText(this@MainActivity, "Error al agregar datos", Toast.LENGTH_SHORT)
                        .show()
                }
            }
    }

    private fun mostrarDatos() {
        db!!.collection("usuarios")
            .get()
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    val datos = StringBuilder()
                    for (document in task.result) {
                        datos.append("Nombre: ").append(document.getString("nombre")).append(", ")
                            .append("Apellido: ").append(document.getString("apellido"))
                            .append(", ")
                            .append("Edad: ").append(document.getLong("edad")).append("\n")
                    }
                    textViewDatos!!.text = datos.toString()
                } else {
                    Toast.makeText(this@MainActivity, "Error al obtener datos", Toast.LENGTH_SHORT)
                        .show()
                }
            }
    }

    private fun eliminarRegistro() {
        val nombre = editTextNombre!!.text.toString().trim { it <= ' ' }
        db!!.collection("usuarios")
            .whereEqualTo("nombre", nombre)
            .get()
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    for (document in task.result!!) {
                        document.reference.delete()
                            .addOnSuccessListener {
                                Toast.makeText(
                                    this@MainActivity,
                                    "Registro eliminado correctamente",
                                    Toast.LENGTH_SHORT
                                ).show()
                            }
                            .addOnFailureListener { e ->
                                Toast.makeText(
                                    this@MainActivity,
                                    "Error al eliminar el registro: ${e.message}",
                                    Toast.LENGTH_SHORT
                                ).show()
                            }
                    }
                } else {
                    Toast.makeText(
                        this@MainActivity,
                        "Error al buscar el registro para eliminar",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
    }


    private fun actualizarDatos() {
        val nombre = editTextNombre!!.text.toString().trim { it <= ' ' }
        val nombreNuevo = "Gandalf"
        db!!.collection("usuarios")
            .whereEqualTo("nombre", nombre)
            .get()
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    for (document in task.result!!) {
                        document.reference.update("nombre", nombreNuevo)
                            .addOnSuccessListener {
                                Toast.makeText(
                                    this@MainActivity,
                                    "Datos actualizados correctamente",
                                    Toast.LENGTH_SHORT
                                ).show()
                            }
                            .addOnFailureListener { e ->
                                Toast.makeText(
                                    this@MainActivity,
                                    "Error al actualizar los datos: ${e.message}",
                                    Toast.LENGTH_SHORT
                                ).show()
                            }
                    }
                } else {
                    Toast.makeText(
                        this@MainActivity,
                        "Error al buscar el registro para actualizar",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
    }

}
