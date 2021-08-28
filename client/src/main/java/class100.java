public class class100 implements class290 {
   public static final class100 field1268 = new class100(2, 2);
   public static final class100 field1269 = new class100(0, 1);
   public static final class100 field1271 = new class100(1, 3);
   public static final class100 field1277 = new class100(3, 0);
   static class372 field1272;
   final int field1273;
   public final int field1270;

   class100(int var1, int var2) {
      this.field1270 = var1;
      this.field1273 = var2;
   }

   public int method4619() {
      return this.field1273;
   }

   public static class146 method2074(int var0) {
      class146 var2 = (class146)class146.field1597.method3880((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = class146.field1601.method4412(8, var0);
         var2 = new class146();
         if (null != var3) {
            var2.method2454(new Buffer(var3));
         }

         class146.field1597.method3882(var2, (long)var0);
         return var2;
      }
   }
}
