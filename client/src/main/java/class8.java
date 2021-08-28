import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class class8 {
   public static short[] field26;
   static int field27;
   ExecutorService field22 = Executors.newSingleThreadExecutor();
   Future field24;
   final Buffer field23;
   final class4 field25;

   public static class203 method50(class277 var0, class277 var1, int var2, boolean var3) {
      boolean var5 = true;
      int[] var6 = var0.method4481(var2);

      for(int var7 = 0; var7 < var6.length; ++var7) {
         byte[] var8 = var0.method4420(var2, var6[var7]);
         if (null == var8) {
            var5 = false;
         } else {
            int var9 = (var8[0] & 255) << 8 | var8[1] & 255;
            byte[] var10;
            if (var3) {
               var10 = var1.method4420(0, var9);
            } else {
               var10 = var1.method4420(var9, 0);
            }

            if (null == var10) {
               var5 = false;
            }
         }
      }

      if (!var5) {
         return null;
      } else {
         try {
            return new class203(var0, var1, var2, var3);
         } catch (Exception var11) {
            return null;
         }
      }
   }

   public class8(Buffer var1, class4 var2) {
      this.field23 = var1;
      this.field25 = var2;
      this.method39();
   }

   public boolean method37() {
      return this.field24.isDone();
   }

   static class59 method36(int var0) {
      class59 var2 = (class59)class59.field862.method3880((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = ApproximateRouteStrategy.archive12.method4412(var0, 0);
         if (null == var3) {
            return null;
         } else {
            var2 = class211.method3833(var3);
            class59.field862.method3882(var2, (long)var0);
            return var2;
         }
      }
   }

   public void method40() {
      this.field22.shutdown();
      this.field22 = null;
   }

   public Buffer method48() {
      try {
         return (Buffer)this.field24.get();
      } catch (Exception var3) {
         return null;
      }
   }

   void method39() {
      this.field24 = this.field22.submit(new class2(this, this.field23, this.field25));
   }

   public static void method49() {
      class156.field1784.method3883();
      class156.field1738.method3883();
      class156.field1739.method3883();
      class156.field1740.method3883();
   }

   static int method43(int var0, class59 var1, boolean var2) {
      if (3700 != var0 && 3701 != var0) {
         if (var0 == 3702) {
            ++class51.field746;
            return 1;
         } else {
            return 2;
         }
      } else {
         --class51.field746;
         --class2.field4;
         return 1;
      }
   }

   public static final void method38(String var0, String var1, int var2, int var3, int var4, int var5) {
      class25.method400(var0, var1, var2, var3, var4, var5, false);
   }
}
