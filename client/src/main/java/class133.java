import java.io.File;
import java.util.Hashtable;

public class class133 {
   static boolean field1483 = false;
   static class397[] field1486;
   static int field1485;
   static File field1482;
   static Hashtable field1484 = new Hashtable(16);

   public static class397[] method2305(class277 var0, int var1, int var2) {
      if (!class291.method4622(var0, var1, var2)) {
         return null;
      } else {
         class397[] var5 = new class397[class399.field4282];

         for(int var6 = 0; var6 < class399.field4282; ++var6) {
            class397 var7 = var5[var6] = new class397();
            var7.field4267 = class399.field4281;
            var7.field4268 = class399.field4286;
            var7.field4265 = class399.field4284[var6];
            var7.field4266 = class399.field4285[var6];
            var7.field4263 = class106.field1308[var6];
            var7.field4264 = class375.field4156[var6];
            var7.field4261 = class119.field1407;
            var7.field4262 = class399.field4283[var6];
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

   static int method2298(int var0, class59 var1, boolean var2) {
      if (7000 != var0 && 7005 != var0 && var0 != 7010 && var0 != 7015 && 7020 != var0 && var0 != 7025 && var0 != 7030 && var0 != 7035) {
         if (7001 != var0 && 7002 != var0 && var0 != 7011 && var0 != 7012 && 7021 != var0 && var0 != 7022) {
            if (7003 != var0 && var0 != 7013 && 7023 != var0) {
               if (var0 != 7006 && var0 != 7007 && var0 != 7016 && 7017 != var0 && 7026 != var0 && var0 != 7027) {
                  if (7008 != var0 && var0 != 7018 && 7028 != var0) {
                     if (7031 != var0 && var0 != 7032) {
                        if (var0 == 7033) {
                           --class2.field4;
                           return 1;
                        } else if (var0 != 7036 && 7037 != var0) {
                           if (7038 == var0) {
                              --class51.field746;
                              return 1;
                           } else if (7004 != var0 && 7009 != var0 && var0 != 7014 && var0 != 7019 && var0 != 7024 && 7029 != var0 && 7034 != var0 && 7039 != var0) {
                              return 2;
                           } else {
                              --class51.field746;
                              return 1;
                           }
                        } else {
                           class51.field746 -= 2;
                           return 1;
                        }
                     } else {
                        --class2.field4;
                        --class51.field746;
                        return 1;
                     }
                  } else {
                     --class51.field746;
                     return 1;
                  }
               } else {
                  class51.field746 -= 2;
                  return 1;
               }
            } else {
               class51.field746 -= 2;
               return 1;
            }
         } else {
            class51.field746 -= 3;
            return 1;
         }
      } else {
         class51.field746 -= 5;
         return 1;
      }
   }
}
