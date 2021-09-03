public class class103 extends class104 {
   int field1288;
   // $FF: synthetic field
   final class107 this$0;

   class103(class107 var1) {
      this.this$0 = var1;
      this.field1288 = -1;
   }

   void method2083(Buffer var1) {
      this.field1288 = var1.readUnsignedShort();
   }

   void method2084(class115 var1) {
      var1.method2125(this.field1288);
   }

   static boolean method2081(PacketBuffer var0, int var1) {
      int var3 = var0.readBits(2);
      int var4;
      int var5;
      int var8;
      int var9;
      int var10;
      int var11;
      if (var3 == 0) {
         if (var0.readBits(1) != 0) {
            method2081(var0, var1);
         }

         var4 = var0.readBits(13);
         var5 = var0.readBits(13);
         boolean var12 = var0.readBits(1) == 1;
         if (var12) {
            PlayerList.pendingUpdateIndexes[++PlayerList.pendingUpdateCount - 1] = var1;
         }

         if (null != client.localPlayers[var1]) {
            throw new RuntimeException();
         } else {
            Player var13 = client.localPlayers[var1] = new Player();
            var13.index = var1;
            if (PlayerList.playerAppearances[var1] != null) {
               var13.decodePlayerAppearance(PlayerList.playerAppearances[var1]);
            }

            var13.orientation = PlayerList.localPlayerOrientations[var1];
            var13.targetIndex = PlayerList.localPlayerTargetIndexes[var1];
            var8 = PlayerList.localPlayerRegions[var1];
            var9 = var8 >> 28;
            var10 = var8 >> 14 & 255;
            var11 = var8 & 255;
            var13.pathTraversed[0] = PlayerList.movementDirectionCache[var1];
            var13.plane = (byte)var9;
            var13.teleport(var4 + (var10 << 13) - class281.baseX, var5 + (var11 << 13) - Npc.baseY);
            var13.field1004 = false;
            return true;
         }
      } else if (1 == var3) {
         var4 = var0.readBits(2);
         var5 = PlayerList.localPlayerRegions[var1];
         PlayerList.localPlayerRegions[var1] = (var5 & 268435455) + ((var4 + (var5 >> 28) & 3) << 28);
         return false;
      } else {
         int var6;
         int var7;
         if (2 == var3) {
            var4 = var0.readBits(5);
            var5 = var4 >> 3;
            var6 = var4 & 7;
            var7 = PlayerList.localPlayerRegions[var1];
            var8 = var5 + (var7 >> 28) & 3;
            var9 = var7 >> 14 & 255;
            var10 = var7 & 255;
            if (var6 == 0) {
               --var9;
               --var10;
            }

            if (var6 == 1) {
               --var10;
            }

            if (var6 == 2) {
               ++var9;
               --var10;
            }

            if (3 == var6) {
               --var9;
            }

            if (4 == var6) {
               ++var9;
            }

            if (var6 == 5) {
               --var9;
               ++var10;
            }

            if (6 == var6) {
               ++var10;
            }

            if (var6 == 7) {
               ++var9;
               ++var10;
            }

            PlayerList.localPlayerRegions[var1] = (var8 << 28) + (var9 << 14) + var10;
            return false;
         } else {
            var4 = var0.readBits(18);
            var5 = var4 >> 16;
            var6 = var4 >> 8 & 255;
            var7 = var4 & 255;
            var8 = PlayerList.localPlayerRegions[var1];
            var9 = var5 + (var8 >> 28) & 3;
            var10 = var6 + (var8 >> 14) & 255;
            var11 = var7 + var8 & 255;
            PlayerList.localPlayerRegions[var1] = var11 + (var9 << 28) + (var10 << 14);
            return false;
         }
      }
   }
}
