public class class27 implements Runnable {
   static class277 field217;
   static class277 field218;
   static int field220;
   volatile class25[] field219 = new class25[2];

   class27() {
   }

   public void run() {
      try {
         for(int var1 = 0; var1 < 2; ++var1) {
            class25 var2 = this.field219[var1];
            if (var2 != null) {
               var2.method391();
            }
         }
      } catch (Exception var3) {
         class333.method5330((String)null, var3);
      }

   }

   public static int method470(int var0) {
      --var0;
      var0 |= var0 >>> 1;
      var0 |= var0 >>> 2;
      var0 |= var0 >>> 4;
      var0 |= var0 >>> 8;
      var0 |= var0 >>> 16;
      return var0 + 1;
   }

   static boolean method464(int var0) {
      return 57 == var0 || var0 == 58 || 1007 == var0 || var0 == 25 || var0 == 30;
   }
}
