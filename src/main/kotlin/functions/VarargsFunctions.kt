package functions

/*
* Example URL: https://play.kotlinlang.org/byExample/01_introduction/02_Functions
*/
fun printAll(vararg messages: String) {
    for (m in messages) println(m)
}

fun printAllWithPrefix(vararg messages: String, prefix: String) {
    for (m in messages) println("[$prefix]: $m");
}

fun logs(vararg entries: String) {
    printAll(*entries)
}

fun main(args: Array<String>) {
    printAll("Hello", "Hallo", "Salut", "Hola", "감자")
    printAllWithPrefix(
        "Hello", "Hallo", "Salut", "Hola", "감자"
        ,prefix = "Greeting"
    )

    logs("Hello", "Hallo", "Salut", "Hola", "감자")

}