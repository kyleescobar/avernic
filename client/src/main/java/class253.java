public abstract class class253 {
   class253() {
   }

   public static void method4319() {
      class151.field1680.method3883();
   }

   static final void method4317() {
      for(class71 var1 = (class71)client.field537.method4687(); null != var1; var1 = (class71)client.field537.method4678()) {
         if (var1.field1019 > 0) {
            --var1.field1019;
         }

         if (0 == var1.field1019) {
            if (var1.field1012 < 0 || class128.method2254(var1.field1012, var1.field1010)) {
               class201.method3685(var1.field1018, var1.field1009, var1.field1016, var1.field1011, var1.field1012, var1.field1013, var1.field1010);
               var1.remove();
            }
         } else {
            if (var1.field1008 > 0) {
               --var1.field1008;
            }

            if (0 == var1.field1008 && var1.field1016 >= 1 && var1.field1011 >= 1 && var1.field1016 <= 102 && var1.field1011 <= 102) {
               if (var1.field1015 >= 0) {
                  int var3 = var1.field1015;
                  int var4 = var1.field1017;
                  class156 var5 = class124.method2243(var3);
                  if (var4 == 11) {
                     var4 = 10;
                  }

                  if (var4 >= 5 && var4 <= 8) {
                     var4 = 4;
                  }

                  boolean var2 = var5.method2631(var4);
                  if (!var2) {
                     continue;
                  }
               }

               class201.method3685(var1.field1018, var1.field1009, var1.field1016, var1.field1011, var1.field1015, var1.field1014, var1.field1017);
               var1.field1008 = -1;
               if (var1.field1012 == var1.field1015 && var1.field1012 == -1) {
                  var1.remove();
               } else if (var1.field1012 == var1.field1015 && var1.field1013 == var1.field1014 && var1.field1010 == var1.field1017) {
                  var1.remove();
               }
            }
         }
      }

   }

   static final void method4302() {
      class172.method3134();
      if (class69.field972 != null) {
         class69.field972.method5120();
      }

   }

   public abstract void method4303(byte[] var1);

   abstract byte[] method4314();
}
