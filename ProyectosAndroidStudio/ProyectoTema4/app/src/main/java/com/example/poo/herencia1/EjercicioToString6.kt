package com.example.poo.herencia1

open class CursoEscolar(var curso: String, var calendario: String,
                        var centro: String, var codigo: Int) {

    }
class Asignatura(curso: String, calendario: String, centro: String, codigo: Int,
                 var asignatura: String): CursoEscolar(curso,calendario,centro, codigo){
                override fun toString(): String {

                    return ("La asignatura es $asignatura")
                }

}
    fun main(){
        val asignatura1 = Asignatura("1º DAM", "2023-2024", "CENEC", 1, "MARCAS")
        println(asignatura1)
        val asignatura2 = Asignatura("1º DAM", "2023-2024", "CENEC", 2, "bbdd")
        println(asignatura2)
    }


