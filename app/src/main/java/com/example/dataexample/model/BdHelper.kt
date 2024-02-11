package com.example.dataexample.model

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class BdHelper (
    context: Context?,
) : SQLiteOpenHelper(context, Constantes.NAME_BD, null, Constantes.VERSION_BD){

    //extender de la clase SqliteOpenHelper :
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(Constantes.TABLA)

    }

    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {
        db?.execSQL("DROP TABLE IF EXISTS ciudad")
        onCreate(db)

    }
}