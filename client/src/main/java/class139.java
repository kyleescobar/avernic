import java.io.IOException;

public class class139 extends class349 {
   static class223 field1522 = new class223(64);
   static class275 archive4;
   static class277 field1525;
   public int field1523 = 0;

   class139() {
   }

   public static void method2345(String var0, boolean var1, boolean var2) {
      class42.method766(var0, var1, "openjs", var2);
   }

   void method2336(Buffer var1) {
      while(true) {
         int var3 = var1.readUnsignedByte();
         if (var3 == 0) {
            return;
         }

         this.method2344(var1, var3);
      }
   }

   void method2344(Buffer var1, int var2) {
      if (var2 == 2) {
         this.field1523 = var1.readUnsignedShort();
      }

   }

   public static byte[] method2346() {
      byte[] var1 = new byte[24];

      try {
         class131.field1471.method5795(0L);
         class131.field1471.method5797(var1);

         int var2;
         for(var2 = 0; var2 < 24 && 0 == var1[var2]; ++var2) {
         }

         if (var2 >= 24) {
            throw new IOException();
         }
      } catch (Exception var4) {
         for(int var3 = 0; var3 < 24; ++var3) {
            var1[var3] = -1;
         }
      }

      return var1;
   }

   static int method2339(int var0, class59 var1, boolean var2) {
      Interface var4;
      if (var0 >= 2000) {
         var0 -= 1000;
         var4 = class87.getComponent(class51.field747[--class51.field746]);
      } else {
         var4 = var2 ? class286.field3660 : class51.field750;
      }

      String var5 = class51.field738[--class2.field4];
      int[] var6 = null;
      if (var5.length() > 0 && var5.charAt(var5.length() - 1) == 'Y') {
         int var7 = class51.field747[--class51.field746];
         if (var7 > 0) {
            for(var6 = new int[var7]; var7-- > 0; var6[var7] = class51.field747[--class51.field746]) {
            }
         }

         var5 = var5.substring(0, var5.length() - 1);
      }

      Object[] var9 = new Object[var5.length() + 1];

      int var8;
      for(var8 = var9.length - 1; var8 >= 1; --var8) {
         if (var5.charAt(var8 - 1) == 's') {
            var9[var8] = class51.field738[--class2.field4];
         } else {
            var9[var8] = new Integer(class51.field747[--class51.field746]);
         }
      }

      var8 = class51.field747[--class51.field746];
      if (-1 != var8) {
         var9[0] = new Integer(var8);
      } else {
         var9 = null;
      }

      if (1400 == var0) {
         var4.field3046 = var9;
      } else if (1401 == var0) {
         var4.field3049 = var9;
      } else if (var0 == 1402) {
         var4.field2955 = var9;
      } else if (var0 == 1403) {
         var4.field3050 = var9;
      } else if (1404 == var0) {
         var4.field3052 = var9;
      } else if (1405 == var0) {
         var4.field2995 = var9;
      } else if (1406 == var0) {
         var4.field3056 = var9;
      } else if (var0 == 1407) {
         var4.field3057 = var9;
         var4.field3058 = var6;
      } else if (var0 == 1408) {
         var4.field3017 = var9;
      } else if (1409 == var0) {
         var4.field3055 = var9;
      } else if (var0 == 1410) {
         var4.field3081 = var9;
      } else if (var0 == 1411) {
         var4.field3047 = var9;
      } else if (1412 == var0) {
         var4.field3051 = var9;
      } else if (var0 == 1414) {
         var4.field3083 = var9;
         var4.field3060 = var6;
      } else if (var0 == 1415) {
         var4.field2996 = var9;
         var4.field3062 = var6;
      } else if (1416 == var0) {
         var4.field2974 = var9;
      } else if (1417 == var0) {
         var4.field3065 = var9;
      } else if (1418 == var0) {
         var4.field3066 = var9;
      } else if (var0 == 1419) {
         var4.field3067 = var9;
      } else if (1420 == var0) {
         var4.field3070 = var9;
      } else if (1421 == var0) {
         var4.field3059 = var9;
      } else if (var0 == 1422) {
         var4.field3074 = var9;
      } else if (var0 == 1423) {
         var4.field3008 = var9;
      } else if (var0 == 1424) {
         var4.field3076 = var9;
      } else if (1425 == var0) {
         var4.field2982 = var9;
      } else if (1426 == var0) {
         var4.field3079 = var9;
      } else if (var0 == 1427) {
         var4.field3072 = var9;
      } else if (var0 == 1428) {
         var4.field3075 = var9;
      } else if (var0 == 1429) {
         var4.field3073 = var9;
      } else if (var0 == 1430) {
         var4.field3068 = var9;
      } else {
         if (var0 != 1431) {
            return 2;
         }

         var4.field3069 = var9;
      }

      var4.field3044 = true;
      return 1;
   }
}
