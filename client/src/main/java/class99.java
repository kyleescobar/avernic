import java.security.SecureRandom;

public class class99 implements class98 {
   static SecureRandom field1267;

   static int method2071(int var0, class59 var1, boolean var2) {
      if (3800 == var0) {
         if (null != class42.field355) {
            class51.field747[++class51.field746 - 1] = 1;
            class150.field1669 = class42.field355;
         } else {
            class51.field747[++class51.field746 - 1] = 0;
         }

         return 1;
      } else {
         int var4;
         if (var0 == 3801) {
            var4 = class51.field747[--class51.field746];
            if (null != client.field637[var4]) {
               class51.field747[++class51.field746 - 1] = 1;
               class150.field1669 = client.field637[var4];
            } else {
               class51.field747[++class51.field746 - 1] = 0;
            }

            return 1;
         } else if (3802 == var0) {
            class51.field738[++class2.field4 - 1] = class150.field1669.field1368;
            return 1;
         } else if (3803 == var0) {
            class51.field747[++class51.field746 - 1] = class150.field1669.field1367 ? 1 : 0;
            return 1;
         } else if (3804 == var0) {
            class51.field747[++class51.field746 - 1] = class150.field1669.field1360;
            return 1;
         } else if (var0 == 3805) {
            class51.field747[++class51.field746 - 1] = class150.field1669.field1369;
            return 1;
         } else if (var0 == 3806) {
            class51.field747[++class51.field746 - 1] = class150.field1669.field1370;
            return 1;
         } else if (var0 == 3807) {
            class51.field747[++class51.field746 - 1] = class150.field1669.field1384;
            return 1;
         } else if (3809 == var0) {
            class51.field747[++class51.field746 - 1] = class150.field1669.field1372;
            return 1;
         } else if (3810 == var0) {
            var4 = class51.field747[--class51.field746];
            class51.field738[++class2.field4 - 1] = class150.field1669.field1373[var4];
            return 1;
         } else if (3811 == var0) {
            var4 = class51.field747[--class51.field746];
            class51.field747[++class51.field746 - 1] = class150.field1669.field1374[var4];
            return 1;
         } else if (var0 == 3812) {
            class51.field747[++class51.field746 - 1] = class150.field1669.field1381;
            return 1;
         } else if (var0 == 3813) {
            var4 = class51.field747[--class51.field746];
            class51.field738[++class2.field4 - 1] = class150.field1669.field1363[var4];
            return 1;
         } else {
            int var6;
            int var7;
            if (3814 == var0) {
               class51.field746 -= 3;
               var4 = class51.field747[class51.field746];
               var7 = class51.field747[1 + class51.field746];
               var6 = class51.field747[2 + class51.field746];
               class51.field747[++class51.field746 - 1] = class150.field1669.method2138(var4, var7, var6);
               return 1;
            } else if (var0 == 3815) {
               class51.field747[++class51.field746 - 1] = class150.field1669.field1379;
               return 1;
            } else if (3816 == var0) {
               class51.field747[++class51.field746 - 1] = class150.field1669.field1380;
               return 1;
            } else if (3817 == var0) {
               class51.field747[++class51.field746 - 1] = class150.field1669.method2120(class51.field738[--class2.field4]);
               return 1;
            } else if (var0 == 3818) {
               class51.field747[class51.field746 - 1] = class150.field1669.method2122()[class51.field747[class51.field746 - 1]];
               return 1;
            } else if (3819 == var0) {
               class51.field746 -= 2;
               var4 = class51.field747[class51.field746];
               var7 = class51.field747[1 + class51.field746];
               MouseHandler.method325(var7, var4);
               return 1;
            } else if (3820 == var0) {
               var4 = class51.field747[--class51.field746];
               class51.field747[++class51.field746 - 1] = class150.field1669.field1377[var4];
               return 1;
            } else {
               if (3821 == var0) {
                  class51.field746 -= 3;
                  var4 = class51.field747[class51.field746];
                  boolean var5 = 1 == class51.field747[1 + class51.field746];
                  var6 = class51.field747[class51.field746 + 2];
                  class389.method6228(var6, var4, var5);
               }

               if (3822 == var0) {
                  var4 = class51.field747[--class51.field746];
                  class51.field747[++class51.field746 - 1] = class150.field1669.field1378[var4] ? 1 : 0;
                  return 1;
               } else if (3850 == var0) {
                  if (class322.field3845 != null) {
                     class51.field747[++class51.field746 - 1] = 1;
                     class104.field1294 = class322.field3845;
                  } else {
                     class51.field747[++class51.field746 - 1] = 0;
                  }

                  return 1;
               } else if (var0 == 3851) {
                  var4 = class51.field747[--class51.field746];
                  if (client.field638[var4] != null) {
                     class51.field747[++class51.field746 - 1] = 1;
                     class104.field1294 = client.field638[var4];
                     class228.field2674 = var4;
                  } else {
                     class51.field747[++class51.field746 - 1] = 0;
                  }

                  return 1;
               } else if (var0 == 3852) {
                  class51.field738[++class2.field4 - 1] = class104.field1294.field1430;
                  return 1;
               } else if (var0 == 3853) {
                  class51.field747[++class51.field746 - 1] = class104.field1294.field1437;
                  return 1;
               } else if (3854 == var0) {
                  class51.field747[++class51.field746 - 1] = class104.field1294.field1431;
                  return 1;
               } else if (var0 == 3855) {
                  class51.field747[++class51.field746 - 1] = class104.field1294.method2230();
                  return 1;
               } else if (3856 == var0) {
                  var4 = class51.field747[--class51.field746];
                  class51.field738[++class2.field4 - 1] = ((class106)class104.field1294.field1436.get(var4)).field1303.getName();
                  return 1;
               } else if (3857 == var0) {
                  var4 = class51.field747[--class51.field746];
                  class51.field747[++class51.field746 - 1] = ((class106)class104.field1294.field1436.get(var4)).field1306;
                  return 1;
               } else if (var0 == 3858) {
                  var4 = class51.field747[--class51.field746];
                  class51.field747[++class51.field746 - 1] = ((class106)class104.field1294.field1436.get(var4)).field1302;
                  return 1;
               } else if (3859 == var0) {
                  var4 = class51.field747[--class51.field746];
                  class241.method4144(class228.field2674, var4);
                  return 1;
               } else if (var0 == 3860) {
                  class51.field747[++class51.field746 - 1] = class104.field1294.method2222(class51.field738[--class2.field4]);
                  return 1;
               } else if (var0 == 3861) {
                  class51.field747[class51.field746 - 1] = class104.field1294.method2223()[class51.field747[class51.field746 - 1]];
                  return 1;
               } else if (3890 == var0) {
                  class51.field747[++class51.field746 - 1] = class44.field372 != null ? 1 : 0;
                  return 1;
               } else {
                  return 2;
               }
            }
         }
      }
   }

   static final void method2072(int var0, int var1, boolean var2) {
      if (!var2 || var0 != MouseHandler.field137 || class8.field27 != var1) {
         MouseHandler.field137 = var0;
         class8.field27 = var1;
         class17.method128(25);
         class12.method98(class270.field3237, true);
         int var4 = class281.baseX;
         int var5 = class78.baseY;
         class281.baseX = (var0 - 6) * 8;
         class78.baseY = 8 * (var1 - 6);
         int var6 = class281.baseX - var4;
         int var7 = class78.baseY - var5;
         var4 = class281.baseX;
         var5 = class78.baseY;

         int var8;
         int var10;
         int[] var10000;
         for(var8 = 0; var8 < 32768; ++var8) {
            class78 var9 = client.field567[var8];
            if (null != var9) {
               for(var10 = 0; var10 < 10; ++var10) {
                  var10000 = var9.pathX;
                  var10000[var10] -= var6;
                  var10000 = var9.pathY;
                  var10000[var10] -= var7;
               }

               var9.x -= 128 * var6;
               var9.y -= 128 * var7;
            }
         }

         for(var8 = 0; var8 < 2048; ++var8) {
            Player var20 = client.localPlayers[var8];
            if (var20 != null) {
               for(var10 = 0; var10 < 10; ++var10) {
                  var10000 = var20.pathX;
                  var10000[var10] -= var6;
                  var10000 = var20.pathY;
                  var10000[var10] -= var7;
               }

               var20.x -= var6 * 128;
               var20.y -= 128 * var7;
            }
         }

         byte var19 = 0;
         byte var21 = 104;
         byte var22 = 1;
         if (var6 < 0) {
            var19 = 103;
            var21 = -1;
            var22 = -1;
         }

         byte var11 = 0;
         byte var12 = 104;
         byte var13 = 1;
         if (var7 < 0) {
            var11 = 103;
            var12 = -1;
            var13 = -1;
         }

         int var15;
         for(int var14 = var19; var14 != var21; var14 += var22) {
            for(var15 = var11; var12 != var15; var15 += var13) {
               int var16 = var6 + var14;
               int var17 = var7 + var15;

               for(int var18 = 0; var18 < 4; ++var18) {
                  if (var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104) {
                     client.field536[var18][var14][var15] = client.field536[var18][var16][var17];
                  } else {
                     client.field536[var18][var14][var15] = null;
                  }
               }
            }
         }

         for(class71 var23 = (class71)client.field537.method4687(); null != var23; var23 = (class71)client.field537.method4678()) {
            var23.field1016 -= var6;
            var23.field1011 -= var7;
            if (var23.field1016 < 0 || var23.field1011 < 0 || var23.field1016 >= 104 || var23.field1011 >= 104) {
               var23.remove();
            }
         }

         if (client.field644 != 0) {
            client.field644 -= var6;
            client.field597 -= var7;
         }

         client.field498 = 0;
         client.field615 = false;
         class65.field934 -= var6 << 7;
         class358.field4012 -= var7 << 7;
         KeyHandler.field66 -= var6 << 7;
         class273.field3553 -= var7 << 7;
         client.field639 = -1;
         client.field539.method4671();
         client.field538.method4671();

         for(var15 = 0; var15 < 4; ++var15) {
            client.field465[var15].method2808();
         }

      }
   }

   static final void method2073(int var0) {
      var0 = Math.min(Math.max(var0, 0), 127);
      class38.clientPreferences.field1121 = var0;
      class135.savePreferences();
   }
}
