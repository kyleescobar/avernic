import java.util.Iterator;

public class class362 implements Iterator {
   class354 field4098;
   class354 field4100 = null;
   class363 field4099;
   int field4097;

   class362(class363 var1) {
      this.field4099 = var1;
      this.method5713();
   }

   void method5713() {
      this.field4098 = this.field4099.field4102[0].field3965;
      this.field4097 = 1;
      this.field4100 = null;
   }

   public Object next() {
      class354 var1;
      if (this.field4098 != this.field4099.field4102[this.field4097 - 1]) {
         var1 = this.field4098;
         this.field4098 = var1.field3965;
         this.field4100 = var1;
         return var1;
      } else {
         do {
            if (this.field4097 >= this.field4099.field4104) {
               return null;
            }

            var1 = this.field4099.field4102[this.field4097++].field3965;
         } while(var1 == this.field4099.field4102[this.field4097 - 1]);

         this.field4098 = var1.field3965;
         this.field4100 = var1;
         return var1;
      }
   }

   public boolean hasNext() {
      if (this.field4098 != this.field4099.field4102[this.field4097 - 1]) {
         return true;
      } else {
         while(this.field4097 < this.field4099.field4104) {
            if (this.field4099.field4102[this.field4097++].field3965 != this.field4099.field4102[this.field4097 - 1]) {
               this.field4098 = this.field4099.field4102[this.field4097 - 1].field3965;
               return true;
            }

            this.field4098 = this.field4099.field4102[this.field4097 - 1];
         }

         return false;
      }
   }

   public void remove() {
      if (this.field4100 == null) {
         throw new IllegalStateException();
      } else {
         this.field4100.remove();
         this.field4100 = null;
      }
   }
}
