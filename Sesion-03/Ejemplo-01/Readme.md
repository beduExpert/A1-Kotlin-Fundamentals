## Programación orientada a objetos

### OBJETIVO

- Reconocer los principios de la Programación orientada a objetos: Clases y objetos, Propiedades y métodos, Constructores. 

#### REQUISITOS

1. Tener conocimiento básico sobre el paradigma de programación POO (Programación orientada a objetos).
2. Conocer los tipos de datos, operadores y variables en kotlin. (Revisar a detalle los ejemplos y retos de las sesiones 1 y 2). 

### DESARROLLO

## POO: Programación Orientada a Objetos

La POO es un paradigma de programación que nos permite crear representaciones abstractas de nuestra realidad por medio de moldes.

Basándonos en la definición anterior, piensa por un momento en tu red social favorita. Seguro has visto que dentro de esa red social eres un usuario. Bien, tú como usuario sabes que tienes ciertas características y puedes realizar ciertas acciones, es decir, tienes ciertas habilidades, ¿cierto?
Por ejemplo:

    - Características
    - Foto de perfil
    - Nickname
    - Email
    - Habilidades
    - Hacer un post
    - Dar like
    - Guardar un post

Eso es una representación de la realidad, ya que en la vida real tú eres una persona con ciertas características y habilidades, pero ¿qué pasa en la vida real? Somos miles de millones de personas y es imposible que todos tengamos las mismas características y habilidades. De la misma forma sucede en la programación, la red social en la que pensaste seguramente tiene millones de usuarios, y como en la vida real hay una variedad inmensa de personas, en la red social también puede que exista una gran variedad de tipos de usuarios.

Por ejemplo, si hiciéramos una representación de una persona podríamos decir que sus características pueden ser:
- Tiene cabello
- Usa lentes
- Tiene ojos azules

Y sus habilidades pueden ser: 

- Correr
- Hablar inglés
- Programar en kotlin

El objetivo de la **POO** es descomponer estos **problemas de la vida real** en partes más pequeñas y hacer una representación abstracta por medio de modelos (moldes genéricos) de la realidad. Estos moldes o modelos son llamados **Clases** en kotlin.

Las clases se declaran con la palabra reservada **class** de kotlin, y como lo mencionábamos, una clase puede tener propiedades (características) y métodos (habilidades).

Veamos cómo podemos crear una representación de **Persona** de la vida real usando la **POO**.

> Esta es la representación más básica de una clase.
```kotlin
    class Person {  }   
```
>Las propiedades son representadas con variables.
```kotlin
    class Person {
        var name: String = ""
    }
```
>Las habilidades o capacidades (métodos) se representan con funciones.
```kotlin
    class Person {
        var name: String = ""
        
        fun sayHello() {
            println("Hello")
        }
    }
```
En el ejemplo anterior, ya declaramos una clase Person que tiene como propiedad el nombre y que puede saludar. Esta clase es un molde que podemos usar para representar personas que cumplan con esas características y que tengan esas habilidades.
Bien, ya sabemos lo que es una clase: un molde que usamos para representar cualquier cosa de la vida real, pero ¿por qué **Objetos**?
Como hemos dicho, las clases son nuestros moldes, los objetos los creamos con esos moldes, es decir, un objeto es una instancia de determinada clase. Por ejemplo, retomando nuestra clase **persona**, queremos hacer un objeto de **tu** persona. Ese objeto lo crearemos a partir de la clase Person:
>Los Objetos (instancia de una clase) se almacenan en variables (espacios en memoria).
```kotlin
    class Person {
        var name: String = ""
        
        fun sayHello() {
            println("Hello")
        }
    }

    val me: Person = Person()
```
Si te estás preguntando por qué usamos paréntesis para crear un objeto desde una clase, no te preocupes, también tiene que ver con funciones. Pronto veremos ese tema.
Una vez creado nuestro objeto, podemos acceder a sus propiedades y métodos usando la sintaxis de **.**, es decir:
>Para acceder a las propiedades o métodos de un objeto usamos **.**
```kotlin
    //Asignamos valor a una propiedad
    me.name = "Tu Nombre"
    //Invocamos uno de sus metodos
    me.sayHello()
```
Ahora que ya sabemos cómo acceder a las propiedades y métodos de nuestros objetos, tenemos que saber que de acuerdo al paradigma **POO** solo en casos muy especiales podemos acceder a las propiedades de un objeto usando el punto. Esto por cuestiones de integridad, ya que no debemos permitir que cualquier otro objeto externo a nuestra clase modifique el valor de nuestras propiedades. Estas tienen que ser accedidas por unos métodos llamados getters & setters. Por lo tanto, en kotlin como en la mayoría de los lenguajes de programación existen los **modificadores de acceso**.
Los modificadores de acceso van a determinar desde dónde podemos acceder a nuestras variables y métodos. Kotlin cuenta con los siguientes modificadores de acceso:
- **private**: Que es accesible solo dentro de la clase que lo contiene y sus métodos.
- **protected**: Igual que private y también aplicable a sus subclases.
- **internal**: Accesible entre módulos o paquetes.
- **public**: Es accesible desde cualquier clase, método, etc.

Por defecto en Kotlin todo es público, pero tenemos la habilidad de cambiarlo, entonces, retomando el ejemplo anterior lo correcto sería **esconder** la propiedad nombre y modificarla por medio de algún método o asignarla desde su **constructor**. 

Veamos qué significa esto:
>Escondemos la variable name, del exterior de la clase para que ningún objeto externo la pueda modificar directamente:
```kotlin
    class Person {
        private var name: String = ""
        
        fun sayHello() {
            println("Hello")
        }
    }
```
Pero entonces, si ya no podemos acceder a nuestra propiedad nombre desde el exterior, ¿cómo es que asignaríamos un nombre a cualquier objeto del tipo Persona?
Una forma de solucionarlo es por medio de su constructor. El constructor es una función especial y presente en cada clase que se encarga de **construir/inicializar** un objeto a partir de una clase. Esto quiere decir que el constructor es el lugar perfecto para asignar los valores por defecto de nuestras propiedades. Es decir, piensa que en la vida real, desde que se crea un objeto (imagina cualquiera) ya tiene ciertas propiedades, como tamaño, peso, color etc.

Tomando lo anterior en consideración, queremos que al momento de crear una instancia de nuestra clase Person, la propiedad name ya tenga un valor inicial, y esto, como estoy seguro que lo sospechas, ocurre en el inicializador (el constructor).
En kotlin las clases tienen un constructor primario y pueden tener varios más secundarios. El constructor primario siempre formará parte de la cabecera de la declaración de la clase, es decir:
>El constructor recibe parámetros de la misma forma que cualquier otra función.
```kotlin
    class Person constructor(name: String) {
        /*...*/
    }   
```
>Si el constructor no tienen ninguna anotación o algún modificador de acceso, puede omitirse la palabra **constructor**
```kotlin
    class Person(name: String) {
        /*...*/
    }   
```
>en este punto nuestra propiedad ya solo es accedida desde dentro de la propia clase Person y se le asigna desde su creación el nombre.
```kotlin
    class Person(name: String) {
        private var name: String = name
        
        fun sayHello() {
            println("Hello")
        }
    }
```
¿Recuerdas que para inicializar nuestro objeto **me** lo hacíamos usando paréntesis? Lo que en realidad hacíamos era invocar la **función constructor** de nuestra clase.

Todo bien hasta aquí, pero ¿qué pasa si agregamos una propiedad a nuestra clase que sabemos que va a cambiar una o varias veces después de su creación? En el [Ejemplo 02](/../../tree/master/Sesion-03/Ejemplo-02/) veremos cómo con el uso de Getters & Setters. 

Por ahora ve al [Reto 01](/../../tree/master/Sesion-03/Reto-01/) y soluciona cada punto que se te pide con lo que acabas de aprender :D.0
