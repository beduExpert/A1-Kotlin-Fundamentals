class User {
    val username: String?
    val password: String?
    val friends: List<Friend>?
}

class Friend {
    val name: String?
    val username: String?
}

class UserService {
    fun login(user: User): User {
        return user
    }

    fun getFriends(): List<Friend> {
        return listOf(Friend())
    }
}

fun main(args: Array<String>) {
     //Corrutina simple
     val service = UserService()

     //Falla por que no se sabe en que momento va a terminar cada ejecucion y la segunda 
     //depende de la primera
     coroutine {
         val user = service.login("username", "password")
         val friends = service.getFriends(user)
     }

     coroutine {
         val user = suspended {
             service.login("username", "password")
         }

         val friends = suspended {
             service.getFriends(user)
         }
     }

    //Coroutine context
     coroutine(Dispatchers.Main) {
         val user = suspended {
             service.login("username", "password")
         }

         val friends = suspended {
             service.getFriends(user)
         }
     }

     //Coroutine withContext
     coroutine(Dispatchers.Main) {
         val user = withContext(Dispatchers.IO) {
             service.login("username", "password")
         }

         val friends = withContext(Dispatchers.IO) {
             service.getFriends(user)
         }
     }
}