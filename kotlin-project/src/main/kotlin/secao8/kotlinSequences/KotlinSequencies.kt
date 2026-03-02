package br.com.moisesdias.secao8.kotlinSequences


fun main() {

    val students = getStudents()

    val sqStudents = students.drop(1).take(3).toList()

    println("Sequence students: $sqStudents")

    val numbers = generateSequence(100) { it + 1}

    println("Sequence numbers: ${numbers.drop(5).take(7).toList()}")

}