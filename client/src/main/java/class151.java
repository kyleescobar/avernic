public class class151 extends class349 {
   public static class223 field1680 = new class223(64);
   public static class277 field1683;
   public static int field1687;
   static class398[] field1679;
   int field1681 = 0;
   public int field1682;
   public int field1684;
   public int field1685;
   public int field1686;

   public void method2515() {
      this.method2514(this.field1681);
   }

   public void method2516(Buffer var1, int var2) {
      while(true) {
         int var4 = var1.readUnsignedByte();
         if (0 == var4) {
            return;
         }

         this.method2517(var1, var4, var2);
      }
   }

   void method2517(Buffer var1, int var2, int var3) {
      if (var2 == 1) {
         this.field1681 = var1.method5952();
      }

   }

   void method2514(int var1) {
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
            var15 = (var11 - var9) / (var9 + var11);
         }

         if (var17 >= 0.5D) {
            var15 = (var11 - var9) / (2.0D - var11 - var9);
         }

         if (var3 == var11) {
            var13 = (var5 - var7) / (var11 - var9);
         } else if (var5 == var11) {
            var13 = 2.0D + (var7 - var3) / (var11 - var9);
         } else if (var7 == var11) {
            var13 = 4.0D + (var3 - var5) / (var11 - var9);
         }
      }

      var13 /= 6.0D;
      this.field1686 = (int)(var15 * 256.0D);
      this.field1684 = (int)(var17 * 256.0D);
      if (this.field1686 < 0) {
         this.field1686 = 0;
      } else if (this.field1686 > 255) {
         this.field1686 = 255;
      }

      if (this.field1684 < 0) {
         this.field1684 = 0;
      } else if (this.field1684 > 255) {
         this.field1684 = 255;
      }

      if (var17 > 0.5D) {
         this.field1685 = (int)(var15 * (1.0D - var17) * 512.0D);
      } else {
         this.field1685 = (int)(var15 * var17 * 512.0D);
      }

      if (this.field1685 < 1) {
         this.field1685 = 1;
      }

      this.field1682 = (int)(var13 * (double)this.field1685);
   }

   public static void method2530(boolean var0) {
      if (var0 != class145.field1595) {
         class152.method2536();
         class145.field1595 = var0;
      }

   }

   static void method2522(int var0, int var1) {
      int var3 = class130.field1468.method4848(class270.field3383);

      int var4;
      for(var4 = 0; var4 < client.field545; ++var4) {
         class302 var5 = class130.field1468;
         String var6;
         if (var4 < 0) {
            var6 = "";
         } else if (client.field551[var4].length() > 0) {
            var6 = client.field485[var4] + class270.field3267 + client.field551[var4];
         } else {
            var6 = client.field485[var4];
         }

         int var7 = var5.method4848(var6);
         if (var7 > var3) {
            var3 = var7;
         }
      }

      var3 += 8;
      var4 = 22 + client.field545 * 15;
      int var8 = var0 - var3 / 2;
      if (var3 + var8 > class69.canvasWidth) {
         var8 = class69.canvasWidth - var3;
      }

      if (var8 < 0) {
         var8 = 0;
      }

      int var9 = var1;
      if (var4 + var1 > client.canvasHeight) {
         var9 = client.canvasHeight - var4;
      }

      if (var9 < 0) {
         var9 = 0;
      }

      class150.field1659 = var8;
      class335.field3907 = var9;
      class12.field69 = var3;
      class52.field772 = 22 + client.field545 * 15;
   }

   static boolean method2531(Interface var0) {
      return var0.field2978;
   }
}
