## Ejemplo 1: Tipos de funciones - Kotlin Fundamentals.

### OBJETIVO

- Aprender a utilizar los diferentes tipos de funciones en kotlin.
- Reconocer algunas bases de la programación funcional.

#### REQUISITOS

1. Conocer los diferentes tipos de datos y operadores en kotlin.
2. Tener conocimientro previo sobre arreglos, matrices y vectores.

#### DESARROLLO

### FUNCIONES

Ahora que ya hemos visto los tipos de datos y operadores de Kotlin es momento de conocer qué son y para 
que nos sirven las funciones.

Imagina (pensando en código) que tienes que realizar determinada acción mas de una vez. Sería complicado 
e incorrecto tener que replicar el código encargado de realizar dicha acción cada vez que lo necesitemos. Para solucionarlo, podríamos escribir solo una vez este codigo e invocarlo cada que lo necesitemos
sin tener que volver a escribirlo.

Una función o método es un bloque de código ejecutable, es decir, ese conjunto de instucciones se ejecutarán 
solo cuando sea invocada la función que las contiene.

En Kotlin se usa la palabra reservada **fun** para declarar las funciones.
```kotlin
	fun crearSaludo(nombre: String): String {
		return "Hola $nombre Bienvenido al curso de fundamentos de kotlin."
	} 

	println(crearSaludo())
```
Una función consta de varios elementos importantes: nombre, argumentos, tipo de retorno, sentencia de retorno. Veamos cada una a detalle.

>Esta función solo se encarga de imprimir en consola un mensaje de bienvenida, la función solo consta de el nombre, es decir, se declara    
>con la palabra reservada **fun** seguido del nombre **saludar**, los parentesis indican el lugar donde van los argumentos (enseguida lo 
>veremos) y por último, entre las llaves, van todas las sentencias de código que va a ejecutar esta funcion cuando sea invocada.
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
>Los últimos dos elementos (tipo de retorno y sentencia de retoro) son muy importantes, ya que nos permiter usar nuestra función
>como una expresion, es decir, nuestra función va a tener un valor, del cual indicaremos su tipo colocando **:** después de los paréntesis 
>seguido del tipo de dato que va a contener nuestra función.
```kotlin
	fun saludar(nombre): String {
		println("Hola $nombre")
	}
```
>Pero eso no es todo, es necesario que al colocar un tipo de retorno en nuestra función, coloquemos también una instrucción de retorno, de
>lo contrario el precompilador de kotlin indicará un error **las funciones que retornan algun valor, siempre llevarán el tipo de retorno**
>**junto con la instrucción de retorno**
```kotlin
	fun saludar(nombre: String): String {
		return "Hola $nombre"
	}
```
Nota que ahora en lugar de imprimir un String estamos **retornando** un String, Nuestra funcion tiene el valor de ese String lo que quiere decir que la podemos usar como si fuese una expresión.
>Podríamos imprimir el saludo de la siguiente forma, dentro de la funcion println() **invocamos** nuestra función **saludar** colocando el 
>nombre de la función seguido de los paréntesis (lo que indica que queremos que se ejecute) pasándole como parámetro un nombre, entonces la 
>funcion println() va a imprimir lo que vale la función saludar y por supuesto, la función saludar vale lo mismo que retorna.
```kotlin
	println(saludar("Tu Nombre"))
```

Bien, ya conocemos la anatomía de una función, ahora veamos los tipos de funciones que nos ofrece kotlin y sus formas de declaralas y usarlas, estos son los tipos de funciones:

- Single-expression functions.
- Top level functions.
- Local functions.
- Member functions.
- Higher-order functions.

#### Single-expression functions

Cuando una función retorna una sola expresión, es decir, una expresión de una sola línea, las llaves **{}** pueden ser omitidas y el cuerpo de la función se define después del signo **=**
>Nótese que la función recibe dos parámetros (a y b) los cuales se tienen que sumar, también se coloca el tipo de retorno como Int, 
>esto quiere decir que la función retornara la suma de a y b.
```kotlin
	fun sumar(a: Int, b: Int): Int = a + b
```
>En este tipo de funciones es posible tambien omitir el tipo de retorno, ya que se trata de una single-espression function.
```kotlin
	fun sumar(a: Int, b:Int) = a + b
```

### Top level functions

En kotlin, a diferencia de otros lenguajes de programación, como java por elemplo, no es neceario que declaremos una clase (pronto hablaremos de ellas) para contener una función. Es decir, en cualquier parte de tu código puedes declarar una función y esta va ser accesible desde cualquier clase, o incluso desde cualquier otra función, estas son las Top level functions.
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
>Para hacer una instacia de la clase Calculadora lo hacemos con parentesis, después para accesar a la función sumar, lo hacemos con un **.**
>e invocamos la función con paréntesis como ya lo habiamos visto anteriormente.
```kotlin
	val suma = Calculadora().sumar(5, 4)
```

### Lambdas y Higher-order functions

#### Lambdas

En otros lenguajes son conocidas como funciones anónimas o funciones literales, es decir, es una función que no tiene nombre. Para declarar una función de este tipo, tenemos que seguir la siguiente notación:
>Las sentencias de nuesta función van entre llaves **{}** y es importante que al final de estas se coloquen
>parentesis.
```kotlin
	{println("Hola BEDU!")}()
```
Así de simple. Algo importante es que si queremos ejecutar nuestra función tenemos que asignarla a una variable:
>Asignamos nuestra lambda a la variable **saludo**
```kotlin
	var saludo = {println("Hola BEDU")}()

	//Ejecutamos nuestra funcion lambda
	saludo()
```
Ahora bien, te preguntarás, ¿qué pasa con los parámetros en las funciones lambda?, pues simple, a la hora de declarar nuestras funciones lambda vamos a separar los parámetros de las sentencias con **->** entonces del lado izquierdo van nuestros parámetros y del lado derecho las sentencias.
>asignamos una funcion lambda que hace una suma de dos números a la variable sumar:
```kotlin
	var suma = {a: Int, b: Int -> a + b}

	//Ejecutamos nuestra lambda mandandole dos numeros como parametros
	print(suma(4, 5))
```
Si observas, nuestra función recibe dos numeros y con **->** le decimos que va a retornar la suma de los mismos.

#### Higher-order functions

Cuando hablamos de este tipo de funciones tenemos que hacer referencia a la programacion funcional, es un tema mas complejo pero es importante que desde ahora veas la importancia del tema ya que kotlin esta pensado para ser usado en programacion funcional.

Entonces, recordemos que podemos enviar parámetros a una función, pues bien, las Higher-order functions aparte de poder recibir variables como parámetros, también pueden recibir **funciones** como parámetros e incluso retornarlas.

Para declarar una función de orden superior, vamos a usar la notación que ya conocemos, con la diferencia de que dentro de los paréntesis (donde van nuestros parametros) por una parte van los parametros y por otra va la función que recibirá nuestra Higher-order function. Hay que tomar en cuenta que la función que va como parámetro la vamos a escribir con la notación de lambda. Ojo con lo que sigue, los parámetros "tradicionales" son los que van a entrar a nuestra lambda, ejemplo:
>Función de orden superior que recibe dos numeros enteros y una función lambda que va a sumar esos números:
```
	fun sumaOrdenSuperior(a: Int, b: Int, suma: (Int, Int) -> Int) -> Int {
		return suma(a, b)
	}

```
Analizemos el ejemplo de arriba:
>Declaramos una funcion de orden superior **sumaOrdenSuperior**
```kotlin
	fun sumaOrdenSuperior() {

	}
```
>Pasamos como parámetros dos variables del tipo Int
```kotlin
	fun sumaOrdenSuperior(a: Int, b: Int) {

	}
```
>También, como parámetro pasamos una lambda, que va a indicar la estructura del tipo de funcion que va a recibir 
>nuestra Higher-order function, es decir, esta función de orden superior va a poder recibir cualquier función que 
>cumpla con esa estructura.
```kotlin
	fun sumaOrdenSuperior(a: Int, b: Int, suma: (Int, Int) -> Int) {

	}
```
Como nuestra función **suma** está retornando un valor entero, entonces nuestra función de orden superior también tendría que hacerlo, existirán casos en los que no tengan que tener el mismo tipo de retorno, pero eso depende mucho de la solución que tengamos que hacer.
>Colocamos el tipo de retorno de nuestra funcion de orden superior igual al de nuestra funcion que va como 
>parámetro, y por último retornamos la función suma con los parametros que recibimos.
```kotlin
	fun sumaOrdenSuperior(a: Int, b: Int, suma: (Int, Int) -> Int): Int {
		return suma(a, b)
	}
```
Y entonces, ¿para qué nos sirven las funciones de orden superior?. Hagamos un ejemplo con un caso real. Supongamos que tenemos que hacer una calculadora, tenemos que hacer suma, resta y multiplicación de dos números, tendríamos que hacer una función para cada operación, ¿cierto?, lo tenemos que hacer, pero combinando el uso de lambdas y las funciones de orden superior. Podemos hacerlo tan sencillo que al principio lo vas a dudar, veamos el ejemplo:
```kotlin
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
```
Si observas, estamos reutilizando código para hacer nuestras operaciones, y ya que las tres funciones que declaramos para cada una de nuestras operaciones cumplen con la misma estructura, podemos usarlas de la misma forma con nuestra función de orden superior. Usamos **::** para indicar que los parámetros que lleva nuestra Higher-order function se van a pasar a nuestra función que va como parámetro.

¡No lo olvides! Es importante que siempre vayas a la documentacion oficial de kotlin, ahí encontrarás recursos útiles y podrás profundizar en el tema.

Ahora ve al [Reto 01](/../../tree/master/Sesion-02/Reto-01) y complétalo con lo que acabas de aprender. 
**¡Mucho éxito!**
