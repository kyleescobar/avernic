public class class265 {
   static final class265 field3196 = new class265("BUILDLIVE", 3);
   static final class265 field3197 = new class265("RC", 1);
   static final class265 field3198 = new class265("WIP", 2);
   static final class265 field3199 = new class265("LIVE", 0);
   public final int field3200;
   public final String field3202;

   class265(String var1, int var2) {
      this.field3202 = var1;
      this.field3200 = var2;
   }

   static final void method4342(int var0, int var1, int var2, int var3) {
      if (0 == client.field561 && !client.field563) {
         class8.method38(class270.field3385, "", 23, 0, var0 - var2, var1 - var3);
      }

      long var5 = -1L;
      long var7 = -1L;

      int var9;
      for(var9 = 0; var9 < Npc.method1834(); ++var9) {
         long var10 = class208.field2485[var9];
         if (var7 != var10) {
            var7 = var10;
            int var14 = class199.method3496(var9);
            int var15 = class285.method4566(var9);
            int var16 = class267.method4349(class208.field2485[var9]);
            int var18 = class79.method1843(class208.field2485[var9]);
            int var19 = var18;
            if (2 == var16 && class166.field1925.method3527(class285.plane, var14, var15, var10) >= 0) {
               class156 var20 = class124.method2243(var18);
               if (var20.field1762 != null) {
                  var20 = var20.method2638();
               }

               if (var20 == null) {
                  continue;
               }

               if (1 == client.field561) {
                  class8.method38(class270.field3380, client.field530 + " " + class79.field1143 + " " + class44.method770(65535) + var20.field1769, 1, var18, var14, var15);
               } else if (client.field563) {
                  if ((class208.field2474 & 4) == 4) {
                     class8.method38(client.field566, client.field466 + " " + class79.field1143 + " " + class44.method770(65535) + var20.field1769, 2, var18, var14, var15);
                  }
               } else {
                  String[] var21 = var20.field1783;
                  if (null != var21) {
                     for(int var22 = 4; var22 >= 0; --var22) {
                        if (var21[var22] != null) {
                           short var23 = 0;
                           if (var22 == 0) {
                              var23 = 3;
                           }

                           if (1 == var22) {
                              var23 = 4;
                           }

                           if (var22 == 2) {
                              var23 = 5;
                           }

                           if (var22 == 3) {
                              var23 = 6;
                           }

                           if (var22 == 4) {
                              var23 = 1001;
                           }

                           class8.method38(var21[var22], class44.method770(65535) + var20.field1769, var23, var19, var14, var15);
                        }
                     }
                  }

                  class8.method38(class270.field3381, class44.method770(65535) + var20.field1769, 1002, var20.field1753, var14, var15);
               }
            }

            Player var24;
            int var29;
            Npc var31;
            int[] var32;
            int var36;
            if (1 == var16) {
               Npc var27 = client.npcs[var19];
               if (null == var27) {
                  continue;
               }

               if (var27.definition.size == 1 && (var27.x & 127) == 64 && 64 == (var27.y & 127)) {
                  for(var29 = 0; var29 < client.npcCount; ++var29) {
                     var31 = client.npcs[client.npcIndexes[var29]];
                     if (null != var31 && var31 != var27 && var31.definition.size == 1 && var31.x == var27.x && var27.y == var31.y) {
                        class291.method4625(var31.definition, client.npcIndexes[var29], var14, var15);
                     }
                  }

                  var29 = PlayerList.localPlayerCount;
                  var32 = PlayerList.localPlayerIndexes;

                  for(var36 = 0; var36 < var29; ++var36) {
                     var24 = client.localPlayers[var32[var36]];
                     if (var24 != null && var27.x == var24.x && var24.y == var27.y) {
                        class2.method6(var24, var32[var36], var14, var15);
                     }
                  }
               }

               class291.method4625(var27.definition, var19, var14, var15);
            }

            if (0 == var16) {
               Player var28 = client.localPlayers[var19];
               if (null == var28) {
                  continue;
               }

               if (64 == (var28.x & 127) && (var28.y & 127) == 64) {
                  for(var29 = 0; var29 < client.npcCount; ++var29) {
                     var31 = client.npcs[client.npcIndexes[var29]];
                     if (var31 != null && var31.definition.size == 1 && var31.x == var28.x && var28.y == var31.y) {
                        class291.method4625(var31.definition, client.npcIndexes[var29], var14, var15);
                     }
                  }

                  var29 = PlayerList.localPlayerCount;
                  var32 = PlayerList.localPlayerIndexes;

                  for(var36 = 0; var36 < var29; ++var36) {
                     var24 = client.localPlayers[var32[var36]];
                     if (null != var24 && var24 != var28 && var28.x == var24.x && var28.y == var24.y) {
                        class2.method6(var24, var32[var36], var14, var15);
                     }
                  }
               }

               if (client.field535 != var19) {
                  class2.method6(var28, var19, var14, var15);
               } else {
                  var5 = var10;
               }
            }

            if (3 == var16) {
               class296 var30 = client.field536[class285.plane][var14][var15];
               if (null != var30) {
                  for(class82 var33 = (class82)var30.method4694(); null != var33; var33 = (class82)var30.method4679()) {
                     class157 var34 = KeyHandler.method93(var33.field1167);
                     if (client.field561 == 1) {
                        class8.method38(class270.field3380, client.field530 + " " + class79.field1143 + " " + class44.method770(16748608) + var34.field1836, 16, var33.field1167, var14, var15);
                     } else if (client.field563) {
                        if ((class208.field2474 & 1) == 1) {
                           class8.method38(client.field566, client.field466 + " " + class79.field1143 + " " + class44.method770(16748608) + var34.field1836, 17, var33.field1167, var14, var15);
                        }
                     } else {
                        String[] var37 = var34.field1809;

                        for(int var35 = 4; var35 >= 0; --var35) {
                           if (var37 != null && null != var37[var35]) {
                              byte var25 = 0;
                              if (0 == var35) {
                                 var25 = 18;
                              }

                              if (var35 == 1) {
                                 var25 = 19;
                              }

                              if (2 == var35) {
                                 var25 = 20;
                              }

                              if (3 == var35) {
                                 var25 = 21;
                              }

                              if (4 == var35) {
                                 var25 = 22;
                              }

                              class8.method38(var37[var35], class44.method770(16748608) + var34.field1836, var25, var33.field1167, var14, var15);
                           } else if (2 == var35) {
                              class8.method38(class270.field3227, class44.method770(16748608) + var34.field1836, 20, var33.field1167, var14, var15);
                           }
                        }

                        class8.method38(class270.field3381, class44.method770(16748608) + var34.field1836, 1004, var33.field1167, var14, var15);
                     }
                  }
               }
            }
         }
      }

      if (var5 != -1L) {
         var9 = ApproximateRouteStrategy.method800(var5);
         int var26 = class80.method1861(var5);
         Player var11 = client.localPlayers[client.field535];
         class2.method6(var11, client.field535, var9, var26);
      }

   }
}
