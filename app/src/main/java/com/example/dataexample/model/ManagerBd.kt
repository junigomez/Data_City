package com.example.dataexample.model

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase

data class ManagerBd(val context: Context){
    lateinit var bd: SQLiteDatabase //METODOS DE LA BASE DE DATOS
    val bdhelper = BdHelper(context)

    fun openBDWr() {
        bd = bdhelper.writableDatabase
    }

    fun openBdRd(){
        bd = bdhelper.readableDatabase
    }
    fun insertData(codigo: String, ciudad: String): Long {
        //paso 1. abrir base de datos en modo escritura

        openBDWr()
        //paso2: crear un contenedor de valores para insertar los datos

        val values = ContentValues()
        values.put("cod", codigo)
        values.put("nombre", ciudad)

        val resul = bd.insert("ciudad", null, values)
        return resul

    }

}