public class class164 {
   static class277 field1914;
   static int[][][] field1915;

   static class398[] method2863() {
      class398[] var1 = new class398[class399.field4282];

      for(int var2 = 0; var2 < class399.field4282; ++var2) {
         class398 var3 = var1[var2] = new class398();
         var3.field4274 = class399.field4281;
         var3.field4275 = class399.field4286;
         var3.field4272 = class399.field4284[var2];
         var3.field4277 = class399.field4285[var2];
         var3.field4270 = class106.field1308[var2];
         var3.field4271 = class375.field4156[var2];
         int var4 = var3.field4271 * var3.field4270;
         byte[] var5 = class399.field4283[var2];
         var3.field4280 = new int[var4];

         for(int var6 = 0; var6 < var4; ++var6) {
            var3.field4280[var6] = class119.field1407[var5[var6] & 255];
         }
      }

      class399.field4284 = null;
      class399.field4285 = null;
      class106.field1308 = null;
      class375.field4156 = null;
      class119.field1407 = null;
      class399.field4283 = (byte[][])null;
      return var1;
   }
}
