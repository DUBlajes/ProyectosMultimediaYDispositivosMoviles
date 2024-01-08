package com.example.examenpractico1trimestre

/*
Crear un programa en Kotlin que gestione información sobre asignaturas, nombres y notas de estudiantes utilizando una lista mutable llamada centro. El programa debe realizar las siguientes operaciones:

Mostrar Lista Original:

Declarar una función llamada mostrar que acepte una lista de elementos de tipo Any como parámetro e imprima cada elemento en la consola.

Modificar Asignaturas:

•	En el programa principal (main), crear una lista mutable llamada centro que inicialmente contenga información sobre asignaturas, nombres y notas de estudiantes. La lista debe ser de tipo MutableList<Any>.

•	Imprimir en la consola la lista original utilizando la función mostrar.
•	Modificar dos asignaturas en la lista ("MATEMATICAS" por "HISTORIA" y "LENGUA" por "FÍSICA") utilizando el índice correspondiente.
•	Imprimir en la consola la lista después de la modificación utilizando la función mostrar.

Añadir Nuevos Elementos:

•	Añadir tres nuevos elementos a la lista centro que representen una nueva asignatura "QUÍMICA", un nuevo estudiante "Cristina", y una nueva nota 7.
•	Imprimir en la consola la lista después de añadir los nuevos elementos utilizando la función mostrar.

Instrucciones Adicionales:

•	Utiliza la función mostrar para imprimir el contenido de la lista en diferentes puntos del programa.
•	Asegúrate de gestionar correctamente las operaciones de modificación y adición en la lista centro.
•	Puedes ajustar el código según tus necesidades y preferencias.

 */

//Creamos una funcion mostrar para que, al llamarla, muestre por consola los elementos de una lista. Como en la lista puede haber distintos tipos de dato, la declaramos como List<Any>
 fun mostrar(lista:List<Any>){
     for(elementos in lista){
         println(elementos)
     }
 }

//Creamos una lista llamada centro que puede incluir cualquier elemento, por eso es List<Any>. Luego establecemos que va a ser una mutableList para que así podamos modificarla con posterioridad, tanto para modificar elementos ya existentes como para añadir nuevos elementos. Luego llamamos al método mostrar para mostrar la lista por consola.
fun main() {
    var centro: List<Any>
    centro = mutableListOf("MATEMATICAS", "Álvaro Guerrero", 10, "LENGUA", "Borja Estévez", 7)
    println("/////////////// LISTA ORIGINAL ///////////////")
    println()
    mostrar(centro)
    println()


    //Aquí modificamos los elementos en los puestos 0 y 3 de la lista para modificar así las asignaturas. Camibamos Matemáticas por Historia y Lengua por física. Posteriormente, volvemos a llamar al método mostrar para mostrar la lista por consola y mostrar así los cambios.
    centro[0]="HISTORIA"
    centro[3]="FÍSICA"
    println("/////////////// MODIFICAR ASIGNATURAS ///////////////")
    println()
    mostrar(centro)
    println()
    //Aquí añadimos nuevos elementos a la lista, en este caso una nueva asignatura, alumna y nota. Posteriormente, volvemos a llamar al método mostrar para mostrar la lista por consola, incluyendo los cambios que realizamos antes y los nuevos añadidos
    centro.add("QUÍMICA")
    centro.add("Cristina")
    centro.add(7)
    println("/////////////// AÑADIR ASIGNATURAS ///////////////")
    println()
    mostrar(centro)
}
