fun main(args: Array<String>) {
    //Funcion normal
    fun crearSaludo(nombre: String): String {
		return "Hola $nombre Bienvenido al curso de fundamentos de kotlin."
	} 

    println(crearSaludo())
    
    //Funcion sin parametros, solo imprime mensaje en consola
    fun saludar() {
		println("Hola BEDU!")
    }
    
    //Funcion con parametro String
    fun saludar(nombre: String) {
		println("Hola $nombre")
    }
    
    //Funcion con valor de retorno 
    fun saludar(nombre: String): String {
		return "Hola $nombre"
    }
    
    //Funcion de una sola expresion
    fun sumar(a: Int, b: Int): Int = a + b

    //tipo de retorno inferido
    fun sumar(a: Int, b:Int) = a + b

    //Local function 
    fun saludar(nombre: String) {
		fun crearSaludo(nombreParaSaludo: String): String {
			return "Hola $nombreParaSaludo"
		}

		println(crearSaludo(nombre))
    }
    

    //Funcion Lambda
    var suma = {a: Int, b: Int -> a + b}

	//Ejecutamos nuestra lambda mandandole dos numeros como parametros
    print(suma(4, 5))
    
    //Funcion de orden superior
    //Declaramos nuestra funcion de orden superior

	fun calculadora(a: Int, b: Int, operacion: (Int, Int) -> Int): Int {
		return operacion(a, b)
	}

	//Funciones inline por cada una de nuestras operaciones

	fun suma(a: Int, b: Int) = a + b
	fun resta(a: Int, b: Int) = a - b
	fun multiplica(a: Int, b: Int) = a * b

	//Almacenamos el resultado de cada operacion en una variable

	val suma = calculadora(10, 5, ::suma)
	val restar = calculadora(10, 5, ::resta)
	val multiplicar = calculadora(10, 5, ::multiplicacion)

}

//Top-level function

fun saludar(nombre: String) {
    println("Hola $nombre")
}

class Persona constructor(nombre: String) {
    fun decirHola() {
        saludar(nombre)
    }
}

//Men¡mber function
class Calculadora {
    fun sumar(a: Int, b: Int): Int {
        return a + b
    }
}