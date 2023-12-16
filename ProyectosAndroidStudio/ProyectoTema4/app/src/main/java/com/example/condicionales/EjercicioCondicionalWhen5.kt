package com.example.condicionales

fun main() {
    println("Ingrese una nota del 0 al 10:")

    //? es para gestionar los nulos,que se pueda escribir nulos, en este caso
    // al ser un lenguaje interpretado no es necesario definir las variables, toint es para castear
    val numero: Int? = readLine()?.toInt()
    var y=11
    //val numero: Int? = input?.toIntOrNull()

    when (numero) {
        0,1,2,3,4 -> println("Suspenso")
        5 -> println("Suficiente")
        6 -> println("Bien")
        7,8 ->println("Notable")
        9,10 -> println("Sobresaliente")
        in 11..20 -> {println("la lecha de nota")
        when (y){
            11 -> println("esto es once")
            else-> println("prurba")
        }
        }

    //  7,8 -> println("Notable")
      //  9,10 -> println("Sobresaliente")
        else -> println("Número no válido. Ingrese un número del 0 al 10.")
    }


}
