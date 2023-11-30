package com.example.poo

class Salario {

    var nombre:String="";
    var ingresos: Double=0.00;

    fun inicializar(nombre: String, ingresos:Double){
        this.nombre=nombre;
        this.ingresos=ingresos;
    }

    fun imprimir(){
        println("Nombre: $nombre"+
                "\nIngresos: $ingresos €/mes")
    }

    fun esRico(){
        if(ingresos>=2500){
            println("Esta persona es rica");
        }else{
            println("Esta persona no es rica");
        }
    }

    fun complemento(): Double{
        var complemento=0.00
        if(ingresos in 2000.0..3000.0){
            complemento=0.1
        }else if(ingresos>3000){
            complemento=0.2
        }else{
            complemento=0.05
        }
        var total=ingresos*complemento
        var suma=ingresos+total
        var irpf=suma* 0.15
        var salarioNeto=suma-irpf
        println("Su complemento es %.2f".format(total))
        println("Se te quita $irpf de irpf. Por tanto, el salario neto es de $salarioNeto euros")
        return total
    }

}
fun main(){
    val salario1:Salario
    salario1=Salario()
    salario1.inicializar("Álvaro Guerrero", 3527.15)
    salario1.imprimir()
    salario1.complemento()
    salario1.esRico()
println()
    val salario2:Salario
    salario2=Salario()
    salario2.inicializar("Borja Estevez", 2500.0)
    salario2.imprimir()
    salario2.complemento()
    salario2.esRico()
}