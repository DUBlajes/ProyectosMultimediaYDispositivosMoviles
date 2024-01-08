package com.example.examen1ºtrimestre

fun main() {
    val matriz = arrayOf(
        intArrayOf(1, 2, 3),
        arrayOf("Alberto", 45, "Laura"),
        floatArrayOf(700.21f, 800.23f, 900.24f)
    )

    // Mostrar Nombres
    val nombres = matriz[1] as Array<Any>
    println("Nombres: ${nombres.joinToString(", ")}")

    // Sumar Importes

    val importes = matriz[2] as FloatArray
    val sumaImportes = importes.sum()
    println("Suma de Importes: $sumaImportes")




}
