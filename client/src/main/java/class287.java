import java.util.Comparator;

final class class287 implements Comparator {
   static class372 field3664;

   int method4590(class285 var1, class285 var2) {
      return var1.field3647.field3656 < var2.field3647.field3656 ? -1 : (var2.field3647.field3656 == var1.field3647.field3656 ? 0 : 1);
   }

   public int compare(Object var1, Object var2) {
      return this.method4590((class285)var1, (class285)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   static void method4592(Interface var0, int var1, int var2, boolean var3) {
      int var5 = var0.field2973;
      int var6 = var0.field2990;
      if (var0.field3033 == 0) {
         var0.field2973 = var0.field2969;
      } else if (var0.field3033 == 1) {
         var0.field2973 = var1 - var0.field2969;
      } else if (var0.field3033 == 2) {
         var0.field2973 = var1 * var0.field2969 >> 14;
      }

      if (var0.field3092 == 0) {
         var0.field2990 = var0.field2970;
      } else if (var0.field3092 == 1) {
         var0.field2990 = var2 - var0.field2970;
      } else if (var0.field3092 == 2) {
         var0.field2990 = var0.field2970 * var2 >> 14;
      }

      if (var0.field3033 == 4) {
         var0.field2973 = var0.field2990 * var0.field2975 / var0.field2976;
      }

      if (var0.field3092 == 4) {
         var0.field2990 = var0.field2976 * var0.field2973 / var0.field2975;
      }

      if (var0.field2962 == 1337) {
         client.field580 = var0;
      }

      if (var3 && null != var0.field3072 && (var5 != var0.field2973 || var0.field2990 != var6)) {
         ScriptEvent var7 = new ScriptEvent();
         var7.field961 = var0;
         var7.args = var0.field3072;
         client.field611.method4672(var7);
      }

   }
}
