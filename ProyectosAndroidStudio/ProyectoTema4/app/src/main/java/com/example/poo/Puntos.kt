package com.example.poo
//Ejercicio 3 reformar este ejercicio para que me 
class Puntos {
    var nombre: String = ""
    var asignatura: String=""
    var puntos: Int = 0

    fun inicio1(nombre: String, asignatura: String, puntos: Int) {
        this.nombre = nombre
        this.asignatura=asignatura
        this.puntos = puntos
    }

    fun imprimir() {
        println("Nombre: $nombre, Asignatura: $asignatura y tiene $puntos puntos")
    }

    fun puntuacion() {
        if (puntos in 0..4 )
            println("Estas suspenso $nombre")
        else if (puntos == 5)
            println("Tienes un suficiente $nombre")
        else if (puntos == 6)
            println("Tienes un bien $nombre")
        else if (puntos in 7..8)
            println("Tienes un notable $nombre")
        else if (puntos in 9..10)
            println("Tienes un sobresaliente $nombre")
        else
            println("Tu nota es erronea, debe estar entre 0 y 10 $nombre")
    }
}

fun main(parametro: Array<String>) {
    val puntos1: Puntos
    puntos1 = Puntos()
    puntos1.inicio1("Juan", "Marcas",4)
    puntos1.imprimir()
    puntos1.puntuacion()

    val puntos2: Puntos
    puntos2 = Puntos()
    puntos2.inicio1("Ana", "Entorno",10)
    puntos2.imprimir()
    puntos2.puntuacion()
  
}