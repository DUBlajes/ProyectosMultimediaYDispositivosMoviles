package com.lomaxso.t7.a2.act1

import android.content.ContentValues
import android.content.Context
import android.widget.Toast

class DataManager(context: Context) {
    /*creamos una instancia de DatabaseHelper y le añadimos el contexto, es decir acceso a recursos, base de datos, etc */
    private val dbHelper = DatabaseHelper(context)

    fun addData(nombre: String) {
        val db = dbHelper.writableDatabase   //usamos el método par //escribir en la bbdd

        val values = ContentValues().apply {
            put(DatabaseHelper.COLUMN_NAME, nombre)
        }
        db.insert(DatabaseHelper.TABLE_NAME, null, values)
        db.close()
    }
    //rawQuery crea una consulta y la devuelve en un cursor
    fun getAllData(context: Context): String {
        val db = dbHelper.readableDatabase
        val cursor = db.rawQuery("SELECT * FROM ${DatabaseHelper.TABLE_NAME}", null)
        val names = StringBuilder()

        while (cursor.moveToNext()) {
            val name = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_NAME))
            names.append("$name\n")
        } // while

        cursor.close()
        db.close()

        if (names.isEmpty()) {
            return "No hay nombres en la base de datos"
        }

        return names.toString()
    }
}
