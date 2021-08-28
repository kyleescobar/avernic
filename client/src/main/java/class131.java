import java.io.File;

public class class131 {
   public static class370 field1471 = null;
   public static class370 field1477 = null;
   public static class370 field1479 = null;
   static File field1475;
   static File field1476;

   static final int method2294(Interface var0, int var1) {
      if (var0.field3080 != null && var1 < var0.field3080.length) {
         try {
            int[] var3 = var0.field3080[var1];
            int var4 = 0;
            int var5 = 0;
            byte var6 = 0;

            while(true) {
               int var7 = var3[var5++];
               int var8 = 0;
               byte var9 = 0;
               if (var7 == 0) {
                  return var4;
               }

               if (var7 == 1) {
                  var8 = client.field435[var3[var5++]];
               }

               if (2 == var7) {
                  var8 = client.field541[var3[var5++]];
               }

               if (var7 == 3) {
                  var8 = client.field542[var3[var5++]];
               }

               int var10;
               Interface var11;
               int var12;
               int var13;
               if (4 == var7) {
                  var10 = var3[var5++] << 16;
                  var10 += var3[var5++];
                  var11 = class87.getComponent(var10);
                  var12 = var3[var5++];
                  if (var12 != -1 && (!KeyHandler.method93(var12).field1808 || client.field562)) {
                     for(var13 = 0; var13 < var11.field3086.length; ++var13) {
                        if (var11.field3086[var13] == var12 + 1) {
                           var8 += var11.field3087[var13];
                        }
                     }
                  }
               }

               if (5 == var7) {
                  var8 = class244.field2911[var3[var5++]];
               }

               if (var7 == 6) {
                  var8 = class259.field3168[client.field541[var3[var5++]] - 1];
               }

               if (var7 == 7) {
                  var8 = class244.field2911[var3[var5++]] * 100 / '\ub71b';
               }

               if (var7 == 8) {
                  var8 = MouseHandler.localPlayer.field991;
               }

               if (var7 == 9) {
                  for(var10 = 0; var10 < 25; ++var10) {
                     if (class259.field3170[var10]) {
                        var8 += client.field541[var10];
                     }
                  }
               }

               if (var7 == 10) {
                  var10 = var3[var5++] << 16;
                  var10 += var3[var5++];
                  var11 = class87.getComponent(var10);
                  var12 = var3[var5++];
                  if (-1 != var12 && (!KeyHandler.method93(var12).field1808 || client.field562)) {
                     for(var13 = 0; var13 < var11.field3086.length; ++var13) {
                        if (var12 + 1 == var11.field3086[var13]) {
                           var8 = 999999999;
                           break;
                        }
                     }
                  }
               }

               if (11 == var7) {
                  var8 = client.field432;
               }

               if (var7 == 12) {
                  var8 = client.field576;
               }

               if (var7 == 13) {
                  var10 = class244.field2911[var3[var5++]];
                  int var15 = var3[var5++];
                  var8 = 0 != (var10 & 1 << var15) ? 1 : 0;
               }

               if (var7 == 14) {
                  var10 = var3[var5++];
                  var8 = class175.method3139(var10);
               }

               if (var7 == 15) {
                  var9 = 1;
               }

               if (var7 == 16) {
                  var9 = 2;
               }

               if (17 == var7) {
                  var9 = 3;
               }

               if (18 == var7) {
                  var8 = (MouseHandler.localPlayer.x >> 7) + class281.baseX;
               }

               if (19 == var7) {
                  var8 = (MouseHandler.localPlayer.y >> 7) + class78.baseY;
               }

               if (20 == var7) {
                  var8 = var3[var5++];
               }

               if (0 == var9) {
                  if (0 == var6) {
                     var4 += var8;
                  }

                  if (1 == var6) {
                     var4 -= var8;
                  }

                  if (2 == var6 && 0 != var8) {
                     var4 /= var8;
                  }

                  if (3 == var6) {
                     var4 *= var8;
                  }

                  var6 = 0;
               } else {
                  var6 = var9;
               }
            }
         } catch (Exception var14) {
            return -1;
         }
      } else {
         return -2;
      }
   }
}
