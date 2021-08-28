public class class158 extends class349 {
   public static class223 field1843 = new class223(64);
   public static class277 field1855;
   static class38 field1842;
   public boolean field1846 = true;
   public int field1844 = 0;
   public int field1847;
   public int field1848 = -1;
   public int field1849;
   public int field1850;
   public int field1851;
   public int field1852;
   public int field1853;
   public int field1856 = -1;

   public static class402 method2772(int var0) {
      class402[] var2 = new class402[]{class402.field4298, class402.field4300, class402.field4299};
      class402[] var3 = var2;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         class402 var5 = var3[var4];
         if (var0 == var5.field4301) {
            return var5;
         }
      }

      return null;
   }

   public void method2757() {
      if (-1 != this.field1848) {
         this.method2760(this.field1848);
         this.field1851 = this.field1847;
         this.field1852 = this.field1849;
         this.field1853 = this.field1850;
      }

      this.method2760(this.field1844);
   }

   public void method2758(Buffer var1, int var2) {
      while(true) {
         int var4 = var1.readUnsignedByte();
         if (0 == var4) {
            return;
         }

         this.method2759(var1, var4, var2);
      }
   }

   void method2759(Buffer var1, int var2, int var3) {
      if (var2 == 1) {
         this.field1844 = var1.method5952();
      } else if (var2 == 2) {
         this.field1856 = var1.readUnsignedByte();
      } else if (var2 == 5) {
         this.field1846 = false;
      } else if (7 == var2) {
         this.field1848 = var1.method5952();
      } else if (var2 == 8) {
      }

   }

   void method2760(int var1) {
      double var3 = (double)(var1 >> 16 & 255) / 256.0D;
      double var5 = (double)(var1 >> 8 & 255) / 256.0D;
      double var7 = (double)(var1 & 255) / 256.0D;
      double var9 = var3;
      if (var5 < var3) {
         var9 = var5;
      }

      if (var7 < var9) {
         var9 = var7;
      }

      double var11 = var3;
      if (var5 > var3) {
         var11 = var5;
      }

      if (var7 > var11) {
         var11 = var7;
      }

      double var13 = 0.0D;
      double var15 = 0.0D;
      double var17 = (var9 + var11) / 2.0D;
      if (var9 != var11) {
         if (var17 < 0.5D) {
            var15 = (var11 - var9) / (var11 + var9);
         }

         if (var17 >= 0.5D) {
            var15 = (var11 - var9) / (2.0D - var11 - var9);
         }

         if (var11 == var3) {
            var13 = (var5 - var7) / (var11 - var9);
         } else if (var5 == var11) {
            var13 = (var7 - var3) / (var11 - var9) + 2.0D;
         } else if (var11 == var7) {
            var13 = 4.0D + (var3 - var5) / (var11 - var9);
         }
      }

      var13 /= 6.0D;
      this.field1847 = (int)(256.0D * var13);
      this.field1849 = (int)(256.0D * var15);
      this.field1850 = (int)(256.0D * var17);
      if (this.field1849 < 0) {
         this.field1849 = 0;
      } else if (this.field1849 > 255) {
         this.field1849 = 255;
      }

      if (this.field1850 < 0) {
         this.field1850 = 0;
      } else if (this.field1850 > 255) {
         this.field1850 = 255;
      }

   }
}
