## Reto 02: Exeptions & Manejo de errores - Kotlin Fundamentals

### OBJETIVO 

- Que el alumno logre comprender como es que kotlin evita las excepciones de tipos nulos.
- Que el alumno logre implementar soluciones con tipos nulables.

### REQUISITOS 

1. Haber visto el [Ejemplo 02](/../../tree/master/Sesion-07/Ejemplo-01/)
2. Tener conocimiento previo sobre tipos de datos y variables.

### DESARROLLO

En el proyecto que esta en este ejemplo encontraras un archivo main.kt en el cual tendras que escribir lo que a continuacion se te pide:

- Escribe una clase con dos propiedades nullables (name y visitedCities) la ultima es una lista de nullable String
- En el comentario First person cre auna instancia de Person y con el uso de la scope function apply asigna valor a las dos propiedades de la clase person.
- Itera sobre cada uno de los elementos de la propiedad visitedCities de la instancia que acabas de crear e imprime el contenido de cada elemento si es que no es nulo, si lo es lanza una excepcion.
- En el comentario Second person crea una instancia de person con su contructor por defecto.
- Asigna el valor del nombre de la instancia de persona que acabas de crear a una variable usando el operador Elvis, si es nulo el nobre lanza una excepcion pero por medio de una funcion usando el tipo Nothing (Crea la funcion que retorne Nothing).