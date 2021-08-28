import java.util.Iterator;

public class class300 implements Iterator {
   class301 field3729;
   class349 field3727;
   class349 field3728 = null;

   class300(class301 var1) {
      this.field3729 = var1;
      this.field3727 = this.field3729.field3731.field3959;
      this.field3728 = null;
   }

   public Object next() {
      class349 var1 = this.field3727;
      if (var1 == this.field3729.field3731) {
         var1 = null;
         this.field3727 = null;
      } else {
         this.field3727 = var1.field3959;
      }

      this.field3728 = var1;
      return var1;
   }

   public boolean hasNext() {
      return this.field3727 != this.field3729.field3731;
   }

   public void remove() {
      if (this.field3728 == null) {
         throw new IllegalStateException();
      } else {
         this.field3728.method5435();
         this.field3728 = null;
      }
   }
}
