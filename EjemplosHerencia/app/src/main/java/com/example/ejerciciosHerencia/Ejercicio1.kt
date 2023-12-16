package com.example.ejerciciosHerencia

open class Vehiculo(var marca:String,var modelo:String ){
    open fun acelerar(){
        println("Acelerando el vehículo")
    }
    open fun frenar(){
        println("Frenando el vehículo")
    }
    open fun conducir(){
        println("Conduciendo el vehículo. ¡Cuidado con las curvas!")
    }
}

class Coche(marca:String, modelo:String, val numeroPuertas:Int): Vehiculo(marca,modelo){
    override fun conducir(){
        println("Estás conduciendo un coche $marca $modelo con $numeroPuertas puertas. ¡Menudo bicharraco!")
    }
}

class Motocicleta(marca:String, modelo:String, val tipo:String): Vehiculo(marca,modelo){
    override fun conducir(){
        println("Estás conduciendo una moto $marca $modelo de tipo $tipo. ¡Menudo bicharraco!")
    }
    fun caballito(){
        println("Estás haciendo un caballito con tu moto $marca $modelo. ¡Arriba esa rueda!")
    }
}

fun main(){
    val coche=Coche("Ferrari","Testa Rosa",3)
    coche.acelerar()
    coche.frenar()
    coche.conducir()

    val moto=Motocicleta("Harley Davidson", "Breakout","Custom")
    moto.acelerar()
    moto.frenar()
    moto.conducir()
    moto.caballito()
}
