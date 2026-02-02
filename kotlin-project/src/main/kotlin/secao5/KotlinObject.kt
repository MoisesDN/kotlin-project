package br.com.moisesdias.secao5

fun main() {
    val location = object {
        val latitude = -23.564
        val longitude = -46.653

    }

    println("Location: ${location.latitude}, ${location.longitude}")

    val location1 = object {
        var latitude = -23.000
        var longitude = -45.000
        fun printLocation() {
            println("Location1: $latitude, $longitude")
        }
    }

    location1.printLocation()

    location1.latitude = 3000.0
    location1.longitude = 3000.0

    location1.printLocation()

    val temperature = MySingleton.getLastTemperature();
    println("Last temperature: $temperature")
}

object MySingleton {
    var temperatures = arrayOf(18,22,26,30,15,25)


    fun getLastTemperature() = temperatures.last();
}