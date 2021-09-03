import java.io.IOException;

public class class86 {
   boolean field1211 = true;
   ServerPacket serverPacket = null;
   ServerPacket field1212;
   ServerPacket field1213;
   ServerPacket field1214;
   class298 field1202 = new class298();
   class330 field1208;
   PacketBuffer packetBuffer = new PacketBuffer(40000);
   Buffer field1204 = new Buffer(5000);
   int field1203 = 0;
   int serverPacketLength = 0;
   int field1210 = 0;
   int field1216 = 0;
   public IsaacCipher isaacCipher;

   class86() {
   }

   final void clearBuffer() {
      this.field1202.method4763();
      this.field1203 = 0;
   }

   public static int method1981(int var0) {
      return class346.field3946[var0 & 16383];
   }

   final void flush() throws IOException {
      if (this.field1208 != null && this.field1203 > 0) {
         this.field1204.offset = 0;

         while(true) {
            PacketBufferNode var2 = (PacketBufferNode)this.field1202.method4724();
            if (var2 == null || var2.field2688 > this.field1204.payload.length - this.field1204.offset) {
               this.field1208.write(this.field1204.payload, 0, this.field1204.offset);
               this.field1216 = 0;
               break;
            }

            this.field1204.writeBytes(var2.packetBuffer.payload, 0, var2.field2688);
            this.field1203 -= var2.field2688;
            var2.remove();
            var2.packetBuffer.method5941();
            var2.method3903();
         }
      }

   }

   public final void addNode(PacketBufferNode var1) {
      this.field1202.method4721(var1);
      var1.field2688 = var1.packetBuffer.offset;
      var1.packetBuffer.offset = 0;
      this.field1203 += var1.field2688;
   }

   void method1964(class330 var1) {
      this.field1208 = var1;
   }

   void method1965() {
      if (this.field1208 != null) {
         this.field1208.method5279();
         this.field1208 = null;
      }

   }

   void method1961() {
      this.field1208 = null;
   }

   class330 method1968() {
      return this.field1208;
   }
}
