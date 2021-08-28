public class class310 {
   public static byte[][][] field3775;
   public static int[] field3774;
   static byte[][] field3770 = new byte[50][];
   static byte[][] field3771 = new byte[1000][];
   static byte[][] field3772 = new byte[250][];
   static int field3768 = 0;
   static int field3769 = 0;
   static int field3773 = 0;
   static String field3776;

   static synchronized byte[] method5045(int var0, boolean var1) {
      byte[] var5;
      if ((100 == var0 || var0 < 100 && var1) && field3768 > 0) {
         var5 = field3771[--field3768];
         field3771[field3768] = null;
         return var5;
      } else if ((5000 == var0 || var0 < 5000 && var1) && field3773 > 0) {
         var5 = field3772[--field3773];
         field3772[field3773] = null;
         return var5;
      } else if ((var0 == 30000 || var0 < 30000 && var1) && field3769 > 0) {
         var5 = field3770[--field3769];
         field3770[field3769] = null;
         return var5;
      } else {
         int var3;
         if (field3775 != null) {
            for(var3 = 0; var3 < field3774.length; ++var3) {
               if ((var0 == field3774[var3] || var0 < field3774[var3] && var1) && class128.field1460[var3] > 0) {
                  byte[] var4 = field3775[var3][--class128.field1460[var3]];
                  field3775[var3][class128.field1460[var3]] = null;
                  return var4;
               }
            }
         }

         if (var1 && field3774 != null) {
            for(var3 = 0; var3 < field3774.length; ++var3) {
               if (var0 <= field3774[var3] && class128.field1460[var3] < field3775[var3].length) {
                  return new byte[field3774[var3]];
               }
            }
         }

         return new byte[var0];
      }
   }
}
