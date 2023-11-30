package com.example.myapplication

fun main() {
    //Las variables se definen con var. Las constantes con val.
    println("Hola, mundo")
/*
    var valor1: Int;
    var valor2: Int;
    var resultado: Int;

    valor1 = 100
    valor2 = 400
    resultado = valor1 + valor2;
    println("La suma de $valor1 y $valor2 es $resultado");
    println();
    resultado = valor1 - valor2;
    println("La resta de $valor1 por $valor2 es $resultado");
    println();
    resultado = valor1 * valor2;
    println("El producto de $valor1 por $valor2 es $resultado");
    println();
    resultado = valor1 / valor2;
    println("La división de $valor1 por $valor2 es $resultado");

    print("Ingrese el sueldo del empleado:")
    val sueldo = readln().toDouble();
    if (sueldo > 3000) {
        println("Debe pagar impuestos")
    } else {
        println("A evadir impuestos")
    }

    print("Dime la nota:")
    val nota = readln().toDouble();
    if (nota < 5) {
        println("Suspenso");
    }else if (nota >= 5 && nota < 6) {
        println("suficiente")
    } else if (nota >= 6 && nota < 7) {
        println("Bien")
    } else if (nota >= 7 && nota < 8) {
        println("Notable bajo")
    } else if (nota >= 8 && nota < 9) {
        println("Notable alto")
    } else if (nota >= 9 && nota <= 10) {
        println("Sobresaliente")
    }
*/
    print("Dime dos números:")
    val num1 = readln().toDouble();
    val num2 = readln().toDouble();
    if(num1>num2){
        println("El número $num1 es mayor")
    }else if(num1 == num2) {
        println("Los dos números introducidos son iguales")
    }else{
        println("El número $num2 es mayor")

    }


    //Bucles for

    for (a in 0..10 step 2){
        println(a); //Con esto suma de 2 en 2 de 0 a 10
    }
    for (b in 10 downTo 0 step 2){
        println(b); //Con esto va bajando de 2 en 2 de 10 a 0
    }

    //Bucles while

    var i=1;
    while (i<=10){
        val resultado=5*i;
        println("5 *$i=$resultado")
        //println("5"+"*"+i+"="+resultado)
        i++
    }

    //Bucles do while

    var j=1;
    do{
        val resultado=5*j;
        println("5 *$j=$resultado");
        j++
    }while (j<=10)
}

