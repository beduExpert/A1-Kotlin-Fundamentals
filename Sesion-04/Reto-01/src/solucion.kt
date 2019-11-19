//Clase abstracta

abstract class Person {
    abstract val name: String
    abstract val age: Int
    abstract val available: Bool
}

//Interfaz

interface PersonActions {
    fun sayHello()
    fun increaseAge()
}

//Clase Worker
class Worker(name: String): Person(), PersonActions {
    override val name: String = name
    private var typeOfWork: String = ""
    private var workAddress: String = ""
    override val age: Int = 0
        get() = this.age
        set(value) {
            field = value
        }
    override val available: Bool = false
    
    fun getWorkAddress(): String {
        return this.workAddress
    }

    fun setWorkAddress(newWorkAddress: String) {
        this.workAddress = newWorkAddress
    }

    fun getTypeOfWork(): String {
        return this.typeOfWork
    }

    fun setTypeOfWork(newTypeOfWork: String) {
        this.typeOfWork = newTypeOfWork
    }

    override fun sayHello() {
        println("Hi, mi name is $name and I'm $age years old.")
    }

    override fun increaseAge() {
        this.age.inc()
    }

    fun startWorking() {
        this.available = false
        println("I'm working")
    }

    fun stopWorkin() {
        this.available = true
        println("I'm not working")
    }

}