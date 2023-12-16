package com.example.poo.herencia2

// Clase base: ProductoInformatico
open class ProductoInformatico(val nombre: String, val precio: Double) {
    fun encender() {
        println("$nombre encendido.")
    }

    fun apagar() {
        println("$nombre apagado.")
    }

    open fun ejecutar() {
        println("$nombre ejecutando operaciones generales.")
    }
}

// Clase derivada: Laptop (hereda de ProductoInformatico)
class Laptop(nombre: String, precio: Double, val marca: String) : ProductoInformatico(nombre, precio) {
    fun transportar() {
        println("$nombre es portátil y fácil de transportar.")
    }

    // Sobrescribir la función ejecutar específicamente para una laptop
    override fun ejecutar() {
        println("$nombre ejecutando aplicaciones y tareas de computación.")
    }
}

// Clase derivada: Impresora (hereda de ProductoInformatico)
class Impresora(nombre: String, precio: Double, val tipo: String) : ProductoInformatico(nombre, precio) {
    fun imprimir() {
        println("$nombre imprimiendo documentos.")
    }
}

fun main() {
    // Crear instancias de las clases
    val miLaptop = Laptop("HP Envy", 1200.0, "HP")
    val miImpresora = Impresora("Epson EcoTank", 300.0, "Inyección de tinta")

    // Llamar a métodos de la clase base
    miLaptop.encender()
    miLaptop.apagar()
    miLaptop.ejecutar()

    println("Marca de la laptop: ${miLaptop.marca}")

    println()

    miImpresora.encender()
    miImpresora.apagar()
    miImpresora.ejecutar()

    println("Tipo de impresora: ${miImpresora.tipo}")
}
