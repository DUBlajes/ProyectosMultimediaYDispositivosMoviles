package com.example.condicionales

fun main (){
    var temperaturas: Float = 12.0f
    when {
        temperaturas in 0.0..10.0 -> println("frío")
        else -> println("otro caso")
    }


}





