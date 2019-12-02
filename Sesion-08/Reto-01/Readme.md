## Reto 01: Coroutines - Kotlin Fundamentals

### OBJETIVO 

- Implementar corutinas en kotlin usando:
	- Funciones de suspensión
	- Coroutine context.
	- Dispatchers.

### REQUISITOS 

1. Revisar a detalle el [Ejemplo 01](/../../tree/master/Sesion-08/Ejemplo-01/) y [Ejemplo 02](/../../tree/master/Sesion-08/Ejemplo-02/).
2. Tener un entendimiento claro sobre las bases de la programación asíncrona/funcional.

### DESARROLLO

En el proyecto incluido en este reto encontrarás un archivo main.kt el cual contiene las clases **User, Friend y UserService** vacias, completa los siguientes puntos en su respectiva clase:

- User (Propiedades):
	- username
	- password
	- fiends (list)

- Friend (Propiedades):
	- name
	- username

- UserService (Metodos):
	- login(username, password)
	- getFriends(user)

Dentro de la función main:

- Hay una corrutina, en un comentario describe por que falla si es el caso.
- Replica la corrutina que ya esta usando suspended functions.
- Replica la misma corrutina de las suspended functions pero que esta vez la corrutina se ejecute en el hilo principal.
- Replica la corrutina anterior pero ahora que la corrutina se ejecute en el hilo principal y las suspended functios en el hilo background.

**!Éxito¡**

