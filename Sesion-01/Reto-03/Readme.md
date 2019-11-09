## Reto 3: Condiciones y cilos - Kotlin Fundamentals 

### OBJETIVO 

- Que el alumno sea capas de usar adecuadamente las expresiones de control de flujo (Control flow) If, When y For. 

#### REQUISITOS 

1. Haber visto por completo el [Ejemplo 3](/../../tree/master/Sesion-01/Ejemplo-03)

#### DESARROLLO

En el proyecto incluido en este directorio encontraras un proyecto ya iniciado, en el archivo main.kt completa los siguientes puntos.

- Dadas las siguientes variables:
```kotlin
    val vocales = arrayOf("A", "E", "I", "O", "U")
    val letra = "A"

    var letraBuscada: String
```
Utiliza if como expresion para asignarle a la variable **letraBuscada** el valor de la variable **letra** en caso de que si este contenida
en el arreglo **vocales**, en caso de que no este contenida asignale una "X" e imprime el valor de **letraBuscada** en consola
haciendo uso de String templates.

- Haciendo uso de for y when, dadas las siguientes variables:
```kotlin
    var numeros: Array<Int> = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    val n1 = 4
```
Itera sobre todos los elementos del arreglo numeros, en cada iteracion compara el elemento actual contra el valor de la variable n1, cuando este 
coincida imprime en consola el valor de la variable n1 pero de forma textual es decir **Cuatro**, de no coincidir imprime **Cualquier otro numero** (textual).

- Realiza el punto anterion pero ahora usando **forEach()**
