package br.com.moisesdias.secao4

fun main() {
    val pizzasOrdered = 9

    when (pizzasOrdered) {
        0 -> println("Not hungry")
        1 -> println("Hungry")
        2 -> println("Very hungry")
        else -> println("Are you sure?")
    }

    when (pizzasOrdered) {
        0 -> println("Not hungry")
        1, 3 -> println("Hungry")
        4, 5 -> println("Very hungry")
        else -> println("Are you sure?")
    }

    when (pizzasOrdered) {
        0 -> println("Not hungry")
        in 1  .. 4 -> println("Hungry")
        in 5 .. 9 -> println("Very hungry")
        else -> println("Are you sure?")
    }

    when {
        pizzasOrdered <= 0 -> println("None ordered")
        pizzasOrdered % 2 == 1 -> println("Odd number ordered")
        pizzasOrdered % 2 == 0 -> println("Even number ordered")

    }


    when (pizzasOrdered) {
        Math.abs(pizzasOrdered) -> println("Ordered O or more pizzas")
        else -> println("Ordered less than 0 pizzas")
    }
}