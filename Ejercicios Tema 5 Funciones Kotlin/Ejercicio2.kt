package com.example.ejerciciosfunciones

fun mostrarMensaje(mensaje: String) {
    println("*************************************************")
    println(mensaje)
    println("*************************************************")
}

fun main(parametro: Array<String>) {
    mostrarMensaje("El programa calcula la suma de dos valores ingresados por teclado.")
    cargarSumar()
    mostrarMensaje("Gracias por utilizar este programa")
}
