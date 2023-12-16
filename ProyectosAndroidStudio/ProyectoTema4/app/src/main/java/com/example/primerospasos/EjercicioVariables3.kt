package com.example.primerospasos
import android.widget.Toast

fun main() {
    //USO DEL == === USO DE NULL
    //EJERCICIO 3 USANDO == Y ====
    //uso de == y ===
    var algo:Int=3
    var algo2:Int=3
    //hay que importar import android.widget.Toast
    println("Resultado de la comparación algo y algo2 ==: ${algo == algo2}")
    println("Resultado de la comparación añgp u añgp2 ===: ${algo === algo2}")
  //usando un new Integer
    var algo3:Integer=Integer(3) //En Java sería =new Integer(3)
    var algo4:Integer=Integer(3)
    var algo10:Integer=Integer(2)
    println("Resultado de la comparación algo 3 y algo 4==: ${algo3 == algo4}")
    println("Resultado de la comparación algo 3 y algo 4 con ====: ${algo3 === algo4}")
    println("Resultado de la comparación ===: ${algo3 === algo10}")


    //EJERCICIO 4 USANDO NULL
    // asignar valor null en kotlin
    var numero:Int?=null
    var algo6:String?=null
    if (numero != null) {
        println("numero no es nulo: $numero")
    } else {
        println("numero es nulo")
    }

// Comprobar si 'algo6' es nulo
    if (algo6 != null) {
        println("algo6 no es nulo: $algo6")
    } else {
        println("algo6 es nulo")
    }
    //EJERCICIO 5 , QUE PIDA UN NOMBRE Y UNA EDAD
    // EN EL CASO DE QUE ALGUNO DE LOS DOS SEA NULO DEVUELVA UN MENSAJE
    // DE ERROR, POR DEFECTO LOS VALORES DEBEN SER NULOS
    var edad:Int?=null
    var nombre:String?=null

    if (edad != null) {
        println("edad no es nulo: $edad")
    } else {
        println("edad es nulo")
    }

// Comprobar si 'algo6' es nulo
    if (nombre != null) {
        println("nombre no es nulo: $nombre")
    } else {
        println("nombre es nulo")
    }



}


