## Programacion orientada a objetos

### OBJETIVO

- Que el alumno aprenda los siguientes temas:
    - Programación orientada a objetos
    - Clases y objetos
    - Propiedades y métodos
    - Constructores

#### REQUISITOS

1. Tener conocimiento basico sobre el paradigma de programacion POO (Programacion orientada a objetos).
2. Conocer los tipos de datos, operadores y variables en kotlin.

### DESARROLLO

## POO: Programacion Orientada a Objetos

La POO es un paradigma de programacion que nos permite crear representaciones abstractas de nuestra realidad por medio 
de moldes.

Basandonos en la definicion anterior, piensa por un momento en tu red social favorita, seguro has visto que tu, dentro de
esa red social eres un usuario, lo tienes? bien, entonces tu como usuario sabras que tienes ciertas caracteristicas y puedes
realizar ciertas acciones, es decir, tienes ciertas habilidades, cierto?

Por ejemplo:

- Caracteristicas:
    - Foto de perfil.
    - Nickname.
    - Email.
    
- Habilidades:
    - Hacer un post.
    - Dar like.
    - Guardar un post.

Eso es una representacion de la realidad, ya que en la vida real tu eres una persona con ciertas caracteristicas y habilidades, 
pero que pasa en la vida real? somos miles de millones de personas y es imposible que todos tengamos las mismas caracteristicas
y habilidades, de la misma forma sucede en la programacion, la red social en la que pensaste seguramente tiene millones de 
usuarios y como en la vida real hay una variedad inmensa de personas, en la red social tambien puede que exista una gran variedad de 
tipos de usuarios.

Por ejemplo, si hicieramos una representacion de una persona podriamos decir que sus caracteristicas podrian ser:

- Tiene pelo.
- Usa lentes.
- Tiene ojos azules.

Y sus habilidades podrian ser: 

- Correr.
- Hablar ingles.
- Programar en kotlin.

El objetivo de la **POO** es descomponer estos **problemas de la vida real** en partes mas pequeñas y hacer una representacion abstracta
por medio de modelos (moldes genericos) de la realidad, estos moldes o modelos son llamados **Clases** en kotlin.

Las clases se declaran con la palabra reservada **class** de kotlin, y como lo mencionabamos, una clase puede tener propiedades (caracteristicas)
y metodos(habilidades).

Veamos como podemos crear una representacion de **Persona** de la vida real usando la **POO**.

> Esta es la representacion mas basica de una clase
```kotlin
    class Person {  }   
```
>Las propiedades son representadas con variables
```kotlin
    class Person {
        var name: String = ""
    }
```
>Las habilidades o capacidades (metodos) se representan con funciones.
```kotlin
    class Person {
        var name: String = ""
        
        fun sayHello() {
            println("Hello")
        }
    }
```
En el ejemplo anterior ya declaramos una clase Person que tiene como priopiedad el nombre y que puede saludar, esta clase es un molde
que podemos usar para representar personas que cumplan con esas caracteristicas y que tengan esas habilidades.

Bien ya sabemos lo que es una clase, es un molde, que usamos para representar cualquier cosa de la vida real, pero porque **Objetos**?

Como lo venimos diciendo las clases son nuestros moldes, los objetos los creamos con esos moldes, es decir, un objeto es una instancia 
de determinada clase, por ejemplo, retomando nuestra clase persona, queremos hacer un objeto de **tu** persona, ese objeto lo crearemos a 
partir de la clase Person:
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
Si te estas preguntando por que usamos parentesis para crear un objeto desde una clase, no te preocupes, tambien tiene que ver con funciones,
pronto veremos ese tema.

Una vez creado nuestro objeto podemos acceder a sus propiedades y metodos usando la sintaxis de **.**, es decir:
>Para acceder a las propiedades o metodos de un objeto usamos **.**
```kotlin
    //Asignamos valor a una propiedad
    me.name = "Tu Nombre"
    //Invocamos uno de sus metodos
    me.sayHello()
```
Ahora que ya sabemos como acceder a las propiedades y metodos de nuestros objetos tenemos que saber que de acuerdo al paradigma POO
solo en casos muy especiales podemos acceder a las propiedades de un objeto usando el punto, esto por cuestiones de integridad, ya que 
no debemos permitir que cualquier otro objeto externo a nuestra clase modifique el valor de nuestras propiedades, estas tienen que ser 
accedidas por unos metodos llamados getters & setters, por lo tanto en kotlin como en la mayoria de los lenguages de programacion existen 
los modificadores de acceso.

Los modificadores de acceso van a determinar desde donde podemos acceder a nuestras variables y metodos, kotlin cuenta con los siguientes
modificadores de acceso:

- private: Que es accesible solo dentro de la clase que lo contiene y sus metodos.
- protected: Igual que private pero tambien aplicable a sus subclases.
- internal: Accesible entre modulos o paquetes.
- public: Es accesible desde cualquier clase, metodo etc..

Por defecto en kotlin todo es public, pero tenemos la habilidad de cambiarlo, entonces, retomando el ejemplo anterior.

Lo correcto seria **esconder** la propiedad nombre y modificarla por medio de algun metodo o asignala desde su **constructor**. 
Veamos que significa esto:
>Escondemos la variable name, del exterior de la clase para que ningun objeto externo la pueda modificar directamente:
```kotlin
    class Person {
        private var name: String = ""
        
        fun sayHello() {
            println("Hello")
        }
    }
```
Pero entonces, si ya no podemos acceder a nuestra propiedad nombre desde el exterior, como es que asignariamos un nombre 
a cualquier objeto del tipo Persona?

Una forma de solucionarlo es por medio de su constructor, el constructor es una funcion especial y presente en cada clase que 
se encarga de **construir/inicializar** un objeto a partir de una clase, eso quiere decir que en el constructor es el lugar perfecto
para asignar los valores por defecto de nuestras propiedades, es decir, piensa que en la vida real, desde que se crea un objeto (imagina cualquiera)
desde su creacion este objeto ya tiene ciertas propiedades, como tamaño, peso, color etc.

Tomando lo anterior en consideracion, queremos que al momento de crear una instancia de nuestra clase Person, la propiedad name 
ya tenga un valor inicial, y esto como estoy seguro que lo sospechas ocurre en el inicializador (el constructor).

En kotlin las clases tienen un constructor primario y pueden tener varios mas secundarios, el constructor primario siempre formara parte de la
cabecera de la declaracion de la clase, es decir:
>El contructor recibe parametros de la misma forma que cualquier otra funcion.
```kotlin
    class Person constructor(name: String) {
        /*...*/
    }   
```
>Si el constructor no tienen ninguna anotacion o algun modificador de acceso, puede omitirse la palabra **constructor**
```kotlin
    class Person(name: String) {
        /*...*/
    }   
```
>en este punto nuestra propiedad ya solo es accedida desde dentro de la propia clase Person y se le asigna desde su creacion el nombre.
```kotlin
    class Person(name: String) {
        private var name: String = name
        
        fun sayHello() {
            println("Hello")
        }
    }
```
Recuerdas que para inicializar nuestro objeto **me** lo haciamos usando parentesis, lo que en realidad destabamos haciendo era
invocar la **funcion contructor** de nuestra clase.

Todo bien hasta aqui, pero que pasa si agregamos una propiedad a nuestra clase que sabemos que va a cambiar una o varias veces despues de 
su creacion? En el [Ejemplo 02](/../../tree/master/Sesion-03/Ejemplo-02/) veremos como con el uso de Getters & Setters. Por ahora ve al 
[Reto 01](/../../tree/master/Sesion-03/Reto-01/) y soluciona cada punto que se te pide con lo que acabas de aprender :D.