fun main(args: Array<String>) {

    //Higher-order function
    
    fun mensajes(nombre: String, apellidos: String, mensage: (String, String) -> String): String {
        return mensage(nombre, appellidos)
    }

    fun bienvenida(nombre: String, apellidos: String): String {
        return "Bienvenido $nombre $apellidos"
    }

    fun personalizado(nombre: String, apellidos: String): String {
        return "Estas aprendiendo mucho $nombre $apellidos"
    }

    fun despedida(nombre: String, apellidos: String): String {
        return "Hasta luego $nombre $apellidos"
    }

    val nomre = "Tu Nombre"
    val apellido = "Tus Apellidos"

    val mensajeBienvenida = mensajes(nombre, apellido, ::bienvenida)
    val mensajePesonalizado = mensajes(nombre, apellido, ::personalizado)
    val mensajeDespedida = mensajes(nombre, apellido, ::despedida)

    var mensajesGenerados =  arrayOf<String>(
        mensajeBienvenida,
        mensajePesonalizado,
        mensajeDespedida
    )

    mensajesGenerados.forEach { println(it) }

}