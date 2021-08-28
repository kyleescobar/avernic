import java.util.HashMap;

public class class291 {
   static int field3679;

   static {
      new HashMap();
   }

   static boolean method4622(class277 var0, int var1, int var2) {
      byte[] var4 = var0.method4412(var1, var2);
      if (var4 == null) {
         return false;
      } else {
         class204.method3698(var4);
         return true;
      }
   }

   static final void method4625(class148 var0, int var1, int var2, int var3) {
      if (client.field545 < 400) {
         if (null != var0.field1646) {
            var0 = var0.method2471();
         }

         if (var0 != null) {
            if (var0.field1649) {
               if (!var0.field1651 || var1 == client.field510) {
                  String var5 = var0.field1620;
                  int var8;
                  int var9;
                  if (0 != var0.field1616) {
                     var8 = var0.field1616;
                     var9 = MouseHandler.localPlayer.field991;
                     int var10 = var9 - var8;
                     String var7;
                     if (var10 < -9) {
                        var7 = class44.method770(16711680);
                     } else if (var10 < -6) {
                        var7 = class44.method770(16723968);
                     } else if (var10 < -3) {
                        var7 = class44.method770(16740352);
                     } else if (var10 < 0) {
                        var7 = class44.method770(16756736);
                     } else if (var10 > 9) {
                        var7 = class44.method770(65280);
                     } else if (var10 > 6) {
                        var7 = class44.method770(4259584);
                     } else if (var10 > 3) {
                        var7 = class44.method770(8453888);
                     } else if (var10 > 0) {
                        var7 = class44.method770(12648192);
                     } else {
                        var7 = class44.method770(16776960);
                     }

                     var5 = var5 + var7 + " " + class79.field1141 + class270.field3386 + var0.field1616 + class79.field1139;
                  }

                  if (var0.field1651 && client.field408) {
                     class8.method38(class270.field3381, class44.method770(16776960) + var5, 1003, var1, var2, var3);
                  }

                  if (1 == client.field561) {
                     class8.method38(class270.field3380, client.field530 + " " + class79.field1143 + " " + class44.method770(16776960) + var5, 7, var1, var2, var3);
                  } else if (client.field563) {
                     if ((class208.field2474 & 2) == 2) {
                        class8.method38(client.field566, client.field466 + " " + class79.field1143 + " " + class44.method770(16776960) + var5, 8, var1, var2, var3);
                     }
                  } else {
                     int var6 = var0.field1651 && client.field408 ? 2000 : 0;
                     String[] var12 = var0.field1636;
                     if (var12 != null) {
                        for(var8 = 4; var8 >= 0; --var8) {
                           if (var12[var8] != null && !var12[var8].equalsIgnoreCase(class270.field3382)) {
                              var9 = 0;
                              if (var8 == 0) {
                                 var9 = var6 + 9;
                              }

                              if (1 == var8) {
                                 var9 = var6 + 10;
                              }

                              if (var8 == 2) {
                                 var9 = 11 + var6;
                              }

                              if (3 == var8) {
                                 var9 = var6 + 12;
                              }

                              if (4 == var8) {
                                 var9 = 13 + var6;
                              }

                              class8.method38(var12[var8], class44.method770(16776960) + var5, var9, var1, var2, var3);
                           }
                        }
                     }

                     if (null != var12) {
                        for(var8 = 4; var8 >= 0; --var8) {
                           if (var12[var8] != null && var12[var8].equalsIgnoreCase(class270.field3382)) {
                              short var11 = 0;
                              if (class81.field1160 != client.field433) {
                                 if (client.field433 == class81.field1156 || class81.field1154 == client.field433 && var0.field1616 > MouseHandler.localPlayer.field991) {
                                    var11 = 2000;
                                 }

                                 var9 = 0;
                                 if (0 == var8) {
                                    var9 = var11 + 9;
                                 }

                                 if (var8 == 1) {
                                    var9 = var11 + 10;
                                 }

                                 if (var8 == 2) {
                                    var9 = 11 + var11;
                                 }

                                 if (var8 == 3) {
                                    var9 = 12 + var11;
                                 }

                                 if (4 == var8) {
                                    var9 = var11 + 13;
                                 }

                                 class8.method38(var12[var8], class44.method770(16776960) + var5, var9, var1, var2, var3);
                              }
                           }
                        }
                     }

                     if (!var0.field1651 || !client.field408) {
                        class8.method38(class270.field3381, class44.method770(16776960) + var5, 1003, var1, var2, var3);
                     }
                  }

               }
            }
         }
      }
   }
}
