public class PacketBufferNode extends class354 {
   static PacketBufferNode[] field2689 = new PacketBufferNode[300];
   static int field2687 = 0;
   public ClientPacket clientPacket;
   public PacketBuffer packetBuffer;
   public int clientPacketLength;
   public int field2688;

   PacketBufferNode() {
   }

   public void method3903() {
      if (field2687 < field2689.length) {
         field2689[++field2687 - 1] = this;
      }
   }

   public static int method3911(byte[] var0, int var1) {
      return ClientPacket.method3901(var0, 0, var1);
   }
}
