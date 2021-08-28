public abstract class class201 extends class349 {
   public int field2346 = 1000;

   protected class201() {
   }

   void method3686(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
      class207 var11 = this.method3687();
      if (var11 != null) {
         this.field2346 = var11.field2346;
         var11.method3686(var1, var2, var3, var4, var5, var6, var7, var8, var9);
      }

   }

   protected class207 method3687() {
      return null;
   }

   static void method3690(PacketBuffer var0, int var1) {
      boolean var3 = var0.readBits(1) == 1;
      if (var3) {
         PlayerList.pendingUpdateIndexes[++PlayerList.pendingUpdateCount - 1] = var1;
      }

      int var4 = var0.readBits(2);
      Player var5 = client.localPlayers[var1];
      if (0 == var4) {
         if (var3) {
            var5.field1004 = false;
         } else if (var1 == client.localPlayerIndex) {
            throw new RuntimeException();
         } else {
            PlayerList.localPlayerRegions[var1] = (class281.baseX + var5.pathX[0] >> 13 << 14) + (var5.plane << 28) + (var5.pathY[0] + class78.baseY >> 13);
            if (-1 != var5.field1049) {
               PlayerList.localPlayerOrientations[var1] = var5.field1049;
            } else {
               PlayerList.localPlayerOrientations[var1] = var5.orientation;
            }

            PlayerList.localPlayerTargetIndexes[var1] = var5.targetIndex;
            client.localPlayers[var1] = null;
            if (var0.readBits(1) != 0) {
               class103.method2081(var0, var1);
            }

         }
      } else {
         int var6;
         int var7;
         int var8;
         if (1 == var4) {
            var6 = var0.readBits(3);
            var7 = var5.pathX[0];
            var8 = var5.pathY[0];
            if (var6 == 0) {
               --var7;
               --var8;
            } else if (var6 == 1) {
               --var8;
            } else if (var6 == 2) {
               ++var7;
               --var8;
            } else if (var6 == 3) {
               --var7;
            } else if (var6 == 4) {
               ++var7;
            } else if (5 == var6) {
               --var7;
               ++var8;
            } else if (var6 == 6) {
               ++var8;
            } else if (var6 == 7) {
               ++var7;
               ++var8;
            }

            if (client.localPlayerIndex != var1 || var5.x >= 1536 && var5.y >= 1536 && var5.x < 11776 && var5.y < 11776) {
               if (var3) {
                  var5.field1004 = true;
                  var5.tileX = var7;
                  var5.tileY = var8;
               } else {
                  var5.field1004 = false;
                  var5.pathfindClientSideApproximate(var7, var8, PlayerList.movementDirectionCache[var1]);
               }
            } else {
               var5.resetPath(var7, var8);
               var5.field1004 = false;
            }

         } else if (2 == var4) {
            var6 = var0.readBits(4);
            var7 = var5.pathX[0];
            var8 = var5.pathY[0];
            if (0 == var6) {
               var7 -= 2;
               var8 -= 2;
            } else if (1 == var6) {
               --var7;
               var8 -= 2;
            } else if (2 == var6) {
               var8 -= 2;
            } else if (3 == var6) {
               ++var7;
               var8 -= 2;
            } else if (var6 == 4) {
               var7 += 2;
               var8 -= 2;
            } else if (var6 == 5) {
               var7 -= 2;
               --var8;
            } else if (var6 == 6) {
               var7 += 2;
               --var8;
            } else if (var6 == 7) {
               var7 -= 2;
            } else if (var6 == 8) {
               var7 += 2;
            } else if (9 == var6) {
               var7 -= 2;
               ++var8;
            } else if (var6 == 10) {
               var7 += 2;
               ++var8;
            } else if (11 == var6) {
               var7 -= 2;
               var8 += 2;
            } else if (12 == var6) {
               --var7;
               var8 += 2;
            } else if (var6 == 13) {
               var8 += 2;
            } else if (var6 == 14) {
               ++var7;
               var8 += 2;
            } else if (15 == var6) {
               var7 += 2;
               var8 += 2;
            }

            if (client.localPlayerIndex == var1 && (var5.x < 1536 || var5.y < 1536 || var5.x >= 11776 || var5.y >= 11776)) {
               var5.resetPath(var7, var8);
               var5.field1004 = false;
            } else if (var3) {
               var5.field1004 = true;
               var5.tileX = var7;
               var5.tileY = var8;
            } else {
               var5.field1004 = false;
               var5.pathfindClientSideApproximate(var7, var8, PlayerList.movementDirectionCache[var1]);
            }

         } else {
            var6 = var0.readBits(1);
            int var9;
            int var10;
            int var11;
            int var12;
            if (0 == var6) {
               var7 = var0.readBits(12);
               var8 = var7 >> 10;
               var9 = var7 >> 5 & 31;
               if (var9 > 15) {
                  var9 -= 32;
               }

               var10 = var7 & 31;
               if (var10 > 15) {
                  var10 -= 32;
               }

               var11 = var9 + var5.pathX[0];
               var12 = var5.pathY[0] + var10;
               if (var1 != client.localPlayerIndex || var5.x >= 1536 && var5.y >= 1536 && var5.x < 11776 && var5.y < 11776) {
                  if (var3) {
                     var5.field1004 = true;
                     var5.tileX = var11;
                     var5.tileY = var12;
                  } else {
                     var5.field1004 = false;
                     var5.pathfindClientSideApproximate(var11, var12, PlayerList.movementDirectionCache[var1]);
                  }
               } else {
                  var5.resetPath(var11, var12);
                  var5.field1004 = false;
               }

               var5.plane = (byte)(var8 + var5.plane & 3);
               if (client.localPlayerIndex == var1) {
                  class285.plane = var5.plane;
               }

            } else {
               var7 = var0.readBits(30);
               var8 = var7 >> 28;
               var9 = var7 >> 14 & 16383;
               var10 = var7 & 16383;
               var11 = (class281.baseX + var5.pathX[0] + var9 & 16383) - class281.baseX;
               var12 = (var10 + class78.baseY + var5.pathY[0] & 16383) - class78.baseY;
               if (var1 != client.localPlayerIndex || var5.x >= 1536 && var5.y >= 1536 && var5.x < 11776 && var5.y < 11776) {
                  if (var3) {
                     var5.field1004 = true;
                     var5.tileX = var11;
                     var5.tileY = var12;
                  } else {
                     var5.field1004 = false;
                     var5.pathfindClientSideApproximate(var11, var12, PlayerList.movementDirectionCache[var1]);
                  }
               } else {
                  var5.resetPath(var11, var12);
                  var5.field1004 = false;
               }

               var5.plane = (byte)(var5.plane + var8 & 3);
               if (client.localPlayerIndex == var1) {
                  class285.plane = var5.plane;
               }

            }
         }
      }
   }

   static final void method3685(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) {
         if (client.isLowDetailMode && class285.plane != var0) {
            return;
         }

         long var8 = 0L;
         boolean var10 = true;
         boolean var11 = false;
         boolean var12 = false;
         if (0 == var1) {
            var8 = class166.field1925.method3523(var0, var2, var3);
         }

         if (var1 == 1) {
            var8 = class166.field1925.method3524(var0, var2, var3);
         }

         if (2 == var1) {
            var8 = class166.field1925.method3525(var0, var2, var3);
         }

         if (3 == var1) {
            var8 = class166.field1925.method3628(var0, var2, var3);
         }

         int var13;
         if (0L != var8) {
            var13 = class166.field1925.method3527(var0, var2, var3, var8);
            int var15 = class79.method1843(var8);
            int var16 = var13 & 31;
            int var17 = var13 >> 6 & 3;
            class156 var14;
            if (0 == var1) {
               class166.field1925.method3514(var0, var2, var3);
               var14 = class124.method2243(var15);
               if (0 != var14.field1752) {
                  client.field465[var0].method2814(var2, var3, var16, var17, var14.field1779);
               }
            }

            if (1 == var1) {
               class166.field1925.method3515(var0, var2, var3);
            }

            if (var1 == 2) {
               class166.field1925.method3551(var0, var2, var3);
               var14 = class124.method2243(var15);
               if (var14.field1750 + var2 > 103 || var14.field1750 + var3 > 103 || var14.field1751 + var2 > 103 || var3 + var14.field1751 > 103) {
                  return;
               }

               if (0 != var14.field1752) {
                  client.field465[var0].method2832(var2, var3, var14.field1750, var14.field1751, var17, var14.field1779);
               }
            }

            if (var1 == 3) {
               class166.field1925.method3517(var0, var2, var3);
               var14 = class124.method2243(var15);
               if (var14.field1752 == 1) {
                  client.field465[var0].method2838(var2, var3);
               }
            }
         }

         if (var4 >= 0) {
            var13 = var0;
            if (var0 < 3 && 2 == (class62.field901[1][var2][var3] & 2)) {
               var13 = var0 + 1;
            }

            class13.method105(var0, var13, var2, var3, var4, var5, var6, class166.field1925, client.field465[var0]);
         }
      }

   }
}
