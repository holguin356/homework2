package com.wanderapp.homework

fun main() {
    condicionalIf(19)
    ejemploCase(6)
}

fun condicionalIf(edad: Int){
    if(edad < 18){
        println("Es usted menor de edad")
    }
    else if(edad in 18..64){
        println("Es usted mayor de edad, Adulto")
    } else {
        println("Es usted una adulto de la tercera edad")
    }
}
fun ejemploCase(mes: Int){
    when (mes) {
        1 -> println("Enero")
        2 -> println("febrero")
        3 -> println("Marzo")
        4 -> println("Abril")
        5 -> println("Mayo")
        6 -> println("Junio")
        7 -> println("Julio")
        8 -> println("Agosto")
        9 -> println("Septiembre")
        10 -> println("Octubre")
        11 -> println("Noviembre")
        12 -> println("Diciembre")
        else -> println("no existe mi socio")
    }
}

