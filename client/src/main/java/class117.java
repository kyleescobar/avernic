public class class117 extends class120 {
   static int field1398;
   byte field1396;
   int field1392;
   int field1395;
   String field1394;
   // $FF: synthetic field
   final class121 this$0;

   static class59 method2186(int var0, int var1) {
      class59 var3 = (class59)class59.field862.method3880((long)(var0 << 16));
      if (var3 != null) {
         return var3;
      } else {
         String var4 = String.valueOf(var0);
         int var5 = ApproximateRouteStrategy.archive12.readGroup(var4);
         if (var5 == -1) {
            return null;
         } else {
            byte[] var6 = ApproximateRouteStrategy.archive12.method4419(var5);
            if (null != var6) {
               if (var6.length <= 1) {
                  return null;
               }

               var3 = class211.method3833(var6);
               if (null != var3) {
                  class59.field862.method3882(var3, (long)(var0 << 16));
                  return var3;
               }
            }

            return null;
         }
      }
   }

   class117(class121 var1) {
      this.this$0 = var1;
      this.field1395 = -1;
   }

   void method2191(Buffer var1) {
      var1.readUnsignedByte();
      this.field1395 = var1.readUnsignedShort();
      this.field1396 = var1.readByte();
      this.field1392 = var1.readUnsignedShort();
      var1.method5954();
      this.field1394 = var1.readStringNullTerminated();
      var1.readUnsignedByte();
   }

   void method2192(class124 var1) {
      class106 var3 = (class106)var1.field1436.get(this.field1395);
      var3.field1306 = this.field1396;
      var3.field1302 = this.field1392;
      var3.field1303 = new class406(this.field1394);
   }
}
