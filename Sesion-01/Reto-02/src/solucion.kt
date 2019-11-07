fun main(args: Array<String>) {

    /*
    * Tipos de datos
    */

    var mes:Byte = 12
    println("Mes: $mes")

    var año:Short = 2019
    println("Año: $año")

    var unMillon:Int = 1000000
    println("Millon: $unMillon")

    var cienMillones:Long = 100000000
    println("cienMillones: $cienMillones")

    var redColor = 0xff0000
    println("Red color: $redColor")

    var binBedu = 0b01000010_01000101_01000100_01010101
    println("BEDU en binario: $binBedu")

    var uMes: UByte = 12u
    println("Mes sin signo $uMes")

    var uAño: UShort = 2019u
    println("Año sin signo: $uAño")

    var uMillon: UInt = 1000000u
    println("Millon sin signo: $uMillon")

    var uCienMillones: ULong = 100000000u
    println("Cien millones sin signo: $uCienMillones")

    var arroba: Char = '@'
    println("arroba: $arroba")

    var aprendiendo: Boolean = true
    println("Estoy aprendiendo kotlin? $aprendiendo")

    var meses:Array<String> = arrayOf("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre")
    meses.forEach { println("Mes: $it") }

    var mensaje:String = "Hola BEDU!"
    println(mensaje)

    /*
    * Operadores
    */

    var A:Int = 5
    var B:Int = 10
    var numbers:Array<Int> = arrayOf(1, 2, 3, 4, 5)
    var yes:Boolean = true

    A.inc()
    B.dec()
    yes.not()
    println("A: $A, B: $B, YES: $yes")

    A.unaryPlus()
    B.unaryMinus()
    println("A: $A, B: $B")

    A.plus(B)
    A.minus(B)
    println("A: $A, B: $B")

    A.times(B)
    B.div(A)
    println("A: $A, B: $B")

    A.rem(B)
    A.rangeTo(B)
    println("A: $A, B: $B")

    println("A esta en numbers? ${numbers.contains(A)}")
    println("A no esta en numbers? ${!numbers.contains(A)}")

    println("Primer elemento en numbers: ${numbers.get(0)}")
    numbers.set(numbers.size - 1, 6)
    numbers.forEach { println(it) }

    println("A es igual a B? ${A.equals(B)}")
    println("A no es igual a B? ${!A.equals(B)}")

    println("A es mayor a B? ${A.compareTo(B) > 0}")
    println("A es menor a B? ${A.compareTo(B) < 0}")
    println("A es mayor o igual a B? ${A.compareTo(B) >= 0")
    println("A es menor o igual a B? ${A.compareTo(B) <= 0}")
    
}