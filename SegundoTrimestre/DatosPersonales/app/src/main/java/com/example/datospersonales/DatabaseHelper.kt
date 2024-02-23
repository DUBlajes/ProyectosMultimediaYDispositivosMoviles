package com.example.datospersonales

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        private const val DATABASE_VERSION = 1
        private const val DATABASE_NAME = "Empresa.db"
        const val TABLE_NAME = "DatosPersonales"
        const val COLUMN_NOMBRE = "Nombre"
        const val COLUMN_APELLIDOS = "Apellidos"
        const val COLUMN_DIRECCION = "Direccion"
        const val COLUMN_CODIGOPOSTAL = "CP"
        const val COLUMN_CIUDAD = "Ciudad"
        const val COLUMN_PROVINCIA = "Provincia"
        const val COLUMN_TELEFONO = "Telefono"
    }

    //creamos el metodo oncreate que crea la tabla
    override fun onCreate(db: SQLiteDatabase) {
        val CREATE_TABLE = "CREATE TABLE $TABLE_NAME" +
                "($COLUMN_NOMBRE TEXT, $COLUMN_APELLIDOS TEXT," +
                " $COLUMN_DIRECCION TEXT, $COLUMN_CODIGOPOSTAL INTEGER(5), $COLUMN_CIUDAD TEXT," +
                " $COLUMN_PROVINCIA TEXT, $COLUMN_TELEFONO INTEGER)"
        db.execSQL(CREATE_TABLE)
    } // fun

    //creamos el metodo que permite eliminar la table y Volver a crearla
    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS $TABLE_NAME")
        onCreate(db)
    } // fun

} // class
