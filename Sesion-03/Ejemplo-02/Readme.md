## Programación orientada a objetos

### OBJETIVO
Reconocer las características de los conceptos: Getters y setters, Herencia y polimorfismo.

#### REQUISITOS
1. Tener conocimiento básico sobre el paradigma de programación POO (Programacion orientada a objetos).
2. Conocer los tipos de datos, operadores y variables en kotlin.

### DESARROLLO

## POO: Programacion Orientada a Objetos

En el ejemplo anterior vimos qué es la programación orientada a objetos, mejor conocida como POO. Aprendimos que este paradigma de programación nos permite representar la realidad por medio de modelos (clases). También  aprendimos que así como en la realidad las cosas (cualquier ente u objeto) poseen propiedades y habilidades, y que podemos representarlas de forma abstracta con propiedades y métodos.
Recordemos que en la POO es muy importante el nivel de acceso, tanto en propiedades como en métodos. En el ejemplo anterior creamos una clase con su constructor y aislamos una de sus propiedades, pero, si están aisladas sus propiedades cómo accedemos a ellas, o cómo es que podemos modificarlas.
Retomando el ejemplo de la clase Person, una vez que tenemos aislada nuestra propiedad name veamos cómo es que kotlin nos sugiere acceder a ella.
En kotlin **existen dos formas de hacer uso de Getters & Setters**
- Provistos por el programador
- Acceso directo desde kotlin

Retomemos la clase que habíamos construido en el ejemplo anterior.
```kotlin
	class Person(name: String) {
        private var name: String = name
        
        fun sayHello() {
            println("Hello")
        }
    }
```
#### Getters & Setters provistos por el programador
Existen dos formas de interactuar con nuestras propiedades. Una es obtener el valor que ya tienen asignado, y la otra es asignarles un valor, es decir lectura y escritura.
Para obtener el valor que representa nuestra propiedad, las reglas de la POO nos sugieren que el método que se encargue de dicha acción comience con **get**, como se muestra a continuación:
>Implementación de un Getter en nuestra clase Person
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
De esta forma podemos acceder a nuestra propiedad por medio de un método que forma parte de nuestra misma clase. Entonces ningún agente externo a nuestra clase está creando esta interacción:
>Obtenemos el nombre de la persona que está siendo representada por un objeto instanciado desde la clase Person.
```kotlin
	//Creamos una instancia de la clase Person
	val me: Person = Person("Nombre")

	//Imprimimos el nombre de me, accediendo a el desde su getter
	println(me.getName())
```
Para modificar el valor de una propiedad, la POO nos dice que el método que se encargue de ello comience con la palabra **set**, es decir:
>Implementación de un Setter en nuestra clase Person
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
Cuando implementamos un Setter en nuestras clases, este tiene que recibir el mismo tipo de dato con el cual está definida nuestra propiedad. Si la propiedad name es un String, entonces la función que actúe como Setter tiene que recibir un String.

¿Notaste que usamos la notacion this? Cuando llamamos a this, estamos haciendo referencia al objeto mismo creado a partir de esa clase. Es decir, imagina que el objeto **me** ya se creó a partir de la clase Person, en la cual hacemos una llamada a this, cuando ya está instanciado nuestro objeto, this representa a ese objeto. Eso quiere decir que this tiene acceso a todas las propiedades y métodos del objeto en sí.
>Haciendo uso del Setter de la propiedad name
```kotlin
	//Creamos una instancia de la clase Person
	val me: Person = Person("Nombre")

	//Imprimimos el nombre de me, accediendo a el desde su getter
	println(me.getName())

	//Modificamos el nombre por medio del Setter
	me.setName("Nuevo Nombre")
	println(me.getName())
```

Cuando aislamos nuestras propiedades, es decir, implementamos su getter y su setter lo que en realidad estamos haciendo es encapsularlas. La encapsulación es uno de los pilares más importantes de la POO.

#### Getters & Setters provistos por kotlin

En kotlin existe la posibilidad de no declarar métodos como tal para definir nuestros getters o setters. Si el programamdor no los provee, Kotlin implementa unos por defecto, los cuales podemos utilizar para condicionar el seteo que pueden ser de nuestra propiedad.

>Esta es la forma de utilizar los Getters & Setters que nos proporciona kotlin:
```kotlin
    class Person(name: String) {
        private var name: String = name
        var age: Int = 20
            get() = this.age
            set(value) {
                this.age = value
            }    

        
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
Observa que agregamos a nuestra clase la propiedad age e implementamos los Getters & Setters de kotlin. El método get por lo regular siempre lo vamos a ver de esta forma:
```kotlin 
    get() = this.age
```
Ya que siempre vamos a retornar el valor de la propiedad sin modificaciones, en casos muy especiales en los que se tenga que alterar de alguna forma el valor de retorno de dicha propiedad, basta con implementarlo entre llaves tal como lo hacemos con el set():
```kotlin
    get(): Int {
        return this.age + 1
    }   
```
Ahora, la magia viene cuando utilizamos set para condicionar el seteo de nuestra propiedad. Supongamos que no queremos que la propiedad age sea menor que 18, estas condiciones las podemos implementar en el set de la siguiente forma:
```kotlin
    set(value) {
        if (value >= 18) field = value
    }
```
Esto quiere decir que el valor solo se va a asignar si cumple con la condición de que sea mayor o igual a 18. Es importante resaltar que esto es una forma distinta de encapsulamiento, puesto que las propiedades en este caso si tienen que estar expuestas.

Te recomiendo que cheques la [documentación oficial](https://kotlinlang.org/docs/reference/properties.html) de kotlin para que conozcas a profundidad el tema de Getters & Setters.

#### Herencia y Polimorfismo

La herencia nos va a permitir crear clases a partir de otras. Hasta ahora ya hemos aprendido a crear una clase, a darle propiedades y métodos. Aprendimos también encapsulamiento y lo que tiene que ver con Getters y Setters.
Lo que haremos ahora con la herencia es que, dependiendo de las necesidades de nuestra solución, podamos crear nuevas clases a partir de las que ya tengamos. Por ejemplo, partiendo del ejercicio con la clase Person, sabemos que en la vida real no todas las personas son lo mismo.
Es decir hay una diversidad inmensa de tipos de personas, esa diversidad la podemos categorizar y hacer una selección más pequeña para definir el tipo de persona.
Por ejemplo, partiendo de la clase Person, podemos crear cualquier cantidad de instancias de tipo Person, pero si nuestra necesidad es diferenciar entre si esa persona es Artista o Bombero, consideraríamos que Artista y Bombero serían otras clases creadas a partir de Person, ya que a pesar de ser Artista o Bombero seguiría teniendo las propiedades base de una Persona. Entonces al crear estas dos nuevas clases estaríamos reutilizando el código de Perso, para hacer que Artista y Bombero **hereden** las propiedades y métodos de Person.

Cuando hablamos de herencia siempre vamos a utilizar el sistema jerárquico Padre-Hijo, en el caso de nuestro ejemplo, la clase Person es padre de las clases Artista y Bombero.
Veamos el siguiente ejemplo, pero primero definamos las propiedades que podría tener cada clase:
- Person: Propiedades
    - name
    - age
- Person: Metodos
    - sayHello()
    - walk()
    
- Artist: Propiedades
     - stageName
- Artist: Metodos
     - sing()
  
- Firefighter: Propiedades
    - department
- Firefighter: Metodos
    - putOutTheFire()
    
Basándonos en la definición de nuestras clases, podemos ver que Firefighter y Artist también son personas y deberían tener las propiedades de una persona, aquí entra la herencia.

>Definimos nuestras clases en kotlin
```kotlin
    class Person {
        private var name:String = ""
        private var age:Int = 0
        
        fun setName(name: String) {
            this.name = name
        }
    
        fun getName():String {
            return this.name
        }

        fun setAge(age: Int) {
            this.age = age
        }
    
        fun getAge():Int {
            return this.age
        }
    
        fun sayHello() {
            println("Hello my name is $name")
        }
    }

    class Artist {
        private var stageName:String = ""
        
        fun setStageName(name: String) {
            this.stageName = name
        }
    
        fun getStageName():String {
            return this.stageName
        }

        fun sing() {
            println("Hello I'm singing")
        }
    }

    class Firefighter {
        private var department:String = ""
        
        fun setDepartment(department: String) {
            this.department = department
        }
    
        fun getDepartment():String {
            return this.department
        }

        fun sing() {
            putOutTheFire("Putting out the fire")
        }
    }

```
Como puedes ver, la clase persona contiene las propiedades y métodos que tendrían que contener, también nuestras otras dos clases. Pero para evitar escribir dos veces ese código, creamos una clase lo más genérica posible. En este caso Person y hacemos que Artist y Firefighter hereden de esa clase.

Dentro de las clases hijo podemos acceder a la clase padre llamándola **super**.

>Artist y Firefighter heredan de Person
```kotlin
    class Artist: Person() {
        private var stageName:String = ""
        
        fun setStageName(name: String) {
            this.stageName = name
        }
    
        fun getStageName():String {
            return this.stageName
        }

        fun sing() {
            println("Hello I'm singing")
        }
    }

    class Firefighter: Person {
        private var department:String = ""
        
        fun setDepartment(department: String) {
            this.department = department
        }
    
        fun getDepartment():String {
            return this.department
        }

        fun sing() {
            putOutTheFire("Putting out the fire")
        }
    }
```
Para indicar que una clase hereda de otra, lo hacemos en la cabecera de la declaración de la clase antes de abrir las llaves que determinan el cuerpo de la misma, se escriben **:** y enseguida el nombre de la clase de la que heredaremos, más los paréntesis.

Entonces en este punto veamos lo que ya sucedió tomando como ejemplo nuestra clase Artist.

Ya que Artist hereda de persona, entonces automáticamente Artist cuenta con sus propiedades y también con las de person. Es decir que podemos hacer lo siguiente:
```kotlin
    //Instamnciamos uno bjeto de la clase Person
    var me:Person = Person()

    //Seteamos el nombre a me
    me.setName("Nombre Uno")

    //Instanciamos un objeto de la clase Artist
    var artistOne: Artist = Artist()

    //Aunque Artist no tiene como tal la propiedad name, ni el metodo setName, podemos usarlos como si de una //
    //instancia de Person se tratara, ya que Artist esta heredando de Person.
    artistOne.setName("Nombre Artista")

    //Tambien asignamos una propiedad que se pertenece implicitamente en la clase Artist
    asrtistOne.setStageName("Stage Name Uno")
```
Como puedes observas la instancia de Artist ahora hace propias las propiedades y métodos de la clase Person.

Recuerda que la herencia nos permite crear clases a partir de otras clases y es muy útil ya que gracias a la herencia podemos ahorrarnos mucho código y reutilizar.

#### Polimorfismo

Este concepto siempre va de la mano de la herencia. Se refiere a qué tanto un objeto como una función pueden adoptar múltiples formas. Recuerdas que la clase Person cuenta con un método sayHello()?

Bien, este método lo que hace es que imprime en consola un saludo:
```kotlin
    fun sayHello() {
        println("Hello my name is $name")
    }
```
Aunque no lo tengamos definido en la clase Artist, esta puede ejecutarlo ya que está heredando de Person. Por eso es que podemos hacer esto:
```kotlin
    artistOne.sayHello()
```
De esta forma tanto person como artist van a saludar de la misma forma. Es decir ambas van a imprimir "Hello, my name is $name", pero ¿qué pasa si queremos que el artista salude a su modo?, que salude "Hello my name is $name an I'm an artist"
Estamos diciendo que la función sayHello tome otra forma, sí, eso es el polimorfismo. Esto lo logramos **sobre escribiendo la función** con la palabra reservada **override**. Te preguntarás ¿qué quiere decir que sobre escribamos una función?, bien pues esto quiere decir que vamos a partir de la definición de nuestra clase padre, en este caso Person y vamos a redefinir la misma función pero ahora en la clase hijo, en este caso la clase Artist comenzando con la palabra override.

Ejemplo:

>La class Person tiene declarada la función sayHello()
```kotlin

    //Recordando nuestra clase Person
    class Person {
        /*...*/
    
        fun sayHello() {
            println("Hello my name is $name")
        }
    }

    //Sobre escribimos la funcion sayHello con override
    class Artist: Person() {
        /*...*/

        override fun sayHello() {
            println("Hello my name is $name ans I'm an artist")
        }
    }

```
Como puedes ver en ambas clases llamamos de la misma forma a la función sayHello, pero debido a que en Artist la sobrescribimos, se va a comportar de diferente forma que en Person.

Ahora que conoces más sobre herencia y polimorfismo, dirígete al [Reto 02](/../../tree/master/Sesion-03/Reto-02/) y no olvides revisar la documentación oficial de kotlin.
