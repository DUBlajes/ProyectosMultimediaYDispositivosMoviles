package com.example.interfaces

// Definición de la interfaz Persona
interface Persona {
    val nombre: String
    val edad: Int

    fun presentarse() {
        println("Hola, mi nombre es $nombre y tengo $edad años.")
    }
}

// Clase que implementa la interfaz Persona para representar a un Alumno
class Alumno(
    override val nombre: String,
    override val edad: Int,
    val grado: String
) : Persona {
    // Implementación del método presentarse()
    override fun presentarse() {
        super.presentarse()
        println("Soy un alumno del grado $grado.")
    }

    // Otro método específico de Alumno
    fun estudiar() {
        println("Estudiando para el próximo examen.")
    }
}

// Clase que implementa la interfaz Persona para representar a un Profesor
class Profesor(
    override val nombre: String,
    override val edad: Int,
    val asignatura: String
) : Persona {
    // Implementación del método presentarse()
    override fun presentarse() {
        super.presentarse()
        println("Soy profesor de la asignatura $asignatura.")
    }

    // Otro método específico de Profesor
    fun darClase() {
        println("Impartiendo la lección del día.")
    }
}

fun main() {
    // Crear instancias de Alumno y Profesor
    val alumno1 = Alumno("Juan", 15, "1º FP")
    val profesor1 = Profesor("Prof. Martínez", 25, "Entorno de desarrollo")

    // Llamar a métodos y propiedades comunes de la interfaz Persona
    alumno1.presentarse()
    profesor1.presentarse()

    // Llamar a métodos específicos de Alumno y Profesor
    alumno1.estudiar()
    profesor1.darClase()
}
