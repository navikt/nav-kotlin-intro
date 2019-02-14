package nav.java;

import java.util.List;

public class Student extends Person{
   private List<String> fag;

   public Student(String navn, int alder, List<String> fag) {
      super(navn, alder);
      this.fag = fag;
   }

   public List<String> getFag() {
      return fag;
   }
}
