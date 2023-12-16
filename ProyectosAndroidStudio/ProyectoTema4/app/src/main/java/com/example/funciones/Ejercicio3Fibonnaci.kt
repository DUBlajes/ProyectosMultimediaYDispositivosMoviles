package com.example.funciones

fun fibonacciRecursivo(n: Int): Int {
    return if (n <= 1) {
        n
    } else {
        fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2)
    }
}

fun main() {
    print("Ingresa un número para calcular el término en la secuencia de Fibonacci: ")
    val numero = readLine()?.toIntOrNull() ?: 0

    if (numero >= 0) {
        val resultado = fibonacciRecursivo(numero)
        println("El término en la posición $numero de la secuencia de Fibonacci es $resultado")
    } else {
        println("Por favor, ingresa un número no negativo.")
    }
}
