public final class class57 extends class201 {
   boolean field843 = false;
   class159 field854;
   double field832;
   double field833;
   double field841;
   double field845;
   double field847;
   double field849;
   double field850;
   double field851;
   int field834;
   int field835 = 0;
   int field836;
   int field837;
   int field838;
   int field839;
   int field840;
   int field842;
   int field844;
   int field846;
   int field848;
   int field852;
   int field853;
   int field855 = 0;
   int field856;

   public static void method1588(class277 var0) {
      class151.field1683 = var0;
   }

   class57(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      this.field836 = var1;
      this.field837 = var2;
      this.field834 = var3;
      this.field838 = var4;
      this.field848 = var5;
      this.field839 = var6;
      this.field844 = var7;
      this.field840 = var8;
      this.field842 = var9;
      this.field856 = var10;
      this.field846 = var11;
      this.field843 = false;
      int var12 = class25.method403(this.field836).field1664;
      if (-1 != var12) {
         this.field854 = class48.method1312(var12);
      } else {
         this.field854 = null;
      }

   }

   final void method1582(int var1, int var2, int var3, int var4) {
      double var6;
      if (!this.field843) {
         var6 = (double)(var1 - this.field834);
         double var8 = (double)(var2 - this.field838);
         double var10 = Math.sqrt(var8 * var8 + var6 * var6);
         this.field832 = (double)this.field834 + (double)this.field842 * var6 / var10;
         this.field845 = (double)this.field842 * var8 / var10 + (double)this.field838;
         this.field833 = (double)this.field848;
      }

      var6 = (double)(1 + this.field844 - var4);
      this.field847 = ((double)var1 - this.field832) / var6;
      this.field841 = ((double)var2 - this.field845) / var6;
      this.field849 = Math.sqrt(this.field847 * this.field847 + this.field841 * this.field841);
      if (!this.field843) {
         this.field850 = -this.field849 * Math.tan(0.02454369D * (double)this.field840);
      }

      this.field851 = 2.0D * ((double)var3 - this.field833 - var6 * this.field850) / (var6 * var6);
   }

   static final void method1586(byte[] var0, int var1, int var2, int var3, int var4, class160[] var5) {
      int var8;
      int var9;
      for(int var7 = 0; var7 < 4; ++var7) {
         for(var8 = 0; var8 < 64; ++var8) {
            for(var9 = 0; var9 < 64; ++var9) {
               if (var1 + var8 > 0 && var8 + var1 < 103 && var9 + var2 > 0 && var9 + var2 < 103) {
                  int[] var10000 = var5[var7].field1889[var8 + var1];
                  var10000[var9 + var2] &= -16777217;
               }
            }
         }
      }

      Buffer var11 = new Buffer(var0);

      for(var8 = 0; var8 < 4; ++var8) {
         for(var9 = 0; var9 < 64; ++var9) {
            for(int var10 = 0; var10 < 64; ++var10) {
               class126.method2253(var11, var8, var1 + var9, var2 + var10, var3, var4, 0);
            }
         }
      }

   }

   final void method1583(int var1) {
      this.field843 = true;
      this.field832 += this.field847 * (double)var1;
      this.field845 += this.field841 * (double)var1;
      this.field833 += (double)var1 * this.field850 + (double)var1 * 0.5D * this.field851 * (double)var1;
      this.field850 += this.field851 * (double)var1;
      this.field852 = (int)(Math.atan2(this.field847, this.field841) * 325.949D) + 1024 & 2047;
      this.field853 = (int)(Math.atan2(this.field850, this.field849) * 325.949D) & 2047;
      if (null != this.field854) {
         this.field835 += var1;

         while(true) {
            do {
               do {
                  if (this.field835 <= this.field854.field1865[this.field855]) {
                     return;
                  }

                  this.field835 -= this.field854.field1865[this.field855];
                  ++this.field855;
               } while(this.field855 < this.field854.field1863.length);

               this.field855 -= this.field854.field1862;
            } while(this.field855 >= 0 && this.field855 < this.field854.field1863.length);

            this.field855 = 0;
         }
      }
   }

   protected final class207 method3687() {
      class150 var2 = class25.method403(this.field836);
      class207 var3 = var2.method2498(this.field855);
      if (var3 == null) {
         return null;
      } else {
         var3.method3715(this.field853);
         return var3;
      }
   }
}
