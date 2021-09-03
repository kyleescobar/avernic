public class ParamComposition extends class349 {
   public static class223 field1697 = new class223(64);
   static class277 field1698;
   boolean field1699 = true;
   char field1700;
   public int field1696;
   public String field1701;

   ParamComposition() {
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
      if (var1 == var0.animation && var1 != -1) {
         int var4 = class48.method1312(var1).field1876;
         if (var4 == 1) {
            var0.animationFrame = 0;
            var0.animationCycle = 0;
            var0.animationDelay = var2;
            var0.field1057 = 0;
         }

         if (var4 == 2) {
            var0.field1057 = 0;
         }
      } else if (-1 == var1 || var0.animation == -1 || class48.method1312(var1).field1864 >= class48.method1312(var0.animation).field1864) {
         var0.animation = var1;
         var0.animationFrame = 0;
         var0.animationCycle = 0;
         var0.animationDelay = var2;
         var0.field1057 = 0;
         var0.field1067 = var0.pathLength;
      }

   }

   static final void updateNpcs(boolean var0, PacketBuffer buf) {
      client.pendingNpcTeleportsCount = 0;
      client.pendingNpcUpdateCount = 0;
      PacketBuffer packetBuf = client.packetWriter.packetBuffer;
      packetBuf.switchToBitAccess();
      int npcCount = packetBuf.readBits(8);
      int npcIndex;
      if (npcCount < client.npcCount) {
         for(npcIndex = npcCount; npcIndex < client.npcCount; ++npcIndex) {
            client.pendingNpcTeleports[++client.pendingNpcTeleportsCount - 1] = client.npcIndexes[npcIndex];
         }
      }

      if (npcCount > client.npcCount) {
         throw new RuntimeException("");
      } else {
         client.npcCount = 0;

         int mask;
         int requireUpdate;
         int movementType;
         int walkDirectionType;
         int shouldProcessNpcUpdateFlags;
         int var12;
         for(npcIndex = 0; npcIndex < npcCount; ++npcIndex) {
            mask = client.npcIndexes[npcIndex];
            Npc npc = client.npcs[mask];
            requireUpdate = packetBuf.readBits(1);
            if (requireUpdate == 0) {
               client.npcIndexes[++client.npcCount - 1] = mask;
               npc.npcCycle = client.cycle;
            } else {
               movementType = packetBuf.readBits(2);
               if (movementType == 0) {
                  client.npcIndexes[++client.npcCount - 1] = mask;
                  npc.npcCycle = client.cycle;
                  client.pendingNpcUpdateIndexes[++client.pendingNpcUpdateCount - 1] = mask;
               } else if (1 == movementType) {
                  client.npcIndexes[++client.npcCount - 1] = mask;
                  npc.npcCycle = client.cycle;
                  walkDirectionType = packetBuf.readBits(3);
                  npc.translateTile(walkDirectionType, (byte)1);
                  shouldProcessNpcUpdateFlags = packetBuf.readBits(1);
                  if (shouldProcessNpcUpdateFlags == 1) {
                     client.pendingNpcUpdateIndexes[++client.pendingNpcUpdateCount - 1] = mask;
                  }
               } else if (2 == movementType) {
                  client.npcIndexes[++client.npcCount - 1] = mask;
                  npc.npcCycle = client.cycle;
                  walkDirectionType = packetBuf.readBits(3); // FIRST RUN STEP
                  npc.translateTile(walkDirectionType, (byte)2);
                  shouldProcessNpcUpdateFlags = packetBuf.readBits(3); // SECOND RUN STEP
                  npc.translateTile(shouldProcessNpcUpdateFlags, (byte)2);
                  var12 = packetBuf.readBits(1); // SHOULD PROCESS NPC UPDATE FLAGS
                  if (var12 == 1) {
                     client.pendingNpcUpdateIndexes[++client.pendingNpcUpdateCount - 1] = mask;
                  }
               } else if (3 == movementType) {
                  client.pendingNpcTeleports[++client.pendingNpcTeleportsCount - 1] = mask;
               }
            }
         }

         class101.method2075(var0, buf);

         int i;
         for(i = 0; i < client.pendingNpcUpdateCount; ++i) {
            npcCount = client.pendingNpcUpdateIndexes[i];
            Npc npc = client.npcs[npcCount];
            mask = buf.readUnsignedByte();
            if ((mask & 128) != 0) {
               npc.field1063 = buf.readByteNEG();
               npc.field1065 = buf.readByteNEG();
               npc.field1064 = buf.method5980();
               npc.field1066 = buf.method5935();
               npc.field1074 = buf.readUnsignedShortLE() + client.cycle;
               npc.field1068 = buf.readUnsignedShort() + client.cycle;
               npc.field1051 = buf.readUnsignedShort();
               npc.pathLength = 1;
               npc.field1067 = 0;
               npc.field1063 += npc.pathX[0];
               npc.field1065 += npc.pathY[0];
               npc.field1064 += npc.pathX[0];
               npc.field1066 += npc.pathY[0];
            }

            int animation;

            /*
             * 0: FACE_TILE (mask: 0x20)
             */
            if (0 != (mask & 32)) {
               animation = buf.readUnsignedShort();
               requireUpdate = buf.readUnsignedShortLEADD();
               movementType = npc.x - 64 * (animation - class281.baseX - class281.baseX);
               walkDirectionType = npc.y - 64 * (requireUpdate - Npc.baseY - Npc.baseY);
               if (movementType != 0 || walkDirectionType != 0) {
                  npc.faceDegrees = (int)(Math.atan2((double)movementType, (double)walkDirectionType) * 325.949D) & 2047;
               }
            }

            /*
             * 1: TRANSFORM (mask: 0x40)
             */
            if (0 != (mask & 64)) {
               npc.definition = class97.getNpcDefinition(buf.readUnsignedShort());
               npc.size = npc.definition.size;
               npc.rotation = npc.definition.rotation;
               npc.walkForwardAnimation = npc.definition.walkForwardAnimation;
               npc.walkBackAnimation = npc.definition.walkBackAnimation;
               npc.walkLeftAnimation = npc.definition.walkLeftAnimation;
               npc.walkRightAnimation = npc.definition.walkRightAnimation;
               npc.stanceAnimation = npc.definition.stanceAnimation;
               npc.turnLeftAnimation = npc.definition.turnLeftAnimation;
               npc.turnRightAnimation = npc.definition.turnRightAnimation;
            }

            /*
             * 2: ANIMATION (mask: 0x10)
             */
            if (0 != (mask & 16)) {
               animation = buf.readUnsignedShortLEADD(); // Animation ID
               if (animation == 65535) {
                  animation = -1;
               }

               requireUpdate = buf.readUnsignedByte(); // Animation Delay
               if (npc.animation == animation && -1 != animation) {
                  movementType = class48.method1312(animation).field1876;
                  if (movementType == 1) {
                     npc.animationFrame = 0;
                     npc.animationCycle = 0;
                     npc.animationDelay = requireUpdate;
                     npc.field1057 = 0;
                  }

                  if (2 == movementType) {
                     npc.field1057 = 0;
                  }
               } else if (animation == -1 || -1 == npc.animation || class48.method1312(animation).field1864 >= class48.method1312(npc.animation).field1864) {
                  npc.animation = animation;
                  npc.animationFrame = 0;
                  npc.animationCycle = 0;
                  npc.animationDelay = requireUpdate;
                  npc.field1057 = 0;
                  npc.field1067 = npc.pathLength;
               }
            }

            /*
             * 3: HITMARK (mask: 0x1)
             */
            if ((mask & 1) != 0) {
               animation = buf.readUnsignedByteADD();
               int var13;
               if (animation > 0) {
                  for(requireUpdate = 0; requireUpdate < animation; ++requireUpdate) {
                     walkDirectionType = -1;
                     shouldProcessNpcUpdateFlags = -1;
                     var12 = -1;
                     movementType = buf.readSmallSmart();
                     if (32767 == movementType) {
                        movementType = buf.readSmallSmart();
                        shouldProcessNpcUpdateFlags = buf.readSmallSmart();
                        walkDirectionType = buf.readSmallSmart();
                        var12 = buf.readSmallSmart();
                     } else if (32766 != movementType) {
                        shouldProcessNpcUpdateFlags = buf.readSmallSmart();
                     } else {
                        movementType = -1;
                     }

                     var13 = buf.readSmallSmart();
                     npc.method1759(movementType, shouldProcessNpcUpdateFlags, walkDirectionType, var12, client.cycle, var13);
                  }
               }

               requireUpdate = buf.readUnsignedByteNEG();
               if (requireUpdate > 0) {
                  for(movementType = 0; movementType < requireUpdate; ++movementType) {
                     walkDirectionType = buf.readSmallSmart();
                     shouldProcessNpcUpdateFlags = buf.readSmallSmart();
                     if (shouldProcessNpcUpdateFlags != 32767) {
                        var12 = buf.readSmallSmart();
                        var13 = buf.readUnsignedByteNEG();
                        int var14 = shouldProcessNpcUpdateFlags > 0 ? buf.readUnsignedByte() : var13;
                        npc.method1750(walkDirectionType, client.cycle, shouldProcessNpcUpdateFlags, var12, var13, var14);
                     } else {
                        npc.method1751(walkDirectionType);
                     }
                  }
               }
            }

            /*
             * 4: FORCE_CHAT (mask: 0x4)
             */
            if (0 != (mask & 4)) {
               npc.overheadText = buf.readStringNullTerminated();
               npc.overheadTextCyclesRemaining = 100;
            }

            /*
             * 5: SPOT_ANIMATION (mask: 0x2)
             */
            if ((mask & 2) != 0) {
               npc.spotAnimation = buf.readUnsignedShortLE(); // Graphic ID
               animation = buf.readIntME(); // HASH (GfxHeight shl 16) or GfxDelay
               npc.spotAnimationHeight = animation >> 16;
               npc.spotAnimationStartTick = client.cycle + (animation & '\uffff');
               npc.isSpotAnimationRunning = 0;
               npc.field1060 = 0;
               if (npc.spotAnimationStartTick > client.cycle) {
                  npc.isSpotAnimationRunning = -1;
               }

               if (65535 == npc.spotAnimation) {
                  npc.spotAnimation = -1;
               }
            }

            /*
             * 6: FACE_ENTITY (mask: 0x8)
             */
            if ((mask & 8) != 0) {
               npc.targetIndex = buf.readUnsignedShort();
               if (65535 == npc.targetIndex) {
                  npc.targetIndex = -1;
               }
            }
         }

         for(i = 0; i < client.pendingNpcTeleportsCount; ++i) {
            npcCount = client.pendingNpcTeleports[i];
            if (client.cycle != client.npcs[npcCount].npcCycle) {
               client.npcs[npcCount].definition = null;
               client.npcs[npcCount] = null;
            }
         }

         if (buf.offset != client.packetWriter.serverPacketLength) {
            throw new RuntimeException(buf.offset + class79.SYMBOL_COMMA + client.packetWriter.serverPacketLength);
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
