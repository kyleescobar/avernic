public class class203 extends class349 {
   class196[] field2354;

   class203(class277 var1, class277 var2, int var3, boolean var4) {
      class296 var5 = new class296();
      int var6 = var1.method4438(var3);
      this.field2354 = new class196[var6];
      int[] var7 = var1.method4481(var3);

      for(int var8 = 0; var8 < var7.length; ++var8) {
         byte[] var9 = var1.method4412(var3, var7[var8]);
         class199 var10 = null;
         int var11 = (var9[0] & 255) << 8 | var9[1] & 255;

         for(class199 var12 = (class199)var5.method4687(); var12 != null; var12 = (class199)var5.method4678()) {
            if (var11 == var12.field2278) {
               var10 = var12;
               break;
            }
         }

         if (var10 == null) {
            byte[] var13;
            if (var4) {
               var13 = var2.method4420(0, var11);
            } else {
               var13 = var2.method4420(var11, 0);
            }

            var10 = new class199(var11, var13);
            var5.method4672(var10);
         }

         this.field2354[var7[var8]] = new class196(var9, var10);
      }

   }

   static boolean method3697(long var0) {
      return class267.method4349(var0) == 2;
   }

   public boolean method3696(int var1) {
      return this.field2354[var1].field2222;
   }

   static void method3692(int var0) {
      class65 var2 = (class65)class65.field935.get((long)var0);
      if (null != var2) {
         var2.remove();
      }
   }
}
