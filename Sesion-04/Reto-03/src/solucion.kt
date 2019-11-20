// Clases anidadas
class Car(model: String) {
    private var model: String = ""
    private var airConditioner: AirConditioner = AirConditioner()



    //Getters & Setters

    fun getModel(): String {
        return this.model
    }

    fun setModel(newModel: String) {
        this.model = newModel
    }


    class AirConditioner {
        private var level: Int = 0
        private var isOn: Bool = false

        fun levelUp() {
            this.level.inc()
        }

        fun levelDown() {
            this.level.dec()
        }

        fun poweOn() {
            this.isOn = true
        }

        fun powerOff() {
            this.isOn = false
        }
    }

}

// Singleton
object CarFactory {
    private val availableEngines = arrayOf("model-A", "model-B", "model-C")

    fun CreateCarModelA(): Car {
        return Car(model: availableEngines.get(0))
    }

    fun CreateCarModelB(): Car {
        return Car(model: availableEngines.get(1))
    }

    fun CreateCarModelC(): Car {
        return Car(model: availableEngines.get(2))
    }
}

//Companion Object
class CarFactory {
    companion object {
        fun createModelA(): Car {
            return Car(model: "model-A")
        }

        fun createModelB(): Car {
            return Car(model: "model-B")
        }

        fun createModelC(): Car {
            return Car(model: "model-C")
        }
    }
}
