package com.example.poo.herencia2

/**
 * Producto almacen
 *
 * @constructor Create empty Producto almacen
 * @property nombre
 * @property precio
 */// Clase base: Producto
open class ProductoAlmacen(val nombre: String, val precio: Double) {
    /** Mostrar detalle */
    fun mostrarDetalle() {
        println("Producto: $nombre, Precio: $precio")
    }
}

/**
 * Envio
 *
 * @param nombre
 * @param precio
 * @constructor
 * @property destino
 */// Clase intermedia: Envio
open class Envio(nombre: String, precio: Double, val destino: String) : ProductoAlmacen(nombre, precio) {
    /**
     * Calcular costo envio
     *
     * @return
     */
    fun calcularCostoEnvio(): Double {
        // Supongamos que el costo de envío es un 10% del precio del producto
        return precio * 0.1
    }

    /** Mostrar detalle envio */
    fun mostrarDetalleEnvio() {
        mostrarDetalle()
        println("Destino: $destino, Costo de Envío: ${calcularCostoEnvio()}")
    }
}

/**
 * Factura
 *
 * @param nombre
 * @param precio
 * @param destino
 * @constructor
 * @property numeroFactura
 */// Clase derivada: Factura
class Factura(nombre: String, precio: Double, destino: String, val numeroFactura: String)
    : Envio(nombre, precio, destino) {
    /** Imprimir factura */
    fun imprimirFactura() {
        mostrarDetalleEnvio()
        println("Número de Factura: $numeroFactura")
    }
}

/** Main */
fun main() {
    // Crear instancia de Factura y mostrar información
    val factura = Factura("Laptop", 1200.0, "Ciudad A", "F2023001")
    factura.imprimirFactura()
}
