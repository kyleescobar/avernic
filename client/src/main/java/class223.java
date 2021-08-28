public final class class223 {
   class301 field2559 = new class301();
   class349 field2560 = new class349();
   class363 field2556;
   int field2557;
   int field2558;

   public class223(int var1) {
      this.field2557 = var1;
      this.field2558 = var1;

      int var2;
      for(var2 = 1; var2 + var2 < var1; var2 += var2) {
      }

      this.field2556 = new class363(var2);
   }

   public class349 method3880(long var1) {
      class349 var3 = (class349)this.field2556.method5716(var1);
      if (var3 != null) {
         this.field2559.method4812(var3);
      }

      return var3;
   }

   public void method3889(long var1) {
      class349 var3 = (class349)this.field2556.method5716(var1);
      if (var3 != null) {
         var3.remove();
         var3.method5435();
         ++this.field2558;
      }

   }

   public void method3882(class349 var1, long var2) {
      if (this.field2558 == 0) {
         class349 var4 = this.field2559.method4814();
         var4.remove();
         var4.method5435();
         if (var4 == this.field2560) {
            var4 = this.field2559.method4814();
            var4.remove();
            var4.method5435();
         }
      } else {
         --this.field2558;
      }

      this.field2556.method5727(var1, var2);
      this.field2559.method4812(var1);
   }

   public void method3883() {
      this.field2559.method4811();
      this.field2556.method5715();
      this.field2560 = new class349();
      this.field2558 = this.field2557;
   }
}
