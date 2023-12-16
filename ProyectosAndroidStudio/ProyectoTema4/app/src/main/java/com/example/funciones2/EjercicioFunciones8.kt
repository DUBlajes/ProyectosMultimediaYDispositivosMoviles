package com.example.funciones2

fun numeroEnCastellano(numero: Int): String {
    return when (numero) {
        1 -> "Uno"
        2 -> "Dos"
        3 -> "Tres"
        4 -> "Cuatro"
        5 -> "Cinco"
        else -> "Error"
    }
}

fun main() {
    print("Ingrese un número entre 1 y 5: ")
    val numero = readLine()?.toIntOrNull() ?: 0

    val resultado = numeroEnCastellano(numero)
    println("El número en castellano es: $resultado")
}
