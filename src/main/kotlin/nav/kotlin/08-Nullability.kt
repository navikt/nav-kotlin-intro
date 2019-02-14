package nav.kotlin

data class Adresse(val gate: String, val husnummer: Int, val postnummer: Int?)

data class Kunde(val navn: String, val adresse: Adresse? = null)

fun main() {
   val kundeUtenPostnummer = Kunde("Jan Johansen")
   val kundeMedPostnummer = Kunde("Jan Johansen", Adresse("veien", 42, 1234))

   println("Trygt: postnummeret er ${kundeUtenPostnummer.adresse?.postnummer ?: "ukjent"}")
   println("Utrygt: postnummeret er ${kundeMedPostnummer.adresse!!.postnummer}")

   kundeUtenPostnummer.adresse?.let {
      println("doing stuff with $it")
   }

}
