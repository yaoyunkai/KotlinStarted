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

fun main() {
    // useIf()
    useWhen()
}
