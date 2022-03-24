package introduction.nullsaftety

fun main() {
    println(describeString("my name is juhwan"))
    println(describeString(null))

    /*
    * 안전한 호출 (Safe Calls)
    */
    val a: String = "kotlin"
    val b: String? = null

    println(b?.length)
    println(a?.length)

    /*
    * 엘비스 연산자 (Elvis Operator)
    * val l: Int = if (b != null) b.length else -1
    */
    val l: Int = b?.length ?: -1
    println("l = $l")

    /*
    * !! 연산자
    */
    val l2 = b!!.length
    println("l2 = $l2")

    /*
    * as? 연산자
    */
    val aInt: Int? = a as? Int

}

fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.isNotEmpty())
        return "String of length ${maybeString.length}"
    else return "Empty or null string"
    /*
    리턴 하나로도 가능
    return if (maybeString != null && maybeString.isNotEmpty())
        "String of length ${maybeString.length}"
    else "Empty or null string"
    */
}