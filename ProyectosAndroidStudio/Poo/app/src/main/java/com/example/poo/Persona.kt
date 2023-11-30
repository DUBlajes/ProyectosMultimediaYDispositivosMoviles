package com.example.poo

class Persona {

    var nombre:String="";
    var edad: Int=0;
    var apellido:String=""
    var direccion:String=""
    var ciudad:String=""
    var codigoPostal:Int=0

    fun inicializar(nombre: String, apellido: String, edad: Int, direccion: String, ciudad: String, codigoPostal:Int){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.direccion=direccion;
        this.ciudad=ciudad;
        this.codigoPostal=codigoPostal;
    }

    fun imprimir(){
        println("Nombre: $nombre $apellido" +
                "\nEdad: $edad" +
                "\nDirección: $direccion" +
                "\nCiudad: $ciudad" +
                "\nCódigo postal: $codigoPostal")
    }

    fun esMayorEdad(){
        if(edad>=18){
            println("Es mayor de edad");
        }else{
            println("Es menor de edad");
        }
    }

}
fun main(){
    val persona1:Persona;
    persona1=Persona();
    persona1.inicializar("Álvaro", "Guerrero",29, "Avenida Parménides 11","Málaga", 29010 )
    persona1.imprimir();
    persona1.esMayorEdad();
    println()
    val persona2:Persona
    persona2=Persona()
    persona2.inicializar("Marina","Fernández",35,"Avenida Parménides 11","Málaga", 29010)
    persona2.imprimir()
    persona2.esMayorEdad()
}