package com.example.funciones2

fun obtenElMayor(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun main() {
    print("Ingrese el primer número: ")
    val numero1 = readLine()?.toIntOrNull() ?: 0
    print("Ingrese el segundo número: ")
    val numero2 = readLine()?.toIntOrNull() ?: 0

    val mayor = obtenElMayor(numero1, numero2)
    println("El número mayor es: $mayor")
}
