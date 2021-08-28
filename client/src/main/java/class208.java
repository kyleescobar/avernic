public class class208 {
   public static boolean field2477 = false;
   public static boolean field2490 = false;
   public static int field2476 = 0;
   public static int field2484 = 0;
   public static int field2488 = 0;
   public static long[] field2485 = new long[1000];
   static int field2474;
   static int field2478;
   static int field2479;
   static int field2480;
   static int field2481;
   static int field2482;
   static int field2483;

   public static class266[] method3827() {
      return new class266[]{class266.field3204, class266.field3207, class266.field3205, class266.field3206, class266.field3213, class266.field3212};
   }

   public static class398 method3828(class277 var0, int var1, int var2) {
      if (!class291.method4622(var0, var1, var2)) {
         return null;
      } else {
         class398 var5 = new class398();
         var5.field4274 = class399.field4281;
         var5.field4275 = class399.field4286;
         var5.field4272 = class399.field4284[0];
         var5.field4277 = class399.field4285[0];
         var5.field4270 = class106.field1308[0];
         var5.field4271 = class375.field4156[0];
         int var6 = var5.field4270 * var5.field4271;
         byte[] var7 = class399.field4283[0];
         var5.field4280 = new int[var6];

         for(int var8 = 0; var8 < var6; ++var8) {
            var5.field4280[var8] = class119.field1407[var7[var8] & 255];
         }

         class399.field4284 = null;
         class399.field4285 = null;
         class106.field1308 = null;
         class375.field4156 = null;
         class119.field1407 = null;
         class399.field4283 = (byte[][])null;
         return var5;
      }
   }
}
