
## Ejemplo 1: Lambdas & Higher-order functions - Kotlin Fundamentals

### OBJETIVO

- Que el alumno comprenda el uso de Higher-order functions con kotlin, su importancia y la relacion que estas tienen con las lambda functions o funciones anonimas.

#### REQUISITOS

1. Tener conocimiento previo sobre funciones en kotlin y los conceptaos basicos de programacion orientada a objetos.

#### DESARROLLO

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

Ahora ve al [Reto 01](/../../tree/master/Sesion-05/Reto-01) y complétalo con lo que acabas de aprender. 
**¡Mucho éxito!**