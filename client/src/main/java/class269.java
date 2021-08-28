public class class269 {
   static {
      int var0 = 0;
      int var1 = 0;
      class264[] var2 = class258.method4330();

      for(int var3 = 0; var3 < var2.length; ++var3) {
         class264 var4 = var2[var3];
         if (var4.field3191 > var0) {
            var0 = var4.field3191;
         }

         if (var4.field3193 > var1) {
            var1 = var4.field3193;
         }
      }

   }

   public static void method4358() {
      while(true) {
         class273 var1;
         synchronized(class274.field3558) {
            var1 = (class273)class274.field3556.method4699();
         }

         if (null == var1) {
            return;
         }

         var1.field3550.method4382(var1.field3552, (int)var1.field3966, var1.field3551, false);
      }
   }
}
