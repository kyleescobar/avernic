public class class289 {
   static final class289 field3673 = new class289();
   static final class289 field3674 = new class289();
   static final class289 field3675 = new class289();

   class289() {
   }

   static void method4616() {
      client.packetWriter.clearBuffer();
      client.packetWriter.field1201.offset = 0;
      client.packetWriter.serverPacket = null;
      client.packetWriter.field1212 = null;
      client.packetWriter.field1214 = null;
      client.packetWriter.field1213 = null;
      client.packetWriter.serverPacketLength = 0;
      client.packetWriter.field1210 = 0;
      client.field423 = 0;
      client.field545 = 0;
      client.isMenuOpen = false;
      client.minimapState = 0;
      client.field644 = 0;

      int var1;
      for(var1 = 0; var1 < 2048; ++var1) {
         client.localPlayers[var1] = null;
      }

      MouseHandler.localPlayer = null;

      for(var1 = 0; var1 < client.field567.length; ++var1) {
         class78 var2 = client.field567[var1];
         if (var2 != null) {
            var2.targetIndex = -1;
            var2.field1032 = false;
         }
      }

      class65.field935 = new class364(32);
      class17.method128(30);

      for(var1 = 0; var1 < 100; ++var1) {
         client.field617[var1] = true;
      }

      PacketBufferNode var3 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2572, client.packetWriter.isaacCipher);
      var3.packetBuffer.writeByte(class238.method4117());
      var3.packetBuffer.writeShort(class69.canvasWidth);
      var3.packetBuffer.writeShort(client.canvasHeight);
      client.packetWriter.addNode(var3);
   }
}
