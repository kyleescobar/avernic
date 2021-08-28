import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class KeyHandler implements KeyListener, FocusListener {
   public static boolean[] field39 = new boolean[112];
   public static boolean[] pressedKeys = new boolean[112];
   public static boolean[] field47 = new boolean[112];
   public static KeyHandler field59 = new KeyHandler();
   public static int field36 = 0;
   public static int field50 = 0;
   public static int field51 = 0;
   public static int field53 = 0;
   public static int field58 = 0;
   public static int field60 = 0;
   public static int field65 = 0;
   public static int[] field49 = new int[128];
   public static int[] field54 = new int[128];
   public static int[] field56 = new int[128];
   public static volatile int field61 = 0;
   static char[] field52 = new char[128];
   static int field41;
   static int field66;
   static int[] field40 = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
   static int[] field55 = new int[128];

   public static class157 method93(int var0) {
      class157 var2 = (class157)class157.field1790.method3880((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = class27.field217.method4412(10, var0);
         var2 = new class157();
         var2.field1802 = var0;
         if (null != var3) {
            var2.method2687(new Buffer(var3));
         }

         var2.method2686();
         if (var2.field1789 != -1) {
            var2.method2689(method93(var2.field1789), method93(var2.field1827));
         }

         if (var2.field1786 != -1) {
            var2.method2690(method93(var2.field1786), method93(var2.field1829));
         }

         if (var2.field1820 != -1) {
            var2.method2691(method93(var2.field1820), method93(var2.field1838));
         }

         if (!class145.field1595 && var2.field1808) {
            var2.field1836 = class270.field3229;
            var2.field1834 = false;

            int var4;
            for(var4 = 0; var4 < var2.field1809.length; ++var4) {
               var2.field1809[var4] = null;
            }

            for(var4 = 0; var4 < var2.field1810.length; ++var4) {
               if (var4 != 4) {
                  var2.field1810[var4] = null;
               }
            }

            var2.field1792 = -2;
            var2.field1833 = 0;
            if (null != var2.field1831) {
               boolean var7 = false;

               for(class354 var5 = var2.field1831.method5719(); null != var5; var5 = var2.field1831.method5720()) {
                  class153 var6 = PacketBuffer.method5928((int)var5.field3966);
                  if (var6.field1699) {
                     var5.remove();
                  } else {
                     var7 = true;
                  }
               }

               if (!var7) {
                  var2.field1831 = null;
               }
            }
         }

         class157.field1790.method3882(var2, (long)var0);
         return var2;
      }
   }

   KeyHandler() {
   }

   public final synchronized void keyPressed(KeyEvent var1) {
      if (field59 != null) {
         int var2 = var1.getKeyCode();
         if (var2 >= 0 && var2 < field40.length) {
            var2 = field40[var2];
            if ((var2 & 128) != 0) {
               var2 = -1;
            }
         } else {
            var2 = -1;
         }

         if (field51 >= 0 && var2 >= 0) {
            field49[field51] = var2;
            field51 = field51 + 1 & 127;
            if (field50 == field51) {
               field51 = -1;
            }
         }

         int var3;
         if (var2 >= 0) {
            var3 = 1 + field53 & 127;
            if (field58 != var3) {
               field55[field53] = var2;
               field52[field53] = 0;
               field53 = var3;
            }
         }

         var3 = var1.getModifiers();
         if (0 != (var3 & 10) || 85 == var2 || var2 == 10) {
            var1.consume();
         }
      }

   }

   public final synchronized void keyReleased(KeyEvent var1) {
      if (field59 != null) {
         int var2 = var1.getKeyCode();
         if (var2 >= 0 && var2 < field40.length) {
            var2 = field40[var2] & -129;
         } else {
            var2 = -1;
         }

         if (field51 >= 0 && var2 >= 0) {
            field49[field51] = ~var2;
            field51 = 1 + field51 & 127;
            if (field51 == field50) {
               field51 = -1;
            }
         }
      }

      var1.consume();
   }

   public final void keyTyped(KeyEvent var1) {
      if (null != field59) {
         char var2 = var1.getKeyChar();
         if (0 != var2 && '\uffff' != var2 && class214.method3848(var2)) {
            int var3 = field53 + 1 & 127;
            if (var3 != field58) {
               field55[field53] = -1;
               field52[field53] = var2;
               field53 = var3;
            }
         }
      }

      var1.consume();
   }

   public final void focusGained(FocusEvent var1) {
   }

   public final synchronized void focusLost(FocusEvent var1) {
      if (field59 != null) {
         field51 = -1;
      }

   }

   static final boolean method95(int var0, int var1, class161 var2, class160 var3) {
      int var5 = var0;
      int var6 = var1;
      byte var7 = 64;
      byte var8 = 64;
      int var9 = var0 - var7;
      int var10 = var1 - var8;
      class162.field1899[var7][var8] = 99;
      class162.field1900[var7][var8] = 0;
      byte var11 = 0;
      int var12 = 0;
      class162.field1902[var11] = var0;
      byte var10001 = var11;
      int var19 = var11 + 1;
      class162.field1905[var10001] = var1;
      int[][] var13 = var3.field1889;

      while(var19 != var12) {
         var5 = class162.field1902[var12];
         var6 = class162.field1905[var12];
         var12 = 1 + var12 & 4095;
         int var17 = var5 - var9;
         int var18 = var6 - var10;
         int var14 = var5 - var3.field1885;
         int var15 = var6 - var3.field1888;
         if (var2.method2844(2, var5, var6, var3)) {
            class27.field220 = var5;
            class162.field1897 = var6;
            return true;
         }

         int var16 = class162.field1900[var17][var18] + 1;
         if (var17 > 0 && 0 == class162.field1899[var17 - 1][var18] && (var13[var14 - 1][var15] & 19136782) == 0 && 0 == (var13[var14 - 1][1 + var15] & 19136824)) {
            class162.field1902[var19] = var5 - 1;
            class162.field1905[var19] = var6;
            var19 = 1 + var19 & 4095;
            class162.field1899[var17 - 1][var18] = 2;
            class162.field1900[var17 - 1][var18] = var16;
         }

         if (var17 < 126 && class162.field1899[var17 + 1][var18] == 0 && 0 == (var13[2 + var14][var15] & 19136899) && 0 == (var13[2 + var14][1 + var15] & 19136992)) {
            class162.field1902[var19] = var5 + 1;
            class162.field1905[var19] = var6;
            var19 = 1 + var19 & 4095;
            class162.field1899[1 + var17][var18] = 8;
            class162.field1900[1 + var17][var18] = var16;
         }

         if (var18 > 0 && class162.field1899[var17][var18 - 1] == 0 && 0 == (var13[var14][var15 - 1] & 19136782) && (var13[var14 + 1][var15 - 1] & 19136899) == 0) {
            class162.field1902[var19] = var5;
            class162.field1905[var19] = var6 - 1;
            var19 = var19 + 1 & 4095;
            class162.field1899[var17][var18 - 1] = 1;
            class162.field1900[var17][var18 - 1] = var16;
         }

         if (var18 < 126 && 0 == class162.field1899[var17][1 + var18] && 0 == (var13[var14][var15 + 2] & 19136824) && 0 == (var13[1 + var14][var15 + 2] & 19136992)) {
            class162.field1902[var19] = var5;
            class162.field1905[var19] = var6 + 1;
            var19 = var19 + 1 & 4095;
            class162.field1899[var17][1 + var18] = 4;
            class162.field1900[var17][var18 + 1] = var16;
         }

         if (var17 > 0 && var18 > 0 && 0 == class162.field1899[var17 - 1][var18 - 1] && 0 == (var13[var14 - 1][var15] & 19136830) && (var13[var14 - 1][var15 - 1] & 19136782) == 0 && (var13[var14][var15 - 1] & 19136911) == 0) {
            class162.field1902[var19] = var5 - 1;
            class162.field1905[var19] = var6 - 1;
            var19 = var19 + 1 & 4095;
            class162.field1899[var17 - 1][var18 - 1] = 3;
            class162.field1900[var17 - 1][var18 - 1] = var16;
         }

         if (var17 < 126 && var18 > 0 && 0 == class162.field1899[var17 + 1][var18 - 1] && (var13[var14 + 1][var15 - 1] & 19136911) == 0 && (var13[2 + var14][var15 - 1] & 19136899) == 0 && (var13[var14 + 2][var15] & 19136995) == 0) {
            class162.field1902[var19] = 1 + var5;
            class162.field1905[var19] = var6 - 1;
            var19 = var19 + 1 & 4095;
            class162.field1899[1 + var17][var18 - 1] = 9;
            class162.field1900[var17 + 1][var18 - 1] = var16;
         }

         if (var17 > 0 && var18 < 126 && class162.field1899[var17 - 1][1 + var18] == 0 && 0 == (var13[var14 - 1][var15 + 1] & 19136830) && 0 == (var13[var14 - 1][2 + var15] & 19136824) && (var13[var14][2 + var15] & 19137016) == 0) {
            class162.field1902[var19] = var5 - 1;
            class162.field1905[var19] = 1 + var6;
            var19 = 1 + var19 & 4095;
            class162.field1899[var17 - 1][1 + var18] = 6;
            class162.field1900[var17 - 1][var18 + 1] = var16;
         }

         if (var17 < 126 && var18 < 126 && class162.field1899[var17 + 1][1 + var18] == 0 && (var13[var14 + 1][2 + var15] & 19137016) == 0 && (var13[2 + var14][2 + var15] & 19136992) == 0 && 0 == (var13[var14 + 2][1 + var15] & 19136995)) {
            class162.field1902[var19] = var5 + 1;
            class162.field1905[var19] = var6 + 1;
            var19 = 1 + var19 & 4095;
            class162.field1899[1 + var17][1 + var18] = 12;
            class162.field1900[var17 + 1][1 + var18] = var16;
         }
      }

      class27.field220 = var5;
      class162.field1897 = var6;
      return false;
   }

   static void method94() {
      class116.method2185();
      client.field485[0] = class270.field3479;
      client.field551[0] = "";
      client.field548[0] = 1006;
      client.field674[0] = false;
      client.field545 = 1;
   }

   static final String method71(int var0) {
      return var0 < 999999999 ? Integer.toString(var0) : "*";
   }
}
