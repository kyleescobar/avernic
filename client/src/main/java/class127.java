public class class127 extends class120 {
   public static char field1450;
   static class275 archive9;
   static class398[] field1452;
   byte field1451;
   byte field1455;
   String field1453;
   // $FF: synthetic field
   final class121 this$0;

   class127(class121 var1) {
      this.this$0 = var1;
   }

   void method2191(Buffer var1) {
      this.field1453 = var1.method5956();
      if (null != this.field1453) {
         var1.readUnsignedByte();
         this.field1455 = var1.readByte();
         this.field1451 = var1.readByte();
      }

   }

   void method2192(class124 var1) {
      var1.field1430 = this.field1453;
      if (null != this.field1453) {
         var1.field1431 = this.field1455;
         var1.field1437 = this.field1451;
      }

   }
}
