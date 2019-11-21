
## Ejemplo 2: Tipos de datos y operadores - Kotlin Fundamentals

### OBJETIVOS

- Reconocer y diferenciar los principales tipos de datos de Kotlin 
- Distinguir el uso de los operadores de la forma tradicional vs la sobre carga de operadores.

#### REQUISITOS

1. Realizar el prework de la sesión 1 para tener conocimientos previos básicos sobre tipos de datos y operadores 

## DESARROLLO

### Tipos de datos

Anteriormente mencionamos que **en Kotlin todo es un objeto**. Esto quiere decir que
aunque por ejemplo se trate de un número entero (Int), podremos acceder a métodos 
directamente sobre nuestra "variable" (que Kotlin trata como objeto). 

Estos métodos representan a los operadores que ya conocemos (aquí los recordaremos) pero con la diferencia de que estas funciones, métodos o acciones, que nos ofrece Kotlin sobre cada tipo, ya están optimizadas para cualquier escenario en el que se tengan que usar.

Pero primero veamos los tipos de datos básicos que Kotlin nos ofrece y la forma de declararlos.

### Números 

Kotlin viene con un conjunto de tipos de datos integrados que representan números que cubren distintas necesidades, es decir, cada tipo es diferenciado por el tamaño que ocupa en memoria y el rango de valores que puede almacenar. En la siguiente tabla verás la comparación de los datos numéricos.

Tipo | Tamaño (bits) | Valor mínimo | Valor máximo
-----|---------------|--------------|-------------
Byte | 8 | -128 | 127
Short | 16 | -32768 | 32767
Int | 32 | -2,147,483,648 (-2^31) | 2,147,483,647 (2^31 - 1)
Long | 64 | -9,223,372,036,854,775,808 (-2^63) | 9,223,372,036,854,775,807 (2^63 - 1)

> La declaración de nuestras variables con el tipo explícito nos ayuda a identificar el uso 
> que le vamos a dar a cada variable.

```kotlin
// Números (Numbers)

    val bite: Byte = 127 // 8 bits
    val short: Short = 1234 // 16 bits
    val int: Int = 324 // 32 bits
    val long: Long = 1000000000000 // 64 bits
```

Si por alguna razón declaramos las variables sin el tipo de dato, Kotlin infiere el tipo **Int**
siempre y cuando el número dado no exceda el máximo valor permitido por Int
, es decir:

> Con fines prácticos podemos declarar un valor del tipo **Long** con el sufijo **L**.
```kotlin
    var edad = 27 //Int
    var long = 27L //Long
```
Ahora bien, te preguntarás **¿qué pasa con los números con punto flotante, hexadecimales o binarios?** 
Kotlin nos permite declararlos sin ningún problema tal como son. Por ejemplo:

> Nota: Los números Octales literales no son soportados.
```kotlin
// Constantes Literales (Literal constants)

    val decimal = 123
    val hexadecimal = 0x0F
    val binario = 0b00001011

    // Números con punto flotante (floating-point numbers)

    val double: Double = 123.5
    val float: Float = 123.5f
``` 
Y además para que nuestras constantes sean mucho más claras y entendibles podemos usar **_** (Underscores)
a la hora de declararlas, esto con el fin de que siempre tengamos un código limpio y que sea 
autodescriptivo.

```kotlin
    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010
```
Ahora, ¿recuerdas que los tipos de datos numéricos se definen por el tamaño en memoria y el rango de números que puede contener? 
Pues bien, ¿qué pasa si necesitamos que nuestro número sea siempre un numero positivo? es decir, un número sin signo.

Para esto contamos con los mismos tipos numéricos que ya hemos visto, pero con la diferencia de que se declaran con el prefijo **U**
En el tipo y con el sufijo **u** en el valor. De esta forma kotlin entiende que esos son valores numéricos absolutos.

```kotlin
    // Enteros sin signo (Unsigned integers)

    val uByte: UByte = 1u
    val uShort: UShort = 2u
    val uInt: UInt = 3u
    val uLong: ULong = 4u
```
### Caracteres

En este como en otros leguajes de programación, siempre tenemos la necesidad de representar caracteres, ya sean numéricos, alfanuméricos o especiales, kotlin nos brinda el tipo de datos **Char** el cual nos permitirá representarlos. En la declaración, los caracteres tendrán que ir entre comillas simples **'** tal como se muestra:

```kotlin
    val letra: Char = 'A'
```

Adicional a esto, con el tipo **Char** es posible representar secuencias de escape como **\t**, **\b**, **\n**,
**\r** etc. 

Sí, también podemos representar caracteres con su código **Unicode**, por ejemplo:

```kotlin
    // Caracteres (Characters)

    val letra: Char = 'A'
    val escapeSecuence: Char = '\t'
    val unicode: Char = '\uFF00'

    println("Char " + unicode)
``` 

### Booleanos

Este tipo de dato es sumamente útil (indispensable) a la hora de tomar decisiones o crear iteraciones (más adelante hablaremos de ello), los tipos booleanos tienen la característica de que solo pueden contener uno de dos valores, es decir, **true** o **false**, o como coloquialmente lo conocemos, cierto o falso, la declaración de estos es como a continuación se muestra:
>En las próximas clases veremos la importancia del uso de los booleanos.
```kotlin
    // Boleanos (Booleans)

    val si: Boolean = true
    val no: Boolean = false
```

### Arreglos

Imagina que tienes un grupo de 5 personas, y por alguna razón te toca almacenar la edad de cada una de las personas para posteriormente mostrarlas, podríamos hacerlo de esta forma:

```kotlin
//Edades
val edadPersona_1 = 20
val edadPersona_2 = 20
val edadPersona_3 = 20
val edadPersona_4 = 20
val edadPersona_5 = 20

//Imprimiendo las edades
println(edadPersona_1)
println(edadPersona_2)
println(edadPersona_3)
println(edadPersona_4)
println(edadPersona_5)
```
Sencillo ¿cierto?, ahora imagina que tienes que almacenar las edades de 1000 personas, aquí es donde el asunto se vuelve complicado, para eso, como en la mayoría de los lenguajes de programación podemos crear colecciones o conjuntos de datos almacenados en una sola variable, es decir en un solo espacio en memoria.

Los Arrays en Kotlin representan un espacio en memoria en el cual podemos almacenar una colección o conjunto de datos y pueden declararse de distintas formas, veamos algunas:

> Declaramos los arreglos **numeros** y **vocales** con la ayuda de la clase **arrayOf()**
> Los arreglos **numerosString** y **numerosString2** están declarados con ayuda de la clase Array la cual cuenta
> con un inicializador que nos permite crear iteraciones definidas por el parámetro que recibe
> que en este caso es la cantidad de elementos que va a contener.
```kotlin
    val numeros: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val vocales: Array<String> = arrayOf("A", "B", "C", "D", "E")
    val numerosString: Array<String> = Array(5) { i -> (i * i).toString() }
    val numerosString2: Array<String> = Array(5) { i -> i.times(i).toString() }
```

Con los arreglos existe un sinnúmero de operaciones/interacciones que podemos tener, las más comunes y que vamos a usar con más frecuencia son:

- Iterar sobre cada uno de los elementos.
- Insertar nuevos elementos (siempre y cuando nuestra variable Array se haya declarado con un tipo de variable changeable, es decir var).
- Obtener elementos del arreglo. 

Ejemplo:

```kotlin
    var numeros: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    
    //Iterar sobre cada uno de los elemetos
    numeros.forEach { println(it) }

    //Insertar un elemento nuevo al arreglo
    numeros.set(numeros.size -1, 6)

    //Obtener un elemento de una posicion especifica dentro del arreglo
    val elemento = numeros.get(1)
```
En el ejemplo anterior imprimimos cada uno de los elementos del arreglo, agregamos uno nuevo, y obtuvimos un elemento de una ubicación específica en el arreglo (al final de esta clase profundizamos en el tema).

Ahora que conocemos la utilidad de los Arrays, retomemos nuestro ejemplo de las edades, con el uso de arreglos podríamos hacer exactamente lo mismo que ya habíamos hecho pero de la siguiente forma:

```kotlin
    val edades: Array<Int> = arrayOf(20, 20, 20, 20, 20)
    edades.forEach { println(it) }
```

Como puedes ver, es mucho más sencillo y claro lo que estamos haciendo, por eso es que es tan importante que conozcas lo necesarios que son los Arrays.

### Cadenas de texto (Strings)

Las cadenas de texto son representadas por el tipo **String**, si queremos verlo de una forma sencilla y viniendo de entender los arreglos y colecciones, digamos de un String es una coleccion de caracteres (Char) y esto nos resulta en una cadena de texto.
La declaración de los Strings van entre comillas **"**, ejemplo:

```kotlin
    val nombre: String = "Tu Nombre"
```

También existen Strings literales, los cuales nos van a permitir incluir caracteres especiales como secuencias de escape y escribir textos planos en párrafo, ejemplo:

```kotlin
    val escapingString: String = "Hola BEDU!\n"
    val rawString: String = """
        Hola, este es un rawString,
        y se puede escribir en varias lineas.
    """.trimIndent()
```

Por último, en kotlin existen los **String templates**, que nos van a dar la capacidad de incluir expresiones y código evaluable dentro de una cadena de texto.

En el caso de que necesitemos incluir el valor de una variable dentro de un String, este tiene que ir acompañado 
de un "dollar sign" ($) antes de la variable a evaluar. Para las expresiones también tendremos que agregar el mismo ($)
pero con la diferencia de que nuestra expresión a evaluar irá entre llaves ({}), ejemplo:

```kotlin
    val edad: Int = 27
    println("Mi edad es $edad")

    val texto: String = "Hola BEDU!"
    println("texto tiene ${texto.length} caracteres")
```

### Operadores

En el Ejemplo 1 y al principio de este, hablamos sobre cómo es que kotlin trata a las variables, sabemos que en kotlin todo es un objeto, ahora bien, veamos los operadores con los que contamos en kotlin junto con la función o método a la que se han transportado.

Es importante que recuerdes que puedes hacer uso de los operadores como su expresión lo indica o bien accesando a ellos por medio del método que forma parte de la variable (objeto) que estés usando.

Estamos hablando del **Operator overloadig**, que consiste en transladar los operadores como expresiones a funciones. A continuación verás los operadores más comunes, su representación como expresión, su equivalente en función y su uso.

### Unarios

Expresion | Funcion
----------|--------
+a | a.unaryPlus()
-a | a.unaryMinus()
!a | a.not()

> Este es un ejemplo de cómo puedes hacer overloading de los operadores unarios.
```kotlin
    /*
    * Operadores
    */

    var a = 100
    val b = 120
    var c:Int = 12
    var d:Int = 23
    var yes = true

    // Operaciones Unarias (Unary operations)

    a.unaryPlus()
    a.unaryMinus()
    yes.not()
```

### Incrementales / Decrementales

Expresion | Funcion
----------|--------
a++ | a.inc()
a-- | a.dec()

> Estos operadores van a incrementar o decrementar en 1 el valor de nuestra variable, ya que esta acción mutará el valor de la misma, es necesario que nuestra
>variable sea **var** y no **val**.
```kotlin
    // Incrementales y decrementles (Increments and decrements)

    a.inc()
    a.dec()
```

### Operadores binarios

Expresión | Función
----------|--------
a + b | a.plus(b)
a - b | a.minus(b)
a * b | a.times(b)
a / b | a.div(b)
a % b | a.rem(b)
a..b | a.rangeTo(b)

> Estos operadores son los más comunes, los que conocemos como aritméticos y su uso es el siguiente:
```kotlin
    var a = 100
    val b = 120

    // Operaciones binarias (Binary operations)

    a.plus(b)
    a.minus(b)
    a.times(b)
    a.div(b)
    a.rem(b)
    a.rangeTo(b)
```

### Operador 'In'

Expresion | Funcion
----------|--------
a in b | b.contains(b)
a !in b | !b.contains(b)

> El operador **In** es utilizado para determinar si un elemento está presente en otro, es decir, en este caso, preguntamos si el arreglo numbersArray
> contiene al elemento a. 
```kotlin
    val numbersArray: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7)
    println(numbersArray.contains(a))
    println(!numbersArray.contains(a))
```

### Operador de acceso indexado

Expresion | Funcion
----------|--------
a\[i] | a.get(i)
a\[i] = b | a.set(i, b)

El operador de acceso indexado es el que nos permite obtener y colocar elementos en un array basándose en su posición dentro del mismo, recordemos que un arreglo indexado comienza sus posiciones desde 0, es decir que si tenemos un arreglo con 3 elementos las posiciones del mismo serían 0, 1, 2.

> En este ejemplo hacemos uso del operador de acceso indexado para insertar y obtener un elemento de nuestro Array.
```kotlin
    val numbersArray: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7)
    val secondNumber = numbersArray.get(1)
    numbersArray.set(numbersArray.size - 1, 8)
```

### Asignaciones aumentadas

Expresion | Funcion
----------|--------
a += b | a.plusAssign(b)
a -= b | a.minusAssign(b)
a *= b | a.timesAssign(b)
a /= b | a.divAssign(b)
a %= b | a.remAssign(b)

> Para las operaciones de asignación, por ejemplo, a + = b, el compilador realiza los siguientes pasos:
  - Si la función de la columna derecha está disponible se usa como tal.
  - De lo contrario, tenemos que generar código para a = a + b (esto incluye una verificación de tipo: el tipo de a + b debe ser un subtipo de a).
  
  Por lo que es más común representarlas como expresiones.
```kotlin
    a += b
    a -= c
    a *= c
    a /= c
    a %= c
```

### Operadores de Igualdad

Expresion | Funcion
----------|--------
a == b | a.equals(b)
a != b | !a.equals(b)

> Estos operadores solo funcionan con la función equals (other: Any?): Boolean, que se puede 
>anular para proporcionar una implementación de verificación de igualdad personalizada. 
>No se llamará a ninguna otra función con el mismo nombre (como equals (other: Foo)).
```kotlin
    if(a.equals(b)) {
       println("a es igual a b")
    }

    if (!a.equals(b)) {
        println("a no es igual a b")
    }
```

### Operadores de comparación

Expresion | Funcion
----------|--------
a > b | a.compareTo(b) > 0
a < b | a.compareTo(b) < 0
a >= b | a.compareTo(b) >= 0
a <= b | a.compareTo(b) <= 0

> Todas las comparaciones que se traducen a la función compareTo() devolverán un entero (In)
```kotlin
    if (a.compareTo(b) > 0) {
        println("a es mayor que b")
    }

    if (a.compareTo(b) < 0) {
        println("a es menor que b")
    }

    if (a.compareTo(b) >= 0) {
        println("a es mayor o igual que b")
    }

    if (a.compareTo(b) <= 0) {
        println("a es menor o igual que b")
    }
```
Como puedes ver, no estamos comparando directamente a con b, más bien el valor que estamos evaluando el entero que esta función retorna que puede ser -1 ~ 1. 

Ahora que ya sabes qué tipos de datos y operadores nos ofrece kotlin, te invito a revisar la [documentación oficial](https://kotlinlang.org/docs/reference/basic-types.html) para que refuerces tu conocimiento, ve al [Reto 2](/../../tree/master/Sesion-01/Reto-02) y resuélvelo con lo que acabas de aprender.
