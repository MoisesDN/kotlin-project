package br.com.moisesdias.secao8.kotlinClosures

fun closureMarker(): () -> Unit {

    var num = 0

    return { println(num++) }
}

fun main() {
    val myCounter1 = closureMarker()
    val myCounter2 = closureMarker()

    myCounter1() // Output: 0
    myCounter1() // Output: 1
    myCounter1() // Output: 2
    myCounter2() // Output: 0
    myCounter2() // Output: 1
    myCounter2() // Output: 2
}