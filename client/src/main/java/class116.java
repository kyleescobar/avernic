public class class116 extends class120 {
   byte field1391;
   int field1390;
   String field1389;
   // $FF: synthetic field
   final class121 this$0;

   class116(class121 var1) {
      this.this$0 = var1;
      this.field1389 = null;
   }

   void method2191(Buffer var1) {
      if (var1.readUnsignedByte() != 255) {
         --var1.offset;
         var1.method5954();
      }

      this.field1389 = var1.method5956();
      this.field1390 = var1.readUnsignedShort();
      this.field1391 = var1.readByte();
      var1.method5954();
   }

   void method2192(class124 var1) {
      class106 var3 = new class106();
      var3.field1303 = new class406(this.field1389);
      var3.field1302 = this.field1390;
      var3.field1306 = this.field1391;
      var1.method2229(var3);
   }

   static void method2185() {
      client.field545 = 0;
      client.isMenuOpen = false;
   }
}
