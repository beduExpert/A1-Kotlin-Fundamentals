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

