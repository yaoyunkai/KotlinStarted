package concepts.chp1_types

/*

Arrays

 */


fun useArray() {
    var riversArray = arrayOf("Nile", "Amazon", "Yangtze")

    riversArray += "Mississippi"
    println(riversArray.joinToString())

    val nullArray: Array<Int?> = arrayOfNulls(3)
    println(nullArray.joinToString())

    var exampleArray = emptyArray<String>()

    println(exampleArray)
}


fun arrayElements() {
    val simpleArray = arrayOf(1, 2, 3)
    val twoDArray = Array(2) { Array<Int>(2) { 0 } }

    simpleArray[0] = 10
    twoDArray[0][0] = 2

    println(simpleArray[0].toString()) // 10
    println(twoDArray[0][0].toString()) // 2
}

fun main() {
    useArray()
}
