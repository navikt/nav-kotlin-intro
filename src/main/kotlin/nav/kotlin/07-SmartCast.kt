package nav.kotlin

fun main() {
   val student: Person = Student("studenten", 21, listOf("historie", "matematikk"))
   if (student is Student) {
      println("${student.fag}")
   }

   val person: Person = Lærer("læreren", 44, 300_000.0)
   val lærer = person as Lærer
   println(lærer.lønn)
}
