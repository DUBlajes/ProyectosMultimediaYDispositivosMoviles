package com.example.funciones2

import kotlin.random.Random





fun obtenerOpcionUsuario(): String {
    println("Elige una opción: piedra, papel o tijeras")
    return readLine()?.toLowerCase() ?: ""
}

fun obtenerOpcionComputadora(): String {
    val opciones = listOf("piedra", "papel", "tijeras")
    return opciones[Random.nextInt(opciones.size)]
}

fun determinarGanador(opcionUsuario: String, opcionComputadora: String): String {
    if (opcionUsuario == opcionComputadora) {
        return "Es un empate."
    } else if ((opcionUsuario == "piedra" && opcionComputadora == "tijeras") ||
        (opcionUsuario == "papel" && opcionComputadora == "piedra") ||
        (opcionUsuario == "tijeras" && opcionComputadora == "papel")) {
        return "¡Ganaste!"
    } else {
        return "La computadora gana. Mejor suerte la próxima vez."
    }
}

fun main() {
    val opcionUsuario = obtenerOpcionUsuario()
    val opcionComputadora = obtenerOpcionComputadora()

    println("Tu elección: $opcionUsuario")
    println("Elección de la computadora: $opcionComputadora")

    val resultado = determinarGanador(opcionUsuario, opcionComputadora)
    println(resultado)
}
