package br.com.moisesdias.secao5

interface Vehicle {

    val automakerName: String

    fun start() {
        println("The vehicle is starting")
    }

    fun stop() {
        println("The vehicle is stopping")
    }

    fun getKMPerLitre(): Int {
        return 17
    }

    fun getDoors(): Int
}