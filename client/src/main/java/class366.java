import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class class366 implements class365 {
   Map field4113;
   final class392 field4111;

   public class366(class392 var1) {
      this.field4111 = var1;
   }

   public int method5751(int var1) {
      if (null != this.field4113) {
         class393 var3 = (class393)this.field4113.get(var1);
         if (var3 != null) {
            return (Integer)var3.field4242;
         }
      }

      return (Integer)this.field4111.method6250(var1);
   }

   public void method5750(int var1, Object var2) {
      if (null == this.field4113) {
         this.field4113 = new HashMap();
         this.field4113.put(var1, new class393(var1, var2));
      } else {
         class393 var4 = (class393)this.field4113.get(var1);
         if (var4 == null) {
            this.field4113.put(var1, new class393(var1, var2));
         } else {
            var4.field4242 = var2;
         }
      }

   }

   public Iterator iterator() {
      return this.field4113 == null ? Collections.emptyList().iterator() : this.field4113.values().iterator();
   }
}
