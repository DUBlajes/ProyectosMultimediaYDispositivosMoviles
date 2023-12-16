package com.example.arrays

fun main() {
    // EJERCICIO 7: ARRAY DE VALORES hasta 12 y en condicional me diga el mes
    var arrayValores = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9,10,11,12)
    for (i in 0 until arrayValores.size step 1) {
        println(arrayValores[i])
    }
    // crea un array de NOMBRES E INGRESOSs y que solo muestre las capitales
    // EJERCICIO 3: ARRAY CON VALORES DE DIFERENTES TIPOS Y MUNDIAL
    var arrayValores1 = arrayOf("ALVARO", 5000,"LAURA", 3000)
    for (i in 1 until arrayValores1.size step 2) {
        println(arrayValores1[i])
    }
    // EJERCICIO CREA UN ARRAY VACIO DE 5 COMUNIDADES AUTONOMASS
    //LAS CIUDADES
    // EJERCICIO 5: ARRAY VACIO
    println("Ejercicio 9")
    var arrayVacio = arrayOfNulls<String>(3)
    arrayVacio[0] = "ANDALUCIA"
    arrayVacio[1] = "BALEARES"
    arrayVacio[2] = "GALICIA"
    for (i in 0 until arrayVacio.size step 1) {
        println(arrayVacio[i])
    }
    //EJERCICIO 9 AGRANDAMOS EL ARRAY LE AÑADIMOS 3 COMUNIDADES MAS
    println("Ejercicio 10")
    var arrayVacio2 = arrayVacio.copyOf(arrayVacio.size + 3)
    arrayVacio2[3] = "PAIS VASCO"
    arrayVacio2[4] = "ASTURIAS"
    arrayVacio2[5] = "VALENCIA"
    for (i in 0 until arrayVacio2.size step 1) {
        println(arrayVacio2[i])
    }

}


