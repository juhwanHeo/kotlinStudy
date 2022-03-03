package functions

/*
* Example URL: https://play.kotlinlang.org/byExample/01_introduction/02_Functions
*/
operator fun Int.times(str: String) = str.repeat(this)
operator fun String.times(cnt: Int) = cnt.times(this)
operator fun String.get(range: IntRange) = substring(range)

fun main() {
    println("Bye " * 2)
    println(3 * "Bye ")

    val str = "Always forgive your enemies; nothing annoys them so much."
    println(str[0..14])
}
