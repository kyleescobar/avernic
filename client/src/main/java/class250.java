public class class250 {
   static class397[] field3107;

   public static boolean method4284(CharSequence var0) {
      return class25.method450(var0, 10, true);
   }

   static int method4285(PacketBuffer var0) {
      int var2 = var0.readBits(2);
      int var3;
      if (var2 == 0) {
         var3 = 0;
      } else if (var2 == 1) {
         var3 = var0.readBits(5);
      } else if (2 == var2) {
         var3 = var0.readBits(8);
      } else {
         var3 = var0.readBits(11);
      }

      return var3;
   }

   static final String method4283(int var0) {
      if (var0 < 100000) {
         return "<col=ffff00>" + var0 + "</col>";
      } else {
         return var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + class270.field3394 + "</col>" : "<col=00ff80>" + var0 / 1000000 + class270.field3392 + "</col>";
      }
   }

   static final void method4286(int var0) {
      class145.method2449();
      switch(var0) {
      case 1:
         class254.method4322();
         break;
      case 2:
         class330.method5287();
      }

   }
}
