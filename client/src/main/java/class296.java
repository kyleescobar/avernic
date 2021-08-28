public class class296 {
   class354 field3719;
   public class354 field3718 = new class354();

   public class296() {
      this.field3718.field3965 = this.field3718;
      this.field3718.field3967 = this.field3718;
   }

   public void method4671() {
      while(true) {
         class354 var1 = this.field3718.field3965;
         if (var1 == this.field3718) {
            this.field3719 = null;
            return;
         }

         var1.remove();
      }
   }

   public void method4672(class354 var1) {
      if (var1.field3967 != null) {
         var1.remove();
      }

      var1.field3967 = this.field3718.field3967;
      var1.field3965 = this.field3718;
      var1.field3967.field3965 = var1;
      var1.field3965.field3967 = var1;
   }

   public void method4673(class354 var1) {
      if (var1.field3967 != null) {
         var1.remove();
      }

      var1.field3967 = this.field3718;
      var1.field3965 = this.field3718.field3965;
      var1.field3967.field3965 = var1;
      var1.field3965.field3967 = var1;
   }

   public static void method4674(class354 var0, class354 var1) {
      if (var0.field3967 != null) {
         var0.remove();
      }

      var0.field3967 = var1.field3967;
      var0.field3965 = var1;
      var0.field3967.field3965 = var0;
      var0.field3965.field3967 = var0;
   }

   public class354 method4699() {
      class354 var1 = this.field3718.field3965;
      if (var1 == this.field3718) {
         return null;
      } else {
         var1.remove();
         return var1;
      }
   }

   public class354 method4675() {
      class354 var1 = this.field3718.field3967;
      if (var1 == this.field3718) {
         return null;
      } else {
         var1.remove();
         return var1;
      }
   }

   public class354 method4687() {
      class354 var1 = this.field3718.field3965;
      if (var1 == this.field3718) {
         this.field3719 = null;
         return null;
      } else {
         this.field3719 = var1.field3965;
         return var1;
      }
   }

   public class354 method4694() {
      class354 var1 = this.field3718.field3967;
      if (var1 == this.field3718) {
         this.field3719 = null;
         return null;
      } else {
         this.field3719 = var1.field3967;
         return var1;
      }
   }

   public class354 method4678() {
      class354 var1 = this.field3719;
      if (var1 == this.field3718) {
         this.field3719 = null;
         return null;
      } else {
         this.field3719 = var1.field3965;
         return var1;
      }
   }

   public class354 method4679() {
      class354 var1 = this.field3719;
      if (var1 == this.field3718) {
         this.field3719 = null;
         return null;
      } else {
         this.field3719 = var1.field3967;
         return var1;
      }
   }
}
