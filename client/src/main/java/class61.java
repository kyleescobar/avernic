public class class61 {
   static byte[][][] field895;
   static class397[] field897;
   class45[] field898 = new class45[100];
   int field894;

   class61() {
   }

   class45 method1616(int var1, String var2, String var3, String var4) {
      class45 var6 = this.field898[99];

      for(int var7 = this.field894; var7 > 0; --var7) {
         if (var7 != 100) {
            this.field898[var7] = this.field898[var7 - 1];
         }
      }

      if (null == var6) {
         var6 = new class45(var1, var2, var4, var3);
      } else {
         var6.remove();
         var6.method5435();
         var6.method773(var1, var2, var4, var3);
      }

      this.field898[0] = var6;
      if (this.field894 < 100) {
         ++this.field894;
      }

      return var6;
   }

   class45 method1613(int var1) {
      return var1 >= 0 && var1 < this.field894 ? this.field898[var1] : null;
   }

   int method1611() {
      return this.field894;
   }

   public static class398[] method1618(class277 var0, String var1, String var2) {
      int var4 = var0.readGroup(var1);
      int var5 = var0.method4430(var4, var2);
      return class72.method1761(var0, var4, var5);
   }

   static final void method1617() {
      if (class90.field1232) {
         if (null != class69.field972) {
            class69.field972.method5197();
         }

         class153.method2549();
         class90.field1232 = false;
      }

   }
}
