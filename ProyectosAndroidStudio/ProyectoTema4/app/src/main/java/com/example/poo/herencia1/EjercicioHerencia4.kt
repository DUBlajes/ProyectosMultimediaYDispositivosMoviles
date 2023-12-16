package com.example.poo.herencia1

class Producto(val nombre: String, val precio: Double) {
    // Sobrescribir la función toString para personalizar la representación en cadena del objeto
    override fun toString(): String {
        return "Producto(nombre='$nombre', precio=$precio)"
    }

    // Sobrescribir la función hashCode para proporcionar un valor único para el objeto
    override fun hashCode(): Int {
        return nombre.hashCode() + precio.hashCode()
    }

    // Sobrescribir la función equals para comparar objetos basándose en sus propiedades
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Producto) return false

        return this.nombre == other.nombre && this.precio == other.precio
    }
}

fun main() {
    // Crear instancias de la clase Producto
    val producto1 = Producto("Laptop", 1200.0)
    val producto2 = Producto("Laptop", 1200.0)
    val producto3 = Producto("Teléfono", 500.0)

    // Imprimir las representaciones en cadena de los productos
    println("Producto 1: $producto1")
    println("Producto 2: $producto2")
    println("Producto 3: $producto3")

    // Comparar productos utilizando equals
    println("producto1 es igual a producto2: ${producto1 == producto2}")
    println("producto1 es igual a producto3: ${producto1 == producto3}")

    // Obtener códigos hash de los productos
    println("HashCode de producto1: ${producto1.hashCode()}")
    println("HashCode de producto2: ${producto2.hashCode()}")
    println("HashCode de producto3: ${producto3.hashCode()}")
}
