package com.example.arrays

fun main(){
    val diaSemanas: MutableList<String> = mutableListOf("LUNES", "MARTES")
    println(diaSemanas)
    diaSemanas.add("JUEVES")
    println(diaSemanas)
    diaSemanas.add(2,"MIERCOLES")
    println(diaSemanas)

   // NOMBRES

    val clientes: MutableList<String> = mutableListOf("Cristina", "Alberto")
    println(clientes)
    clientes.add("Laura")
    println(clientes)
   clientes.add(2,"Diana")
    println(clientes)


}