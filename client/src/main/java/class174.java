public class class174 extends class186 {
   final class181 field2016;
   final int field2017;
   final int field2018;
   final int field2019;

   class174(class245 var1, class245 var2, int var3, class181 var4) {
      super(var1, var2);
      this.field2017 = var3;
      this.field2016 = var4;
      class141 var5 = class73.method1770(this.method3208());
      class398 var6 = var5.method2368(false);
      if (var6 != null) {
         this.field2018 = var6.field4270;
         this.field2019 = var6.field4271;
      } else {
         this.field2018 = 0;
         this.field2019 = 0;
      }

   }

   public int method3208() {
      return this.field2017;
   }

   class181 method3209() {
      return this.field2016;
   }

   int method3227() {
      return this.field2018;
   }

   int method3211() {
      return this.field2019;
   }
}
