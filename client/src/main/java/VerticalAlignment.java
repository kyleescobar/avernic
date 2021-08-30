public class VerticalAlignment implements class290 {
   static final VerticalAlignment field1653 = new VerticalAlignment(1, 0);
   static final VerticalAlignment field1654 = new VerticalAlignment(0, 1);
   static final VerticalAlignment field1655 = new VerticalAlignment(2, 2);
   final int field1657;
   public final int field1658;

   VerticalAlignment(int var1, int var2) {
      this.field1658 = var1;
      this.field1657 = var2;
   }

   public int method4619() {
      return this.field1657;
   }

   public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1) {
      PacketBufferNode var3 = class160.createPacketNode();
      var3.clientPacket = var0;
      var3.clientPacketLength = var0.field2670;
      if (-1 == var3.clientPacketLength) {
         var3.packetBuffer = new PacketBuffer(260);
      } else if (-2 == var3.clientPacketLength) {
         var3.packetBuffer = new PacketBuffer(10000);
      } else if (var3.clientPacketLength <= 18) {
         var3.packetBuffer = new PacketBuffer(20);
      } else if (var3.clientPacketLength <= 98) {
         var3.packetBuffer = new PacketBuffer(100);
      } else {
         var3.packetBuffer = new PacketBuffer(260);
      }

      var3.packetBuffer.method5886(var1);
      var3.packetBuffer.method5887(var3.clientPacket.field2669);
      var3.field2688 = 0;
      return var3;
   }
}
