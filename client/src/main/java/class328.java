public class class328 extends class324 {
   static int field3864;
   static int field3870;
   public int field3865 = -1;
   public int field3866;
   public int field3869;

   class328() {
   }

   void method5275(int var1, int var2) {
      this.field3865 = var1;
      this.field3869 = var2;
   }

   public int method5268() {
      return this.field3865;
   }

   public boolean method5276() {
      return this.field3865 > 0;
   }

   static int method5277(int var0, class59 var1, boolean var2) {
      Interface var6;
      if (var0 == 2700) {
         var6 = class87.getComponent(class51.field747[--class51.field746]);
         class51.field747[++class51.field746 - 1] = var6.field3088;
         return 1;
      } else if (var0 == 2701) {
         var6 = class87.getComponent(class51.field747[--class51.field746]);
         if (var6.field3088 != -1) {
            class51.field747[++class51.field746 - 1] = var6.field3089;
         } else {
            class51.field747[++class51.field746 - 1] = 0;
         }

         return 1;
      } else if (var0 == 2702) {
         int var4 = class51.field747[--class51.field746];
         InterfaceParent var5 = (InterfaceParent)client.interfaceParents.get((long)var4);
         if (null != var5) {
            class51.field747[++class51.field746 - 1] = 1;
         } else {
            class51.field747[++class51.field746 - 1] = 0;
         }

         return 1;
      } else if (2706 == var0) {
         class51.field747[++class51.field746 - 1] = client.rootInterface;
         return 1;
      } else {
         return 2;
      }
   }
}
