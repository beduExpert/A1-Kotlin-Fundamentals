fun main(args: Array<String>) {

    //let
    val numbers = mutableListOf("One", "Two", "Three")

	numbers.map { 
		it.length 
	}.filter { 
		it > 3 
	}.let {
		printl(it) 
    }
    
    //with
    val firstAndLast = with(numbers) {
		"First element -> ${fisrt()}, last element -> ${last()}"
	}

    print(firstAndLast)
    
    //run 
    var inserted: Boolean = run {
		val person: Person = getPerson()
    	val personDao: PersonDao = getPersonDao()
    	personDao.insert(person)
    }
    
    //apply
    val person = Person("Name").apply {
		age = 30
		city = "Mexico"
    }
    
    //also
    numbers.also {
		println("elementos antes de agregar uno nuevo: $it")
	}.add("Four")

}