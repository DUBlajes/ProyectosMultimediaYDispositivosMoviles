package com.example.arrays

fun main() {


    //EJERCICIO 6 ARRAYS BIDIMENSIOANALES
    println("Ejercicio 6 **********************************************")

    val array2d = arrayOf(arrayOf(1, 2, 3), arrayOf("aaa", "ccc", -1))

    for (fila in array2d) {
        for (elemento in fila) {
            println(elemento)
        }
    }
     //
// crear otro array bidimensional con los siguientes valors ("Alberto", 1, "Victor",2)
// (35, -20, 16) y mostrarlo por consola
//array2D2





    println("Ejercicio 7 **********************************************")
   //EJERCICIO 7 AÑADIR VALORES USANDO SET
                                         //0               //1            //2
                                         //0,1,2           //0,1          //0
    var matrizEnteros=arrayOf(intArrayOf(3,2,1),intArrayOf(4,5),intArrayOf(6))
    println( "Valor original "+ matrizEnteros[0][2])
    matrizEnteros[0][2]=0
    println(" valor cambiado a "+ matrizEnteros[0][2])
    matrizEnteros[0].set(2,8);
    println( "valor cambiado con set "+  matrizEnteros[0][2])

    // repetir el ejercicio con estos datos (12,15,21,45), (14,25,16), (23,24)
    //modificar el valor 21 por 50 usando el metodo tradicional y
    // con set lo cambiamos a 110 y  el valor 23 por 90 con el metodo tradicional
    // y por 110 con set, cada paso ira acompañado por un println







    println("Ejercicio 8 **********************************************")
  // EJERCICIO 8 CASTEAR
    var matrizEnteros1=arrayOf(floatArrayOf(3f,2f,1.4f),intArrayOf(3,2),intArrayOf(1))
    (matrizEnteros1[0] as FloatArray).set(2,1.5f);
    // casteando
    var miArray8= arrayOf(arrayOf(3, -1, 4.5f), arrayOf(3, -1, 4.5f), -1)

    for (fila in miArray8) {
        if (fila is Array<*>) {
            for (valor in fila as Array<*>) {
                println("valor array: $valor")
            }
        } else if (fila is Int) {
            println("valor int: $fila")
        }
    }

    //ejemplo casteando castear

    (matrizEnteros1[0] as FloatArray).set(2, 1.5f)


    println("Ejercicio 8 SIN CASTEAR**********************************************")
    for (fila in miArray8) {
        if (fila is Array<*>) {
            for (valor in fila) {
                println("Valor array: $valor")
            }
        } else {
            println("Valor: $fila")
        }
    }

    println("Ejercicio 9 **********************************************")
 //EJERCICIO 9 AUMENTANDO EN 1
    var matriz = arrayOf(arrayOf(3, -1, 'a', "literal", null), arrayOf("3af299", 7, false))
    (matriz[0] as Array<Any>)[1] = 4 as Any
    println("Matriz valor: ${matriz[0][1]}")

    for (i in 0 until matriz.size) {
        for (j in 0 until matriz[i].size) {
            if (matriz[i][j] is Int) {
                (matriz[i] as Array<Any>)[j] = (((matriz[i] as Array<Any>)[j] as Int).inc() as Any)
            }
        }
    }

    println("Ejercicio 10 **********************************************")
// Mostrar la matriz después de la modificación
    for (fila in matriz) {
        for (valor in fila) {
            print("$valor\t")
        }
        println()
    }
//mostrando todo el contenido de un array
    var matriz10 = arrayOf(arrayOf(3, -1, 'a', "literal", null), arrayOf("3af299", 7, false))
    println(matriz10.contentDeepToString())
}


