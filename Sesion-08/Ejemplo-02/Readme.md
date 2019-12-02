## Ejemplo 01: Coroutines - Kotlin Fundamentals

### OBJETIVO

- Comprender e implementar corutinas en kotlin.
- Aprender sobre:
	- Funciones de suspensión.
	- Coroutine context.
	- Dispatchers.
	- runBlocking.
	- Launch.
	- Jobs.
	- Scopes.

### REQUISITOS

1. Tener conocimiento previo de POO.
2. Conocimiento de funciones y Higher-order functions.

### DESARROLLO

#### Funciones de suspensión

Las funciones de suspensión tienen la capacidad de bloquear la ejecucion de la corrutina mientras estan haciendo su trabajo. Una vez que termina, el resultado de la operacion se devuelve y se puede utilizar en la siguiente linea, recuerdas el ejemplo anterior?

```kotlin
	val user = suspended {
		userService.doLogin(username, password)
	}

	val currentFriends = suspended {
		userService.requestCurrentFriends(user)
	}
```

Sabiendo que las funciones de suspensión bloquean la ejecución lo que pasa con las funciones ejemplo de la corrutina que habiamos visto es que, primero se ejecuta la funcion que hace el login, ahí se bloquea la ejecución hasta que tenemos una respuesta de login, una vez termina de ejecutarse esa suspended function se ejecuta la siguiente que es la que hace el request de los amigos del usuarios.

Bien, ahora, donde (en que hilo) se va a ejecutar la corrutina? en el de la UI?, pues esto depende del contexto de la corrutina ->

#### Context

Todas las corrutinas tienen o se ejecutan bajo un contexto, este está definido por un conjunto de reglas y configuracione que definen como se ejecutara la corrutina, si lo vieramos de una fomra mas simple seria como una especie de map, con claves y valores.

Ahora solo importa que sepas que una de esas configuraciones es el dispatcher, que es el que va a determinar el hilo en el que se va a ejecutar la corrutina.

Este se puede configurar de dos maneras:

- Explicitamente: Lo hacemos manualmanete.
- Por el Scope: Lo veremos mas adelante.

Para hacerlo explícitamente el constructor de la corrutina va a recibir el contexto como primer parametro, debido a que los dispatchers implementan CoroutineContext podemos usarlo aqui.

```kotlin
	coroutine(Dispatchers.Main) {
		...
	}
```

Ahora todo lo que este dentro del bloque de la corrutina se ejecutara en el hilo principal, pero que pasa si dentro de la corrutina tambien esta una suspended function?

Con withContext podemos ejecutar las suspended functions en un hilo diferente, si las ejecutaramos sobre el hilo principal esto provocaría que la UI se viera afectada bloqueandose hasta que cada suspended function termine su ejecución.

```kotlin
	coroutine(Dispatchers.Main) {
		val user = withContext(Dispatchers.IO) {
			userService.doLogin(username, password)
		}
	}
```

Debido a que witContext por si misma es una función de suspension, podemos omitir la palabra suspended, con esto si observamos la corrutina y las sentencias dentro de ella se ejecutarán en el hilo principal, pero, las suspended functions se ejecutaran en el hilo de background.

#### Dispatchers

Como vimos, los dispatchers son un tipo de contextos de corrutina que especifican el hilo o hilos que pueden ser utilizados por la corrutina para ejecutar su código.

Tenemos cuatro dispatchers principales:

- **Default**: Se usará cuando no se defina un dispatcher, pero también podemos configurarlo explícitamente. Este dispatcher se utiliza para ejecutar tareas que hacen un uso intensivo de la CPU, principalmente cálculos de la propia App, algoritmos, etc. Puede usar tantos subprocesos como cores tenga la CPU. Ya que estas son tareas intensivas, no tiene sentido tener más ejecuciones al mismo tiempo, porque la CPU estará ocupada.
- **IO**: Utiliza este para ejecutar operaciones de entrada/salida. En general, todas las tareas que bloquearán el hilo mientras esperan la respuesta de otro sistema: peticiones al servidor, acceso a la base de datos, sitema de archivos, sensores… ya que no usan la CPU, se puede tener muchas en ejecución al mismo tiempo, por lo que el tamaño de este grupo de hilos es de 64. Las Apps de Android, lo que más hacen, es interactuar con el dispositivo y hacer peticiones de red, por lo que probablemente usarás este la mayoría del tiempo.
- **Unconfined**: Si no te importa mucho qué hilo se utiliza, puedes usar este dispatcher. Es difícil predecir qué hilo se usará, así que no lo uses a menos que estés muy seguro de lo que estás haciendo.
- **Main**: Este es un dispatcher especial que se incluye en las librerías de corrutinas relacionadas con interfaz de usuario. En particular, en Android, utilizará el hilo de UI.

#### Launch

Ahora ya sabemos como cambiar el hilo de ejecución de las corrutinas y las suspended functions. Vamos a ver cÓmo iniciar una nueva corrutina, para eso existen los builders de corrutinas, son varios pero launch es el que mas usaremos asi que nos concentraremos en este.

**launch** es un builder que no bloqueará el subproceso actual (usando los dispatchers adecuados), este builder siempre necesita un scope (ya los veremos)

>Forma mas sencilla de usar launch en el GlobalScope
```kotlin
	GlobalScope.launch(Dispatchers.Main) {
		...
	}
```

launch devuelve un Job, que es otra clase que implementa CoroutineContext. Los jobs tienen un par de funciones interesantes que pueden ser muy útiles.

- job.join
- job.cancel

#### Jobs

>Ejemplo job.join
```kotlin
	val job = GlobalScope.launch(Dispatchers.Main) {
	
		doCoroutineTask()
	
		val res1 = suspendingTask1()
		val res2 = suspendingTask2()
	
		process(res1, res2)
	
	}
	
	job.join()
```

Con esta función, puedes bloquear la corrutina asociada con el job hasta que todos los jobs hijos hayan finalizado.

job.join() es una función de suspensión en sí misma, por lo que debe llamarse dentro de otra corrutina.

>Ejemplo job.cancel
```kotlin
	val job = GlobalScope.launch(Dispatchers.Main) {

		doCoroutineTask()

		val res1 = suspendingTask1()
		val res2 = suspendingTask2()

		process(res1, res2)

	}

	job.cancel()
```

Esta función cancelará todos sus jobs hijos asociados. job.cancel() esta es una función normal, por lo que no requiere una corrutina para ser llamada.

Ya aprendimos las bases de las corrutinas y la programación asíncrona con Kotlin, nunca dudes en ir a la [Documentacion Oficial](https://kotlinlang.org/docs/reference/coroutines/coroutines-guide.html), ahora ve al [Reto 01](/../../tree/master/Sesion-08/Reto-01/) y aplica todo lo que acabas de aprender.
