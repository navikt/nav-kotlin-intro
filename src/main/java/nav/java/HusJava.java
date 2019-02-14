package nav.java;

import java.util.Objects;

public class HusJava implements Cloneable {
   private String type;
   private int areal;
   private int etasjer;

   public HusJava(String type, int areal, int etasjer) {
      this.type = type;
      this.areal = areal;
      this.etasjer = etasjer;
   }

   public String getType() {
      return type;
   }

   public void setType(String type) {
      this.type = type;
   }

   public int getAreal() {
      return areal;
   }

   public void setAreal(int areal) {
      this.areal = areal;
   }

   public int getEtasjer() {
      return etasjer;
   }

   public void setEtasjer(int etasjer) {
      this.etasjer = etasjer;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      HusJava husJava = (HusJava) o;
      return areal == husJava.areal &&
         etasjer == husJava.etasjer &&
         type.equals(husJava.type);
   }

   @Override
   public int hashCode() {
      return Objects.hash(type, areal, etasjer);
   }

   @Override
   public String toString() {
      return "HusJava{" +
         "type='" + type + '\'' +
         ", areal=" + areal +
         ", etasjer=" + etasjer +
         '}';
   }

   @Override
   protected Object clone() throws CloneNotSupportedException {
      return super.clone();
   }
}
