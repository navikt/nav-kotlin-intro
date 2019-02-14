package nav.kotlin

import org.amshove.kluent.*
import org.jetbrains.spek.api.*
import org.jetbrains.spek.api.dsl.*

object CalculatorTestSpek: Spek({

   describe("A calculator") {
      given("two numbers") {
         on("addition") {
            it("adds one to the other") {
               val calc = Calculator()
               calc.add(2, 3) `should equal` 5
            }
         }

         on("subtraction") {
            it("subtracts one from the other") {
               val calc = Calculator()
               calc.sub(4, 3) `should equal` 1
            }
         }
      }
   }

})

