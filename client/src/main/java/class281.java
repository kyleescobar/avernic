import java.util.Comparator;

final class class281 implements Comparator {
   static int baseX;
   static int field3629;
   static long field3626;

   int method4521(class285 var1, class285 var2) {
      return var1.method4557().compareTo(var2.method4557());
   }

   public int compare(Object var1, Object var2) {
      return this.method4521((class285)var1, (class285)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public static int method4532(String var0) {
      return var0.length() + 1;
   }
}
