public class class389 implements class290 {
   public static final class389 field4231 = new class389(4, 0);
   static final class389 field4232 = new class389(5, 2);
   static final class389 field4233 = new class389(0, 5);
   static final class389 field4234 = new class389(2, 6);
   static final class389 field4235 = new class389(1, 7);
   static final class389 field4236 = new class389(3, 8);
   final int field4237;
   final int field4238;

   class389(int var1, int var2) {
      this.field4237 = var1;
      this.field4238 = var2;
   }

   public int method4619() {
      return this.field4238;
   }

   static final void method6228(int var0, int var1, boolean var2) {
      if (client.field638[var0] != null) {
         if (var1 >= 0 && var1 < client.field638[var0].method2230()) {
            class106 var4 = (class106)client.field638[var0].field1436.get(var1);
            class86 var5 = client.packetWriter;
            PacketBufferNode var6 = class149.getPacketBufferNode(ClientPacket.field2665, var5.isaacCipher);
            var6.packetBuffer.writeByte(4 + class281.method4532(var4.field1303.getName()));
            var6.packetBuffer.writeByte(var0);
            var6.packetBuffer.writeShort(var1);
            var6.packetBuffer.writeBoolean(var2);
            var6.packetBuffer.writeStringCP1252(var4.field1303.getName());
            var5.addNode(var6);
         }
      }
   }
}
