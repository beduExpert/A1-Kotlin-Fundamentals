## Ejemplo 02: Extensions & Generics - Kotlin Fundamentals

### OBJETIVO

- Comprender el uso de funciones de extensión y la importancia de los genéricos en Kotlin.

### REQUISITOS

1. Conocimientos previos sobre tipos de datos, variables, funciones y POO.

### DESARROLLO

#### Extensions

Las funciones de extensión de kotlin nos permiten, como su nombre lo indica, extender la funcionalidad de clases que ya están definidas, sin necesidad de tocar su código. Tomemos como ejemplo la clase Array<T> que si bien recuerdas esta clase nos permite crear arreglos de datos, y como es una clase, una instancia de la misma va a contener métodos (funciones declaradas dentro de la clase).

Bien, si dada nuestra necesidad esa clase no cuenta con un método que la solucione, no tenemos que escribir una nueva clase Array (eso sería complicado). En su lugar podemos crearle una extencion a la clase Array con las funciones de extension.

Veamos un ejemplo:
```kotlin
	fun Array<T>.myFunction(plus: Int) {
		this.forEach { println("${it + plus}") }
	}
```
En Kotlin para declarar una función de extensión lo hacemos con la palabra **fun** seguido de la clase y el nombre de nuestra función, separados por un punto. Estas funciones pueden recibir parámetros y retornar valores tal como las conocemos.

En el ejemplo declaramos una función de extensión a la clase Array. Entonces podremos acceder a ella desde cualquier array que se haya instanciado con esa clase:
```kotlin
	val numbers: Array<Int> = arrayOf(0, 1, 2, 3, 4, 5, 6)

	numbers.myFunction(plus: 1)
```

#### Generics

Los genericos en kotlin básicamente nos van a indicar dos cosas; que las clases que reciben variables pueden aceptar cualquier tipo de dato, y qué tipo de dato es el que estamos mandando a esa clase, ejemplo.

Analizando la clase Array<T> veremos que **T** nos indica que podemos crear un arreglo de cualquier tipo, puede ser de Strigns Array<String>, de ints Array<Int> o de cualquier otro.

Entonces, con genéricos podemos crear clases o funciones que acepten cualquier tipo de dato, esto es muy útil ya que nos permite hacer código mas usable y reciclable.

```kotlin
	fun <T> anyToString(val: T): String {
		return "$val"
	}
```
La función del ejemplo anterior, como su nombre lo dice, convierte cualquier valor de cualquier tipo y lo retorna como String. Es por eso que se llaman genéricos. El mismo código se puede usar con distintos tipos.

En el [Reto 02](/../../tree/master/Sesion-06/Reto-02/) podrás poner en práctica las funciones de extensión y los genéricos.

