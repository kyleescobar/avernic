public class class74 {
   class397[] field1097;
   int field1088 = 0;
   int field1093 = 0;
   int field1094 = 0;
   int field1098 = 0;
   int field1099 = 0;
   int field1106 = 0;
   int[] field1087;
   int[] field1092 = new int[256];
   int[] field1095;
   int[] field1096;
   int[] field1100;
   int[] field1101;
   int[] field1102;
   int[] field1103;
   int[] field1105;

   class74(class397[] var1) {
      this.field1097 = var1;
      this.method1773();
   }

   void method1773() {
      this.field1095 = new int[256];

      int var2;
      for(var2 = 0; var2 < 64; ++var2) {
         this.field1095[var2] = 262144 * var2;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field1095[64 + var2] = var2 * 1024 + 16711680;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field1095[128 + var2] = var2 * 4 + 16776960;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field1095[192 + var2] = 16777215;
      }

      this.field1096 = new int[256];

      for(var2 = 0; var2 < 64; ++var2) {
         this.field1096[var2] = 1024 * var2;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field1096[var2 + 64] = '\uff00' + 4 * var2;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field1096[var2 + 128] = 262144 * var2 + '\uffff';
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field1096[192 + var2] = 16777215;
      }

      this.field1103 = new int[256];

      for(var2 = 0; var2 < 64; ++var2) {
         this.field1103[var2] = 4 * var2;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field1103[var2 + 64] = 255 + 262144 * var2;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field1103[var2 + 128] = 16711935 + var2 * 1024;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field1103[var2 + 192] = 16777215;
      }

      this.field1102 = new int[256];
      this.field1094 = 0;
      this.field1105 = new int['\u8000'];
      this.field1087 = new int['\u8000'];
      this.method1781((class397)null);
      this.field1100 = new int['\u8000'];
      this.field1101 = new int['\u8000'];
   }

   void method1794() {
      this.field1095 = null;
      this.field1096 = null;
      this.field1103 = null;
      this.field1102 = null;
      this.field1105 = null;
      this.field1087 = null;
      this.field1100 = null;
      this.field1101 = null;
      this.field1094 = 0;
      this.field1088 = 0;
   }

   void method1775(int var1, int var2) {
      if (null == this.field1100) {
         this.method1773();
      }

      if (this.field1106 == 0) {
         this.field1106 = var2;
      }

      int var4 = var2 - this.field1106;
      if (var4 >= 256) {
         var4 = 0;
      }

      this.field1106 = var2;
      if (var4 > 0) {
         this.method1776(var4);
      }

      this.method1778(var1);
   }

   final void method1776(int var1) {
      this.field1094 += var1 * 128;
      int var3;
      if (this.field1094 > this.field1105.length) {
         this.field1094 -= this.field1105.length;
         var3 = (int)(Math.random() * 12.0D);
         this.method1781(this.field1097[var3]);
      }

      var3 = 0;
      int var4 = 128 * var1;
      int var5 = (256 - var1) * 128;

      int var7;
      for(int var6 = 0; var6 < var5; ++var6) {
         var7 = this.field1100[var4 + var3] - this.field1105[this.field1094 + var3 & this.field1105.length - 1] * var1 / 6;
         if (var7 < 0) {
            var7 = 0;
         }

         this.field1100[var3++] = var7;
      }

      byte var16 = 10;
      var7 = 128 - var16;

      int var8;
      int var11;
      for(var8 = 256 - var1; var8 < 256; ++var8) {
         int var9 = 128 * var8;

         for(int var10 = 0; var10 < 128; ++var10) {
            var11 = (int)(Math.random() * 100.0D);
            if (var11 < 50 && var10 > var16 && var10 < var7) {
               this.field1100[var10 + var9] = 255;
            } else {
               this.field1100[var10 + var9] = 0;
            }
         }
      }

      if (this.field1098 > 0) {
         this.field1098 -= var1 * 4;
      }

      if (this.field1099 > 0) {
         this.field1099 -= 4 * var1;
      }

      if (0 == this.field1098 && 0 == this.field1099) {
         var8 = (int)(Math.random() * (double)(2000 / var1));
         if (var8 == 0) {
            this.field1098 = 1024;
         }

         if (1 == var8) {
            this.field1099 = 1024;
         }
      }

      for(var8 = 0; var8 < 256 - var1; ++var8) {
         this.field1092[var8] = this.field1092[var8 + var1];
      }

      for(var8 = 256 - var1; var8 < 256; ++var8) {
         this.field1092[var8] = (int)(Math.sin((double)this.field1093 / 14.0D) * 16.0D + Math.sin((double)this.field1093 / 15.0D) * 14.0D + Math.sin((double)this.field1093 / 16.0D) * 12.0D);
         ++this.field1093;
      }

      this.field1088 += var1;
      var8 = (var1 + (client.cycle & 1)) / 2;
      if (var8 > 0) {
         short var17 = 128;
         byte var18 = 2;
         var11 = 128 - var18 - var18;

         int var12;
         int var13;
         int var14;
         for(var12 = 0; var12 < this.field1088 * 100; ++var12) {
            var13 = (int)(Math.random() * (double)var11) + var18;
            var14 = (int)(Math.random() * (double)var17) + var17;
            this.field1100[(var14 << 7) + var13] = 192;
         }

         this.field1088 = 0;

         int var15;
         for(var12 = 0; var12 < 256; ++var12) {
            var13 = 0;
            var14 = 128 * var12;

            for(var15 = -var8; var15 < 128; ++var15) {
               if (var15 + var8 < 128) {
                  var13 += this.field1100[var15 + var14 + var8];
               }

               if (var15 - (1 + var8) >= 0) {
                  var13 -= this.field1100[var14 + var15 - (var8 + 1)];
               }

               if (var15 >= 0) {
                  this.field1101[var14 + var15] = var13 / (1 + 2 * var8);
               }
            }
         }

         for(var12 = 0; var12 < 128; ++var12) {
            var13 = 0;

            for(var14 = -var8; var14 < 256; ++var14) {
               var15 = 128 * var14;
               if (var8 + var14 < 256) {
                  var13 += this.field1101[var12 + var15 + var8 * 128];
               }

               if (var14 - (1 + var8) >= 0) {
                  var13 -= this.field1101[var12 + var15 - 128 * (1 + var8)];
               }

               if (var14 >= 0) {
                  this.field1100[var12 + var15] = var13 / (1 + 2 * var8);
               }
            }
         }
      }

   }

   final int method1777(int var1, int var2, int var3) {
      int var5 = 256 - var3;
      return ((var2 & '\uff00') * var3 + var5 * (var1 & '\uff00') & 16711680) + (var3 * (var2 & 16711935) + (var1 & 16711935) * var5 & -16711936) >> 8;
   }

   final void method1778(int var1) {
      int var3 = this.field1102.length;
      if (this.field1098 > 0) {
         this.method1779(this.field1098, this.field1096);
      } else if (this.field1099 > 0) {
         this.method1779(this.field1099, this.field1103);
      } else {
         for(int var4 = 0; var4 < var3; ++var4) {
            this.field1102[var4] = this.field1095[var4];
         }
      }

      this.method1798(var1);
   }

   final void method1779(int var1, int[] var2) {
      int var4 = this.field1102.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         if (var1 > 768) {
            this.field1102[var5] = this.method1777(this.field1095[var5], var2[var5], 1024 - var1);
         } else if (var1 > 256) {
            this.field1102[var5] = var2[var5];
         } else {
            this.field1102[var5] = this.method1777(var2[var5], this.field1095[var5], 256 - var1);
         }
      }

   }

   final void method1798(int var1) {
      int var3 = 0;

      for(int var4 = 1; var4 < 255; ++var4) {
         int var5 = this.field1092[var4] * (256 - var4) / 256;
         int var6 = var5 + var1;
         int var7 = 0;
         int var8 = 128;
         if (var6 < 0) {
            var7 = -var6;
            var6 = 0;
         }

         if (128 + var6 >= class264.field3194.field4254) {
            var8 = class264.field3194.field4254 - var6;
         }

         int var9 = var6 + class264.field3194.field4254 * (var4 + 8);
         var3 += var7;

         for(int var10 = var7; var10 < var8; ++var10) {
            int var11 = this.field1100[var3++];
            int var12 = var9 % class394.field4245;
            if (0 != var11 && var12 >= class394.field4249 && var12 < class394.field4248) {
               int var13 = var11;
               int var14 = 256 - var11;
               var11 = this.field1102[var11];
               int var15 = class264.field3194.field4252[var9];
               class264.field3194.field4252[var9++] = -16777216 | ((var15 & '\uff00') * var14 + (var11 & '\uff00') * var13 & 16711680) + ((var11 & 16711935) * var13 + var14 * (var15 & 16711935) & -16711936) >> 8;
            } else {
               ++var9;
            }
         }

         var3 += 128 - var8;
      }

   }

   final void method1781(class397 var1) {
      int var3;
      for(var3 = 0; var3 < this.field1105.length; ++var3) {
         this.field1105[var3] = 0;
      }

      int var4;
      for(var3 = 0; var3 < 5000; ++var3) {
         var4 = (int)(Math.random() * 128.0D * 256.0D);
         this.field1105[var4] = (int)(Math.random() * 256.0D);
      }

      int var5;
      int var6;
      for(var3 = 0; var3 < 20; ++var3) {
         for(var4 = 1; var4 < 255; ++var4) {
            for(var5 = 1; var5 < 127; ++var5) {
               var6 = (var4 << 7) + var5;
               this.field1087[var6] = (this.field1105[var6 + 128] + this.field1105[var6 - 1] + this.field1105[var6 + 1] + this.field1105[var6 - 128]) / 4;
            }
         }

         int[] var9 = this.field1105;
         this.field1105 = this.field1087;
         this.field1087 = var9;
      }

      if (null != var1) {
         var3 = 0;

         for(var4 = 0; var4 < var1.field4264; ++var4) {
            for(var5 = 0; var5 < var1.field4263; ++var5) {
               if (var1.field4262[var3++] != 0) {
                  var6 = var1.field4265 + var5 + 16;
                  int var7 = var4 + 16 + var1.field4266;
                  int var8 = (var7 << 7) + var6;
                  this.field1105[var8] = 0;
               }
            }
         }
      }

   }
}
