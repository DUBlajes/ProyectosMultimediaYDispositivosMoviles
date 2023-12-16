package com.example.poo.visibilidad

// En este ejemplo, estamos definiendo tres clases en un archivo llamado "EjemploVisibilidad.kt".

// Clase con visibilidad por defecto (public)
class ClasePublica(val nombre: String) {
    fun imprimir() {
        println("Clase pública: $nombre")
    }
}
// Clase con visibilidad private
private class ClasePrivada(val nombre: String) {
    fun imprimir() {
        println("Clase privada: $nombre")
    }
}

class ClaseProtegida(val nombre: String) {
    protected class SubClaseProtegida(val subNombre: String) {
        fun imprimir() {
            // Podemos acceder a la propiedad nombre de la clase externa
            println("Subclase protegida: $subNombre, Nombre externo: ${ClaseProtegida("Externa").nombre}")
        }
    }
    fun imprimir() {
        val subClase = SubClaseProtegida("Subclase")
        subClase.imprimir()
    }
}
// Clase con visibilidad internal
internal class ClaseInternal(val nombre: String) {
    fun imprimir() {
        println("Clase internal: $nombre")
    }
}

// Función principal
fun main() {
    // Creamos instancias de cada clase y llamamos a sus funciones
    val clasePublica = ClasePublica("Pública")
    clasePublica.imprimir()

    // No podemos acceder a la clase privada desde fuera del archivo
    // val clasePrivada = ClasePrivada("Privada")
    // clasePrivada.imprimir()

    val claseProtegida = ClaseProtegida("Externa")
    claseProtegida.imprimir()

    val claseInternal = ClaseInternal("Internal")
    claseInternal.imprimir()
}
