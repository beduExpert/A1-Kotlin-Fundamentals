## Ejemplo 1: Interfaces, Clases abstractas y Clases internas - Kotlin Fundamentals

### OBJETIVO

- Comprender el uso y la definición de clases abstractas e interfaces. 
- Reconocer las áreas para implementar las interfaces y clases abstractas.

### REQUISITOS

1. Tener conocimiento base sobre Programación Orientada a Objetos

### DESARROLLO

#### Clases abstractas

Las clases abstractas son clases que no tienen implementación, es decir todo lo que va dentro de este tipo de clases es solo su definición, es importante saber que estas son un nivel más alto hablando de herencia, pues así podemos generalizar más nuestro código y hace una representación más **abstracta** de la realidad, que es el objetivo de la POO.

Por ejemplo, una función en una clase norma la declaramos así:
>Lo que está entre llaves es la implementación de la función, lo demás (la declaración) se conoce como firma, es la firma de la función
```kotlin
    fun sayHelloTo(name: String) {
        println("Hello $name")
    }
```

Visto esto, las clases abstractas solamente podrán contener las firmas de las funciones o propiedades que decidamos incluir.

Las características más importantes de las clases abstractas son:

- De estas clases no se pueden crear instancias (Objetos), como lo hicimos con la clase Artist por ejemplo:
```kotlin
    var artistOne: Artist = Artist()
```
- La declaración de una clase abstract siempre va a comenzar con la palabra reservada **abstract**
```kotlin
    abstract class Person { /*...*/}
```
- Debido a que no es posible crear instancias de las clases abstract, obligatoriamente estas se tienen que heredar:
```kotlin
    abstract class Person {/*...*/}

    class Artist: Person() {/*...*/}
```
- Todos los métodos declarados en una clase abstract, para poder ser implementados, tienen que ser sobre escritos usando override, los métodos se escriben con la palabra **abstract** al inicio de su declaración para que sea posible su sobre escritura:
```kotlin
    abstract class Person {
        abstract fun sayHello() //Solo se declara la firma de la funcion
    }
    
    class Artist: Person() {
        override fun sayHello() {
            println("Hello") //Sobrescribiendo la función declarada en la clase abstract se puede hacer su implementación
        }
    }
```
#### Interfaces

Las interfaces son muy similares a las clases abstractas y debido a esto hay mucha controversia ya que son muy parecidas siempre existe la discusión de que es mejor abstract class o interface, la respuesta está en la función que cumple cada una.

Las interfaces están más enfocadas a las acciones, cuando en nuestra lógica de negocio existan acciones redundantes o que se repitan mucho, las interfaces nos va ayudar a evitar la repetición de código.
Aunque son consideradas también un tipo de clase, estas no se declaran con la palabra **class** si no con **interface**

Para tenerlo más claro recordemos la herencia. Cuando una clase hereda de otra, la clase hija ahora tiene acceso a las propiedades y métodos de la clase padre, ahora, si usamos interfaces y clases abstract, es como si descompusiéramos la herencia en dos partes: por un lado usaremos las clases abstract para las propiedades y por otro usaremos las interfaces para los métodos. De esta forma lograremos una abstracción completa.

A diferencia de las abstract class en las interfaces si podemos declarar funciones con su implementación.

Recordemos:

- Abstract Class: Propiedades
- Interface: Métodos

>Declaración e implementación de una interface
```kotlin
    interface PersonActions {
        fun sayHello() //Solo la firma de la funcion
        fun sayGoodBye() { // Funcion con implementacion
            println("Bye")
        }   
    }

    class Person: PersonActions { //Nota que al implementar una interface no usamos paréntesis
        override fun sayHello() {
            println("Hello world!")
        }
        
        override fun sayGoodBye() {
            println("Good bye")
        }
    }
```

Pon en práctica estos conceptos en el [Reto 01](/../../tree/master/Sesion-04/Reto-01).
