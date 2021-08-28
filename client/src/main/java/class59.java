public class class59 extends class349 {
   public static boolean field878;
   static class223 field862 = new class223(128);
   static client field874;
   class363[] field871;
   int field864;
   int field867;
   int field868;
   int field869;
   int[] field865;
   int[] field870;
   String field863;
   String[] field866;

   class59() {
   }

   public static int method1609(int var0, int var1) {
      int var3;
      for(var3 = 0; var1 > 0; --var1) {
         var3 = var3 << 1 | var0 & 1;
         var0 >>>= 1;
      }

      return var3;
   }

   class363[] method1600(int var1) {
      return new class363[var1];
   }
}
