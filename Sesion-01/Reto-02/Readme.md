## Reto 2: Tipos de datos y Operadores - Kotlin Fundamentals

### OBJETIVO 

- Que el alumno ponga en pactica los diferentes tipos de datos en kotlin.
- Que el alumno entianda la diferencia entre los operadores en su forma de exprecion y haciendo
uso del Operator overloading de kotlin.

#### REQUISITOS 

1. Haber visto por completo el [Ejemplo 2](/../../tree/master/Sesion-01/Ejemplo-02)

#### DESARROLLO

En el proyecto incluido en este directorio encontraras un proyecto ya iniciado, en el archivo main.kt 
completa los siguientes puntos.

- En la seccion:
```kotlin
    /*
    * Tipos de datos
    */
```
Declara una variable **changeable** de cada tipo de dato visto en el ejemplo con su tipo explicito.

- En la seccion:
```kotlin
    /*
    * Operadores
    */
```
Considerando las variables:
```kotlin
    var A:Int = 5
    var B:Int = 10
    var numbers:Array<Int> = arrayOf(1, 2, 3, 4, 5)
    var yes:Boolean = true
```
Usa las funciones del Operator overloading de android para realizar cada una de las siguintes expreciones, adicional a 
esto, imprime los valores de las variables despues de cada operacion.

> Las expresiones en esta tabla son un ejemplo, considera los valores y los tipos de datos de las variables declaradas antes
> para determinar con que variables representar cada expresion.

Expresion|
---------|
+a|
-a|
!a|
a++|
a--|
a + b|
a - b|
a * b|
a / b|
a % b|
a..b|
a in b|
a !in b|
a\[i]|
a\[i] = b|
a == b|
a != b|
a > b|
a < b|
a >= b|
a <= b|