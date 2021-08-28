public class class140 extends class349 {
   public static class223 field1526 = new class223(64);
   static class277 field1529;
   public int field1528 = 0;

   class140() {
   }

   void method2347(Buffer var1) {
      while(true) {
         int var3 = var1.readUnsignedByte();
         if (0 == var3) {
            return;
         }

         this.method2348(var1, var3);
      }
   }

   static void method2362(int var0, int var1, int var2, int var3) {
      class65 var5 = (class65)class65.field935.get((long)var0);
      if (var5 == null) {
         var5 = new class65();
         class65.field935.put(var5, (long)var0);
      }

      if (var5.field931.length <= var1) {
         int[] var6 = new int[var1 + 1];
         int[] var7 = new int[var1 + 1];

         int var8;
         for(var8 = 0; var8 < var5.field931.length; ++var8) {
            var6[var8] = var5.field931[var8];
            var7[var8] = var5.field932[var8];
         }

         for(var8 = var5.field931.length; var8 < var1; ++var8) {
            var6[var8] = -1;
            var7[var8] = 0;
         }

         var5.field931 = var6;
         var5.field932 = var7;
      }

      var5.field931[var1] = var2;
      var5.field932[var1] = var3;
   }

   void method2348(Buffer var1, int var2) {
      if (5 == var2) {
         this.field1528 = var1.readUnsignedShort();
      }

   }

   static void method2361() {
      class169.field1962.method3863();
   }

   static final boolean method2363(int var0, int var1, class161 var2, class160 var3) {
      int var5 = var0;
      int var6 = var1;
      byte var7 = 64;
      byte var8 = 64;
      int var9 = var0 - var7;
      int var10 = var1 - var8;
      class162.field1899[var7][var8] = 99;
      class162.field1900[var7][var8] = 0;
      byte var11 = 0;
      int var12 = 0;
      class162.field1902[var11] = var0;
      byte var10001 = var11;
      int var19 = var11 + 1;
      class162.field1905[var10001] = var1;
      int[][] var13 = var3.field1889;

      while(var12 != var19) {
         var5 = class162.field1902[var12];
         var6 = class162.field1905[var12];
         var12 = var12 + 1 & 4095;
         int var17 = var5 - var9;
         int var18 = var6 - var10;
         int var14 = var5 - var3.field1885;
         int var15 = var6 - var3.field1888;
         if (var2.method2844(1, var5, var6, var3)) {
            class27.field220 = var5;
            class162.field1897 = var6;
            return true;
         }

         int var16 = 1 + class162.field1900[var17][var18];
         if (var17 > 0 && 0 == class162.field1899[var17 - 1][var18] && (var13[var14 - 1][var15] & 19136776) == 0) {
            class162.field1902[var19] = var5 - 1;
            class162.field1905[var19] = var6;
            var19 = var19 + 1 & 4095;
            class162.field1899[var17 - 1][var18] = 2;
            class162.field1900[var17 - 1][var18] = var16;
         }

         if (var17 < 127 && class162.field1899[1 + var17][var18] == 0 && (var13[1 + var14][var15] & 19136896) == 0) {
            class162.field1902[var19] = var5 + 1;
            class162.field1905[var19] = var6;
            var19 = 1 + var19 & 4095;
            class162.field1899[var17 + 1][var18] = 8;
            class162.field1900[1 + var17][var18] = var16;
         }

         if (var18 > 0 && class162.field1899[var17][var18 - 1] == 0 && 0 == (var13[var14][var15 - 1] & 19136770)) {
            class162.field1902[var19] = var5;
            class162.field1905[var19] = var6 - 1;
            var19 = var19 + 1 & 4095;
            class162.field1899[var17][var18 - 1] = 1;
            class162.field1900[var17][var18 - 1] = var16;
         }

         if (var18 < 127 && 0 == class162.field1899[var17][var18 + 1] && (var13[var14][1 + var15] & 19136800) == 0) {
            class162.field1902[var19] = var5;
            class162.field1905[var19] = 1 + var6;
            var19 = var19 + 1 & 4095;
            class162.field1899[var17][var18 + 1] = 4;
            class162.field1900[var17][var18 + 1] = var16;
         }

         if (var17 > 0 && var18 > 0 && 0 == class162.field1899[var17 - 1][var18 - 1] && (var13[var14 - 1][var15 - 1] & 19136782) == 0 && (var13[var14 - 1][var15] & 19136776) == 0 && 0 == (var13[var14][var15 - 1] & 19136770)) {
            class162.field1902[var19] = var5 - 1;
            class162.field1905[var19] = var6 - 1;
            var19 = 1 + var19 & 4095;
            class162.field1899[var17 - 1][var18 - 1] = 3;
            class162.field1900[var17 - 1][var18 - 1] = var16;
         }

         if (var17 < 127 && var18 > 0 && 0 == class162.field1899[1 + var17][var18 - 1] && 0 == (var13[var14 + 1][var15 - 1] & 19136899) && 0 == (var13[var14 + 1][var15] & 19136896) && (var13[var14][var15 - 1] & 19136770) == 0) {
            class162.field1902[var19] = 1 + var5;
            class162.field1905[var19] = var6 - 1;
            var19 = var19 + 1 & 4095;
            class162.field1899[1 + var17][var18 - 1] = 9;
            class162.field1900[var17 + 1][var18 - 1] = var16;
         }

         if (var17 > 0 && var18 < 127 && 0 == class162.field1899[var17 - 1][1 + var18] && 0 == (var13[var14 - 1][1 + var15] & 19136824) && (var13[var14 - 1][var15] & 19136776) == 0 && (var13[var14][1 + var15] & 19136800) == 0) {
            class162.field1902[var19] = var5 - 1;
            class162.field1905[var19] = 1 + var6;
            var19 = var19 + 1 & 4095;
            class162.field1899[var17 - 1][1 + var18] = 6;
            class162.field1900[var17 - 1][1 + var18] = var16;
         }

         if (var17 < 127 && var18 < 127 && class162.field1899[var17 + 1][var18 + 1] == 0 && 0 == (var13[var14 + 1][var15 + 1] & 19136992) && (var13[1 + var14][var15] & 19136896) == 0 && 0 == (var13[var14][1 + var15] & 19136800)) {
            class162.field1902[var19] = 1 + var5;
            class162.field1905[var19] = var6 + 1;
            var19 = var19 + 1 & 4095;
            class162.field1899[1 + var17][1 + var18] = 12;
            class162.field1900[1 + var17][var18 + 1] = var16;
         }
      }

      class27.field220 = var5;
      class162.field1897 = var6;
      return false;
   }
}
