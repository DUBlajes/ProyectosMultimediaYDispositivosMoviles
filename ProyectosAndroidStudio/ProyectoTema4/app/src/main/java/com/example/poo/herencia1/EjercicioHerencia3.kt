package com.example.poo.herencia1

// Clase base para representar un cliente genérico
open class Cliente(val nombre: String, val correo: String) {
    open fun realizarCompra() {
        println("$nombre realiza una compra genérica.")
    }
}

// Clase derivada para representar un cliente premium, hereda de Cliente
class ClientePremium(nombre: String, correo: String, val nivel: Int)
    : Cliente(nombre, correo) {
    override fun realizarCompra() {
        println("$nombre realiza una compra como cliente premium (Nivel $nivel).")
    }

    fun accesoVIP() {
        println("$nombre tiene acceso VIP a eventos exclusivos.")
    }
}

fun main() {
    // Crear instancias de las clases
    val clienteRegular = Cliente("Juan", "juan@example.com")
    val clienteVip = ClientePremium("Maria", "maria@example.com", 3)

    // Acceder a las propiedades y métodos de la clase base y las clases derivadas
    clienteRegular.realizarCompra()
    clienteVip.realizarCompra()
    clienteVip.accesoVIP()
}
