package com.lomaxso.t7.a2.reto

import android.content.ContentValues
import android.content.Context

class DataManager(context: Context) {
    /*creamos una instancia de DatabaseHelper y le añadimos el contexto, es decir acceso a recursos, base de datos, etc */
    private val dbHelper = DatabaseHelper(context)

    fun addData(
        marca: String,
        modelo: String,
        anio: Int,
        tipo: String,
        talla: String,
        codFabric: Int,
        codDepo: Int
    ) {
        val db = dbHelper.writableDatabase   //usamos el método par //escribir en la bbdd

        val values = ContentValues().apply {
            put(DatabaseHelper.COLUMN_MARCA, marca)
            put(DatabaseHelper.COLUMN_MODELO, modelo)
            put(DatabaseHelper.COLUMN_ANIO, anio)
            put(DatabaseHelper.COLUMN_TIPO, tipo)
            put(DatabaseHelper.COLUMN_TALLA, talla)
            put(DatabaseHelper.COLUMN_COD_FABRIC, codFabric)
            put(DatabaseHelper.COLUMN_COD_DEPO, codDepo)
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
            val marca = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_MARCA) + 0)
            val modelo = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_MODELO) + 0)
            val anio = cursor.getInt(cursor.getColumnIndex(DatabaseHelper.COLUMN_ANIO) + 0)
            val tipo = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_TIPO) + 0)
            val talla = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_TALLA) + 0)
            val codFabric = cursor.getInt(cursor.getColumnIndex(DatabaseHelper.COLUMN_COD_FABRIC) + 0)
            val codDepo = cursor.getInt(cursor.getColumnIndex(DatabaseHelper.COLUMN_COD_DEPO) + 0)

            data.append("$marca, ")
            data.append("$modelo, ")
            data.append("$anio, ")
            data.append("$tipo, ")
            data.append("$talla, ")
            data.append("$codFabric, ")
            data.append("$codDepo ")
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
            values[0] = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_MARCA) + 0)
            values[1] = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_MODELO) + 0)
            values[2] = cursor.getInt(cursor.getColumnIndex(DatabaseHelper.COLUMN_ANIO) + 0).toString()
            values[3] = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_TIPO) + 0)
            values[4] = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_TALLA) + 0)
            values[5] =cursor.getInt(cursor.getColumnIndex(DatabaseHelper.COLUMN_COD_FABRIC) + 0).toString()
            values[6] = cursor.getInt(cursor.getColumnIndex(DatabaseHelper.COLUMN_COD_DEPO) + 0).toString()
        } // while

        dbR.close()
        cursor.close()

        return values
    } // fun

    fun eliminateData(id: Int) {
        val db = dbHelper.writableDatabase
        db.delete(DatabaseHelper.TABLE_NAME, "_id=$id", null)
    } // fun

    fun modifyData(id: Int, marca : String, modelo : String, anio : Int, tipo : String, talla : String, codFabric : Int, codDepo : Int) {

        val dbW = dbHelper.writableDatabase
        val values = ContentValues()

        values.put(DatabaseHelper.COLUMN_MARCA, marca)
        values.put(DatabaseHelper.COLUMN_MODELO, modelo)
        values.put(DatabaseHelper.COLUMN_ANIO, anio)
        values.put(DatabaseHelper.COLUMN_TIPO, tipo)
        values.put(DatabaseHelper.COLUMN_TALLA, talla)
        values.put(DatabaseHelper.COLUMN_COD_FABRIC, codFabric)
        values.put(DatabaseHelper.COLUMN_COD_DEPO, codDepo)

        dbW.update(DatabaseHelper.TABLE_NAME, values, "_id=$id", null);
    } // fun

} // class
