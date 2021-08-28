public class class90 extends class325 {
   static boolean field1232;
   final boolean field1234;

   public class90(boolean var1) {
      this.field1234 = var1;
   }

   int method2015(class328 var1, class328 var2) {
      if (var1.field3865 == client.field405) {
         if (var2.field3865 != client.field405) {
            return this.field1234 ? -1 : 1;
         }
      } else if (client.field405 == var2.field3865) {
         return this.field1234 ? 1 : -1;
      }

      return this.method5180(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method2015((class328)var1, (class328)var2);
   }

   static final int method2021() {
      return class208.field2476;
   }
}
