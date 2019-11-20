## Reto 2: Clase internas y anidadas - Kotlin Fundamentals.

### OBJETIVO 

- Que el alumno comprenda el uso de la POO y logre hacer implementaciones de los siguientes temas:
	- Clases internas
	- Clases anidadas

#### REQUISITOS 

1. Tener conocimiento basico sobre Programacion Orientada a Objetos. 

#### DESARROLLO

- Dentro de la clase Car, implementa una clase anidada que represente el sistema de aire acondicionado con las siguientes propiedades y metodos:

- AirConditioner: Propiedades
	- level: Int
	- isOn: Bool
- AirConditioner: Metodos
	- levelUp()
	- levelDown()
	- poweOn()
	- poweOff()

- Dentro de la clase CarFactory esta una propiedad, es un arreglo que representa los 3 modelos de motor disponibles, declara tres inner class, una por cada modelo de motor, cada clase se va a encargar de crear una instancia de la clase Car y a esa clase clar se le va a asignar el modelo que corresponde, cada inner class debera tomar el modelo de su clase contenedora.