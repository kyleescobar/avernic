public class class109 extends class104 {
   static class275 archive6;
   int field1327;
   int field1328;
   int field1331;
   int field1332;
   // $FF: synthetic field
   final class107 this$0;

   class109(class107 var1) {
      this.this$0 = var1;
   }

   void method2083(Buffer var1) {
      this.field1332 = var1.readInt();
      this.field1331 = var1.readInt();
      this.field1327 = var1.readUnsignedByte();
      this.field1328 = var1.readUnsignedByte();
   }

   void method2084(class115 var1) {
      var1.method2134(this.field1332, this.field1331, this.field1327, this.field1328);
   }

   static void method2109(int var0, String var1) {
      int var3 = PlayerList.localPlayerCount;
      int[] var4 = PlayerList.localPlayerIndexes;
      boolean var5 = false;
      class406 var6 = new class406(var1, class52.field761);

      for(int var7 = 0; var7 < var3; ++var7) {
         Player var8 = client.localPlayers[var4[var7]];
         if (var8 != null && MouseHandler.localPlayer != var8 && var8.username != null && var8.username.equals(var6)) {
            PacketBufferNode var9;
            if (var0 == 1) {
               var9 = class149.getPacketBufferNode(ClientPacket.field2625, client.packetWriter.isaacCipher);
               var9.packetBuffer.writeByte(0);
               var9.packetBuffer.writeShortLEADD(var4[var7]);
               client.packetWriter.addNode(var9);
            } else if (var0 == 4) {
               var9 = class149.getPacketBufferNode(ClientPacket.field2651, client.packetWriter.isaacCipher);
               var9.packetBuffer.method5984(var4[var7]);
               var9.packetBuffer.method6067(0);
               client.packetWriter.addNode(var9);
            } else if (6 == var0) {
               var9 = class149.getPacketBufferNode(ClientPacket.field2570, client.packetWriter.isaacCipher);
               var9.packetBuffer.writeShort(var4[var7]);
               var9.packetBuffer.method5976(0);
               client.packetWriter.addNode(var9);
            } else if (7 == var0) {
               var9 = class149.getPacketBufferNode(ClientPacket.field2628, client.packetWriter.isaacCipher);
               var9.packetBuffer.method5974(0);
               var9.packetBuffer.method5984(var4[var7]);
               client.packetWriter.addNode(var9);
            }

            var5 = true;
            break;
         }
      }

      if (!var5) {
         class121.addGameMessage(4, "", class270.field3379 + var1);
      }

   }

   static void method2108() {
      if (client.field490 && null != MouseHandler.localPlayer) {
         int var1 = MouseHandler.localPlayer.pathX[0];
         int var2 = MouseHandler.localPlayer.pathY[0];
         if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
            return;
         }

         KeyHandler.field66 = MouseHandler.localPlayer.x;
         int var3 = class123.method2216(MouseHandler.localPlayer.x, MouseHandler.localPlayer.y, class285.plane) - client.field483;
         if (var3 < class271.field3533) {
            class271.field3533 = var3;
         }

         class273.field3553 = MouseHandler.localPlayer.y;
         client.field490 = false;
      }

   }
}
