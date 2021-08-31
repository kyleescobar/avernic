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
      if (var4 < client.field685) {
         for(var5 = var4; var5 < client.field685; ++var5) {
            client.field628[++client.field529 - 1] = client.field450[var5];
         }
      }

      if (var4 > client.field685) {
         throw new RuntimeException("");
      } else {
         client.field685 = 0;

         int var6;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         for(var5 = 0; var5 < var4; ++var5) {
            var6 = client.field450[var5];
            class78 var7 = client.field567[var6];
            var8 = var3.readBits(1);
            if (var8 == 0) {
               client.field450[++client.field685 - 1] = var6;
               var7.field1070 = client.field452;
            } else {
               var9 = var3.readBits(2);
               if (var9 == 0) {
                  client.field450[++client.field685 - 1] = var6;
                  var7.field1070 = client.field452;
                  client.field475[++client.field501 - 1] = var6;
               } else if (1 == var9) {
                  client.field450[++client.field685 - 1] = var6;
                  var7.field1070 = client.field452;
                  var10 = var3.readBits(3);
                  var7.method1832(var10, (byte)1);
                  var11 = var3.readBits(1);
                  if (var11 == 1) {
                     client.field475[++client.field501 - 1] = var6;
                  }
               } else if (2 == var9) {
                  client.field450[++client.field685 - 1] = var6;
                  var7.field1070 = client.field452;
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

         int var15;
         for(var15 = 0; var15 < client.field501; ++var15) {
            var4 = client.field475[var15];
            class78 var16 = client.field567[var4];
            var6 = var1.readUnsignedByte();
            if ((var6 & 128) != 0) {
               var16.field1063 = var1.method5981();
               var16.field1065 = var1.method5981();
               var16.field1064 = var1.method5980();
               var16.field1066 = var1.method5935();
               var16.field1074 = var1.readUnsignedShortLE() + client.field452;
               var16.field1068 = var1.readUnsignedShort() + client.field452;
               var16.field1051 = var1.readUnsignedShort();
               var16.pathLength = 1;
               var16.field1067 = 0;
               var16.field1063 += var16.pathX[0];
               var16.field1065 += var16.pathY[0];
               var16.field1064 += var16.pathX[0];
               var16.field1066 += var16.pathY[0];
            }

            int var17;
            if (0 != (var6 & 32)) {
               var17 = var1.readUnsignedShort();
               var8 = var1.readUnsignedShortLEADD();
               var9 = var16.x - 64 * (var17 - class281.baseX - class281.baseX);
               var10 = var16.y - 64 * (var8 - class78.baseY - class78.baseY);
               if (var9 != 0 || var10 != 0) {
                  var16.faceDegrees = (int)(Math.atan2((double)var9, (double)var10) * 325.949D) & 2047;
               }
            }

            if (0 != (var6 & 64)) {
               var16.field1132 = class97.method2065(var1.readUnsignedShort());
               var16.field1024 = var16.field1132.field1622;
               var16.field1075 = var16.field1132.field1645;
               var16.field1029 = var16.field1132.field1628;
               var16.field1072 = var16.field1132.field1629;
               var16.field1046 = var16.field1132.field1630;
               var16.field1021 = var16.field1132.field1631;
               var16.field1030 = var16.field1132.field1625;
               var16.field1052 = var16.field1132.field1626;
               var16.field1020 = var16.field1132.field1624;
            }

            if (0 != (var6 & 16)) {
               var17 = var1.readUnsignedShortLEADD();
               if (var17 == 65535) {
                  var17 = -1;
               }

               var8 = var1.readUnsignedByte();
               if (var16.sequence == var17 && -1 != var17) {
                  var9 = class48.method1312(var17).field1876;
                  if (var9 == 1) {
                     var16.field1054 = 0;
                     var16.field1055 = 0;
                     var16.field1056 = var8;
                     var16.field1057 = 0;
                  }

                  if (2 == var9) {
                     var16.field1057 = 0;
                  }
               } else if (var17 == -1 || -1 == var16.sequence || class48.method1312(var17).field1864 >= class48.method1312(var16.sequence).field1864) {
                  var16.sequence = var17;
                  var16.field1054 = 0;
                  var16.field1055 = 0;
                  var16.field1056 = var8;
                  var16.field1057 = 0;
                  var16.field1067 = var16.pathLength;
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
                     var16.method1759(var9, var11, var10, var12, client.field452, var13);
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
                        var16.method1750(var10, client.field452, var11, var12, var13, var14);
                     } else {
                        var16.method1751(var10);
                     }
                  }
               }
            }

            if (0 != (var6 & 4)) {
               var16.overheadText = var1.readStringNullTerminated();
               var16.overheadTextCyclesRemaining = 100;
            }

            if ((var6 & 2) != 0) {
               var16.spotAnimation = var1.readUnsignedShortLE();
               var17 = var1.readIntME();
               var16.field1062 = var17 >> 16;
               var16.field1061 = client.field452 + (var17 & '\uffff');
               var16.field1028 = 0;
               var16.field1060 = 0;
               if (var16.field1061 > client.field452) {
                  var16.field1028 = -1;
               }

               if (65535 == var16.spotAnimation) {
                  var16.spotAnimation = -1;
               }
            }

            if ((var6 & 8) != 0) {
               var16.targetIndex = var1.readUnsignedShort();
               if (65535 == var16.targetIndex) {
                  var16.targetIndex = -1;
               }
            }
         }

         for(var15 = 0; var15 < client.field529; ++var15) {
            var4 = client.field628[var15];
            if (client.field452 != client.field567[var4].field1070) {
               client.field567[var4].field1132 = null;
               client.field567[var4] = null;
            }
         }

         if (var1.offset != client.packetWriter.serverPacketLength) {
            throw new RuntimeException(var1.offset + class79.field1140 + client.packetWriter.serverPacketLength);
         } else {
            for(var15 = 0; var15 < client.field685; ++var15) {
               if (client.field567[client.field450[var15]] == null) {
                  throw new RuntimeException(var15 + class79.field1140 + client.field685);
               }
            }

         }
      }
   }

   static final String method2567(int var0) {
      String var2 = Integer.toString(var0);

      for(int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
         var2 = var2.substring(0, var3) + class79.field1140 + var2.substring(var3);
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
