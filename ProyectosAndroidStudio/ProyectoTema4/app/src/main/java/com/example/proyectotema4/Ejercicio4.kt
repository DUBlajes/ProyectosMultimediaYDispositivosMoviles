package com.example.proyectotema4

fun suma(a: Int, b: Int): Int {
    return a + b;
}

fun main() {
    var nombre = "Alberto"
    var num1: Float = 10.0f
    var num2: Float = 20.0f
    var total: Float = num1 + num2
    println("¡Hola, $nombre, $total")
    println("hola " + total)
    println("la suma es " + suma(2, 3))
    // podemos poner mas codigo

    for (a in 0 until 10) {
        // El código que deseas ejecutar en cada iteración del bucle va aquí
        println(a)
    }
}
