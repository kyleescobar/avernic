public class class165 {
   public static final class165 field1917 = new class165(0, 0, 4);
   public static final class165 field1918 = new class165(2, 2, 0);
   public static final class165 field1922 = new class165(1, 1, 2);
   final int field1919;
   final int field1920;
   final int field1921;

   static class165[] method2871() {
      return new class165[]{field1918, field1922, field1917};
   }

   class165(int var1, int var2, int var3) {
      this.field1919 = var1;
      this.field1920 = var2;
      this.field1921 = var3;
   }

   boolean method2865(float var1) {
      return var1 >= (float)this.field1921;
   }

   static class165 method2866(int var0) {
      class165[] var2 = method2871();

      for(int var3 = 0; var3 < var2.length; ++var3) {
         class165 var4 = var2[var3];
         if (var0 == var4.field1920) {
            return var4;
         }
      }

      return null;
   }

   static void method2864(int var0) {
      client.field625 = 0L;
      if (var0 >= 2) {
         client.isResizableMode = true;
      } else {
         client.isResizableMode = false;
      }

      if (class238.method4117() == 1) {
         class59.field874.method258(765, 503);
      } else {
         class59.field874.method258(7680, 2160);
      }

      if (client.field413 >= 25) {
         PacketBufferNode var2 = class149.getPacketBufferNode(ClientPacket.field2572, client.packetWriter.isaacCipher);
         var2.packetBuffer.writeByte(class238.method4117());
         var2.packetBuffer.writeShort(class69.canvasWidth);
         var2.packetBuffer.writeShort(client.canvasHeight);
         client.packetWriter.addNode(var2);
      }

   }
}
