public class class54 {
   static int[] field788;
   int field786;
   int field787;
   int field789;
   int field791;
   String field790;

   public static void method1542() {
      class143.field1568.method3883();
   }

   static int method1543(int var0, class59 var1, boolean var2) {
      if (var0 == 5630) {
         client.field571 = 250;
         return 1;
      } else if (5631 != var0 && var0 != 5633) {
         if (5632 == var0) {
            class51.field747[++class51.field746 - 1] = 26;
            return 1;
         } else {
            return 2;
         }
      } else {
         class2.field4 -= 2;
         return 1;
      }
   }

   static final void method1541(Interface subjectInterface, int var1, int var2) {
      if (client.minimapState == 0 || 3 == client.minimapState) {
         if (!client.isMenuOpen && (MouseHandler.lastButton == 1 || !class311.mouseCam && MouseHandler.lastButton == 4)) {
            SpriteMask sprite = subjectInterface.getSpriteMask(true);
            if (sprite == null) {
               return;
            }

            int lastPressedX = MouseHandler.lastPressedX - var1;
            int lastPressedY = MouseHandler.lastPressedY - var2;
            if (sprite.contains(lastPressedX, lastPressedY)) {
               lastPressedX -= sprite.width / 2;
               lastPressedY -= sprite.height / 2;
               int cameraAngleY = client.cameraAngleY & 2047;
               int rawY = Rasterizer3D.sineTable[cameraAngleY];
               int rawX = Rasterizer3D.cosineTable[cameraAngleY];
               int var10 = rawY * lastPressedY + lastPressedX * rawX >> 11;
               int var11 = lastPressedY * rawX - rawY * lastPressedX >> 11;
               int var12 = MouseHandler.localPlayer.x + var10 >> 7;
               int var13 = MouseHandler.localPlayer.y - var11 >> 7;
               PacketBufferNode packetNode = VerticalAlignment.getPacketBufferNode(ClientPacket.MOVE_MINIMAP_CLICK, client.packetWriter.isaacCipher);
               packetNode.packetBuffer.writeByte(18);
               packetNode.packetBuffer.writeShortLEADD(var12 + class281.baseX); // tileX
               packetNode.packetBuffer.writeShort(Npc.baseY + var13); // tileY
               packetNode.packetBuffer.writeByte(KeyHandler.pressedKeys[82] ? (KeyHandler.pressedKeys[81] ? 2 : 1) : 0);
               packetNode.packetBuffer.writeByte(lastPressedX); // mouseX
               packetNode.packetBuffer.writeByte(lastPressedY); // mouseY
               packetNode.packetBuffer.writeShort(client.cameraAngleY); // angle
               packetNode.packetBuffer.writeByte(57);
               packetNode.packetBuffer.writeByte(0);
               packetNode.packetBuffer.writeByte(0);
               packetNode.packetBuffer.writeByte(89);
               packetNode.packetBuffer.writeShort(MouseHandler.localPlayer.x); // playerX
               packetNode.packetBuffer.writeShort(MouseHandler.localPlayer.y); // playerY
               packetNode.packetBuffer.writeByte(63);
               client.packetWriter.addNode(packetNode);
               client.field644 = var12;
               client.field597 = var13;
            }
         }

      }
   }

   class54() {
   }
}
