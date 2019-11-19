## Ejemplo 3: Singletons y Companion Objects - Kotlin Fundamentasl

### OBJETIVO

- Que el alumno comprenda el uso y la definicion de :
    - Singletons.
    - Companion Objects. 
- Que el alumno logre reconocer las areas donde implementar las Clases internas y Clases anidadas.

### REQUISITOS

1. Tener conocimiendto base sobre Programacion Orientada a Objetos

### DESARROLLO

#### Singleton (Object)

Un Singleteon es una clase de la cual solamente puede existir una instancia, este termino como tal no existe en kotlin, en su lugar tenemos **Object** que practicamente es lo mismo que un Singleton ya que es un tipo de dato especial del cual solamente existira una sola instancia durante todo el ciclo de ejecucion de nueesto programa.

Antes de ver como declaramos un "Singleton" Object en kotlin veamos que hay detras de esto con un pequeño y claro ejemplo en JAVA, no te preocupes si no tienes conocimiento sobre java, con lo que sabes hata ahora de kotlin te sera facil entenderlo.
```java

	//Creamos una clase
	public class Singleton {

    private Singleton() {
    }

	//La propiedad instance es del tipo de la clase que la contiene, es decir Singleton
    private static Singleton instance;

	//
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
```
EL equivalente a un Singleton en kotlin es :
```kotlin
    object Singleton
```
Recuerda que este ejmplo **Singleton** es el nombre de nuestra clase.


#### Companion Object

En lenguajes de programacion como java existe un modificador de acceso llamado **static** este modificador nos permite crear objetos,variables o metodos en una clase para utilizarlos sin necesidad de hacer una instancia de la clase, en kotlin no existe **static** y su equivalente es companion object, con estos vamos a poder crear objetos dentro de nuestras clases a los cuales podremos acceder sin instanciar nuestra clase.

Ejemplo: 

```kotlin
    class Vehicle {
        companion object Factory {
            fun create(): Vehicle = Vehicle()
        }
    }
```

En el ejemplo podemos ver que nuestra clase vehicle tiene dentro un companion object que se encarga de crear instancias de la clase vehicle, los metodos de un companion object pueden llamarse haciendo referencia a el nombre de la case sin parentesis y con punto:
```kotlin
    val vehicleInstance = Vehicle.create()
```

No olvides visitar la documentacion oficial de kotlin para que veas todas las formas de usar los companion objects, ve al [Reto 03](/../../tree/master/Sesion-04/Reto-03) y resuelvelo con lo que aprendiste en este ejemplo.
