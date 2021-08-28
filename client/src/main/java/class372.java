import java.util.Iterator;

public class class372 extends class341 implements class219 {
   final class221 field4152 = new class221(64);
   final class277 field4151;
   final int field4150;

   public class372(class266 var1, int var2, class292 var3, class277 var4) {
      super(var1, var3, null != var4 ? var4.method4438(var2) : 0);
      this.field4151 = var4;
      this.field4150 = var2;
   }

   protected class343 method5401(int var1) {
      synchronized(this.field4152) {
         class342 var3 = (class342)this.field4152.method3857((long)var1);
         if (null == var3) {
            var3 = this.method5831(var1);
            this.field4152.method3860(var3, (long)var1);
         }

         return var3;
      }
   }

   class342 method5831(int var1) {
      byte[] var3 = this.field4151.method4412(this.field4150, var1);
      class342 var4 = new class342(var1);
      if (null != var3) {
         var4.method5411(new Buffer(var3));
      }

      return var4;
   }

   public void method5832() {
      synchronized(this.field4152) {
         this.field4152.method3863();
      }
   }

   public Iterator iterator() {
      return new class371(this);
   }
}
