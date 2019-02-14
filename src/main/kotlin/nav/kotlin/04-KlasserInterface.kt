package nav.kotlin

class Menneske(val navn: String, val alder: Int, val kjønn: Kjønn = Kjønn.UKJENT) {

   fun gjørNoe() = println("Menneske som gjør noe")

}

class SnakkendeMenneske(val navn: String, val alder: Int, val kjønn: Kjønn): Snakkende {
   override fun si(noe: String) {
      println("$navn ($alder) sier: $noe")
   }

   companion object {
      @JvmStatic
      fun imStatic() = "oh yeah"
   }
}

enum class Kjønn {
   MANN, KVINNE, UKJENT
}

interface Snakkende {
   fun si(noe: String)
}

object DenEnesteEne {
   fun siFra() = println("Jeg er den eneste instansen")
}

fun main() {
   val per = Menneske(navn = "Per", alder = 33) // default verdi for kjønn benyttes
   per.gjørNoe()
   val snakkendePer = SnakkendeMenneske("Per", 33, Kjønn.MANN)
   snakkendePer.si("Hei!")
   DenEnesteEne.siFra()
}
