## Ejemplo 2: Clases internas y anidadas - Kotlin Fundamentals

### OBJETIVO

- Comprender el uso y la definición de clases internas y clases anidadas. 
- Reconocer las áreas donde se pueden implementar las Clases internas y Clases anidadas.

### REQUISITOS

1. Tener conocimiento base sobre Programación Orientada a Objetos.

### DESARROLLO

#### Clases anidadas (Nested Class)

Como su nombre lo dice las clases anidadas son aquellas que declaramos dentro de otras clases, cuentan con las mismas características que cualquier otra clase, es decir, pueden tener propiedades, métodos e incluso pueden heredar de otras clases. La única diferencia es que están contenidas por otra clase, ejemplo:
```kotlin
	class Person {
		var personalInfo: PersonalInfo = PersonalInfo()

		class PersonalInfo {
			var name: String = "Name"
			var age: Int = 20

			fun sayHello() {
				println("Hello my name is $name and I'm $age years old")
			}
		}
	}
```
Analizando el código anterior veremos que la clase Person tiene una propiedad llamada **personalInfo**, esta propiedad es del tipo **PersonalInfo** que es una clase que declaramos dentro de Person.

Las clases anidadas cuentan con las siguientes características:
- No pueden acceder a las propiedades/métodos de la clase que las contiene.
- Si quisiéremos instanciar un objeto a partir de la clase anidada dependerá de los modificadores de acceso que ya vimos en temas anteriores, pero usualmente se hace de la siguiente forma:
``` kotlin
	var personalInfo: Person.PersonalInfo = Person.PersonalInfo()
```

Nota que se hace referencia primero a la clase que la contiene y con punto se accede a la o las clases que esta contenga.

#### Clases Internas (Inner Class)

Las clases internas o Inner Class tienen exactamente las mismas características que las Nested Class, pero a diferencia de estas últimas las inner class si pueden acceder a las propiedades/métodos de la clase que las contiene, entonces esta clase es una nested class pero marcada como interna con la palabra reservada **inner**, es decir:
```kotlin
	class Car {
		val model: Int = 2019

		inner class Engine {
			val forModel: Int = model
		}
	}
```
La clase Car tiene una nested class marcada como inner, ahora que sabes esto ve al [Reto 02](/../../tree/master/Sesion-04/Reto-02/)
