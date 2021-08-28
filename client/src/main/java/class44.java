public class class44 {
   static class340 field372;
   static int field373;
   static int[] field376;
   static int[][] regionXteaKeys;
   class59 field368;
   int field366 = -1;
   int[] field374;
   String[] field369;

   class44() {
   }

   static String method770(int var0) {
      return "<col=" + Integer.toHexString(var0) + ">";
   }

   static final void updatePlayerGpi(PacketBuffer buf) {
      buf.switchToBitAccess();
      int localPlayerIndex = client.localPlayerIndex;
      Player localPlayer = MouseHandler.localPlayer = client.localPlayers[localPlayerIndex] = new Player();
      localPlayer.index = localPlayerIndex;
      int packed = buf.readBits(30);
      byte plane = (byte)(packed >> 28);
      int x = packed >> 14 & 16383;
      int y = packed & 16383;
      localPlayer.pathX[0] = x - class281.baseX;
      localPlayer.x = (localPlayer.pathX[0] << 7) + (localPlayer.getTransformedSize() << 6);
      localPlayer.pathY[0] = y - class78.baseY;
      localPlayer.y = (localPlayer.pathY[0] << 7) + (localPlayer.getTransformedSize() << 6);
      class285.plane = localPlayer.plane = plane;
      if (PlayerList.playerAppearances[localPlayerIndex] != null) {
         localPlayer.decodePlayerAppearance(PlayerList.playerAppearances[localPlayerIndex]);
      }

      PlayerList.localPlayerCount = 0;
      PlayerList.localPlayerIndexes[++PlayerList.localPlayerCount - 1] = localPlayerIndex;
      PlayerList.field1175[localPlayerIndex] = 0;
      PlayerList.emptyPlayerIndexCount = 0;

      for(int i = 1; i < 2048; ++i) {
         if (i != localPlayerIndex) {
            int var9 = buf.readBits(18);
            int var10 = var9 >> 16;
            int var11 = var9 >> 8 & 597;
            int var12 = var9 & 597;
            PlayerList.localPlayerRegions[i] = var12 + (var11 << 14) + (var10 << 28);
            PlayerList.localPlayerOrientations[i] = 0;
            PlayerList.localPlayerTargetIndexes[i] = -1;
            PlayerList.localPlayerEmptyIndexes[++PlayerList.emptyPlayerIndexCount - 1] = i;
            PlayerList.field1175[i] = 0;
         }
      }

      buf.switchToByteMode();
   }

   public static int method772(CharSequence var0, int var1, boolean var2) {
      if (var1 >= 2 && var1 <= 36) {
         boolean var4 = false;
         boolean var5 = false;
         int var6 = 0;
         int var7 = var0.length();

         for(int var8 = 0; var8 < var7; ++var8) {
            char var9 = var0.charAt(var8);
            if (0 == var8) {
               if ('-' == var9) {
                  var4 = true;
                  continue;
               }

               if ('+' == var9 && var2) {
                  continue;
               }
            }

            int var11;
            if (var9 >= '0' && var9 <= '9') {
               var11 = var9 - 48;
            } else if (var9 >= 'A' && var9 <= 'Z') {
               var11 = var9 - 55;
            } else {
               if (var9 < 'a' || var9 > 'z') {
                  throw new NumberFormatException();
               }

               var11 = var9 - 87;
            }

            if (var11 >= var1) {
               throw new NumberFormatException();
            }

            if (var4) {
               var11 = -var11;
            }

            int var10 = var11 + var1 * var6;
            if (var10 / var1 != var6) {
               throw new NumberFormatException();
            }

            var6 = var10;
            var5 = true;
         }

         if (!var5) {
            throw new NumberFormatException();
         } else {
            return var6;
         }
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   public static void method771() {
      class141.field1541.method3883();
   }
}
