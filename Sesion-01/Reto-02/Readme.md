## Reto 2: Tipos de datos y Operadores - Kotlin Fundamentals

### OBJETIVO 

- Practicar los diferentes tipos de datos en kotlin.
- Reconocer la diferencia entre los operadores en su forma de expresión y hacer uso del Operator overloading de kotlin.

#### REQUISITOS 

1. Revisar a detalle el [Ejemplo 2](/../../tree/master/Sesion-01/Ejemplo-02)

#### DESARROLLO

En el proyecto incluido en este directorio encontrarás un proyecto ya iniciado, en el archivo main.kt completa los siguientes puntos.

- En la sección:
```kotlin
    /*
    * Tipos de datos
    */
```
Declara una variable **changeable** e imprímela en consola usando String templates de cada tipo de dato visto en el ejemplo con su tipo explícito.

- En la sección:
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
Usa las funciones del Operator overloading de android para realizar cada una de las siguientes expresiones, adicional a 
esto, imprime los valores de las variables después de cada operación.

> Las expresiones en esta tabla son un ejemplo. Considera los valores y los tipos de datos de las variables declaradas antes
> para determinar con qué variables representar cada expresión.

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
