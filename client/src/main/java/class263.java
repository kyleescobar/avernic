public class class263 {
   static {
      Math.sqrt(8192.0D);
   }

   static void method4334(Buffer var0, long var1) {
      var1 /= 10L;
      if (var1 < 0L) {
         var1 = 0L;
      } else if (var1 > 65535L) {
         var1 = 65535L;
      }

      var0.writeShort((int)var1);
   }

   static final void method4333() {
      if (class142.field1560 != null) {
         class142.field1560.method391();
      }

      if (null != class179.field2070) {
         class179.field2070.method391();
      }

   }
}
