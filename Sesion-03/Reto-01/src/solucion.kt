fun main(args: Array<String>) {
    
}

//Clase automovil

class Car(plate: String) {
    var plate: String = plate
    var model: Int = 0000
    var color: String = ""
    var ocupants: Int = 0
    var engineWorking: Boolean = false

    fun startEngine() {
        engineWorking = true
    }

    fun stopEngine() {
        engineWorking = false
    }

    fun updateColor(newColor: String) {
        color = newColor
    }
}

//Clase Persona

class Person(name: String) {
    var name: String = name
    var lastName: String = ""
    var age: Int = 0
    var nationality: String = ""
    var address: String = ""

    fun sayHello() {
        println("Hello my name is $name")
    }

    fun increaseAge() {
        age.inc()
    }

    fun changeAddress(newAddress: String) {
        address = newAddress
    }
}