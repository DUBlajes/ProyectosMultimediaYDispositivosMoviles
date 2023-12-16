package com.example.juegodelespia

import kotlin.random.Random

// Clase padre Espia
open class Espia2 {

    var combinacionCorrecta: IntArray = IntArray(5)

    // Genera el array con números aleatorios
    fun generarCombinacion() {
        for (i in 0 until 5) {
            combinacionCorrecta[i] = Random.nextInt(0, 10)
        }
    }

    // Verifica la combinación con la definida previamente y devuelve pistas
    open fun verificarCombinacion(intentoActual: IntArray): String {
        if (intentoActual.contentEquals(combinacionCorrecta)) {
            return "¡Combinación correcta!"
        }

        var pistas = ""

        for (i in 0 until 5) {
            if (intentoActual[i] < combinacionCorrecta[i]) {
                pistas += ">"
            } else if (intentoActual[i] > combinacionCorrecta[i]) {
                pistas += "<"
            } else {
                pistas += "="
            }
        }
        return pistas
    }
}

// Clase hija Mision
class Mision2 : Espia2() {
    var oportunidadesRestantes = 5

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
            println("Oportunidades restantes $oportunidadesRestantes")
        }

        println("¡Alarma activada! La SS está en camino. Misión fallida.")
    }

    private fun solicitarIntento(): IntArray {
        println("Ingresa tu intento (5 números del 0 al 9, separados por espacios):")
        val input = readLine()
        //split divide la cadena en substring con el delimitador que usemos que es espacio
        //mapnotnull crea un mapnotull crea un mapa de caracteres eliminando los nulos es decir
        // los espacios en blanco, aqui esamos usando la función lambda con los corchetes, it
        // hace referencia a los valores introducidos, tointornull convierte a valores enteros
        // to intarray convierte a arrays
        val numeros = input?.split(" ")?.mapNotNull { it.toIntOrNull() }?.toIntArray() ?: IntArray(5)

        // sin los espacios usariamos
        //val numeros = input?.mapNotNull { it.toString().toIntOrNull() }?.toIntArray() ?: IntArray(5)
        return numeros
    }

    override fun verificarCombinacion(intentoActual: IntArray): String {
        return super.verificarCombinacion(intentoActual)
    }
}

fun main() {
    val mision = Mision2()
    mision.generarCombinacion()
    mision.jugar()
}
