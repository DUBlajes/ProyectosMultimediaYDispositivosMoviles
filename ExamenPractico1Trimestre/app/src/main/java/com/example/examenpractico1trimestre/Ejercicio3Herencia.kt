package com.example.examenpractico1trimestre

/*
Instrucciones:

1º Clase Padre  - Deporte:

Crea una clase base llamada Deporte con propiedades nombre y tipoTerreno. Implementa un método llamado mostrarDetalles() que imprima información básica sobre el deporte.

2º Clases Hijas - Deportes Específicos:

Crea cuatro clases hijas: Futbol, Baloncesto, Balonmano y Voleibol.
Cada clase hija debe tener propiedades específicas que la distingan del resto. De esta forma:

Clase Futbol:
-	numeroJugadores: int
-	esCampoGrande Boolean

clase Baloncesto:
-	alturaCanasta: Double
-	esDeporteEquipo: Boolean

clase Balonmano:
-	esDeporteOlimpico: Boolean
-	esContacto: Boolean

clase Voleibol:
-	esDeportePlaya: Boolean
-	numeroJugadoresEquipo: Int
*/

//Creamos una clase padre con su nombre y tipo de campo. Además le creamos la función mostrarDetalles. Tanto la clase como la función se declaran como open para que las clases derivadas puedan heredar de la clase y sobreescribir la funcion
open class Deporte(var nombre:String, var tipoCampo:String){
    open fun mostrarDetalles(){
        println("Deporte: $nombre, Tipo de campo: $tipoCampo")
    }
}

//Creamos las clases derivadas heredando de la clase Deporte usando el metodo : y sobreescribimos la funcion mostrarDetalles(). La línea super.mostrarDetalles() permite ejecutar la función mostrarDetalles de la clase padre. Es por eso que, al imprimir, también se muestra el nombre del deporte y el tipo de campo.
class Futbol(nombre: String, tipoCampo:String, var numeroJugadores:Int, var esCampoGrande:Boolean ):Deporte(nombre,tipoCampo){
    override fun mostrarDetalles(){
        super.mostrarDetalles()
        println("Número de Jugadores: $numeroJugadores, ¿Tiene un campo grande?: $esCampoGrande")

    }
}

class Baloncesto(nombre:String, tipoCampo: String, var alturaCanasta:Double,var esDeporteEquipo:Boolean):Deporte(nombre,tipoCampo){
    override fun mostrarDetalles() {
        super.mostrarDetalles()
        println("Altura de la canasta: $alturaCanasta metros, ¿Se juega en equipo?: $esDeporteEquipo")
    }
}

class Balonmano(nombre: String,tipoCampo: String,var esDeporteOlimpico:Boolean,var esContacto:Boolean):Deporte(nombre, tipoCampo){
    override fun mostrarDetalles() {
        super.mostrarDetalles()
        println("¿Es deporte olímpico?: $esDeporteOlimpico, ¿Es un deporte de contacto?: $esContacto")
    }
}

class Volleyball(nombre: String,tipoCampo: String,var esDeportePlaya:Boolean,var numeroJugadoresEquipo:Int):Deporte(nombre, tipoCampo){
    override fun mostrarDetalles() {
        super.mostrarDetalles()
        println("¿Se juega en la playa?: $esDeportePlaya, Número de Jugadores: $numeroJugadoresEquipo")
    }
}

//Instanciamos las clases y llamamos a cada uno de las funciones mostrarDetalles de cada clase.
fun main(){
    val futbol=Futbol("Fútbol","Césped",11,true)
    futbol.mostrarDetalles()
    println("/////////////////////////////////////////////////////")
    val baloncesto=Baloncesto("Baloncesto","Pista",3.05,true)
    baloncesto.mostrarDetalles()
    println("/////////////////////////////////////////////////////")
    val balonmano=Balonmano("Balonmano","Pista",true,true)
    balonmano.mostrarDetalles()
    println("/////////////////////////////////////////////////////")
    val volleyball=Volleyball("Volleyball","Arena",true,6)
    volleyball.mostrarDetalles()
}

