public final class class295 {
   class349 field3717 = new class349();

   public class295() {
      this.field3717.field3959 = this.field3717;
      this.field3717.field3960 = this.field3717;
   }

   public void method4659(class349 var1) {
      if (var1.field3960 != null) {
         var1.method5435();
      }

      var1.field3960 = this.field3717.field3960;
      var1.field3959 = this.field3717;
      var1.field3960.field3959 = var1;
      var1.field3959.field3960 = var1;
   }

   public void method4660(class349 var1) {
      if (var1.field3960 != null) {
         var1.method5435();
      }

      var1.field3960 = this.field3717;
      var1.field3959 = this.field3717.field3959;
      var1.field3960.field3959 = var1;
      var1.field3959.field3960 = var1;
   }

   public class349 method4664() {
      class349 var1 = this.field3717.field3959;
      return var1 == this.field3717 ? null : var1;
   }
}
