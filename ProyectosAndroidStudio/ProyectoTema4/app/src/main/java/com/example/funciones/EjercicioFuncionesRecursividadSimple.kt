package com.example.funciones



fun imprimeMatrizRecursiva1(matriz: Array<IntArray>, nFila: Int = 0, nColumna: Int = 0): String {
    var res = ""

    if (nFila < matriz.size) {
        if (nColumna < matriz[nFila].size) {
            res += "${matriz[nFila][nColumna]} "
            res += imprimeMatrizRecursiva1(matriz, nFila, nColumna + 1)
        } else {
            res += "\n" + imprimeMatrizRecursiva1(matriz, nFila + 1)
        }
    }

    return res
}

fun main() {
    // Definir una matriz de ejemplo
    val matrizEjemplo = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9)
    )

    // Llamar a la función e imprimir el resultado
    val resultado = imprimeMatrizRecursiva1(matrizEjemplo)
    println(resultado)
}
