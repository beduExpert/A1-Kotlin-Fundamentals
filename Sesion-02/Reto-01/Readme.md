
## Reto 1: Funciones - Kotlin Fundamentals 

### OBJETIVO 

- Aprender a usar los diferentes tipos de funciones en Kotlin.
- Conocer las funciones lambda.
- Implementar funciones de orden superior usando funciones lambda. 

#### REQUISITOS 

1. Revisar a detalle el  [Ejemplo 01](/../../tree/master/Sesion-02/Ejemplo-01)

#### DESARROLLO

En el proyecto incluido en este directorio dentro de la carpeta src, encontrarás un archivo llamado main.kt. Completa los siguientes puntos dentro el mismo archivo:
- Define una función cuyo objetivo sea recibir nombre(s) y apellido(s) de una persona por separado y que imprima en consola un mensaje de bienvenida con el nombre completo.
- Define una función que reciba como parámetro un array del tipo Int y retorne siempre el primer elemento de dicho array; almacena el valor retornado en una variable y posteriormente imprímelo en consola.
- Escribe una single-expression function que combine el nombre y apellido recibidos como parámetros en la misma.
- Usando lo aprendido sobre Local functions, escribe una función llamada **calcular** que reciba como parámetros dos números del tipo que te convenga. Después que se encargue de componer textualmente el resultado de cada operación (suma, resta, multiplicación) e imprímelos en consola. Es decir, si es suma que el resultado sea **la suma de a + b es igual a "resultado"**. Ojo, **todo dentro de la función calcular.
- Escribe una Higher-order function que reciba nombre y apellido de una persona por separado y retorne un String, usa esa función para ** ejecutar las funciones que se encarguen de generar los siguientes mensajes:

	- Mensaje de bienvenida con nombre y apellido.
	- Mensaje de tu elección con nombre y apellido.
	- Mensaje de despedida con nombre y apellido.

A continuación almacena cada uno de los mensajes en un arreglo de strings y después itera sobre cada uno de los elementos del arreglo para imprimirlos.
