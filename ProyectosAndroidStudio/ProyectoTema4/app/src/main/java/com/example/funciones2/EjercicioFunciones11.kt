package com.example.funciones2

import kotlin.random.Random

// diseña el juego pidra papel o tijeras usando funciones en Kotlin

fun main() {
    // Crear una instancia de la clase Random
    val generadorAleatorio = Random

    // Generar un número aleatorio entre 1 y 10
    val numeroAleatorio = generadorAleatorio.nextInt(1, 11)

    println("Número aleatorio: $numeroAleatorio")
}
