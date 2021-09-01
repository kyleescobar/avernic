public class ScriptEvent extends class354 {
   boolean field964;
   Interface field958;
   Interface field961;
   int field953;
   int field956;
   int field957;
   int field959;
   int field960;
   int field962;
   int field963 = 76;
   Object[] args;
   String field952;

   public void method1683(Object[] var1) {
      this.args = var1;
   }

   public void method1684(int var1) {
      this.field963 = var1;
   }

   static void method1692(String[] var0, int[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var5 = (var2 + var3) / 2;
         int var6 = var2;
         String var7 = var0[var5];
         var0[var5] = var0[var3];
         var0[var3] = var7;
         int var8 = var1[var5];
         var1[var5] = var1[var3];
         var1[var3] = var8;

         for(int var9 = var2; var9 < var3; ++var9) {
            if (var7 == null || null != var0[var9] && var0[var9].compareTo(var7) < (var9 & 1)) {
               String var10 = var0[var9];
               var0[var9] = var0[var6];
               var0[var6] = var10;
               int var11 = var1[var9];
               var1[var9] = var1[var6];
               var1[var6++] = var11;
            }
         }

         var0[var3] = var0[var6];
         var0[var6] = var7;
         var1[var3] = var1[var6];
         var1[var6] = var8;
         method1692(var0, var1, var2, var6 - 1);
         method1692(var0, var1, 1 + var6, var3);
      }

   }

   static int method1690() {
      if (client.field681 != null && client.field682 < client.field681.size()) {
         int var1 = 0;

         for(int var2 = 0; var2 <= client.field682; ++var2) {
            var1 += ((class64)client.field681.get(var2)).field927;
         }

         return var1 * 10000 / client.field683;
      } else {
         return 10000;
      }
   }
}
