## Reto 2: Clases internas y anidadas - Kotlin Fundamentals.

### OBJETIVO 

- Comprender el uso de la POO.
- Implementar clases internas y clases anidadas.

#### REQUISITOS 

1. Tener conocimiento básico sobre Programación Orientada a Objetos. 

#### DESARROLLO

- Dentro de la clase Car, implementa una clase anidada que represente el sistema de aire acondicionado con las siguientes propiedades y métodos:

- AirConditioner: Propiedades
	- level: Int
	- isOn: Bool
- AirConditioner: Metodos
	- levelUp()
	- levelDown()
	- poweOn()
	- poweOff()

- Dentro de la clase CarFactory esta es una propiedad y es un arreglo que representa los 3 modelos de motor disponibles. Declara tres inner class, una por cada modelo de motor. Cada clase se va a encargar de crear una instancia de la clase Car y a esa clase car se le va a asignar el modelo que corresponde, cada inner class deberá tomar el modelo de su clase contenedora.
