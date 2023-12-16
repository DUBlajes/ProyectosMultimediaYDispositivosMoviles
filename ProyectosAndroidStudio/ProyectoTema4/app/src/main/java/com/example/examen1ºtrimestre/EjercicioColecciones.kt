package com.example.examen1ºtrimestre

fun mostrar(lista : List<Any>){
    for (elemento in lista) {
        println(elemento)
    }
}

fun main() {
    var centro: MutableList<Any> // Cambié List por MutableList para poder modificar la lista
    centro = mutableListOf("MATEMATICAS", "Alberto", 5, "LENGUA", "Laura", 6)
    println("lista original***************************")
    mostrar(centro)
    // modificando
    centro[0]="HISTORIA"
    centro[3]="FÍSICA"
    println("modificando asignaturas******************")
    mostrar(centro)
    centro.add("QUÍMICA")
    centro.add("Cristina")
    centro.add(7)
    println("añadiendo********************************")
    centro.add("ECONOMÍA")
    centro.add("Alvaro")
    centro.add(9)

    mostrar(centro)
}
