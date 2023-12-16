package com.example.poo.bancos

/**
 * Cliente
 *
 * @constructor Create empty Cliente
 * @property nombre
 * @property monto
 */
class Cliente(var nombre: String, var monto: Float) {

    /**
     * Depositar
     *
     * @param monto
     */
    fun depositar(monto: Float) {
        this.monto += monto
    }

    /**
     * Extraer
     *
     * @param monto
     */
    fun extraer(monto: Float) {
        this.monto -= monto
    }

    /** Imprimir */
    fun imprimir() {
        println("$nombre tiene depositado la suma de $monto")
    }
}

