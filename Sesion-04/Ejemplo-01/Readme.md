## Ejemplo 1: Interfaces, Clases abstractas y Clses internas - Kotlin Fundamentasl

### OBJETIVO

- Que el alumno comprenda el uso y la definicion de :
    - Clases abstractas.
    - Interfaces. 
- Que el alumno logre reconocer las areas donde implementar las Interfaces y Clases abstractass.

### REQUISITOS

1. Tener conocimiendto base sobre Programacion Orientada a Objetos

### DESARROLLO

#### Clases abstractas

las clases abstractas son clases que no tienen implementacion, es decir todo lo que va dentro de este tipo de clases es 
solo su definicion, es importante saber que estas son un nivel mas alto hablando de herencia, pues asi podemos generalizar mas nuestro codigo 
y hace una representacion mas **abstracta** de la realidad, que es el objetivo de la POO.

Por ejemplo, una funcion en una clase norma la declaramos asi:
>Lo que esta entre llaves es la implementacion de la funcion, lo demas (la declaracion) se conoce como firma, es la firma de la funcion
```kotlin
    fun sayHelloTo(name: String) {
        println("Hello $name")
    }
```

Visto esto, las clases abstractas solamente podran contener las firmas de las funciones o propiedades que decidamos incluir.

Las caracteristicas mas importantes de las clases abstract son:

- De estas clases no se pueden crear instancias (Objetos), como lo hicimos
con la clase Artist por ejemplo:
```kotlin
    var artistOne: Artist = Artist()
```
- La declaracion de una clase abstract siempre va a comenzar con la palabra reservada **abstract**
```kotlin
    abstract class Person { /*...*/}
```
- Debido a que no es posible crear instancias de las clases abstract, obligartoriamente estas se tienen que heredar:
```kotlin
    abstract class Person {/*...*/}

    class Artist: Person() {/*...*/}
```
- Todos los metodos declarados en una clase abstract, para poder ser implementados, tienen que ser sobre escritos usando override, los metodos 
se escriben con la palablra **abstract** al inicio de su declaracion para que sea posible su sobre escritura:
```kotlin
    abstract class Person {
        abstract fun sayHello() //Solo se declara la firma de la funcion
    }
    
    class Artist: Person() {
        override fun sayHello() {
            println("Hello") //Sobre escrubiendo la funcion declarada en la clase abstract se puede hacer su implementacion
        }
    }
```
#### Interfaces

Las interfaces son muy similares a las clases abstractas y debido a esto hay mucha controversia ya que son muy parecidas siempre existe 
la discucion de que es mejor.. abstract class o interface, la respuesta esta en la funcion que cumple cada una.

Las interfaces estan mas enfocadas a las acciones, cuando en nuestra logica de negocio existan acciones redundantes o que se repitan mucho,
las interfaces nos va ayudar a evitar la repeticion de codigo.

Aunque son consideradas tambien un tipo de clase, estas no se declaran con la palabra **class** si no con **interface**

Para tenberlo mas claro recordemos la herencia, cuando una clase hereda de otra, la clase hija ahora tiene acceso a las propiedades y metodos de la 
clase padre, ahora, si usamos interfaces y clases abstract, es como si descompusieramos la herencia en dos parates, por un lado 
usaremos las clases abstract para las propiedades y por otro usaremos las interfaces para los metodos, de esta forma lograremos una abstraccion 
completa.

A diferencia de las abstract class en las interfaces si podemos declarar funciones con su implementacion.

Recordemos:

- Abstract Class: Propiedades
- Interface: Metodos

>Declaracion e implementacion de una interface
```kotlin
    interface PersonActions {
        fun sayHello() //Solo la firma de la funcion
        fun sayGoodBye() { // Funcion con implementacion
            println("Bye")
        }   
    }

    class Person: PersonActions { //Nota que al implementar una interface no usamos parentesis
        override fun sayHello() {
            println("Hello world!")
        }
        
        override fun sayGoodBye() {
            println("Good bye")
        }
    }
```