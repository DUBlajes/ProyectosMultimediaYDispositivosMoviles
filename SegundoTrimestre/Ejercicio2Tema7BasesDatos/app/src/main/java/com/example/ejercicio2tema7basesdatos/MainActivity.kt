package com.example.ejercicio2tema7basesdatos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStreamWriter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLeerArchivo: Button = findViewById(R.id.btnLeerArchivo)


        btnLeerArchivo.setOnClickListener {
            leerArchivo()
        }

        val btnCrearArchivo: Button =findViewById(R.id.btnCrearArchivo)

        btnCrearArchivo.setOnClickListener {
            crearArchivo()


        }

    }

    private fun crearArchivo() {
        val nombreArchivo="Álvaro Genio"
        val contenidoArchivo="Un recesito, ¿no?"

        //Abrir un OutputStreamWriter en el modo privado para que solo sea accesible por esta aplicación

        var osw: OutputStreamWriter = OutputStreamWriter(openFileOutput(nombreArchivo, MODE_PRIVATE))

        //Escribir el contenido en el archivo
        osw.write(contenidoArchivo)

        //Limpiar y cerrar el OutputStreamWriter
        osw.flush()
        osw.close()

        Log.d("Éxito","Archivo creado exitosamente")

    }

    private fun leerArchivo() {
        try {
            val nombreArchivo="Álvaro Genio"
            val textView:TextView=findViewById(R.id.textView)

            // Abrir un BufferedReader para leer el archivo
            val br = BufferedReader(InputStreamReader(openFileInput(nombreArchivo)))

            // Leer la primera línea del archivo
            textView.text = "Contenido del archivo: "+ br.readLine()

            // Cerrar el BufferedReader
            br.close()

            Log.d("Éxito", "Contenido del archivo: $textView")


        } catch (e: Exception) {
            Log.e("Error", "Error al leer el archivo: " + e.message)
        }
    }
}