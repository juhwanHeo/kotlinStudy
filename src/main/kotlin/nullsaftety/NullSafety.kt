package nullsaftety

fun main() {
    var neverNull: String = "This can't be null"
    println("neverNull = $neverNull")
//    neverNull = null // Error

    var nullable: String? = "You can keep a null here"
    nullable = null
    println("numable = $nullable")

    var inferredNonNull = "The compiler assumes non-null"
//    inferredNonNull = null

    println(strLength(neverNull))
//    println(strLength(nullable))
}

fun strLength(notNull: String): Int {
    return notNull.length
}