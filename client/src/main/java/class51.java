import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashMap;

public class class51 {
   static boolean field741 = false;
   static boolean field753 = false;
   static Interface field750;
   static class44[] field749 = new class44[50];
   static int field743 = 0;
   static int field746;
   static int field748 = 0;
   static int[] field747 = new int[1000];
   static int[] field751 = new int[5];
   static int[][] field744 = new int[5][5000];
   static String[] field738 = new String[1000];
   static String[] field742;
   static ArrayList field755 = new ArrayList();
   static Calendar field745 = Calendar.getInstance();
   static final double field757 = Math.log(2.0D);
   static final String[] field752 = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

   static final void method1468(boolean var0) {
      if (var0) {
         client.field448 = class56.field821 ? class100.field1269 : class100.field1271;
      } else {
         LinkedHashMap var2 = class38.clientPreferences.parameters;
         String var4 = class56.loginUsername;
         int var5 = var4.length();
         int var6 = 0;

         for(int var7 = 0; var7 < var5; ++var7) {
            var6 = (var6 << 5) - var6 + var4.charAt(var7);
         }

         client.field448 = var2.containsKey(var6) ? class100.field1277 : class100.field1268;
      }

   }

   static final void method1525(int var0, int var1, int var2, int var3, boolean var4) {
      if (var2 < 1) {
         var2 = 1;
      }

      if (var3 < 1) {
         var3 = 1;
      }

      int var6 = var3 - 334;
      int var7;
      if (var6 < 0) {
         var7 = client.field661;
      } else if (var6 >= 100) {
         var7 = client.field632;
      } else {
         var7 = client.field661 + (client.field632 - client.field661) * var6 / 100;
      }

      int var8 = var7 * var3 * 512 / (var2 * 334);
      int var9;
      int var10;
      short var18;
      if (var8 < client.field667) {
         var18 = client.field667;
         var7 = var2 * var18 * 334 / (var3 * 512);
         if (var7 > client.field543) {
            var7 = client.field543;
            var9 = 512 * var3 * var7 / (var18 * 334);
            var10 = (var2 - var9) / 2;
            if (var4) {
               class394.method6295();
               class394.method6265(var0, var1, var10, var3, -16777216);
               class394.method6265(var0 + var2 - var10, var1, var10, var3, -16777216);
            }

            var0 += var10;
            var2 -= var10 * 2;
         }
      } else if (var8 > client.field668) {
         var18 = client.field668;
         var7 = 334 * var18 * var2 / (512 * var3);
         if (var7 < client.field473) {
            var7 = client.field473;
            var9 = var18 * var2 * 334 / (512 * var7);
            var10 = (var3 - var9) / 2;
            if (var4) {
               class394.method6295();
               class394.method6265(var0, var1, var2, var10, -16777216);
               class394.method6265(var0, var3 + var1 - var10, var2, var10, -16777216);
            }

            var1 += var10;
            var3 -= 2 * var10;
         }
      }

      client.field595 = var7 * var3 / 334;
      if (client.field671 != var2 || client.field672 != var3) {
         int[] var19 = new int[9];

         for(var10 = 0; var10 < var19.length; ++var10) {
            int var11 = 15 + 128 + 32 * var10;
            int var12 = 600 + 3 * var11;
            int var14 = Rasterizer3D.sineTable[var11];
            int var16 = var3 - 334;
            if (var16 < 0) {
               var16 = 0;
            } else if (var16 > 100) {
               var16 = 100;
            }

            int var17 = client.field663 + var16 * (client.field449 - client.field663) / 100;
            int var15 = var12 * var17 / 256;
            var19[var10] = var14 * var15 >> 16;
         }

         Scene.method3532(var19, 500, 800, var2 * 334 / var3, 334);
      }

      client.field669 = var0;
      client.field479 = var1;
      client.field671 = var2;
      client.field672 = var3;
   }

   static final void method1524() {
      client.field605 = client.field593;
      PlayerList.field1183 = true;
   }
}
