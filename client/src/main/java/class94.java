public class class94 extends class325 {
   public static Buffer field1248;
   final boolean field1246;

   public class94(boolean var1) {
      this.field1246 = var1;
   }

   int method2044(class328 var1, class328 var2) {
      if (client.field405 == var1.field3865 && var2.field3865 == client.field405) {
         return this.field1246 ? var1.method5167().method6524(var2.method5167()) : var2.method5167().method6524(var1.method5167());
      } else {
         return this.method5180(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method2044((class328)var1, (class328)var2);
   }

   public static boolean method2049(char var0) {
      return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
   }
}
