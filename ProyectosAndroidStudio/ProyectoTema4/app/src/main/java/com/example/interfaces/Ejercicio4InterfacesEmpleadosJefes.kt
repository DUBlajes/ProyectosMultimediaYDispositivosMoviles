package com.example.interfaces

// Definición de la interfaz Trabajador
interface Trabajador {
    val nombre: String
    val edad: Int

    fun trabajar() {
        println("$nombre está trabajando.")
    }

    fun presentarse() {
        println("Hola, mi nombre es $nombre y tengo $edad años.")
    }
}

// Clase que implementa la interfaz Trabajador para representar a un Empleado
class Empleado(
    override val nombre: String,
    override val edad: Int,
    val cargo: String
) : Trabajador {
    // Implementación del método trabajar()
    override fun trabajar() {
        println("$nombre está realizando tareas como $cargo.")
    }

    // Otro método específico de Empleado
    fun tomarDescanso() {
        println("$nombre está tomando un descanso.")
    }
}

// Clase que implementa la interfaz Trabajador para representar a un Jefe
class Jefe(
    override val nombre: String,
    override val edad: Int,
    val departamento: String
) : Trabajador {
    // Implementación del método trabajar()
    override fun trabajar() {
        println("$nombre está supervisando el departamento $departamento.")
    }

    // Otro método específico de Jefe
    fun realizarReuniones() {
        println("$nombre está llevando a cabo reuniones con el equipo.")
    }
}

fun main() {
    // Crear instancias de Empleado y Jefe
    val empleado1 = Empleado("Ana", 25, "Desarrollador")
    val jefe1 = Jefe("Sr. Rodríguez", 40, "Ventas")

    // Llamar a métodos y propiedades comunes de la interfaz Trabajador
    empleado1.presentarse()
    empleado1.trabajar()
    jefe1.presentarse()
    jefe1.trabajar()

    // Llamar a métodos específicos de Empleado y Jefe
    empleado1.tomarDescanso()
    jefe1.realizarReuniones()
}
