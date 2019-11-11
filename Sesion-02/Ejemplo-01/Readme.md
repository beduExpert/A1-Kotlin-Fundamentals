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
- Higher-order functions.

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

### Lambdas y Higher-order functions

#### Lambdas

En otrs lenguages son conocidas como funciones anonimas o funciones literales, es decir, es una funcion que no tiene nombre, para declarar una funcion de este tipo, tenemos que seguir la siguiente notacion:
>Las sentencias de nuesta funcion van entre llaves **{}** y es importante que al final de estas se coloquen
>parentesis.
```kotlin
	{println("Hola BEDU!")}()
```
Asi de simple, ahora, algo importante es que si queremos ejecutar nuestra funcion tenemos que asignarla a una variable:
>Asignamos nuestra lambda a la variable **saludo**
```kotlin
	var saludo = {println("Hola BEDU")}()

	//Ejecutamos nuestra funcion lambda
	saludo()
```
Ahora bien, te preguntaras, que pasa con los parametros en las funciones lambda?, pues simple, a la hora de declarar nuestras funciones lambda vamos a separar los parametros de las sentencias con **->** entonces del lado izquierdo van nuestros parametros y del lado derecho las sentencias.
>asignamos una funcion lambda que hace una suma de dos numeros a la variable sumar:
```kotlin
	var suma = {a: Int, b: Int -> a + b}

	//Ejecutamos nuestra lambda mandandole dos numeros como parametros
	print(suma(4, 5))
```
Si observas, nuestra funcion recibe dos numeros y con **->** le decimos que va a retornar la suma de los mismos.

#### Higher-order functions

Cuando hablamos de este tipo de funciones tenemos que hacer referencia a la programacion funcional, es un tema mas complejo pero es importante que desde ahora veas la importancia del tema ya que kotlin esta pensado para ser usado en programacion funcional.

Entonces, recordemos que podemos enviar parametros a una funcion, pues bien, las Higher-order functions aparte de poder recibir variables como parametros tambien pueden recibir **funciones** como parametros e incluso retornarlas.

Para declarar una funcion de orden superior vamos a usar la notacion que ya conocemos, con la diferencia de que dentro de los parentesis (donde van nuestros parametros) por una parte van los parametros y por otra va la funcion que recibira nuestra Higher-order function, hay que tomar en cuanta que la funcion que va como parametro la vamos a escribir con la notacion de lambda ojo con lo que sigue, los parametros "tradicionales" son los que van a entrar a unuestra lambda, ejemplo:
>Funcion de orden superior que recibe dos numeros enteros y una funcion lambda que va a sumar esoso numeros:
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
>Pasamos como parametros dos variables del tipo Int
```kotlin
	fun sumaOrdenSuperior(a: Int, b: Int) {

	}
```
>Tambien como parametro pasamos una lambda que va a indicar la estructura del tipo de funcion que va a recibir 
>nuestra Higher-order function, es decir esta funcion de orden superior va a poder recibir cualquier funcion que 
>cumpla con esa estructura.
```kotlin
	fun sumaOrdenSuperior(a: Int, b: Int, suma: (Int, Int) -> Int) {

	}
```
Como nuestra funcion **suma** esta retornando un valor entero, entonces nuestra funcion de orden superior tambien tendria que hacerlo, existiran casos en los que no tengan que tener el mismo tipo de retorno, pero eso depende mucho de la solucion que tengamos que hacer.
>Colocamos el tipo de retorno de nuestra funcion de orden superior igual al de nuestra funcion que va como 
>parametro. y por ultimo retornamos la funcion suma con los parametros que recibimos.
```kotlin
	fun sumaOrdenSuperior(a: Int, b: Int, suma: (Int, Int) -> Int): Int {
		return suma(a, b)
	}
```
Y entonces, pra que nos sirven las funciones de orden superior?, hagamos un ejemplo con un caso real, supongamos que tenemo que hacer una calculadora, tenemos que hacer suma, resta y multiplicacion de dos numeros, tendriamos que hacer una funcion para cada operacion, cierto, lo tenemos que hacer, pero combinando el uso de lambdas y las funciones de orden superior podemos hacerlo tan cencillo que al principio lo vas a dudar, veamos el ejemplo:
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
Si observas estamos resutilizando codigo para hacer nuestras operaciones, y ya que las tres funciones que decalramos para cada una de nuestras operaciones cumplen con la misma estructura podemos usarlas de la misma forma con nuestra funcion de orden superior, usamos **::** para indicar que los parametros que lleva nuestra Higher-order function se van a pasar a nuestra funcion que va como parametro.

Es importante que siempre vallas a la documentacion oficial de kotlin, ahi encontraras recursos utiles y profundizacion en el tema.

Hahora ve al [Reto 01](/../../tree/master/Sesion-02/Reto-01) y completalo con lo que acabas de aprender.
