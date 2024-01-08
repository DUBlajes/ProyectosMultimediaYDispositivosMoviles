package com.example.examenpractico1trimestre

/*Mostrar Nombres:

•	Extrae la primera fila de la matriz, que contiene los nombres de los empleados, y muestra los nombres separados por comas. Utiliza la función joinToString para formatear la salida.

Calcular Nota Media:

•	Extrae la segunda fila de la matriz, que contiene los salarios base de los empleados, y muestra los salarios base separados por comas. Utiliza la función joinToString para formatear la salida.
•	Calcula y muestra la nota media de los salarios base de los empleados.
•	Calcula y muestra la suma total de los salarios base.
*/
//En este bloque lo que hacemos es crear la matriz. Como tenemos tanto Strings como Floats, la primera fila la creamos como un array de String y la segunda como un array de Float
fun main() {
    val matrizMixta = arrayOf(
        arrayOf<String>("Juan", "Eva", "Ana", "Pedro"),
        floatArrayOf(1700.0f, 2800f, 1900f, 2300.0f)
    )

    // En este bloque, creamos 4 variables. La primera muestra los nombres, seleccionando la fila 0 de la matriz. La segunda muestra los salarios, seleccionando los datos de la fila 1 de la matriz. Para hacer la suma y la media de los salarios, usamos la funcion .sum() y .average()
    //Para mostrar tanto los nombres como los salarios como si fuese un string usamos la función joinToString, introduciéndole simplemente una coma como separador.
    val nombres = matrizMixta[0] as Array<String>
    val salarios = matrizMixta[1] as FloatArray
    val sumaSalarios = salarios.sum()
    val mediaSalarios=salarios.average()
    println("Nombres: ${nombres.joinToString(", ")}")
    println("Salarios: ${salarios.joinToString(", ")}")
    println("Media de los salarios: $mediaSalarios €")
    println("Suma de los salarios: $sumaSalarios €")
}

