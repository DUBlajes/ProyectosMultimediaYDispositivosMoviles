package com.example.array2

fun main(){
    var arrayVacio = arrayOfNulls<String>(3)
    arrayVacio[0] = "ANDALUCIA"
    arrayVacio[1] = "BALEARES"
    arrayVacio[2] = "GALICIA"
    var arrayVacio2 = arrayVacio.copyOf(arrayVacio.size + 3)
    arrayVacio2[3] = "PAIS VASCO"
    arrayVacio2[0] = "ASTURIAS"
    arrayVacio2[1] = "VALENCIA"
    for (i in 0 until arrayVacio2.size step 1) {
        println(arrayVacio2[i])
    }
}