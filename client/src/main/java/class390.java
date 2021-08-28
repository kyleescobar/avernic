import java.util.Comparator;

public class class390 implements Comparator {
   final boolean field4239;

   public class390(boolean var1) {
      this.field4239 = var1;
   }

   int method6230(class324 var1, class324 var2) {
      return this.field4239 ? var1.method5158(var2) : var2.method5158(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.method6230((class324)var1, (class324)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
