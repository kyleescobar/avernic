public class class121 {
   public static int field1418;
   static class275 archive0;
   class298 field1411 = new class298();
   long field1413 = -1L;
   long field1419;

   public class121(Buffer var1) {
      this.method2211(var1);
   }

   static void addGameMessage(int var0, String var1, String var2) {
      class130.method2276(var0, var1, var2, (String)null);
   }

   void method2211(Buffer var1) {
      this.field1419 = var1.method5954();
      this.field1413 = var1.method5954();

      for(int var3 = var1.readUnsignedByte(); var3 != 0; var3 = var1.readUnsignedByte()) {
         Object var4;
         if (1 == var3) {
            var4 = new class116(this);
         } else if (var3 == 4) {
            var4 = new class127(this);
         } else if (var3 == 3) {
            var4 = new class112(this);
         } else if (2 == var3) {
            var4 = new class110(this);
         } else {
            if (var3 != 5) {
               throw new RuntimeException("");
            }

            var4 = new class117(this);
         }

         ((class120)var4).method2191(var1);
         this.field1411.method4721((class354)var4);
      }

   }

   public void method2203(class124 var1) {
      if (var1.field3966 == this.field1419 && var1.field1434 == this.field1413) {
         for(class120 var3 = (class120)this.field1411.method4724(); null != var3; var3 = (class120)this.field1411.method4726()) {
            var3.method2192(var1);
         }

         ++var1.field1434;
      } else {
         throw new RuntimeException("");
      }
   }

   public static boolean method2212(int var0) {
      return var0 >= 0 && var0 < 112 ? KeyHandler.field39[var0] : false;
   }
}
