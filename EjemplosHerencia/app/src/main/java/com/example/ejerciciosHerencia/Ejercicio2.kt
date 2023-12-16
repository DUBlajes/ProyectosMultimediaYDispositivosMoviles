package com.example.ejerciciosHerencia

open class ProductoInformatico(var nombre:String, var precio:Double){
    open fun encender(){
        println("Encendiendo dispositivo")
    }
    open fun apagar(){
        println("Apagando dispositivo")
    }
    open fun ejecutar(){
        println("Ejecutando tareas")
    }
}

class Laptop(nombre:String, precio:Double, var marca:String):ProductoInformatico(nombre,precio){
    override fun ejecutar(){
        println("El portátil $marca está ejecutando tareas")
    }
}
class Impresora(nombre:String, precio:Double, var tipo:String):ProductoInformatico(nombre,precio){
    fun imprimir(){
        println("La impresora $nombre de $tipo está imprimiendo...")
    }
}

fun main(){
    val portatil=Laptop("Portátil",650.0,"ASUS Fn380")

    val impresora=Impresora("Lenovo HT500R",300.0,"láser")

    portatil.encender()
    portatil.ejecutar()
    portatil.apagar()
    println()
    impresora.encender()
    impresora.imprimir()
    impresora.apagar()
}