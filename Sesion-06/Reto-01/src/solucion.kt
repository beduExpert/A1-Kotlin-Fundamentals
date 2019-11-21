fun Array<Int>.stringRepresentation(): String {
    var representation: String = "|"
    
    this.forEach { 
        representation.plus("$it|") 
    }

    return representation
}

fun Array<T>.stringRepresentationWithType(): String {
    var representation: String = "TYPE: "

    if (this.get(0) is String) {
        representation.plus("String |")
    }

    if (this.get(0) is Int) {
        representation.plus("Int |")
    }

    this.forEach { 
        representation.plus("$it|") 
    }

    return representation
}

fun main(args: Array<Int>) {
    val numbers: Array<Int> = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)

    println(numbers.stringRepresentation())
    println(numbers.stringRepresentationWithType())
}