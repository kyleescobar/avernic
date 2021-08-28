import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class class58 {
   static int field859;
   ExecutorService field858 = Executors.newSingleThreadExecutor();
   Future field857;

   class58() {
      this.field857 = this.field858.submit(new class63());
   }

   public static class142 method1590(int var0) {
      class142 var2 = (class142)class142.field1556.method3880((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = class142.field1561.method4412(19, var0);
         var2 = new class142();
         if (var3 != null) {
            var2.method2400(new Buffer(var3));
         }

         class142.field1556.method3882(var2, (long)var0);
         return var2;
      }
   }

   void method1589() {
      this.field858.shutdown();
      this.field858 = null;
   }

   boolean method1597() {
      return this.field857.isDone();
   }

   SecureRandom method1591() {
      try {
         return (SecureRandom)this.field857.get();
      } catch (Exception var5) {
         SecureRandom var4 = new SecureRandom();
         var4.nextInt();
         return var4;
      }
   }

   static int method1598(class48 var0, class48 var1, int var2, boolean var3, int var4, boolean var5) {
      int var7 = class138.method2333(var0, var1, var2, var3);
      if (var7 != 0) {
         return var3 ? -var7 : var7;
      } else if (-1 == var4) {
         return 0;
      } else {
         int var8 = class138.method2333(var0, var1, var4, var5);
         return var5 ? -var8 : var8;
      }
   }

   static void method1596() {
      class151.method2522(class150.field1659 + class12.field69 / 2, class335.field3907);
   }
}
