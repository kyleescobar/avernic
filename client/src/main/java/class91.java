public class class91 extends class325 {
   final boolean field1236;

   public class91(boolean var1) {
      this.field1236 = var1;
   }

   int method2023(class328 var1, class328 var2) {
      if (var1.field3865 != 0 && 0 != var2.field3865) {
         return this.field1236 ? var1.field3869 - var2.field3869 : var2.field3869 - var1.field3869;
      } else {
         return this.method5180(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method2023((class328)var1, (class328)var2);
   }
}
