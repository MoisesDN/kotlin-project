package br.com.moisesdias.secao5

class Car : Vehicle {
    override val automakerName: String
        get() = "Toyota"

    override fun getDoors(): Int {
        return 4
    }
}