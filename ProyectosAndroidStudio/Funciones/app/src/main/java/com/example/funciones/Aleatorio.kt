package com.example.funciones
import kotlin.random.Random



    fun main(){
        var ale=Random.nextInt(1,3)
        println("El numero elegido es $ale");


        var numero1:Int
        var numero2:Int
        var resultado:Int
        var opcion:Int = 0

        while(opcion != 5){
            println("Indicame una Opcion entre 1 - 5 ")
            println("Opcion 1 : sumar 2 numeros")
            println("Opcion 2 : restar 2 numeros")
            println("Opcion 3 : Piedra, Papel, Tijeras")
            println("Opcion 5 : salir")
            opcion = readLine()?.toIntOrNull() ?:0

            when (opcion) {
                1 -> {
                    println("Indicame un numero: ")
                    numero1 = readLine()?.toIntOrNull() ?:0
                    println("Indicame otro numero: ")
                    numero2 = readLine()?.toIntOrNull() ?:0

                    resultado = sumar(numero1,numero2)

                    println("La suma es $resultado")
                    println("")

                }
                2 -> {
                    println("Indicame un numero: ")
                    numero1 = readLine()?.toIntOrNull() ?:0
                    println("Indicame otro numero: ")
                    numero2 = readLine()?.toIntOrNull() ?:0

                    resultado = restar(numero1,numero2)

                    println("La suma es $resultado")

                }
                3-> {
                    println("Indicame tu eleccion: ")
                    println("1. Piedra ")
                    println("2. Papel ")
                    println("3. Tijeras ")
                    numero1 = readLine()?.toIntOrNull() ?:0
                    numero2 = aleatorio()

                    when(numero1){
                        1-> {
                            when(numero2){
                                1-> println("Empate")
                                2-> println("Perdiste")
                                3-> println("Ganaste")
                            }
                        }
                        2-> {
                            when(numero2) {
                                1 -> println("Perdiste")
                                2 -> println("Ganaste")
                                3 -> println("Empate")
                            }
                        }
                        3->{
                            when(numero2){
                                1-> println("Ganaste")
                                2-> println("Empate")
                                3-> println("Empate")
                            }

                        }

                    }

                }

                5 -> println("Seleccionaste la opción para salir")
                else -> println("No elegiste una opcion correcta")
                    }
            }




    }

fun sumar(a: Int, b : Int): Int{

    return a + b

}

fun restar(a: Int, b : Int): Int{

    return a-b

}

fun aleatorio(): Int {
    var rand = Random.nextInt(1,4)
    return rand
}