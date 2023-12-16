package com.example.poo.bancos

/**
 * Banco
 *
 * @constructor Create empty Banco
 */// corresponde al ejercicio 8
class Banco {
    val cliente1: Cliente = Cliente("Juan", 0f)
    var cliente2: Cliente = Cliente("Ana", 0f)
    var cliente3: Cliente = Cliente("Luis", 0f)

    /** Operar */
    fun operar() {
        cliente1.depositar(100f)
        cliente2.depositar(150f)
        cliente3.depositar(200f)
        cliente3.extraer(150f)
    }

    /** Depositos totales */
    fun depositosTotales() {
        val totalBanco = cliente1.monto + cliente2.monto + cliente3.monto
        println("El total de dinero del banco es: $totalBanco")
        cliente1.imprimir()
        cliente2.imprimir()
        cliente3.imprimir()
    }
}

/**
 * Main
 *
 * @param parametro
 */
fun main(parametro: Array<String>) {
    val banco1 = Banco()
    banco1.operar()
    banco1.depositosTotales()
}