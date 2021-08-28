import java.util.Date;

public class class65 extends class354 {
   static class364 field935 = new class364(32);
   static int field934;
   int[] field931 = new int[]{-1};
   int[] field932 = new int[]{0};

   class65() {
   }

   public static String method1675(long var0) {
      class254.field3123.setTime(new Date(var0));
      int var2 = class254.field3123.get(7);
      int var3 = class254.field3123.get(5);
      int var4 = class254.field3123.get(2);
      int var5 = class254.field3123.get(1);
      int var6 = class254.field3123.get(11);
      int var7 = class254.field3123.get(12);
      int var8 = class254.field3123.get(13);
      return class254.field3122[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + class254.field3121[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
   }

   public static final void method1666() {
      class208.field2490 = false;
      class208.field2484 = 0;
   }

   static int method1668(int var0, class59 var1, boolean var2) {
      Interface var4;
      if (var0 >= 2000) {
         var0 -= 1000;
         var4 = class87.getComponent(class51.field747[--class51.field746]);
      } else {
         var4 = var2 ? class286.field3660 : class51.field750;
      }

      class81.invalidateComponent(var4);
      if (var0 != 1200 && 1205 != var0 && var0 != 1212) {
         if (var0 == 1201) {
            var4.field2950 = 2;
            var4.field3002 = class51.field747[--class51.field746];
            return 1;
         } else if (1202 == var0) {
            var4.field2950 = 3;
            var4.field3002 = MouseHandler.localPlayer.field979.method4198();
            return 1;
         } else {
            return 2;
         }
      } else {
         class51.field746 -= 2;
         int var5 = class51.field747[class51.field746];
         int var6 = class51.field747[class51.field746 + 1];
         var4.field3088 = var5;
         var4.field3089 = var6;
         class157 var7 = KeyHandler.method93(var5);
         var4.field3009 = var7.field1801;
         var4.field3010 = var7.field1822;
         var4.field3011 = var7.field1803;
         var4.field3007 = var7.field1804;
         var4.field2960 = var7.field1805;
         var4.field3000 = var7.field1800;
         if (1205 == var0) {
            var4.field2991 = 0;
         } else if (var0 == 1212 | 1 == var7.field1806) {
            var4.field2991 = 1;
         } else {
            var4.field2991 = 2;
         }

         if (var4.field3013 > 0) {
            var4.field3000 = var4.field3000 * 32 / var4.field3013;
         } else if (var4.field2969 > 0) {
            var4.field3000 = var4.field3000 * 32 / var4.field2969;
         }

         return 1;
      }
   }

   static final void method1676() {
      for(class57 var1 = (class57)client.field538.method4687(); var1 != null; var1 = (class57)client.field538.method4678()) {
         if (class285.plane == var1.field837 && client.field452 <= var1.field844) {
            if (client.field452 >= var1.field839) {
               if (var1.field856 > 0) {
                  class78 var2 = client.field567[var1.field856 - 1];
                  if (var2 != null && var2.x >= 0 && var2.x < 13312 && var2.y >= 0 && var2.y < 13312) {
                     var1.method1582(var2.x, var2.y, class123.method2216(var2.x, var2.y, var1.field837) - var1.field846, client.field452);
                  }
               }

               if (var1.field856 < 0) {
                  int var3 = -var1.field856 - 1;
                  Player var4;
                  if (var3 == client.localPlayerIndex) {
                     var4 = MouseHandler.localPlayer;
                  } else {
                     var4 = client.localPlayers[var3];
                  }

                  if (null != var4 && var4.x >= 0 && var4.x < 13312 && var4.y >= 0 && var4.y < 13312) {
                     var1.method1582(var4.x, var4.y, class123.method2216(var4.x, var4.y, var1.field837) - var1.field846, client.field452);
                  }
               }

               var1.method1583(client.field556);
               class166.field1925.method3508(class285.plane, (int)var1.field832, (int)var1.field845, (int)var1.field833, 60, var1, var1.field852, -1L, false);
            }
         } else {
            var1.remove();
         }
      }

   }

   static final void method1665(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      class71 var10 = null;

      for(class71 var11 = (class71)client.field537.method4687(); var11 != null; var11 = (class71)client.field537.method4678()) {
         if (var11.field1018 == var0 && var11.field1016 == var1 && var2 == var11.field1011 && var11.field1009 == var3) {
            var10 = var11;
            break;
         }
      }

      if (var10 == null) {
         var10 = new class71();
         var10.field1018 = var0;
         var10.field1009 = var3;
         var10.field1016 = var1;
         var10.field1011 = var2;
         class85.method1958(var10);
         client.field537.method4672(var10);
      }

      var10.field1015 = var4;
      var10.field1017 = var5;
      var10.field1014 = var6;
      var10.field1008 = var7;
      var10.field1019 = var8;
   }

   static final void method1677(Interface var0, int var1, int var2) {
      if (client.field581 == null && !client.isMenuOpen) {
         if (null != var0) {
            Interface var5 = class123.method2215(var0);
            if (null == var5) {
               var5 = var0.field3064;
            }

            if (var5 != null) {
               client.field581 = var0;
               var5 = class123.method2215(var0);
               if (null == var5) {
                  var5 = var0.field3064;
               }

               client.field582 = var5;
               client.field583 = var1;
               client.field525 = var2;
               class107.field1319 = 0;
               client.field592 = false;
               int var6 = class160.method2842();
               if (-1 != var6) {
                  class106.field1305 = new class54();
                  class106.field1305.field791 = client.field678[var6];
                  class106.field1305.field787 = client.field547[var6];
                  class106.field1305.field786 = client.field548[var6];
                  class106.field1305.field789 = client.field549[var6];
                  class106.field1305.field790 = client.field485[var6];
               }

               return;
            }
         }

      }
   }
}
