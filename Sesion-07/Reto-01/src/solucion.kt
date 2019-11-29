fun main(args: Array<String>) {
    val names: List<String?> = listOf("Name One", null, "Name Three")

    // Condiciones

    names.forEach { 
        if (it != null) {
            println(it)
        } else {
            println("null")
        }
    }

    // Safe calls

    names.forEach {
        println(it?)
    }

    // Elvis

    names.forEach {
        println("${it ?: null}")
    }
}