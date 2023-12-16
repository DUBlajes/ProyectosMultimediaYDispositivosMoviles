package com.example.examen1ºtrimestre

import kotlin.random.Random

fun tirarDado(): Int {
    return Random.nextInt(1, 7)
}


fun jugarPartida(): String {
    val dadoJugador = tirarDado()
    val dadoMaquina = tirarDado()
    println("jugador $dadoJugador maquina $dadoMaquina")

    return when {
        dadoJugador > dadoMaquina -> "jugador"
        dadoJugador < dadoMaquina -> "máquina"
        else -> "empate"
    }
}

fun main() {
    println("Bienvenido al juego de dados")

    print("Ingresa el número de partidas que deseas jugar: ")
    val numPartidas = readLine()?.toIntOrNull() ?: 0

    var partidasJugador = 0
    var partidasMaquina = 0

    repeat(numPartidas) {
        val ganador = jugarPartida()
// println("Jugador: ${tirarDado()} vs Máquina: ${tirarDado()}. Ganador: $ganador")

        when (ganador) {
            "jugador" -> partidasJugador++
            "máquina" -> partidasMaquina++
        }
    }

    println("\nResultados:")
    println("Partidas ganadas por el jugador: $partidasJugador")
    println("Partidas ganadas por la máquina: $partidasMaquina")

    when {
        partidasJugador > partidasMaquina -> println("¡Felicidades! ¡El jugador ha ganado!")
        partidasJugador < partidasMaquina -> println("La máquina ha ganado. ¡Inténtalo de nuevo!")
        else -> println("El juego ha terminado en empate.")
    }
}