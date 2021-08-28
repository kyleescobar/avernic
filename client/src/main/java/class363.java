import java.util.Iterator;

public final class class363 implements Iterable {
   class354 field4101;
   class354 field4103;
   class354[] field4102;
   int field4104;
   int field4105 = 0;

   public class363(int var1) {
      this.field4104 = var1;
      this.field4102 = new class354[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         class354 var3 = this.field4102[var2] = new class354();
         var3.field3965 = var3;
         var3.field3967 = var3;
      }

   }

   public class354 method5716(long var1) {
      class354 var3 = this.field4102[(int)(var1 & (long)(this.field4104 - 1))];

      for(this.field4103 = var3.field3965; this.field4103 != var3; this.field4103 = this.field4103.field3965) {
         if (this.field4103.field3966 == var1) {
            class354 var4 = this.field4103;
            this.field4103 = this.field4103.field3965;
            return var4;
         }
      }

      this.field4103 = null;
      return null;
   }

   public void method5727(class354 var1, long var2) {
      if (var1.field3967 != null) {
         var1.remove();
      }

      class354 var4 = this.field4102[(int)(var2 & (long)(this.field4104 - 1))];
      var1.field3967 = var4.field3967;
      var1.field3965 = var4;
      var1.field3967.field3965 = var1;
      var1.field3965.field3967 = var1;
      var1.field3966 = var2;
   }

   public void method5715() {
      for(int var1 = 0; var1 < this.field4104; ++var1) {
         class354 var2 = this.field4102[var1];

         while(true) {
            class354 var3 = var2.field3965;
            if (var3 == var2) {
               break;
            }

            var3.remove();
         }
      }

      this.field4103 = null;
      this.field4101 = null;
   }

   public class354 method5719() {
      this.field4105 = 0;
      return this.method5720();
   }

   public class354 method5720() {
      class354 var1;
      if (this.field4105 > 0 && this.field4101 != this.field4102[this.field4105 - 1]) {
         var1 = this.field4101;
         this.field4101 = var1.field3965;
         return var1;
      } else {
         do {
            if (this.field4105 >= this.field4104) {
               return null;
            }

            var1 = this.field4102[this.field4105++].field3965;
         } while(var1 == this.field4102[this.field4105 - 1]);

         this.field4101 = var1.field3965;
         return var1;
      }
   }

   public Iterator iterator() {
      return new class362(this);
   }
}
