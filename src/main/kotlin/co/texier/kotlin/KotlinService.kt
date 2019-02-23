package co.texier.kotlin

class KotlinService {

    data class Person(val name: String, val age: Int)

    fun sayHello() {
        println("Kotlin says 'Hello World!'")

        val alice: Person = Person("Alice", 29)
        println(alice)
        println(alice.age)
        println(alice.name)
    }

}