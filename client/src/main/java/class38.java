public class class38 {
   static class275 archive19;
   static class275 archive3;
   static class76 clientPreferences;
   static class84 field311;
   int field304;
   int field305;
   int[][] field301;

   public class38(int var1, int var2) {
      if (var1 != var2) {
         int var3 = class178.method3183(var1, var2);
         var1 /= var3;
         var2 /= var3;
         this.field304 = var1;
         this.field305 = var2;
         this.field301 = new int[var1][14];

         for(int var4 = 0; var4 < var1; ++var4) {
            int[] var5 = this.field301[var4];
            double var6 = 6.0D + (double)var4 / (double)var1;
            int var8 = (int)Math.floor(1.0D + (var6 - 7.0D));
            if (var8 < 0) {
               var8 = 0;
            }

            int var9 = (int)Math.ceil(7.0D + var6);
            if (var9 > 14) {
               var9 = 14;
            }

            for(double var10 = (double)var2 / (double)var1; var8 < var9; ++var8) {
               double var12 = ((double)var8 - var6) * 3.141592653589793D;
               double var14 = var10;
               if (var12 < -1.0E-4D || var12 > 1.0E-4D) {
                  var14 = var10 * (Math.sin(var12) / var12);
               }

               var14 *= 0.54D + 0.46D * Math.cos(0.2243994752564138D * ((double)var8 - var6));
               var5[var8] = (int)Math.floor(0.5D + var14 * 65536.0D);
            }
         }

      }
   }

   byte[] method727(byte[] var1) {
      if (null != this.field301) {
         int var3 = (int)((long)var1.length * (long)this.field305 / (long)this.field304) + 14;
         int[] var4 = new int[var3];
         int var5 = 0;
         int var6 = 0;

         int var7;
         for(var7 = 0; var7 < var1.length; ++var7) {
            byte var8 = var1[var7];
            int[] var9 = this.field301[var6];

            int var10;
            for(var10 = 0; var10 < 14; ++var10) {
               var4[var10 + var5] += var9[var10] * var8;
            }

            var6 += this.field305;
            var10 = var6 / this.field304;
            var5 += var10;
            var6 -= this.field304 * var10;
         }

         var1 = new byte[var3];

         for(var7 = 0; var7 < var3; ++var7) {
            int var11 = '\u8000' + var4[var7] >> 16;
            if (var11 < -128) {
               var1[var7] = -128;
            } else if (var11 > 127) {
               var1[var7] = 127;
            } else {
               var1[var7] = (byte)var11;
            }
         }
      }

      return var1;
   }

   int method720(int var1) {
      if (null != this.field301) {
         var1 = (int)((long)this.field305 * (long)var1 / (long)this.field304);
      }

      return var1;
   }

   int method721(int var1) {
      if (this.field301 != null) {
         var1 = 6 + (int)((long)this.field305 * (long)var1 / (long)this.field304);
      }

      return var1;
   }

   static final void method726(Interface var0) {
      int var2 = var0.field2962;
      if (var2 == 324) {
         if (client.field675 == -1) {
            client.field675 = var0.field3084;
            client.field676 = var0.field3006;
         }

         if (client.field598.field2931) {
            var0.field3084 = client.field675;
         } else {
            var0.field3084 = client.field676;
         }

      } else if (var2 == 325) {
         if (-1 == client.field675) {
            client.field675 = var0.field3084;
            client.field676 = var0.field3006;
         }

         if (client.field598.field2931) {
            var0.field3084 = client.field676;
         } else {
            var0.field3084 = client.field675;
         }

      } else if (var2 == 327) {
         var0.field3009 = 150;
         var0.field3010 = (int)(Math.sin((double)client.field452 / 40.0D) * 256.0D) & 2047;
         var0.field2950 = 5;
         var0.field3002 = 0;
      } else if (328 == var2) {
         var0.field3009 = 150;
         var0.field3010 = (int)(Math.sin((double)client.field452 / 40.0D) * 256.0D) & 2047;
         var0.field2950 = 5;
         var0.field3002 = 1;
      }
   }
}
