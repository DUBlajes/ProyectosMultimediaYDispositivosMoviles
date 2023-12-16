package com.example.poo.herencia1

// Clase padre para representar un personaje en un videojuego
open class Personaje(val nombre: String, var nivel: Int) {
    open fun atacar() {
        println("$nombre realiza un ataque básico.")
    }

    fun subirNivel() {
        nivel++
        println("$nombre ha subido al nivel $nivel.")
    }
}

// Clase derivada para representar un guerrero, hereda de Personaje
class Guerrero(nombre: String, nivel: Int, val arma: String)
    : Personaje(nombre, nivel) {
    override fun atacar() {
        println("$nombre ataca con su espada $arma.")
    }

    fun usarHabilidadEspecial() {
        println("$nombre utiliza una habilidad especial de guerrero.")
    }
}

// Clase derivada para representar un mago, hereda de Personaje
class Mago(nombre: String, nivel: Int, val hechizo: String) :
    Personaje(nombre, nivel) {
    override fun atacar() {
        println("$nombre lanza el hechizo $hechizo.")
    }

    fun lanzarEncantamiento() {
        println("$nombre lanza un encantamiento mágico.")
    }
}

fun main() {
    // Crear instancias de las clases derivadas
    val guerrero = Guerrero("Conan", 10, "Espada de fuego")
    val mago = Mago("Gandalf", 8, "Bola de fuego")

    // Acceder a las propiedades y métodos de la clase base y las clases derivadas
    guerrero.atacar()
    guerrero.usarHabilidadEspecial()
    guerrero.subirNivel()



    mago.atacar()
    mago.lanzarEncantamiento()
    mago.subirNivel()
}
