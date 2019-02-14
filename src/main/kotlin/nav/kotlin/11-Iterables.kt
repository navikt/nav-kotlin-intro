package nav.kotlin

fun main() {
   val kunder = listOf(
      Kunde("Per", Adresse("gata", 22, 9008)),
      Kunde("Pål", Adresse("gata", 9, 9103)),
      Kunde("Lise", Adresse("veien", 3, 5000)),
      Kunde("Anne", Adresse("aleen", 97, 1234)),
      Kunde("Thomas", Adresse("strøket", 100, 1598))
   )

   val tromsøværinger = kunder.asSequence().filter { it.adresse?.postnummer in 9000..9999 }
   val alleMedSammeEtternavn = kunder.map { it.copy(navn = "${it.navn} Johansen") }
   val antallIHverGate = kunder.groupingBy { it.adresse?.gate }.eachCount()

   fun erBergenserMedPostboks(kunde: Kunde) = kunde.adresse?.postnummer == 5008
   val inneholderBergensereMedPostboks = kunder.any(::erBergenserMedPostboks)
}
