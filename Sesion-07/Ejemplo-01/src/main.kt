fun main(args: Array<String>) {
    val text: String = "Some text"

    //No se puede asugnar null a "a"
    text = null // error de compilacion

    //Asi que si queremos llamar un metodo tenemos la garantia de que no tendremos un NPE

    println(text.length)

    val nullableText: String? = "Some text"

    // generara un error argumentando que la variable en cuestion puede ser nula
    println(nullableText.length)

    if (nullableText != null && nullableText.length > 0) {
        println("nullableText tiene ${nullableText.length} caracteres.")
    } else {
        println("nullableText esta vacio")
    }


    val nullableText: String? = "Some text"

    println(nullableText?.length)

    val nullableText: String? = "Some text"

    val text = if (nullableText != null) nullableText else "No text"

    val textLength = nullableText?.length ?: 0
}