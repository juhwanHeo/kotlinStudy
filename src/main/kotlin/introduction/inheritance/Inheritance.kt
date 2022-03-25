package introduction.inheritance

open class Dog {
    open fun sayHello() {
        println("dog")
    }
}

class Yorkshire : Dog() {
    override fun sayHello() {
        println("yorkshire")
    }
}

fun main(args: Array<String>) {
    val dog: Dog = Dog()
    val yorkshire: Dog = Yorkshire();

    dog.sayHello()
    yorkshire.sayHello()

}
