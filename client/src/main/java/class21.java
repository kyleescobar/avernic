public class class21 extends class31 {
   class296 field157 = new class296();
   class296 field159 = new class296();
   int field156 = 0;
   int field158 = -1;

   public final synchronized void method329(class31 var1) {
      this.field159.method4673(var1);
   }

   public final synchronized void method336(class31 var1) {
      var1.remove();
   }

   void method331() {
      if (this.field156 > 0) {
         for(class36 var1 = (class36)this.field157.method4687(); var1 != null; var1 = (class36)this.field157.method4678()) {
            var1.field299 -= this.field156;
         }

         this.field158 -= this.field156;
         this.field156 = 0;
      }

   }

   void method330(class354 var1, class36 var2) {
      while(var1 != this.field157.field3718 && ((class36)var1).field299 <= var2.field299) {
         var1 = var1.field3965;
      }

      class296.method4674(var2, var1);
      this.field158 = ((class36)this.field157.field3718.field3965).field299;
   }

   void method332(class36 var1) {
      var1.remove();
      var1.method710();
      class354 var2 = this.field157.field3718.field3965;
      if (var2 == this.field157.field3718) {
         this.field158 = -1;
      } else {
         this.field158 = ((class36)var2).field299;
      }

   }

   protected class31 method643() {
      return (class31)this.field159.method4687();
   }

   protected class31 method631() {
      return (class31)this.field159.method4678();
   }

   protected int method632() {
      return 0;
   }

   public final synchronized void method641(int[] var1, int var2, int var3) {
      do {
         if (this.field158 < 0) {
            this.method334(var1, var2, var3);
            return;
         }

         if (this.field156 + var3 < this.field158) {
            this.field156 += var3;
            this.method334(var1, var2, var3);
            return;
         }

         int var4 = this.field158 - this.field156;
         this.method334(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.field156 += var4;
         this.method331();
         class36 var5 = (class36)this.field157.method4687();
         synchronized(var5) {
            int var7 = var5.method711(this);
            if (var7 < 0) {
               var5.field299 = 0;
               this.method332(var5);
            } else {
               var5.field299 = var7;
               this.method330(var5.field3965, var5);
            }
         }
      } while(var3 != 0);

   }

   void method334(int[] var1, int var2, int var3) {
      for(class31 var4 = (class31)this.field159.method4687(); var4 != null; var4 = (class31)this.field159.method4678()) {
         var4.method633(var1, var2, var3);
      }

   }

   public final synchronized void method635(int var1) {
      do {
         if (this.field158 < 0) {
            this.method328(var1);
            return;
         }

         if (this.field156 + var1 < this.field158) {
            this.field156 += var1;
            this.method328(var1);
            return;
         }

         int var2 = this.field158 - this.field156;
         this.method328(var2);
         var1 -= var2;
         this.field156 += var2;
         this.method331();
         class36 var3 = (class36)this.field157.method4687();
         synchronized(var3) {
            int var5 = var3.method711(this);
            if (var5 < 0) {
               var3.field299 = 0;
               this.method332(var3);
            } else {
               var3.field299 = var5;
               this.method330(var3.field3965, var3);
            }
         }
      } while(var1 != 0);

   }

   void method328(int var1) {
      for(class31 var2 = (class31)this.field159.method4687(); var2 != null; var2 = (class31)this.field159.method4678()) {
         var2.method635(var1);
      }

   }
}
