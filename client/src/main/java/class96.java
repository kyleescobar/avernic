public class class96 extends class325 {
   static class397 field1257;
   static String[] field1254;
   final boolean field1256;

   public class96(boolean var1) {
      this.field1256 = var1;
   }

   int method2060(class328 var1, class328 var2) {
      if (var1.field3866 != var2.field3866) {
         return this.field1256 ? var1.field3866 - var2.field3866 : var2.field3866 - var1.field3866;
      } else {
         return this.method5180(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method2060((class328)var1, (class328)var2);
   }

   static final void method2064(double var0) {
      Rasterizer3D.method3420(var0);
      ((class205) Rasterizer3D.field2269).method3705(var0);
      class157.field1837.method3883();
      class38.clientPreferences.field1118 = var0;
      class135.savePreferences();
   }
}
