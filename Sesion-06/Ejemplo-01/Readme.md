## Ejemplo 01: Extensions & Generics - Kotlin Fundamentals

### OBJETIVO

- Que el alumno comprenda el uso de funciones de extencion y la importancia de los genericos en kotlin.

### REQUISITOS

1. Tener concocimiento previo sobre tipos de datos, variables, funciones y POO.

### DESARROLLO

#### Extensions

Las funciones de extencion de kotlin nos van a permitir como su nombre lo indica, extender la funcionalidad de clases que ya estan definidas sin necesidad de tocar su codigo, tomemos como ejemplo la clase Array<T> que si bien recuerdas esta clase nos permite crear arreglos de datos, y ya que es una clase, una instancia de la misma va a contener metodos (funciones declaradas dentro de la clase).

Bien, si dada nuestra necesidad esa clase no cuenta con un metodo que la solucione no tenemos que escribir una nueva clase Array (eso seria complicado) en su lugar podemos crearle una extencion a la clase Array con las funciones de extension.

Veamos un ejemplo:
```kotlin
	fun Array<T>.myFunction(plus: Int) {
		this.forEach { println("${it + plus}") }
	}
```
En kotlin para declarar una funcion de extension lo hacemos con la palabra fun seguido de la clase y el nombre de nuestra funcion separados por un punto, estas funciones puedes recibir parametros y retornar valores tal como las conocemos.

En el ejemplo declaramos una funcion de extension a la clase Array, entonces podremos acceder a ella desde cualquier array que se haya instanciado con esa clase:
```kotlin
	val numbers: Array<Int> = arrayOf(0, 1, 2, 3, 4, 5, 6)

	numbers.myFunction(plus: 1)
```

#### Generics

Los genericos en kotlin basicamente nos van a indicar dos cosas, que las clases que reciben variables puedes aceptar cualquier tipo de dato, y que tipo de dato es el que estamos mandando a esa clase, ejemplo.

Analizando la clase Array<T> veremos que **T** nos indica que podemos crear un arreglo de cualquier tipo, puede ser de Strigns Array<String>, de ints Array<Int> o de cualquier otro.

Entonces, con genericos podemos crear clases o funciones que acepten cualquier tipo de dato, esto es muy util ya que nos permite a hacer codigo mas usable y reciclable.

```kotlin
	fun <T> anyToString(val: T): String {
		return "$val"
	}
```
La funcion del ejemplo anterior como su nombre lo dice convierte cualquier valor de cualquier tipo y lo retorna como String, es por eso que se llaman genericos, el mismo codigo se puede usar con distintos tipos.

En el [Reto 01](/../../tree/master/Sesion-06/Reto-01/) podras poner en practica las funciones de extension y los genericos.

