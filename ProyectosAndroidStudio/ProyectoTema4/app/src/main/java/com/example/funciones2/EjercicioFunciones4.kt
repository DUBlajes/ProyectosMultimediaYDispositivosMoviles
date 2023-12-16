package com.example.funciones2

fun calcularSuperficieCuadrado(lado: Double): Double {
    return lado * lado
}

fun main() {
    print("Ingrese el lado del cuadrado: ")
    val lado = readLine()?.toDoubleOrNull() ?: 0.0

    val resultado = calcularSuperficieCuadrado(lado)
    println("La superficie del cuadrado es: $resultado")
}
