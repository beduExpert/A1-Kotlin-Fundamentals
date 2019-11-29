
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

### Scope functions (funciones de alcance)

Kotlin en su biblioteca estandar contiene varias funciones que su objetivo solo es ejecutar un bloque de codigo en funcion del contexto de determinado objeto (cualquier objeto), la forma de llamar a estas funciones es por medio de una expresion lambda, cuando esto sucede se crea un ambito temporal (temporal scope) en donde se puede acceder a dicho objeto de distintas formas, esto ultimo depende de la funcion que se valla a utilizar.

Hay cinco funciones de alcance:

- let
- run 
- with
- apply
- also

#### Distinciones

Debido a que las funciones de alcance son bastante similares en naturaleza, es importante comprender las diferencias entre ellas. Hay dos diferencias principales entre cada función de alcance:

- La forma de referirse al objeto de contexto
- El valor de retorno.

Dentro del lambda de una scope function el contexto del onjeto esta disponible por medio de una referencia a el mismo sin necesidad de usar su nombre real, en las scope functions vamos a contar con dos tipos de referencias a dicho contexto **this** o **it**, va a depender de la suncion que usemos el tipo de referencia al que tendremos acceso.

## this

**this** es un receptor lambda que va a contener la referencia del contexto del objeto a partir del cual ejecutemos una scope function, **run, with, apply**

>Ejemplo
```kotlin
	val me = Person("Name").apply {
		this.age = 30
	}
```
Como vemos dentro del lambda podemos referirnos al contexto del objeto que esta creando Person y por medio del mismo asignamos valor a una de sus propiedades.

## it

**it** es un argumento lambda el cual va a contener el contexto del objeto cuando se usens las scope functions **let y also**, en este caso si el nombre del argumento en la funcion lambda de estas scope functions el objeto sera accedido por medio del nombre implicito predeterminado **it**

>Ejemplo
```kotlin
	fun generateRandomNumber(): Int {
		return Ramdom.nextInt(100).also {
			println("Generated number: $it")
		}
	}

	val number = generateRendomNumber()
```

En el ejemplo anterior vemos como la llamada a Random.nextInt() regresa un objeto y sobre este mismo llamamos la funcion also, en la cual tenemos acceso al contexto del objeto sobre el cual la llamamos, es por eso que podemos imprimir su valor haciendo referencia al mimo por medio **it**.

#### Valor de retorno

Las scope functions siempre tienen un valor de retorno, va a depender de cual funcion usemos para ver que retorna cada una.

- apply y also van a devolver el objeto del contexto.
- let, run y with van a devolver el resultado del lambda

Esta es la primerea parte de Scope functions, en la siguiente sesion veremos a detalle cada una de las scope functions.