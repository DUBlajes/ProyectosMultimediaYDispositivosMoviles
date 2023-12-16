package com.example.poo

import com.example.poo.Puntos

class PuntosDecimales {
    var nombre: String = ""
    var asignatura: String=""
    var puntos: Double = 0.0

    fun inicio1(nombre: String, asignatura: String, puntos: Double) {
        this.nombre = nombre
        this.asignatura = asignatura
        this.puntos = puntos
    }

    fun imprimir() {
        println("Nombre: $nombre, Asignatura: $asignatura y tiene $puntos puntos")
    }

    fun puntuacion() {
        if (puntos in 0.0..4.4 )
            println("Estas suspenso $nombre")
        else if (puntos in 4.5..5.4)
            println("Tienes un suficiente $nombre")
        else if (puntos in 5.5..6.4)
            println("Tienes un bien $nombre")
        else if (puntos in 6.5..8.4)
            println("Tienes un notable $nombre")
        else if (puntos in 8.5..10.0)
            println("Tienes un sobresaliente $nombre")
        else
            println("Tu nota es erronea, debe estar entre 0 y 10 $nombre")
    }
}

fun main(parametro: Array<String>) {
    val puntos1: PuntosDecimales
    puntos1 = PuntosDecimales()
    puntos1.inicio1("Juan", "Marcas",4.8)
    puntos1.imprimir()
    puntos1.puntuacion()

    val puntos2: PuntosDecimales
    puntos2 = PuntosDecimales()
    puntos2.inicio1("Ana", "Entorno",9.2)
    puntos2.imprimir()
    puntos2.puntuacion()

}
