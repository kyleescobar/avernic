public class class182 {
   static class33 field2087;
   static final class182 field2090 = new class182(1);
   static final class182 field2091 = new class182(0);
   final int field2089;

   class182(int var1) {
      this.field2089 = var1;
   }

   public static String method3190(CharSequence[] var0, int var1, int var2) {
      if (var2 == 0) {
         return "";
      } else if (1 == var2) {
         CharSequence var9 = var0[var1];
         return null == var9 ? "null" : var9.toString();
      } else {
         int var4 = var2 + var1;
         int var5 = 0;

         for(int var6 = var1; var6 < var4; ++var6) {
            CharSequence var7 = var0[var6];
            if (var7 == null) {
               var5 += 4;
            } else {
               var5 += var7.length();
            }
         }

         StringBuilder var10 = new StringBuilder(var5);

         for(int var11 = var1; var11 < var4; ++var11) {
            CharSequence var8 = var0[var11];
            if (null == var8) {
               var10.append("null");
            } else {
               var10.append(var8);
            }
         }

         return var10.toString();
      }
   }
}
