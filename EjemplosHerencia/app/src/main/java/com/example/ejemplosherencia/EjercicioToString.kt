package com.example.ejemplosherencia

class Producto(val nombre:String, val precio:Double){
    //Sobreescribir la funcion toString para personalizar la representaci'on en cadena del objeto
    override fun toString():String{
        return "Producto(nombre: '$nombre', precio:$precio)"
    }
}

fun main(){
    //Crear instancias de la clase Producto
    val producto1=Producto("Laptop",1200.0)
    val producto2=Producto("Laptop",2400.0)
    val producto3=Producto("Telefono",500.0)

    //Imprimir las representaciones en cadena de los productos
    println("Producto 1: $producto1")
    println("Producto 2: $producto2")
    println("Producto 3: $producto3")
}