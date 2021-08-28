public class class256 {
   protected static boolean field3128;

   static int method4323(int var0, class59 var1, boolean var2) {
      int var4;
      int var5;
      if (var0 == 100) {
         class51.field746 -= 3;
         var4 = class51.field747[class51.field746];
         var5 = class51.field747[class51.field746 + 1];
         int var12 = class51.field747[2 + class51.field746];
         if (var5 == 0) {
            throw new RuntimeException();
         } else {
            Interface var7 = class87.getComponent(var4);
            if (null == var7.field3061) {
               var7.field3061 = new Interface[1 + var12];
            }

            if (var7.field3061.length <= var12) {
               Interface[] var8 = new Interface[var12 + 1];

               for(int var9 = 0; var9 < var7.field3061.length; ++var9) {
                  var8[var9] = var7.field3061[var9];
               }

               var7.field3061 = var8;
            }

            if (var12 > 0 && var7.field3061[var12 - 1] == null) {
               throw new RuntimeException("" + (var12 - 1));
            } else {
               Interface var13 = new Interface();
               var13.field2977 = var5;
               var13.field3001 = var13.id = var7.id;
               var13.field3031 = var12;
               var13.field2993 = true;
               var7.field3061[var12] = var13;
               if (var2) {
                  class286.field3660 = var13;
               } else {
                  class51.field750 = var13;
               }

               class81.invalidateComponent(var7);
               return 1;
            }
         }
      } else {
         Interface var10;
         if (101 == var0) {
            var10 = var2 ? class286.field3660 : class51.field750;
            Interface var11 = class87.getComponent(var10.id);
            var11.field3061[var10.field3031] = null;
            class81.invalidateComponent(var11);
            return 1;
         } else if (var0 == 102) {
            var10 = class87.getComponent(class51.field747[--class51.field746]);
            var10.field3061 = null;
            class81.invalidateComponent(var10);
            return 1;
         } else if (var0 == 103) {
            class51.field746 -= 3;
            return 1;
         } else if (var0 == 104) {
            --class51.field746;
            return 1;
         } else if (var0 != 200) {
            if (201 == var0) {
               var10 = class87.getComponent(class51.field747[--class51.field746]);
               if (var10 != null) {
                  class51.field747[++class51.field746 - 1] = 1;
                  if (var2) {
                     class286.field3660 = var10;
                  } else {
                     class51.field750 = var10;
                  }
               } else {
                  class51.field747[++class51.field746 - 1] = 0;
               }

               return 1;
            } else if (202 == var0) {
               class51.field747[1 + class51.field746] = 0;
               return 1;
            } else if (var0 == 203) {
               class51.field747[--class51.field746 + 1] = 0;
               return 1;
            } else {
               return 2;
            }
         } else {
            class51.field746 -= 2;
            var4 = class51.field747[class51.field746];
            var5 = class51.field747[1 + class51.field746];
            Interface var6 = class50.method1394(var4, var5);
            if (var6 != null && -1 != var5) {
               class51.field747[++class51.field746 - 1] = 1;
               if (var2) {
                  class286.field3660 = var6;
               } else {
                  class51.field750 = var6;
               }
            } else {
               class51.field747[++class51.field746 - 1] = 0;
            }

            return 1;
         }
      }
   }
}
