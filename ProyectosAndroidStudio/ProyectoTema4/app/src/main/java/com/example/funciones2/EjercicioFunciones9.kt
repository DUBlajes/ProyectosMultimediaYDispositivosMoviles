package com.example.funciones2

fun mostrarSubrayado(cadena: String, caracter: String = "-") {
    println(cadena)
    println(caracter.repeat(cadena.length))
}

fun main() {
    print("Ingrese una palabra: ")
    val palabra = readLine() ?: ""

    print("Ingrese el caracter para subrayar (opcional, presione Enter para omitir): ")
    val caracter = readLine() ?: ""

    mostrarSubrayado(palabra, caracter)
}
