package com.lomaxso.t7.a2.act3
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        // co
        private const val DATABASE_VERSION = 1
        private const val DATABASE_NAME = "t7act3.db"
        const val TABLE_NAME = "nombres"
        const val COLUMN_ID = "_id"
        const val COLUMN_NAME = "nombre"
        const val COLUMN_APELLIDOS = "apellidos"
        const val COLUMN_DNI = "dni"
        const val COLUMN_EDAD = "edad"
        const val COLUMN_CURSO = "curso"
    }

    //creamos el metodo oncreate que crea la tabla
    override fun onCreate(db: SQLiteDatabase) {
        val CREATE_TABLE = "CREATE TABLE $TABLE_NAME" +
                "($COLUMN_ID INTEGER PRIMARY KEY, $COLUMN_NAME TEXT, $COLUMN_APELLIDOS TEXT, $COLUMN_DNI TEXT(10)," +
                " $COLUMN_EDAD INT(3), $COLUMN_CURSO TEXT)"
        db.execSQL(CREATE_TABLE)
    } // fun
    //creamos el metodo que permite eliminar la table y Volver a crearla
    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS $TABLE_NAME")
        onCreate(db)
    } // fun
} // class
