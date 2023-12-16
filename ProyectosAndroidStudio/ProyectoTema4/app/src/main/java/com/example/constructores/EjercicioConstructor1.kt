package com.example.constructores


class Persona
    (var nif:String,
     var nombre:String,
     var apellidos:String,
     var genero:String,
     var edad:Int=0)
    {constructor (nombre: String, // constructor secundario, solo con los campos nombre, apellidos, genero
                 apellidos: String,
                 genero: String) :
          this("", nombre, apellidos, genero) // usamos this para hacer referencia a la propia clase
}
fun  main(){
    var p: Persona= Persona("123","Alberto","Ruiz","Hombre")
    var p1: Persona=Persona("123","Eva","Ruiz","Mujer",40)
    var p2:Persona= Persona("Juan","Perez","Hombre")
    println("nombre: ${p.nombre} nif: ${p.nif} apellidos: ${p.apellidos} género: ${p.genero}")
    p.edad=34
    println("la edad es ${p.edad}")
    println("nombre: ${p2.nombre} apellidos: ${p2.apellidos} género: ${p2.genero}")
    println("nombre: ${p1.nombre} nif: ${p1.nif} apellidos: ${p1.apellidos} género: ${p1.genero} " +
            " edad:  ${p1.edad}")




}