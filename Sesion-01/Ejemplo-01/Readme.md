
# Ejemplo 1: Sintaxis y variables - Kotlin Fundamentals

## Configuracion de nuestro entorno

### OBJETIVO

- Reconocer la  forma en la que Kotlin trata a las variables.
- Conocer las diferentes formas de declarar las variables y explicar cada una.
- Diferenciar entre una variable elemental y una variable como objeto y por qué kotlin sugiere que todo 
  sea un objeto en este lenguaje.

#### REQUISITOS

1. Instalar [IntelliJ IDEA CE](https://www.jetbrains.com/es-es/idea/download/) (La version más reciente)
2. Tener conocimiento básico de cualquier lenguaje de programación.
3. Tener ganas de aprender a crear el futuro con la mejor tecnología. 

#### DESARROLLO

Una vez que tengamos instalado el IDE (IntelliJ IDEA) vamos a crear nuestro primer proyecto de Kotlin.

> Al iniciar IntelliJ selecciona la opción de crear nuevo proyecto.

![](https://github.com/beduExpert/A1-Kotlin-Fundamentals/blob/master/Sesion-01/Ejemplo-01/imagenes/KotlinFundamentals-s1-img1.png)

> Debido a que en este curso vamos a aprender los fundamentos de Kotlin como lenguaje, vamos a seleccionar la opción 
> Kotlin y a continuacion JVM | IDEA. Después daremos en siguiente para continuar con la configuracion de nuestro 
> proyecto.

![](https://github.com/beduExpert/A1-Kotlin-Fundamentals/blob/master/Sesion-01/Ejemplo-01/imagenes/KotlinFundamentals-s1-img2.png)

> Para finalizar, solo nos falta asignar un nombre a nuestro proyecto e indicarle a nuestro IDE la ubicacion de los 
> archivos de nuestro proyecto en nuestro sistema de archivos. Cuando hayas agregado esta informacion terminaremos 
> la configuracion de nuestro proyecto dando click en el boton Finalizar.
> A continuacion IntelliJ comenzará a crear la estructura y los archivos necesarios para nuestro proyecto.

![](https://github.com/beduExpert/A1-Kotlin-Fundamentals/blob/master/Sesion-01/Ejemplo-01/imagenes/KotlinFundamentals-s1-img3.png)

> Con nuestro proyecto creado identifiquemos los archivos de nuestro proyecto (Fig. 1) Toma en cuenta que dentro de 
> la carpeta src siempre estarán nuestros archivos fuente, los cuales tendrán la extencion **kt**.

#### Creando nuestro primer archivo.

> Haz clic derecho sobre la carpeta **src** y a continuación selecciona la opcion New > Kotlin File/Class (Fig. 2).

![](https://github.com/beduExpert/A1-Kotlin-Fundamentals/blob/master/Sesion-01/Ejemplo-01/imagenes/KotlinFundamentals-s1-img5.png)

Una vez creado nuestro primer archivo de kotlin tenemos que declarar nuestro punto de entrada.

En kotlin cualquier programa que hagamos debe tener un punto de entrada. En este caso escribiremos una función 
llamada **main** que recibirá como parámetro un arreglo de Strings (no te preocupes si por ahora no entiendes algunos conceptos, más adelante en el curso entenderás
de qué se trata), de esta forma podremos ejecutar nuestro programa y ver sus resultados. Hagamos una prueba.

> Escribe la funcion **main** como se muestra a continuación. Luego, da click derecho sobre el archivo y busca la opción **Run**,
> esto provocará que nuestro IDE compile y ejecute nuestro programa en Kotlin.

```kotlin
fun main(args: Array<String>) {
    print("Hola BEDU!")
}
```

![](https://github.com/beduExpert/A1-Kotlin-Fundamentals/blob/master/Sesion-01/Ejemplo-01/imagenes/KotlinFundamentals-s1-img6.png)

> El resultado, que en nuestro caso será 
> la impresión de un mensaje, lo podremos ver en la consola que nuestro editor nos provee.

![](https://github.com/beduExpert/A1-Kotlin-Fundamentals/blob/master/Sesion-01/Ejemplo-01/imagenes/KotlinFundamentals-s1-img7.png)

## Variables y Objetos

En kotlin existen dos tipos de variables (mutable and immutable) es decir, las que se pueden modificar, y las que no,
para las cuales usamos las palabras reservadas:

- val -> immutable
- var -> mutable

Debido a que Kotlin se rige por la inmutabilidad, uno de los principios de la programacion funcional, vamos a preferir el uso 
de variables inmutables.

#### Declaración de Variables.

Existen varias formas de declarar o nombrar tus variables en Kotlin, Éstas cambian de acuerdo a la necesidad de la solución.
Es importante que a la hora de nombrar tus variables recuerdes que tienen que ser lo mas descriptivas posibles. Teniendo esto claro
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

Las variables de **asignación inmediata** son aquellas a las que se les asigna su valor en tiempo de compilación, es decir, cuando 
nuestro compilador está traduciendo nuestro código Kotlin a bitecode.

Cuando en la declaración, no especificamos el tipo de dato, Kotlin por si solo lo infiere. Es decir, podemos declarar nuestras variables
así:

```kotlin
    var nombre: String = "Tu Nnombre"
```

y también así:

```kotlin
    var nombre = "Tu Nnombre"
```

Con el fin de comenzar con buenas prácticas, es importante especificar el tipo de dato, así aseguramos que nuestro código sea 
súper claro y descriptivo.

Podemos tambien declarar variables sin asignarles un valor, éstas forzosamente tienen que ser usando la palabra resevada **var**, 
cuando declaramos varaibles sin asignarles un valor inicial es necesario especificar el tipo de dato que esta variable va a 
almacenar como se muestra a continuación: 

```kotlin
    // Variables no inicializadas (es necesario especificar el tipo)
    var direccion: String
    var numExt: Int
```

Si te preguntas, ¿qué pasó con el medio de acceso de las variables? no te preocupes, Kotlin suguiere que las variables de acceso local,
es decir, solo dentro de su función, sean declaradas como **val** siguiendo el principio de inmutabilidad. 
Es decir si tuvieramos una función que multiplicara dos numeros dados (a * b), la variable que almacenara el valor no tendria que mutar jamás y tampoco
tendría que afectar o ser afectada por elemetos externos a dicha función. Por eso lo ideal sería declararla de la siguiente forma:

```kotlin
// Variable de acceso local
fun multiplicar(a: Int, b: Int): Int {
    val result = a * b
    return  result
}
``` 

Ahora bien, si tuviesemos que usar la misma variable desde distintos puntos de nuestro programa, es decir desde distintas funciones,
tendriamos que declarar una variable de forma global o top-level. Éstas se declaran fuera de cualquier funciÓn, incluso de nuestra funcion main
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

Como puedes ver nuestra variable **PI** está siendo accedida desde dos funciones.

#### Variables VS Objetos

En Kotlin las variables se manejan de dos formas. Existen las variables "normales" por nombralas de alguna forma
y las variables tratadas como objetos. Las variables "normales" son elementales, es decir, representan un espacio en memoria
que puede almacenar solo un dato.

Las variables que son tratadas como objetos, representan un espacio en memoria más complejo. Es decir un objeto puede contener
variables elementales y métodos o acciones, ya que en kotlin todo es un objeto, vamos a preferir seguir esta linea que nos propone
el lenguage mismo.

Veamos de que se trata analizando el siguiente codigo:

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

Cuando "declaramos" variables de esta forma, Kotlin les asigna un tipo de dato primitivo. En este caso Int a cada número 
que estamos imprimiendo. Es decir, de esta forma el 1, 5 o 4 están siendo almacenados en memoria como un solo dato y por tanto 
no existen propiedades o métodos a los que podamos acceder sobre ellos. Para probarlo escribamos 1 y a continuación un punto para ver 
a que tenemos acceso sobre un valor de estos:

> Observa que los elementos que nos suguiere nuestro editor no son mas que ayuda del mismo y no forman parte como tal del número.

![](https://github.com/beduExpert/A1-Kotlin-Fundamentals/blob/master/Sesion-01/Ejemplo-01/imagenes/KotlinFundamentals-s1-img8.png)

Ahora bien, si declaramos nuestras variables como se muestra en el siguiente ejemplo, kotlin las tratará como un objeto y tendremos acceso a un 
sinfin de métodos o acciones sobre nuestras variables, que nos van a facilitar mucho las operaciones sobre nuestas variables

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

Como puedes ver, declaramos nuestras variables con la palabra reservada **val** y ahora podemos hacer las mismas operaciones que habíamos hecho
con nuestras variables elementales, pero de una forma más clara y descriptiva. Para probar y que descubras la gran cantidad de métodos que
Kotlin nos ofrece sobre cada tipo, basta con que coloques un punto después de tu variable como a continuacion:

> Observa que los elementos que nos suguiere nuestro editor, ahora son todas las operaciones que podemos hacer sobre nuestro valor y forman parte de él como tal.

![](https://github.com/beduExpert/A1-Kotlin-Fundamentals/blob/master/Sesion-01/Ejemplo-01/imagenes/KotlinFundamentals-s1-img9.png)

Si ejecutamos nuestro programa, nos daremos cuenta de que el resultaco con ambas formas aparentemente es lo mismo, pero la verdadera razon del 
porque kotlin suguiere que todo sea tratado como un objeto, es por que por ejemplo en este caso, las operaciones que hicimos al final están 
mucho más optimizadas y como lo explicamos antes, esta nueva forma permite hacer que nuestro código sea más descriptivo.

> Observa en la consola que nuestro editor nos provee el resultado de la ejecución de nuestro programa.

![](https://github.com/beduExpert/A1-Kotlin-Fundamentals/blob/master/Sesion-01/Ejemplo-01/imagenes/KotlinFundamentals-s1-img10.png)

Ahora ya conoces los tipos de variables y las formas en las que las trata kotlin, ve al [Reto 1](/../../tree/master/Sesion-01/Reto-01) y complétalo con tu nuevo conocimiento.
