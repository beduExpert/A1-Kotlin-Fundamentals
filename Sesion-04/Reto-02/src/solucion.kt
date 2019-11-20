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

// Clases internas
class CarFactory {
    private val availableEngines = arrayOf("model-A", "model-B", "model-C")

    inner class CarModelA {
        fun create(): Car {
            return Car(model: availableEngines.get(0))
        }
    }

    inner class CarModelB {
        fun create(): Car {
            return Car(model: availableEngines.get(1))
        }
    }

    inner class CarModelC {
        fun create(): Car {
            return Car(model: availableEngines.get(2))
        }
    }
}
