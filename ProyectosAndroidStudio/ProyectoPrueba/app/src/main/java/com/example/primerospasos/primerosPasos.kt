package com.example.primerospasos

fun main(){
    //Suma de dos en dos
    for (a in 0..10 step 2){
        print("$a - ");
    }
    println()
    //Bajando de dos en dos
    for(b in 10 downTo 0 step 2){
        print("$b - ")
    }

    println()
    //Tabla de multiplicar del 5 usando bucle for de menor a mayor

    for(c in 1..10){
        val resultado=5*c
        println("5*$c=$resultado")
    }
    println()
    for(d in 10 downTo 1){
        val resultado2=5*d;
        println("5*$d=$resultado2")
    }

    //Tabla de multiplicar pero usando do-while
    println();
    var w=1;
    while (w<=10){
        val resultado=8*w;
        println("8*$w=$resultado")
        w++
    }

    //Tabla multiplicar con do-while

    println()
    var a=1
    do{
        val resultado=9*a;
        println("9*$a=$resultado")
        a++
    }while (a<=10)
    println()

    println("Dime un número")
    val numero:Int?=readLine()?.toInt();

    when(numero){
        1->println("Lunes")
        2->println("Martes")
        3->println("Miércoles")
        4->println("Jueves")
        5->println("Viernes")
        6->println("Sábado")
        7->println("Domingo")
        8->println("El día de Alberto")
        else -> println("Número no válido. Ingrea un número del 1 al 8.")
    }
}