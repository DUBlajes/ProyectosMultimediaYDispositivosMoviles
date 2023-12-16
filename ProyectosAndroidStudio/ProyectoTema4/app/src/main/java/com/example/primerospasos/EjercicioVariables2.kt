package com.example.primerospasos
import android.widget.Toast

fun main() {
    //EJERCICIO 1 MOSTRAR EL TIPO DE VARIABLE USANDO JAVECLASS
    // USO DE VARIABLES, JAVACLASS.NAME, CASTING, IS.....
    var st: String = "ALBERTO EjercicioVariables2.kt" + 3
    println(st)

    // Devuelve “String”:
    println("nombre de clase: ${st.javaClass.simpleName}")

    // Devuelve “java.lang.String”:
    println("nombre de clase: ${st.javaClass.name}")

    //EJERCICIO 2 CASTEAR
    // ejemplos con toint y tofloat
    // Ejemplo con toInt()
        val numeroString = "42"
        val numeroInt = numeroString.toInt()

        println("Número como String: $numeroString")
        println("Número como Int: $numeroInt")

        // Ejemplo con toFloat()
        val decimalString = "3.14"
        val decimalFloat = decimalString.toFloat()

        println("Decimal como String: $decimalString")
        println("Decimal como Float: $decimalFloat")
// uso de os
    println("nombre de clase: ${st.javaClass.simpleName}")
// Devuelve "nombre de clase: String"

    println("nombre de clase: ${st is String}")

}


