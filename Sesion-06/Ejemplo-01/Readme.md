## Ejemplo 2: Scope functions I - Kotlin Fundamentals

### OBJETIVO

- Conocer y entender la funcion que cumplen las scope functions en kotlin

#### REQUISITOS

1. Tener conocimiento previo sobre:
	- variables.
	- tipos de datos.
	- funciones.
	- lambdas.

#### DESARROLLO

Ya hemos visto en la sesion pasada Que son las scope functions, como hacemosr referencia al contexto del objeto que las invoca y que es lo que retorna cada una de las funciones, recordando sabemos que existen cinco scope functions:

- let
- run 
- with
- apply
- also

las funciones **run, with y apply** hacen referencia al contexto del objeto por medio de **this**, las funciones **let y also** hacen referencia al contexto del objeto por medio de **it**, las funciones **let, run, with** retornan el objeto del contexto como tal y las funciones **apply y also** retornan el resultado de la funcion.

Ahora veremos cada una de las funciones a detalle.

### let

Let se puede usar para invocar una o varias funciones en los resultados de cadenas de llamadas, usualmente se usan tambien para remplazar los bloques **if (object != null)**

```kotlin
	val numbers = mutableListOf("One", "Two", "Three")

	numbers.map { 
		it.length 
	}.filter { 
		it > 3 
	}.let {
		printl(it) 
	}
```
En el ejemplo anterior estamos usando la funcion map sobre una lista mutable y aplicamos un filtrado sobre el tamaño de la lista, con la funcion let imprimimos dicho valor solo si la lista es mayor que 3.

### with

Esta funcion se usa para llamar a funciones en el contexto del objeto sin proporcionar el resultado lambda, es decir, si lo trataramos de leer textualmente podriamos decir "con este objeto, haga lo sigiente".

```kotlin
	val numbers = mutableListOf("One", "Two", Three)
	val firstAndLast = with(numbers) {
		"First element -> ${fisrt()}, last element -> ${last()}"
	}

	print(firstAndLast)
```

En el ejemplo vemos que cuando usamos with dentro del bloque de codigo podemos llamar directamente a las funciones del objeto en contexto, a su vez tambien se esta infiriendo que retoranara una cadena de texto que construimos llamado las funciones first() y last().

### run

Esta funcion hace lo mismo que with pero se invoca como let, run es util cuando su lambda contiene tanto la inicializacion del objeto como el calculo del valor de retorno.

```kotlin
	var inserted: Boolean = run {
		val person: Person = getPerson()
    	val personDao: PersonDao = getPersonDao()
    	personDao.insert(person)
	}
```

En el ejemplo como podemos observar queremos saber si se inserto una persona o no en la base de datos, para esto run nos permite ejecutar un bloque de codigo y retornar el valor de la operacion de al final.

### apply

Esta funcion se usa para bloques de código que no devuelven un valor y operan principalmente en los miembros del objeto receptor. El caso común para apply es la configuración del objeto. Dichas llamadas pueden leerse como " aplicar las siguientes asignaciones al objeto". "

```kotlin
	val person = Person("Name").apply {
		age = 30
		city = "Mexico"
	}
```

Como podemos ver en el ejemplo creamos la una instancia de Person pero por medio de apply obtenemos el contexto del objeto inicializado para asignarle valor a sus propiedades, ya que el bloque se ejecuta dentro del contexto del objeto podemos acceder a las propiedades del objeto sin hacer referencia explicita a el mismo.

### also

also es bueno para realizar algunas acciones que toman el objeto de contexto como argumento. Usamos esta funcion para acciones adicionales que no alteren el objeto, como el registro o la impresión de información de depuración. Por lo general, también puede eliminar las llamadas de la cadena de llamadas sin romper la lógica del programa.

```kotlin
	val numbers mutableListOf("One", "Two", "Three")

	numbers.also {
		println("elementos antes de agregar uno nuevo: $it")
	}.add("Four")
```

Como podemos ver en realidad estamos agregando un nuevo elemento a la lista mutable numbers pero con el uso de also podemos imprimir los elemntos que contiene antes de agregar uno nuevo.

Ve al [Reto 1](/../../tree/master/Sesion-06/Reto-01) y resuelve los puntos que se presentan ahi con lo que has aprendido en la sesion anterior y en este ejemplo.
