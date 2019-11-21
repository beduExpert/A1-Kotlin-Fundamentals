## Ejemplo 1: Tipos de funciones - Kotlin Fundamentals.

### OBJETIVO

- Aprender a utilizar los diferentes tipos de funciones en kotlin.
- Reconocer algunas bases de la programación funcional.

#### REQUISITOS

1. Conocer los diferentes tipos de datos y operadores en kotlin.
2. Tener conocimiento previo sobre arreglos, matrices y vectores.

#### DESARROLLO

### FUNCIONES

Ahora que ya hemos visto los tipos de datos y operadores de Kotlin es momento de conocer qué son y para qué nos sirven las funciones.
Imagina (pensando en código) que tienes que realizar determinada acción más de una vez. Sería complicado e incorrecto tener que replicar el código encargado de realizar dicha acción cada vez que lo necesitemos. Para solucionarlo, podríamos escribir solo una vez este código e invocarlo cada que lo necesitemos sin tener que volver a escribirlo.
Una función o método es un bloque de código ejecutable, o sea, ese conjunto de instrucciones se ejecutarán solo cuando sea invocada la función que las contiene.
En Kotlin se usa la palabra reservada **fun** para declarar las funciones.
```kotlin
	fun crearSaludo(nombre: String): String {
		return "Hola $nombre Bienvenido al curso de fundamentos de kotlin."
	} 

	println(crearSaludo())
```
Una función consta de varios elementos importantes: nombre, argumentos, tipo de retorno, sentencia de retorno. Veamos cada una a detalle.

>Esta función solo se encarga de imprimir en consola un mensaje de bienvenida, la función solo consta del nombre, es decir, se declara    
>con la palabra reservada **fun** seguido del nombre **saludar**, los paréntesis indican el lugar donde van los argumentos (enseguida lo 
>veremos) y por último, entre las llaves, van todas las sentencias de código que va a ejecutar esta función cuando sea invocada.
```kotlin
	fun saludar() {
		println("Hola BEDU!")
	}
```
>Ahora, si necesitamos utilizar esa función **saludar**, para saludar a cualquier nombre que introduzcamos, lo haremos por medio de los 
>argumentos de la función, los cuales podemos nombrar de la siguiente forma **nombre: String**. Como puedes ver, del lado izquierdo  
> va el nombre de tu argumento y del lado derecho el tipo de dato.
```kotlin
	fun saludar(nombre: String) {
		println("Hola $nombre")
	}
```
>Los últimos dos elementos (tipo de retorno y sentencia de retorno) son muy importantes, ya que nos permiten usar nuestra función
>como una expresión, es decir, nuestra función va a tener un valor, del cual indicaremos su tipo colocando **:** después de los paréntesis 
>seguido del tipo de dato que va a contener nuestra función.
```kotlin
	fun saludar(nombre): String {
		println("Hola $nombre")
	}
```
>Pero eso no es todo, es necesario que al colocar un tipo de retorno en nuestra función, coloquemos también una instrucción de retorno. De
>lo contrario el precompilador de kotlin indicará un error **las funciones que retornan algún valor, siempre llevarán el tipo de retorno**
>**junto con la instrucción de retorno**
```kotlin
	fun saludar(nombre: String): String {
		return "Hola $nombre"
	}
```
Nota que ahora en lugar de imprimir un String estamos **retornando** un String. Nuestra función tiene el valor de ese String, lo que quiere decir que la podemos usar como si fuese una expresión.
>Podríamos imprimir el saludo de la siguiente forma, dentro de la función println() **invocamos** nuestra función **saludar** colocando el 
>nombre de la función seguido de los paréntesis (lo que indica que queremos que se ejecute) pasándole como parámetro un nombre. Entonces la 
>funcion println() va a imprimir lo que vale la función saludar y por supuesto, la función saludar vale lo mismo que retorna.
```kotlin
	println(saludar("Tu Nombre"))
```

Bien, ya conocemos la anatomía de una función, ahora veamos los tipos de funciones que nos ofrece kotlin y sus formas de declararlas y usarlas, estos son los tipos de funciones:
- Single-expression functions.
- Top level functions.
- Local functions.
- Member functions.
- Higher-order functions.

#### Single-expression functions

Cuando una función retorna una sola expresión, es decir, una expresión de una sola línea, las llaves **{}** pueden ser omitidas y el cuerpo de la función se define después del signo **=**
>Nótese que la función recibe dos parámetros (a y b) los cuales se tienen que sumar. También se coloca el tipo de retorno como Int, 
>esto quiere decir que la función retornará la suma de a y b.
```kotlin
	fun sumar(a: Int, b: Int): Int = a + b
```
>En este tipo de funciones es posible también omitir el tipo de retorno, ya que se trata de una single-espression function.
```kotlin
	fun sumar(a: Int, b:Int) = a + b
```

### Top level functions

En kotlin, a diferencia de otros lenguajes de programación, como java por ejemplo, no es necesario que declaremos una clase (pronto hablaremos de ellas) para contener una función. Es decir, en cualquier parte de tu código puedes declarar una función y esta va a ser accesible desde cualquier clase, o incluso desde cualquier otra función, estas son las Top level functions.
>Observa que declaramos nuestra función fuera de la **clase** Persona.
```kotlin
	fun saludar(nombre: String) {
		println("Hola $nombre")
	}

	class Persona constructor(nombre: String) {
		fun decirHola() {
			saludar(nombre)
		}
	}
``` 
Como podemos ver, la función saludar no está dentro de la clase Persona, pero está siendo invocada dentro de la misma. No te preocupes si no entiendes las clases, pronto veremos a detalle lo que son y para qué nos sirven.

### Local functions

Kotlin nos permite también declarar funciones dentro de otras funciones, las cuales solo son accesibles dentro de la función que las contiene.
```kotlin
	fun saludar(nombre: String) {
		fun crearSaludo(nombreParaSaludo: String): String {
			return "Hola $nombreParaSaludo"
		}

		println(crearSaludo(nombre))
	}
```

### Member functions

Este tipo de funciones sí son declaradas dentro de una clase, y la forma de acceder a ellas es por medio de una instancia de la clase y con un punto, ejemplo:
>Declaramos una clase y dentro de la misma una función.
```kotlin
	class Calculadora {
		fun sumar(a: Int, b: Int): Int {
			return a + b
		}
	}
```
>Para hacer una instancia de la clase Calculadora lo hacemos con paréntesis, después para accesar a la función sumar, lo hacemos con un **.**
>e invocamos la función con paréntesis como ya lo habíamos visto anteriormente.
```kotlin
	val suma = Calculadora().sumar(5, 4)
```

¡No lo olvides! Es importante que siempre vayas a la documentación oficial de kotlin. Ahí encontrarás recursos útiles y podrás profundizar en el tema.

Ahora ve al [Reto 01](/../../tree/master/Sesion-02/Reto-01) y complétalo con lo que acabas de aprender. 
**¡Mucho éxito!**
