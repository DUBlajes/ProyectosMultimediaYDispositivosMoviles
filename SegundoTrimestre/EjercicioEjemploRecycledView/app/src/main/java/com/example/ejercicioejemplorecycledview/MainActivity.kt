package com.example.ejercicioejemplorecycledview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectorecycled.PersonAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
// definiendo una variable que es un list person de la clase Person
        val personList = generarListaPersonas() //metodo que introduce
        // la lista de personas.
        // hacemos referencia al id del recycledView
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        //con linearlayoutmanager gestiona la posición de los elementos en el layout
        //tanto si es horizontal como vertical
        recyclerView.layoutManager = LinearLayoutManager(this)
        //crea una variable personAdapter le damos el valor de la clave PersonAdpater y el
        // es la lista de personas
        val personAdapter = PersonAdapter(personList)
        //añdimos a recyclerview la lista de personas
        recyclerView.adapter = personAdapter
    }

    private fun generarListaPersonas(): List<Person> {
        return listOf(
            Person("Alvaro","Guerrero",29),
            Person("Alvaro","Gomez",22),
            Person("Ignacio","",26),
            Person("Borja","Estevez",26),
            )
    }
}