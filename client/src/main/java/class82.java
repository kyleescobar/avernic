public final class class82 extends class201 {
   static class21 field1163;
   static int field1165;
   int field1164;
   int field1167;

   class82() {
   }

   protected final class207 method3687() {
      return KeyHandler.method93(this.field1167).method2721(this.field1164);
   }

   static int method1873(int var0, int var1, int var2) {
      if (var2 > 179) {
         var1 /= 2;
      }

      if (var2 > 192) {
         var1 /= 2;
      }

      if (var2 > 217) {
         var1 /= 2;
      }

      if (var2 > 243) {
         var1 /= 2;
      }

      int var4 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
      return var4;
   }
}
