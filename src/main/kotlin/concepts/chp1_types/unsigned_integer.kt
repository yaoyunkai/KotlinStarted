package concepts.chp1_types

/*

无符整数

UByte
UShort
UInt
ULong

 */

val b: UByte = 1u  // UByte, expected type provided
val s: UShort = 1u // UShort, expected type provided
val l: ULong = 1u  // ULong, expected type provided

val a1 = 42u // UInt: no expected type provided, constant fits in UInt
val a2 = 0xFFFF_FFFF_FFFFu // ULong: no expected type provided, constant doesn't fit in UInt


// use cases

data class Color(val representation: UInt)

val yellow = Color(0xFFCC00CCu)
