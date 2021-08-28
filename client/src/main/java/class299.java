public class class299 {
   class348 field3725;
   class348 field3726 = new class348();

   public class299() {
      this.field3726.field3957 = this.field3726;
      this.field3726.field3956 = this.field3726;
   }

   public void method4795(class348 var1) {
      if (var1.field3956 != null) {
         var1.method5432();
      }

      var1.field3956 = this.field3726.field3956;
      var1.field3957 = this.field3726;
      var1.field3956.field3957 = var1;
      var1.field3957.field3956 = var1;
   }

   public class348 method4797() {
      class348 var1 = this.field3726.field3957;
      if (var1 == this.field3726) {
         this.field3725 = null;
         return null;
      } else {
         this.field3725 = var1.field3957;
         return var1;
      }
   }

   public class348 method4798() {
      class348 var1 = this.field3725;
      if (var1 == this.field3726) {
         this.field3725 = null;
         return null;
      } else {
         this.field3725 = var1.field3957;
         return var1;
      }
   }
}
