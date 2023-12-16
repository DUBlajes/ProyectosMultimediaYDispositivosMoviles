package com.example.colecciones

// es una lista mutable
fun main(){
    var col4: List<Any>
    col4= mutableListOf(1,"Alberto",2,"Laura",3,"Cristina")

    //accedemos al primer elemento
    col4.add(4)
    col4.add(0,"pablo")
    for (element in col4) {
        println(element)
    }
    col4[1]="Pedro"
    for (element in col4) {
        println(element)
    }
}