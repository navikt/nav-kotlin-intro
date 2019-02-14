package nav.kotlin

fun String.ropHøyt() = "${this.toUpperCase()} !!!!!"

infix fun Int.`prosent av`(other: Int): Double = this * other / 100.0 // infix og backticks

fun main() {
   println("au".ropHøyt())
   println(10 `prosent av` 25)
}
