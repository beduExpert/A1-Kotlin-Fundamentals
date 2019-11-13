## Programacion orientada a objetos II

### OBJETIVO

- Que el alumno aprenda los siguientes temas:
    -Getters y setters
    -Herencia y polimorfismo

#### REQUISITOS

1. Tener conocimiento basico sobre el paradigma de programacion POO (Programacion orientada a objetos).
2. Conocer los tipos de datos, operadores y variables en kotlin.

### DESARROLLO

## POO: Programacion Orientada a Objetos II

En el ejemplo anterior vimos lo que es la programacion orientada a objetos mejor conocida como POO, aprendimos que este paradigma de programacion nos permite representar la realidad por medio de modelos (clases), tabien aprendimos que asi como en la realidad las cosas (cualquier ente u objeto) poseen propiedades y habilidades, las mismas podemos representarlas de forma abstracta con propiedades y metodos.

Recordemos que en la POO es muy importante el nivel de ecceso, tanto en propuedades como en metodos, en el ejemplo anterior creamos una clase con su constructor y aislamos una de su propiedades, pero, si estan aisladas sus propiedades como accedemos a ellas, o como es que podemos modificarlas.

Retonamdo el ejemplo de la clase Person, una vez que tenemos aislada nuestra propiedad name veamos como es que kotlin nos sigiere acceder a ella.

En kotlin existen dos formas de hacer uso de Getters & Setters
- Provistos por el programador
- Acceso directo desde kotlin

Retomemos la clase que habiamos construido en el ejemplo anterior.
```kotlin
	class Person(name: String) {
        private var name: String = name
        
        fun sayHello() {
            println("Hello")
        }
    }
```
#### Getters & Setters provistos por el programador
Existen dos formas de interactuar con nuestras propiedades, una es obtener el valor que ya tienen asignado, y la otra es asignarles un valor, es decir lectura y escritura.

Para obetener el valor que representa nuestra propiedad, las reglas de la POO nos sugieren que el metodo que se encargue de dicha accion comience con **get**, es decir:
>Implementacion de un Getter en nuestra clase Person
```kotlin
	class Person(name: String) {
        private var name: String = name
        
        fun sayHello() {
            println("Hello")
        }

		fun getName(): String {
			return name
		}
    }
```
De esta forma podemos acceder a nuestra propiedad por medio de un metodo que forma parte de nuestra misma clase,entonces ningun agente externo a nuestra clase esta creando esta interacion:
>Obtenemos el nombre de la persona que esta siendo representada por un objeto instanciado desde la clase Person.
```kotlin
	//Creamos una instancia de la clase Person
	val me: Person = Person("Nombre")

	//Imprimimos el nombre de me, accediendo a el desde su getter
	println(me.getName())
```
Para setear o modificar el valor de una propiedad, la POO nos dice que el metodo que se encargue de ello comience con la palabra **set**,es decir:
>Implementacion de un Setter en nuestra clase Person
```kotlin
	class Person(name: String) {
        private var name: String = name
        
        fun sayHello() {
            println("Hello")
        }

		fun getName(): String {
			return name
		}

		fun setName(name: String) {
			this.name = name
		}
    }
```
Cuando implementamos un Setter en nuestras clases este tiene que recibir el mismo tipo de dato con el cual esta definida nuestra propiedad, si la propiedad name es un String, esntonces la funcion que actue como Setter tiene que recibir un String.

Notaste que usamos la notacion this?, cuando llamamos a this, estamos haciendo referencia al objeto mismo creado a partir de esa clase, es decir, imagina que el objeto me ya se creo a partir de la clase Person, en la cual hacemos una llamada a this, cuando ya esta instanciado nuestro objeto, this representa a ese objeto, eso quiere decir que this tiene acceso a todas la propiedades y metodos del objeto en si.
>HAciendo uso del Setter de la propiedad name
```kotlin
	//Creamos una instancia de la clase Person
	val me: Person = Person("Nombre")

	//Imprimimos el nombre de me, accediendo a el desde su getter
	println(me.getName())

	//Modificamos el nombre por medio del Setter
	me.setName("Nuevo Nombre")
	println(me.getName())
```
#### Getters & Setters provistos por kotlin