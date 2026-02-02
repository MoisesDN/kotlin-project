package br.com.moisesdias.secao5

fun main() {
    val myCar = Car()
    myCar.start()
    println("Automaker: ${myCar.automakerName}")
    println("Doors: ${myCar.getDoors()}")
}