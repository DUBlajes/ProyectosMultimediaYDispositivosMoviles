package com.example.funciones2

fun calcularCuadrado(lado: Double, opcion: Int): Double {
    return when (opcion) {
        1 -> lado * 4 // Perímetro
        2 -> lado * lado // Superficie
        else -> 0.0
    }
}

fun main() {
    print("Ingrese el lado del cuadrado: ")
    val lado = readLine()?.toDoubleOrNull() ?: 0.0

    println("¿Qué desea calcular?")
    println("1. Perímetro")
    println("2. Superficie")

    val opcion = readLine()?.toIntOrNull() ?: 0

    val resultado = calcularCuadrado(lado, opcion)
    println("El resultado es: $resultado")
}
