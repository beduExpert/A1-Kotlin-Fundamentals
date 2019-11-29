// Class Person
class Person {
    val name: String?
    var visitedCities: List<String?>?
}

// Main function
fun main(args: Array<String>) {
    // First person
    val me = Person().apply {
        name = "My Name"
        visitedCities = listOf("Mexico", null, "Brasil")
    }

    me.visitedCities?.forEach {
        println("Cities -> ${it ?: throw IllegalArgumentException("empty city")}")
    }

    // Second person
    val you = Person()
    val name = you.name ?: fail("No name")

    // Exception function
    fun fail(message: String): Nothing {
        throw IllegalArgumentException(message)
    }

}