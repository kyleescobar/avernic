public class class102 extends class104 {
   String field1284;
   long field1285;
   // $FF: synthetic field
   final class107 this$0;

   public static void method2079(class251 var0) {
      class252.field3117 = var0;
   }

   public static class154 method2080(int var0) {
      class154 var2 = (class154)class154.field1704.method3880((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = class154.field1703.method4412(34, var0);
         var2 = new class154();
         if (var3 != null) {
            var2.method2570(new Buffer(var3));
         }

         var2.method2569();
         class154.field1704.method3882(var2, (long)var0);
         return var2;
      }
   }

   class102(class107 var1) {
      this.this$0 = var1;
      this.field1285 = -1L;
      this.field1284 = null;
   }

   void method2083(Buffer var1) {
      if (var1.readUnsignedByte() != 255) {
         --var1.offset;
         this.field1285 = var1.method5954();
      }

      this.field1284 = var1.method5956();
   }

   void method2084(class115 var1) {
      var1.method2124(this.field1285, this.field1284, 0);
   }
}
