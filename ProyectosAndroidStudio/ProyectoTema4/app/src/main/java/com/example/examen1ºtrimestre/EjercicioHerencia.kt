package com.example.examen1ºtrimestre

// Clase base: Alimento
open class Alimento(val nombre: String, val calorias: Int) {
    open fun mostrarDetalles() {
        println("Alimento: $nombre, Calorías: $calorias")
    }
}

// Clase derivada: Fruta
class Fruta(nombre: String, calorias: Int, val tipo: String, val vitaminas: String) : Alimento(nombre, calorias) {
    override fun mostrarDetalles() {
        super.mostrarDetalles()
        println("Tipo de fruta: $tipo, Vitaminas: $vitaminas")
    }
}

// Clase derivada: Carne
class Carne(nombre: String, calorias: Int, val tipoAnimal: String, val proteinas: String) : Alimento(nombre, calorias) {
    override fun mostrarDetalles() {
        super.mostrarDetalles()
        println("Tipo de animal: $tipoAnimal, Proteínas: $proteinas")
    }
}

fun main() {
    // Crear instancias de las clases
    val manzana = Fruta("Manzana", 50, "Fruta fresca", "Vitamina C")
    val pollo = Carne("Pollo", 150, "Ave", "20g de proteínas")

    // Llamar a métodos de las clases
    manzana.mostrarDetalles()
    println()
    pollo.mostrarDetalles()
}
