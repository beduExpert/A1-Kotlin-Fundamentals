## Ejemplo 3: Condicionales y estructuras de control de flujo - Kotlin Fundamentals

### OBJETIVO

- Comprender las estructuras de control de flujo en kotlin (if, when, for, while).

#### REQUISITOS

1. Tener conocimiento previo sobre Control flow structures (ver prework de sesión).

### DESARROLLO

En este ejemplo vamos a conocer las diferentes estructuras de control de flujo (Control flow) en kotlin. Este tipo de estructuras que se dividen en dos, Condicionales y Ciclos, nos ayudan a tomar decisiones y controlar el flujo de nuestro programa, así como facilitar el tratado de los datos cuando estos vienen en grandes cantidades.

#### Expresion If

En kotlin, **if** es una expresión, esto quiere decir que retorna un valor. Por esta razón, en Kotlin no tenemos un operador ternario, ya que de esta forma el if ordinario juega perfecto este rol.

> Uso tradicional de **if**.
> Comparamos si **a** es mayor que **b**, si esta **Condición** se cumple, entonces asignamos el valor de **a** a la variable max. 

```kotlin
    val a = 5
    val b = 4
    var max = 0
    
    if (a > b) max = a
```

> Uso de if y else, Mismo ejemplo.

```kotlin
    if (a > b) {
        max = a
    } else {   
        max = b
    }
```

> Usando if como una expresión.

```kotlin
    max = if (a > b) a else b
```

Como puedes ver, el uso de if es muy versátil. Si quieres saber más acerca de los operadores ternarios puedes visitar [aquí](https://developer.mozilla.org/es/docs/Web/JavaScript/Referencia/Operadores/Conditional_Operator)
y comparar entre el operador ternario y el uso de if como expresión en kotlin.

#### When

En Kotlin no existe el operador switch. En su lugar kotlin nos ofrece la expresión **when** que se encarga de comparar su argumento con cada una de sus "ramas". Si se usa como expresión el valor de la rama que coincide con el argumento se convierte el valor de toda la expresión. Si se usa como declaración los valores de las ramas individuales se ignoran.

La rama **else** se evalúa si no se cumple ninguna de las otras y en caso de que use como expresión esta rama es obligatoria.

> Esta es la forma más básica de usar **when**

```kotlin
when (x) {
    1 -> print("x == 1")
    2 -> print("x == 2")
    else -> { 
        print("x no es ni 1 ni 2")
    }
}
```

> Si varios casos se tienen que evaluar de la misma manera, estos pueden ser combinados con comas.

```kotlin
when (x) {
    0, 1 -> print("x == 0 o x == 1")
    else -> print("ninguno")
}
```

> También podemos hacer uso del operador **In** para determinar si un elemento está contenido en otro.

```kotlin
when (x) {
    in 1..10 -> print("x esta en el rango")
    in validNumbers -> print("x es valido")
    !in 10..20 -> print("x no esta en el rango")
    else -> print("ninguno")
}
```

#### For

El ciclo **for** itera sobre todos los elementos de cualquier objeto que proveea un iterador (iterator()), por ejemplo un Array.

Imagina que tenemos un Array de nombres pero tenemos que ponerle punto final a cada uno. Sería muy complicado tener que obtener cada elemento del arreglo usando los operadores de acceso indexado. Para solucionar este tipo de situaciones existen los ciclos, veamos cómo podríamos solucionarlo con **for**.

> Dado el arreglo de nombres de personas, iteramos sobre cada uno de ellos y le agregamos un punto final.

```kotlin
var nombres = arrayOf("Nombre Uno", "Nombre Uno", "Nombre Uno", "Nombre Uno", "Nombre Uno", "Nombre Uno")

for ((index, value) in nombres.withIndex()) nombres[index] += "."
```

> Podemos iterar sobre un rango de números de la siguiente forma:

```kotlin
for (i in 1..3) {
    println(i)
}
```

> La mayoría de las colecciones que proveen un iterator cuentan con el metodo forEach, que facilita mucho más la iteración sobre
> los elementos de una colección. En el siguiente ejemplo, iteramos sobre cada uno de los nombres e imprimimos el actual haciendo referencia 
>al mismo con la variable temporal **it**.

```kotlin
nombres.forEach { println(it) }
```

#### While

En kotlin, los ciclos while y do..while funcionan como en la mayoría de los lenguajes de programación.

> Esto se traduciría como "Mientras x sea mayor que 0, decrementa x en 1".

```kotlin
while (x > 0) {
    x--
}
```

> Esto se traducirá como "Asigna a y los datos mientras que y este vacío".

```kotlin
do {
    val y = obtenerDatos()
} while (y != null) 
```

Ahora que sabes controlar el flujo de tus programas te recomiendo que visites la [documentación oficial](https://kotlinlang.org/docs/reference/control-flow.html) y le des un vistazo.
para que enseguida resuelvas el [Reto 3](/../../tree/master/Sesion-01/Reto-03).
