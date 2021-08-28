public class class39 {
   static float field312;
   static float[][] field319 = new float[2][8];
   static int field320;
   static int[][] field318 = new int[2][8];
   int[] field316 = new int[2];
   int[] field321 = new int[2];
   int[][][] field314 = new int[2][2][4];
   int[][][] field315 = new int[2][2][4];

   class39() {
   }

   float method742(int var1, int var2, float var3) {
      float var4 = (float)this.field315[var1][0][var2] + var3 * (float)(this.field315[var1][1][var2] - this.field315[var1][0][var2]);
      var4 *= 0.0015258789F;
      return 1.0F - (float)Math.pow(10.0D, (double)(-var4 / 20.0F));
   }

   static float method730(float var0) {
      float var1 = 32.703197F * (float)Math.pow(2.0D, (double)var0);
      return var1 * 3.1415927F / 11025.0F;
   }

   float method729(int var1, int var2, float var3) {
      float var4 = (float)this.field314[var1][0][var2] + var3 * (float)(this.field314[var1][1][var2] - this.field314[var1][0][var2]);
      var4 *= 1.2207031E-4F;
      return method730(var4);
   }

   int method740(int var1, float var2) {
      float var3;
      if (var1 == 0) {
         var3 = (float)this.field316[0] + (float)(this.field316[1] - this.field316[0]) * var2;
         var3 *= 0.0030517578F;
         field312 = (float)Math.pow(0.1D, (double)(var3 / 20.0F));
         field320 = (int)(field312 * 65536.0F);
      }

      if (this.field321[var1] == 0) {
         return 0;
      } else {
         var3 = this.method742(var1, 0, var2);
         field319[var1][0] = -2.0F * var3 * (float)Math.cos((double)this.method729(var1, 0, var2));
         field319[var1][1] = var3 * var3;

         float[] var10000;
         int var4;
         for(var4 = 1; var4 < this.field321[var1]; ++var4) {
            var3 = this.method742(var1, var4, var2);
            float var5 = -2.0F * var3 * (float)Math.cos((double)this.method729(var1, var4, var2));
            float var6 = var3 * var3;
            field319[var1][var4 * 2 + 1] = field319[var1][var4 * 2 - 1] * var6;
            field319[var1][var4 * 2] = field319[var1][var4 * 2 - 1] * var5 + field319[var1][var4 * 2 - 2] * var6;

            for(int var7 = var4 * 2 - 1; var7 >= 2; --var7) {
               var10000 = field319[var1];
               var10000[var7] += field319[var1][var7 - 1] * var5 + field319[var1][var7 - 2] * var6;
            }

            var10000 = field319[var1];
            var10000[1] += field319[var1][0] * var5 + var6;
            var10000 = field319[var1];
            var10000[0] += var5;
         }

         if (var1 == 0) {
            for(var4 = 0; var4 < this.field321[0] * 2; ++var4) {
               var10000 = field319[0];
               var10000[var4] *= field312;
            }
         }

         for(var4 = 0; var4 < this.field321[var1] * 2; ++var4) {
            field318[var1][var4] = (int)(field319[var1][var4] * 65536.0F);
         }

         return this.field321[var1] * 2;
      }
   }

   final void method732(Buffer var1, class26 var2) {
      int var3 = var1.readUnsignedByte();
      this.field321[0] = var3 >> 4;
      this.field321[1] = var3 & 15;
      if (var3 != 0) {
         this.field316[0] = var1.readUnsignedShort();
         this.field316[1] = var1.readUnsignedShort();
         int var4 = var1.readUnsignedByte();

         int var5;
         int var6;
         for(var5 = 0; var5 < 2; ++var5) {
            for(var6 = 0; var6 < this.field321[var5]; ++var6) {
               this.field314[var5][0][var6] = var1.readUnsignedShort();
               this.field315[var5][0][var6] = var1.readUnsignedShort();
            }
         }

         for(var5 = 0; var5 < 2; ++var5) {
            for(var6 = 0; var6 < this.field321[var5]; ++var6) {
               if ((var4 & 1 << var5 * 4 << var6) != 0) {
                  this.field314[var5][1][var6] = var1.readUnsignedShort();
                  this.field315[var5][1][var6] = var1.readUnsignedShort();
               } else {
                  this.field314[var5][1][var6] = this.field314[var5][0][var6];
                  this.field315[var5][1][var6] = this.field315[var5][0][var6];
               }
            }
         }

         if (var4 != 0 || this.field316[1] != this.field316[0]) {
            var2.method462(var1);
         }
      } else {
         int[] var7 = this.field316;
         this.field316[1] = 0;
         var7[0] = 0;
      }

   }
}
