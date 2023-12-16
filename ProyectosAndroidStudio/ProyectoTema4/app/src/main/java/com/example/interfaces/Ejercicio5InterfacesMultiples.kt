package com.example.interfaces

// Definición de la interfaz Persona
interface PersonaCliente {
    val nombre: String
    val edad: Int

    fun presentarse() {
        println("Hola, mi nombre es $nombre y tengo $edad años.")
    }
}

// Definición de la interfaz Cliente
interface Cliente {
    val numeroCliente: String

    fun realizarCompra() {

    }
}

// Clase que implementa ambas interfaces
class ClientePremium(
    override val nombre: String,
    override val edad: Int,
    override val numeroCliente: String
) : PersonaCliente, Cliente {
    // Implementación de la función presentarse de la interfaz Persona
    override fun presentarse() {
        println("Cliente $numeroCliente realizando una compra.")
        println("Soy un cliente premium.")
    }
   override fun realizarCompra(){
       println("Ha realizado su compra, Gracias")
   }

    // No es necesario implementar realizarCompra, ya que tiene una implementación por defecto en la interfaz Cliente
}

fun main() {
    // Crear una instancia de ClientePremium
    val clientePremium = ClientePremium("Carlos", 30, "12345")
    val clientePremium2 = ClientePremium("Alberto", 40, "123245")
    // Llamar a métodos de ambas interfaces y la implementación específica de la clase
    clientePremium.presentarse()
    clientePremium.realizarCompra()
    clientePremium2.presentarse()
    clientePremium2.realizarCompra()



}
