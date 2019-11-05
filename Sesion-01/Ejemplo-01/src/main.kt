fun main(args: Array<String>) {

    /*
    * Declaracion de variables
    */

    // Variables locales de asignacion inmediata
    val nombre: String = "Mi nombre"
    val edad: Int = 27

    // Tipo de dato inferido
    val apellido = "Mi apellido"
    val mes = 12

    // Variables no inicializadas (es necesario especificar el tipo)
    var direccion: String
    var numExt: Int

    /*
    * Variables tratadas con tipos primitivos
    */

    println(1)
    println(5 + 4)
    println(5 - 4)
    println(5 * 4)
    println(5 / 4)

    /*
    * Variables tratadas como objetos
    */

    val a = 5
    val b = 4

    println(a.plus(b))
    println(a.minus(b))
    println(a.times(b))
    println(a.div(b))

}

// Variables globales o Top-level
val PI = 3.1416

fun printPI() {
    println(PI)
}

// Variable de acceso local
fun multiplicar(a: Int, b: Int): Int {
    val result = a * b

    //Accediendo a una variable global
    println(PI)

    return  result
}