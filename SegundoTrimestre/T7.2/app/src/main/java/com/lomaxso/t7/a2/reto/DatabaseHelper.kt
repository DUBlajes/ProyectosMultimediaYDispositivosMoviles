package com.lomaxso.t7.a2.reto

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        private const val DATABASE_VERSION = 1
        private const val DATABASE_NAME = "t7act3.db"
        const val TABLE_NAME = "bicicletas"
        const val COLUMN_ID = "_id"
        const val COLUMN_MARCA = "marca"
        const val COLUMN_MODELO = "modelo"
        const val COLUMN_ANIO = "anio"
        const val COLUMN_TIPO = "tipo"
        const val COLUMN_TALLA = "talla"
        const val COLUMN_COD_FABRIC = "id_fabricante"
        const val COLUMN_COD_DEPO = "id_deposito"
    } // co

    //creamos el metodo oncreate que crea la tabla
    override fun onCreate(db: SQLiteDatabase) {
        val CREATE_TABLE = "CREATE TABLE $TABLE_NAME" +
                "($COLUMN_ID INTEGER PRIMARY KEY, $COLUMN_MARCA TEXT, $COLUMN_MODELO TEXT," +
                " $COLUMN_ANIO INTEGER(4), $COLUMN_TIPO TEXT, $COLUMN_TALLA TEXT," +
                " $COLUMN_COD_FABRIC INTEGER, $COLUMN_COD_DEPO INTEGER)"
        db.execSQL(CREATE_TABLE)
    } // fun

    //creamos el metodo que permite eliminar la table y Volver a crearla
    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS $TABLE_NAME")
        onCreate(db)
    } // fun

} // class
