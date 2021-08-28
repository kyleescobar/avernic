public class class29 {
   int field230 = class35.method672(24);
   int field231 = class35.method672(24);
   int field232 = class35.method672(24) + 1;
   int field233 = class35.method672(6) + 1;
   int field234 = class35.method672(16);
   int field235 = class35.method672(8);
   int[] field229;

   class29() {
      int[] var1 = new int[this.field233];

      int var2;
      for(var2 = 0; var2 < this.field233; ++var2) {
         int var3 = 0;
         int var4 = class35.method672(3);
         boolean var5 = class35.method689() != 0;
         if (var5) {
            var3 = class35.method672(5);
         }

         var1[var2] = var3 << 3 | var4;
      }

      this.field229 = new int[this.field233 * 8];

      for(var2 = 0; var2 < this.field233 * 8; ++var2) {
         this.field229[var2] = (var1[var2 >> 3] & 1 << (var2 & 7)) != 0 ? class35.method672(8) : -1;
      }

   }

   void method484(float[] var1, int var2, boolean var3) {
      int var4;
      for(var4 = 0; var4 < var2; ++var4) {
         var1[var4] = 0.0F;
      }

      if (!var3) {
         var4 = class35.field276[this.field235].field261;
         int var5 = this.field231 - this.field230;
         int var6 = var5 / this.field232;
         int[] var7 = new int[var6];

         for(int var8 = 0; var8 < 8; ++var8) {
            int var9 = 0;

            while(var9 < var6) {
               int var10;
               int var11;
               if (var8 == 0) {
                  var10 = class35.field276[this.field235].method656();

                  for(var11 = var4 - 1; var11 >= 0; --var11) {
                     if (var9 + var11 < var6) {
                        var7[var9 + var11] = var10 % this.field233;
                     }

                     var10 /= this.field233;
                  }
               }

               for(var10 = 0; var10 < var4; ++var10) {
                  var11 = var7[var9];
                  int var12 = this.field229[var11 * 8 + var8];
                  if (var12 >= 0) {
                     int var13 = this.field230 + var9 * this.field232;
                     class34 var14 = class35.field276[var12];
                     int var15;
                     if (this.field234 == 0) {
                        var15 = this.field232 / var14.field261;

                        for(int var19 = 0; var19 < var15; ++var19) {
                           float[] var20 = var14.method664();

                           for(int var18 = 0; var18 < var14.field261; ++var18) {
                              var1[var13 + var19 + var18 * var15] += var20[var18];
                           }
                        }
                     } else {
                        var15 = 0;

                        while(var15 < this.field232) {
                           float[] var16 = var14.method664();

                           for(int var17 = 0; var17 < var14.field261; ++var17) {
                              var1[var13 + var15] += var16[var17];
                              ++var15;
                           }
                        }
                     }
                  }

                  ++var9;
                  if (var9 >= var6) {
                     break;
                  }
               }
            }
         }

      }
   }
}
