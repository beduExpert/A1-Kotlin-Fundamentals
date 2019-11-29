class Person(name: String) {
    val name: String?
    val age: Int?
    val address: String?
    val city: String?
}

fun main(args: Array<String>) {

    val planetas = mutableListOf("mercurio", "venus", "tierra", "marte", "jupiter", "saturno", "urano", "neptuno")

    // let
    planetas.map {
        it.length
    }.filter {
        it > 5
    }.let {
        println(it)
    }

    // with
    val sistemaSolar = with(planetas) {
        val text = "|"
        this.forEach { text.plus("$it|") }
        text
    }

    // run
    val dia: Int = Calendar.getInstance().run {
        set(Calendar.YEAR, 2019)
        get(Calendar.DAY_OF_YEAR) 
    }

    // apply
    val person = Person("Nombre").apply {
        age = 30
        address = "Alguna direccion"
        city = "Mexico"
    }

    // also
    planetas.also {
        it.forEach {
            it.plus("-")
        }
    }.add("Pluton")

}