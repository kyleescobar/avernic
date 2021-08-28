import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;

public class class264 {
   public static class395 field3194;
   static final class264 field3190 = new class264(25, 28, 800, 656, 40, 40);
   static final class264 field3192 = new class264(51, 27, 800, 0, 16, 16);
   final int field3191;
   final int field3193;

   class264(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.field3191 = var5;
      this.field3193 = var6;
   }

   public static int method4340(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
      int var6 = var2 - var1;

      for(int var7 = 0; var7 < var6; ++var7) {
         char var8 = var0.charAt(var1 + var7);
         if (var8 > 0 && var8 < 128 || var8 >= 160 && var8 <= 255) {
            var3[var7 + var4] = (byte)var8;
         } else if (8364 == var8) {
            var3[var7 + var4] = -128;
         } else if (8218 == var8) {
            var3[var4 + var7] = -126;
         } else if (402 == var8) {
            var3[var4 + var7] = -125;
         } else if (8222 == var8) {
            var3[var7 + var4] = -124;
         } else if (8230 == var8) {
            var3[var7 + var4] = -123;
         } else if (var8 == 8224) {
            var3[var7 + var4] = -122;
         } else if (var8 == 8225) {
            var3[var4 + var7] = -121;
         } else if (var8 == 710) {
            var3[var7 + var4] = -120;
         } else if (var8 == 8240) {
            var3[var4 + var7] = -119;
         } else if (352 == var8) {
            var3[var7 + var4] = -118;
         } else if (8249 == var8) {
            var3[var7 + var4] = -117;
         } else if (338 == var8) {
            var3[var7 + var4] = -116;
         } else if (381 == var8) {
            var3[var7 + var4] = -114;
         } else if (8216 == var8) {
            var3[var7 + var4] = -111;
         } else if (8217 == var8) {
            var3[var4 + var7] = -110;
         } else if (var8 == 8220) {
            var3[var7 + var4] = -109;
         } else if (var8 == 8221) {
            var3[var4 + var7] = -108;
         } else if (8226 == var8) {
            var3[var7 + var4] = -107;
         } else if (8211 == var8) {
            var3[var7 + var4] = -106;
         } else if (var8 == 8212) {
            var3[var7 + var4] = -105;
         } else if (var8 == 732) {
            var3[var4 + var7] = -104;
         } else if (8482 == var8) {
            var3[var4 + var7] = -103;
         } else if (var8 == 353) {
            var3[var4 + var7] = -102;
         } else if (var8 == 8250) {
            var3[var4 + var7] = -101;
         } else if (var8 == 339) {
            var3[var7 + var4] = -100;
         } else if (382 == var8) {
            var3[var4 + var7] = -98;
         } else if (376 == var8) {
            var3[var4 + var7] = -97;
         } else {
            var3[var4 + var7] = 63;
         }
      }

      return var6;
   }

   protected static int method4339() {
      int var1 = 0;
      if (null == class152.field1694 || !class152.field1694.isValid()) {
         try {
            Iterator var2 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

            while(var2.hasNext()) {
               GarbageCollectorMXBean var3 = (GarbageCollectorMXBean)var2.next();
               if (var3.isValid()) {
                  class152.field1694 = var3;
                  class19.field127 = -1L;
                  class19.field123 = -1L;
               }
            }
         } catch (Throwable var10) {
         }
      }

      if (null != class152.field1694) {
         long var11 = class87.method1989();
         long var4 = class152.field1694.getCollectionTime();
         if (-1L != class19.field123) {
            long var6 = var4 - class19.field123;
            long var8 = var11 - class19.field127;
            if (0L != var8) {
               var1 = (int)(100L * var6 / var8);
            }
         }

         class19.field123 = var4;
         class19.field127 = var11;
      }

      return var1;
   }
}
