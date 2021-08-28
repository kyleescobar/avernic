public class class211 {
   class211() {
   }

   static class59 method3833(byte[] var0) {
      class59 var2 = new class59();
      Buffer var3 = new Buffer(var0);
      var3.offset = var3.payload.length - 2;
      int var4 = var3.readUnsignedShort();
      int var5 = var3.payload.length - 2 - var4 - 12;
      var3.offset = var5;
      int var6 = var3.readInt();
      var2.field864 = var3.readUnsignedShort();
      var2.field868 = var3.readUnsignedShort();
      var2.field869 = var3.readUnsignedShort();
      var2.field867 = var3.readUnsignedShort();
      int var7 = var3.readUnsignedByte();
      int var8;
      int var9;
      if (var7 > 0) {
         var2.field871 = var2.method1600(var7);

         for(var8 = 0; var8 < var7; ++var8) {
            var9 = var3.readUnsignedShort();
            class363 var10 = new class363(var9 > 0 ? class27.method470(var9) : 1);
            var2.field871[var8] = var10;

            while(var9-- > 0) {
               int var11 = var3.readInt();
               int var12 = var3.readInt();
               var10.method5727(new class353(var12), (long)var11);
            }
         }
      }

      var3.offset = 0;
      var2.field863 = var3.method5956();
      var2.field865 = new int[var6];
      var2.field870 = new int[var6];
      var2.field866 = new String[var6];

      for(var8 = 0; var3.offset < var5; var2.field865[var8++] = var9) {
         var9 = var3.readUnsignedShort();
         if (var9 == 3) {
            var2.field866[var8] = var3.readStringNullTerminated();
         } else if (var9 < 100 && 21 != var9 && 38 != var9 && 39 != var9) {
            var2.field870[var8] = var3.readInt();
         } else {
            var2.field870[var8] = var3.readUnsignedByte();
         }
      }

      return var2;
   }
}
