package com.example.funciones
fun algo(ne: Int): Int {
    return ne
}
//recursividad
fun imprimeArrayRecursiva(array:IntArray,cont:Int):String{
    var res:String="";
    if(cont>=array.size){
        //Caso base: He terminado de recorrer
    }else{
        res+=""+array[cont]+" "+ imprimeArrayRecursiva(array,cont+1)
    }
    return res;
}

fun imprimeMatrizRecursiva(matriz:Array<*>,nFila:Int):String{
    var res:String="";
    if(nFila>=matriz.size){
        //Caso base, me he pasado, no hago nada
    }else{
        res+=""+ imprimeArrayRecursiva(matriz[nFila] as IntArray,
            0) +"\n"+ imprimeMatrizRecursiva(matriz,nFila+1)
    }
    return res;
}


fun main(){

// Definir una matriz de ejemplo
    val matrizEjemplo = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9)
    )

    // Llamar a la función e imprimir el resultado
    val resultado = imprimeMatrizRecursiva(matrizEjemplo, 0)
    println(resultado)

}