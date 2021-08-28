import java.util.Iterator;

public class class301 implements Iterable {
   class349 field3730;
   public class349 field3731 = new class349();

   public class301() {
      this.field3731.field3959 = this.field3731;
      this.field3731.field3960 = this.field3731;
   }

   public void method4811() {
      while(this.field3731.field3959 != this.field3731) {
         this.field3731.field3959.method5435();
      }

   }

   public void method4812(class349 var1) {
      if (var1.field3960 != null) {
         var1.method5435();
      }

      var1.field3960 = this.field3731.field3960;
      var1.field3959 = this.field3731;
      var1.field3960.field3959 = var1;
      var1.field3959.field3960 = var1;
   }

   public static void method4813(class349 var0, class349 var1) {
      if (var0.field3960 != null) {
         var0.method5435();
      }

      var0.field3960 = var1;
      var0.field3959 = var1.field3959;
      var0.field3960.field3959 = var0;
      var0.field3959.field3960 = var0;
   }

   public class349 method4814() {
      class349 var1 = this.field3731.field3959;
      if (var1 == this.field3731) {
         return null;
      } else {
         var1.method5435();
         return var1;
      }
   }

   public class349 method4815() {
      return this.method4816((class349)null);
   }

   class349 method4816(class349 var1) {
      class349 var2;
      if (var1 == null) {
         var2 = this.field3731.field3959;
      } else {
         var2 = var1;
      }

      if (var2 == this.field3731) {
         this.field3730 = null;
         return null;
      } else {
         this.field3730 = var2.field3959;
         return var2;
      }
   }

   public class349 method4817() {
      class349 var1 = this.field3730;
      if (var1 == this.field3731) {
         this.field3730 = null;
         return null;
      } else {
         this.field3730 = var1.field3959;
         return var1;
      }
   }

   public Iterator iterator() {
      return new class300(this);
   }
}
