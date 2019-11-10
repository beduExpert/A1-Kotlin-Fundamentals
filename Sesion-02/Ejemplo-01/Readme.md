## Ejemplo 1: Tipos de funciones - Kotlin Fundamentals.

### OBJETIVO

- Aprender a utilizar los diferentes tipos de funciones en kotlin.
- Tener un acercamiento a la programacion funcional.

#### REQUISITOS

1. Conocer los diferentes tipos de datos y operadores en kotlin.
2. Tener conocimientro previo sobre arreglos, matrices y vectores.

#### DESARROLLO

### FUNCIONES

Ahora que ya hemos visto los tipos de datos y operadores de kotlin es momento de conocer que son y para 
que nos sirven las funciones.

Imagina (pensando en codigo) que tienes que realizar determinada accion mas de una vez, seria complicado 
e incorrecto tener que replicar el codigo encargado de realizar dicha accion cada vez que lo necesitemos,
para solucionar esto, podriamos escribir solo una vez este codigo y solo invocarlo cada que lo necesitemos
sin tener que volver a escribirlo.

Una funcion o metodo es un bloque de codigo ejecutable, es decir ese conjunto de instucciones se ejecutaran 
solo hasta que sea invocada la funcion que las contiene.

En kotlin se usa la palabra reservada **fun** para declarar las funciones.
```kotlin
	fun crearSaludo(nombre: String): String {
		return "Hola $nombre Bienvenido al curso de fundamentos de kotlin."
	} 

	println(crearSaludo())
```
Una funcion consta de varios elementos importantes: nombre, argumentos, tipo de retorno, sentencia de retorno, veamos cada una a detalle.

>Esta funcion solo se encarga de imprimir en consola un mensaje de bienvenida, la funcion solo consta de el nombre, es decir, se declara    
>con la palabra reservada **fun** seguido del nombre **saludar**, los parentesis indican el lugar donde van los argumentos (enseguida lo 
>veremos) y por ultimo, entre las llaves van todas las sentencias de codigo que va a ejecutar eta funcion cuando sea invocada.
```kotlin
	fun saludar() {
		println("Hola BEDU!")
	}
```
>Ahora, si necesitamos utilizar esa funcion saludar, pero para saludar a cualquier nombre que introduzcamos, lo haremos por medio de los 
>argumentos de la funcion, los cuales podemos nombrar de la siguiente forma **nombre: String**, como puedes ver, del lado izquierdo del 
>argumento va el nombre de tu argumento y del lado derecho el tipo de dato.
```kotlin
	fun saludar(nombre: String) {
		println("Hola $nombre")
	}
```
>Lo ultimos dos elementos (tipo de retorno y sentencia de retoro) son muy importantes ya qye nos permiter usar nuestra funcion
>como una expresion, es decir, nuestra funcion va a tener un valor del cual indicaremos su tipo colocando **:** despues de los parentesis 
>seguido de el tipo de dato que va acontener nuestra funcion.
```kotlin
	fun saludar(nombre): String {
		println("Hola $nombre")
	}
```
>Pero eso no es todo, es necesario que al colocar un tipo de retorno en nuestra funcion coloquemos tambien una instruccion de retorno, de
>lo contrario el precompilador de kotlin indicara un error **las funciones que retornan algun valor, siempre llevaran el tipo de retorno**
>**junto con la instruccion de retorno**
```kotlin
	fun saludar(nombre: String): String {
		return "Hola $nombre"
	}
```
Nota que ahora en lugar de imprimir un String estamos **retornando** un String, ahora nuestra funcion tiene el valor de ese String lo que quiere decir que la podemos usar como si fuese una expresion.
>Podriamos imprimir el saludo de la siguiente forma, dentro de la funcion println() **invocamos** nuestra funcion saludar colocando el 
>nombre de la funcion segui de los parentesis (lo qe indica que queremos que se ejecute) pasandole como parametro un nombre, entonces la 
>funcion println() va a imprimir lo que vale la funcion saludar y por supuesto, la funcion saludar vale lo que la misma retorna.
```kotlin
	println(saludar("Tu Nombre"))
```

Bien, ya conocemos la anatomia de una funcion, ahora veamos los tipos de funciones que nos ofrece kotlin y sus formas de declaralas y usarlas, estos son los tipos de funciones:

- Single-expression functions.
- Top level functions.
- Local functions.
- Member functions.
- Hig-order functions.

#### Single-expression functions

Cuando una funcion retorna una sola expresion es decir una expresion de una sola linea, las llaves **{}** pueden ser omitidas y el cuerpo de la funcion se define despues del signo **=**
>Notese que la funcion recibe dos parametros (a y b) los cuales se tienen que sumar, tambien se coloca el tipo de retorno como Int, 
>esto quiere decir que la funcion retornara la suma de a y b.
```kotlin
	fun sumar(a: Int, b: Int): Int = a + b
```
>En este tipo de funciones es posible tambien omitir el tipo de retorno, ya que se trata de una single-espression function.
```kotlin
	fun sumar(a: Int, b:Int) = a + b
```

### Top level functions

En kotlin a diferencia de otros lenguajes de programacion, como java por elemplo, no es neceario que declaremos una clase (prnto hablaremos de ellas) para contener una funcion, es decir, en cualquier parate de tu codigo puedes declarar una funcion y esta va se accesible desde cualquier clase, o incluso desde cualquier otra funcion, estas son las Top level functions.
>Observa que decalramos nuestra funcion fuera de la **clase** Persona.
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
Como podemos ver la funcion saludar no esta dentro de la clase Persona per esta siendo invocada dentro de la misma, no te preocupes si no entiendes las clases, pronto veremos a detalle lo que son y para que nos sirven.

### Local functions

Kotlin nos permite tambien declarar funciones dentrode otras funciones, las cuale solo son accesibles dentro de la funcion que las contiene.
```kotlin
	fun saludar(nombre: String) {
		fun crearSaludo(nombreParaSaludo: String): String {
			return "Hola $nombreParaSaludo"
		}

		println(crearSaludo(nombre))
	}
```

### Member functions

Este tipo de funciones si son declaradas dentro de una clase, y la forma de acceder a ellas es por medio de una instancia de la clase y con un punto, ejemplo:
>Declaramos una clase y dentro de la misma una funcion.
```kotlin
	class Calculadora {
		fun sumar(a: Int, b: Int): Int {
			return a + b
		}
	}
```
>Para hacer una instacia de la clase Calculadora lo hacemos con parentesis, despues para accesar a la funcion sumar lo hacemos con un **.**
>e invocamos la funcion con parentesis como ya lo habiamos visto anteriormente.
```kotlin
	val suma = Calculadora().sumar(5, 4)
```

### Hig-order functions


