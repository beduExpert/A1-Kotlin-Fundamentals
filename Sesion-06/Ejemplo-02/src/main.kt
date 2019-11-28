fun Array<T>.myFunction(plus: Int) {
    this.forEach { println("${it + plus}") }
}

fun main(args: Array<String>) {
    val numbers: Array<Int> = arrayOf(0, 1, 2, 3, 4, 5, 6)

	numbers.myFunction(plus: 1)
}

fun <T> anyToString(val: T): String {
    return "$val"
}