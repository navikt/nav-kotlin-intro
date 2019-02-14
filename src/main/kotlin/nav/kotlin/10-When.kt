package nav.kotlin

fun main() {
   val num: Number = 3
    when(num) {
      0         -> println("Ingenting")
      1, 2      -> println("Litt lavt")
      3         -> println("Meget bra nummer")
      in 4..7   -> println("I høyeste laget")
      is Double -> println("Vi driver ikke med desimaler, gjør vi vel?")
      else      -> println("Sånn går no dagan")
   }
}
