
# Ejemplo 1: Sintaxis y variables - Kotlin Fundamentals

## Configuracion de nuestro entorno

### OBJETIVO

- Reconocer la  forma en la que Kotlin trata a las variables.
- Conocer las diferentes formas de declarar nuestras variables y el por qué de cada una.
- Diferenciar entre una variable elemental y una variable como objeto y el por qué kotlin sugiere que todo 
  sea un objeto en este lenguaje.

#### REQUISITOS

1. Tener instalado [IntelliJ IDEA CE](https://www.jetbrains.com/es-es/idea/download/) (La version mas reciente)
2. Tener conocimiento basico de cualquier lenguaje de programacion.
3. Tener ganas de aprender a crear el futuro con la mejor tecnologia :).

#### DESARROLLO

Una vez que tengamos instalado nuestro IDE vamos acrear nuestro primer proyecto de Kotlin.

> Al iniciar IntelliJ vamos a seleccionar la opcion de crear nuevo proyecto.

![](https://github.com/beduExpert/A1-Kotlin-Fundamentals/blob/master/Sesion-01/Ejemplo-01/imagenes/KotlinFundamentals-s1-img1.png)

> Debido a que en este curso vamos a aprender los fundamentos de Kotlin como lenguage, vamos a seleccionar la opcion 
> Kotlin y a continuacion JVM | IDEA, despues daremos en siguiente para continuar con la configuracion de nuestro 
> proyecto.

![](https://github.com/beduExpert/A1-Kotlin-Fundamentals/blob/master/Sesion-01/Ejemplo-01/imagenes/KotlinFundamentals-s1-img2.png)

> Para finalizar, solo nos falta asignar un nombre a nuestro proyecto e indicarle a nuestro IDE la ubicacion de los 
> archivos de nuestro proyecto en nuestro sistema de archivos, cuando hayas agregado esta informacion terminaremos 
> la configuracion de nuestro proyecto dando click en el boton Finalizar.
> A continuacion IntelliJ comenzara a crear la estructura y los archivos necesarios para nuestro proyecto.

![](https://github.com/beduExpert/A1-Kotlin-Fundamentals/blob/master/Sesion-01/Ejemplo-01/imagenes/KotlinFundamentals-s1-img3.png)

> Ya con nuestro proyecto creado identifiquemos los archivos de nuestro proyecto (Fig. 1) y ten en cuenta que dentro de 
> la carpeta src siempre estaran nuestros archivos fuente, los cuales tendran la extencion kt.

#### Creando nuestro primer archivo.

> Haz clic derecho sobre la carpeta src y a continuacion selecciona la opcion New > Kotlin File/Class (Fig. 2).

![](https://github.com/beduExpert/A1-Kotlin-Fundamentals/blob/master/Sesion-01/Ejemplo-01/imagenes/KotlinFundamentals-s1-img5.png)

Una vez creado nuestro primer archivo de kotlin tenemos que decalrar nuestro punto de entrada.

En kotlin cualquier programa que hagamos tiene que tener un punto de entrada, en nuestro caso escribiremos una funcion 
llamada **main** que recibira como parametro un arreglo de Strings (no te preocupes, mas adelante en el curso entenderas
de que se trata), de esta forma podremos ejecutar nuestro programa y ver sus resultados, hagamos una prueba.

> Escribe la funcion main de la sigiente forma y a continuacion da click derecho sobre el archivo y busca la opcion Run,
> esto provocoara que nuestro IDE compile y ejecute nuestro programa en kotlin.

```kotlin
fun main(args: Array<String>) {
    print("Hola BEDU!")
}
```

![](https://github.com/beduExpert/A1-Kotlin-Fundamentals/blob/master/Sesion-01/Ejemplo-01/imagenes/KotlinFundamentals-s1-img6.png)

> El resultado, que en nuestro caso sera 
> la impresion de un mensaje, lo podremos ver en la consola que nuestro editor nos provee.

![](https://github.com/beduExpert/A1-Kotlin-Fundamentals/blob/master/Sesion-01/Ejemplo-01/imagenes/KotlinFundamentals-s1-img7.png)

## Variables y Objetos

En kotlin existen dos tipos de variables (changeables y unchangeables) es decir, las que se pueden modificar, y las que no,
para las cuales tenemos las palabras reservadas:

- val -> Unchangeable
- var -> Changeable

Debido a que kotlin se rige por la inmutabilidad, uno de los principios de la programacion funcional, vamos a preferir el uso 
de variables unchangeables.

#### Decalracion de Variables.

Existen varias formas de declarar o nombrar tus variables en kotlin, estas cambian de acuerdo a la necesidad de la solucion,
es importante que a la hora de nombrar tus variables recuerdes que tienen que ser lo mas descriptivas posibles, teniendo esto claro
veamos de que formas podemos declararlas.

```kotlin
    // Variables locales de asignacion inmediata
    val nombre: String = "Mi nombre"
    val edad: Int = 27

    // Tipo de dato inferido
    val apellido = "Mi apellido"
    val mes = 12

    // Variables no inicializadas (es necesario especificar el tipo)
    var direccion: String
    var numExt: Int
```

Las variables de **asignacion inmediata** son aquellas a las que se les asigna su valor en tiempo de compilacion, es decir cuando 
nuestro compilador esta traduciendo nuestro codigo kotlin a bitecode.

Cuando en la declaracion, no especificamos el tipo de dato, kotlin por si solo lo infiere, es decir que podemos declarar nuestras variables
tanto asi:

```kotlin
    var nombre: String = "Tu Nnombre"
```

como asi:

```kotlin
    var nombre = "Tu Nnombre"
```

Pero con el fin de comenzar con buenas practicas, es importante especificar el tipo de dato, asi aseguramos que nuestro codigo sea 
super claro y descriptivo.

Podemos tambien declarar variables sin asignarles un valor, estas forzosamente tienen que ser usando la palabra resevada **var**, 
cuando declaramos varaibles sin asignarles un valor inicial es necesario especificar el tipo de dato que esta variable va a 
almacenar como a continuacion se muestra:

```kotlin
    // Variables no inicializadas (es necesario especificar el tipo)
    var direccion: String
    var numExt: Int
```

Si te preguntas, que paso con el medio de acceso de las variables? no te preocupes, kotlin suguiere que las variables de acceso local
es decir solo dentro de su funcion sean declaradas como **val** siguiendo el principio de inmutabilidad, es decir si tubieramos 
una funcion que multiplicara dos numeros dados (a * b) la variable que almacenara el valor no tendria que mutar jamas y tampoco
tendria que afectar o ser afectada por elemetos externos a dicha funcion, por eso lo ideal seria declarala de la siguiente forma:

```kotlin
// Variable de acceso local
fun multiplicar(a: Int, b: Int): Int {
    val result = a * b
    return  result
}
``` 

Ahora bien, si tuviesemos que usar la misma variable desde distintos puntos de nuestro programa, es decir desde distintas funciones,
tendriamos que declarar una una variable de forma global o top-level, estas se declaran fuera de cualquier funcion, incluso de nuestra funcion main
y de esta forma podremos acceder a dicha variable desde cualquier parte de nuestro programa:

```kotlin
// Variables globales o Top-level
val PI = 3.1416

fun printPI() {
    println(PI)
}

// Variable de acceso local
fun multiplicar(a: Int, b: Int): Int {
    val result = a * b
    
    //Accediendo a una variable global
    println(PI)
    
    return  result
}
```

Como puedes ver nuestra variable **PI** esta siendo accedida desde dos funciones.

#### Variables VS Objetos

En kotlin las variables se pmanejan de dos formas distintas (no te preocupes si por ahora no entiendes algunos conceptos
mas adelante se hablara de ello o bien puedes pedir apoyo de tu instructor). exiten las variables "normales" por nombralas de alguna forma
y las variables tratadas como objetos, las variables "normales" son elementales, es decir, representan un espacio en memoria
que puede almacenar solo un dato.

Las variables que son tratadas como objetos representan un espacio en memoria mas complejo, es decir un objeto puede contener
variables elementales y metodos o acciones, ya que en kotlin todo es un objeto, vamos a preferir seguir esta linea que nos proponer
el lenguage mismo.

veamos de que se trata analizando el siguiente codigo:

```kotlin
    /*
    * Variables tratadas con tipos primitivos
    */

    println(1)
    println(5 + 4)
    println(5 - 4)
    println(5 * 4)
    println(5 / 4)
```

Cuando "declaramos" variables de esta forma, kotlin les asigna un tipo de datos primitivo, en este caso Int a cada numero 
que estamos imprimindo, es decir de esta forma el 1, 5 o4 estan suendo almacenados en memoria como un solo dato y por tanto 
no existen propiedades o metodos a los que podamos acceder sobre ellos, para probarlo escribamos 1 y acontinuacion un punto para ver 
a que tenemos acceso sobre un valor de estos:

> Observa que los elementos que nos suguiere nuestro editor no son mas que ayuda del mismo y no forman parte como tal del numero.

![](https://github.com/beduExpert/A1-Kotlin-Fundamentals/blob/master/Sesion-01/Ejemplo-01/imagenes/KotlinFundamentals-s1-img8.png)

Ahora bien, si declaramos nuestras variables como acontinuacion, kotlin las tratara como un objeto y tendremos acceso a un 
sinfin de metodos o acciones sobre nuestras variables que nos van a facilitar mucho las operaciones sobre nuestas variables

```kotlin
    /*
    * Variables tratadas como objetos
    */

    val a = 5
    val b = 4

    println(a.plus(b))
    println(a.minus(b))
    println(a.times(b))
    println(a.div(b))
```

Como puedes ver, declaramos nuestras variables con la palabra reservada **val** y ahora podemos hacer las mismas operaciones que habiamos hecho
con nuestras variables elementales pero de una forma mas clara y descriptiva. para probar y que descubras la gran cantidad de metodos que
kotlin nos ofrese sobre cada tipo basta con que coloques un puntodespues de tu variable como a continuacion:

> Observa que los elementos que nos suguiere nuestro editor ahora son todas las operaciones que podemos hacer sobre nuestro valor y forman parte de el como tal.

![](https://github.com/beduExpert/A1-Kotlin-Fundamentals/blob/master/Sesion-01/Ejemplo-01/imagenes/KotlinFundamentals-s1-img9.png)

Si ejecutamos nuestro programa nos daremos cuenta de que el resultaco con ambas formas aparentemente es lo mismo, pero la verdadera razon del 
porque kotlin suguiere que todo sea tratado como un objeto es por que por ejemplo en este caso, las operaciones que hicimos al final estan 
mucho mas optimizadas y como lo exolicamos antes, esta nueva forma nos permite hacer que nuestro codigo sea mas descriptivo.

> Observa en la consola que nuestro editor nos provee el resultado de la ejecucion de nuestro programa.

![](https://github.com/beduExpert/A1-Kotlin-Fundamentals/blob/master/Sesion-01/Ejemplo-01/imagenes/KotlinFundamentals-s1-img10.png)

Ahora ya conoces los tipos de variables y las formas en las que las trata kotlin, ve al [Reto 1](/../../tree/master/Sesion-01/Reto-01) y completalo con tu nuevo conocimiento.
