package concepts.chp2_control_flow

fun useBreak() {
    loop@ for (i in 1..<100) {
        println("loop@ i is $i")

        for (j in 1..10) {
            if (j == 8) {
                break@loop
            }
        }
    }

}

fun main() {
    useBreak()
}
