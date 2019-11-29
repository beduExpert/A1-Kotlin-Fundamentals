## Reto 02: Exeptions & Manejo de errores - Kotlin Fundamentals

### OBJETIVO 

- Comprender como es que kotlin evita las excepciones de tipos nulos.
- Implementar soluciones con tipos nulables.

### REQUISITOS 

1. Haber visto el [Ejemplo 02](/../../tree/master/Sesion-07/Ejemplo-01/)
2. Tener conocimiento previo sobre tipos de datos y variables.

### DESARROLLO

En el proyecto que está en este ejemplo encontrarás un archivo main.kt en el cual tendras que escribir lo siguiente:

- Escribe una clase con dos propiedades nullables (name y visitedCities) la última es una lista de nullable String
- En el comentario First person cre auna instancia de Person y con el uso de la scope function apply asigna valor a las dos propiedades de la clase person.
- Itera sobre cada uno de los elementos de la propiedad visitedCities de la instancia que acabas de crear e imprime el contenido de cada elemento si es que no es nulo, si lo es lanza una excepción.
- En el comentario Second person crea una instancia de person con su contructor por defecto.
- Asigna el valor del nombre de la instancia de persona que acabas de crear a una variable usando el operador Elvis, si es nulo el nombre lanza una excepción pero por medio de una función usando el tipo Nothing (Crea la función que retorne Nothing).
