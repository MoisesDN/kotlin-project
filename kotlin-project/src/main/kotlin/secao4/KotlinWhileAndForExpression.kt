package br.com.moisesdias.secao4

fun main() {
    var x = 0
    while (x < 10) {
        println("x = $x")
        x += 3
    }

    do {
        println("x do-while = $x")
        x -= 3
    } while (x > 0)

    for (item in 1 .. 10) {
        //item++
        println("$item, ")
    }

    for (ch in "Moises") {
        println(ch)
    }
}