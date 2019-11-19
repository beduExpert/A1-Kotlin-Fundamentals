fun main(args: Array<String>) {
    
}

class Vehicle {
    open val type: String = ""
    open val isMoving: Boolean = false

    open fun move() {
        this.isMoving = true
    }

    open fun stopMoving() {
        this.isMoving = false
    }
}

//Clase automovil

class Car(plate: String): Vehicle() {
    private var plate: String = plate
    var model: Int = 0000
        get() = this.model
        set(value) {
            if (value >= 2000) {
                field = value
            } else {
                field = 2000
            }
        }
    private var color: String = ""
    private var ocupants: Int = 0
    private var engineWorking: Boolean = false

    //Override properties
    override val type: String = "land vehicle"

    //Override Methods
    override fun move() {
        this.isMoving = true
        println("This is a $type and it is moving")
    }

    override fun stopMoving() {
        this.isMoving = false
        println("This is a $type and it is not moving")
    }

    fun startEngine() {
        engineWorking = true
    }

    fun stopEngine() {
        engineWorking = false
    }

    fun updateColor(newColor: String) {
        color = newColor
    }

    //Getters & Setters

    fun getPlate(): String {
        return this.plate
    }

    fun setPlate(newPlate: String) {
        this.plate = newPlate
    }

    fun getColor(): String {
        return this.color
    }

    fun setColor(newColor: String) {
        this.color = newColor
    }

    fun getOcupants(): Int {
        return this.ocupants
    }

    fun setOcupants(ocupants: Int) {
        this.ocupants = ocupants
    }
}

//Clase Persona

class Person(name: String) {
    private var name: String = name
    private var lastName: String = ""
    var age: Int = 0
        get() = this.age
        set(value) {
            if (value >= 18) {
                field = value
            } else {
                field = 18
            }   
        }
    private var nationality: String = ""
    private var address: String = ""

    fun sayHello() {
        println("Hello my name is $name")
    }

    fun increaseAge() {
        age.inc()
    }

    fun changeAddress(newAddress: String) {
        address = newAddress
    }

    //Getters & Setters

    fun getName(): String {
        return this.name
    }

    fun setName(newName: String) {
        this.name = newName
    }

    fun getLastName(): String {
        return this.lastName
    }

    fun setLastName(newLastName: String) {
        this.lastName = newLastName
    }

    fun getNationality(): String {
        return this.nationality
    }

    fun setNationality(newNationality: String) {
        this.nationality = newNationality
    }

    fun getAddress(): String {
        return this.address
    }

    fun setAddress(newAddress: String) {
        this.address = newAddress
    }
}