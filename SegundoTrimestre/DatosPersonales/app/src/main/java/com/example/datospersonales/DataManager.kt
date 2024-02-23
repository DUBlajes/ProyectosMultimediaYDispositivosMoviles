package com.example.datospersonales

import android.content.ContentValues
import android.content.Context

class DataManager(context: Context) {
    /*creamos una instancia de DatabaseHelper y le añadimos el contexto, es decir acceso a recursos, base de datos, etc */
    private val dbHelper = DatabaseHelper(context)

    fun addData(
        Nombre: String,
        Apellidos: String,
        Direccion: String,
        CP: Int,
        Ciudad: String,
        Provincia: String,
        Telefono: Int
    ) {
        val db = dbHelper.writableDatabase   //usamos el método par //escribir en la bbdd

        val values = ContentValues().apply {
            put(DatabaseHelper.COLUMN_NOMBRE, Nombre)
            put(DatabaseHelper.COLUMN_APELLIDOS, Apellidos)
            put(DatabaseHelper.COLUMN_DIRECCION, Direccion)
            put(DatabaseHelper.COLUMN_CODIGOPOSTAL, CP)
            put(DatabaseHelper.COLUMN_CIUDAD, Ciudad)
            put(DatabaseHelper.COLUMN_PROVINCIA, Provincia)
            put(DatabaseHelper.COLUMN_TELEFONO, Telefono)
        } // val
        db.insert(DatabaseHelper.TABLE_NAME, null, values)
        db.close()
    } // fun

    //rawQuery crea una consulta y la devuelve en un cursor
    fun getAllData(context: Context): String {
        val db = dbHelper.readableDatabase
        val cursor = db.rawQuery("SELECT * FROM ${DatabaseHelper.TABLE_NAME}", null)
        val data = StringBuilder()

        while (cursor.moveToNext()) {
            val nombre = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_NOMBRE) + 0)
            val apellidos = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_APELLIDOS) + 0)
            val direccion = cursor.getInt(cursor.getColumnIndex(DatabaseHelper.COLUMN_DIRECCION) + 0)
            val codigoPostal = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_CODIGOPOSTAL) + 0)
            val ciudad = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_CIUDAD) + 0)
            val provincia = cursor.getInt(cursor.getColumnIndex(DatabaseHelper.COLUMN_PROVINCIA) + 0)
            val telefono = cursor.getInt(cursor.getColumnIndex(DatabaseHelper.COLUMN_TELEFONO) + 0)

            data.append("$nombre, ")
            data.append("$apellidos, ")
            data.append("$direccion, ")
            data.append("$codigoPostal, ")
            data.append("$ciudad, ")
            data.append("$provincia, ")
            data.append("$telefono ")
            data.append("\n")
        } // while

        cursor.close()
        db.close()

        if (data.isEmpty()) {
            return "No hay datos en la base de datos"
        } // if

        return data.toString()
    } // fun

    fun getData(context: Context) :Array<String?> {
        val dbR = dbHelper.readableDatabase
        val cursor = dbR.rawQuery("SELECT * FROM ${DatabaseHelper.TABLE_NAME}", null)
        val values: Array<String?> = arrayOfNulls(7)
        while (cursor.moveToNext()) {
            values[0] = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_NOMBRE) + 0)
            values[1] = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_APELLIDOS) + 0)
            values[2] = cursor.getInt(cursor.getColumnIndex(DatabaseHelper.COLUMN_DIRECCION) + 0).toString()
            values[3] = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_CODIGOPOSTAL) + 0)
            values[4] = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_CIUDAD) + 0)
            values[5] =cursor.getInt(cursor.getColumnIndex(DatabaseHelper.COLUMN_PROVINCIA) + 0).toString()
            values[6] = cursor.getInt(cursor.getColumnIndex(DatabaseHelper.COLUMN_TELEFONO) + 0).toString()
        } // while

        dbR.close()
        cursor.close()

        return values
    } // fun

    fun eliminateData(id: Int) {
        val db = dbHelper.writableDatabase
        db.delete(DatabaseHelper.TABLE_NAME, "_id=$id", null)
    } // fun

    fun modifyData(id: Int, nombre : String, apellidos : String, direccion : String, codigoPostal : Int, ciudad : String, provincia : String, telefono : Int) {

        val dbW = dbHelper.writableDatabase
        val values = ContentValues()

        values.put(DatabaseHelper.COLUMN_NOMBRE, nombre)
        values.put(DatabaseHelper.COLUMN_APELLIDOS, apellidos)
        values.put(DatabaseHelper.COLUMN_DIRECCION, direccion)
        values.put(DatabaseHelper.COLUMN_CODIGOPOSTAL, codigoPostal)
        values.put(DatabaseHelper.COLUMN_CIUDAD, ciudad)
        values.put(DatabaseHelper.COLUMN_PROVINCIA, provincia)
        values.put(DatabaseHelper.COLUMN_TELEFONO, telefono)

        dbW.update(DatabaseHelper.TABLE_NAME, values, "_id=$id", null);
    } // fun

} // class
