package concepts.chp1_types

/*

Characters


String is immutable

 */

fun runChar() {
    val aChar: Char = 'a'
    println(aChar)
    println('\n')
    println('\uFF00')

    // val int = aChar.digitToInt()
    // println(int)

}

fun runString() {
    val str = "abcd 123"

    for (c in str) {
        println(c)
    }

    println(str.uppercase())

    val s = "abc" + 1
    println(s + "def")

}

fun stringLiterals() {
    val s = "Hello, world!\n"
    val text = """
        for (c in "foo")
            print(c)
    """

    // remove leading whitespace
    val text2 = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """.trimMargin()

    println(text)
    println(text2)
}

fun stringTemplates() {
    val i = 10
    println("i = $i")

    val s = "abc"
    println("$s.length is ${s.length}")
}

fun stringFormat() {
    val integerNumber = String.format("%07d", 31416)
    println(integerNumber)

    val floatNumber = String.format("%+.4f", 3.141592)
    println(floatNumber)

    val helloString = String.format("%S %S", "hello", "world")
    println(helloString)

    val negativeNumberInParentheses = String.format("%(d means %1\$d", -31416)
    println(negativeNumberInParentheses)
}

fun main() {

    // runChar()
    // runString()

    stringLiterals()
    stringFormat()
    
}

