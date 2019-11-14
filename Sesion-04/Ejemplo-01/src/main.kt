abstract class Person {
    abstract fun sayHello() //Solo se declara la firma de la funcion
}

class Artist: Person() {
    override fun sayHello() {
        println("Hello") //Sobre escrubiendo la funcion declarada en la clase abstract se puede hacer su implementacion
    }
}