fun main(args: Array<String>) {

    //Funcion normal
    fun nombreCompleto(nombre: String, apellidos: String) {
        println("Hola $nombre $apellidos, bienvenido al cirso de fundamentos de kotlin")
    }

    //Funcion con retorno
    fun getFirstOf(numeros: Array<Int>) -> Int {
        return numeros.get(0)
    }

    val numeros = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8)
    val first = getFirstOf(numeros)
    println(first)

    //Single-expression function
    fun nombre(nombre: String, appellidos: String) = "$nombre $apellidos"

    //Local functions

    fun calcular(A: Int, B: Int) {
        fun suma(sA: Int, aB: Int) -> String {
            return "La suma de A + B es igual a ${a + b}"
        } 

        fun resta(rA: Int, rB: Int) -> String {
            return "La resta de A - B es igual a ${a - b}"
        } 
        fun multiplicacion(mA: Int, mB: Int) -> String {
            return "La multiplicacion de A * B es igual a ${a * b}"
        } 
        
        val A = 10
        val B = 5

        println(suma(A, B))
        println(resta(A, B))
        println(multiplicacion(A, B))
    }
}