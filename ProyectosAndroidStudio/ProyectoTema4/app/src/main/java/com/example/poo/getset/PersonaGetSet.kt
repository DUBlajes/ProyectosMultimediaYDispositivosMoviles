package com.example.poo.getset
//No necesitas escribir getters y setters manualmente a menos
//que necesites una lógica personalizada en ellos.
//Si solo necesitas la funcionalidad predeterminada de obtener
//y establecer valores, Kotlin se encargará de ello automáticamente.
class Persona {
    // Propiedades privadas
    private var nombre: String = ""
    private var edad: Int = 0

    // Getter y Setter para la propiedad 'nombre'
    var Nombre: String
        get() = nombre
        set(value) {
            nombre = value
        }

    // Getter y Setter para la propiedad 'edad'
    var Edad: Int
        get() = edad
        set(value) {
            edad = value
        }
}

fun main() {
    // Crear una instancia de la clase Persona
    val persona = Persona()

    // Utilizar los setters
    persona.Nombre = "Juan"
    persona.Edad = 25

    // Utilizar los getters
    println("Nombre: ${persona.Nombre}")
    println("Edad: ${persona.Edad}")
}
