package nav.kotlin

open class Person(val navn: String, val alder: Int) {
   open fun siHei() = println("$navn sier hei")
}

class Student(navn: String, alder: Int, val fag: List<String>): Person(navn, alder) {
   override fun siHei() = println("$navn sier hei på en studentaktig måte")
}

class Lærer(navn: String, alder: Int, val lønn: Double): Person(navn, alder)

fun main() {
   val studenten = Student("El Studento", 21, emptyList())
   val læreren = Lærer("Lektor Lektorsen", 45, 200_000.0)

   println("${læreren.navn} (${læreren.alder}) er læreren til ${studenten.navn} (${studenten.alder})")
}
