import java.lang.ref.SoftReference;

public class class222 extends class225 {
   SoftReference field2555;

   class222(Object var1, int var2) {
      super(var2);
      this.field2555 = new SoftReference(var1);
   }

   Object method3891() {
      return this.field2555.get();
   }

   boolean method3893() {
      return true;
   }
}
