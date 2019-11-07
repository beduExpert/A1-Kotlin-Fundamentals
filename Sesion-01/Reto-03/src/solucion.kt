fun main(args: Array<String>) {
    val vocales = arrayOf("A", "E", "I", "O", "U")
    val letra = "A"
    var letraBuscada: String

    /*
     * Solucion Condicionales
     */

    letraBuscada = if (letra in vocales) letra else "X"
    println("letra buscada: $letraBuscada")

    var numeros: Array<Int> = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    val n1 = 4

    /*
     * Soluciones Ciclos
     */

    for (item: Int in numeros) {
        when (item) {
            n1 -> println("Cuatro")
            else -> println("Cualquier otro numero")
        }
    }

    numeros.forEach {
        when (it) {
            n1 -> println("Cuatro")
            else -> println("Cualquier otro numero")
        }
    }
}