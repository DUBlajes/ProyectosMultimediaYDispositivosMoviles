package com.example.ejerciciosfunciones

fun retornarMayor2(v1: Int, v2: Int) = if (v1 > v2) v1 else v2

fun main(parametro: Array<String>) {
    print("Ingrese el primer valor:")
    val valor1 =readln().toInt()
    print("Ingrese el segundo valor:")
    val valor2 =readln().toInt()
    println("El mayor entre $valor1 y $valor2 es ${retornarMayor2(valor1, valor2)}")
}

