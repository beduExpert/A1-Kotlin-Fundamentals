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

