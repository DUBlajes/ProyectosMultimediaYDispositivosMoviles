package com.example.ejerciciosHerencia

open class Producto2(val nombre:String, val precio:Double){
    open fun mostrarDetalle(){
        println("Nombre: $nombre" +
                "\nPrecio: $precio")
    }
}
open class Envio(nombre:String, precio:Double, var destino:String):Producto2(nombre, precio){
    fun calcularCostoEnvio(){
        var coste=precio*0.10
    println("Coste del envío: $coste")
    }
    fun mostrarDetalleEnvio(){
        println("$nombre, $destino")
    }
}

class Factura(nombre: String,precio: Double,destino: String, var numeroFactura:String):Envio(nombre,precio,destino){
    fun imprimirFactura(){
        var coste=calcularCostoEnvio()
        println("Producto: $nombre, Precio: $precio, Destino: $destino, Costo de envio: $coste, Numero Factura: $numeroFactura")
    }
}
fun main(){
    val f1=Factura("Laptop",1200.0,"Malaga","F2023001")

    f1.imprimirFactura()
}