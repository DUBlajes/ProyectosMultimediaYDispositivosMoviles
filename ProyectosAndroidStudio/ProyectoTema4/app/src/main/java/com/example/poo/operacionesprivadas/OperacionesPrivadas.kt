package com.example.poo.operacionesprivadas

class OperacionesPrivadas {
    private var valor1: Int = 0
    private var valor2: Int = 0

   fun cargar() {
        print("Ingrese primer valor:")
        valor1 = readLine()?.toIntOrNull() ?: 0
        print("Ingrese segundo valor:")
        valor2 = readLine()?.toIntOrNull() ?: 0
    }

    fun sumar(): Int {
        return valor1 + valor2
    }

    fun restar(): Int {
        return valor1 - valor2
    }
}
