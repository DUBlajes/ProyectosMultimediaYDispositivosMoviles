package com.lomaxso.t7.a2.act3

import android.content.ContentValues
import android.content.Context

class DataManager(context: Context) {
    /*creamos una instancia de DatabaseHelper y le añadimos el contexto, es decir acceso a recursos, base de datos, etc */
    private val dbHelper = DatabaseHelper(context)

    fun addData(nombre: String, apellidos: String, dni: String, edad: Int, curso: String) {
        val db = dbHelper.writableDatabase   //usamos el método par //escribir en la bbdd

        val values = ContentValues().apply {
            put(DatabaseHelper.COLUMN_NAME, nombre)
            put(DatabaseHelper.COLUMN_APELLIDOS, apellidos)
            put(DatabaseHelper.COLUMN_DNI, dni)
            put(DatabaseHelper.COLUMN_EDAD, edad)
            put(DatabaseHelper.COLUMN_CURSO, curso)
        }
        db.insert(DatabaseHelper.TABLE_NAME, null, values)
        db.close()
    }

    //rawQuery crea una consulta y la devuelve en un cursor
    fun getAllData(context: Context): String {
        val db = dbHelper.readableDatabase
        val cursor = db.rawQuery("SELECT * FROM ${DatabaseHelper.TABLE_NAME}", null)
        val data = StringBuilder()

        while (cursor.moveToNext()) {
            val name = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_NAME))
            val apellidos = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_APELLIDOS))
            val dni = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_DNI))
            val edad = cursor.getInt(cursor.getColumnIndex(DatabaseHelper.COLUMN_EDAD))
            val curso = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_CURSO))

            data.append("$name, ")
            data.append("$apellidos, ")
            data.append("$dni, ")
            data.append("$edad, ")
            data.append("$curso, ")
            data.append("\n")
        } // while

        cursor.close()
        db.close()

        if (data.isEmpty()) {
            return "No hay datos en la base de datos"
        }

        return data.toString()
    }
}
