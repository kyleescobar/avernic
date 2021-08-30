public class class377 implements class290 {
   public static final class377 field4160 = new class377(2, 1, Long.class, new class376());
   public static final class377 field4164 = new class377(0, 0, Integer.class, new class374());
   public static final class377 field4165 = new class377(1, 2, String.class, new class378());
   static class398 field4167;
   static int field4166;
   final int field4162;
   public final class373 field4163;
   public final int field4159;
   public final Class field4161;

   class377(int var1, int var2, Class var3, class373 var4) {
      this.field4162 = var1;
      this.field4159 = var2;
      this.field4161 = var3;
      this.field4163 = var4;
   }

   public int method4619() {
      return this.field4159;
   }

   public Object method5859(Buffer var1) {
      return this.field4163.method5840(var1);
   }

   static final void method5860(String var0) {
      PacketBufferNode var2 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2604, client.packetWriter.isaacCipher);
      var2.packetBuffer.writeByte(class281.method4532(var0));
      var2.packetBuffer.writeStringCP1252(var0);
      client.packetWriter.addNode(var2);
   }

   static final void method5855(Interface var0, class157 var1, int var2, int var3, boolean var4) {
      String[] var6 = var1.field1810;
      byte var7 = -1;
      String var8 = null;
      if (null != var6 && null != var6[var3]) {
         if (0 == var3) {
            var7 = 33;
         } else if (1 == var3) {
            var7 = 34;
         } else if (var3 == 2) {
            var7 = 35;
         } else if (3 == var3) {
            var7 = 36;
         } else {
            var7 = 37;
         }

         var8 = var6[var3];
      } else if (var3 == 4) {
         var7 = 37;
         var8 = class270.field3228;
      }

      if (-1 != var7 && null != var8) {
         class25.method400(var8, class44.method770(16748608) + var1.field1836, var7, var1.field1802, var2, var0.id, var4);
      }

   }

   static final boolean method5858(Interface var0) {
      int var2 = var0.field2962;
      if (var2 == 205) {
         client.field571 = 250;
         return true;
      } else {
         int var3;
         int var4;
         if (var2 >= 300 && var2 <= 313) {
            var3 = (var2 - 300) / 2;
            var4 = var2 & 1;
            client.field598.method4190(var3, 1 == var4);
         }

         if (var2 >= 314 && var2 <= 323) {
            var3 = (var2 - 314) / 2;
            var4 = var2 & 1;
            client.field598.method4183(var3, var4 == 1);
         }

         if (var2 == 324) {
            client.field598.method4180(false);
         }

         if (325 == var2) {
            client.field598.method4180(true);
         }

         if (326 == var2) {
            PacketBufferNode var5 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2658, client.packetWriter.isaacCipher);
            client.field598.method4181(var5.packetBuffer);
            client.packetWriter.addNode(var5);
            return true;
         } else {
            return false;
         }
      }
   }
}
