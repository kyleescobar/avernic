public class class393 {
   public Object field4242;
   public final int field4241;

   public class393(int var1) {
      this.field4241 = var1;
   }

   public class393(int var1, Object var2) {
      this.field4241 = var1;
      this.field4242 = var2;
   }

   public int hashCode() {
      return super.hashCode();
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof class393)) {
         return false;
      } else {
         class393 var2 = (class393)var1;
         if (var2.field4242 == null && null != this.field4242) {
            return false;
         } else if (null == this.field4242 && var2.field4242 != null) {
            return false;
         } else {
            return this.field4241 == var2.field4241 && var2.field4242.equals(this.field4242);
         }
      }
   }
}
