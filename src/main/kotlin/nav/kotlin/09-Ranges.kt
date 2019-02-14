package nav.kotlin

fun main() {
   val x = 7
   if (x in 1..10) {
      println(x)
   }

    for (i in 1..4) print(i)

    for (i in 1 until 4) print(i)

    for (i in 4 downTo 1) print(i)

    for (i in 1..4 step 2) print(i)

   repeat(10) { tall ->
      println("runde $tall")
   }
}
