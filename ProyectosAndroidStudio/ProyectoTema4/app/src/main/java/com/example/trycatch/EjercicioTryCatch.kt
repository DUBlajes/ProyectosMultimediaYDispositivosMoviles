package com.example.trycatch

fun main(args: Array<String>) {
    val eval = "123"

    try {
        val num = eval.toInt()
        println(num)
    } catch (e: NumberFormatException) {
        println("$eval no es un número valido :(")
    }
}