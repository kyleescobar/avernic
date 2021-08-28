import java.applet.Applet;
import java.io.IOException;

public class class17 {
   static Applet field90 = null;
   static String field88 = "";

   public static String method141(CharSequence var0) {
      int var3 = var0.length();
      char[] var4 = new char[var3];

      for(int var5 = 0; var5 < var3; ++var5) {
         var4[var5] = '*';
      }

      String var2 = new String(var4);
      return var2;
   }

   static void method128(int var0) {
      if (var0 != client.field413) {
         if (0 == client.field413) {
            class59.field874.method181();
         }

         if (20 == var0 || 40 == var0 || 45 == var0) {
            client.loginState = 0;
            client.field439 = 0;
            client.field440 = 0;
            client.field458.method5060(var0);
            if (var0 != 20) {
               class51.method1468(false);
            }
         }

         if (var0 != 20 && var0 != 40 && client.field645 != null) {
            client.field645.method5279();
            client.field645 = null;
         }

         if (client.field413 == 25) {
            client.field464 = 0;
            client.field460 = 0;
            client.field461 = 1;
            client.field462 = 0;
            client.field550 = 1;
         }

         if (5 != var0 && 10 != var0) {
            if (20 == var0) {
               class238.method4112(class106.archive10, class271.archive8, true, client.field413 == 11 ? 4 : 0);
            } else if (11 == var0) {
               class238.method4112(class106.archive10, class271.archive8, false, 4);
            } else if (class56.field798) {
               class305.field3760 = null;
               class56.field801 = null;
               class56.field797 = null;
               class56.field815 = null;
               class56.field803 = null;
               class89.field1229 = null;
               class133.field1486 = null;
               class47.field397 = null;
               class173.field2014 = null;
               class189.field2127 = null;
               class52.field770 = null;
               ApproximateRouteStrategy.field392 = null;
               class61.field897 = null;
               class236.field2847 = null;
               class7.field16.method1794();
               class235.field2819 = 1;
               class235.field2820 = null;
               class235.field2822 = -1;
               class97.field1264 = -1;
               class147.field1612 = 0;
               class146.field1598 = false;
               class124.field1439 = 2;
               if (null != class278.field3614) {
                  try {
                     Buffer var2 = new Buffer(4);
                     var2.writeByte(2);
                     var2.writeMedium(0);
                     class278.field3614.write(var2.payload, 0, 4);
                  } catch (IOException var5) {
                     try {
                        class278.field3614.method5279();
                     } catch (Exception var4) {
                     }

                     ++class278.field3605;
                     class278.field3614 = null;
                  }
               }

               class56.field798 = false;
            }
         } else {
            class238.method4112(class106.archive10, class271.archive8, true, 0);
         }

         client.field413 = var0;
      }
   }

   static boolean method138() {
      if (null != client.field681 && client.field682 < client.field681.size()) {
         while(client.field682 < client.field681.size()) {
            class64 var1 = (class64)client.field681.get(client.field682);
            if (!var1.method1661()) {
               return false;
            }

            ++client.field682;
         }

         return true;
      } else {
         return true;
      }
   }

   static final void method142(class72 var0, int var1) {
      if (var0.field1074 >= client.field452) {
         class48.method1315(var0);
      } else if (var0.field1068 >= client.field452) {
         class45.method798(var0);
      } else {
         class156.method2651(var0);
      }

      if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) {
         var0.sequence = -1;
         var0.spotAnimation = -1;
         var0.field1074 = 0;
         var0.field1068 = 0;
         var0.x = var0.field1024 * 64 + 128 * var0.pathX[0];
         var0.y = 128 * var0.pathY[0] + var0.field1024 * 64;
         var0.method1749();
      }

      if (MouseHandler.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) {
         var0.sequence = -1;
         var0.spotAnimation = -1;
         var0.field1074 = 0;
         var0.field1068 = 0;
         var0.x = var0.pathX[0] * 128 + var0.field1024 * 64;
         var0.y = var0.field1024 * 64 + var0.pathY[0] * 128;
         var0.method1749();
      }

      class43.method768(var0);
      class110.method2110(var0);
   }

   static final void method140(int var0) {
      var0 = Math.min(Math.max(var0, 0), 127);
      class38.clientPreferences.field1116 = var0;
      class135.savePreferences();
   }
}
