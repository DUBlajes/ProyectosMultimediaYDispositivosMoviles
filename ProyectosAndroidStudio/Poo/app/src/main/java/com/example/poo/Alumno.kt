package com.example.poo

class Alumno {

    var nombre: String=""
    var asignatura: String=""
    var nota: Int=0;

    fun inicializar(nombre: String, asignatura: String, nota:Int){
        this.nombre=nombre;
        this.asignatura=asignatura
        this.nota=nota
    }


fun calcularNota(nota: Int): String {
    var resultado= when (nota) {
        in 0..4 -> "Suspenso"
        in 5..6 -> "Aprobado"
        in 7..8 -> "Notable"
        in 9..10 -> "Sobresaliente"
        else -> "Puntuación no válida"
    }
    return resultado
}

    fun imprimir(){
        println("Nombre: $nombre"+
                "\nAsignatura: $asignatura" +
                "\nNota: $nota")
        println(calcularNota(nota))
    }
}

fun main() {

    val alumno1:Alumno
    alumno1=Alumno()
    alumno1.inicializar("Alvaro","Ingles",7)
    alumno1.imprimir()

}
