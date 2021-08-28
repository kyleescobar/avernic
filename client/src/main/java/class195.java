public class class195 extends class354 {
   static int[] field2211;
   boolean field2202;
   boolean field2210 = false;
   int field2197;
   int field2201;
   int field2209;
   int[] field2200;
   int[] field2205;
   int[] field2206;
   int[] field2207;
   int[] field2208;

   class195(Buffer var1) {
      this.field2201 = var1.readUnsignedShort();
      this.field2202 = var1.readUnsignedByte() == 1;
      int var2 = var1.readUnsignedByte();
      if (var2 >= 1 && var2 <= 4) {
         this.field2206 = new int[var2];

         int var3;
         for(var3 = 0; var3 < var2; ++var3) {
            this.field2206[var3] = var1.readUnsignedShort();
         }

         if (var2 > 1) {
            this.field2208 = new int[var2 - 1];

            for(var3 = 0; var3 < var2 - 1; ++var3) {
               this.field2208[var3] = var1.readUnsignedByte();
            }
         }

         if (var2 > 1) {
            this.field2205 = new int[var2 - 1];

            for(var3 = 0; var3 < var2 - 1; ++var3) {
               this.field2205[var3] = var1.readUnsignedByte();
            }
         }

         this.field2200 = new int[var2];

         for(var3 = 0; var3 < var2; ++var3) {
            this.field2200[var3] = var1.readInt();
         }

         this.field2197 = var1.readUnsignedByte();
         this.field2209 = var1.readUnsignedByte();
         this.field2207 = null;
      } else {
         throw new RuntimeException();
      }
   }

   boolean method3411(double var1, int var3, class277 var4) {
      int var5;
      for(var5 = 0; var5 < this.field2206.length; ++var5) {
         if (var4.method4479(this.field2206[var5]) == null) {
            return false;
         }
      }

      var5 = var3 * var3;
      this.field2207 = new int[var5];

      for(int var6 = 0; var6 < this.field2206.length; ++var6) {
         class397 var7 = class156.method2684(var4, this.field2206[var6]);
         var7.method6356();
         byte[] var8 = var7.field4262;
         int[] var9 = var7.field4261;
         int var10 = this.field2200[var6];
         if ((var10 & -16777216) == 16777216) {
         }

         if ((var10 & -16777216) == 33554432) {
         }

         int var11;
         int var12;
         int var13;
         int var14;
         if ((var10 & -16777216) == 50331648) {
            var11 = var10 & 16711935;
            var12 = var10 >> 8 & 255;

            for(var13 = 0; var13 < var9.length; ++var13) {
               var14 = var9[var13];
               if ((var14 & '\uffff') == var14 >> 8) {
                  var14 &= 255;
                  var9[var13] = var11 * var14 >> 8 & 16711935 | var12 * var14 & '\uff00';
               }
            }
         }

         for(var11 = 0; var11 < var9.length; ++var11) {
            var9[var11] = Rasterizer3D.method3422(var9[var11], var1);
         }

         if (var6 == 0) {
            var11 = 0;
         } else {
            var11 = this.field2208[var6 - 1];
         }

         if (var11 == 0) {
            if (var7.field4263 == var3) {
               for(var12 = 0; var12 < var5; ++var12) {
                  this.field2207[var12] = var9[var8[var12] & 255];
               }
            } else if (var7.field4263 == 64 && var3 == 128) {
               var12 = 0;

               for(var13 = 0; var13 < var3; ++var13) {
                  for(var14 = 0; var14 < var3; ++var14) {
                     this.field2207[var12++] = var9[var8[(var14 >> 1) + (var13 >> 1 << 6)] & 255];
                  }
               }
            } else {
               if (var7.field4263 != 128 || var3 != 64) {
                  throw new RuntimeException();
               }

               var12 = 0;

               for(var13 = 0; var13 < var3; ++var13) {
                  for(var14 = 0; var14 < var3; ++var14) {
                     this.field2207[var12++] = var9[var8[(var14 << 1) + (var13 << 1 << 7)] & 255];
                  }
               }
            }
         }

         if (var11 == 1) {
         }

         if (var11 == 2) {
         }

         if (var11 == 3) {
         }
      }

      return true;
   }

   void method3402() {
      this.field2207 = null;
   }

   void method3403(int var1) {
      if (this.field2207 != null) {
         short var2;
         int var3;
         int var4;
         int var5;
         int var6;
         int var7;
         int[] var10;
         if (this.field2197 == 1 || this.field2197 == 3) {
            if (field2211 == null || field2211.length < this.field2207.length) {
               field2211 = new int[this.field2207.length];
            }

            if (this.field2207.length == 4096) {
               var2 = 64;
            } else {
               var2 = 128;
            }

            var3 = this.field2207.length;
            var4 = var2 * var1 * this.field2209;
            var5 = var3 - 1;
            if (this.field2197 == 1) {
               var4 = -var4;
            }

            for(var6 = 0; var6 < var3; ++var6) {
               var7 = var6 + var4 & var5;
               field2211[var6] = this.field2207[var7];
            }

            var10 = this.field2207;
            this.field2207 = field2211;
            field2211 = var10;
         }

         if (this.field2197 == 2 || this.field2197 == 4) {
            if (field2211 == null || field2211.length < this.field2207.length) {
               field2211 = new int[this.field2207.length];
            }

            if (this.field2207.length == 4096) {
               var2 = 64;
            } else {
               var2 = 128;
            }

            var3 = this.field2207.length;
            var4 = var1 * this.field2209;
            var5 = var2 - 1;
            if (this.field2197 == 2) {
               var4 = -var4;
            }

            for(var6 = 0; var6 < var3; var6 += var2) {
               for(var7 = 0; var7 < var2; ++var7) {
                  int var8 = var6 + var7;
                  int var9 = var6 + (var7 + var4 & var5);
                  field2211[var8] = this.field2207[var9];
               }
            }

            var10 = this.field2207;
            this.field2207 = field2211;
            field2211 = var10;
         }

      }
   }
}
