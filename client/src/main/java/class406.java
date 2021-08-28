public class class406 implements Comparable {
   String field4311;
   String field4312;

   public class406(String var1) {
      this.field4312 = var1;
      this.field4311 = class114.method2116(var1, class367.field4123);
   }

   public class406(String var1, class367 var2) {
      this.field4312 = var1;
      this.field4311 = class114.method2116(var1, var2);
   }

   public String getName() {
      return this.field4312;
   }

   public String method6522() {
      return this.field4311;
   }

   public boolean method6523() {
      return this.field4311 != null;
   }

   public boolean equals(Object var1) {
      if (var1 instanceof class406) {
         class406 var2 = (class406)var1;
         if (null == this.field4311) {
            return null == var2.field4311;
         } else if (null == var2.field4311) {
            return false;
         } else {
            return this.hashCode() != var2.hashCode() ? false : this.field4311.equals(var2.field4311);
         }
      } else {
         return false;
      }
   }

   public int hashCode() {
      return null == this.field4311 ? 0 : this.field4311.hashCode();
   }

   public String toString() {
      return this.getName();
   }

   public int method6524(class406 var1) {
      if (this.field4311 == null) {
         return var1.field4311 == null ? 0 : 1;
      } else {
         return null == var1.field4311 ? -1 : this.field4311.compareTo(var1.field4311);
      }
   }

   public int compareTo(Object var1) {
      return this.method6524((class406)var1);
   }
}
