package com.example.examenpractico1trimestre
/*
•	Crea una interfaz llamada Jugable que contenga un método jugar(nombreUsuario: String) para representar la acción de jugar un videojuego. El método debe aceptar un argumento adicional que represente el nombre del usuario que está jugando.

•	Crea una interfaz llamada SonidoAmbiente que contenga un método reproducirSonido() para simular el sonido ambiente del videojuego.

•	Crea una interfaz llamada GuardadoPartida que contenga un método guardarPartida() para modelar la capacidad de guardar el progreso del juego.
Clases Concretas:

•	Implementa tres clases concretas que representen diferentes tipos de videojuegos. Ejemplos de clases pueden ser Aventura, Deportes y Estrategia.

•	Cada clase debe heredar de las interfaces Jugable, SonidoAmbiente y GuardadoPartida, implementando los métodos correspondientes.

Demostración en la Función main():

•	En la función main(), crea instancias de cada tipo de videojuego y demuestra el uso de los métodos definidos en las interfaces.

•	Llama al método jugar(nombreUsuario: String) para iniciar el juego proporcionando un nombre de usuario.

•	Llama al método reproducirSonido() para simular el sonido ambiente del videojuego.

•	Llama al método guardarPartida() para guardar el progreso del juego.

 */

//Creamos tres interfaces, cada una con una función distinta.

interface Jugable {
    fun jugar(nombreUsuario: String)
}


interface SonidoAmbiente {
    fun reproducirSonido()
}

interface GuardadoPartida {
    fun guardarPartida()
}

//Creamos las clases de videojuegos heredando todas de las 3 interfaces previamente creadas. Además, sobreescribimos las funciones jugar(),reproducirSonido() y guardarPartida() para que cada una muestre un mensaje acorde al tipo de videojuego que se está jugando
class JuegoRol (val tipoJuego: String, val nombreJuego:String) : Jugable, SonidoAmbiente,GuardadoPartida{
    override fun jugar(nombreUsuario: String) {
        println("Iniciando juego de $tipoJuego. $nombreUsuario está jugando a $nombreJuego ")
    }

    override fun reproducirSonido() {
        println("Sin duda, la banda sonora de $nombreJuego es una maravilla.")
    }

    override fun guardarPartida() {
        println("Guardando partida del $nombreJuego")
    }

}
class JuegoDeporte (val tipoJuego: String, val nombreJuego:String) : Jugable, SonidoAmbiente,GuardadoPartida{
    override fun jugar(nombreUsuario: String) {
        println("Iniciando juego de $tipoJuego: $nombreUsuario se va a echar un partido de $nombreJuego")
    }

    override fun reproducirSonido() {
        println("El pitido inicial marca el comienzo de este partido de $nombreJuego")
    }

    override fun guardarPartida() {
        println("Guardando partida de $nombreJuego")
    }

}

class JuegoEstrategia (val tipoJuego: String, val nombreJuego:String) : Jugable, SonidoAmbiente,GuardadoPartida{
    override fun jugar(nombreUsuario: String) {
        println("Iniciando juego de $tipoJuego: $nombreUsuario se va a echar un partido de $nombreJuego")
    }

    override fun reproducirSonido() {
        println("WOLOLOOOOOOOOOO")
    }

    override fun guardarPartida() {
        println("Guardando partida del juego de $nombreJuego")
    }

}


//Instanciamos las clases y llamamos a cada uno de las funciones mostrarDetalles de cada clase.
fun main() {

    val j1=JuegoRol("Rol","Baldur's Gate III")
    j1.jugar("DUBlajes")
    j1.reproducirSonido()
    j1.guardarPartida()
    println("////////////////////////////////////////////////")
    val j2=JuegoDeporte("Deporte","PES 06")
    j2.jugar("Alberto")
    j2.reproducirSonido()
    j2.guardarPartida()
    println("////////////////////////////////////////////////")
    val j3=JuegoEstrategia("Estrategia","Age of Empires")
    j3.jugar("ViciadoAlAoE")
    j3.reproducirSonido()
    j3.guardarPartida()
}

