package com.example.dataexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.dataexample.model.ManagerBd

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //declara las cajas de texto y boton

        val editcodigo = findViewById<EditText>(R.id.editTextText)
        val editnombre = findViewById<EditText>(R.id.editTextText2)
        val btningresar = findViewById<Button>(R.id.button)

        //en el evento click del boton insertar capturo lo de las cajas de texto y las paso al metodo insert data

        btningresar.setOnClickListener {
            val codigo = editcodigo.text.toString()
            val nombre = editnombre.text.toString()

            val managerBd = ManagerBd(this)
            val resul =
                managerBd.insertData(codigo, nombre)//estoy llamando al metodo que me inserta datos a la tabla ciudad
            if (resul > 0 ){
                Toast.makeText(this, "DATOS INSERTADOS CORRECTAMENTE" + resul, Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "PROBLEMA AL INSERTAR LOS DATOS" + resul, Toast.LENGTH_SHORT).show()
            }
        }

    }
}