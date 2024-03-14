package concepts.chp2_control_flow

/*

Throwable


 */

val a: Int? = try {
    3.33.toInt()
} catch (e: NumberFormatException) {
    null
}