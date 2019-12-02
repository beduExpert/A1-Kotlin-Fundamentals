fun main(args: Array<String>) {
    coroutine {
        val user = suspended {
            userService.doLogin(username, password)
        }

        val currentFriends = suspended {
            userService.requestCurrentFriends(user)
        }
    }

    coroutine(Dispatchers.Main) {
		//...
	}

    coroutine(Dispatchers.Main) {
		val user = withContext(Dispatchers.IO) {
			userService.doLogin(username, password)
		}
	}

    GlobalScope.launch(Dispatchers.Main) {
		//...
	}

    val job = GlobalScope.launch(Dispatchers.Main) {
	
		doCoroutineTask()
	
		val res1 = suspendingTask1()
		val res2 = suspendingTask2()
	
		process(res1, res2)
	
	}
	
	job.join()
	job.cancel()
}