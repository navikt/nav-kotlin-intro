package nav.java;

public class Lærer extends Person {
   private double lønn;

   public Lærer(String navn, int alder, double lønn) {
      super(navn, alder);
      this.lønn = lønn;
   }

   public double getLønn() {
      return lønn;
   }
}
