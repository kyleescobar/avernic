public class class93 extends class325 {
   static class277 field1242;
   final boolean field1245;

   public class93(boolean var1) {
      this.field1245 = var1;
   }

   int method2038(class328 var1, class328 var2) {
      if (var2.field3865 != var1.field3865) {
         return this.field1245 ? var1.field3865 - var2.field3865 : var2.field3865 - var1.field3865;
      } else {
         return this.method5180(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method2038((class328)var1, (class328)var2);
   }

   static int method2039(int var0, int var1) {
      class65 var3 = (class65)class65.field935.get((long)var0);
      if (null == var3) {
         return 0;
      } else {
         return var1 >= 0 && var1 < var3.field932.length ? var3.field932[var1] : 0;
      }
   }
}
