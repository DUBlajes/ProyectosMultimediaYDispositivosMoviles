package com.example.poo
// corresponde al ejercicio 7 ejercicios de clase
class Hijos {
    val edades = IntArray(5)

    fun cargar() {
        for(i in edades.indices) {
            print("Ingrese edad:")
            edades[i] = readln().toInt()
        }
        mayorEdad()
        promedio()
    }

    fun mayorEdad() {
        var mayor = edades[0]
        for(i in edades.indices)
            if (edades[i] > mayor)
                mayor = edades[i]
        println("El hijo con mayor edad es $mayor")
    }

    fun promedio() {
        var suma = 0
        for(i in edades.indices)
            suma += edades[i]
        val promedio = suma / edades.size
        println("La edad promedio de los hijos es $promedio")
    }
}

fun main(parametros: Array<String>) {
    val hijos1 = Hijos()
    hijos1.cargar()
}