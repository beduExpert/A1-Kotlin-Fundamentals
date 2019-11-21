## Reto 1: Interfaces & Clases abstractas - Kotlin Fundamentals.

### OBJETIVO 

- Comprender el uso de la POO. 
- Implementar interfaces y clases abstractas.

#### REQUISITOS 

1. Tener conocimiento básico sobre Programacion Orientada a Objetos. 

#### DESARROLLO

En el archivo main de este proyecto están incluidas las estructuras de la Clase abstracta Person, la interface PersonActions y la clase Worker escribe el contenido de cada una dada la siguiente descripción:

- Person: Propiedades
	- name: String
	- age: Int
	- availabe: Bool

- PersonActions: Metodos
	- sayHello()
	- increaseAge()

- Worker: Propiedades
	- typeOfWork: String
	- workAddress: String

- Worker: Metodos
	- startWorking()
	- stopWorking()

- Haz que Worker herede la clase abstracta e implemente la interface.
- Sobreescribe las propiedades y métodos de ambos.
- No olvides los getters & setters de las propiedades de Worker.
