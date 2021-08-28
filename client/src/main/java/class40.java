import java.util.Random;

public class class40 {
   static int[] field324;
   static int[] field326;
   static int[] field334;
   static int[] field342;
   static int[] field343;
   static int[] field347 = new int['\u8000'];
   static int[] field348;
   static int[] field349;
   class26 field325;
   class26 field327;
   class26 field329;
   class26 field330;
   class26 field331;
   class26 field336;
   class26 field338;
   class26 field341;
   class26 field345;
   class39 field337;
   int field328 = 100;
   int field335 = 0;
   int field340 = 0;
   int field344 = 500;
   int[] field332 = new int[]{0, 0, 0, 0, 0};
   int[] field333 = new int[]{0, 0, 0, 0, 0};
   int[] field339 = new int[]{0, 0, 0, 0, 0};

   static {
      Random var0 = new Random(0L);

      int var1;
      for(var1 = 0; var1 < 32768; ++var1) {
         field347[var1] = (var0.nextInt() & 2) - 1;
      }

      field343 = new int['\u8000'];

      for(var1 = 0; var1 < 32768; ++var1) {
         field343[var1] = (int)(Math.sin((double)var1 / 5215.1903D) * 16384.0D);
      }

      field326 = new int[220500];
      field334 = new int[5];
      field324 = new int[5];
      field342 = new int[5];
      field348 = new int[5];
      field349 = new int[5];
   }

   class40() {
   }

   final int[] method755(int var1, int var2) {
      class309.method5027(field326, 0, var1);
      if (var2 < 10) {
         return field326;
      } else {
         double var3 = (double)var1 / ((double)var2 + 0.0D);
         this.field341.method454();
         this.field325.method454();
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         if (this.field345 != null) {
            this.field345.method454();
            this.field327.method454();
            var5 = (int)((double)(this.field345.field207 - this.field345.field208) * 32.768D / var3);
            var6 = (int)((double)this.field345.field208 * 32.768D / var3);
         }

         int var8 = 0;
         int var9 = 0;
         int var10 = 0;
         if (this.field330 != null) {
            this.field330.method454();
            this.field329.method454();
            var8 = (int)((double)(this.field330.field207 - this.field330.field208) * 32.768D / var3);
            var9 = (int)((double)this.field330.field208 * 32.768D / var3);
         }

         int var11;
         for(var11 = 0; var11 < 5; ++var11) {
            if (this.field332[var11] != 0) {
               field334[var11] = 0;
               field324[var11] = (int)((double)this.field339[var11] * var3);
               field342[var11] = (this.field332[var11] << 14) / 100;
               field348[var11] = (int)((double)(this.field341.field207 - this.field341.field208) * 32.768D * Math.pow(1.0057929410678534D, (double)this.field333[var11]) / var3);
               field349[var11] = (int)((double)this.field341.field208 * 32.768D / var3);
            }
         }

         int var12;
         int var13;
         int var14;
         int var15;
         int[] var10000;
         for(var11 = 0; var11 < var1; ++var11) {
            var12 = this.field341.method455(var1);
            var13 = this.field325.method455(var1);
            if (this.field345 != null) {
               var14 = this.field345.method455(var1);
               var15 = this.field327.method455(var1);
               var12 += this.method745(var7, var15, this.field345.field213) >> 1;
               var7 += (var14 * var5 >> 16) + var6;
            }

            if (this.field330 != null) {
               var14 = this.field330.method455(var1);
               var15 = this.field329.method455(var1);
               var13 = var13 * ((this.method745(var10, var15, this.field330.field213) >> 1) + '\u8000') >> 15;
               var10 += (var14 * var8 >> 16) + var9;
            }

            for(var14 = 0; var14 < 5; ++var14) {
               if (this.field332[var14] != 0) {
                  var15 = var11 + field324[var14];
                  if (var15 < var1) {
                     var10000 = field326;
                     var10000[var15] += this.method745(field334[var14], var13 * field342[var14] >> 15, this.field341.field213);
                     var10000 = field334;
                     var10000[var14] += (var12 * field348[var14] >> 16) + field349[var14];
                  }
               }
            }
         }

         int var16;
         if (this.field336 != null) {
            this.field336.method454();
            this.field331.method454();
            var11 = 0;
            boolean var19 = false;
            boolean var20 = true;

            for(var14 = 0; var14 < var1; ++var14) {
               var15 = this.field336.method455(var1);
               var16 = this.field331.method455(var1);
               if (var20) {
                  var12 = this.field336.field208 + ((this.field336.field207 - this.field336.field208) * var15 >> 8);
               } else {
                  var12 = this.field336.field208 + ((this.field336.field207 - this.field336.field208) * var16 >> 8);
               }

               var11 += 256;
               if (var11 >= var12) {
                  var11 = 0;
                  var20 = !var20;
               }

               if (var20) {
                  field326[var14] = 0;
               }
            }
         }

         if (this.field335 > 0 && this.field328 > 0) {
            var11 = (int)((double)this.field335 * var3);

            for(var12 = var11; var12 < var1; ++var12) {
               var10000 = field326;
               var10000[var12] += field326[var12 - var11] * this.field328 / 100;
            }
         }

         if (this.field337.field321[0] > 0 || this.field337.field321[1] > 0) {
            this.field338.method454();
            var11 = this.field338.method455(var1 + 1);
            var12 = this.field337.method740(0, (float)var11 / 65536.0F);
            var13 = this.field337.method740(1, (float)var11 / 65536.0F);
            if (var1 >= var12 + var13) {
               var14 = 0;
               var15 = var13;
               if (var13 > var1 - var12) {
                  var15 = var1 - var12;
               }

               int var17;
               while(var14 < var15) {
                  var16 = (int)((long)field326[var14 + var12] * (long)class39.field320 >> 16);

                  for(var17 = 0; var17 < var12; ++var17) {
                     var16 += (int)((long)field326[var14 + var12 - 1 - var17] * (long)class39.field318[0][var17] >> 16);
                  }

                  for(var17 = 0; var17 < var14; ++var17) {
                     var16 -= (int)((long)field326[var14 - 1 - var17] * (long)class39.field318[1][var17] >> 16);
                  }

                  field326[var14] = var16;
                  var11 = this.field338.method455(var1 + 1);
                  ++var14;
               }

               var15 = 128;

               while(true) {
                  if (var15 > var1 - var12) {
                     var15 = var1 - var12;
                  }

                  int var18;
                  while(var14 < var15) {
                     var17 = (int)((long)field326[var14 + var12] * (long)class39.field320 >> 16);

                     for(var18 = 0; var18 < var12; ++var18) {
                        var17 += (int)((long)field326[var14 + var12 - 1 - var18] * (long)class39.field318[0][var18] >> 16);
                     }

                     for(var18 = 0; var18 < var13; ++var18) {
                        var17 -= (int)((long)field326[var14 - 1 - var18] * (long)class39.field318[1][var18] >> 16);
                     }

                     field326[var14] = var17;
                     var11 = this.field338.method455(var1 + 1);
                     ++var14;
                  }

                  if (var14 >= var1 - var12) {
                     while(var14 < var1) {
                        var17 = 0;

                        for(var18 = var14 + var12 - var1; var18 < var12; ++var18) {
                           var17 += (int)((long)field326[var14 + var12 - 1 - var18] * (long)class39.field318[0][var18] >> 16);
                        }

                        for(var18 = 0; var18 < var13; ++var18) {
                           var17 -= (int)((long)field326[var14 - 1 - var18] * (long)class39.field318[1][var18] >> 16);
                        }

                        field326[var14] = var17;
                        this.field338.method455(var1 + 1);
                        ++var14;
                     }
                     break;
                  }

                  var12 = this.field337.method740(0, (float)var11 / 65536.0F);
                  var13 = this.field337.method740(1, (float)var11 / 65536.0F);
                  var15 += 128;
               }
            }
         }

         for(var11 = 0; var11 < var1; ++var11) {
            if (field326[var11] < -32768) {
               field326[var11] = -32768;
            }

            if (field326[var11] > 32767) {
               field326[var11] = 32767;
            }
         }

         return field326;
      }
   }

   final int method745(int var1, int var2, int var3) {
      if (var3 == 1) {
         return (var1 & 32767) < 16384 ? var2 : -var2;
      } else if (var3 == 2) {
         return field343[var1 & 32767] * var2 >> 14;
      } else if (var3 == 3) {
         return ((var1 & 32767) * var2 >> 14) - var2;
      } else {
         return var3 == 4 ? field347[var1 / 2607 & 32767] * var2 : 0;
      }
   }

   final void method746(Buffer var1) {
      this.field341 = new class26();
      this.field341.method452(var1);
      this.field325 = new class26();
      this.field325.method452(var1);
      int var2 = var1.readUnsignedByte();
      if (var2 != 0) {
         --var1.offset;
         this.field345 = new class26();
         this.field345.method452(var1);
         this.field327 = new class26();
         this.field327.method452(var1);
      }

      var2 = var1.readUnsignedByte();
      if (var2 != 0) {
         --var1.offset;
         this.field330 = new class26();
         this.field330.method452(var1);
         this.field329 = new class26();
         this.field329.method452(var1);
      }

      var2 = var1.readUnsignedByte();
      if (var2 != 0) {
         --var1.offset;
         this.field336 = new class26();
         this.field336.method452(var1);
         this.field331 = new class26();
         this.field331.method452(var1);
      }

      for(int var3 = 0; var3 < 10; ++var3) {
         int var4 = var1.method5962();
         if (var4 == 0) {
            break;
         }

         this.field332[var3] = var4;
         this.field333[var3] = var1.method5961();
         this.field339[var3] = var1.method5962();
      }

      this.field335 = var1.method5962();
      this.field328 = var1.method5962();
      this.field344 = var1.readUnsignedShort();
      this.field340 = var1.readUnsignedShort();
      this.field337 = new class39();
      this.field338 = new class26();
      this.field337.method732(var1, this.field338);
   }
}
