import java.awt.FontMetrics;

public class class95 extends class325 {
   protected static String field1249;
   static FontMetrics field1250;
   final boolean field1251;

   public class95(boolean var1) {
      this.field1251 = var1;
   }

   int method2051(class328 var1, class328 var2) {
      if (client.field405 == var1.field3865 && client.field405 == var2.field3865) {
         return this.field1251 ? var1.field3869 - var2.field3869 : var2.field3869 - var1.field3869;
      } else {
         return this.method5180(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method2051((class328)var1, (class328)var2);
   }

   public static void method2055(class68 var0) {
      class79.method1844(var0, 500000, 475000);
   }
}
