package com.example.usodelazy
// Código de inicialización
// Esta parte se ejecutará solo la primera vez que se acceda a la propiedad
// El valor calculado se almacenará en caché y se reutilizará en accesos posteriores

class MiClase {
    val numero12: Int? by lazy {
        inicializarNumero()
    }

    private fun inicializarNumero(): Int? {
        // Simulación de una lógica de inicialización que puede devolver null
        return 42
    }

    fun imprimirNumero() {
        println("Número: $numero12")
    }
}

fun main() {
    val miObjeto = MiClase()

    // Se inicializa el número solo cuando se accede por primera vez
    miObjeto.imprimirNumero()
}
