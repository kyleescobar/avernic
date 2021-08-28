public final class class192 {
   static class275 archive14;
   static class275 archive2;
   static int field2148;
   class201 field2137;
   class201 field2140;
   class201 field2142;
   int field2138;
   int field2141;
   int field2144;
   int field2145;
   long field2143;

   class192() {
   }

   public static int method3313(int var0) {
      int var2 = 0;
      if (var0 < 0 || var0 >= 65536) {
         var0 >>>= 16;
         var2 += 16;
      }

      if (var0 >= 256) {
         var0 >>>= 8;
         var2 += 8;
      }

      if (var0 >= 16) {
         var0 >>>= 4;
         var2 += 4;
      }

      if (var0 >= 4) {
         var0 >>>= 2;
         var2 += 2;
      }

      if (var0 >= 1) {
         var0 >>>= 1;
         ++var2;
      }

      return var2 + var0;
   }

   static final int method3314() {
      if (class38.clientPreferences.field1113) {
         return class285.plane;
      } else {
         int var1 = class123.method2216(class65.field934, class358.field4012, class285.plane);
         return var1 - class337.field3924 < 800 && (class62.field901[class285.plane][class65.field934 >> 7][class358.field4012 >> 7] & 4) != 0 ? class285.plane : 3;
      }
   }
}
