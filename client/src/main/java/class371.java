import java.util.Iterator;

class class371 implements Iterator {
   int field4148;
   // $FF: synthetic field
   final class372 this$0;

   public static boolean method5829(class277 var0, class277 var1) {
      class141.field1549 = var1;
      if (!var0.method4417()) {
         return false;
      } else {
         class141.field1532 = var0.method4438(35);
         class141.field1544 = new class141[class141.field1532];

         for(int var3 = 0; var3 < class141.field1532; ++var3) {
            byte[] var4 = var0.method4412(35, var3);
            class141.field1544[var3] = new class141(var3);
            if (var4 != null) {
               class141.field1544[var3].method2377(new Buffer(var4));
               class141.field1544[var3].method2383();
            }
         }

         return true;
      }
   }

   class371(class372 var1) {
      this.this$0 = var1;
   }

   public boolean hasNext() {
      return this.field4148 < this.this$0.method5397();
   }

   public Object next() {
      int var1 = ++this.field4148 - 1;
      class342 var2 = (class342)this.this$0.field4152.method3857((long)var1);
      return var2 != null ? var2 : this.this$0.method5831(var1);
   }

   public void remove() {
      throw new UnsupportedOperationException();
   }
}
