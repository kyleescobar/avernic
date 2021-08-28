public final class class204 {
   int field2355;
   int field2356;
   int field2357;
   int field2358;
   int field2359;
   int field2360;
   int field2361;
   int field2362;
   int field2363;
   int field2364;
   int field2365;
   int field2366;
   int field2367;
   int field2368;
   int field2369;
   int field2370;
   int field2371;
   int field2372;

   class204() {
   }

   static void method3698(byte[] var0) {
      Buffer var2 = new Buffer(var0);
      var2.offset = var0.length - 2;
      class399.field4282 = var2.readUnsignedShort();
      class399.field4284 = new int[class399.field4282];
      class399.field4285 = new int[class399.field4282];
      class106.field1308 = new int[class399.field4282];
      class375.field4156 = new int[class399.field4282];
      class399.field4283 = new byte[class399.field4282][];
      var2.offset = var0.length - 7 - class399.field4282 * 8;
      class399.field4281 = var2.readUnsignedShort();
      class399.field4286 = var2.readUnsignedShort();
      int var3 = (var2.readUnsignedByte() & 255) + 1;

      int var4;
      for(var4 = 0; var4 < class399.field4282; ++var4) {
         class399.field4284[var4] = var2.readUnsignedShort();
      }

      for(var4 = 0; var4 < class399.field4282; ++var4) {
         class399.field4285[var4] = var2.readUnsignedShort();
      }

      for(var4 = 0; var4 < class399.field4282; ++var4) {
         class106.field1308[var4] = var2.readUnsignedShort();
      }

      for(var4 = 0; var4 < class399.field4282; ++var4) {
         class375.field4156[var4] = var2.readUnsignedShort();
      }

      var2.offset = var0.length - 7 - class399.field4282 * 8 - (var3 - 1) * 3;
      class119.field1407 = new int[var3];

      for(var4 = 1; var4 < var3; ++var4) {
         class119.field1407[var4] = var2.method5952();
         if (0 == class119.field1407[var4]) {
            class119.field1407[var4] = 1;
         }
      }

      var2.offset = 0;

      for(var4 = 0; var4 < class399.field4282; ++var4) {
         int var5 = class106.field1308[var4];
         int var6 = class375.field4156[var4];
         int var7 = var6 * var5;
         byte[] var8 = new byte[var7];
         class399.field4283[var4] = var8;
         int var9 = var2.readUnsignedByte();
         int var10;
         if (0 == var9) {
            for(var10 = 0; var10 < var7; ++var10) {
               var8[var10] = var2.readByte();
            }
         } else if (1 == var9) {
            for(var10 = 0; var10 < var5; ++var10) {
               for(int var11 = 0; var11 < var6; ++var11) {
                  var8[var5 * var11 + var10] = var2.readByte();
               }
            }
         }
      }

   }
}
