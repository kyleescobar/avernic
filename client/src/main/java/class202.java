public class class202 {
   static class265 field2350;
   int field2347;
   int field2348;
   int field2349;

   class202() {
   }

   static void method3691(Interface[] var0, int var1, int var2, int var3, boolean var4) {
      for(int var6 = 0; var6 < var0.length; ++var6) {
         Interface var7 = var0[var6];
         if (var7 != null && var1 == var7.field3001) {
            class287.method4592(var7, var2, var3, var4);
            class28.method483(var7, var2, var3);
            if (var7.field3054 > var7.field2981 - var7.field2973) {
               var7.field3054 = var7.field2981 - var7.field2973;
            }

            if (var7.field3054 < 0) {
               var7.field3054 = 0;
            }

            if (var7.field2968 > var7.field3091 - var7.field2990) {
               var7.field2968 = var7.field3091 - var7.field2990;
            }

            if (var7.field2968 < 0) {
               var7.field2968 = 0;
            }

            if (0 == var7.field2977) {
               class81.revalidateComponent(var0, var7, var4);
            }
         }
      }

   }
}
