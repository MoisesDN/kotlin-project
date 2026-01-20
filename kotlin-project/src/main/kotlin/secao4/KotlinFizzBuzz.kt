package br.com.moisesdias.secao4

fun main() {
    val myList = arrayOf(1, 2, 3, 4, 5, 15, 18, 20, 30, 33, 45)
    for (number in myList) {
        when {
            number % 3 == 0 && number % 5 == 0 -> println("FizzBuzz")
            number % 3 == 0 -> println("Fizz")
            number % 5 == 0 -> println("Buzz")
            else -> println(number)
        }
    }
}