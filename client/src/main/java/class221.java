public final class class221 {
   class220 field2554;
   class301 field2553;
   class363 field2552;
   int field2550;
   int field2551;

   public class221(int var1) {
      this(var1, var1);
   }

   public class221(int var1, int var2) {
      this.field2553 = new class301();
      this.field2550 = var1;
      this.field2551 = var1;

      int var3;
      for(var3 = 1; var3 + var3 < var1 && var3 < var2; var3 += var3) {
      }

      this.field2552 = new class363(var3);
   }

   public Object method3857(long var1) {
      class225 var3 = (class225)this.field2552.method5716(var1);
      if (var3 == null) {
         return null;
      } else {
         Object var4 = var3.method3891();
         if (var4 == null) {
            var3.remove();
            var3.method5435();
            this.field2551 += var3.field2562;
            return null;
         } else {
            if (var3.method3893()) {
               class224 var5 = new class224(var4, var3.field2562);
               this.field2552.method5727(var5, var3.field3966);
               this.field2553.method4812(var5);
               var5.field3958 = 0L;
               var3.remove();
               var3.method5435();
            } else {
               this.field2553.method4812(var3);
               var3.field3958 = 0L;
            }

            return var4;
         }
      }
   }

   void method3858(long var1) {
      class225 var3 = (class225)this.field2552.method5716(var1);
      this.method3859(var3);
   }

   void method3859(class225 var1) {
      if (var1 != null) {
         var1.remove();
         var1.method5435();
         this.field2551 += var1.field2562;
      }

   }

   public void method3860(Object var1, long var2) {
      this.method3861(var1, var2, 1);
   }

   public void method3861(Object var1, long var2, int var4) {
      if (var4 > this.field2550) {
         throw new IllegalStateException();
      } else {
         this.method3858(var2);
         this.field2551 -= var4;

         while(this.field2551 < 0) {
            class225 var5 = (class225)this.field2553.method4814();
            if (var5 == null) {
               throw new RuntimeException("");
            }

            if (!var5.method3893()) {
            }

            this.method3859(var5);
            if (this.field2554 != null) {
               this.field2554.method3853(var5.method3891());
            }
         }

         class224 var6 = new class224(var1, var4);
         this.field2552.method5727(var6, var2);
         this.field2553.method4812(var6);
         var6.field3958 = 0L;
      }
   }

   public void method3862(int var1) {
      for(class225 var2 = (class225)this.field2553.method4815(); var2 != null; var2 = (class225)this.field2553.method4817()) {
         if (var2.method3893()) {
            if (var2.method3891() == null) {
               var2.remove();
               var2.method5435();
               this.field2551 += var2.field2562;
            }
         } else if (++var2.field3958 > (long)var1) {
            class222 var3 = new class222(var2.method3891(), var2.field2562);
            this.field2552.method5727(var3, var2.field3966);
            class301.method4813(var3, var2);
            var2.remove();
            var2.method5435();
         }
      }

   }

   public void method3863() {
      this.field2553.method4811();
      this.field2552.method5715();
      this.field2551 = this.field2550;
   }
}
