
## Ejemplo 2: Tipos de datos y operadores - Kotlin Fundamentals

### OBJETIVO

- Que el alumno conozca los principales tipos de datos que el lenguage nos 
ofrece.
- Que el alumno comprenda el uso de los operadores de la forma tracicional vs la sobre carga de operadores.

#### REQUISITOS

1. Tener conocimientro previo sobre tipos de datos y operadores (ver prework)

## DESARROLLO

### Tipos de datos

Ya habiamos hablado de que en kotlin todo es un objeto por lo que tu y yo sabemos que
aunque se trate de un numero entero (Int) por ejemplo, podremos acceder a metodos 
directamente sobre nuestra "variable (que kotlin trata como objeto)", estos metodos represntan
a los operadores que ya conocemos (aqui los recordamos, no te preocupes) pero con la diferencia de 
que estas funciones, metodos o aciones que nos ofrece kotlin sobre cada tipo
ya estan optimizadas para cualquier escenario en el que se tanga que hacer uso
de los mismos.

Pero primero veamos los tipos basicos que kotlin nos ofrece y la forma de declararlos.

### Numeros 

Kotlin viene con un conjunto de tipos integrados que representan numeros que cubren
distintas necesidades, es decir, cada tipo es diferenciado por el tamaño que 
ocupa en memoria y el rango de valores que puede almacenar, en la siguiente tabla veras 
la comparacion de los tipos numericos.

Tipo | Tamaño (bits) | Valor minimo | Valor maximo
-----|---------------|--------------|-------------
Byte | 8 | -128 | 127
Short | 16 | -32768 | 32767
Int | 32 | -2,147,483,648 (-2^31) | 2,147,483,647 (2^31 - 1)
Long | 64 | -9,223,372,036,854,775,808 (-2^63) | 9,223,372,036,854,775,807 (2^63 - 1)

> La declaracion de nuestras variables con el tipo explicito nos ayuda a identificar el uso 
> que le vamos a dar a cada variable.

```kotlin
// Numeros (Numbers)

    val bite: Byte = 127 // 8 bits
    val short: Short = 1234 // 16 bits
    val int: Int = 324 // 32 bits
    val long: Long = 1000000000000 // 64 bits
```

Si por alguna razon declaramos las variables sin el tipo, kotlin infiere el tipo **Int**
siempre y cuando el numero dado no exceda el maximo valor permitido por Int
, es decir:

> Con fines practicos podemos declarar un valor del tipo **Long** con el sufijo **L**.
```kotlin
    var edad = 27 //Int
    var long = 27L //Long
```
Ahora bien, te pregutaras que pasa con los numeros con punto flotante, hexadecimales o binarios?, no te preocupes, 
kotlin nos permite declararlos sin ningun problema tal como son, por ejemplo:

> Nota: Los numeros Octales literales no son soportados.
```kotlin
// Constantes Literales (Literal constants)

    val decimal = 123
    val hexadecimal = 0x0F
    val binario = 0b00001011

    // Numeros con punto flotante (floating-point numbers)

    val double: Double = 123.5
    val float: Float = 123.5f
``` 
Y ademas para que nuestras constantes sean mucho mas claras y entendibles podemos usar **_** (Underscores)
a la hora de declararlas, esto con el fin de que siempre tengamos un codigo limpio y que sea 
auto descriptivo.

```kotlin
    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010
```
Ahora, recuerdas que los tipos de datos numericos se definen por el tamaño en memoria y el rango de numeros que puede contener? 
pues bien, que pasa si necesitamos que nuestro numero sea siempre un numero positivo? es decir, un numero sin signo.

Para esto contamos con los mismos tipos numericos que ya hemos visto pero con la diferencia de que se decalran con el prefijo **U**
en el tipo y con el sufijo **u** en el valor, de esta forma kotlin entiende que esos son valores numericos absolutos.

```kotlin
    // Enteros sin signo (Unsigned integers)

    val uByte: UByte = 1u
    val uShort: UShort = 2u
    val uInt: UInt = 3u
    val uLong: ULong = 4u
```
### Caracteres

En este como en otros leguages de programacion, siempre tenemos la nesecidad de representar caracteres, ta sean numericos,
alfanumericos o especiales, kotlin nos brinda el tipo de datos **Char** el cual nos permitira representarlos, en la declaracion
los caracteres tendran que ir entre comillas simples **'** es decir:

```kotlin
    val letra: Char = 'A'
```

Adicional a esto, con el tipo **Char** es posible representar secuencias de escape como **\t**, **\b**, **\n**,
**\r** etc. 

Si, tambien podemos representar caracteres con su codigo **Unicode**, por ejemplo:

```kotlin
    // Caracteres (Characters)

    val letra: Char = 'A'
    val escapeSecuence: Char = '\t'
    val unicode: Char = '\uFF00'

    println("Char " + unicode)
``` 

### Boleanos

Este tipo de dato es sumamente util (indispensable) a la hora de tomar desiciones o crear iteraciones (mas adelante heblaremos de ello),
los tipos boleanos tiene la caracteristica de que solo pueden contener uno de dos valores, es decir, **true** o **false**, o como coloquialmente
lo conocemos, cierto o falso, la declaracion de estos es como a continuacion se muestra:

>En las proximas clases veremos la importancia del uso de los boleanos.
```kotlin
    // Boleanos (Booleans)

    val si: Boolean = true
    val no: Boolean = false
```

### Arreglos

Imagina que tienes un grupo de 5 personas, y por alguna razon te toca almacenar la edad de cada una 
de las personas para posteriormente mostrarlas, podriamos hacerlo de esta forma:

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
Sencillo cierto?, ahora imagina que tienes que almacenar las edades de 1000 personas, aqui es donde el asunto 
se vuelve complicado, para eso, como en la mayoria de los lenguages de programacion podemos crear colecciones
o conjuntos de datos almacenados en una sola variable, es decir en un solo espacio en menoria.

Los Arrays en kotlin representan un espacio en memoria en el cual podemos almacenar una coleccion o conjunto de datos y pueden declararse de distintas formas, veamos algunas:

> Declaramos los arreglos **numeros** y **vocales** con la ayuda de la clase **arrayOf()**
> Los arreglos **numerosString** y **numerosString2** estan declarados con ayuda de la clase Array la cual cuenta
> con un inicializador que nos permite crear iteraciones definidas por el parametro que recibe
> que en este caso es la cantidad de elementos que va a contener.
```kotlin
    val numeros: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val vocales: Array<String> = arrayOf("A", "B", "C", "D", "E")
    val numerosString: Array<String> = Array(5) { i -> (i * i).toString() }
    val numerosString2: Array<String> = Array(5) { i -> i.times(i).toString() }
```

Con los arreglos existe un sin numero de operaciones/interacciones que podemos tener, las mas comunes y que vamos a 
usar con mas frecuencia son:

- Iterar sobre cada uno de los elementos.
- Insertar nuevos elemetos (siemore y cuando nuestra variable Array se haya declarado con un tipo de variable changeable, es decir var).
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
En el ejemplo anterior imprimimos cada uno de los elementos del arreglo, agregamos uno nuevo, y obtubimos un elemento de una ubucaion especifica en el arreglo (al final de esta clase profundizamos en el tema).

Ahora que conocemos la utilidad de los Arrays, retomemos nuestro ejemplo de las edades, con el uso de arreglos podriamos hacer exactamente los mismo que ya habiamos hecho pero 
de la siguiente forma:

```kotlin
    val edades: Array<Int> = arrayOf(20, 20, 20, 20, 20)
    edades.forEach { println(it) }
```

Como puedes ver, es mucho mas sencillo y claro lo que estamos haciendo, por eso es que es tan importante que conozcas lo necesarios que son 
los Arrays.

### Cadenas de texto (Strings)

Las cadenas de texto son representadas por el tipo String, si queremos verlo de una forma sencilla 
y viniendo de entender los arreglos y colecciones, digamos de un String es una coleccion de caracteres (Char)
y esto nos resulta en una cadena de texto.

La declaracion de los Strings van entre comillas **"**, ejemplo:

```kotlin
    val nombre: String = "Tu Nombre"
```

Tambien existen Strings literales, los cuales nos van a permitir incluir caracteres especiales como secuencias de escape
y escribir textos planos en parrafo, ejemplo:

```kotlin
    val escapingString: String = "Hola BEDU!\n"
    val rawString: String = """
        Hola, este es un rawString,
        y se puede escribir en varias lineas.
    """.trimIndent()
```

Por ultimo, en kotlin existen los String templates, que nos van a dar la capacidad de poder incluir expresiones
y codigo evaluable dentro de una cadena de texto.

En el caso de que necesitemos incluir el valor de una variable dentro de un String este tiene que ir acompañado 
de un "dollar sign" ($) antes de la variable a evaluar, para las expresiones tambien tendremos que agregar el mismo ($)
pero con la diferencia de que nuestra expresion a evaluar ira entre llaves ({}), ejemplo:

```kotlin
    val edad: Int = 27
    println("Mi edad es $edad")

    val texto: String = "Hola BEDU!"
    println("texto tiene ${texto.length} caracteres")
```

### Operadores

En el Ejemplo 1 y al principio de este hablamos sobre como es que kotlin trata a las variables, sabemos que en kotlin todo es un objeto, ahora bien,
veamos los operadores con los que contamos en kotlin junto con la funcion o metodo a la que se han transportado.

Es importante que recuerdes que puedes hacer uso de los operadores como su expresion lo indica o bien accesando a ellos por medio del metodo que forma parte 
de la variable (objeto) que estes usando.

Estamos hablando del Operator overloadig, que consiste en transladar los operadores como expresiones a funciones, a continuacion veras
los operadores mas comunes, su representacion como expresion, su equivalente en funcion y su uso.

### Unarios

Expresion | Funcion
----------|--------
+a | a.unaryPlus()
-a | a.unaryMinus()
!a | a.not()

> Este es un ejemplo de como puedes hacer overloading de los operadores unarios.
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

> Estos operadores van a incrementar o decrementar en 1 el valor de nuestra variable, ya que esta accion mutara el valor de la misma, es necesario que nuestra
>variable sea **var** y no **val**.
```kotlin
    // Incrementales y decrementles (Increments and decrements)

    a.inc()
    a.dec()
```

### Operadores binarios

Expresion | Funcion
----------|--------
a + b | a.plus(b)
a - b | a.minus(b)
a * b | a.times(b)
a / b | a.div(b)
a % b | a.rem(b)
a..b | a.rangeTo(b)

> Estos operadores son los mas comunes, los que conocemos como aritmeticos y su uso es el suguiente:
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

> El roperador In es utilizado para determinar si un elemento esta presente en otro, es decir, en este caso, preguntamos si el arreglo numbersArray
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

El operador de acceso indexado es el que nos permite obtener y colocar elementos en un array basandose en su 
posicion dentro del mismo, recordemos que un arreglo indexado comienza sus posiciones desde 0, es decir que si 
tenemos un arreglo con 3 elementos las pociiones del mismo serian 0, 1, 2.

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
  
  Por lo que es mas comun representarlas como expresiones.
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

### Operadores de comparacion

Expresion | Funcion
----------|--------
a > b | a.compareTo(b) > 0
a < b | a.compareTo(b) < 0
a >= b | a.compareTo(b) >= 0
a <= b | a.compareTo(b) <= 0

> Todas las comparaciones que se traducen a la funcion compareTo() devolveran un entero (In)
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
Como puedes ver, no estamos comparando directamnte a con b, mas bien el valor que estamos evaluando el entero
que esta funcion retorna que puede ser -1 ~ 1. 

Ahora que ya sabes que tipos de datos y operadores nos ofrece kotlin, te invito a que le des una leida a la [documentacin oficial](https://kotlinlang.org/docs/reference/basic-types.html)
para que refuerzes tu conocimiento, ve al [Reto 2](/../../tree/master/Sesion-01/Reto-02) y resulevelo con lo que acabas de aprender.
