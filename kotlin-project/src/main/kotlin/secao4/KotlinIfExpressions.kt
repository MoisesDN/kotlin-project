package br.com.moisesdias.secao4

fun main() {

    val aInt: Int = 199
    val myInt = 7

    // Usando if como expressão
    // int lowest = (myInt < aInt) ? myInt : aInt; (Java)
    val lowest = if (myInt < aInt) myInt else aInt

    println(lowest)

    val temp = 26

    val isAirConditionerOn = if (temp >= 26) {
        println("It is warn")
        true
    } else {
        println("It is not so warn")
        false
    }

    println("Is the air conditioner on: $isAirConditionerOn")
}