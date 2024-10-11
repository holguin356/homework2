package com.wanderapp.homework

fun main(){
    alcanceLet("1")
    alcanceAlso("sebastian")
}

fun alcanceLet(nombre: String) {
    nombre.let {
        println("Hola, $it")
    }
}

fun alcanceAlso(nombre: String){
    nombre.also{
        println("Se ha creado el nombre: $it")
    }
}