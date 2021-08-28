public class class205 implements class213 {
   class195[] field2378;
   class277 field2381;
   class296 field2376 = new class296();
   double field2379 = 1.0D;
   int field2375;
   int field2377 = 0;
   int field2380 = 128;

   public class205(class277 var1, class277 var2, int var3, double var4, int var6) {
      this.field2381 = var2;
      this.field2375 = var3;
      this.field2377 = this.field2375;
      this.field2379 = var4;
      this.field2380 = var6;
      int[] var7 = var1.method4481(0);
      int var8 = var7.length;
      this.field2378 = new class195[var1.method4438(0)];

      for(int var9 = 0; var9 < var8; ++var9) {
         Buffer var10 = new Buffer(var1.method4412(0, var7[var9]));
         this.field2378[var7[var9]] = new class195(var10);
      }

   }

   public static byte[] method3714(byte[] var0) {
      int var2 = var0.length;
      byte[] var3 = new byte[var2];
      System.arraycopy(var0, 0, var3, 0, var2);
      return var3;
   }

   public int method3699() {
      int var2 = 0;
      int var3 = 0;
      class195[] var4 = this.field2378;

      for(int var5 = 0; var5 < var4.length; ++var5) {
         class195 var6 = var4[var5];
         if (var6 != null && null != var6.field2206) {
            var2 += var6.field2206.length;
            int[] var7 = var6.field2206;

            for(int var8 = 0; var8 < var7.length; ++var8) {
               int var9 = var7[var8];
               if (this.field2381.method4439(var9)) {
                  ++var3;
               }
            }
         }
      }

      if (var2 == 0) {
         return 0;
      } else {
         return 100 * var3 / var2;
      }
   }

   public void method3705(double var1) {
      this.field2379 = var1;
      this.method3700();
   }

   public int[] method3844(int var1) {
      class195 var3 = this.field2378[var1];
      if (var3 != null) {
         if (var3.field2207 != null) {
            this.field2376.method4673(var3);
            var3.field2210 = true;
            return var3.field2207;
         }

         boolean var4 = var3.method3411(this.field2379, this.field2380, this.field2381);
         if (var4) {
            if (this.field2377 == 0) {
               class195 var5 = (class195)this.field2376.method4675();
               var5.method3402();
            } else {
               --this.field2377;
            }

            this.field2376.method4673(var3);
            var3.field2210 = true;
            return var3.field2207;
         }
      }

      return null;
   }

   public int method3835(int var1) {
      return this.field2378[var1] != null ? this.field2378[var1].field2201 : 0;
   }

   public boolean method3841(int var1) {
      return this.field2378[var1].field2202;
   }

   public boolean method3834(int var1) {
      return 64 == this.field2380;
   }

   public void method3700() {
      for(int var2 = 0; var2 < this.field2378.length; ++var2) {
         if (null != this.field2378[var2]) {
            this.field2378[var2].method3402();
         }
      }

      this.field2376 = new class296();
      this.field2377 = this.field2375;
   }

   public void method3701(int var1) {
      for(int var3 = 0; var3 < this.field2378.length; ++var3) {
         class195 var4 = this.field2378[var3];
         if (null != var4 && 0 != var4.field2197 && var4.field2210) {
            var4.method3403(var1);
            var4.field2210 = false;
         }
      }

   }
}
