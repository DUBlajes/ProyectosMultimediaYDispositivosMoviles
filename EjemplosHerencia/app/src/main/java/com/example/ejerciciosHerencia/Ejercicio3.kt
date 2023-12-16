package com.example.ejerciciosHerencia

open class Empresa(val nombre:String, val ubicacion:String){
    open fun realizarOperacionesGenerales(){
        println("Realizando operaciones generales de la empresa")
    }
}

class Empleado(nombre:String, ubicacion:String, var cargo:String):Empresa(nombre, ubicacion){
    fun trabajar(){
        println("El empleado $nombre, con cargo de $cargo, está trabajando en la empresa")
    }
}
class Producto(nombre:String, ubicacion:String, var categoria:String):Empresa(nombre, ubicacion){
    fun producir(){
        println("El producto $nombre, que es una $categoria, está en producción")
    }
}
class Cliente(nombre:String, ubicacion:String, var tipo:String):Empresa(nombre, ubicacion){
    fun comprar(){
        println("El cliente $tipo $nombre está comprando un producto")
    }
}

fun main(){
    val e1=Empleado("Álvaro Guerrero","CENEC Malaga","Programador")
    val p1=Producto("Angry Birds","CENEC Malaga","aplicación Java")
    val c1=Cliente("Alberto Ruiz","Cenec Malaga","individual")

    e1.realizarOperacionesGenerales()
    e1.trabajar()
    println()
    p1.realizarOperacionesGenerales()
    p1.producir()
    println()
    c1.realizarOperacionesGenerales()
    c1.comprar()
}