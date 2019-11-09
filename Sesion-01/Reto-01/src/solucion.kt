val PI = 3.1416

fun main(args: Array<String>) {

    // Declaracion de variables
    // Variable de asignacion inmediata

    val mes:String = "Enero"

    // Variable de asignacion mutable

    var dia:Int = 0

    // Variable con tipo de dato inferido

    var año = 1019

    // Variable no inicializada

    var pais: String

    // Variable Changeable

    var texto:String = "Texto 1"
    texto = "Textto 2"

    // Variable Unchangeable

    val fechaNacimiento: String = "01/01/19990"
    fechaNacimiento = "01/01/19992"

    // Operaciones

    val a = 10
    var b = 11

    println(a + b)
    println(a - b)
    println(a * b)
    println(a / b)
    println(a % b)
    println(a ..b)

    println(a.plus(b))
    println(a.minus(b))
    println(a.times(b))
    println(a.div(b))
    println(a.rem(b))
    println(a.rangeTo(b))


}