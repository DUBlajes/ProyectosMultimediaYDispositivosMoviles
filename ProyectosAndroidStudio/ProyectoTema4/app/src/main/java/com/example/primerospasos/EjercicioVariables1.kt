package com.example.primerospasos

fun main() {
    //definicion de variables
    var valor1: Int
    var valor2: Int
    var resultado: Int
    //asignacion de valores
    valor1 = 100
    valor2 = 400
    resultado = valor1 + valor2
    //imprimir por pantalla
    println("La suma de $valor1 + $valor2 es $resultado")
    resultado = valor1 * valor2
    println("El producto de $valor1 * $valor2 es $resultado")
    println ("el producto de "+ valor1+ " es "+ valor2 + " de "+ resultado)


    //el mismo ejemplo sin crear los tipos de variables
    println("difereniendo el resultado")
    var valor3 = 100
    var valor4 = 400
    var resultado1 = valor3 + valor4
    println("La suma de $valor3 + $valor4 es $resultado1")
    resultado = valor3 * valor4
    println("El producto de $valor3 * $valor4 es $resultado1")


}