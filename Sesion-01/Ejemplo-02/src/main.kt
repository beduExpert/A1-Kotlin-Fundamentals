import com.sun.org.apache.xpath.internal.operations.Bool

fun main(args: Array<String>) {

    // Numeros (Numbers)

    val bite: Byte = 127 // 8 bits
    val short: Short = 1234 // 16 bits
    val int: Int = 324 // 32 bits
    val long: Long = 1000000000000 // 64 bits

    // Constantes Literales (Literal constants)

    val decimal = 123
    val hexadecimal = 0x0F
    val binario = 0b00001011

    // Numeros con punto flotante (floating-point numbers)

    val double: Double = 123.5
    val float: Float = 123.5f

    // Enteros sin signo (Unsigned integers)

    val uByte: UByte = 1u
    val uShort: UShort = 2u
    val uInt: UInt = 3u
    val uLong: ULong = 4u

    // Caracteres (Characters)

    val letra: Char = 'A'
    val escapeSecuence: Char = '\t'
    val unicode: Char = '\uFF00'

    println("Char " + unicode)

    // Boleanos (Booleans)

    val si: Boolean = true
    val no: Boolean = false

    // Arreglos (Arrays)

    val numeros: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val vocales: Array<String> = arrayOf("A", "B", "C", "D", "E")
    val numerosString: Array<String> = Array(5) { i -> (i * i).toString() }
    val numerosString2: Array<String> = Array(5) { i -> i.times(i).toString() }

    numeros.forEach { println(it) }
    vocales.forEach { println(it) }
    numerosString.forEach { println(it) }
    numerosString2.forEach { println(it) }

    // Arreglos primitivos (Primitive Arrays)

    val iArray: IntArray = intArrayOf(5)
    var bArray: ByteArray = byteArrayOf(5, 6, 7, 8, 9)
    val sArray: ShortArray = shortArrayOf(123, 123, 123, 123, 123)

    // Cadenas de texto (Strings)

    val nombre: String = "Tu Nombre"
    nombre.forEach { println(it) }

    // Cadenas de texto literales (String literals)

    val escapingString: String = "Hola BEDU!\n"
    val rawString: String = """
        Hola, este es un rawString,
        y se puede escribir en varias lineas.
    """.trimIndent()

    // Templates (String templates)

    val edad: Int = 27
    println("Mi edad es $edad")

    val texto: String = "Hola BEDU!"
    println("texto tiene ${texto.length} caracteres")

    /*
    * Operadores
    */

    var a = 100
    val b = 120
    var c:Int = 12
    var d:Int = 23
    var yes = true

    // Operaciones Unarias (Unary operations)

    a.unaryPlus()
    a.unaryMinus()
    yes.not()

    // Incrementales y decrementles (Increments and decrements)

    a.inc()
    a.dec()

    // Operaciones binarias (Binary operations)

    a.plus(b)
    a.minus(b)
    a.times(b)
    a.div(b)
    a.rem(b)
    a.rangeTo(b)

    // Operador 'In' (In Operator)

    val numbersArray: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7)
    println(numbersArray.contains(a))
    println(!numbersArray.contains(a))

    // operador de acceso indexado (Indexed access operator)

    val secondNumber = numbersArray.get(1)
    numbersArray.set(numbersArray.size - 1, 8)

    // Asignaciones aumentadas (Augmented assignments)

    a += b
    a -= c
    a *= c
    a /= c
    a %= c

    // Operadores de Igualdad (Equality opoerators)

    if(a.equals(b)) {
       println("a es igual a b")
    }

    if (!a.equals(b)) {
        println("a no es igual a b")
    }

    // Operadores de comparacion

    println(a.compareTo(b))

    if (a.compareTo(b) > 0) {
        println("a es mayor que b")
    }

    if (a.compareTo(b) < 0) {
        println("a es menor que b")
    }

    if (a.compareTo(b) >= 0) {
        println("a es mayor o igual que b")
    }

    if (a.compareTo(b) <= 0) {
        println("a es menor o igual que b")
    }
}