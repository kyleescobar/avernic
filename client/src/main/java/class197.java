public final class class197 extends class354 {
   boolean field2238;
   boolean field2239;
   boolean field2240;
   class192 field2227;
   class194 field2235;
   class197 field2241;
   class206 field2245;
   class210 field2232;
   class212 field2229;
   class214 field2230;
   class215[] field2234 = new class215[5];
   int field2223;
   int field2224;
   int field2225;
   int field2226;
   int field2228;
   int field2231;
   int field2233;
   int field2236 = 0;
   int field2237;
   int field2243;
   int field2244;
   int[] field2242 = new int[5];

   class197(int var1, int var2, int var3) {
      this.field2226 = this.field2237 = var1;
      this.field2224 = var2;
      this.field2225 = var3;
   }

   static void method3412(int var0, class245 var1, boolean var2) {
      class168 var4 = class186.method3221().method5511(var0);
      int var5 = MouseHandler.localPlayer.plane;
      int var6 = (MouseHandler.localPlayer.x >> 7) + class281.baseX;
      int var7 = (MouseHandler.localPlayer.y >> 7) + class78.baseY;
      class245 var8 = new class245(var5, var6, var7);
      class186.method3221().method5499(var4, var8, var1, var2);
   }

   static void method3413(int var0, int var1) {
      PacketBufferNode var3 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2614, client.packetWriter.isaacCipher);
      var3.packetBuffer.writeShort(var1);
      var3.packetBuffer.method5972(var0);
      client.packetWriter.addNode(var3);
   }
}
