import java.io.IOException;

public class class232 {
   static final void method3924(boolean var0) {
      class263.method4333();
      ++client.packetWriter.field1216;
      if (client.packetWriter.field1216 >= 50 || var0) {
         client.packetWriter.field1216 = 0;
         if (!client.field456 && client.packetWriter.method1968() != null) {
            PacketBufferNode var2 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2574, client.packetWriter.isaacCipher);
            client.packetWriter.addNode(var2);

            try {
               client.packetWriter.flush();
            } catch (IOException var4) {
               client.field456 = true;
            }
         }

      }
   }
}
