package com.example.poo
//Ejercicio 2 Salario
class Salario {
    lateinit var nombre: String
    // es lo mismo que usar var nombre:String="" no sirve con tipos primitivos como int
    var ingresos: Double = 0.0



    fun inicio(nombre: String, ingresos: Double) {
        this.nombre = nombre
        this.ingresos = ingresos
    }

    fun pantalla() {
        println("Nombre: $nombre  tiene una ingresos de $ingresos")
    }

    fun esMayoringresos() {
        if (ingresos >= 2000.0)
            println("Eres rico")

        else
            println("No está mal podría ser mejor")
    }
    fun complemento(): Double {
        var complemento = 0.00
        if (ingresos in 2000.0..3000.0) {
            complemento = 0.10
        } else if (ingresos > 3000.0) {
            complemento = 0.20

        } else {
            complemento = 0.05
        }

        var total =  ingresos * complemento
        var suma = ingresos + total
        var irpf = suma * 0.15
        var salarioNeto = suma - irpf

        println("Su complemento es %.2f".format(total))
        println("En total tienes $suma euros")
        println("Se te quita de irpf: $irpf, por lo que el salario neto es: $salarioNeto")
        return total

    }


}

fun main(parametro: Array<String>) {
    val Salario1: Salario
    Salario1 = Salario()
    Salario1.inicio("Cristina", 2500.0)
    Salario1.pantalla()
    Salario1.complemento()
    Salario1.esMayoringresos()
    val Salario2: Salario
    Salario2 = Salario()
    Salario2.inicio("Laura", 1000.0)
    Salario2.pantalla()
    Salario2.complemento()
    Salario2.esMayoringresos()
}