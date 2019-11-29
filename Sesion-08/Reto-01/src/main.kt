class User {
}

class Friend {
}

class UserService {
}

fun main(args: Array<String>) {
     //Corrutina simple
     val service = UserService()

    //Por que falla?
     coroutine {
         val user = service.login("username", "password")
         val friends = service.getFriends(user)
     }

    //Coroutine context

     //Coroutine withContext
}