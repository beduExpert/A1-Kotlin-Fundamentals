## Ejemplo 01: Que es programacion asincrona? - Kotlin Fundamentals

### OBJETIVO

- Comprender que es la programacion asincrona.

### REQUISITOS

1. Tener conocimiento previo de POO.
2. Conocimiento de funciones y Higher-order functions.

### DESARROLLO

Antes de tocar de lleno el tema de programacion asincrona veamos primero el paradigma de programacion funcional FP (Functional Programing), para lograr notar la diferencia entre POO y FP veamos la siguiente comparativa:

- Programacion Orientada a Objetos (OOP)
	- Estructura de datos llamados objetos.
	- Contienen propiedades y metodos.
	- Manipula datos de entrada para generar datos de salida.
- Programacion Funcional (FP)
	- Estructura mediante expresiones.
	- Variables inmutables.
	- Recursion y funciones de primer orden.
	- Definicion de computos y calculo de lambdas.

Ahora que sabemos esto, Las corrutinas son una de las características más interesantes de Kotlin. Con ellas, se puede simplificar el trabajo de las tareas asíncronas de una manera impresionante y hacer que el código sea mucho más legible y fácil de entender.

Con las corrutinas, puedes escribir código asícrono, que se ha escrito tradicionalmente usando el patrón Callback, pero utilizando estilo síncrono. El valor de retorno de la función proporcionará el resultado de la llamada asíncrona.

Para entender fácilmente las corrutinas, digamos que las corrutinas son como hilos, pero mejores.

Primero, porque las corrutinas te permiten escribir tu código asícrono de forma secuencial, lo que reduce drásticamente la carga cognitiva.

Y segundo, porque son mucho más eficientes. Varias corrutinas se pueden ejecutar utilizando el mismo hilo. Por tanto, mientras que el número de hilos que se pueden ejecutar en una aplicación es bastante limitado, se pueden lanzar tantas corrutinas como se necesite. El límite es casi infinito.

>Ejemplo de una corutina
```kotlin
coroutine {
    progress.visibility = View.VISIBLE
 
    val user = suspended { 
		userService.doLogin(username, password) 
	}
    val currentFriends = suspended {	
		userService.requestCurrentFriends(user) 
	}
 
    val finalUser = user.copy(friends = currentFriends)
    toast("User ${finalUser.name} has ${finalUser.friends.size} friends")
 
    progress.visibility = View.GONE
}
```

En el ejemplo anterior, supongamos que tenemos que hacer login y obtener los amigos de el usuario que se logeo, observa y recuerda la keyword **suspended** y la estructura de la corutina de como asignamos valor a variables dentro de bloques suspended, esto lo veremos a detalle en el siguiente ejemplo.

En el [Ejemplo 02](/../../tree/master/Sesion-08/Ejemplo-02/) veremos como implementar corutinas con kotlin.



