public class class162 {
   static int field1897;
   static int[] field1902 = new int[4096];
   static int[] field1905 = new int[4096];
   static int[][] field1899 = new int[128][128];
   static int[][] field1900 = new int[128][128];

   static final void method2849() {
      int var1 = class108.field1324 * 128 + 64;
      int var2 = 64 + class155.field1714 * 128;
      int var3 = class123.method2216(var1, var2, class285.plane) - class7.field15;
      if (class65.field934 < var1) {
         class65.field934 += class217.field2546 * (var1 - class65.field934) / 1000 + class97.field1266;
         if (class65.field934 > var1) {
            class65.field934 = var1;
         }
      }

      if (class65.field934 > var1) {
         class65.field934 -= (class65.field934 - var1) * class217.field2546 / 1000 + class97.field1266;
         if (class65.field934 < var1) {
            class65.field934 = var1;
         }
      }

      if (class337.field3924 < var3) {
         class337.field3924 += class217.field2546 * (var3 - class337.field3924) / 1000 + class97.field1266;
         if (class337.field3924 > var3) {
            class337.field3924 = var3;
         }
      }

      if (class337.field3924 > var3) {
         class337.field3924 -= class217.field2546 * (class337.field3924 - var3) / 1000 + class97.field1266;
         if (class337.field3924 < var3) {
            class337.field3924 = var3;
         }
      }

      if (class358.field4012 < var2) {
         class358.field4012 += (var2 - class358.field4012) * class217.field2546 / 1000 + class97.field1266;
         if (class358.field4012 > var2) {
            class358.field4012 = var2;
         }
      }

      if (class358.field4012 > var2) {
         class358.field4012 -= class217.field2546 * (class358.field4012 - var2) / 1000 + class97.field1266;
         if (class358.field4012 < var2) {
            class358.field4012 = var2;
         }
      }

      var1 = class377.field4166 * 128 + 64;
      var2 = class192.field2148 * 128 + 64;
      var3 = class123.method2216(var1, var2, class285.plane) - class330.field3875;
      int var4 = var1 - class65.field934;
      int var5 = var3 - class337.field3924;
      int var6 = var2 - class358.field4012;
      int var7 = (int)Math.sqrt((double)(var6 * var6 + var4 * var4));
      int var8 = (int)(Math.atan2((double)var5, (double)var7) * 325.949D) & 2047;
      int var9 = (int)(Math.atan2((double)var4, (double)var6) * -325.949D) & 2047;
      if (var8 < 128) {
         var8 = 128;
      }

      if (var8 > 383) {
         var8 = 383;
      }

      if (class117.field1398 < var8) {
         class117.field1398 += (var8 - class117.field1398) * class270.field3398 / 1000 + class143.field1578;
         if (class117.field1398 > var8) {
            class117.field1398 = var8;
         }
      }

      if (class117.field1398 > var8) {
         class117.field1398 -= class143.field1578 + class270.field3398 * (class117.field1398 - var8) / 1000;
         if (class117.field1398 < var8) {
            class117.field1398 = var8;
         }
      }

      int var10 = var9 - class118.field1400;
      if (var10 > 1024) {
         var10 -= 2048;
      }

      if (var10 < -1024) {
         var10 += 2048;
      }

      if (var10 > 0) {
         class118.field1400 += class143.field1578 + class270.field3398 * var10 / 1000;
         class118.field1400 &= 2047;
      }

      if (var10 < 0) {
         class118.field1400 -= -var10 * class270.field3398 / 1000 + class143.field1578;
         class118.field1400 &= 2047;
      }

      int var11 = var9 - class118.field1400;
      if (var11 > 1024) {
         var11 -= 2048;
      }

      if (var11 < -1024) {
         var11 += 2048;
      }

      if (var11 < 0 && var10 > 0 || var11 > 0 && var10 < 0) {
         class118.field1400 = var9;
      }

   }

   static final void method2848() {
      for(class71 var1 = (class71)client.field537.method4687(); null != var1; var1 = (class71)client.field537.method4678()) {
         if (-1 == var1.field1019) {
            var1.field1008 = 0;
            class85.method1958(var1);
         } else {
            var1.remove();
         }
      }

   }

   static final void closeInterface(InterfaceParent var0, boolean var1) {
      int var3 = var0.field950;
      int var4 = (int)var0.field3966;
      var0.remove();
      if (var1) {
         class5.method16(var3);
      }

      class48.method1314(var3);
      Interface var5 = class87.getComponent(var4);
      if (null != var5) {
         class81.invalidateComponent(var5);
      }

      for(int var6 = 0; var6 < client.field545; ++var6) {
         if (class27.method464(client.field548[var6])) {
            if (var6 < client.field545 - 1) {
               for(int var7 = var6; var7 < client.field545 - 1; ++var7) {
                  client.field485[var7] = client.field485[var7 + 1];
                  client.field551[var7] = client.field551[1 + var7];
                  client.field548[var7] = client.field548[1 + var7];
                  client.field549[var7] = client.field549[var7 + 1];
                  client.field678[var7] = client.field678[1 + var7];
                  client.field547[var7] = client.field547[1 + var7];
                  client.field674[var7] = client.field674[var7 + 1];
               }
            }

            --var6;
            --client.field545;
         }
      }

      class58.method1596();
      if (client.rootInterface != -1) {
         class163.dispatchInterfaceCloseEvent(client.rootInterface, 1);
      }

   }
}
