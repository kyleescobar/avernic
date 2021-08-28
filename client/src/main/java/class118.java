public class class118 extends class104 {
   static int field1400;
   int field1402;
   // $FF: synthetic field
   final class107 this$0;

   public static class397 method2187(class277 var0, String var1, String var2) {
      int var4 = var0.readGroup(var1);
      int var5 = var0.method4430(var4, var2);
      class397 var6;
      if (!class291.method4622(var0, var4, var5)) {
         var6 = null;
      } else {
         class397 var8 = new class397();
         var8.field4267 = class399.field4281;
         var8.field4268 = class399.field4286;
         var8.field4265 = class399.field4284[0];
         var8.field4266 = class399.field4285[0];
         var8.field4263 = class106.field1308[0];
         var8.field4264 = class375.field4156[0];
         var8.field4261 = class119.field1407;
         var8.field4262 = class399.field4283[0];
         class399.field4284 = null;
         class399.field4285 = null;
         class106.field1308 = null;
         class375.field4156 = null;
         class119.field1407 = null;
         class399.field4283 = (byte[][])null;
         var6 = var8;
      }

      return var6;
   }

   class118(class107 var1) {
      this.this$0 = var1;
      this.field1402 = -1;
   }

   void method2083(Buffer var1) {
      this.field1402 = var1.readUnsignedShort();
   }

   void method2084(class115 var1) {
      var1.method2128(this.field1402);
   }
}
