## Ejemplo 1: Interfaces & Clases abstractas - Kotlin Fundamentals.

### OBJETIVO 

- Que el alumno comprenda el uso de la POO y logre hacer implementaciones de los siguientes temas:
	- Interfaces
	- Clases abstractas

#### REQUISITOS 

1. Tener conocimiento basico sobre Programacion Orientada a Objetos. 

#### DESARROLLO

En el archivo main de este proyecto estan incluidas las estructuras de la Clase abstracta Person, la interface PersonActions y la clase Worker escrible el contenido de cada una dada la siguiente descripcion:

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

- Has que Worker herede la clase abstracta e implemente la interface.
- Sobreescribe las propiedades y metodos de ambos.
- No olvides los getters & setters de las propiedades de Worker.
