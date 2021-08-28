import java.util.HashMap;

public class class288 {
   class337 field3666 = new class337(0, 0);
   int field3669 = 0;
   int[] field3667 = new int[2048];
   int[] field3671 = new int[2048];
   final HashMap field3670 = new HashMap();

   static long method4615(CharSequence var0) {
      long var2 = 0L;
      int var4 = var0.length();

      for(int var5 = 0; var5 < var4; ++var5) {
         var2 *= 37L;
         char var6 = var0.charAt(var5);
         if (var6 >= 'A' && var6 <= 'Z') {
            var2 += (long)(1 + var6 - 65);
         } else if (var6 >= 'a' && var6 <= 'z') {
            var2 += (long)(1 + var6 - 97);
         } else if (var6 >= '0' && var6 <= '9') {
            var2 += (long)(var6 + 27 - 48);
         }

         if (var2 >= 177917621779460413L) {
            break;
         }
      }

      while(0L == var2 % 37L && var2 != 0L) {
         var2 /= 37L;
      }

      return var2;
   }

   public class288() {
      class44.field376 = new int[2000];
      int var1 = 0;
      int var2 = 240;

      int var4;
      for(byte var3 = 12; var1 < 16; var2 -= var3) {
         var4 = class126.method2251((double)((float)var2 / 360.0F), 0.9998999834060669D, (double)(0.075F + 0.425F * (float)var1 / 16.0F));
         class44.field376[var1] = var4;
         ++var1;
      }

      var2 = 48;

      for(int var6 = var2 / 6; var1 < class44.field376.length; var2 -= var6) {
         var4 = 2 * var1;

         for(int var5 = class126.method2251((double)((float)var2 / 360.0F), 0.9998999834060669D, 0.5D); var1 < var4 && var1 < class44.field376.length; ++var1) {
            class44.field376[var1] = var5;
         }
      }

   }

   void method4601(int var1) {
      int var3 = var1 * 2 + 1;
      double var5 = (double)((float)var1 / 3.0F);
      int var7 = 1 + var1 * 2;
      double[] var8 = new double[var7];
      int var9 = -var1;

      for(int var10 = 0; var9 <= var1; ++var10) {
         double var17 = (double)(var9 - 0) / var5;
         double var15 = Math.exp(-var17 * var17 / 2.0D) / Math.sqrt(6.283185307179586D);
         double var13 = var15 / var5;
         var8[var10] = var13;
         ++var9;
      }

      double[] var19 = var8;
      double var20 = var8[var1] * var8[var1];
      int[] var21 = new int[var3 * var3];
      boolean var11 = false;

      for(int var12 = 0; var12 < var3; ++var12) {
         for(int var23 = 0; var23 < var3; ++var23) {
            int var14 = var21[var12 * var3 + var23] = (int)(var19[var12] * var19[var23] / var20 * 256.0D);
            if (!var11 && var14 > 0) {
               var11 = true;
            }
         }
      }

      class398 var22 = new class398(var21, var3, var3);
      this.field3670.put(var1, var22);
   }

   class398 method4595(int var1) {
      if (!this.field3670.containsKey(var1)) {
         this.method4601(var1);
      }

      return (class398)this.field3670.get(var1);
   }

   public final void method4596(int var1, int var2) {
      if (this.field3669 < this.field3667.length) {
         this.field3667[this.field3669] = var1;
         this.field3671[this.field3669] = var2;
         ++this.field3669;
      }
   }

   public final void method4597() {
      this.field3669 = 0;
   }

   public final void method4598(int var1, int var2, class398 var3, float var4) {
      int var6 = (int)(18.0F * var4);
      class398 var7 = this.method4595(var6);
      int var8 = 1 + var6 * 2;
      class337 var9 = new class337(0, 0, var3.field4270, var3.field4271);
      class337 var10 = new class337(0, 0);
      this.field3666.method5368(var8, var8);
      System.nanoTime();

      int var11;
      int var12;
      int var13;
      for(var11 = 0; var11 < this.field3669; ++var11) {
         var12 = this.field3667[var11];
         var13 = this.field3671[var11];
         int var14 = (int)(var4 * (float)(var12 - var1)) - var6;
         int var15 = (int)((float)var3.field4271 - var4 * (float)(var13 - var2)) - var6;
         this.field3666.method5367(var14, var15);
         this.field3666.method5369(var9, var10);
         this.method4613(var7, var3, var10);
      }

      System.nanoTime();
      System.nanoTime();

      for(var11 = 0; var11 < var3.field4280.length; ++var11) {
         if (var3.field4280[var11] == 0) {
            var3.field4280[var11] = -16777216;
         } else {
            var12 = (var3.field4280[var11] + 64 - 1) / 256;
            if (var12 <= 0) {
               var3.field4280[var11] = -16777216;
            } else {
               if (var12 > class44.field376.length) {
                  var12 = class44.field376.length;
               }

               var13 = class44.field376[var12 - 1];
               var3.field4280[var11] = -16777216 | var13;
            }
         }
      }

      System.nanoTime();
   }

   void method4613(class398 var1, class398 var2, class337 var3) {
      if (0 != var3.field3923 && 0 != var3.field3921) {
         int var5 = 0;
         int var6 = 0;
         if (var3.field3925 == 0) {
            var5 = var1.field4270 - var3.field3923;
         }

         if (var3.field3922 == 0) {
            var6 = var1.field4271 - var3.field3921;
         }

         int var7 = var5 + var6 * var1.field4270;
         int var8 = var3.field3925 + var3.field3922 * var2.field4270;

         for(int var9 = 0; var9 < var3.field3921; ++var9) {
            for(int var10 = 0; var10 < var3.field3923; ++var10) {
               int[] var10000 = var2.field4280;
               int var10001 = var8++;
               var10000[var10001] += var1.field4280[var7++];
            }

            var7 += var1.field4270 - var3.field3923;
            var8 += var2.field4270 - var3.field3923;
         }

      }
   }
}
