//Lambda
var converter: (Int) -> String = {number: Int -> "$number"}

//Higher-order function
fun strigRepresentation(array: Array<Int>, stringCoverter: (Int) -> String): String {
    var representation: String = "-"

    array.forEach { representation.plus("${stringCoverter(it)}-") }

    return representation
}

fun main(args: Array<String>) {
    val numbers: Array<Int> = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)

    println(strigRepresentation(numbers, ::converter))
}