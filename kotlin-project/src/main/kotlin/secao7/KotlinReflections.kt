package br.com.moisesdias.secao7

import kotlin.reflect.KClass

fun main() {
    val person = Person("Moises", "Dias")

    val kClass = person::class
    //println("Class name: ${kClass}")
    println("Simple Class name: ${kClass.simpleName}")

    //for (field in kClass.members) {
    for (field in kClass.java.declaredFields) {
        //println("Property name: $field")
        println("Property name: ${field.name}")
    }

    for (constructor in kClass.constructors) {
        //println("Constructor: $constructor")
        //println("Constructor return: ${constructor.annotatedReturnType}")
        println("Constructor parameters: ${constructor.parameters}")
    }
}