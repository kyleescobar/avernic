import java.util.Comparator;

public class class391 implements Comparator {
   final boolean field4240;

   public class391(boolean var1) {
      this.field4240 = var1;
   }

   int method6240(class324 var1, class324 var2) {
      return this.field4240 ? var1.method5167().method6524(var2.method5167()) : var2.method5167().method6524(var1.method5167());
   }

   public int compare(Object var1, Object var2) {
      return this.method6240((class324)var1, (class324)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
