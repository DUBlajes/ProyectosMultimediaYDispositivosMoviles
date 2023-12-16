package com.example.poo.herencia1

// Clase base (superclase)
open class Animal(val nombre: String, val edad: Int) {
    fun hacerSonido() {
        println("El animal hace un sonido")
    }
}


// Clase derivada (subclase) que hereda de Animal
class Perro(nombre: String, edad: Int, val raza: String) : Animal(nombre, edad) {
    fun ladrar() {
        println("Guau, guau!")
    }
}


fun main() {
    // Crear una instancia de la clase derivada (Perro)
    val miPerro = Perro("Buddy", 3, "Labrador")

    // Acceder a las propiedades y métodos de la clase base (Animal)
    println("Nombre: ${miPerro.nombre}")
    println("Edad: ${miPerro.edad}")

    // Acceder a las propiedades y métodos de la clase derivada (Perro)
    println("Raza: ${miPerro.raza}")

    // Llamar a un método de la clase base
    miPerro.hacerSonido()

    // Llamar a un método de la clase derivada
    miPerro.ladrar()
}
