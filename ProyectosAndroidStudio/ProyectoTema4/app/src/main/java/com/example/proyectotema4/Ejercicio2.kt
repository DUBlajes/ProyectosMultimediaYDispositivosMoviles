package com.example.proyectotema4
// definimos los métodos
fun resta(a: Int, b: Int): Int {
    return a - b
}

fun multiplica(): Int {
    println("Ingrese el primer operando:")
    val entrada1 = readLine()
    println("Ingrese el segundo operando:")
    val entrada2 = readLine()

    val operador1 = entrada1?.toIntOrNull()
    val operador2 = entrada2?.toIntOrNull()

    if (operador1 != null && operador2 != null) {
        return operador1 * operador2
    } else {
        println("Entrada no válida. Asegúrate de ingresar números válidos.")
    }
    //en el que caso de que haya algún tipo de error
    return 0
}

fun division(a: Int, b: Int): Int {
    return a / b
}

fun sumar(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    var booleano: Boolean = false
    var num1: Int=3
    var num2: Int=5
    //bucle para el menu
    while (!booleano) {
        println("Indica la opción: 1 sumar, 2 restar, 3 multiplicar, 4 dividir, 5 salir")

        val entrada = readLine()
        val opcion = entrada?.toInt()
        //condicionales
        if (opcion == 1) {
            println("La suma es "+sumar(2, 3))
        } else if (opcion == 2) {
            println("La resta es "+resta(num1,num2))

        } else if (opcion == 3) {
            println("La multiplicacion es "+multiplica())

        } else if (opcion == 4) {
            println("La suma es "+division(6, 3))

        } else if (opcion == 5) {
            booleano = true
            println("Saliendo del programa.")
        } else {
            println("Opción no válida. Inténtalo de nuevo.")
        }
    }
}

