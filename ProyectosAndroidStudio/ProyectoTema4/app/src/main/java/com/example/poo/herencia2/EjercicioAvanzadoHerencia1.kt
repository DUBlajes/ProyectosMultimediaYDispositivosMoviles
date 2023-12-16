package com.example.poo.herencia2

// Clase base: Vehiculo
open class Vehiculo(val marca: String, val modelo: String) {
    fun acelerar() {
        println("Acelerando el vehículo.")
    }

    fun frenar() {
        println("Frenando el vehículo.")
    }

    open fun conducir() {
        println("Conduciendo el vehículo.")
    }
}

// Clase derivada: Coche (hereda de Vehiculo)
class Coche(marca: String, modelo: String, val numeroPuertas: Int) : Vehiculo(marca, modelo) {
    fun abrirPuertas() {
        println("Abriendo las puertas del coche.")
    }

    // Sobrescribir la función conducir específicamente para un coche
    override fun conducir() {
        println("Conduciendo el coche. ¡Cuidado con las curvas!")
    }
}

// Clase derivada: Motocicleta (hereda de Vehiculo)
class Motocicleta(marca: String, modelo: String, val tipo: String) : Vehiculo(marca, modelo) {
    fun hacerCaballito() {
        println("Haciendo caballito con la motocicleta.")
    }
}

class Tractor(marca: String, modelo: String, val toneladas: String) : Vehiculo(marca, modelo) {
    fun arrastrar (){
        println("El tractor esta arrastrando")
    }

    }


fun main() {
    // Crear instancias de las clases
    val miCoche = Coche("Toyota", "Corolla", 4)
    val miMotocicleta = Motocicleta("Harley-Davidson", "Sportster", "Deportiva")

    // Llamar a métodos de la clase base
    miCoche.acelerar()
    miCoche.frenar()
    miCoche.conducir()

    println("Número de puertas del coche: ${miCoche.numeroPuertas}")

    println()

    miMotocicleta.acelerar()
    miMotocicleta.frenar()
    miMotocicleta.conducir()

    println("Tipo de motocicleta: ${miMotocicleta.tipo}")

    ///tractor
   val tractor1= Tractor("Toyota", "Corolla", "4")
   tractor1.arrastrar()
   tractor1.conducir()

}
