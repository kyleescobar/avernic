public class class354 {
   public class354 field3965;
   public class354 field3967;
   public long field3966;

   public void remove() {
      if (this.field3967 != null) {
         this.field3967.field3965 = this.field3965;
         this.field3965.field3967 = this.field3967;
         this.field3965 = null;
         this.field3967 = null;
      }
   }
}
