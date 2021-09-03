public class class97 extends class325 {
   public static int field1259;
   public static int field1264;
   static int field1266;
   static int[] regionLandArchiveIds;
   final boolean field1261;

   public class97(boolean var1) {
      this.field1261 = var1;
   }

   int method2068(class328 var1, class328 var2) {
      if (0 != var1.field3865 && var2.field3865 != 0) {
         return this.field1261 ? var1.method5167().method6524(var2.method5167()) : var2.method5167().method6524(var1.method5167());
      } else {
         return this.method5180(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method2068((class328)var1, (class328)var2);
   }

   public static class148 getNpcDefinition(int var0) {
      class148 var2 = (class148)class148.field1618.method3880((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = class148.field1637.method4412(9, var0);
         var2 = new class148();
         var2.field1627 = var0;
         if (null != var3) {
            var2.method2469(new Buffer(var3));
         }

         var2.method2466();
         class148.field1618.method3882(var2, (long)var0);
         return var2;
      }
   }
}
