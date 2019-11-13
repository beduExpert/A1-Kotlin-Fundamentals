## Programacion orientada a objetos

### OBJETIVO

- Que el alumno aprenda los siguientes temas:
    -Getters y setters
    -Herencia y polimorfismo

#### REQUISITOS

1. Tener conocimiento basico sobre el paradigma de programacion POO (Programacion orientada a objetos).
2. Conocer los tipos de datos, operadores y variables en kotlin.

### DESARROLLO

## POO: Programacion Orientada a Objetos

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

Cuando aislamos nuestras propiedades, es decir, implementamos su getter y su setter lo que en realidad estamos haciendo es encapsularlas,
la encapsulacion es uno de los pilares mas importantes de la POO.

#### Getters & Setters provistos por kotlin

En kotlin existe la posibilidad de no declarar metodos coo tal para definir nuestros getters o setters, si el programamdor no los provee kotrin 
implementa unos por defecto, los cuales podemos utilizar para condicionar el seteo por ejemplo de nuestra propiedad.

>Esta es forrma de utilisar los Getters & Setters que nos proporciona kotlin:
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
Observa que agregamos a nuestra clase la propiedad age e implementamos los Getters & Setters de kotlin, el metodo get por lo regular 
siempre lo vamos a ver de esta forma:
```kotlin 
    get() = this.age
```
ya que siempre vamos a retornar el valor de la propiedad sin modificaciones, en casos muy especiales en loq que se tenga que alterar de alguna 
forma el valor de retorno de dicha propiedad basta con implementarlo entre llaves tal como lo hacemos con el set():
```kotlin
    get(): Int {
        return this.age + 1
    }   
```
Ahora, la magia viene cuando utilizamos set para condicionar el seteo de nuestra propiedad, supongamos que no queremos que 
la propiedad age sea menor que 18, esta condiciones las podemos implementar en el set de la siguiente forma:
```kotlin
    set(value) {
        if (value >= 18) field = value
    }
```
Esto quiere decir que el valor solo se va a asignar si cumple con la condicion de que sea mayor o igual a 18, es importante resaltar que esto
es una forma distinta de encapsulamiento, puesto que las propiedades en este caso si tienen que estar expuestas.

Te recomiendo que cheques la [documentacion oficial](https://kotlinlang.org/docs/reference/properties.html) de kotlin para que veas mas a profundidad el tema de Getters & Setters.

#### Herencia y Polimosfirmo

La herencia nos va a permitir crear otras clases a partir de otras, hasta ahora ya hemos aprendido a crear una clase, a darle propiedades y 
metodos, aprendimos tambien encapsulamiento y lo que tiene que ver con Getters y Setters.

Lo que haremos ahora con la herencia es que dependiendo de las necesidades de nuestra solucion podamos crear nuevas clases a partir de las que 
ya tengamos, por ejemplo, partiendo del ejercicio con la clase Person, sabemos que en la vida real no todas las personas son lo mismo,
es decir hay unda diversidad inmensa de tipos de personas, esa diversidad la podemos categorizar y hacer una seleccion mas pequeña para definir 
el tipo de persona.

Por ejemplo, partiendo de la clase Person, podemos crear cualquier cantidad de instancias de tipo Person, pero si nuestra nececidad es diferenciar 
entre si esa persona es Artista o Bombero, considereariamos que Artista y Bombero serian otras clases creadas a partir de Person, ya que a pesar de
ser Artista o Bombero seguiria teniendo las propiedades base de una Persona, entonces al crear estas dos nuevas clases estariamos reutilizando 
el codigo de Person para hacer que Artista y Bombero **hereden** las propiedades y metodos de Person.

Cuando hablamos de herencia siempre vamos a utilizar el sistema gerarquico Padre-Hijo, en el caso de nuestro ejemplo, la clase Person es 
padre de las clases Artista y Bombero

Veamos el siguiente ejemplo, pero primero definamos las propiedades que podria tener cada clase:

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
    
Basandonos en la definicion de nuestras clases, podemos ver que Firefighter y Artist tambien son personas y deberian tener las propiedades de una persona,
aqui entra la herencia.

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