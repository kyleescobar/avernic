import java.util.Comparator;

final class class280 implements Comparator {
   int method4519(class285 var1, class285 var2) {
      return var1.field3647.field3653 < var2.field3647.field3653 ? -1 : (var1.field3647.field3653 == var2.field3647.field3653 ? 0 : 1);
   }

   public int compare(Object var1, Object var2) {
      return this.method4519((class285)var1, (class285)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
