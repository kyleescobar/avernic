public class class207 extends class201 {
   static boolean field2465 = true;
   static boolean[] field2433 = new boolean[6500];
   static boolean[] field2444 = new boolean[6500];
   static byte[] field2405 = new byte[1];
   static byte[] field2428 = new byte[1];
   static class207 field2406 = new class207();
   static class207 field2421 = new class207();
   static int field2462;
   static int field2463;
   static int field2464;
   static int[] field2408 = new int[10];
   static int[] field2423 = new int[12];
   static int[] field2431 = new int[6500];
   static int[] field2436 = new int[12];
   static int[] field2446;
   static int[] field2447 = new int[6500];
   static int[] field2448 = new int[6500];
   static int[] field2449 = new int[6500];
   static int[] field2450 = new int[6500];
   static int[] field2452 = new int[1600];
   static int[] field2456 = new int[2000];
   static int[] field2457 = new int[2000];
   static int[] field2459 = new int[6500];
   static int[] field2460 = new int[10];
   static int[] field2461 = new int[10];
   static int[] field2468;
   static int[] field2470;
   static int[] field2471;
   static int[][] field2455 = new int[12][2000];
   static int[][] field2469 = new int[1600][512];
   byte field2442 = 0;
   byte[] field2419;
   byte[] field2420;
   byte[] field2441;
   int field2407 = -1;
   int field2411 = -1;
   int field2412 = 0;
   int field2413;
   int field2414;
   int field2416;
   int field2424 = 0;
   int field2432;
   int field2434;
   int field2435;
   int field2437;
   int field2438;
   int field2439 = -1;
   int field2443 = 0;
   int[] field2409;
   int[] field2410;
   int[] field2415;
   int[] field2417;
   int[] field2418;
   int[] field2425;
   int[] field2426;
   int[] field2427;
   int[] field2429;
   int[] field2454;
   int[] field2458;
   int[] field2466;
   int[][] field2445;
   int[][] field2451;
   short[] field2422;
   public boolean field2430 = false;

   static {
      field2468 = Rasterizer3D.sineTable;
      field2446 = Rasterizer3D.cosineTable;
      field2470 = Rasterizer3D.field2268;
      field2471 = Rasterizer3D.field2271;
   }

   class207() {
   }

   public class207(class207[] var1, int var2) {
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      this.field2443 = 0;
      this.field2412 = 0;
      this.field2424 = 0;
      this.field2442 = -1;

      int var7;
      class207 var8;
      for(var7 = 0; var7 < var2; ++var7) {
         var8 = var1[var7];
         if (var8 != null) {
            this.field2443 += var8.field2443;
            this.field2412 += var8.field2412;
            this.field2424 += var8.field2424;
            if (var8.field2419 != null) {
               var3 = true;
            } else {
               if (this.field2442 == -1) {
                  this.field2442 = var8.field2442;
               }

               if (this.field2442 != var8.field2442) {
                  var3 = true;
               }
            }

            var4 |= var8.field2420 != null;
            var5 |= var8.field2422 != null;
            var6 |= var8.field2441 != null;
         }
      }

      this.field2425 = new int[this.field2443];
      this.field2410 = new int[this.field2443];
      this.field2458 = new int[this.field2443];
      this.field2429 = new int[this.field2412];
      this.field2466 = new int[this.field2412];
      this.field2415 = new int[this.field2412];
      this.field2409 = new int[this.field2412];
      this.field2417 = new int[this.field2412];
      this.field2418 = new int[this.field2412];
      if (var3) {
         this.field2419 = new byte[this.field2412];
      }

      if (var4) {
         this.field2420 = new byte[this.field2412];
      }

      if (var5) {
         this.field2422 = new short[this.field2412];
      }

      if (var6) {
         this.field2441 = new byte[this.field2412];
      }

      if (this.field2424 > 0) {
         this.field2454 = new int[this.field2424];
         this.field2426 = new int[this.field2424];
         this.field2427 = new int[this.field2424];
      }

      this.field2443 = 0;
      this.field2412 = 0;
      this.field2424 = 0;

      for(var7 = 0; var7 < var2; ++var7) {
         var8 = var1[var7];
         if (var8 != null) {
            int var9;
            for(var9 = 0; var9 < var8.field2412; ++var9) {
               this.field2429[this.field2412] = var8.field2429[var9] + this.field2443;
               this.field2466[this.field2412] = var8.field2466[var9] + this.field2443;
               this.field2415[this.field2412] = var8.field2415[var9] + this.field2443;
               this.field2409[this.field2412] = var8.field2409[var9];
               this.field2417[this.field2412] = var8.field2417[var9];
               this.field2418[this.field2412] = var8.field2418[var9];
               if (var3) {
                  if (var8.field2419 != null) {
                     this.field2419[this.field2412] = var8.field2419[var9];
                  } else {
                     this.field2419[this.field2412] = var8.field2442;
                  }
               }

               if (var4 && var8.field2420 != null) {
                  this.field2420[this.field2412] = var8.field2420[var9];
               }

               if (var5) {
                  if (var8.field2422 != null) {
                     this.field2422[this.field2412] = var8.field2422[var9];
                  } else {
                     this.field2422[this.field2412] = -1;
                  }
               }

               if (var6) {
                  if (var8.field2441 != null && var8.field2441[var9] != -1) {
                     this.field2441[this.field2412] = (byte)(var8.field2441[var9] + this.field2424);
                  } else {
                     this.field2441[this.field2412] = -1;
                  }
               }

               ++this.field2412;
            }

            for(var9 = 0; var9 < var8.field2424; ++var9) {
               this.field2454[this.field2424] = var8.field2454[var9] + this.field2443;
               this.field2426[this.field2424] = var8.field2426[var9] + this.field2443;
               this.field2427[this.field2424] = var8.field2427[var9] + this.field2443;
               ++this.field2424;
            }

            for(var9 = 0; var9 < var8.field2443; ++var9) {
               this.field2425[this.field2443] = var8.field2425[var9];
               this.field2410[this.field2443] = var8.field2410[var9];
               this.field2458[this.field2443] = var8.field2458[var9];
               ++this.field2443;
            }
         }
      }

   }

   public class207 method3716(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.method3721();
      int var7 = var2 - this.field2416;
      int var8 = var2 + this.field2416;
      int var9 = var4 - this.field2416;
      int var10 = var4 + this.field2416;
      if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
            return this;
         } else {
            class207 var11;
            if (var5) {
               var11 = new class207();
               var11.field2443 = this.field2443;
               var11.field2412 = this.field2412;
               var11.field2424 = this.field2424;
               var11.field2425 = this.field2425;
               var11.field2458 = this.field2458;
               var11.field2429 = this.field2429;
               var11.field2466 = this.field2466;
               var11.field2415 = this.field2415;
               var11.field2409 = this.field2409;
               var11.field2417 = this.field2417;
               var11.field2418 = this.field2418;
               var11.field2419 = this.field2419;
               var11.field2420 = this.field2420;
               var11.field2441 = this.field2441;
               var11.field2422 = this.field2422;
               var11.field2442 = this.field2442;
               var11.field2454 = this.field2454;
               var11.field2426 = this.field2426;
               var11.field2427 = this.field2427;
               var11.field2451 = this.field2451;
               var11.field2445 = this.field2445;
               var11.field2430 = this.field2430;
               var11.field2410 = new int[var11.field2443];
            } else {
               var11 = this;
            }

            int var12;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            if (var6 == 0) {
               for(var12 = 0; var12 < var11.field2443; ++var12) {
                  var13 = this.field2425[var12] + var2;
                  var14 = this.field2458[var12] + var4;
                  var15 = var13 & 127;
                  var16 = var14 & 127;
                  var17 = var13 >> 7;
                  var18 = var14 >> 7;
                  var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
                  var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.field2410[var12] = this.field2410[var12] + var21 - var3;
               }
            } else {
               for(var12 = 0; var12 < var11.field2443; ++var12) {
                  var13 = (-this.field2410[var12] << 16) / super.field2346;
                  if (var13 < var6) {
                     var14 = this.field2425[var12] + var2;
                     var15 = this.field2458[var12] + var4;
                     var16 = var14 & 127;
                     var17 = var15 & 127;
                     var18 = var14 >> 7;
                     var19 = var15 >> 7;
                     var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                     var21 = var1[var18][var19 + 1] * (128 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
                     int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                     var11.field2410[var12] = this.field2410[var12] + (var22 - var3) * (var6 - var13) / var6;
                  }
               }
            }

            var11.method3724();
            return var11;
         }
      } else {
         return this;
      }
   }

   public class207 method3717(boolean var1) {
      if (!var1 && field2405.length < this.field2412) {
         field2405 = new byte[this.field2412 + 100];
      }

      return this.method3719(var1, field2421, field2405);
   }

   public class207 method3718(boolean var1) {
      if (!var1 && field2428.length < this.field2412) {
         field2428 = new byte[this.field2412 + 100];
      }

      return this.method3719(var1, field2406, field2428);
   }

   class207 method3719(boolean var1, class207 var2, byte[] var3) {
      var2.field2443 = this.field2443;
      var2.field2412 = this.field2412;
      var2.field2424 = this.field2424;
      if (var2.field2425 == null || var2.field2425.length < this.field2443) {
         var2.field2425 = new int[this.field2443 + 100];
         var2.field2410 = new int[this.field2443 + 100];
         var2.field2458 = new int[this.field2443 + 100];
      }

      int var4;
      for(var4 = 0; var4 < this.field2443; ++var4) {
         var2.field2425[var4] = this.field2425[var4];
         var2.field2410[var4] = this.field2410[var4];
         var2.field2458[var4] = this.field2458[var4];
      }

      if (var1) {
         var2.field2420 = this.field2420;
      } else {
         var2.field2420 = var3;
         if (this.field2420 == null) {
            for(var4 = 0; var4 < this.field2412; ++var4) {
               var2.field2420[var4] = 0;
            }
         } else {
            for(var4 = 0; var4 < this.field2412; ++var4) {
               var2.field2420[var4] = this.field2420[var4];
            }
         }
      }

      var2.field2429 = this.field2429;
      var2.field2466 = this.field2466;
      var2.field2415 = this.field2415;
      var2.field2409 = this.field2409;
      var2.field2417 = this.field2417;
      var2.field2418 = this.field2418;
      var2.field2419 = this.field2419;
      var2.field2441 = this.field2441;
      var2.field2422 = this.field2422;
      var2.field2442 = this.field2442;
      var2.field2454 = this.field2454;
      var2.field2426 = this.field2426;
      var2.field2427 = this.field2427;
      var2.field2451 = this.field2451;
      var2.field2445 = this.field2445;
      var2.field2430 = this.field2430;
      var2.method3724();
      return var2;
   }

   void method3720(int var1) {
      if (this.field2439 == -1) {
         int var2 = 0;
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         int var8 = field2446[var1];
         int var9 = field2468[var1];

         for(int var10 = 0; var10 < this.field2443; ++var10) {
            int var11 = Rasterizer3D.method3433(this.field2425[var10], this.field2458[var10], var8, var9);
            int var12 = this.field2410[var10];
            int var13 = Rasterizer3D.method3414(this.field2425[var10], this.field2458[var10], var8, var9);
            if (var11 < var2) {
               var2 = var11;
            }

            if (var11 > var5) {
               var5 = var11;
            }

            if (var12 < var3) {
               var3 = var12;
            }

            if (var12 > var6) {
               var6 = var12;
            }

            if (var13 < var4) {
               var4 = var13;
            }

            if (var13 > var7) {
               var7 = var13;
            }
         }

         this.field2413 = (var5 + var2) / 2;
         this.field2437 = (var6 + var3) / 2;
         this.field2438 = (var7 + var4) / 2;
         this.field2439 = (var5 - var2 + 1) / 2;
         this.field2407 = (var6 - var3 + 1) / 2;
         this.field2411 = (var7 - var4 + 1) / 2;
         if (this.field2439 < 32) {
            this.field2439 = 32;
         }

         if (this.field2411 < 32) {
            this.field2411 = 32;
         }

         if (this.field2430) {
            this.field2439 += 8;
            this.field2411 += 8;
         }

      }
   }

   public void method3721() {
      if (this.field2435 != 1) {
         this.field2435 = 1;
         super.field2346 = 0;
         this.field2432 = 0;
         this.field2416 = 0;

         for(int var1 = 0; var1 < this.field2443; ++var1) {
            int var2 = this.field2425[var1];
            int var3 = this.field2410[var1];
            int var4 = this.field2458[var1];
            if (-var3 > super.field2346) {
               super.field2346 = -var3;
            }

            if (var3 > this.field2432) {
               this.field2432 = var3;
            }

            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field2416) {
               this.field2416 = var5;
            }
         }

         this.field2416 = (int)(Math.sqrt((double)this.field2416) + 0.99D);
         this.field2414 = (int)(Math.sqrt((double)(this.field2416 * this.field2416 + super.field2346 * super.field2346)) + 0.99D);
         this.field2434 = this.field2414 + (int)(Math.sqrt((double)(this.field2416 * this.field2416 + this.field2432 * this.field2432)) + 0.99D);
      }
   }

   void method3722() {
      if (this.field2435 != 2) {
         this.field2435 = 2;
         this.field2416 = 0;

         for(int var1 = 0; var1 < this.field2443; ++var1) {
            int var2 = this.field2425[var1];
            int var3 = this.field2410[var1];
            int var4 = this.field2458[var1];
            int var5 = var2 * var2 + var4 * var4 + var3 * var3;
            if (var5 > this.field2416) {
               this.field2416 = var5;
            }
         }

         this.field2416 = (int)(Math.sqrt((double)this.field2416) + 0.99D);
         this.field2414 = this.field2416;
         this.field2434 = this.field2416 + this.field2416;
      }
   }

   public int method3723() {
      this.method3721();
      return this.field2416;
   }

   void method3724() {
      this.field2435 = 0;
      this.field2439 = -1;
   }

   public void method3725(class203 var1, int var2) {
      if (this.field2451 != null) {
         if (var2 != -1) {
            class196 var3 = var1.field2354[var2];
            class199 var4 = var3.field2216;
            field2462 = 0;
            field2463 = 0;
            field2464 = 0;

            for(int var5 = 0; var5 < var3.field2212; ++var5) {
               int var6 = var3.field2218[var5];
               this.method3729(var4.field2274[var6], var4.field2276[var6], var3.field2217[var5], var3.field2220[var5], var3.field2219[var5]);
            }

            this.method3724();
         }
      }
   }

   public void method3756(class203 var1, int var2, class203 var3, int var4, int[] var5) {
      if (var2 != -1) {
         if (var5 != null && var4 != -1) {
            class196 var6 = var1.field2354[var2];
            class196 var7 = var3.field2354[var4];
            class199 var8 = var6.field2216;
            field2462 = 0;
            field2463 = 0;
            field2464 = 0;
            byte var9 = 0;
            int var13 = var9 + 1;
            int var10 = var5[var9];

            int var11;
            int var12;
            for(var11 = 0; var11 < var6.field2212; ++var11) {
               for(var12 = var6.field2218[var11]; var12 > var10; var10 = var5[var13++]) {
               }

               if (var12 != var10 || var8.field2274[var12] == 0) {
                  this.method3729(var8.field2274[var12], var8.field2276[var12], var6.field2217[var11], var6.field2220[var11], var6.field2219[var11]);
               }
            }

            field2462 = 0;
            field2463 = 0;
            field2464 = 0;
            var9 = 0;
            var13 = var9 + 1;
            var10 = var5[var9];

            for(var11 = 0; var11 < var7.field2212; ++var11) {
               for(var12 = var7.field2218[var11]; var12 > var10; var10 = var5[var13++]) {
               }

               if (var12 == var10 || var8.field2274[var12] == 0) {
                  this.method3729(var8.field2274[var12], var8.field2276[var12], var7.field2217[var11], var7.field2220[var11], var7.field2219[var11]);
               }
            }

            this.method3724();
         } else {
            this.method3725(var1, var2);
         }
      }
   }

   void method3729(int var1, int[] var2, int var3, int var4, int var5) {
      int var6 = var2.length;
      int var7;
      int var8;
      int var11;
      int var12;
      if (var1 == 0) {
         var7 = 0;
         field2462 = 0;
         field2463 = 0;
         field2464 = 0;

         for(var8 = 0; var8 < var6; ++var8) {
            int var18 = var2[var8];
            if (var18 < this.field2451.length) {
               int[] var19 = this.field2451[var18];

               for(var11 = 0; var11 < var19.length; ++var11) {
                  var12 = var19[var11];
                  field2462 += this.field2425[var12];
                  field2463 += this.field2410[var12];
                  field2464 += this.field2458[var12];
                  ++var7;
               }
            }
         }

         if (var7 > 0) {
            field2462 = field2462 / var7 + var3;
            field2463 = field2463 / var7 + var4;
            field2464 = field2464 / var7 + var5;
         } else {
            field2462 = var3;
            field2463 = var4;
            field2464 = var5;
         }

      } else {
         int[] var9;
         int var10;
         int[] var10000;
         if (var1 == 1) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.field2451.length) {
                  var9 = this.field2451[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     var10000 = this.field2425;
                     var10000[var11] += var3;
                     var10000 = this.field2410;
                     var10000[var11] += var4;
                     var10000 = this.field2458;
                     var10000[var11] += var5;
                  }
               }
            }

         } else if (var1 == 2) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.field2451.length) {
                  var9 = this.field2451[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     var10000 = this.field2425;
                     var10000[var11] -= field2462;
                     var10000 = this.field2410;
                     var10000[var11] -= field2463;
                     var10000 = this.field2458;
                     var10000[var11] -= field2464;
                     var12 = (var3 & 255) * 8;
                     int var13 = (var4 & 255) * 8;
                     int var14 = (var5 & 255) * 8;
                     int var15;
                     int var16;
                     int var17;
                     if (var14 != 0) {
                        var15 = field2468[var14];
                        var16 = field2446[var14];
                        var17 = this.field2410[var11] * var15 + this.field2425[var11] * var16 >> 16;
                        this.field2410[var11] = this.field2410[var11] * var16 - this.field2425[var11] * var15 >> 16;
                        this.field2425[var11] = var17;
                     }

                     if (var12 != 0) {
                        var15 = field2468[var12];
                        var16 = field2446[var12];
                        var17 = this.field2410[var11] * var16 - this.field2458[var11] * var15 >> 16;
                        this.field2458[var11] = this.field2410[var11] * var15 + this.field2458[var11] * var16 >> 16;
                        this.field2410[var11] = var17;
                     }

                     if (var13 != 0) {
                        var15 = field2468[var13];
                        var16 = field2446[var13];
                        var17 = this.field2458[var11] * var15 + this.field2425[var11] * var16 >> 16;
                        this.field2458[var11] = this.field2458[var11] * var16 - this.field2425[var11] * var15 >> 16;
                        this.field2425[var11] = var17;
                     }

                     var10000 = this.field2425;
                     var10000[var11] += field2462;
                     var10000 = this.field2410;
                     var10000[var11] += field2463;
                     var10000 = this.field2458;
                     var10000[var11] += field2464;
                  }
               }
            }

         } else if (var1 == 3) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.field2451.length) {
                  var9 = this.field2451[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     var10000 = this.field2425;
                     var10000[var11] -= field2462;
                     var10000 = this.field2410;
                     var10000[var11] -= field2463;
                     var10000 = this.field2458;
                     var10000[var11] -= field2464;
                     this.field2425[var11] = this.field2425[var11] * var3 / 128;
                     this.field2410[var11] = this.field2410[var11] * var4 / 128;
                     this.field2458[var11] = this.field2458[var11] * var5 / 128;
                     var10000 = this.field2425;
                     var10000[var11] += field2462;
                     var10000 = this.field2410;
                     var10000[var11] += field2463;
                     var10000 = this.field2458;
                     var10000[var11] += field2464;
                  }
               }
            }

         } else if (var1 == 5) {
            if (this.field2445 != null && this.field2420 != null) {
               for(var7 = 0; var7 < var6; ++var7) {
                  var8 = var2[var7];
                  if (var8 < this.field2445.length) {
                     var9 = this.field2445[var8];

                     for(var10 = 0; var10 < var9.length; ++var10) {
                        var11 = var9[var10];
                        var12 = (this.field2420[var11] & 255) + var3 * 8;
                        if (var12 < 0) {
                           var12 = 0;
                        } else if (var12 > 255) {
                           var12 = 255;
                        }

                        this.field2420[var11] = (byte)var12;
                     }
                  }
               }
            }

         }
      }
   }

   public void method3744() {
      for(int var1 = 0; var1 < this.field2443; ++var1) {
         int var2 = this.field2425[var1];
         this.field2425[var1] = this.field2458[var1];
         this.field2458[var1] = -var2;
      }

      this.method3724();
   }

   public void method3728() {
      for(int var1 = 0; var1 < this.field2443; ++var1) {
         this.field2425[var1] = -this.field2425[var1];
         this.field2458[var1] = -this.field2458[var1];
      }

      this.method3724();
   }

   public void method3764() {
      for(int var1 = 0; var1 < this.field2443; ++var1) {
         int var2 = this.field2458[var1];
         this.field2458[var1] = this.field2425[var1];
         this.field2425[var1] = -var2;
      }

      this.method3724();
   }

   public void method3715(int var1) {
      int var2 = field2468[var1];
      int var3 = field2446[var1];

      for(int var4 = 0; var4 < this.field2443; ++var4) {
         int var5 = this.field2410[var4] * var3 - this.field2458[var4] * var2 >> 16;
         this.field2458[var4] = this.field2410[var4] * var2 + this.field2458[var4] * var3 >> 16;
         this.field2410[var4] = var5;
      }

      this.method3724();
   }

   public void method3731(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field2443; ++var4) {
         int[] var10000 = this.field2425;
         var10000[var4] += var1;
         var10000 = this.field2410;
         var10000[var4] += var2;
         var10000 = this.field2458;
         var10000[var4] += var3;
      }

      this.method3724();
   }

   public void method3736(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field2443; ++var4) {
         this.field2425[var4] = this.field2425[var4] * var1 / 128;
         this.field2410[var4] = this.field2410[var4] * var2 / 128;
         this.field2458[var4] = this.field2458[var4] * var3 / 128;
      }

      this.method3724();
   }

   public final void method3769(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      field2452[0] = -1;
      if (this.field2435 != 2 && this.field2435 != 1) {
         this.method3722();
      }

      int var8 = Rasterizer3D.field2259;
      int var9 = Rasterizer3D.field2260;
      int var10 = field2468[var1];
      int var11 = field2446[var1];
      int var12 = field2468[var2];
      int var13 = field2446[var2];
      int var14 = field2468[var3];
      int var15 = field2446[var3];
      int var16 = field2468[var4];
      int var17 = field2446[var4];
      int var18 = var6 * var16 + var7 * var17 >> 16;

      for(int var19 = 0; var19 < this.field2443; ++var19) {
         int var20 = this.field2425[var19];
         int var21 = this.field2410[var19];
         int var22 = this.field2458[var19];
         int var23;
         if (var3 != 0) {
            var23 = var21 * var14 + var20 * var15 >> 16;
            var21 = var21 * var15 - var20 * var14 >> 16;
            var20 = var23;
         }

         if (var1 != 0) {
            var23 = var21 * var11 - var22 * var10 >> 16;
            var22 = var21 * var10 + var22 * var11 >> 16;
            var21 = var23;
         }

         if (var2 != 0) {
            var23 = var22 * var12 + var20 * var13 >> 16;
            var22 = var22 * var13 - var20 * var12 >> 16;
            var20 = var23;
         }

         var20 += var5;
         var21 += var6;
         var22 += var7;
         var23 = var21 * var17 - var22 * var16 >> 16;
         var22 = var21 * var16 + var22 * var17 >> 16;
         field2447[var19] = var22 - var18;
         field2459[var19] = var8 + var20 * Rasterizer3D.field2262 / var22;
         field2431[var19] = var9 + var23 * Rasterizer3D.field2262 / var22;
         if (this.field2424 > 0) {
            field2448[var19] = var20;
            field2449[var19] = var23;
            field2450[var19] = var22;
         }
      }

      try {
         this.method3735(false, false, false, 0L);
      } catch (Exception var24) {
      }

   }

   public final void method3734(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      field2452[0] = -1;
      if (this.field2435 != 2 && this.field2435 != 1) {
         this.method3722();
      }

      int var9 = Rasterizer3D.field2259;
      int var10 = Rasterizer3D.field2260;
      int var11 = field2468[var1];
      int var12 = field2446[var1];
      int var13 = field2468[var2];
      int var14 = field2446[var2];
      int var15 = field2468[var3];
      int var16 = field2446[var3];
      int var17 = field2468[var4];
      int var18 = field2446[var4];
      int var19 = var6 * var17 + var7 * var18 >> 16;

      for(int var20 = 0; var20 < this.field2443; ++var20) {
         int var21 = this.field2425[var20];
         int var22 = this.field2410[var20];
         int var23 = this.field2458[var20];
         int var24;
         if (var3 != 0) {
            var24 = var22 * var15 + var21 * var16 >> 16;
            var22 = var22 * var16 - var21 * var15 >> 16;
            var21 = var24;
         }

         if (var1 != 0) {
            var24 = var22 * var12 - var23 * var11 >> 16;
            var23 = var22 * var11 + var23 * var12 >> 16;
            var22 = var24;
         }

         if (var2 != 0) {
            var24 = var23 * var13 + var21 * var14 >> 16;
            var23 = var23 * var14 - var21 * var13 >> 16;
            var21 = var24;
         }

         var21 += var5;
         var22 += var6;
         var23 += var7;
         var24 = var22 * var18 - var23 * var17 >> 16;
         var23 = var22 * var17 + var23 * var18 >> 16;
         field2447[var20] = var23 - var19;
         field2459[var20] = var9 + var21 * Rasterizer3D.field2262 / var8;
         field2431[var20] = var10 + var24 * Rasterizer3D.field2262 / var8;
         if (this.field2424 > 0) {
            field2448[var20] = var21;
            field2449[var20] = var24;
            field2450[var20] = var23;
         }
      }

      try {
         this.method3735(false, false, false, 0L);
      } catch (Exception var25) {
      }

   }

   void method3686(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
      field2452[0] = -1;
      if (this.field2435 != 1) {
         this.method3721();
      }

      this.method3720(var1);
      int var11 = var8 * var5 - var6 * var4 >> 16;
      int var12 = var7 * var2 + var11 * var3 >> 16;
      int var13 = this.field2416 * var3 >> 16;
      int var14 = var12 + var13;
      if (var14 > 50 && var12 < 3500) {
         int var15 = var8 * var4 + var6 * var5 >> 16;
         int var16 = (var15 - this.field2416) * Rasterizer3D.field2262;
         if (var16 / var14 < Rasterizer3D.field2264) {
            int var17 = (var15 + this.field2416) * Rasterizer3D.field2262;
            if (var17 / var14 > Rasterizer3D.field2263) {
               int var18 = var7 * var3 - var11 * var2 >> 16;
               int var19 = this.field2416 * var2 >> 16;
               int var20 = (var18 + var19) * Rasterizer3D.field2262;
               if (var20 / var14 > Rasterizer3D.field2265) {
                  int var21 = var19 + (super.field2346 * var3 >> 16);
                  int var22 = (var18 - var21) * Rasterizer3D.field2262;
                  if (var22 / var14 < Rasterizer3D.field2248) {
                     int var23 = var13 + (super.field2346 * var2 >> 16);
                     boolean var24 = false;
                     boolean var25 = false;
                     if (var12 - var23 <= 50) {
                        var25 = true;
                     }

                     boolean var26 = var25 || this.field2424 > 0;
                     int var27 = class208.field2488;
                     int var29 = class90.method2021();
                     boolean var30 = class184.method3198();
                     boolean var32 = var9 != 0L;
                     boolean var33;
                     if (var32) {
                        var33 = (int)(var9 >>> 16 & 1L) == 1;
                        var32 = !var33;
                     }

                     var33 = false;
                     int var35;
                     int var36;
                     int var37;
                     if (var32 && var30) {
                        boolean var34 = false;
                        if (field2465) {
                           var34 = class128.method2255(this, var6, var7, var8);
                        } else {
                           var35 = var12 - var13;
                           if (var35 <= 50) {
                              var35 = 50;
                           }

                           if (var15 > 0) {
                              var16 /= var14;
                              var17 /= var35;
                           } else {
                              var17 /= var14;
                              var16 /= var35;
                           }

                           if (var18 > 0) {
                              var22 /= var14;
                              var20 /= var35;
                           } else {
                              var20 /= var14;
                              var22 /= var35;
                           }

                           var36 = var27 - Rasterizer3D.field2259;
                           var37 = var29 - Rasterizer3D.field2260;
                           if (var36 > var16 && var36 < var17 && var37 > var22 && var37 < var20) {
                              var34 = true;
                           }
                        }

                        if (var34) {
                           if (this.field2430) {
                              class208.field2485[++class208.field2484 - 1] = var9;
                           } else {
                              var33 = true;
                           }
                        }
                     }

                     int var44 = Rasterizer3D.field2259;
                     var35 = Rasterizer3D.field2260;
                     var36 = 0;
                     var37 = 0;
                     if (var1 != 0) {
                        var36 = field2468[var1];
                        var37 = field2446[var1];
                     }

                     for(int var38 = 0; var38 < this.field2443; ++var38) {
                        int var39 = this.field2425[var38];
                        int var40 = this.field2410[var38];
                        int var41 = this.field2458[var38];
                        int var42;
                        if (var1 != 0) {
                           var42 = var41 * var36 + var39 * var37 >> 16;
                           var41 = var41 * var37 - var39 * var36 >> 16;
                           var39 = var42;
                        }

                        var39 += var6;
                        var40 += var7;
                        var41 += var8;
                        var42 = var41 * var4 + var39 * var5 >> 16;
                        var41 = var41 * var5 - var39 * var4 >> 16;
                        var39 = var42;
                        var42 = var40 * var3 - var41 * var2 >> 16;
                        var41 = var40 * var2 + var41 * var3 >> 16;
                        field2447[var38] = var41 - var12;
                        if (var41 >= 50) {
                           field2459[var38] = var44 + var39 * Rasterizer3D.field2262 / var41;
                           field2431[var38] = var35 + var42 * Rasterizer3D.field2262 / var41;
                        } else {
                           field2459[var38] = -5000;
                           var24 = true;
                        }

                        if (var26) {
                           field2448[var38] = var39;
                           field2449[var38] = var42;
                           field2450[var38] = var41;
                        }
                     }

                     try {
                        this.method3735(var24, var33, this.field2430, var9);
                     } catch (Exception var43) {
                     }

                  }
               }
            }
         }
      }
   }

   final void method3735(boolean var1, boolean var2, boolean var3, long var4) {
      if (this.field2434 < 1600) {
         int var6;
         for(var6 = 0; var6 < this.field2434; ++var6) {
            field2452[var6] = 0;
         }

         var6 = var3 ? 20 : 5;

         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var15;
         int var16;
         int var18;
         for(var7 = 0; var7 < this.field2412; ++var7) {
            if (this.field2418[var7] != -2) {
               var8 = this.field2429[var7];
               var9 = this.field2466[var7];
               var10 = this.field2415[var7];
               var11 = field2459[var8];
               var12 = field2459[var9];
               var13 = field2459[var10];
               int var14;
               if (!var1 || var11 != -5000 && var12 != -5000 && var13 != -5000) {
                  if (var2 && class278.method4503(field2431[var8], field2431[var9], field2431[var10], var11, var12, var13, var6)) {
                     class208.field2485[++class208.field2484 - 1] = var4;
                     var2 = false;
                  }

                  if ((var11 - var12) * (field2431[var10] - field2431[var9]) - (field2431[var8] - field2431[var9]) * (var13 - var12) > 0) {
                     field2444[var7] = false;
                     if (var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= Rasterizer3D.field2261 && var12 <= Rasterizer3D.field2261 && var13 <= Rasterizer3D.field2261) {
                        field2433[var7] = false;
                     } else {
                        field2433[var7] = true;
                     }

                     var14 = (field2447[var8] + field2447[var9] + field2447[var10]) / 3 + this.field2414;
                     field2469[var14][field2452[var14]++] = var7;
                  }
               } else {
                  var14 = field2448[var8];
                  var15 = field2448[var9];
                  var16 = field2448[var10];
                  int var17 = field2449[var8];
                  var18 = field2449[var9];
                  int var19 = field2449[var10];
                  int var20 = field2450[var8];
                  int var21 = field2450[var9];
                  int var22 = field2450[var10];
                  var14 -= var15;
                  var16 -= var15;
                  var17 -= var18;
                  var19 -= var18;
                  var20 -= var21;
                  var22 -= var21;
                  int var23 = var17 * var22 - var20 * var19;
                  int var24 = var20 * var16 - var14 * var22;
                  int var25 = var14 * var19 - var17 * var16;
                  if (var15 * var23 + var18 * var24 + var21 * var25 > 0) {
                     field2444[var7] = true;
                     int var26 = (field2447[var8] + field2447[var9] + field2447[var10]) / 3 + this.field2414;
                     field2469[var26][field2452[var26]++] = var7;
                  }
               }
            }
         }

         int[] var27;
         if (this.field2419 == null) {
            for(var7 = this.field2434 - 1; var7 >= 0; --var7) {
               var8 = field2452[var7];
               if (var8 > 0) {
                  var27 = field2469[var7];

                  for(var10 = 0; var10 < var8; ++var10) {
                     this.method3774(var27[var10]);
                  }
               }
            }

         } else {
            for(var7 = 0; var7 < 12; ++var7) {
               field2436[var7] = 0;
               field2423[var7] = 0;
            }

            for(var7 = this.field2434 - 1; var7 >= 0; --var7) {
               var8 = field2452[var7];
               if (var8 > 0) {
                  var27 = field2469[var7];

                  for(var10 = 0; var10 < var8; ++var10) {
                     var11 = var27[var10];
                     byte var28 = this.field2419[var11];
                     var13 = field2436[var28]++;
                     field2455[var28][var13] = var11;
                     if (var28 < 10) {
                        int[] var10000 = field2423;
                        var10000[var28] += var7;
                     } else if (var28 == 10) {
                        field2456[var13] = var7;
                     } else {
                        field2457[var13] = var7;
                     }
                  }
               }
            }

            var7 = 0;
            if (field2436[1] > 0 || field2436[2] > 0) {
               var7 = (field2423[1] + field2423[2]) / (field2436[1] + field2436[2]);
            }

            var8 = 0;
            if (field2436[3] > 0 || field2436[4] > 0) {
               var8 = (field2423[3] + field2423[4]) / (field2436[3] + field2436[4]);
            }

            var9 = 0;
            if (field2436[6] > 0 || field2436[8] > 0) {
               var9 = (field2423[6] + field2423[8]) / (field2436[6] + field2436[8]);
            }

            var11 = 0;
            var12 = field2436[10];
            int[] var29 = field2455[10];
            int[] var30 = field2456;
            if (var11 == var12) {
               var11 = 0;
               var12 = field2436[11];
               var29 = field2455[11];
               var30 = field2457;
            }

            if (var11 < var12) {
               var10 = var30[var11];
            } else {
               var10 = -1000;
            }

            for(var15 = 0; var15 < 10; ++var15) {
               while(var15 == 0 && var10 > var7) {
                  this.method3774(var29[var11++]);
                  if (var11 == var12 && var29 != field2455[11]) {
                     var11 = 0;
                     var12 = field2436[11];
                     var29 = field2455[11];
                     var30 = field2457;
                  }

                  if (var11 < var12) {
                     var10 = var30[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 3 && var10 > var8) {
                  this.method3774(var29[var11++]);
                  if (var11 == var12 && var29 != field2455[11]) {
                     var11 = 0;
                     var12 = field2436[11];
                     var29 = field2455[11];
                     var30 = field2457;
                  }

                  if (var11 < var12) {
                     var10 = var30[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 5 && var10 > var9) {
                  this.method3774(var29[var11++]);
                  if (var11 == var12 && var29 != field2455[11]) {
                     var11 = 0;
                     var12 = field2436[11];
                     var29 = field2455[11];
                     var30 = field2457;
                  }

                  if (var11 < var12) {
                     var10 = var30[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               var16 = field2436[var15];
               int[] var31 = field2455[var15];

               for(var18 = 0; var18 < var16; ++var18) {
                  this.method3774(var31[var18]);
               }
            }

            while(var10 != -1000) {
               this.method3774(var29[var11++]);
               if (var11 == var12 && var29 != field2455[11]) {
                  var11 = 0;
                  var29 = field2455[11];
                  var12 = field2436[11];
                  var30 = field2457;
               }

               if (var11 < var12) {
                  var10 = var30[var11];
               } else {
                  var10 = -1000;
               }
            }

         }
      }
   }

   final void method3774(int var1) {
      if (field2444[var1]) {
         this.method3727(var1);
      } else {
         int var2 = this.field2429[var1];
         int var3 = this.field2466[var1];
         int var4 = this.field2415[var1];
         Rasterizer3D.field2252 = field2433[var1];
         if (this.field2420 == null) {
            Rasterizer3D.field2258 = 0;
         } else {
            Rasterizer3D.field2258 = this.field2420[var1] & 255;
         }

         if (this.field2422 != null && this.field2422[var1] != -1) {
            int var5;
            int var6;
            int var7;
            if (this.field2441 != null && this.field2441[var1] != -1) {
               int var8 = this.field2441[var1] & 255;
               var5 = this.field2454[var8];
               var6 = this.field2426[var8];
               var7 = this.field2427[var8];
            } else {
               var5 = var2;
               var6 = var3;
               var7 = var4;
            }

            if (this.field2418[var1] == -1) {
               Rasterizer3D.method3462(field2431[var2], field2431[var3], field2431[var4], field2459[var2], field2459[var3], field2459[var4], this.field2409[var1], this.field2409[var1], this.field2409[var1], field2448[var5], field2448[var6], field2448[var7], field2449[var5], field2449[var6], field2449[var7], field2450[var5], field2450[var6], field2450[var7], this.field2422[var1]);
            } else {
               Rasterizer3D.method3462(field2431[var2], field2431[var3], field2431[var4], field2459[var2], field2459[var3], field2459[var4], this.field2409[var1], this.field2417[var1], this.field2418[var1], field2448[var5], field2448[var6], field2448[var7], field2449[var5], field2449[var6], field2449[var7], field2450[var5], field2450[var6], field2450[var7], this.field2422[var1]);
            }
         } else if (this.field2418[var1] == -1) {
            Rasterizer3D.method3426(field2431[var2], field2431[var3], field2431[var4], field2459[var2], field2459[var3], field2459[var4], field2470[this.field2409[var1]]);
         } else {
            Rasterizer3D.method3428(field2431[var2], field2431[var3], field2431[var4], field2459[var2], field2459[var3], field2459[var4], this.field2409[var1], this.field2417[var1], this.field2418[var1]);
         }

      }
   }

   final void method3727(int var1) {
      int var2 = Rasterizer3D.field2259;
      int var3 = Rasterizer3D.field2260;
      int var4 = 0;
      int var5 = this.field2429[var1];
      int var6 = this.field2466[var1];
      int var7 = this.field2415[var1];
      int var8 = field2450[var5];
      int var9 = field2450[var6];
      int var10 = field2450[var7];
      if (this.field2420 == null) {
         Rasterizer3D.field2258 = 0;
      } else {
         Rasterizer3D.field2258 = this.field2420[var1] & 255;
      }

      int var11;
      int var12;
      int var13;
      int var14;
      if (var8 >= 50) {
         field2408[var4] = field2459[var5];
         field2460[var4] = field2431[var5];
         field2461[var4++] = this.field2409[var1];
      } else {
         var11 = field2448[var5];
         var12 = field2449[var5];
         var13 = this.field2409[var1];
         if (var10 >= 50) {
            var14 = (50 - var8) * field2471[var10 - var8];
            field2408[var4] = var2 + (var11 + ((field2448[var7] - var11) * var14 >> 16)) * Rasterizer3D.field2262 / 50;
            field2460[var4] = var3 + (var12 + ((field2449[var7] - var12) * var14 >> 16)) * Rasterizer3D.field2262 / 50;
            field2461[var4++] = var13 + ((this.field2418[var1] - var13) * var14 >> 16);
         }

         if (var9 >= 50) {
            var14 = (50 - var8) * field2471[var9 - var8];
            field2408[var4] = var2 + (var11 + ((field2448[var6] - var11) * var14 >> 16)) * Rasterizer3D.field2262 / 50;
            field2460[var4] = var3 + (var12 + ((field2449[var6] - var12) * var14 >> 16)) * Rasterizer3D.field2262 / 50;
            field2461[var4++] = var13 + ((this.field2417[var1] - var13) * var14 >> 16);
         }
      }

      if (var9 >= 50) {
         field2408[var4] = field2459[var6];
         field2460[var4] = field2431[var6];
         field2461[var4++] = this.field2417[var1];
      } else {
         var11 = field2448[var6];
         var12 = field2449[var6];
         var13 = this.field2417[var1];
         if (var8 >= 50) {
            var14 = (50 - var9) * field2471[var8 - var9];
            field2408[var4] = var2 + (var11 + ((field2448[var5] - var11) * var14 >> 16)) * Rasterizer3D.field2262 / 50;
            field2460[var4] = var3 + (var12 + ((field2449[var5] - var12) * var14 >> 16)) * Rasterizer3D.field2262 / 50;
            field2461[var4++] = var13 + ((this.field2409[var1] - var13) * var14 >> 16);
         }

         if (var10 >= 50) {
            var14 = (50 - var9) * field2471[var10 - var9];
            field2408[var4] = var2 + (var11 + ((field2448[var7] - var11) * var14 >> 16)) * Rasterizer3D.field2262 / 50;
            field2460[var4] = var3 + (var12 + ((field2449[var7] - var12) * var14 >> 16)) * Rasterizer3D.field2262 / 50;
            field2461[var4++] = var13 + ((this.field2418[var1] - var13) * var14 >> 16);
         }
      }

      if (var10 >= 50) {
         field2408[var4] = field2459[var7];
         field2460[var4] = field2431[var7];
         field2461[var4++] = this.field2418[var1];
      } else {
         var11 = field2448[var7];
         var12 = field2449[var7];
         var13 = this.field2418[var1];
         if (var9 >= 50) {
            var14 = (50 - var10) * field2471[var9 - var10];
            field2408[var4] = var2 + (var11 + ((field2448[var6] - var11) * var14 >> 16)) * Rasterizer3D.field2262 / 50;
            field2460[var4] = var3 + (var12 + ((field2449[var6] - var12) * var14 >> 16)) * Rasterizer3D.field2262 / 50;
            field2461[var4++] = var13 + ((this.field2417[var1] - var13) * var14 >> 16);
         }

         if (var8 >= 50) {
            var14 = (50 - var10) * field2471[var8 - var10];
            field2408[var4] = var2 + (var11 + ((field2448[var5] - var11) * var14 >> 16)) * Rasterizer3D.field2262 / 50;
            field2460[var4] = var3 + (var12 + ((field2449[var5] - var12) * var14 >> 16)) * Rasterizer3D.field2262 / 50;
            field2461[var4++] = var13 + ((this.field2409[var1] - var13) * var14 >> 16);
         }
      }

      var11 = field2408[0];
      var12 = field2408[1];
      var13 = field2408[2];
      var14 = field2460[0];
      int var15 = field2460[1];
      int var16 = field2460[2];
      Rasterizer3D.field2252 = false;
      int var17;
      int var18;
      int var19;
      int var20;
      if (var4 == 3) {
         if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > Rasterizer3D.field2261 || var12 > Rasterizer3D.field2261 || var13 > Rasterizer3D.field2261) {
            Rasterizer3D.field2252 = true;
         }

         if (this.field2422 != null && this.field2422[var1] != -1) {
            if (this.field2441 != null && this.field2441[var1] != -1) {
               var20 = this.field2441[var1] & 255;
               var17 = this.field2454[var20];
               var18 = this.field2426[var20];
               var19 = this.field2427[var20];
            } else {
               var17 = var5;
               var18 = var6;
               var19 = var7;
            }

            if (this.field2418[var1] == -1) {
               Rasterizer3D.method3462(var14, var15, var16, var11, var12, var13, this.field2409[var1], this.field2409[var1], this.field2409[var1], field2448[var17], field2448[var18], field2448[var19], field2449[var17], field2449[var18], field2449[var19], field2450[var17], field2450[var18], field2450[var19], this.field2422[var1]);
            } else {
               Rasterizer3D.method3462(var14, var15, var16, var11, var12, var13, field2461[0], field2461[1], field2461[2], field2448[var17], field2448[var18], field2448[var19], field2449[var17], field2449[var18], field2449[var19], field2450[var17], field2450[var18], field2450[var19], this.field2422[var1]);
            }
         } else if (this.field2418[var1] == -1) {
            Rasterizer3D.method3426(var14, var15, var16, var11, var12, var13, field2470[this.field2409[var1]]);
         } else {
            Rasterizer3D.method3428(var14, var15, var16, var11, var12, var13, field2461[0], field2461[1], field2461[2]);
         }
      }

      if (var4 == 4) {
         if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > Rasterizer3D.field2261 || var12 > Rasterizer3D.field2261 || var13 > Rasterizer3D.field2261 || field2408[3] < 0 || field2408[3] > Rasterizer3D.field2261) {
            Rasterizer3D.field2252 = true;
         }

         if (this.field2422 != null && this.field2422[var1] != -1) {
            if (this.field2441 != null && this.field2441[var1] != -1) {
               var20 = this.field2441[var1] & 255;
               var17 = this.field2454[var20];
               var18 = this.field2426[var20];
               var19 = this.field2427[var20];
            } else {
               var17 = var5;
               var18 = var6;
               var19 = var7;
            }

            short var21 = this.field2422[var1];
            if (this.field2418[var1] == -1) {
               Rasterizer3D.method3462(var14, var15, var16, var11, var12, var13, this.field2409[var1], this.field2409[var1], this.field2409[var1], field2448[var17], field2448[var18], field2448[var19], field2449[var17], field2449[var18], field2449[var19], field2450[var17], field2450[var18], field2450[var19], var21);
               Rasterizer3D.method3462(var14, var16, field2460[3], var11, var13, field2408[3], this.field2409[var1], this.field2409[var1], this.field2409[var1], field2448[var17], field2448[var18], field2448[var19], field2449[var17], field2449[var18], field2449[var19], field2450[var17], field2450[var18], field2450[var19], var21);
            } else {
               Rasterizer3D.method3462(var14, var15, var16, var11, var12, var13, field2461[0], field2461[1], field2461[2], field2448[var17], field2448[var18], field2448[var19], field2449[var17], field2449[var18], field2449[var19], field2450[var17], field2450[var18], field2450[var19], var21);
               Rasterizer3D.method3462(var14, var16, field2460[3], var11, var13, field2408[3], field2461[0], field2461[2], field2461[3], field2448[var17], field2448[var18], field2448[var19], field2449[var17], field2449[var18], field2449[var19], field2450[var17], field2450[var18], field2450[var19], var21);
            }
         } else if (this.field2418[var1] == -1) {
            var17 = field2470[this.field2409[var1]];
            Rasterizer3D.method3426(var14, var15, var16, var11, var12, var13, var17);
            Rasterizer3D.method3426(var14, var16, field2460[3], var11, var13, field2408[3], var17);
         } else {
            Rasterizer3D.method3428(var14, var15, var16, var11, var12, var13, field2461[0], field2461[1], field2461[2]);
            Rasterizer3D.method3428(var14, var16, field2460[3], var11, var13, field2408[3], field2461[0], field2461[2], field2461[3]);
         }
      }

   }
}
