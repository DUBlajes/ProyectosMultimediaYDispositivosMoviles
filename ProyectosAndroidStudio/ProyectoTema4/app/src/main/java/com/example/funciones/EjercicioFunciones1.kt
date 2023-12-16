package com.example.funciones
fun sumar(a: Int, b: Int): Int {
    var resultado = a + b
    return resultado
}
fun restar(a: Int, b:Int) : Int{
    var resultado= a - b
    return resultado


}

fun main() {
    print("Indícame un número: ")
    var numero1 = readLine()?.toIntOrNull() ?: 0 // Convierte la cadena a un entero o usa 0 si no se puede convertir
    print("Indícame otro número: ")
    var numero2 = readLine()?.toIntOrNull() ?: 0 // Convierte la cadena a un entero o usa 0 si no se puede convertir
    var resultado = sumar(numero1, numero2)
    var resultado2=restar(numero1, numero2)
    println("La suma es $resultado")
    println("la resta es $resultado2")
}
