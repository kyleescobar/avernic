public class class268 {
   public static boolean method4353(char var0) {
      return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
   }

   public static boolean method4355(int var0) {
      return var0 >= 0 && var0 < 112 ? KeyHandler.field47[var0] : false;
   }

   static int method4357(int var0, class59 var1, boolean var2) {
      Interface var4 = var2 ? class286.field3660 : class51.field750;
      if (var0 == 1700) {
         class51.field747[++class51.field746 - 1] = var4.field3088;
         return 1;
      } else if (var0 == 1701) {
         if (-1 != var4.field3088) {
            class51.field747[++class51.field746 - 1] = var4.field3089;
         } else {
            class51.field747[++class51.field746 - 1] = 0;
         }

         return 1;
      } else if (var0 == 1702) {
         class51.field747[++class51.field746 - 1] = var4.field3031;
         return 1;
      } else {
         return 2;
      }
   }

   static final void method4351(int var0, int var1, int var2, int var3, class398 var4, SpriteMask var5) {
      if (null != var4) {
         int var7 = client.cameraAngleY & 2047;
         int var8 = var3 * var3 + var2 * var2;
         if (var8 <= 6400) {
            int var9 = Rasterizer3D.sineTable[var7];
            int var10 = Rasterizer3D.cosineTable[var7];
            int var11 = var9 * var3 + var10 * var2 >> 16;
            int var12 = var10 * var3 - var2 * var9 >> 16;
            if (var8 > 2500) {
               var4.method6395(var11 + var5.width / 2 - var4.field4274 / 2, var5.height / 2 - var12 - var4.field4275 / 2, var0, var1, var5.width, var5.height, var5.field2908, var5.field2905);
            } else {
               var4.method6404(var0 + var5.width / 2 + var11 - var4.field4274 / 2, var1 + var5.height / 2 - var12 - var4.field4275 / 2);
            }

         }
      }
   }
}
