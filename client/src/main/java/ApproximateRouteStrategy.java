public class ApproximateRouteStrategy extends class161 {
   static class275 archive12;
   static class397[] field392;

   public static class396[] method804() {
      return new class396[]{class396.field4257, class396.field4255, class396.field4256};
   }

   public static int method800(long var0) {
      return (int)(var0 >>> 0 & 127L);
   }

   static void method802(Player var0, boolean var1) {
      if (var0 != null && var0.method1748() && !var0.field998) {
         var0.field995 = false;
         if ((client.isLowDetailMode && PlayerList.localPlayerCount > 50 || PlayerList.localPlayerCount > 200) && var1 && var0.field1030 == var0.field1050) {
            var0.field995 = true;
         }

         int var3 = var0.x >> 7;
         int var4 = var0.y >> 7;
         if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
            long var5 = class172.method3133(0, 0, 0, false, var0.index);
            if (var0.field981 != null && client.cycle >= var0.field986 && client.cycle < var0.field987) {
               var0.field995 = false;
               var0.field985 = class123.method2216(var0.x, var0.y, class285.plane);
               var0.field1025 = client.cycle;
               class166.field1925.method3503(class285.plane, var0.x, var0.y, var0.field985, 60, var0, var0.field1022, var5, var0.field978, var0.field993, var0.field994, var0.field989);
            } else {
               if ((var0.x & 127) == 64 && 64 == (var0.y & 127)) {
                  if (client.field502[var3][var4] == client.field505) {
                     return;
                  }

                  client.field502[var3][var4] = client.field505;
               }

               var0.field985 = class123.method2216(var0.x, var0.y, class285.plane);
               var0.field1025 = client.cycle;
               class166.field1925.method3508(class285.plane, var0.x, var0.y, var0.field985, 60, var0, var0.field1022, var5, var0.field1023);
            }
         }
      }

   }

   static void method803(int var0, int var1, int var2, int var3) {
      Interface var5 = class50.method1394(var0, var1);
      if (var5 != null && null != var5.field2974) {
         ScriptEvent var6 = new ScriptEvent();
         var6.field961 = var5;
         var6.args = var5.field2974;
         UserComparator10.runScriptEvent(var6);
      }

      client.field565 = var3;
      client.field563 = true;
      class25.field185 = var0;
      client.field564 = var1;
      class208.field2474 = var2;
      class81.invalidateComponent(var5);
   }

   static final void changeGameOptions(int var0) {
      class108.method2105();
      class142.method2389();
      int var2 = class49.method1383(var0).field1528;
      if (0 != var2) {
         int var3 = Varps.main[var0];
         if (1 == var2) {
            if (var3 == 1) {
               class96.method2064(0.9D);
            }

            if (var3 == 2) {
               class96.method2064(0.8D);
            }

            if (3 == var3) {
               class96.method2064(0.7D);
            }

            if (4 == var3) {
               class96.method2064(0.6D);
            }
         }

         if (var2 == 3) {
            if (0 == var3) {
               class130.method2259(255);
            }

            if (var3 == 1) {
               class130.method2259(192);
            }

            if (2 == var3) {
               class130.method2259(128);
            }

            if (var3 == 3) {
               class130.method2259(64);
            }

            if (4 == var3) {
               class130.method2259(0);
            }
         }

         if (4 == var2) {
            if (0 == var3) {
               class99.method2073(127);
            }

            if (var3 == 1) {
               class99.method2073(96);
            }

            if (var3 == 2) {
               class99.method2073(64);
            }

            if (3 == var3) {
               class99.method2073(32);
            }

            if (4 == var3) {
               class99.method2073(0);
            }
         }

         if (var2 == 5) {
            client.field528 = var3;
         }

         if (6 == var2) {
            client.field572 = var3;
         }

         if (var2 == 9) {
            client.field655 = var3;
         }

         if (10 == var2) {
            if (0 == var3) {
               class17.method140(127);
            }

            if (var3 == 1) {
               class17.method140(96);
            }

            if (var3 == 2) {
               class17.method140(64);
            }

            if (var3 == 3) {
               class17.method140(32);
            }

            if (4 == var3) {
               class17.method140(0);
            }
         }

         if (var2 == 17) {
            client.field510 = var3 & '\uffff';
         }

         if (18 == var2) {
            client.field459 = (class81)class251.enumeratedValueOf(class292.method4643(), var3);
            if (null == client.field459) {
               client.field459 = class81.field1154;
            }
         }

         if (19 == var2) {
            if (var3 == -1) {
               client.field535 = -1;
            } else {
               client.field535 = var3 & 2047;
            }
         }

         if (var2 == 22) {
            client.field433 = (class81)class251.enumeratedValueOf(class292.method4643(), var3);
            if (client.field433 == null) {
               client.field433 = class81.field1154;
            }
         }

      }
   }

   ApproximateRouteStrategy() {
   }

   protected boolean method2844(int var1, int var2, int var3, class160 var4) {
      return super.field1894 == var2 && super.field1892 == var3;
   }
}
