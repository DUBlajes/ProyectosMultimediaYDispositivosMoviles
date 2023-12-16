package com.example.arrays

import kotlin.random.Random

fun main() {
    println("¡Bienvenido, agente secreto! Tu misión es robar información sobre los planes secretos de Hitler.")
    println("Tienes que abrir la caja fuerte que contiene los detalles sobre un arma secreta.")
    println("La caja fuerte tiene una combinación de 5 números. ¡Tienes que averiguarla!")

    val combinacionSecreta = Array(5) { Random.nextInt(1, 11) }

    println("Se generó la combinación secreta. Comienza a adivinar.")

    for (i in 0 until 5) {
        print("Ingresa tu intento para el número ${i + 1}: ")

        val intento = readln()?.toIntOrNull()

        if (intento != null && intento in 1..10) {
            if (intento == combinacionSecreta[i]) {
                println("¡Número correcto! Estás más cerca de desentrañar la combinación.")
            } else if (kotlin.math.abs(intento - combinacionSecreta[i]) <= 2) {
                println("Estás cerca.")
            } else {
                println("Estás lejos.")
            }
        } else {
            println("Por favor, ingresa un número válido del 1 al 10.")
            // Restar uno al índice para que el agente tenga otra oportunidad con el mismo número.

        }
    }

    println("¡Felicidades! Has desactivado la bomba y robado la información secreta. Escapa antes de que te atrapen.")
}
