package nav.kotlin

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class CalculatorTestJunit {

   @Test
   fun add() {
      val calc = Calculator()
      assertEquals(4, calc.add(2, 2))
   }

   @Test
   fun subtract() {
      val calc = Calculator()
      assertEquals(1, calc.sub(5, 4))
   }

}

