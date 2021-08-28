public class class324 implements Comparable {
   class406 field3852;
   class406 field3853;

   class324() {
   }

   public class406 method5167() {
      return this.field3853;
   }

   public String method5155() {
      return null == this.field3853 ? "" : this.field3853.getName();
   }

   public String method5156() {
      return null == this.field3852 ? "" : this.field3852.getName();
   }

   void method5157(class406 var1, class406 var2) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.field3853 = var1;
         this.field3852 = var2;
      }
   }

   public int method5158(class324 var1) {
      return this.field3853.method6524(var1.field3853);
   }

   public int compareTo(Object var1) {
      return this.method5158((class324)var1);
   }

   static void method5154(int var0, boolean var1, int var2, boolean var3) {
      if (class16.field86 != null) {
         class368.method5762(0, class16.field86.length - 1, var0, var1, var2, var3);
      }

   }
}
