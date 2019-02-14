package nav.java;

import java.util.List;

public class Casting {

   public static void main(String[] args) {
      Person studenten = new Student("per", 21, List.of("historie"));
      if (studenten instanceof Student) {
         List<String> fag = ((Student) studenten).getFag();
      } else if(studenten instanceof Lærer) {
         double lønn = ((Lærer) studenten).getLønn();
      }
   }

}
