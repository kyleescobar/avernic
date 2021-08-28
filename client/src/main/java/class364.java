public final class class364 {
   class354 field4108;
   class354 field4109;
   class354[] field4107;
   int field4106;
   int field4110 = 0;

   public class364(int var1) {
      this.field4106 = var1;
      this.field4107 = new class354[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         class354 var3 = this.field4107[var2] = new class354();
         var3.field3965 = var3;
         var3.field3967 = var3;
      }

   }

   public class354 get(long var1) {
      class354 var3 = this.field4107[(int)(var1 & (long)(this.field4106 - 1))];

      for(this.field4108 = var3.field3965; this.field4108 != var3; this.field4108 = this.field4108.field3965) {
         if (this.field4108.field3966 == var1) {
            class354 var4 = this.field4108;
            this.field4108 = this.field4108.field3965;
            return var4;
         }
      }

      this.field4108 = null;
      return null;
   }

   public void put(class354 var1, long var2) {
      if (var1.field3967 != null) {
         var1.remove();
      }

      class354 var4 = this.field4107[(int)(var2 & (long)(this.field4106 - 1))];
      var1.field3967 = var4.field3967;
      var1.field3965 = var4;
      var1.field3967.field3965 = var1;
      var1.field3965.field3967 = var1;
      var1.field3966 = var2;
   }

   public class354 method5736() {
      this.field4110 = 0;
      return this.method5739();
   }

   public class354 method5739() {
      class354 var1;
      if (this.field4110 > 0 && this.field4109 != this.field4107[this.field4110 - 1]) {
         var1 = this.field4109;
         this.field4109 = var1.field3965;
         return var1;
      } else {
         do {
            if (this.field4110 >= this.field4106) {
               return null;
            }

            var1 = this.field4107[this.field4110++].field3965;
         } while(var1 == this.field4107[this.field4110 - 1]);

         this.field4109 = var1.field3965;
         return var1;
      }
   }
}
