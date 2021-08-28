import java.util.Comparator;

public abstract class class325 implements Comparator {
   static int[] field3854;
   Comparator field3856;

   protected class325() {
   }

   final void method5177(Comparator var1) {
      if (null == this.field3856) {
         this.field3856 = var1;
      } else if (this.field3856 instanceof class325) {
         ((class325)this.field3856).method5177(var1);
      }

   }

   protected final int method5180(class324 var1, class324 var2) {
      return this.field3856 == null ? 0 : this.field3856.compare(var1, var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public static String method5183(CharSequence var0) {
      String var2 = class84.method1928(class288.method4615(var0));
      if (var2 == null) {
         var2 = "";
      }

      return var2;
   }
}
