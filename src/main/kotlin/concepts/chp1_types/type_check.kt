package concepts.chp1_types

/*

is &  !is

safe cast: as
unsafe cast: as?



 */

var obj = "123456"

fun demo(x: Any) {
    if (x is String) {
        print(x.length) // x is automatically cast to String
    }
}

fun main() {
    if (obj is String) {
        println(obj.length)
    }

    if (obj !is String) { // Same as !(obj is String)
        print("Not a String")
    } else {
        println(obj.length)
    }

}