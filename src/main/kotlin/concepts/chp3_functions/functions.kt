package concepts.chp3_functions

import kotlin.math.abs
import kotlin.math.cos

/*

infix

tailrec  优化递归

const 
val
var


 */


fun double(x: Int): Int {
    return x * 2
}

fun double2(x: Int): Int = x * 2

fun double3(x: Int) = x * 2

// 默认值方法
fun read(b: ByteArray, off: Int = 0, len: Int = b.size) {

}

fun foo(
    bar: Int = 0,
    baz: Int = 1,
    qux: () -> Unit,
) {
    // qux()
}

fun printHello(name: String?): Unit {
    if (name != null)
        println("Hello $name")
    else
        println("Hi there!")

    return Unit
}


// 可变参数
fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts) {
        result.add(t)
    }
    return result
}

// infix notation
infix fun Int.add(x: Int): Int {
    return 0
}

const val eps = 1E-10 // "good enough", could be 10^-15

tailrec fun findFixPoint(x: Double = 1.0): Double =
    if (abs(x - cos(x)) < eps) x else findFixPoint(cos(x))


fun factorial(x: Int): Int {
    return if (x < 2) {
        1
    } else {
        x * factorial(x - 1)
    }

}

fun main() {
    val result = double(2)
    println("result is $result")

    // named arguments
    foo(baz = 1) { println("hello") }
    foo { println("world") }

    val list = asList(1, 2, 3, 4.0, 6)
    println(list)

    val factorial = factorial(3)
    println(factorial)

}
