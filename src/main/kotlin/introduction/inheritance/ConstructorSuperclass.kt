package introduction.inheritance

open class Lion(val name: String, val age: Int) {
    fun sayHello() {
        println("$name, the lion $age")
    }
}

class Asiatic(name: String): Lion(name = name, age = 10)

fun main(args: Array<String>) {
    val lion = Lion("Lion", 5)
    val asiatic:Lion = Asiatic("Asiatic")

    lion.sayHello();
    asiatic.sayHello()
}
