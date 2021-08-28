public class class112 extends class120 {
   int field1349;
   // $FF: synthetic field
   final class121 this$0;

   class112(class121 var1) {
      this.this$0 = var1;
      this.field1349 = -1;
   }

   void method2191(Buffer var1) {
      this.field1349 = var1.readUnsignedShort();
      var1.readUnsignedByte();
      if (var1.readUnsignedByte() != 255) {
         --var1.offset;
         var1.method5954();
      }

   }

   void method2192(class124 var1) {
      var1.method2220(this.field1349);
   }
}
