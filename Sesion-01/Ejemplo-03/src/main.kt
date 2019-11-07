fun main(args: Array<String>) {

    /*
     * Estructuras de control de flujo (Control flow)
     */

    // If

    val a = 5
    val b = 4
    var max = 0

    // Uso tradicional
    if (a > b) max = a

    // Uso con else
    if (a > b) {
        max = a
    } else {
        max = b
    }

    // Uso como expresion
    max = if (a > b) a else b

    // When

    val x = 1
    val validNumbers = arrayOf(1, 2, 3, 4)

    // forma mas basica
    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        else -> {
            print("x no es ni 1 ni 2")
        }
    }

    // Varios casos evaluados de la misma manera combinados con comas

    when (x) {
        0, 1 -> print("x == 0 o x == 1")
        else -> print("ninguno")
    }

    // Usando el operador In para determinar si un elemento pertenece a otro.

    when (x) {
        in 1..10 -> print("x esta en el rango")
        in validNumbers -> print("x es valido")
        !in 10..20 -> print("x no esta en el rango")
        else -> print("ninguno")
    }

    // For

    var nombres = arrayOf("Nombre Uno", "Nombre Uno", "Nombre Uno", "Nombre Uno", "Nombre Uno", "Nombre Uno")

    for ((index, value) in nombres.withIndex()) nombres[index] += "."

    //Iterando sobre un rengo

    for (i in 1..3) {
        println(i)
    }

    //Uso de forEach

    nombres.forEach { println(it) }

    // While

    //While y do..while se usan de la misma forma que en la gran mayoria de lenguages de programacion

    var z = 10
    var y: Int

    while (z > 0) {
        z--
    }

    do {
        val y = obtenerDatos()
    } while (y != null)

}

fun obtenerDatos(): Int {
    return 4
}