public class class35 extends class354 {
   static boolean field265 = false;
   static boolean[] field282;
   static byte[] field288;
   static class24[] field277;
   static class29[] field270;
   static class32[] field279;
   static class34[] field276;
   static float[] field278;
   static float[] field287;
   static float[] field289;
   static float[] field290;
   static float[] field291;
   static float[] field292;
   static float[] field295;
   static int field272;
   static int field274;
   static int field275;
   static int field280;
   static int[] field267;
   static int[] field268;
   static int[] field281;
   boolean field271;
   boolean field293;
   byte[] field296;
   byte[][] field286;
   float[] field283;
   int field266;
   int field269;
   int field273;
   int field284;
   int field285;
   int field294;
   int field297;
   int field298;

   static float method683(int var0) {
      int var1 = var0 & 2097151;
      int var2 = var0 & Integer.MIN_VALUE;
      int var3 = (var0 & 2145386496) >> 21;
      if (var2 != 0) {
         var1 = -var1;
      }

      return (float)((double)var1 * Math.pow(2.0D, (double)(var3 - 788)));
   }

   static void method669(byte[] var0, int var1) {
      field288 = var0;
      field272 = var1;
      field280 = 0;
   }

   static int method689() {
      int var0 = field288[field272] >> field280 & 1;
      ++field280;
      field272 += field280 >> 3;
      field280 &= 7;
      return var0;
   }

   static int method672(int var0) {
      int var1 = 0;

      int var2;
      int var3;
      for(var2 = 0; var0 >= 8 - field280; var0 -= var3) {
         var3 = 8 - field280;
         int var4 = (1 << var3) - 1;
         var1 += (field288[field272] >> field280 & var4) << var2;
         field280 = 0;
         ++field272;
         var2 += var3;
      }

      if (var0 > 0) {
         var3 = (1 << var0) - 1;
         var1 += (field288[field272] >> field280 & var3) << var2;
         field280 += var0;
      }

      return var1;
   }

   void method673(byte[] var1) {
      Buffer var2 = new Buffer(var1);
      this.field266 = var2.readInt();
      this.field273 = var2.readInt();
      this.field294 = var2.readInt();
      this.field269 = var2.readInt();
      if (this.field269 < 0) {
         this.field269 = ~this.field269;
         this.field271 = true;
      }

      int var3 = var2.readInt();
      this.field286 = new byte[var3][];

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = 0;

         int var6;
         do {
            var6 = var2.readUnsignedByte();
            var5 += var6;
         } while(var6 >= 255);

         byte[] var7 = new byte[var5];
         var2.method5960(var7, 0, var5);
         this.field286[var4] = var7;
      }

   }

   static void method670(byte[] var0) {
      method669(var0, 0);
      field274 = 1 << method672(4);
      field275 = 1 << method672(4);
      field287 = new float[field275];

      int var1;
      int var2;
      int var3;
      int var4;
      int var5;
      for(var1 = 0; var1 < 2; ++var1) {
         var2 = var1 != 0 ? field275 : field274;
         var3 = var2 >> 1;
         var4 = var2 >> 2;
         var5 = var2 >> 3;
         float[] var6 = new float[var3];

         for(int var7 = 0; var7 < var4; ++var7) {
            var6[2 * var7] = (float)Math.cos((double)(4 * var7) * 3.141592653589793D / (double)var2);
            var6[2 * var7 + 1] = -((float)Math.sin((double)(4 * var7) * 3.141592653589793D / (double)var2));
         }

         float[] var13 = new float[var3];

         for(int var8 = 0; var8 < var4; ++var8) {
            var13[2 * var8] = (float)Math.cos((double)(2 * var8 + 1) * 3.141592653589793D / (double)(2 * var2));
            var13[2 * var8 + 1] = (float)Math.sin((double)(2 * var8 + 1) * 3.141592653589793D / (double)(2 * var2));
         }

         float[] var14 = new float[var4];

         for(int var9 = 0; var9 < var5; ++var9) {
            var14[2 * var9] = (float)Math.cos((double)(4 * var9 + 2) * 3.141592653589793D / (double)var2);
            var14[2 * var9 + 1] = -((float)Math.sin((double)(4 * var9 + 2) * 3.141592653589793D / (double)var2));
         }

         int[] var15 = new int[var5];
         int var10 = class192.method3313(var5 - 1);

         for(int var11 = 0; var11 < var5; ++var11) {
            var15[var11] = class59.method1609(var11, var10);
         }

         if (var1 != 0) {
            field291 = var6;
            field292 = var13;
            field278 = var14;
            field268 = var15;
         } else {
            field295 = var6;
            field289 = var13;
            field290 = var14;
            field267 = var15;
         }
      }

      var1 = method672(8) + 1;
      field276 = new class34[var1];

      for(var2 = 0; var2 < var1; ++var2) {
         field276[var2] = new class34();
      }

      var2 = method672(6) + 1;

      for(var3 = 0; var3 < var2; ++var3) {
         method672(16);
      }

      var2 = method672(6) + 1;
      field277 = new class24[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         field277[var3] = new class24();
      }

      var3 = method672(6) + 1;
      field270 = new class29[var3];

      for(var4 = 0; var4 < var3; ++var4) {
         field270[var4] = new class29();
      }

      var4 = method672(6) + 1;
      field279 = new class32[var4];

      for(var5 = 0; var5 < var4; ++var5) {
         field279[var5] = new class32();
      }

      var5 = method672(6) + 1;
      field282 = new boolean[var5];
      field281 = new int[var5];

      for(int var12 = 0; var12 < var5; ++var12) {
         field282[var12] = method689() != 0;
         method672(16);
         method672(16);
         field281[var12] = method672(8);
      }

   }

   float[] method675(int var1) {
      method669(this.field286[var1], 0);
      method689();
      int var2 = method672(class192.method3313(field281.length - 1));
      boolean var3 = field282[var2];
      int var4 = var3 ? field275 : field274;
      boolean var5 = false;
      boolean var6 = false;
      if (var3) {
         var5 = method689() != 0;
         var6 = method689() != 0;
      }

      int var7 = var4 >> 1;
      int var8;
      int var9;
      int var10;
      if (var3 && !var5) {
         var8 = (var4 >> 2) - (field274 >> 2);
         var9 = (var4 >> 2) + (field274 >> 2);
         var10 = field274 >> 1;
      } else {
         var8 = 0;
         var9 = var7;
         var10 = var4 >> 1;
      }

      int var11;
      int var12;
      int var13;
      if (var3 && !var6) {
         var11 = var4 - (var4 >> 2) - (field274 >> 2);
         var12 = var4 - (var4 >> 2) + (field274 >> 2);
         var13 = field274 >> 1;
      } else {
         var11 = var7;
         var12 = var4;
         var13 = var4 >> 1;
      }

      class32 var14 = field279[field281[var2]];
      int var16 = var14.field256;
      int var17 = var14.field255[var16];
      boolean var15 = !field277[var17].method385();
      boolean var40 = var15;

      for(var17 = 0; var17 < var14.field257; ++var17) {
         class29 var18 = field270[var14.field258[var17]];
         float[] var19 = field287;
         var18.method484(var19, var4 >> 1, var40);
      }

      int var41;
      if (!var15) {
         var17 = var14.field256;
         var41 = var14.field255[var17];
         field277[var41].method369(field287, var4 >> 1);
      }

      int var42;
      if (var15) {
         for(var17 = var4 >> 1; var17 < var4; ++var17) {
            field287[var17] = 0.0F;
         }
      } else {
         var17 = var4 >> 1;
         var41 = var4 >> 2;
         var42 = var4 >> 3;
         float[] var20 = field287;

         int var21;
         for(var21 = 0; var21 < var17; ++var21) {
            var20[var21] *= 0.5F;
         }

         for(var21 = var17; var21 < var4; ++var21) {
            var20[var21] = -var20[var4 - var21 - 1];
         }

         float[] var46 = var3 ? field291 : field295;
         float[] var22 = var3 ? field292 : field289;
         float[] var23 = var3 ? field278 : field290;
         int[] var24 = var3 ? field268 : field267;

         int var25;
         float var26;
         float var27;
         float var28;
         float var29;
         for(var25 = 0; var25 < var41; ++var25) {
            var26 = var20[4 * var25] - var20[var4 - 4 * var25 - 1];
            var27 = var20[4 * var25 + 2] - var20[var4 - 4 * var25 - 3];
            var28 = var46[2 * var25];
            var29 = var46[2 * var25 + 1];
            var20[var4 - 4 * var25 - 1] = var26 * var28 - var27 * var29;
            var20[var4 - 4 * var25 - 3] = var26 * var29 + var27 * var28;
         }

         float var30;
         float var31;
         for(var25 = 0; var25 < var42; ++var25) {
            var26 = var20[var17 + 3 + 4 * var25];
            var27 = var20[var17 + 1 + 4 * var25];
            var28 = var20[4 * var25 + 3];
            var29 = var20[4 * var25 + 1];
            var20[var17 + 3 + 4 * var25] = var26 + var28;
            var20[var17 + 1 + 4 * var25] = var27 + var29;
            var30 = var46[var17 - 4 - 4 * var25];
            var31 = var46[var17 - 3 - 4 * var25];
            var20[4 * var25 + 3] = (var26 - var28) * var30 - (var27 - var29) * var31;
            var20[4 * var25 + 1] = (var27 - var29) * var30 + (var26 - var28) * var31;
         }

         var25 = class192.method3313(var4 - 1);

         int var47;
         int var48;
         int var49;
         int var50;
         for(var47 = 0; var47 < var25 - 3; ++var47) {
            var48 = var4 >> var47 + 2;
            var49 = 8 << var47;

            for(var50 = 0; var50 < 2 << var47; ++var50) {
               int var51 = var4 - var48 * 2 * var50;
               int var52 = var4 - var48 * (2 * var50 + 1);

               for(int var32 = 0; var32 < var4 >> var47 + 4; ++var32) {
                  int var33 = 4 * var32;
                  float var34 = var20[var51 - 1 - var33];
                  float var35 = var20[var51 - 3 - var33];
                  float var36 = var20[var52 - 1 - var33];
                  float var37 = var20[var52 - 3 - var33];
                  var20[var51 - 1 - var33] = var34 + var36;
                  var20[var51 - 3 - var33] = var35 + var37;
                  float var38 = var46[var32 * var49];
                  float var39 = var46[var32 * var49 + 1];
                  var20[var52 - 1 - var33] = (var34 - var36) * var38 - (var35 - var37) * var39;
                  var20[var52 - 3 - var33] = (var35 - var37) * var38 + (var34 - var36) * var39;
               }
            }
         }

         for(var47 = 1; var47 < var42 - 1; ++var47) {
            var48 = var24[var47];
            if (var47 < var48) {
               var49 = 8 * var47;
               var50 = 8 * var48;
               var30 = var20[var49 + 1];
               var20[var49 + 1] = var20[var50 + 1];
               var20[var50 + 1] = var30;
               var30 = var20[var49 + 3];
               var20[var49 + 3] = var20[var50 + 3];
               var20[var50 + 3] = var30;
               var30 = var20[var49 + 5];
               var20[var49 + 5] = var20[var50 + 5];
               var20[var50 + 5] = var30;
               var30 = var20[var49 + 7];
               var20[var49 + 7] = var20[var50 + 7];
               var20[var50 + 7] = var30;
            }
         }

         for(var47 = 0; var47 < var17; ++var47) {
            var20[var47] = var20[2 * var47 + 1];
         }

         for(var47 = 0; var47 < var42; ++var47) {
            var20[var4 - 1 - 2 * var47] = var20[4 * var47];
            var20[var4 - 2 - 2 * var47] = var20[4 * var47 + 1];
            var20[var4 - var41 - 1 - 2 * var47] = var20[4 * var47 + 2];
            var20[var4 - var41 - 2 - 2 * var47] = var20[4 * var47 + 3];
         }

         for(var47 = 0; var47 < var42; ++var47) {
            var27 = var23[2 * var47];
            var28 = var23[2 * var47 + 1];
            var29 = var20[var17 + 2 * var47];
            var30 = var20[var17 + 2 * var47 + 1];
            var31 = var20[var4 - 2 - 2 * var47];
            float var53 = var20[var4 - 1 - 2 * var47];
            float var54 = var28 * (var29 - var31) + var27 * (var30 + var53);
            var20[var17 + 2 * var47] = (var29 + var31 + var54) * 0.5F;
            var20[var4 - 2 - 2 * var47] = (var29 + var31 - var54) * 0.5F;
            var54 = var28 * (var30 + var53) - var27 * (var29 - var31);
            var20[var17 + 2 * var47 + 1] = (var30 - var53 + var54) * 0.5F;
            var20[var4 - 1 - 2 * var47] = (-var30 + var53 + var54) * 0.5F;
         }

         for(var47 = 0; var47 < var41; ++var47) {
            var20[var47] = var20[2 * var47 + var17] * var22[2 * var47] + var20[2 * var47 + 1 + var17] * var22[2 * var47 + 1];
            var20[var17 - 1 - var47] = var20[2 * var47 + var17] * var22[2 * var47 + 1] - var20[2 * var47 + 1 + var17] * var22[2 * var47];
         }

         for(var47 = 0; var47 < var41; ++var47) {
            var20[var4 - var41 + var47] = -var20[var47];
         }

         for(var47 = 0; var47 < var41; ++var47) {
            var20[var47] = var20[var41 + var47];
         }

         for(var47 = 0; var47 < var41; ++var47) {
            var20[var41 + var47] = -var20[var41 - var47 - 1];
         }

         for(var47 = 0; var47 < var41; ++var47) {
            var20[var17 + var47] = var20[var4 - var47 - 1];
         }

         float[] var10000;
         for(var47 = var8; var47 < var9; ++var47) {
            var27 = (float)Math.sin(((double)(var47 - var8) + 0.5D) / (double)var10 * 0.5D * 3.141592653589793D);
            var10000 = field287;
            var10000[var47] *= (float)Math.sin(1.5707963267948966D * (double)var27 * (double)var27);
         }

         for(var47 = var11; var47 < var12; ++var47) {
            var27 = (float)Math.sin(((double)(var47 - var11) + 0.5D) / (double)var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
            var10000 = field287;
            var10000[var47] *= (float)Math.sin(1.5707963267948966D * (double)var27 * (double)var27);
         }
      }

      float[] var43 = null;
      if (this.field284 > 0) {
         var41 = this.field284 + var4 >> 2;
         var43 = new float[var41];
         int var45;
         if (!this.field293) {
            for(var42 = 0; var42 < this.field285; ++var42) {
               var45 = (this.field284 >> 1) + var42;
               var43[var42] += this.field283[var45];
            }
         }

         if (!var15) {
            for(var42 = var8; var42 < var4 >> 1; ++var42) {
               var45 = var43.length - (var4 >> 1) + var42;
               var43[var45] += field287[var42];
            }
         }
      }

      float[] var44 = this.field283;
      this.field283 = field287;
      field287 = var44;
      this.field284 = var4;
      this.field285 = var12 - (var4 >> 1);
      this.field293 = var15;
      return var43;
   }

   static boolean method671(class277 var0) {
      if (!field265) {
         byte[] var1 = var0.method4412(0, 0);
         if (var1 == null) {
            return false;
         }

         method670(var1);
         field265 = true;
      }

      return true;
   }

   static class35 method687(class277 var0, int var1, int var2) {
      if (!method671(var0)) {
         var0.method4500(var1, var2);
         return null;
      } else {
         byte[] var3 = var0.method4412(var1, var2);
         return var3 == null ? null : new class35(var3);
      }
   }

   class35(byte[] var1) {
      this.method673(var1);
   }

   class23 method677(int[] var1) {
      if (var1 != null && var1[0] <= 0) {
         return null;
      } else {
         if (this.field296 == null) {
            this.field284 = 0;
            this.field283 = new float[field275];
            this.field296 = new byte[this.field273];
            this.field297 = 0;
            this.field298 = 0;
         }

         for(; this.field298 < this.field286.length; ++this.field298) {
            if (var1 != null && var1[0] <= 0) {
               return null;
            }

            float[] var2 = this.method675(this.field298);
            if (var2 != null) {
               int var3 = this.field297;
               int var4 = var2.length;
               if (var4 > this.field273 - var3) {
                  var4 = this.field273 - var3;
               }

               for(int var5 = 0; var5 < var4; ++var5) {
                  int var6 = (int)(128.0F + var2[var5] * 128.0F);
                  if ((var6 & -256) != 0) {
                     var6 = ~var6 >> 31;
                  }

                  this.field296[var3++] = (byte)(var6 - 128);
               }

               if (var1 != null) {
                  var1[0] -= var3 - this.field297;
               }

               this.field297 = var3;
            }
         }

         this.field283 = null;
         byte[] var7 = this.field296;
         this.field296 = null;
         return new class23(this.field266, var7, this.field294, this.field269, this.field271);
      }
   }
}
