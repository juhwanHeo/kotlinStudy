package introduction.functions

/*
* Example URL: https://play.kotlinlang.org/byExample/01_introduction/02_Functions
*/
fun main() {

    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "Bye")

    val pair = "Ferrari" to "juhwan"
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")

    sophia likes claudia
    println(sophia)
}

class Person(val name:String){
    private val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) { likedPeople.add(other) }
    override fun toString(): String {
        return "$name likes: $likedPeople"
    }
}