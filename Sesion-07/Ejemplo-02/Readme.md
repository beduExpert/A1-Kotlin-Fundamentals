## Ejemplo 2: Exeptions & Manejo de errores - Kotlin Fundamentals

### OBJETIVO

- Que el alumno logre desarrollar la habilidad de preveer y hacer correctamente el manejo de posibles errores en sus programas.

### REQUISITOS

1. Tener conocimiento previo de tipos de datos y excepciones.

### DESARROLLO

En kotlin como en cualquier otro lenguage de programacion siempre existe la posibilidad de que se den errores los cuales no podemos controlar, aqui es donde nace el tema de las excepciones, estas nos permiten hacer "algo" en caso de que algun error ocurra realizando determinadas operaciones.

Todas las clases de excepcion en kotlin heredan de la clse Throwable, Cada excepción tiene un mensaje, un seguimiento de pila y una causa opcional.

>Para lanzar una excepcion:
```kotlin
	throw Exception("This is an exception")
```

la forma mas comun de manejar errores es usando el bloque **try-catch**:

```kotlin
	try {
    	// Codigo que puede generar un error.
	}
	catch (e: SomeException) {
		// Si el codigo del bloque try genera un error aqui es donde lo manejamos.
	}
	finally {
		// Este bloque es opcional y como su nombre lo indica se ejecuta al final del manejo del error.
	}
```

El bloque **try-catch** tambien se puede usar como una expresion:

```kotlin
	val a: Int? = try { parseInt(input) } catch (e: NumberFormatException) { null }
```

#### The nothing type

Ya que throw es una expresion se puede usar por supuesto en una operacion Elvis.

```kotlin
	val s = person.name ?: throw IllegalArgumentException("Name required")
```

Vemos que intentamos asignar el nombre de la persona a la variable **s**, con el uso del operador Elvis se lo asignamos si este lo tiene, si no lo tiene lanzamos una excepcion.

El tipo de la expresión throw es el tipo especial Nothing. El tipo no tiene valores y se usa para marcar ubicaciones de código que nunca se pueden alcanzar. En su propio código, puede usar Nothing para marcar una función que nunca regresa:

```kotlin
	fun fail(message: String): Nothing {
		throw IllegalArgumentException(message)
	}
```

Cuando usamos el tipo Nothing estamos basicamente indicando que la funcion no va a regresar nada, en este caso nuestra funcion se encarga solamente de lanzar una exepcion.

Cuando llames a esta función, el compilador sabrá que la ejecución no continúa más allá de la llamada:

```kotlin
	val s = person.name ?: fail("Name required")
```

Ahora vemos que de esta forma, con ayuda del tipo Nothing combinandolo con el uso de Elvis podemos mejorar nuestro codigo para lanzar excepciones, completa el [Reto 02](/../../tree/master/Sesion-07/Reto-02/) y pon en practica lo que acabas de aprender.