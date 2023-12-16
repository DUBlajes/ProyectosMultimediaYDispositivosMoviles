package com.example.herencias

open class Personaje(val nombre: String, var nivel:Int){
    open fun atacar(){
        println("$nombre realiza un ataque básico")
    }

    fun subirNivel(){
        nivel++
        println("$nombre ha subido al nivel $nivel")
    }
}

//Clase derivada que hereda de animal

class Guerrero(nombre:String, nivel: Int, val arma: String) : Personaje(nombre, nivel){
    override fun atacar(){
        println("$nombre ataca con su espada $arma")
    }

    fun usarHabilidadEspecial(){
        println("$nombre utiliza una habilidad especial de guerrero")
    }
}


class Mago(nombre: String, nivel:Int, val hechizo:String):Personaje(nombre,nivel){
    override fun atacar(){
        println("$nombre lanza el hechizo $hechizo")
    }
    fun lanzarEncantamiento(){
        println("$nombre lanza un encantamiento magico")
    }
}
fun main(){
    val guerrero=Guerrero("Conan",10,"Espada de fuego")
    val mago=Mago("Gandalf",8,"Bola de fuego")

    //Acceder a las propiedade s y metodos de la clase base y derivadas

    guerrero.atacar()
    guerrero.usarHabilidadEspecial()
    guerrero.subirNivel()

    mago.atacar()
    mago.lanzarEncantamiento()
    mago.subirNivel()
}