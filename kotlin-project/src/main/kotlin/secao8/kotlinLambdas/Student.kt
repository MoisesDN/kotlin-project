package br.com.moisesdias.secao8.kotlinLambdas

data class Student(val name: String, val age: Int)

fun getStudents(): List<Student> {
    return listOf(
        Student("Alice", 20),
        Student("Bob", 22),
        Student("Charlie", 19),
        Student("Diana", 21)
    )
}