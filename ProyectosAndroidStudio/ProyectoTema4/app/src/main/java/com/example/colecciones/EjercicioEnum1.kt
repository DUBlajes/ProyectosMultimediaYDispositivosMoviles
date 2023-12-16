package com.example.colecciones

// Definición del enum DiasDeLaSemana
enum class DiasDeLaSemana {
    LUNES, MARTES, MIÉRCOLES, JUEVES, VIERNES, SÁBADO, DOMINGO
}

fun main() {
    // Crear una variable que represente el día actual
    val diaActual = DiasDeLaSemana.MIÉRCOLES

    // Mostrar un mensaje indicando qué día de la semana es hoy
    when (diaActual) {
        DiasDeLaSemana.LUNES -> println("¡Es lunes!")
        DiasDeLaSemana.MARTES -> println("¡Es martes!")
        DiasDeLaSemana.MIÉRCOLES -> println("¡Es miércoles!")
        DiasDeLaSemana.JUEVES -> println("¡Es jueves!")
        DiasDeLaSemana.VIERNES -> println("¡Es viernes!")
        DiasDeLaSemana.SÁBADO -> println("¡Es sábado!")
        DiasDeLaSemana.DOMINGO -> println("¡Es domingo!")
    }
}
