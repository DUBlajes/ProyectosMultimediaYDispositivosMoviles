package com.example.poo

class Cliente ( var nombre: String,
                var apellidos: String,
                var tipo:String,
                var ingresos:Double) {
    constructor (nombre: String,
                 apellidos: String,
                 tipo: String) :
                this(nombre,apellidos,tipo,0.0)

    fun imprimir() {
      println("Nombre: $nombre, Apellidos: $apellidos, Tipo: $tipo, Ingresos: $ingresos")
    }

    fun tipo() {
        if (tipo== "Empresa")
            println("Le atiende la oficina central")
        else
            println("Le atiende la oficina local")
    }
}

fun main() {
    val Cliente1 = Cliente("Juan", "Perez", "Empresa",120000.00)
    Cliente1.imprimir()
    Cliente1.tipo()
    val Cliente2 = Cliente("Luisa", "Lopez", "Sociedad")
    Cliente2.imprimir()
    Cliente2.tipo()
}