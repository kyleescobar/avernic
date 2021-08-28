public class class274 implements Runnable {
   static class296 field3556 = new class296();
   static class296 field3558 = new class296();
   static int field3557 = 0;
   static Object field3559 = new Object();
   static Thread field3560;

   public static byte method4376(char var0) {
      byte var2;
      if (var0 > 0 && var0 < 128 || var0 >= 160 && var0 <= 255) {
         var2 = (byte)var0;
      } else if (8364 == var0) {
         var2 = -128;
      } else if (var0 == 8218) {
         var2 = -126;
      } else if (402 == var0) {
         var2 = -125;
      } else if (var0 == 8222) {
         var2 = -124;
      } else if (var0 == 8230) {
         var2 = -123;
      } else if (8224 == var0) {
         var2 = -122;
      } else if (8225 == var0) {
         var2 = -121;
      } else if (var0 == 710) {
         var2 = -120;
      } else if (8240 == var0) {
         var2 = -119;
      } else if (352 == var0) {
         var2 = -118;
      } else if (8249 == var0) {
         var2 = -117;
      } else if (338 == var0) {
         var2 = -116;
      } else if (381 == var0) {
         var2 = -114;
      } else if (var0 == 8216) {
         var2 = -111;
      } else if (var0 == 8217) {
         var2 = -110;
      } else if (8220 == var0) {
         var2 = -109;
      } else if (var0 == 8221) {
         var2 = -108;
      } else if (var0 == 8226) {
         var2 = -107;
      } else if (var0 == 8211) {
         var2 = -106;
      } else if (var0 == 8212) {
         var2 = -105;
      } else if (732 == var0) {
         var2 = -104;
      } else if (8482 == var0) {
         var2 = -103;
      } else if (353 == var0) {
         var2 = -102;
      } else if (8250 == var0) {
         var2 = -101;
      } else if (var0 == 339) {
         var2 = -100;
      } else if (var0 == 382) {
         var2 = -98;
      } else if (var0 == 376) {
         var2 = -97;
      } else {
         var2 = 63;
      }

      return var2;
   }

   class274() {
   }

   public void run() {
      try {
         while(true) {
            class273 var1;
            synchronized(field3558) {
               var1 = (class273)field3558.method4687();
            }

            if (null != var1) {
               if (var1.field3555 == 0) {
                  var1.field3552.method5353((int)var1.field3966, var1.field3551, var1.field3551.length);
                  synchronized(field3558) {
                     var1.remove();
                  }
               } else if (1 == var1.field3555) {
                  var1.field3551 = var1.field3552.method5347((int)var1.field3966);
                  synchronized(field3558) {
                     field3556.method4672(var1);
                  }
               }

               synchronized(field3559) {
                  if (field3557 <= 1) {
                     field3557 = 0;
                     field3559.notifyAll();
                     return;
                  }

                  field3557 = 600;
               }
            } else {
               class210.method3831(100L);
               synchronized(field3559) {
                  if (field3557 <= 1) {
                     field3557 = 0;
                     field3559.notifyAll();
                     return;
                  }

                  --field3557;
               }
            }
         }
      } catch (Exception var13) {
         class333.method5330((String)null, var13);
      }
   }
}
