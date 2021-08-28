import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;

public class class42 {
   public static class298 field356 = new class298();
   static class115 field355;
   static int[] field357;

   static void method766(String var0, boolean var1, String var2, boolean var3) {
      if (var1) {
         if (!var3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
               Desktop.getDesktop().browse(new URI(var0));
               return;
            } catch (Exception var6) {
            }
         }

         if (class17.field88.startsWith("win") && !var3) {
            class156.method2653(var0, 0, "openjs");
            return;
         }

         if (class17.field88.startsWith("mac")) {
            class156.method2653(var0, 1, var2);
            return;
         }

         class156.method2653(var0, 2, "openjs");
      } else {
         class156.method2653(var0, 3, "openjs");
      }

   }

   static int method757(int var0) {
      class61 var2 = (class61)class85.field1196.get(var0);
      return null == var2 ? 0 : var2.method1611();
   }

   static int method756(char var0, class292 var1) {
      int var3 = var0 << 4;
      if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
         var0 = Character.toLowerCase(var0);
         var3 = (var0 << 4) + 1;
      }

      if (241 == var0 && var1 == class292.field3686) {
         var3 = 1762;
      }

      return var3;
   }

   static void method764(int var0) {
      if (-1 == var0 && !client.field648) {
         class60.method1610();
      } else if (-1 != var0 && var0 != client.field640 && 0 != class38.clientPreferences.field1119 && !client.field648) {
         class92.method2026(2, class109.archive6, var0, 0, class38.clientPreferences.field1119, false);
      }

      client.field640 = var0;
   }

   static final void method765(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (class251.method4294(var0)) {
         class88.field1225 = null;
         class154.method2586(Interface.components[var0], -1, var1, var2, var3, var4, var5, var6, var7);
         if (null != class88.field1225) {
            class154.method2586(class88.field1225, -1412584499, var1, var2, var3, var4, class25.field192, class69.field977, var7);
            class88.field1225 = null;
         }

      } else {
         if (var7 != -1) {
            client.field617[var7] = true;
         } else {
            for(int var9 = 0; var9 < 100; ++var9) {
               client.field617[var9] = true;
            }
         }

      }
   }
}
