public class class167 implements class188 {
   static int field1932;
   int field1933;
   int field1934;
   int field1935;
   int field1936;
   int field1937;
   int field1938;
   int field1939;
   int field1940;
   int field1941;
   int field1943;

   public static int method2887(CharSequence var0, CharSequence var1, class292 var2) {
      int var4 = var0.length();
      int var5 = var1.length();
      int var6 = 0;
      int var7 = 0;
      byte var8 = 0;
      byte var9 = 0;

      while(var6 - var8 < var4 || var7 - var9 < var5) {
         if (var6 - var8 >= var4) {
            return -1;
         }

         if (var7 - var9 >= var5) {
            return 1;
         }

         char var10;
         if (var8 != 0) {
            var10 = (char)var8;
            boolean var15 = false;
         } else {
            var10 = var0.charAt(var6++);
         }

         char var11;
         if (0 != var9) {
            var11 = (char)var9;
            boolean var16 = false;
         } else {
            var11 = var1.charAt(var7++);
         }

         byte var12;
         if (198 == var10) {
            var12 = 69;
         } else if (230 == var10) {
            var12 = 101;
         } else if (223 == var10) {
            var12 = 115;
         } else if (338 == var10) {
            var12 = 69;
         } else if (var10 == 339) {
            var12 = 101;
         } else {
            var12 = 0;
         }

         var8 = var12;
         byte var13;
         if (198 == var11) {
            var13 = 69;
         } else if (230 == var11) {
            var13 = 101;
         } else if (223 == var11) {
            var13 = 115;
         } else if (338 == var11) {
            var13 = 69;
         } else if (var11 == 339) {
            var13 = 101;
         } else {
            var13 = 0;
         }

         var9 = var13;
         var10 = class152.method2543(var10, var2);
         var11 = class152.method2543(var11, var2);
         if (var10 != var11 && Character.toUpperCase(var10) != Character.toUpperCase(var11)) {
            var10 = Character.toLowerCase(var10);
            var11 = Character.toLowerCase(var11);
            if (var10 != var11) {
               return class42.method756(var10, var2) - class42.method756(var11, var2);
            }
         }
      }

      int var17 = Math.min(var4, var5);

      int var18;
      char var21;
      for(var18 = 0; var18 < var17; ++var18) {
         if (class292.field3691 == var2) {
            var6 = var4 - 1 - var18;
            var7 = var5 - 1 - var18;
         } else {
            var7 = var18;
            var6 = var18;
         }

         char var19 = var0.charAt(var6);
         var21 = var1.charAt(var7);
         if (var19 != var21 && Character.toUpperCase(var19) != Character.toUpperCase(var21)) {
            var19 = Character.toLowerCase(var19);
            var21 = Character.toLowerCase(var21);
            if (var21 != var19) {
               return class42.method756(var19, var2) - class42.method756(var21, var2);
            }
         }
      }

      var18 = var4 - var5;
      if (var18 != 0) {
         return var18;
      } else {
         for(int var20 = 0; var20 < var17; ++var20) {
            var21 = var0.charAt(var20);
            char var14 = var1.charAt(var20);
            if (var14 != var21) {
               return class42.method756(var21, var2) - class42.method756(var14, var2);
            }
         }

         return 0;
      }
   }

   class167() {
   }

   public void method3245(class168 var1) {
      if (var1.field1953 > this.field1943) {
         var1.field1953 = this.field1943;
      }

      if (var1.field1951 < this.field1940) {
         var1.field1951 = this.field1940;
      }

      if (var1.field1952 > this.field1939) {
         var1.field1952 = this.field1939;
      }

      if (var1.field1957 < this.field1941) {
         var1.field1957 = this.field1941;
      }

   }

   public boolean method3248(int var1, int var2, int var3) {
      if (var1 >= this.field1936 && var1 < this.field1936 + this.field1933) {
         return var2 >> 6 >= this.field1938 && var2 >> 6 <= this.field1934 && var3 >> 6 >= this.field1935 && var3 >> 6 <= this.field1937;
      } else {
         return false;
      }
   }

   public boolean method3246(int var1, int var2) {
      return var1 >> 6 >= this.field1943 && var1 >> 6 <= this.field1940 && var2 >> 6 >= this.field1939 && var2 >> 6 <= this.field1941;
   }

   public int[] method3247(int var1, int var2, int var3) {
      if (!this.method3248(var1, var2, var3)) {
         return null;
      } else {
         int[] var5 = new int[]{this.field1943 * 64 - this.field1938 * 64 + var2, this.field1939 * 64 - this.field1935 * 64 + var3};
         return var5;
      }
   }

   public class245 method3249(int var1, int var2) {
      if (!this.method3246(var1, var2)) {
         return null;
      } else {
         int var4 = this.field1938 * 64 - this.field1943 * 64 + var1;
         int var5 = this.field1935 * 64 - this.field1939 * 64 + var2;
         return new class245(this.field1936, var4, var5);
      }
   }

   public void method3256(Buffer var1) {
      this.field1936 = var1.readUnsignedByte();
      this.field1933 = var1.readUnsignedByte();
      this.field1938 = var1.readUnsignedShort();
      this.field1935 = var1.readUnsignedShort();
      this.field1934 = var1.readUnsignedShort();
      this.field1937 = var1.readUnsignedShort();
      this.field1943 = var1.readUnsignedShort();
      this.field1939 = var1.readUnsignedShort();
      this.field1940 = var1.readUnsignedShort();
      this.field1941 = var1.readUnsignedShort();
      this.method2882();
   }

   void method2882() {
   }

   static final void processPlayerUpdateFlags(PacketBuffer buf, int playerIndex, Player player, int updateMask) {
      byte movementType = -1;

      /*
       * 0: Force Rotation (mask: 0x40)
       */
      if (0 != (updateMask & 64)) {
         player.faceDegrees = buf.readUnsignedShort();
         if (0 == player.pathLength) {
            player.orientation = player.faceDegrees;
            player.faceDegrees = -1;
         }
      }

      /*
       * 1: Spot Animation (mask: 0x400)
       */
      int i;
      if ((updateMask & 1024) != 0) {
         player.spotAnimation = buf.readUnsignedShortLE();
         i = buf.readIntLE();
         player.spotAnimationHeight = i >> 16;
         player.spotAnimationStartTick = client.cycle + (i & '\uffff');
         player.isSpotAnimationRunning = 0;
         player.field1060 = 0;
         if (player.spotAnimationStartTick > client.cycle) {
            player.isSpotAnimationRunning = -1;
         }

         if (player.spotAnimation == 65535) {
            player.spotAnimation = -1;
         }
      }

      /*
       * 2: Player Appearance (mask: 0x10)
       */
      if (0 != (updateMask & 16)) {
         i = buf.readUnsignedByteADD(); // appBuf length
         byte[] bytes = new byte[i];
         Buffer appBuf = new Buffer(bytes);
         buf.readBytesReversedADD(bytes, 0, i);
         PlayerList.playerAppearances[playerIndex] = appBuf;
         player.decodePlayerAppearance(appBuf);
      }

      /*
       * 3: Force Chat (mask: 0x2)
       */
      if ((updateMask & 2) != 0) {
         player.overheadText = buf.readStringNullTerminated();
         if (player.overheadText.charAt(0) == '~') {
            player.overheadText = player.overheadText.substring(1);
            class121.addGameMessage(2, player.username.getName(), player.overheadText);
         } else if (MouseHandler.localPlayer == player) {
            class121.addGameMessage(2, player.username.getName(), player.overheadText);
         }

         player.isAutoChatting = false;
         player.overheadTextColor = 0;
         player.overheadTextEffect = 0;
         player.overheadTextCyclesRemaining = 150;
      }

      /*
       * 4: Animation (mask: 0x1)
       */
      int var14;
      if ((updateMask & 1) != 0) {
         i = buf.readUnsignedShortADD(); // animation id
         if (65535 == i) {
            i = -1;
         }

         var14 = buf.readUnsignedByteSUB(); // animation delay
         ParamComposition.performPlayerAnimation(player, i, var14);
      }

      /*
       * 5: Face Entity (mask: 0x4
       */
      if (0 != (updateMask & 4)) {
         player.targetIndex = buf.readUnsignedShortLE();
         if (65535 == player.targetIndex) {
            player.targetIndex = -1;
         }
      }

      /*
       * 6: Force Move (mask: 0x100)
       */
      if (0 != (updateMask & 256)) {
         player.field1063 = buf.readByteNEG();
         player.field1065 = buf.method5980();
         player.field1064 = buf.readByte();
         player.field1066 = buf.method5935();
         player.field1074 = buf.readUnsignedShortLEADD() + client.cycle;
         player.field1068 = buf.readUnsignedShortADD() + client.cycle;
         player.field1051 = buf.readUnsignedShort();
         if (player.field1004) {
            player.field1063 += player.tileX;
            player.field1065 += player.tileY;
            player.field1064 += player.tileX;
            player.field1066 += player.tileY;
            player.pathLength = 0;
         } else {
            player.field1063 += player.pathX[0];
            player.field1065 += player.pathY[0];
            player.field1064 += player.pathX[0];
            player.field1066 += player.pathY[0];
            player.pathLength = 1;
         }

         player.field1067 = 0;
      }


      /*
       * 7: Chat Message (mask: 0x8)
       */
      int var9;
      int var10;
      int var13;
      if ((updateMask & 8) != 0) {
         i = buf.readUnsignedShortLEADD();
         PlayerType playerType = (PlayerType)class251.enumeratedValueOf(class85.getPlayerTypes(), buf.readUnsignedByteADD());
         boolean isPlayerMod = buf.readUnsignedByte() == 1;
         var9 = buf.readUnsignedByteNEG();
         var10 = buf.offset;
         if (null != player.username && player.field979 != null) {
            boolean var11 = false;
            if (playerType.field3548 && class13.field80.method1325(player.username)) {
               var11 = true;
            }

            if (!var11 && client.field522 == 0 && !player.field998) {
               PlayerList.field1182.offset = 0;
               buf.readBytesADD(PlayerList.field1182.payload, 0, var9);
               PlayerList.field1182.offset = 0;
               String var12 = class303.escapeBrackets(class286.method4581(class176.method3147(PlayerList.field1182)));
               player.overheadText = var12.trim();
               player.overheadTextColor = i >> 8;
               player.overheadTextEffect = i & 255;
               player.overheadTextCyclesRemaining = 150;
               player.isAutoChatting = isPlayerMod;
               player.field1080 = player != MouseHandler.localPlayer && playerType.field3548 && client.field630 != "" && var12.toLowerCase().indexOf(client.field630) == -1;
               if (playerType.isPrivileged) {
                  var13 = isPlayerMod ? 91 : 1;
               } else {
                  var13 = isPlayerMod ? 90 : 2;
               }

               if (playerType.field3543 != -1) {
                  class121.addGameMessage(var13, class77.method1822(playerType.field3543) + player.username.getName(), var12);
               } else {
                  class121.addGameMessage(var13, player.username.getName(), var12);
               }
            }
         }

         buf.offset = var9 + var10;
      }

      /*
       * 8: MOVEMENT CACHED (mask: 0x800)
       */
      if (0 != (updateMask & 2048)) {
         PlayerList.movementDirectionCache[playerIndex] = buf.readByte();
      }

      /*
       * 9: Hit Markers (mask: 0x80)
       */
      if (0 != (updateMask & 128)) {
         i = buf.readUnsignedByteNEG();
         int var17;
         int var19;
         int var20;
         if (i > 0) {
            for(var14 = 0; var14 < i; ++var14) {
               var9 = -1;
               var10 = -1;
               var19 = -1;
               var17 = buf.readSmallSmart();
               if (var17 == 32767) {
                  var17 = buf.readSmallSmart();
                  var10 = buf.readSmallSmart();
                  var9 = buf.readSmallSmart();
                  var19 = buf.readSmallSmart();
               } else if (var17 != 32766) {
                  var10 = buf.readSmallSmart();
               } else {
                  var17 = -1;
               }

               var20 = buf.readSmallSmart();
               player.method1759(var17, var10, var9, var19, client.cycle, var20);
            }
         }

         var14 = buf.readUnsignedByteADD();
         if (var14 > 0) {
            for(var17 = 0; var17 < var14; ++var17) {
               var9 = buf.readSmallSmart();
               var10 = buf.readSmallSmart();
               if (var10 != 32767) {
                  var19 = buf.readSmallSmart();
                  var20 = buf.readUnsignedByteADD();
                  var13 = var10 > 0 ? buf.readUnsignedByteSUB() : var20;
                  player.method1750(var9, client.cycle, var10, var19, var20, var13);
               } else {
                  player.method1751(var9);
               }
            }
         }
      }

      /*
       * 10: ACTIONS (mask: 0x1000)
       */
      if (0 != (updateMask & 4096)) {
         for(i = 0; i < 3; ++i) {
            player.actions[i] = buf.readStringNullTerminated();
         }
      }

      /*
       * 11: MOVEMENT (mask: 0x2000)
       */
      if (0 != (updateMask & 8192)) {
         movementType = buf.readByte();
      }

      if (player.field1004) {
         if (127 == movementType) {
            player.teleport(player.tileX, player.tileY);
         } else {
            byte direction;
            if (-1 != movementType) {
               direction = movementType;
            } else {
               direction = PlayerList.movementDirectionCache[playerIndex];
            }

            player.pathfindClientSideApproximate(player.tileX, player.tileY, direction);
         }
      }

   }

   static int method2883(int var0, class59 var1, boolean var2) {
      int var4;
      if (6600 == var0) {
         var4 = class285.plane;
         int var17 = (MouseHandler.localPlayer.x >> 7) + class281.baseX;
         int var13 = (MouseHandler.localPlayer.y >> 7) + Npc.baseY;
         class186.method3221().method5488(var4, var17, var13, true);
         return 1;
      } else {
         class168 var8;
         if (var0 == 6601) {
            var4 = class51.field747[--class51.field746];
            String var16 = "";
            var8 = class186.method3221().method5511(var4);
            if (var8 != null) {
               var16 = var8.method2900();
            }

            class51.field738[++class2.field4 - 1] = var16;
            return 1;
         } else if (6602 == var0) {
            var4 = class51.field747[--class51.field746];
            class186.method3221().method5494(var4);
            return 1;
         } else if (6603 == var0) {
            class51.field747[++class51.field746 - 1] = class186.method3221().method5508();
            return 1;
         } else if (var0 == 6604) {
            var4 = class51.field747[--class51.field746];
            class186.method3221().method5612(var4);
            return 1;
         } else if (6605 == var0) {
            class51.field747[++class51.field746 - 1] = class186.method3221().method5510() ? 1 : 0;
            return 1;
         } else {
            class245 var15;
            if (var0 == 6606) {
               var15 = new class245(class51.field747[--class51.field746]);
               class186.method3221().method5512(var15.field2920, var15.field2922);
               return 1;
            } else if (var0 == 6607) {
               var15 = new class245(class51.field747[--class51.field746]);
               class186.method3221().method5513(var15.field2920, var15.field2922);
               return 1;
            } else if (var0 == 6608) {
               var15 = new class245(class51.field747[--class51.field746]);
               class186.method3221().method5514(var15.field2921, var15.field2920, var15.field2922);
               return 1;
            } else if (var0 == 6609) {
               var15 = new class245(class51.field747[--class51.field746]);
               class186.method3221().method5540(var15.field2921, var15.field2920, var15.field2922);
               return 1;
            } else if (var0 == 6610) {
               class51.field747[++class51.field746 - 1] = class186.method3221().method5516();
               class51.field747[++class51.field746 - 1] = class186.method3221().method5561();
               return 1;
            } else {
               class168 var12;
               if (var0 == 6611) {
                  var4 = class51.field747[--class51.field746];
                  var12 = class186.method3221().method5511(var4);
                  if (null == var12) {
                     class51.field747[++class51.field746 - 1] = 0;
                  } else {
                     class51.field747[++class51.field746 - 1] = var12.method2910().method4161();
                  }

                  return 1;
               } else if (6612 == var0) {
                  var4 = class51.field747[--class51.field746];
                  var12 = class186.method3221().method5511(var4);
                  if (var12 == null) {
                     class51.field747[++class51.field746 - 1] = 0;
                     class51.field747[++class51.field746 - 1] = 0;
                  } else {
                     class51.field747[++class51.field746 - 1] = (var12.method2904() - var12.method2949() + 1) * 64;
                     class51.field747[++class51.field746 - 1] = (var12.method2906() - var12.method2905() + 1) * 64;
                  }

                  return 1;
               } else if (6613 == var0) {
                  var4 = class51.field747[--class51.field746];
                  var12 = class186.method3221().method5511(var4);
                  if (var12 == null) {
                     class51.field747[++class51.field746 - 1] = 0;
                     class51.field747[++class51.field746 - 1] = 0;
                     class51.field747[++class51.field746 - 1] = 0;
                     class51.field747[++class51.field746 - 1] = 0;
                  } else {
                     class51.field747[++class51.field746 - 1] = var12.method2949() * 64;
                     class51.field747[++class51.field746 - 1] = var12.method2905() * 64;
                     class51.field747[++class51.field746 - 1] = var12.method2904() * 64 + 64 - 1;
                     class51.field747[++class51.field746 - 1] = var12.method2906() * 64 + 64 - 1;
                  }

                  return 1;
               } else if (var0 == 6614) {
                  var4 = class51.field747[--class51.field746];
                  var12 = class186.method3221().method5511(var4);
                  if (var12 == null) {
                     class51.field747[++class51.field746 - 1] = -1;
                  } else {
                     class51.field747[++class51.field746 - 1] = var12.method2925();
                  }

                  return 1;
               } else if (var0 == 6615) {
                  var15 = class186.method3221().method5518();
                  if (null == var15) {
                     class51.field747[++class51.field746 - 1] = -1;
                     class51.field747[++class51.field746 - 1] = -1;
                  } else {
                     class51.field747[++class51.field746 - 1] = var15.field2920;
                     class51.field747[++class51.field746 - 1] = var15.field2922;
                  }

                  return 1;
               } else if (var0 == 6616) {
                  class51.field747[++class51.field746 - 1] = class186.method3221().method5495();
                  return 1;
               } else if (6617 == var0) {
                  var15 = new class245(class51.field747[--class51.field746]);
                  var12 = class186.method3221().method5551();
                  if (var12 == null) {
                     class51.field747[++class51.field746 - 1] = -1;
                     class51.field747[++class51.field746 - 1] = -1;
                     return 1;
                  } else {
                     int[] var11 = var12.method2928(var15.field2921, var15.field2920, var15.field2922);
                     if (null == var11) {
                        class51.field747[++class51.field746 - 1] = -1;
                        class51.field747[++class51.field746 - 1] = -1;
                     } else {
                        class51.field747[++class51.field746 - 1] = var11[0];
                        class51.field747[++class51.field746 - 1] = var11[1];
                     }

                     return 1;
                  }
               } else {
                  class245 var6;
                  if (6618 == var0) {
                     var15 = new class245(class51.field747[--class51.field746]);
                     var12 = class186.method3221().method5551();
                     if (var12 == null) {
                        class51.field747[++class51.field746 - 1] = -1;
                        class51.field747[++class51.field746 - 1] = -1;
                        return 1;
                     } else {
                        var6 = var12.method2895(var15.field2920, var15.field2922);
                        if (var6 == null) {
                           class51.field747[++class51.field746 - 1] = -1;
                        } else {
                           class51.field747[++class51.field746 - 1] = var6.method4161();
                        }

                        return 1;
                     }
                  } else {
                     class245 var9;
                     if (var0 == 6619) {
                        class51.field746 -= 2;
                        var4 = class51.field747[class51.field746];
                        var9 = new class245(class51.field747[class51.field746 + 1]);
                        class197.method3412(var4, var9, false);
                        return 1;
                     } else if (6620 == var0) {
                        class51.field746 -= 2;
                        var4 = class51.field747[class51.field746];
                        var9 = new class245(class51.field747[class51.field746 + 1]);
                        class197.method3412(var4, var9, true);
                        return 1;
                     } else if (var0 == 6621) {
                        class51.field746 -= 2;
                        var4 = class51.field747[class51.field746];
                        var9 = new class245(class51.field747[1 + class51.field746]);
                        var8 = class186.method3221().method5511(var4);
                        if (null == var8) {
                           class51.field747[++class51.field746 - 1] = 0;
                           return 1;
                        } else {
                           class51.field747[++class51.field746 - 1] = var8.method2892(var9.field2921, var9.field2920, var9.field2922) ? 1 : 0;
                           return 1;
                        }
                     } else if (var0 == 6622) {
                        class51.field747[++class51.field746 - 1] = class186.method3221().method5519();
                        class51.field747[++class51.field746 - 1] = class186.method3221().method5520();
                        return 1;
                     } else if (6623 == var0) {
                        var15 = new class245(class51.field747[--class51.field746]);
                        var12 = class186.method3221().method5492(var15.field2921, var15.field2920, var15.field2922);
                        if (var12 == null) {
                           class51.field747[++class51.field746 - 1] = -1;
                        } else {
                           class51.field747[++class51.field746 - 1] = var12.method2897();
                        }

                        return 1;
                     } else if (6624 == var0) {
                        class186.method3221().method5521(class51.field747[--class51.field746]);
                        return 1;
                     } else if (6625 == var0) {
                        class186.method3221().method5569();
                        return 1;
                     } else if (6626 == var0) {
                        class186.method3221().method5522(class51.field747[--class51.field746]);
                        return 1;
                     } else if (6627 == var0) {
                        class186.method3221().method5523();
                        return 1;
                     } else {
                        boolean var14;
                        if (var0 == 6628) {
                           var14 = class51.field747[--class51.field746] == 1;
                           class186.method3221().method5524(var14);
                           return 1;
                        } else if (var0 == 6629) {
                           var4 = class51.field747[--class51.field746];
                           class186.method3221().method5525(var4);
                           return 1;
                        } else if (var0 == 6630) {
                           var4 = class51.field747[--class51.field746];
                           class186.method3221().method5526(var4);
                           return 1;
                        } else if (var0 == 6631) {
                           class186.method3221().method5671();
                           return 1;
                        } else if (var0 == 6632) {
                           var14 = class51.field747[--class51.field746] == 1;
                           class186.method3221().method5528(var14);
                           return 1;
                        } else {
                           boolean var10;
                           if (6633 == var0) {
                              class51.field746 -= 2;
                              var4 = class51.field747[class51.field746];
                              var10 = 1 == class51.field747[1 + class51.field746];
                              class186.method3221().method5641(var4, var10);
                              return 1;
                           } else if (6634 == var0) {
                              class51.field746 -= 2;
                              var4 = class51.field747[class51.field746];
                              var10 = 1 == class51.field747[1 + class51.field746];
                              class186.method3221().method5530(var4, var10);
                              return 1;
                           } else if (var0 == 6635) {
                              class51.field747[++class51.field746 - 1] = class186.method3221().method5506() ? 1 : 0;
                              return 1;
                           } else if (6636 == var0) {
                              var4 = class51.field747[--class51.field746];
                              class51.field747[++class51.field746 - 1] = class186.method3221().method5532(var4) ? 1 : 0;
                              return 1;
                           } else if (6637 == var0) {
                              var4 = class51.field747[--class51.field746];
                              class51.field747[++class51.field746 - 1] = class186.method3221().method5608(var4) ? 1 : 0;
                              return 1;
                           } else if (6638 == var0) {
                              class51.field746 -= 2;
                              var4 = class51.field747[class51.field746];
                              var9 = new class245(class51.field747[1 + class51.field746]);
                              var6 = class186.method3221().method5536(var4, var9);
                              if (null == var6) {
                                 class51.field747[++class51.field746 - 1] = -1;
                              } else {
                                 class51.field747[++class51.field746 - 1] = var6.method4161();
                              }

                              return 1;
                           } else {
                              class186 var7;
                              if (var0 == 6639) {
                                 var7 = class186.method3221().method5619();
                                 if (null == var7) {
                                    class51.field747[++class51.field746 - 1] = -1;
                                    class51.field747[++class51.field746 - 1] = -1;
                                 } else {
                                    class51.field747[++class51.field746 - 1] = var7.method3208();
                                    class51.field747[++class51.field746 - 1] = var7.field2110.method4161();
                                 }

                                 return 1;
                              } else if (var0 == 6640) {
                                 var7 = class186.method3221().method5539();
                                 if (null == var7) {
                                    class51.field747[++class51.field746 - 1] = -1;
                                    class51.field747[++class51.field746 - 1] = -1;
                                 } else {
                                    class51.field747[++class51.field746 - 1] = var7.method3208();
                                    class51.field747[++class51.field746 - 1] = var7.field2110.method4161();
                                 }

                                 return 1;
                              } else {
                                 class141 var5;
                                 if (6693 == var0) {
                                    var4 = class51.field747[--class51.field746];
                                    var5 = class73.method1770(var4);
                                    if (var5.field1537 == null) {
                                       class51.field738[++class2.field4 - 1] = "";
                                    } else {
                                       class51.field738[++class2.field4 - 1] = var5.field1537;
                                    }

                                    return 1;
                                 } else if (var0 == 6694) {
                                    var4 = class51.field747[--class51.field746];
                                    var5 = class73.method1770(var4);
                                    class51.field747[++class51.field746 - 1] = var5.field1539;
                                    return 1;
                                 } else if (6695 == var0) {
                                    var4 = class51.field747[--class51.field746];
                                    var5 = class73.method1770(var4);
                                    if (var5 == null) {
                                       class51.field747[++class51.field746 - 1] = -1;
                                    } else {
                                       class51.field747[++class51.field746 - 1] = var5.field1553;
                                    }

                                    return 1;
                                 } else if (var0 == 6696) {
                                    var4 = class51.field747[--class51.field746];
                                    var5 = class73.method1770(var4);
                                    if (var5 == null) {
                                       class51.field747[++class51.field746 - 1] = -1;
                                    } else {
                                       class51.field747[++class51.field746 - 1] = var5.field1535;
                                    }

                                    return 1;
                                 } else if (var0 == 6697) {
                                    class51.field747[++class51.field746 - 1] = class331.field3879.field2136;
                                    return 1;
                                 } else if (6698 == var0) {
                                    class51.field747[++class51.field746 - 1] = class331.field3879.field2133.method4161();
                                    return 1;
                                 } else if (var0 == 6699) {
                                    class51.field747[++class51.field746 - 1] = class331.field3879.field2134.method4161();
                                    return 1;
                                 } else {
                                    return 2;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }
}
