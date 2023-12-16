package com.example.arrays

class Array1 {
    var lista= arrayOf(1,2,3)
    fun imprimir() {
        for (element in lista) {
            println(element)
        }
    }
}

fun main(){
    var lista=Array1()
    lista.imprimir()

}