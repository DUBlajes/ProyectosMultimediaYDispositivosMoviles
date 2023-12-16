package com.example.poo.herencia1

class ProductComputer(val nombre: String, val precio: Double) {

    // Sobrescribir la función toString para personalizar la representación en cadena del objeto
    override fun toString(): String {
        return "Producto(nombre='$nombre', precio=$precio)"
    }

    // Sobrescribir la función hashCode para proporcionar un valor único para el objeto
    override fun hashCode(): Int {
        return nombre.hashCode() + precio.hashCode()
    }
}

fun main() {
    // Crear instancias de la clase Producto
    val producto1 = ProductComputer("Laptop", 1200.0)
    val producto2 = ProductComputer("Laptop", 1200.0)
    val producto3 = ProductComputer("Teléfono", 500.0)

    // Imprimir las representaciones en cadena de los productos
    println("Producto 1: $producto1")
    println("Producto 2: $producto2")
    println("Producto 3: $producto3")
    // Obtener códigos hash de los productos
    println("HashCode de producto1: ${producto1.hashCode()}")
    println("HashCode de producto2: ${producto2.hashCode()}")
    println("HashCode de producto3: ${producto3.hashCode()}")

    if (producto1.hashCode()==producto2.hashCode()){
        println("iguales")
    } else{
        println("diferentes")
    }
    // Resto del código de prueba (comparaciones y códigos hash)
}
