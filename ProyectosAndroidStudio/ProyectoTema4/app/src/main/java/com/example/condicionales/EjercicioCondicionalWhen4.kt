package com.example.condicionales

fun main() {
    println("Ingrese un número del 1 al 8:")

    //? es para gestionar los nulos,que se pueda escribir nulos, en este caso
    // al ser un lenguaje interpretado no es necesario definir las variables, toint es para castear
    val numero: Int? = readLine()?.toInt()

    //val numero: Int? = input?.toIntOrNull()

    when (numero) {
        1 -> println("Lunes")
        2 -> println("Martes")
        3 -> println("Miércoles")
        4 -> println("Jueves")
        5 -> println("Viernes")
        6 -> println("Sábado")
        7 -> println("Domingo")
        8 -> println("el dia de Alberto")

        else -> println("Número no válido. Ingrese un número del 1 al 8.")
    }


}
