package com.example.examenpractico1trimestre

import kotlin.random.Random

fun main() {
    var opcion: Int
    //Creamos el menú para elegir si queremos jugar o salir del juego.
    do {
        println("Bienvenido al juego de Piedra, Papel o Tijeras:")
        println("Selecciona una opción: ")
        println("\t1. Jugar")
        println("\t2. Salir")


        opcion = readLine()?.toIntOrNull() ?: 0
        //En este caso, si el jugador selecciona la opción 1 se llamará a la funcion jugarPartidas(). Si elige la 2, se finalizará la ejecución del programa. Si elige otra distinta, saldrá un mensaje pidiéndole que ingrese un número válido. No podrá salir del menú hasta que no pulse la tecla 2
        when (opcion) {
            1 -> jugarPartidas()
            2 -> println("Saliendo del juego...")
            else -> println("Opción no válida. Inténtalo de nuevo.")
        }
    } while (opcion != 2)
}
//Esta función es la que ejecuta el bucle principal de juego
fun jugarPartidas() {

    println("Ingrese el número de partidas que desea jugar:")
    val numeroDePartidas = readLine()?.toIntOrNull() ?: 0

    var partidasGanadasUsuario = 0
    var partidasGanadasMaquina = 0

    for (i in 1..numeroDePartidas) {
        println("///// Partida $i /////")

        // Jugada del jugador
        val eleccionJugador = pedirEleccionJugador()

        // Generamos jugada aleatoria de la Máquina
        val eleccionesPosibles = listOf("Piedra", "Papel", "Tijeras")
        val eleccionMaquina = eleccionesPosibles.random()
        println("La Máquina eligió: $eleccionMaquina")

        // Obtenemos el ganador de la partida
        val resultadoPartida = determinarGanador(eleccionJugador, eleccionMaquina)

        // Mostramos el resultado de la partida
        println("Resultado de la partida: Gana $resultadoPartida")

        // Actualizamos el marcador
        when (resultadoPartida) {
            "Usuario" -> partidasGanadasUsuario++
            "Máquina" -> partidasGanadasMaquina++
        }
    }

    // Mostramos el resultado final
    println("///// \nResultado Final: /////")
    println("/// Partidas ganadas por el Jugador: $partidasGanadasUsuario ///")
    println("/// Partidas ganadas por la Máquina: $partidasGanadasMaquina ///")
}

fun pedirEleccionJugador(): String {
    var eleccionJugador: String
    do {
        println("Elige: " +
                "\n\t1. Piedra " +
                "\n\t2. Papel " +
                "\n\t3. Tijeras")
        eleccionJugador = when (readLine()?.toIntOrNull() ?: 0) {
            1 -> "Piedra"
            2 -> "Papel"
            3 -> "Tijeras"
            else -> ""
        }
    } while (eleccionJugador.isEmpty())

    return eleccionJugador
}

fun determinarGanador(eleccionJugador: String, eleccionMaquina: String): String {
    return when {
        eleccionJugador == eleccionMaquina -> "Empate"
        (eleccionJugador == "Piedra" && eleccionMaquina == "Tijeras") ||
                (eleccionJugador == "Papel" && eleccionMaquina == "Piedra") ||
                (eleccionJugador == "Tijeras" && eleccionMaquina == "Papel") -> "Jugador"
        else -> "Máquina"

}}