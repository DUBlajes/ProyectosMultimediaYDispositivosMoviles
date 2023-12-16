package com.example.arrays

fun main() {
    // EJERCICIO 1: ARRAY DE VALORES ENTEROS
    val arrayValores = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    for (i in 0 until arrayValores.size step 2) {
        println(arrayValores[i])
    }




    var arrayValores2= arrayOf("A","B","C")
    for (i in 0 until arrayValores2.size ){
        println(arrayValores2[i])

    }
    //este codigo es erroneo que hay que cambiar
    var arrayValores3=arrayOf("Laura",30,"Ana",24)
    // EJERCICIO 2: ARRAY QUE CUENTA HACIA ATRAS
    for (i in arrayValores3.size - 1 downTo 0 step 2) {
        println(arrayValores[i])
    }

    // EJERCICIO 3: ARRAY CON VALORES DE DIFERENTES TIPOS
    val arrayValores1 = arrayOf(1, "España", 2, "Francia", 3, "Alemania", 4, "Italia", 5)
    for (i in 0 until arrayValores1.size step 1) {
        println(arrayValores1[i])
    }

    // EJERCICIO 4: ARRAY CON TIPO FLOAT
    val arrayFloat = floatArrayOf(3.5F, 2.2f)
    for (i in 0 until arrayFloat.size step 1) {
        println(arrayFloat[i])
    }

    // EJERCICIO 5: ARRAY VACIO
    val arrayVacio = arrayOfNulls<String>(3)
    arrayVacio[0] = "coin"
    arrayVacio[1] = "Cartama"
    arrayVacio[2] = "Alora"
    println(arrayVacio.joinToString())
    for (i in 0 until arrayVacio.size) {
        println(arrayVacio[i])
    }
    // MOSTRANDO DATOS DEL ARRAY USANDO GET
    println(arrayVacio.get(0))
    // usando int
    var arrayEnteroVacio= arrayOfNulls<Int>(3)
    arrayEnteroVacio[0]=1
    arrayEnteroVacio[1]=2
    arrayEnteroVacio[2]=2
    println(arrayEnteroVacio.joinToString())

    for (i in 0 until arrayEnteroVacio.size) {
        println(arrayEnteroVacio[i])
    }
    //usando float

    // EJERCICIO 6: AGRANDAR UN ARRAY
    var array1 = arrayOfNulls<String>(3)

    // EJERCICIO 7: COPIAR ARRAYS Y AÑADIR DATOS AL ARRAY
    array1[0] = "A"
    array1[1] = "B"
    array1[2] = "C"

    // Copiar array1 a array2 y agregar un elemento más

    var array2 = array1.copyOf(array1.size + 1)
    array2[array1.size] = "D" //estmos utilizando el tamaño del array+1

    // Mostrar array1 y array2 por consola USANDO JOOINTOSTRING
    println("Array1: ${array1.joinToString(", ")}")
    println("Array2: ${array2.joinToString(", ")}")

    println("Array2 "+array2.joinToString())
}
// ejercicio realizar lo mismo con paises
// ALEMANIA, FRANCIA ITALIA EN UN arrayPaises1
// realizar una copia en ArrayPaises2 con dos elementos vacios mma y añadir
// ESPAÑA Y GRECIA

// EL MISMO CON 5 POSICIONES NOMBRE DE EMPRESA
// arrayEmpresa1 Microsoft, Meta, Apple
// ArrayEmpresa2 SAMSUNG, LENOVO, XIAOMI, INTEL, AMD

// OTRO EJERCICIO CON string e int
// arrayMultitipo1 1, "table", 2, "Monitor
// realizar una copia en el arrayMultitipo2 , 3, "Portatil, 4, "Móvil"

// EJERCICIOS

//Ejercicio 1: Suma de elementos
//Enunciado: Crea un programa que calcule la suma de todos los elementos en un array.


//Ejercicio 2: Promedio de elementos
//Enunciado: Crea un programa que calcule el promedio de los elementos en un array.


//Ejercicio 3: Buscar elemento
//Enunciado: Crea un programa que busque la posición de un elemento dado en un array.





