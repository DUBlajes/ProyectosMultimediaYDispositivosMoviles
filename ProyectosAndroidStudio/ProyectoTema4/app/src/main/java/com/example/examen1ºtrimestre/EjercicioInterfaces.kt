package com.example.examen1ºtrimestre

// Interfaz para el desplazamiento
interface Desplazable {
    fun desplazar(unidades: Int)
}

// Interfaz para hacer sonidos
interface HacerSonido {
    fun hacerSonido()
}

// Clase Coche que implementa Desplazable y HacerSonido
class Coche(val modelo: String) : Desplazable, HacerSonido {
    override fun desplazar(unidades: Int) {
        println("El coche $modelo se ha desplazado $unidades unidades.")
    }

    override fun hacerSonido() {
        println("El coche $modelo hace el sonido del claxon.")
    }
}

// Clase Bicicleta que implementa Desplazable y HacerSonido
class Bicicleta : Desplazable, HacerSonido {
    override fun desplazar(unidades: Int) {
        println("La bicicleta se ha desplazado $unidades unidades.")
    }

    override fun hacerSonido() {
        println("La bicicleta hace un sonido característico.")
    }
}

fun main() {
    // Crea instancias de Coche y Bicicleta, y llama a sus métodos
    val coche = Coche("Toyota")
    val bicicleta = Bicicleta()

    coche.desplazar(50)
    coche.hacerSonido()

    bicicleta.desplazar(20)
    bicicleta.hacerSonido()
}
