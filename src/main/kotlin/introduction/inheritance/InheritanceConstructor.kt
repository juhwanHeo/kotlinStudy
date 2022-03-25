package introduction.inheritance

open class Tiger(val origin: String) {
    fun sayHello() {
        println("$origin say!!")
    }
}

class SiberianTiger : Tiger("Siberia") {
}

fun main(args: Array<String>) {
    val tiger = Tiger("Tiger")
    val siberianTiger: Tiger = SiberianTiger()

    tiger.sayHello();
    siberianTiger.sayHello()

}
