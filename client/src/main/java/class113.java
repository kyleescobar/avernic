public class class113 extends class104 {
   String field1353;
   // $FF: synthetic field
   final class107 this$0;

   class113(class107 var1) {
      this.this$0 = var1;
   }

   void method2083(Buffer var1) {
      this.field1353 = var1.readStringNullTerminated();
      var1.readInt();
   }

   void method2084(class115 var1) {
      var1.field1368 = this.field1353;
   }

   static class48 method2115() {
      return class48.field694 < class48.field692 ? class16.field86[++class48.field694 - 1] : null;
   }

   static void triggerInterfaceListeners(int var0) {
      if (-1 != var0) {
         if (class251.method4294(var0)) {
            Interface[] var2 = Interface.components[var0];

            for(int var3 = 0; var3 < var2.length; ++var3) {
               Interface var4 = var2[var3];
               if (null != var4.field3045) {
                  class68 var5 = new class68();
                  var5.field961 = var4;
                  var5.field955 = var4.field3045;
                  class79.method1844(var5, 5000000, 0);
               }
            }

         }
      }
   }
}
