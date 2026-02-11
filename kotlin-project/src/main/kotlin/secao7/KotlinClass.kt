package br.com.moisesdias.secao7

@Deprecated("Use the KotlinAnimalClass", ReplaceWith("KotlinAnimalClass"))
class Person internal constructor(firstName: String, lastName: String) {

    init {
        println("Created a new person named $firstName $lastName")
    }

    constructor(firstName: String, lastName: String, middleName: String) : this(firstName, lastName)
}