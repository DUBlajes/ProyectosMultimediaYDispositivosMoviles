package com.example.poo
//Ejercicio 1 Persona
class Persona {
    var nombre: String = ""
    var edad: Int = 0
    var apellidos: String=""
    var direccion: String=""
    var ciudad: String=""
    var provincia: String=""
    var cp: Int=0
//vendria a ser como un constructor pero no lo es
    fun inicializar(nombre: String, apellidos: String, edad: Int, direccion:String, ciudad:String, provincia:String, cp:Int ) {
        this.nombre = nombre
        this.apellidos=apellidos
        this.edad = edad
        this.direccion = direccion
        this.ciudad = ciudad
        this.provincia = provincia
        this.cp = cp
    }
    fun imprimir() {
        println("Nombre y apellidos: $nombre $apellidos y tiene una edad de $edad. Vive en $direccion en $ciudad, $provincia, con cp: $cp")
    }
    fun esMayorEdad() {
        if (edad >= 18)
            println("Es mayor de edad $nombre $apellidos")
        else
            println("No es mayor de edad $nombre $apellidos")
    }
}
fun main() {
    val persona1: Persona
    persona1 = Persona()
    persona1.inicializar ("Juan", "Gomez Lobato", 12,"calle Almeria", "Almeria City", "Almeria", 29000)
    persona1.imprimir()
    persona1.esMayorEdad()
    val persona2: Persona
    persona2 = Persona()
    persona2.inicializar("Ana", "Perez Rueda",50, "calle Lope de Rueda", "Malaga", "Malaga", 29010)
    persona2.imprimir()
    persona2.esMayorEdad()
}