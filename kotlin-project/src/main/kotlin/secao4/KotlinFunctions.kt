package br.com.moisesdias.secao4

import javax.sound.midi.MetaMessage

fun main() {
    println("10 + 20 = ${myMathFunction(10, 20)}")
    println("15 + 25 = ${myExpressionBodyMathFunction(15, 25)}")
    println("20 + 30 = ${myExpressionBodyMathFunctionWithInference(20, 30)}")
    println("Default SUM = ${myFunctionWithDefaultParameter(30, 15)}")
    println("Default SUM = ${myFunctionWithDefaultParameter(25, 15, "Hello")}")
    println("Default SUM = ${myFunctionWithDefaultParameter(message = "Hello")}")

}

fun myMathFunction(number1: Int, number2: Int): Int {
    return number1 + number2
}

fun myExpressionBodyMathFunction(number1: Int, number2: Int): Int = number1 + number2

fun myExpressionBodyMathFunctionWithInference(number1: Int, number2: Int) = number1 + number2

fun myFunctionWithDefaultParameter(number1: Int = 10, number2: Int = 10, message: String = "Hi"): Int {
    val results = number1 + number2
    println(message)
    return results
}