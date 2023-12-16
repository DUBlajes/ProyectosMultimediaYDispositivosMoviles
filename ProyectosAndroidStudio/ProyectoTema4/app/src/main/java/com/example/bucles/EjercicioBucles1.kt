package com.example.bucles

fun main() {
    // suma de 2 en 2
    for (a in 0..10 step 2){
            println(a)
    }
    // suma de 2 en 2
    for (b in 10 downTo 0 step 2){
        println(b)
    }







    println("Tabla de multiplicar del 5 usando bucle for:")
    for (i in 1..10) {
        val resultado = 5 * i
        println("5 * $i = $resultado")
    }



}


