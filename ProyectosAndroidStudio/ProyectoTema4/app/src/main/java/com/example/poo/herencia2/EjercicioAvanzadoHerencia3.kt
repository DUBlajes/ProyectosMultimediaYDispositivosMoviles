package com.example.poo.herencia2

// Clase base: Empresa
open class Empresa(val nombre: String, val ubicacion: String) {
    fun realizarOperacionesGenerales() {
        println("Realizando operaciones generales de la empresa $nombre.")
    }
}

// Clase derivada: Empleado (hereda de Empresa)
class Empleado(nombre: String, ubicacion: String, val puesto: String) : Empresa(nombre, ubicacion) {
    fun trabajar() {
        println("$nombre, empleado como $puesto, trabajando en la empresa.")
    }
}

// Clase derivada: Producto (hereda de Empresa)
class Producto(nombre: String, ubicacion: String, val categoria: String) : Empresa(nombre, ubicacion) {
    fun producir() {
        println("$nombre, producto de la categoría $categoria, en producción.")
    }
}

// Clase derivada: Cliente (hereda de Empresa)
class Cliente(nombre: String, ubicacion: String, val tipo: String) : Empresa(nombre, ubicacion) {
    fun comprar() {
        println("$nombre, cliente de tipo $tipo, realizando una compra.")
    }
}

fun main() {
    // Crear instancias de las clases derivadas
    val empleado1 = Empleado("Laura Delgado", "Oficina Parque tecnológico", "Desarrollador")
    val producto1 = Producto("PortaTIL HP OMNIO", "Almacén B", "Electrónica")
    val cliente1 = Cliente("Microsoft", "Tienda Plaza Mayor", "Empresarial")

    // Llamar a métodos de la clase base y de las clases derivadas
    empleado1.realizarOperacionesGenerales()
    empleado1.trabajar()

    println()

    producto1.realizarOperacionesGenerales()
    producto1.producir()

    println()

    cliente1.realizarOperacionesGenerales()
    cliente1.comprar()
}
