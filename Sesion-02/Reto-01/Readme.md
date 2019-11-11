 

## Ejemplo 1: Funciones - Kotlin Fundamentals 

### OBJETIVO 

- Aprender a usar los diferentes tipode funciones en kotlin.
- Conocer las funciones lambda.
- implemenytar funciones de orden superior usando funciones lambda. 

#### REQUISITOS 

1. Haber visto por completo el [Ejemplo 01](/../../tree/master/Sesion-02/Ejemplo-02)

#### DESARROLLO

En el proyecto incluido en este directorio dentro de la carpeta src encotraras un archivo llamado main.kt, completa los siguientes puntos dentro el mismo archivo

- Define una funcion cuyo objetivo sea recibir nombre(s) y apellido(s) de una persona por separado y que imprima en consola un mensaje de bienvenida con el nombre completo.
- Define una funcion que reciba como parametro un array del tipo Int y retorne siempre el primer elemento de dicho array, almacena el valor retornado en una variable y posteriormente imprimelo en consola.
- Escrube una single-expression function que combine el nombre y apellido recibidos como parametros en la misma.
- Usando lo aprendido de Local functions escribre una funcion llamada calcular que reciba como parametros dos numeros del tipo que te convenga, despues que se encargue de cmponer textualmente el resultado de cada operacion (suma, resta,multiplicacion) e imprimelos en consola, es decir si es suma que el resultado sea **la suma de a + b es igual a "resultado"**, ojo todo dentro de la funcion calcular.
- Escribe una Higher-order function que reciba nombre y apellido de una persona por separado y retorne un String, usa esa funcion para ejecutar las funciones que se encarguen de generar los siguientes mensages:

	- Mensaje de bienvenida con nombre y apellido.
	- Mensaje de tu eleccion con nombre y apellido.
	- Mensaje de despedida con nombre y apellido.

A continuacion almacena cada uno de los mensajes en un arreglo de strings y despues itera sobre cada uno de los elementos del arreglo para imprimirlos.

