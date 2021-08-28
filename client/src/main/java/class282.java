import java.util.Comparator;

final class class282 implements Comparator {
   public static int field3631;
   public static int field3634;

   int method4534(class285 var1, class285 var2) {
      return var1.field3646 < var2.field3646 ? -1 : (var1.field3646 == var2.field3646 ? 0 : 1);
   }

   public int compare(Object var1, Object var2) {
      return this.method4534((class285)var1, (class285)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public static int method4545(String var0) {
      return var0.length() + 2;
   }

   public static boolean method4533(char var0) {
      return var0 >= '0' && var0 <= '9';
   }

   static final int method4540(int var0, int var1) {
      int var3 = class153.method2563(var0 - 1, var1 - 1) + class153.method2563(1 + var0, var1 - 1) + class153.method2563(var0 - 1, var1 + 1) + class153.method2563(1 + var0, var1 + 1);
      int var4 = class153.method2563(var0 - 1, var1) + class153.method2563(var0 + 1, var1) + class153.method2563(var0, var1 - 1) + class153.method2563(var0, 1 + var1);
      int var5 = class153.method2563(var0, var1);
      return var5 / 4 + var3 / 16 + var4 / 8;
   }

   static int method4546(int var0) {
      return (int)Math.pow(2.0D, (double)((float)var0 / 256.0F + 7.0F));
   }
}
