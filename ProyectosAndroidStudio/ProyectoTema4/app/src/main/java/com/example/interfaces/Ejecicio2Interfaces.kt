package com.example.interfaces

// ejercicio añadiendo televisor y movil
// Definición de la interfaz Electronico
interface Electronico {
    // Propiedades de la interfaz
    var nombre: String
    var fabricante: String
    var precio: Double

    // Métodos de la interfaz
    fun encender()
    fun apagar()
}

// Clase que implementa la interfaz Electronico
class Movil(
    override var nombre: String,
    override var fabricante: String,
    override var precio: Double
) : Electronico {
    // Implementación de los métodos encender() y apagar()
    override fun encender() {
        println("Encendiendo el movil $nombre fabricado por $fabricante.")
    }

    override fun apagar() {
        println("Apagando el movil $nombre.")
    }
}



// Clase que implementa la interfaz Electronico
class Tv(
    override var nombre: String,
    override var fabricante: String,
    override var precio: Double
) : Electronico {
    // Implementación de los métodos encender() y apagar()
    override fun encender() {
        println("Encendiendo el televisor $nombre fabricado por $fabricante.")
    }

    override fun apagar() {
        println("Apagando el televisor $nombre.")
    }
}

// crear  clase portatil que hereda de la interfaz electronico

class Portatil(
    override var nombre: String,
    override var fabricante: String,
    override var precio: Double
) : Electronico {
    // Implementación de los métodos encender() y apagar()
    override fun encender() {
        println("Encendiendo el movil $nombre fabricado por $fabricante.")
    }

    override fun apagar() {
        println("Apagando el movilr $nombre.")
    }
}

fun main() {
    // Crear una instancia de la clase Tv
    var miTelevisor = Tv("Smart TV", "Samsung", 799.99)
    var miMovil= Movil("XIAOMI 3025","XIAOMI",599.99)
    val miPortatil=Portatil("Leonovo 2300","Lenovo",1200.99)
    // Acceder a las propiedades y métodos de la interfaz

    println("Nombre: ${miTelevisor.nombre}")
    println("Fabricante: ${miTelevisor.fabricante}")
    println("Precio: ${miTelevisor.precio} €")

    // Acceder a las propiedades y métodos de la interfaz
    println("Nombre: ${miMovil.nombre}")
    println("Fabricante: ${miMovil.fabricante}")
    println("Precio: ${miMovil.precio} €")

    //acceder  las propiedades y metodos de la intefaz
    println("Nombre: ${miPortatil.nombre}")
    println("Fabricante: ${miPortatil.fabricante}")
    println("Precio: ${miPortatil.precio} €")


    // Llamar a los métodos encender() y apagar()
    miTelevisor.encender()
    miTelevisor.apagar()
    // llamar a los métodos encender() y apagar()

    miMovil.encender()
    miMovil.apagar()

    miPortatil.encender()
    miPortatil.apagar()

}
