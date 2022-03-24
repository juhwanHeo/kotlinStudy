package introduction.classes

class Test {

    override fun toString(): String {
        return "toString of Test"
    }
}
class Contact(val id: Int, var email: String) {
    override fun toString(): String {
        return "$id, $email"
    }
}

fun main(args: Array<String>) {
    val test = Test()

    val contact = Contact(1, "juhwan@test.com")

    println(test)
    println(contact)

    contact.email = "heo@test.com"

    println(contact)
}