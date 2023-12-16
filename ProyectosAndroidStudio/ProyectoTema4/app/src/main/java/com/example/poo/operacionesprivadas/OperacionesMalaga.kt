package com.example.poo.operacionesprivadas

class OperacionMalaga {
    fun realizarOperaciones() {
        val operaciones = OperacionesPrivadas()
        operaciones.cargar()

        val suma = operaciones.sumar()
        val resta = operaciones.restar()

        println("Resultado de la suma: $suma")
        println("Resultado de la resta: $resta")
    }
}

fun main() {
    val operacionMalaga = OperacionMalaga()
    operacionMalaga.realizarOperaciones()
}
