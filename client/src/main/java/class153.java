public class class153 extends class349 {
   public static class223 field1697 = new class223(64);
   static class277 field1698;
   boolean field1699 = true;
   char field1700;
   public int field1696;
   public String field1701;

   class153() {
   }

   void method2547() {
   }

   void method2545(Buffer var1) {
      while(true) {
         int var3 = var1.readUnsignedByte();
         if (var3 == 0) {
            return;
         }

         this.method2553(var1, var3);
      }
   }

   void method2553(Buffer var1, int var2) {
      if (var2 == 1) {
         byte var5 = var1.readByte();
         int var6 = var5 & 255;
         if (var6 == 0) {
            throw new IllegalArgumentException("" + Integer.toString(var6, 16));
         }

         if (var6 >= 128 && var6 < 160) {
            char var7 = class304.field3755[var6 - 128];
            if (0 == var7) {
               var7 = '?';
            }

            var6 = var7;
         }

         char var4 = (char)var6;
         this.field1700 = var4;
      } else if (2 == var2) {
         this.field1696 = var1.readInt();
      } else if (4 == var2) {
         this.field1699 = false;
      } else if (var2 == 5) {
         this.field1701 = var1.readStringNullTerminated();
      }

   }

   public boolean method2548() {
      return this.field1700 == 's';
   }

   static final int method2563(int var0, int var1) {
      int var3 = 57 * var1 + var0;
      var3 ^= var3 << 13;
      int var4 = var3 * (var3 * var3 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
      return var4 >> 19 & 255;
   }

   static void method2564(class159 var0, int var1, int var2, int var3) {
      if (client.field498 < 50 && class38.clientPreferences.field1116 != 0) {
         if (null != var0.field1866 && var1 < var0.field1866.length) {
            int var5 = var0.field1866[var1];
            if (var5 != 0) {
               int var6 = var5 >> 8;
               int var7 = var5 >> 4 & 7;
               int var8 = var5 & 15;
               client.field629[client.field498] = var6;
               client.field651[client.field498] = var7;
               client.field652[client.field498] = 0;
               client.field654[client.field498] = null;
               int var9 = (var2 - 64) / 128;
               int var10 = (var3 - 64) / 128;
               client.field653[client.field498] = (var9 << 16) + (var10 << 8) + var8;
               ++client.field498;
            }
         }
      }
   }

   static void performPlayerAnimation(Player var0, int var1, int var2) {
      if (var1 == var0.sequence && var1 != -1) {
         int var4 = class48.method1312(var1).field1876;
         if (var4 == 1) {
            var0.field1054 = 0;
            var0.field1055 = 0;
            var0.field1056 = var2;
            var0.field1057 = 0;
         }

         if (var4 == 2) {
            var0.field1057 = 0;
         }
      } else if (-1 == var1 || var0.sequence == -1 || class48.method1312(var1).field1864 >= class48.method1312(var0.sequence).field1864) {
         var0.sequence = var1;
         var0.field1054 = 0;
         var0.field1055 = 0;
         var0.field1056 = var2;
         var0.field1057 = 0;
         var0.field1067 = var0.pathLength;
      }

   }

   static final void method2544(boolean var0, PacketBuffer var1) {
      client.field529 = 0;
      client.field501 = 0;
      PacketBuffer var3 = client.packetWriter.field1201;
      var3.switchToBitAccess();
      int var4 = var3.readBits(8);
      int var5;
      if (var4 < client.npcCount) {
         for(var5 = var4; var5 < client.npcCount; ++var5) {
            client.field628[++client.field529 - 1] = client.npcIndexes[var5];
         }
      }

      if (var4 > client.npcCount) {
         throw new RuntimeException("");
      } else {
         client.npcCount = 0;

         int var6;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         for(var5 = 0; var5 < var4; ++var5) {
            var6 = client.npcIndexes[var5];
            Npc var7 = client.npcs[var6];
            var8 = var3.readBits(1);
            if (var8 == 0) {
               client.npcIndexes[++client.npcCount - 1] = var6;
               var7.npcCycle = client.cycle;
            } else {
               var9 = var3.readBits(2);
               if (var9 == 0) {
                  client.npcIndexes[++client.npcCount - 1] = var6;
                  var7.npcCycle = client.cycle;
                  client.field475[++client.field501 - 1] = var6;
               } else if (1 == var9) {
                  client.npcIndexes[++client.npcCount - 1] = var6;
                  var7.npcCycle = client.cycle;
                  var10 = var3.readBits(3);
                  var7.method1832(var10, (byte)1);
                  var11 = var3.readBits(1);
                  if (var11 == 1) {
                     client.field475[++client.field501 - 1] = var6;
                  }
               } else if (2 == var9) {
                  client.npcIndexes[++client.npcCount - 1] = var6;
                  var7.npcCycle = client.cycle;
                  var10 = var3.readBits(3);
                  var7.method1832(var10, (byte)2);
                  var11 = var3.readBits(3);
                  var7.method1832(var11, (byte)2);
                  var12 = var3.readBits(1);
                  if (var12 == 1) {
                     client.field475[++client.field501 - 1] = var6;
                  }
               } else if (3 == var9) {
                  client.field628[++client.field529 - 1] = var6;
               }
            }
         }

         class101.method2075(var0, var1);

         int i;
         for(i = 0; i < client.field501; ++i) {
            var4 = client.field475[i];
            Npc npc = client.npcs[var4];
            var6 = var1.readUnsignedByte();
            if ((var6 & 128) != 0) {
               npc.field1063 = var1.readByteNEG();
               npc.field1065 = var1.readByteNEG();
               npc.field1064 = var1.method5980();
               npc.field1066 = var1.method5935();
               npc.field1074 = var1.readUnsignedShortLE() + client.cycle;
               npc.field1068 = var1.readUnsignedShort() + client.cycle;
               npc.field1051 = var1.readUnsignedShort();
               npc.pathLength = 1;
               npc.field1067 = 0;
               npc.field1063 += npc.pathX[0];
               npc.field1065 += npc.pathY[0];
               npc.field1064 += npc.pathX[0];
               npc.field1066 += npc.pathY[0];
            }

            int var17;
            if (0 != (var6 & 32)) {
               var17 = var1.readUnsignedShort();
               var8 = var1.readUnsignedShortLEADD();
               var9 = npc.x - 64 * (var17 - class281.baseX - class281.baseX);
               var10 = npc.y - 64 * (var8 - Npc.baseY - Npc.baseY);
               if (var9 != 0 || var10 != 0) {
                  npc.faceDegrees = (int)(Math.atan2((double)var9, (double)var10) * 325.949D) & 2047;
               }
            }

            if (0 != (var6 & 64)) {
               npc.definition = class97.method2065(var1.readUnsignedShort());
               npc.field1024 = npc.definition.field1622;
               npc.field1075 = npc.definition.field1645;
               npc.field1029 = npc.definition.field1628;
               npc.field1072 = npc.definition.field1629;
               npc.field1046 = npc.definition.field1630;
               npc.field1021 = npc.definition.field1631;
               npc.field1030 = npc.definition.field1625;
               npc.field1052 = npc.definition.field1626;
               npc.field1020 = npc.definition.field1624;
            }

            if (0 != (var6 & 16)) {
               var17 = var1.readUnsignedShortLEADD();
               if (var17 == 65535) {
                  var17 = -1;
               }

               var8 = var1.readUnsignedByte();
               if (npc.sequence == var17 && -1 != var17) {
                  var9 = class48.method1312(var17).field1876;
                  if (var9 == 1) {
                     npc.field1054 = 0;
                     npc.field1055 = 0;
                     npc.field1056 = var8;
                     npc.field1057 = 0;
                  }

                  if (2 == var9) {
                     npc.field1057 = 0;
                  }
               } else if (var17 == -1 || -1 == npc.sequence || class48.method1312(var17).field1864 >= class48.method1312(npc.sequence).field1864) {
                  npc.sequence = var17;
                  npc.field1054 = 0;
                  npc.field1055 = 0;
                  npc.field1056 = var8;
                  npc.field1057 = 0;
                  npc.field1067 = npc.pathLength;
               }
            }

            if ((var6 & 1) != 0) {
               var17 = var1.readUnsignedByteADD();
               int var13;
               if (var17 > 0) {
                  for(var8 = 0; var8 < var17; ++var8) {
                     var10 = -1;
                     var11 = -1;
                     var12 = -1;
                     var9 = var1.method5962();
                     if (32767 == var9) {
                        var9 = var1.method5962();
                        var11 = var1.method5962();
                        var10 = var1.method5962();
                        var12 = var1.method5962();
                     } else if (32766 != var9) {
                        var11 = var1.method5962();
                     } else {
                        var9 = -1;
                     }

                     var13 = var1.method5962();
                     npc.method1759(var9, var11, var10, var12, client.cycle, var13);
                  }
               }

               var8 = var1.readUnsignedByteNEG();
               if (var8 > 0) {
                  for(var9 = 0; var9 < var8; ++var9) {
                     var10 = var1.method5962();
                     var11 = var1.method5962();
                     if (var11 != 32767) {
                        var12 = var1.method5962();
                        var13 = var1.readUnsignedByteNEG();
                        int var14 = var11 > 0 ? var1.readUnsignedByte() : var13;
                        npc.method1750(var10, client.cycle, var11, var12, var13, var14);
                     } else {
                        npc.method1751(var10);
                     }
                  }
               }
            }

            if (0 != (var6 & 4)) {
               npc.overheadText = var1.readStringNullTerminated();
               npc.overheadTextCyclesRemaining = 100;
            }

            if ((var6 & 2) != 0) {
               npc.spotAnimation = var1.readUnsignedShortLE();
               var17 = var1.readIntME();
               npc.field1062 = var17 >> 16;
               npc.field1061 = client.cycle + (var17 & '\uffff');
               npc.field1028 = 0;
               npc.field1060 = 0;
               if (npc.field1061 > client.cycle) {
                  npc.field1028 = -1;
               }

               if (65535 == npc.spotAnimation) {
                  npc.spotAnimation = -1;
               }
            }

            if ((var6 & 8) != 0) {
               npc.targetIndex = var1.readUnsignedShort();
               if (65535 == npc.targetIndex) {
                  npc.targetIndex = -1;
               }
            }
         }

         for(i = 0; i < client.field529; ++i) {
            var4 = client.field628[i];
            if (client.cycle != client.npcs[var4].npcCycle) {
               client.npcs[var4].definition = null;
               client.npcs[var4] = null;
            }
         }

         if (var1.offset != client.packetWriter.serverPacketLength) {
            throw new RuntimeException(var1.offset + class79.SYMBOL_COMMA + client.packetWriter.serverPacketLength);
         } else {
            for(i = 0; i < client.npcCount; ++i) {
               if (client.npcs[client.npcIndexes[i]] == null) {
                  throw new RuntimeException(i + class79.SYMBOL_COMMA + client.npcCount);
               }
            }

         }
      }
   }

   static final String method2567(int var0) {
      String var2 = Integer.toString(var0);

      for(int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
         var2 = var2.substring(0, var3) + class79.SYMBOL_COMMA + var2.substring(var3);
      }

      if (var2.length() > 9) {
         return " " + class44.method770(65408) + var2.substring(0, var2.length() - 8) + class270.field3246 + " " + class79.field1141 + var2 + class79.field1139 + class79.field1145;
      } else {
         return var2.length() > 6 ? " " + class44.method770(16777215) + var2.substring(0, var2.length() - 4) + class270.field3393 + " " + class79.field1141 + var2 + class79.field1139 + class79.field1145 : " " + class44.method770(16776960) + var2 + class79.field1145;
      }
   }

   static final void method2549() {
      for(int var1 = 0; var1 < PlayerList.localPlayerCount; ++var1) {
         Player var2 = client.localPlayers[PlayerList.localPlayerIndexes[var1]];
         var2.method1705();
      }

   }
}
