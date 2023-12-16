package com.example.poo
//corresponde al ejercicio 5
class Punto (val x: Int, val y: Int) {

    fun retornarCuadrante() = when {
        x > 0 && y > 0 -> "Primer cuadrate"
        x < 0 && y > 0 -> "Segundo cuadrante"
        x < 0 && y < 0 -> "Tercer cuadrante"
        x > 0 && y < 0 -> "Cuarto cuadrante"
        else -> "Un eje"
    }
}

fun main(parametro: Array<String>) {
    val punto1 = Punto(12, 3)
    println("La coordenada ${punto1.x}, ${punto1.y} se encuentra en ${punto1.retornarCuadrante()}")
    val punto2 = Punto(-4, 3)
    println("La coordenada ${punto2.x}, ${punto2.y} se encuentra en ${punto2.retornarCuadrante()}")
    val punto3 = Punto(-2, -2)
    println("La coordenada ${punto3.x}, ${punto3.y} se encuentra en ${punto3.retornarCuadrante()}")
    val punto4 = Punto(12, -5)
    println("La coordenada ${punto4.x}, ${punto4.y} se encuentra en ${punto4.retornarCuadrante()}")
    val punto5 = Punto(0, -5)
    println("La coordenada ${punto5.x}, ${punto5.y} se encuentra en ${punto5.retornarCuadrante()}")
}