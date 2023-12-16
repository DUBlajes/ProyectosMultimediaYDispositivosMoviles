package com.example.juegodelespia
import kotlin.random.Random


// Clase base Espia
open class Espia {
    // Array para almacenar la combinación correcta
    var combinacionCorrecta: IntArray = IntArray(5)

    // Array para almacenar los intentos del jugador
    var intentos: MutableList<IntArray> = mutableListOf()

    // Constructor
    init {
        generarCombinacion()
    }

    // Función para generar la combinación aleatoria
    private fun generarCombinacion() {
        for (i in 0 until 5) {
            combinacionCorrecta[i] = Random.nextInt(0, 10)
        }
    }

    // Función para verificar la combinación
    open fun verificarCombinacion(intentoActual: IntArray): String {
        intentos.add(intentoActual)

        if (intentoActual contentEquals combinacionCorrecta) {
            return "¡Combinación correcta!"
        }

        val pistas = StringBuilder()
        for (i in 0 until 5) {
            if (intentoActual[i] < combinacionCorrecta[i]) {
                pistas.append(">")
            } else if (intentoActual[i] > combinacionCorrecta[i]) {
                pistas.append("<")
            } else {
                pistas.append("=")
            }
        }
        return pistas.toString()
    }

    // Función para obtener la representación en cadena de los intentos
    open fun obtenerIntentosString(): String {
        val sb = StringBuilder("Intentos:\n")
        for (i in intentos.indices) {
            sb.append("Intento ${i + 1}: ${intentos[i].contentToString()}\n")
        }
        return sb.toString()
    }
}

// Clase derivada Mision
class Mision : Espia {
    var oportunidadesRestantes = 4

    // Constructor
    constructor() : super()

    // Función principal del juego
    fun jugar() {
        while (oportunidadesRestantes > 0) {
            val intento = solicitarIntento()
            val pistas = verificarCombinacion(intento)
            println("Pistas: $pistas")

            if (pistas == "¡Combinación correcta!") {
                println("¡Has tenido éxito en la misión!")
                return
            }

            oportunidadesRestantes--
        }

        // Si llega aquí, el jugador ha perdido
        println("¡Alarma activada! La SS está en camino. Misión fallida.")
        println(obtenerIntentosString())
    }

    // Función para solicitar un intento al jugador
    private fun solicitarIntento(): IntArray {
        println("Ingresa tu intento (5 números del 0 al 9, separados por espacios):")
        val input = readLine()
        val numeros = input?.split(" ")?.map { it.toIntOrNull() }
        return numeros?.filterNotNull()?.toIntArray() ?: IntArray(5)
    }

    // Sobrescribir la función verificarCombinacion de la clase base
    override fun verificarCombinacion(intentoActual: IntArray): String {
        return super.verificarCombinacion(intentoActual)
    }

    // Sobrescribir la función obtenerIntentosString de la clase base
    override fun obtenerIntentosString(): String {
        return super.obtenerIntentosString()
    }
}

// Función principal main
fun main() {
    val mision = Mision()
    mision.jugar()
}
