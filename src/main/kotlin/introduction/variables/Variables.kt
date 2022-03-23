package introduction.variables

fun main(args: Array<String>) {
    var a: String = "initial"
    println(a)

    val b: Int = 1;
    val c = 3;

    println("b = $b")
    println("c = $c")

    var e: Int
//    println(e) // Error: Variable 'e' must be initialized

    val d: Int

    d = if (b > c) 1
    else 2

    println("d = $d")
}


