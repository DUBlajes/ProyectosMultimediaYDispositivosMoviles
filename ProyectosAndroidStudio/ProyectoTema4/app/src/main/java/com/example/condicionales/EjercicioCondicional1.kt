package com.example.condicionales
//Se ingresan por teclado 2 valores enteros. Si el primero es menor al segundo
//calcular la suma y la resta, luego mostrarlos, sino calcular el producto y la división.
fun main() {
    print("Ingrese el primer valor:")
    var valor1 = readln().toInt()
    print("Ingrese el segundo valor:")
    var valor2 = readln().toInt()
    print("dime tu nombre ")
    var nombre= readLine()
    if (valor1 < valor2) {
        var suma = valor1 + valor2
        var resta = valor1 - valor2
        println("La suma de los dos valores es: $suma")
        println("La resta de los dos valores es: $resta")
    } else {
        var producto = valor1 * valor2
        var division = valor1 / valor2
        println("El producto de los dos valores es: $producto")
        println("La división de los dos valores es: $division")
    }
}
