package concepts.chp1_types

/*

Integer

    Byte
    Short
    Int
    Long

default Type Int

Float
Double

default float is Double

 */

val one = 1
val threeBillion = 3000000000
val oneLong = 1L
val oneByte: Byte = 1

val pi = 3.14
val oneDouble = 1.0


fun printDouble(d: Double) {
    println(d)
}

fun numberOnJVM() {
    val a: Int = 100
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a

    val b: Int = 10000
    val boxedB: Int? = b
    val anotherBoxedB: Int? = b

    println(boxedA === anotherBoxedA) // true
    println(boxedB === anotherBoxedB) // false
}

fun numberConversion() {
    // val a: Int? = 1
    // val b: Long? = a
    // println(b == a)

    val b: Byte = 1 // OK, literals are checked statically
    val i1: Int = b.toInt()

}

fun main() {
    printDouble(pi)
    // printDouble(one)

    numberOnJVM()
}


