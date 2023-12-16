package com.example.colecciones

enum class meses(){
    ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE

}

fun main(){
    var mesActual=meses.DICIEMBRE
    when(mesActual){
        meses.ENERO->println("que frio en ENERO")
        meses.FEBRERO->println("que frio en FEBRERO")
        meses.MARZO->println("que frio en MARZO")
        meses.ABRIL->println("que buen tiempo en ABRIL")
        meses.MAYO->println("que buen tiempo en MAYO")
        meses.JUNIO->println("que buen tiempo en JUNIO")
        meses.JULIO->println("que CALOR en JULIO")
        meses.AGOSTO->println("que CALOR en AGOSTO")
        meses.SEPTIEMBRE->println("que CALOR en SEPTIEMBRE")
        meses.OCTUBRE->println("que CALOR en OCTUBRE")
        meses.NOVIEMBRE->println("que frio en NOVIEMBRE")
        meses.DICIEMBRE->println("que frio en DICIEMBRE")

    }


}
