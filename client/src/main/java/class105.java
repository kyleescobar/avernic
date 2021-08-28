public class class105 extends class104 {
   boolean field1299;
   int field1298;
   // $FF: synthetic field
   final class107 this$0;

   static int method2095(int var0, int var1) {
      class158 var4 = (class158)class158.field1843.method3880((long)var0);
      class158 var3;
      if (null != var4) {
         var3 = var4;
      } else {
         byte[] var5 = class158.field1855.method4412(4, var0);
         var4 = new class158();
         if (null != var5) {
            var4.method2758(new Buffer(var5), var0);
         }

         var4.method2757();
         class158.field1843.method3882(var4, (long)var0);
         var3 = var4;
      }

      if (null == var3) {
         return var1;
      } else if (var3.field1848 >= 0) {
         return var3.field1848 | -16777216;
      } else {
         int var7;
         if (var3.field1856 >= 0) {
            var7 = class85.method1936(Rasterizer3D.field2269.method3835(var3.field1856), 96);
            return Rasterizer3D.field2268[var7] | -16777216;
         } else if (var3.field1844 == 16711935) {
            return var1;
         } else {
            var7 = class82.method1873(var3.field1847, var3.field1849, var3.field1850);
            int var6 = class85.method1936(var7, 96);
            return Rasterizer3D.field2268[var6] | -16777216;
         }
      }
   }

   static void method2093(int var0) {
      class65 var2 = (class65)class65.field935.get((long)var0);
      if (null != var2) {
         for(int var3 = 0; var3 < var2.field931.length; ++var3) {
            var2.field931[var3] = -1;
            var2.field932[var3] = 0;
         }

      }
   }

   public static byte[] method2094(CharSequence var0) {
      int var2 = var0.length();
      byte[] var3 = new byte[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         char var5 = var0.charAt(var4);
         if (var5 > 0 && var5 < 128 || var5 >= 160 && var5 <= 255) {
            var3[var4] = (byte)var5;
         } else if (8364 == var5) {
            var3[var4] = -128;
         } else if (var5 == 8218) {
            var3[var4] = -126;
         } else if (402 == var5) {
            var3[var4] = -125;
         } else if (8222 == var5) {
            var3[var4] = -124;
         } else if (8230 == var5) {
            var3[var4] = -123;
         } else if (8224 == var5) {
            var3[var4] = -122;
         } else if (var5 == 8225) {
            var3[var4] = -121;
         } else if (710 == var5) {
            var3[var4] = -120;
         } else if (8240 == var5) {
            var3[var4] = -119;
         } else if (var5 == 352) {
            var3[var4] = -118;
         } else if (8249 == var5) {
            var3[var4] = -117;
         } else if (var5 == 338) {
            var3[var4] = -116;
         } else if (var5 == 381) {
            var3[var4] = -114;
         } else if (8216 == var5) {
            var3[var4] = -111;
         } else if (8217 == var5) {
            var3[var4] = -110;
         } else if (var5 == 8220) {
            var3[var4] = -109;
         } else if (8221 == var5) {
            var3[var4] = -108;
         } else if (8226 == var5) {
            var3[var4] = -107;
         } else if (8211 == var5) {
            var3[var4] = -106;
         } else if (var5 == 8212) {
            var3[var4] = -105;
         } else if (732 == var5) {
            var3[var4] = -104;
         } else if (var5 == 8482) {
            var3[var4] = -103;
         } else if (var5 == 353) {
            var3[var4] = -102;
         } else if (var5 == 8250) {
            var3[var4] = -101;
         } else if (var5 == 339) {
            var3[var4] = -100;
         } else if (var5 == 382) {
            var3[var4] = -98;
         } else if (var5 == 376) {
            var3[var4] = -97;
         } else {
            var3[var4] = 63;
         }
      }

      return var3;
   }

   class105(class107 var1) {
      this.this$0 = var1;
      this.field1298 = -1;
   }

   void method2083(Buffer var1) {
      this.field1298 = var1.readUnsignedShort();
      this.field1299 = var1.readUnsignedByte() == 1;
   }

   void method2084(class115 var1) {
      var1.method2131(this.field1298, this.field1299);
   }
}
