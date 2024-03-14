package concepts.chp2_control_flow


fun useIf() {
    val a = 2
    val b = 3

    var max = a
    if (a < b) max = b

    // With else
    if (a > b) {
        max = a
    } else {
        max = b
    }

    // As expression
    max = if (a > b) a else b

    // You can also use `else if` in expressions:
    val maxLimit = 1
    val maxOrLimit = if (maxLimit > a) maxLimit else if (a > b) a else b

    println("max is $max")
    println("maxOrLimit is $maxOrLimit")

    // 最后一个值是 block的值
    val max1 = if (a > b) {
        print("Choose a")
        a
    } else {
        print("Choose b")
        b
    }
}


/**
 * how to use When function
 * <br>
 * when 可以用作表达式 也可以用作语句
 *
 * range check in !in
 *
 * type check is or !is
 *
 */
fun useWhen() {
    val x = 23

    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        5 -> println("x == 5")
        else -> {
            println("x is neither 1 nor 2")
        }
    }
}


enum class Bit {
    ZERO, ONE
}

val numericValue = when (Bit.ZERO) {
    Bit.ZERO -> 0
    Bit.ONE -> 1
    else -> 5
}

fun hasPrefix(x: Any) = when (x) {
    is String -> x.startsWith("prefix")
    else -> false
}


fun useFor() {
    for (i in 1..3) {
        println(i)
    }

    for (i in 6 downTo 0 step 2) {
        println(i)
    }

    val demo = arrayOf(1, 2, 3, 4, 5)

    // array index 
    for (i in demo.indices) {
        println("idx: $i")
    }

    for ((index, value) in demo.withIndex()) {
        println("the element at $index is $value")
    }
}

fun useWhile() {
    var x = 6

    while (x > 0) {
        println(x)
        x--
    }

}

fun main() {
    // useIf()
    useWhen()

    // println("the numeric value is $numericValue")
    // useFor()

    useWhile()
}

