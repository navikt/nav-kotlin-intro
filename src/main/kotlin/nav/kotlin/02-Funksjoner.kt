package nav.kotlin

fun add(a: Int, b: Int) = a + b

fun subtract(a: Int, b: Int): Int {
   println("here be subtractions")
   return a - b
}

val lambdaAdd = { a: Int, b: Int -> a + b }

fun surroundWithLogging(block: () -> Unit) {
   println("before block")
   block()
   println("after block")
}

fun main() {
   surroundWithLogging { println("in a higher order function") }
   println(lambdaAdd(1, 2))
   println(add(1, 2))
}


