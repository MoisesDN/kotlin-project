package br.com.moisesdias.secao8.kotlinSequences

data class Student(val name: String, val age: Int)

fun getStudents(): List<Student> {
    return listOf(
        Student("Aline", 20),
        Student("Bruno", 22),
        Student("Carlos", 19),
        Student("Daiane", 21),
        Student("Eden", 22),
        Student("Edward", 19)
    )
}