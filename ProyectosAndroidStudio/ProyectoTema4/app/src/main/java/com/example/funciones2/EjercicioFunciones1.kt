package com.example.funciones2

fun presentacion() {
    println("Bienvenido al programa de suma")
}

fun sumaDosValores(a: Int, b: Int): Int {
    return a + b
}

fun despedida() {
    println("Gracias por usar el programa. Hasta luego.")
}

fun main() {
    presentacion()
    print("Ingrese el primer valor: ")
    val valor1 = readLine()?.toIntOrNull() ?: 0
    print("Ingrese el segundo valor: ")
    val valor2 = readLine()?.toIntOrNull() ?: 0

    val resultado = sumaDosValores(valor1, valor2)

    println("La suma de $valor1 y $valor2 es: $resultado")
    despedida()
}
