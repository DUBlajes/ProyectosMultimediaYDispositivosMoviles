package com.example.colecciones

//sin usar mutable. es una lista mutable
fun main(){
    var col3: List<Any>
    col3= listOf(1,"Alberto",2,"Laura",3,"Cristina")

    //accedemos al primer elemento
    val primerElemento = col3.get(0)

    for (element in col3) {
        println(element)
    }
}