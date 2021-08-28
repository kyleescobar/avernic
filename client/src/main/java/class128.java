public class class128 extends class104 {
   public static int[] field1460;
   int field1459;
   long field1456;
   // $FF: synthetic field
   final class107 this$0;

   static final boolean method2255(class207 var0, int var1, int var2, int var3) {
      if (!class184.method3198()) {
         return false;
      } else {
         int var5;
         int var6;
         int var7;
         int var8;
         int var11;
         int var12;
         int var13;
         int var16;
         int var17;
         if (!class208.field2477) {
            var5 = Scene.field2327;
            var6 = Scene.field2306;
            var7 = Scene.field2291;
            var8 = Scene.field2289;
            byte var9 = 50;
            short var10 = 3500;
            var11 = var9 * (class208.field2488 - Rasterizer3D.field2259) / Rasterizer3D.field2262;
            var12 = (class208.field2476 - Rasterizer3D.field2260) * var9 / Rasterizer3D.field2262;
            var13 = (class208.field2488 - Rasterizer3D.field2259) * var10 / Rasterizer3D.field2262;
            int var14 = (class208.field2476 - Rasterizer3D.field2260) * var10 / Rasterizer3D.field2262;
            int var15 = Rasterizer3D.method3453(var12, var9, var6, var5);
            var16 = Rasterizer3D.method3438(var12, var9, var6, var5);
            var12 = var15;
            var15 = Rasterizer3D.method3453(var14, var10, var6, var5);
            var17 = Rasterizer3D.method3438(var14, var10, var6, var5);
            var14 = var15;
            var15 = Rasterizer3D.method3465(var11, var16, var8, var7);
            var16 = Rasterizer3D.method3436(var11, var16, var8, var7);
            var11 = var15;
            var15 = Rasterizer3D.method3465(var13, var17, var8, var7);
            var17 = Rasterizer3D.method3436(var13, var17, var8, var7);
            class208.field2478 = (var11 + var15) / 2;
            class208.field2479 = (var12 + var14) / 2;
            class281.field3629 = (var16 + var17) / 2;
            class208.field2480 = (var15 - var11) / 2;
            class208.field2481 = (var14 - var12) / 2;
            class208.field2482 = (var17 - var16) / 2;
            class44.field373 = Math.abs(class208.field2480);
            class396.field4260 = Math.abs(class208.field2481);
            class208.field2483 = Math.abs(class208.field2482);
         }

         var5 = var0.field2413 + var1;
         var6 = var2 + var0.field2437;
         var7 = var3 + var0.field2438;
         var8 = var0.field2439;
         var16 = var0.field2407;
         var17 = var0.field2411;
         var11 = class208.field2478 - var5;
         var12 = class208.field2479 - var6;
         var13 = class281.field3629 - var7;
         if (Math.abs(var11) > var8 + class44.field373) {
            return false;
         } else if (Math.abs(var12) > class396.field4260 + var16) {
            return false;
         } else if (Math.abs(var13) > var17 + class208.field2483) {
            return false;
         } else if (Math.abs(class208.field2481 * var13 - var12 * class208.field2482) > var17 * class396.field4260 + var16 * class208.field2483) {
            return false;
         } else if (Math.abs(class208.field2482 * var11 - class208.field2480 * var13) > var17 * class44.field373 + var8 * class208.field2483) {
            return false;
         } else {
            return Math.abs(var12 * class208.field2480 - class208.field2481 * var11) <= class396.field4260 * var8 + class44.field373 * var16;
         }
      }
   }

   class128(class107 var1) {
      this.this$0 = var1;
   }

   void method2083(Buffer var1) {
      this.field1459 = var1.readInt();
      this.field1456 = var1.method5954();
   }

   void method2084(class115 var1) {
      var1.method2162(this.field1459, this.field1456);
   }

   static final boolean method2254(int var0, int var1) {
      class156 var3 = class124.method2243(var0);
      if (var1 == 11) {
         var1 = 10;
      }

      if (var1 >= 5 && var1 <= 8) {
         var1 = 4;
      }

      return var3.method2631(var1);
   }

   static void method2256(int var0, int var1, int var2) {
      if (0 != class38.clientPreferences.field1121 && var1 != 0 && client.field498 < 50) {
         client.field629[client.field498] = var0;
         client.field651[client.field498] = var1;
         client.field652[client.field498] = var2;
         client.field654[client.field498] = null;
         client.field653[client.field498] = 0;
         ++client.field498;
      }

   }
}
