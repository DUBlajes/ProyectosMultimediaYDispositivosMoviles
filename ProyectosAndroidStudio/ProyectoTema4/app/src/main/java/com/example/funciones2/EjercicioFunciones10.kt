package com.example.funciones2

fun contarMultiplos() {
    var multiplosDeDos = 0
    var multiplosDeCinco = 0

    repeat(10) {
        print("Ingrese un número: ")
        val numero = readLine()?.toIntOrNull() ?: 0

        if (numero % 2 == 0) {
            multiplosDeDos++
        }

        if (numero % 5 == 0) {
            multiplosDeCinco++
        }
    }

    println("Cantidad de múltiplos de 2: $multiplosDeDos")
    println("Cantidad de múltiplos de 5: $multiplosDeCinco")
}

fun main() {
    contarMultiplos()
}
