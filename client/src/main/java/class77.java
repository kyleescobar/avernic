public class class77 extends class354 {
   class144 field1129;
   class298 field1128 = new class298();

   class77(class144 var1) {
      this.field1129 = var1;
   }

   static String method1822(int var0) {
      return "<img=" + var0 + ">";
   }

   void method1827(int var1, int var2, int var3, int var4) {
      class73 var6 = null;
      int var7 = 0;

      for(class73 var8 = (class73)this.field1128.method4724(); null != var8; var8 = (class73)this.field1128.method4726()) {
         ++var7;
         if (var8.field1081 == var1) {
            var8.method1766(var1, var2, var3, var4);
            return;
         }

         if (var8.field1081 <= var1) {
            var6 = var8;
         }
      }

      if (null == var6) {
         if (var7 < 4) {
            this.field1128.method4722(new class73(var1, var2, var3, var4));
         }

      } else {
         class298.method4778(new class73(var1, var2, var3, var4), var6);
         if (var7 >= 4) {
            this.field1128.method4724().remove();
         }

      }
   }

   class73 method1830(int var1) {
      class73 var3 = (class73)this.field1128.method4724();
      if (var3 != null && var3.field1081 <= var1) {
         for(class73 var4 = (class73)this.field1128.method4726(); null != var4 && var4.field1081 <= var1; var4 = (class73)this.field1128.method4726()) {
            var3.remove();
            var3 = var4;
         }

         if (this.field1129.field1587 + var3.field1081 + var3.field1084 > var1) {
            return var3;
         } else {
            var3.remove();
            return null;
         }
      } else {
         return null;
      }
   }

   boolean method1823() {
      return this.field1128.method4788();
   }

   static final void method1831(Interface[] var0, int var1) {
      for(int var3 = 0; var3 < var0.length; ++var3) {
         Interface var4 = var0[var3];
         if (var4 != null) {
            if (var4.field2977 == 0) {
               if (var4.field3061 != null) {
                  method1831(var4.field3061, var1);
               }

               InterfaceParent var5 = (InterfaceParent)client.interfaceParents.get((long)var4.id);
               if (var5 != null) {
                  class163.dispatchInterfaceCloseEvent(var5.field950, var1);
               }
            }

            class68 var6;
            if (var1 == 0 && var4.field3008 != null) {
               var6 = new class68();
               var6.field961 = var4;
               var6.field955 = var4.field3008;
               class95.method2055(var6);
            }

            if (var1 == 1 && var4.field3076 != null) {
               if (var4.field3031 >= 0) {
                  Interface var7 = class87.getComponent(var4.id);
                  if (null == var7 || var7.field3061 == null || var4.field3031 >= var7.field3061.length || var4 != var7.field3061[var4.field3031]) {
                     continue;
                  }
               }

               var6 = new class68();
               var6.field961 = var4;
               var6.field955 = var4.field3076;
               class95.method2055(var6);
            }
         }
      }

   }
}
