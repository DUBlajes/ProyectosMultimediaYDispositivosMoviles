package com.example.ejerciciopermisos


import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    private val STORAGE_PERMISSION_REQUEST = 1001
    private lateinit var editTextData: EditText
    private lateinit var btnSave: Button
    private lateinit var tvStoredData: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextData = findViewById(R.id.editTextData)
        btnSave = findViewById(R.id.btnSave)
        tvStoredData = findViewById(R.id.tvStoredData)

        checkStoragePermission()

        btnSave.setOnClickListener {
            checkStoragePermissionAndSaveData()
        }
        loadData()
    }

    private fun checkStoragePermission() {
        if (ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.WRITE_EXTERNAL_STORAGE
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            //Si el permiso no está concedido, solicitarlo
            ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE),
                STORAGE_PERMISSION_REQUEST
            )
        }
    }

    private fun checkStoragePermissionAndSaveData() {
        if (ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.WRITE_EXTERNAL_STORAGE
            ) == PackageManager.PERMISSION_GRANTED
        ) {
            //Permiso de almacenamiento concedido, guardar datos
            saveData()
        } else {
            //Si el permiso no está concedido, solicitarlo
            ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE),
                STORAGE_PERMISSION_REQUEST
            )
        }
    }

    private fun saveData() {
        val dataToStore = editTextData.text.toString()
        val sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putString("storedData", dataToStore)
        editor.apply()
        editTextData.text.clear()
        loadData()
    }

    private fun loadData() {
        val sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
        val storedData = sharedPreferences.getString("storedData", "")
        tvStoredData.text = "Datos almacenados: $storedData"
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        if (requestCode == STORAGE_PERMISSION_REQUEST) {
            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                //Permiso de almacenamiento concedido después de la solicitud
                saveData()
            } else {
                //Permiso de almacenamiento denegado después de la solicitud
                Toast.makeText(this, "Permiso de almacenamiento denegado", Toast.LENGTH_SHORT)
                    .show()
            }
        }

    }

}