public class class241 extends class354 {
   class23 field2885;
   class234 field2886;
   class238 field2891;
   class30 field2901;
   int field2883;
   int field2884;
   int field2887;
   int field2888;
   int field2889;
   int field2890;
   int field2892;
   int field2893;
   int field2894;
   int field2895;
   int field2896;
   int field2897;
   int field2898;
   int field2899;
   int field2900;
   int field2902;
   int field2903;

   public static byte[] method4142(Object var0, boolean var1) {
      if (null == var0) {
         return null;
      } else if (var0 instanceof byte[]) {
         byte[] var4 = (byte[])((byte[])var0);
         return var1 ? class205.method3714(var4) : var4;
      } else if (var0 instanceof class253) {
         class253 var3 = (class253)var0;
         return var3.method4314();
      } else {
         throw new IllegalArgumentException();
      }
   }

   class241() {
   }

   void method4145() {
      this.field2891 = null;
      this.field2885 = null;
      this.field2886 = null;
      this.field2901 = null;
   }

   public static String method4139(int var0, boolean var1) {
      if (var1 && var0 >= 0) {
         int var4 = var0;
         String var3;
         if (var1 && var0 >= 0) {
            int var5 = 2;

            for(int var6 = var0 / 10; var6 != 0; ++var5) {
               var6 /= 10;
            }

            char[] var7 = new char[var5];
            var7[0] = '+';

            for(int var8 = var5 - 1; var8 > 0; --var8) {
               int var9 = var4;
               var4 /= 10;
               int var10 = var9 - var4 * 10;
               if (var10 >= 10) {
                  var7[var8] = (char)(var10 + 87);
               } else {
                  var7[var8] = (char)(var10 + 48);
               }
            }

            var3 = new String(var7);
         } else {
            var3 = Integer.toString(var0, 10);
         }

         return var3;
      } else {
         return Integer.toString(var0);
      }
   }

   static final void method4143(class72 var0, int var1) {
      class322.method5132(var0.x, var0.y, var1);
   }

   static final void method4144(int var0, int var1) {
      class124 var3 = var0 >= 0 ? client.field638[var0] : class322.field3845;
      if (var3 != null && var1 >= 0 && var1 < var3.method2230()) {
         class106 var4 = (class106)var3.field1436.get(var1);
         if (var4.field1306 == -1) {
            String var5 = var4.field1303.getName();
            class86 var6 = client.packetWriter;
            PacketBufferNode var7 = class149.getPacketBufferNode(ClientPacket.field2672, var6.isaacCipher);
            var7.packetBuffer.writeByte(3 + class281.method4532(var5));
            var7.packetBuffer.writeByte(var0);
            var7.packetBuffer.writeShort(var1);
            var7.packetBuffer.writeStringCP1252(var5);
            var6.addNode(var7);
         }
      }
   }

   static int method4140(Interface var0) {
      class353 var2 = (class353)client.field469.get(((long)var0.id << 32) + (long)var0.field3031);
      return var2 != null ? var2.field3964 : var0.field2979;
   }
}
