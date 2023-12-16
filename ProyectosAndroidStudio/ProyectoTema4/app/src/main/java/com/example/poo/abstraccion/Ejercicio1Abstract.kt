package com.example.poo.abstraccion

abstract class Vehiculo(val marca: String) {
    abstract fun acelerar() // Método abstracto sin implementación
    abstract fun frenar()    // Otro método abstracto

    fun imprimirMarca() {
        println("Marca del vehículo: $marca")
    }
}

class Coche(marca: String) : Vehiculo(marca) {
    override fun acelerar() {
        println("El coche está acelerando.")
    }

    override fun frenar() {
        println("El coche está frenando.")
    }
}

fun main() {
    val miCoche = Coche("Toyota")

    miCoche.imprimirMarca()
    miCoche.acelerar()
    miCoche.frenar()
}
