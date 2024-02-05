package com.example.ejercicio1tema7basedatos

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import java.io.OutputStreamWriter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCrearArchivo: Button =findViewById(R.id.btnCrearArchivo)

        btnCrearArchivo.setOnClickListener {
            crearArchivo()


        }
    }

    private fun crearArchivo() {
        val nombreArchivo="Alberto el grande"
        val contenidoArchivo="Alberto Imperator"

        //Abrir un OutputStreamWriter en el modo privado para que solo sea accesible por esta aplicación

        var osw:OutputStreamWriter= OutputStreamWriter(openFileOutput(nombreArchivo, Context.MODE_PRIVATE))

        //Escribir el contenido en el archivo
        osw.write(contenidoArchivo)

        //Limpiar y cerrar el OutputStreamWriter
        osw.flush()
        osw.close()

        Log.d("Éxito","Archivo creado exitosamente")

    }


}