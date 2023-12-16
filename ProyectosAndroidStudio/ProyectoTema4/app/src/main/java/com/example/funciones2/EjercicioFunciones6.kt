package com.example.funciones2

fun obtenerLongitudCadena(cadena: String): Int {
    return cadena.length
}

fun main() {
    print("Ingrese el primer nombre: ")
    val nombre1 = readLine() ?: ""
    print("Ingrese el segundo nombre: ")
    val nombre2 = readLine() ?: ""

    val longitud1 = obtenerLongitudCadena(nombre1)
    val longitud2 = obtenerLongitudCadena(nombre2)

    if (longitud1 > longitud2) {
        println("$nombre1 tiene más caracteres.")
    } else if (longitud2 > longitud1) {
        println("$nombre2 tiene más caracteres.")
    } else {
        println("Ambos nombres tienen la misma cantidad de caracteres.")
    }
}
