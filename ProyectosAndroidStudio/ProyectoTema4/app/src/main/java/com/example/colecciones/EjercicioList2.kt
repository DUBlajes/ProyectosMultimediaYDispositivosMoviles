package com.example.colecciones
// ejercicio usando mutable
fun printbucle(listar: List<Int> ){
    for (colum in listar){
        println(colum)
    }
}
fun main() {
    // en este ejemplo podemos añadir otro valor el 3 al final del list
    var col1: List<Int>
    col1= mutableListOf(31,32,33,34,35,36)
  //añadimos un valor nuevo
    println("Añadimos un nuevo valor 3")
    col1.add(3)
    printbucle(col1)
    //modificamos un valor
    println("modificamos el valor del indice 0")
    col1[0]=311
    printbucle(col1)
}