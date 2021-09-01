public class class184 {
   static final boolean method3198() {
      return class208.field2490;
   }

   static void method3200(int var0, int var1, int var2, int var3, String var4) {
      Interface var6 = class50.method1394(var1, var2);
      if (var6 != null) {
         if (var6.field3055 != null) {
            ScriptEvent var7 = new ScriptEvent();
            var7.field961 = var6;
            var7.field957 = var0;
            var7.field952 = var4;
            var7.args = var6.field3055;
            UserComparator10.runScriptEvent(var7);
         }

         boolean var12 = true;
         if (var6.field2962 > 0) {
            var12 = class377.method5858(var6);
         }

         if (var12) {
            int var9 = class241.method4140(var6);
            int var10 = var0 - 1;
            boolean var8 = 0 != (var9 >> var10 + 1 & 1);
            if (var8) {
               PacketBufferNode var11;
               if (1 == var0) {
                  var11 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2643, client.packetWriter.isaacCipher);
                  var11.packetBuffer.writeInt(var1);
                  var11.packetBuffer.writeShort(var2);
                  var11.packetBuffer.writeShort(var3);
                  client.packetWriter.addNode(var11);
               }

               if (2 == var0) {
                  var11 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2645, client.packetWriter.isaacCipher);
                  var11.packetBuffer.writeInt(var1);
                  var11.packetBuffer.writeShort(var2);
                  var11.packetBuffer.writeShort(var3);
                  client.packetWriter.addNode(var11);
               }

               if (3 == var0) {
                  var11 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2617, client.packetWriter.isaacCipher);
                  var11.packetBuffer.writeInt(var1);
                  var11.packetBuffer.writeShort(var2);
                  var11.packetBuffer.writeShort(var3);
                  client.packetWriter.addNode(var11);
               }

               if (var0 == 4) {
                  var11 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2659, client.packetWriter.isaacCipher);
                  var11.packetBuffer.writeInt(var1);
                  var11.packetBuffer.writeShort(var2);
                  var11.packetBuffer.writeShort(var3);
                  client.packetWriter.addNode(var11);
               }

               if (var0 == 5) {
                  var11 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2583, client.packetWriter.isaacCipher);
                  var11.packetBuffer.writeInt(var1);
                  var11.packetBuffer.writeShort(var2);
                  var11.packetBuffer.writeShort(var3);
                  client.packetWriter.addNode(var11);
               }

               if (6 == var0) {
                  var11 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2649, client.packetWriter.isaacCipher);
                  var11.packetBuffer.writeInt(var1);
                  var11.packetBuffer.writeShort(var2);
                  var11.packetBuffer.writeShort(var3);
                  client.packetWriter.addNode(var11);
               }

               if (7 == var0) {
                  var11 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2640, client.packetWriter.isaacCipher);
                  var11.packetBuffer.writeInt(var1);
                  var11.packetBuffer.writeShort(var2);
                  var11.packetBuffer.writeShort(var3);
                  client.packetWriter.addNode(var11);
               }

               if (var0 == 8) {
                  var11 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2608, client.packetWriter.isaacCipher);
                  var11.packetBuffer.writeInt(var1);
                  var11.packetBuffer.writeShort(var2);
                  var11.packetBuffer.writeShort(var3);
                  client.packetWriter.addNode(var11);
               }

               if (9 == var0) {
                  var11 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2654, client.packetWriter.isaacCipher);
                  var11.packetBuffer.writeInt(var1);
                  var11.packetBuffer.writeShort(var2);
                  var11.packetBuffer.writeShort(var3);
                  client.packetWriter.addNode(var11);
               }

               if (10 == var0) {
                  var11 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2571, client.packetWriter.isaacCipher);
                  var11.packetBuffer.writeInt(var1);
                  var11.packetBuffer.writeShort(var2);
                  var11.packetBuffer.writeShort(var3);
                  client.packetWriter.addNode(var11);
               }

            }
         }
      }
   }
}
