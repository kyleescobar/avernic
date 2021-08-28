public class Scene {
   public static boolean field2307 = true;
   public static int selectedX = -1;
   public static int selectedY = -1;
   static boolean field2284 = false;
   static boolean field2310 = false;
   static boolean[][] field2283;
   static boolean[][][][] field2338;
   static class204[] field2323;
   static class204[][] field2321;
   static class215[] field2280 = new class215[100];
   static class296 field2330;
   static int field2288;
   static int field2289;
   static int field2291;
   static int field2293 = 0;
   static int field2297;
   static int field2299;
   static int field2301;
   static int field2302;
   static int field2304;
   static int field2306;
   static int field2308;
   static int field2311 = 0;
   static int field2312 = 0;
   static int field2313 = 0;
   static int field2316 = 0;
   static int field2319 = 4;
   static int field2322;
   static int field2324;
   static int field2327;
   static int field2331;
   static int field2332;
   static int field2340;
   static int field2341;
   static int field2342;
   static int field2343;
   static int field2344;
   static int field2345;
   static int[] field2320;
   static final int[] field2279;
   static final int[] field2295;
   static final int[] field2325;
   static final int[] field2326;
   static final int[] field2328;
   static final int[] field2329;
   static final int[] field2339;
   class197[][][] field2300;
   class215[] field2287 = new class215[5000];
   int field2281;
   int field2282;
   int field2286 = 0;
   int field2303;
   int field2309 = 0;
   int[][] field2336 = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
   int[][] field2337 = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
   int[][][] field2296;
   int[][][] field2298;

   static {
      field2320 = new int[field2319];
      field2321 = new class204[field2319][500];
      field2322 = 0;
      field2323 = new class204[500];
      field2330 = new class296();
      field2325 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
      field2326 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
      field2329 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
      field2339 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
      field2295 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
      field2328 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
      field2279 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
      field2338 = new boolean[8][32][51][51];
   }

   public Scene(int var1, int var2, int var3, int[][][] var4) {
      this.field2303 = var1;
      this.field2281 = var2;
      this.field2282 = var3;
      this.field2300 = new class197[var1][var2][var3];
      this.field2296 = new int[var1][var2 + 1][var3 + 1];
      this.field2298 = var4;
      this.method3658();
   }

   public void method3658() {
      int var1;
      int var2;
      for(var1 = 0; var1 < this.field2303; ++var1) {
         for(var2 = 0; var2 < this.field2281; ++var2) {
            for(int var3 = 0; var3 < this.field2282; ++var3) {
               this.field2300[var1][var2][var3] = null;
            }
         }
      }

      for(var1 = 0; var1 < field2319; ++var1) {
         for(var2 = 0; var2 < field2320[var1]; ++var2) {
            field2321[var1][var2] = null;
         }

         field2320[var1] = 0;
      }

      for(var1 = 0; var1 < this.field2286; ++var1) {
         this.field2287[var1] = null;
      }

      this.field2286 = 0;

      for(var1 = 0; var1 < field2280.length; ++var1) {
         field2280[var1] = null;
      }

   }

   public void method3556(int var1) {
      this.field2309 = var1;

      for(int var2 = 0; var2 < this.field2281; ++var2) {
         for(int var3 = 0; var3 < this.field2282; ++var3) {
            if (this.field2300[var1][var2][var3] == null) {
               this.field2300[var1][var2][var3] = new class197(var1, var2, var3);
            }
         }
      }

   }

   public void method3612(int var1, int var2) {
      class197 var3 = this.field2300[0][var1][var2];

      for(int var4 = 0; var4 < 3; ++var4) {
         class197 var5 = this.field2300[var4][var1][var2] = this.field2300[var4 + 1][var1][var2];
         if (var5 != null) {
            --var5.field2237;

            for(int var6 = 0; var6 < var5.field2233; ++var6) {
               class215 var7 = var5.field2234[var6];
               if (class203.method3697(var7.field2538) && var7.field2544 == var1 && var7.field2540 == var2) {
                  --var7.field2541;
               }
            }
         }
      }

      if (this.field2300[0][var1][var2] == null) {
         this.field2300[0][var1][var2] = new class197(0, var1, var2);
      }

      this.field2300[0][var1][var2].field2241 = var3;
      this.field2300[3][var1][var2] = null;
   }

   public static void method3501(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      class204 var8 = new class204();
      var8.field2361 = var2 / 128;
      var8.field2356 = var3 / 128;
      var8.field2357 = var4 / 128;
      var8.field2358 = var5 / 128;
      var8.field2359 = var1;
      var8.field2365 = var2;
      var8.field2370 = var3;
      var8.field2355 = var4;
      var8.field2362 = var5;
      var8.field2364 = var6;
      var8.field2363 = var7;
      field2321[var0][field2320[var0]++] = var8;
   }

   public void method3502(int var1, int var2, int var3, int var4) {
      class197 var5 = this.field2300[var1][var2][var3];
      if (var5 != null) {
         this.field2300[var1][var2][var3].field2243 = var4;
      }
   }

   public void method3677(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
      class210 var21;
      int var22;
      if (var4 == 0) {
         var21 = new class210(var11, var12, var13, var14, -1, var19, false);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.field2300[var22][var2][var3] == null) {
               this.field2300[var22][var2][var3] = new class197(var22, var2, var3);
            }
         }

         this.field2300[var1][var2][var3].field2232 = var21;
      } else if (var4 != 1) {
         class206 var23 = new class206(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.field2300[var22][var2][var3] == null) {
               this.field2300[var22][var2][var3] = new class197(var22, var2, var3);
            }
         }

         this.field2300[var1][var2][var3].field2245 = var23;
      } else {
         var21 = new class210(var15, var16, var17, var18, var6, var20, var7 == var8 && var7 == var9 && var7 == var10);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.field2300[var22][var2][var3] == null) {
               this.field2300[var22][var2][var3] = new class197(var22, var2, var3);
            }
         }

         this.field2300[var1][var2][var3].field2232 = var21;
      }
   }

   public void method3625(int var1, int var2, int var3, int var4, class201 var5, long var6, int var8) {
      if (var5 != null) {
         class194 var9 = new class194();
         var9.field2195 = var5;
         var9.field2191 = var2 * 128 + 64;
         var9.field2192 = var3 * 128 + 64;
         var9.field2190 = var4;
         var9.field2194 = var6;
         var9.field2193 = var8;
         if (this.field2300[var1][var2][var3] == null) {
            this.field2300[var1][var2][var3] = new class197(var1, var2, var3);
         }

         this.field2300[var1][var2][var3].field2235 = var9;
      }
   }

   public void method3504(int var1, int var2, int var3, int var4, class201 var5, long var6, class201 var8, class201 var9) {
      class192 var10 = new class192();
      var10.field2140 = var5;
      var10.field2138 = var2 * 128 + 64;
      var10.field2145 = var3 * 128 + 64;
      var10.field2144 = var4;
      var10.field2143 = var6;
      var10.field2142 = var8;
      var10.field2137 = var9;
      int var11 = 0;
      class197 var12 = this.field2300[var1][var2][var3];
      if (var12 != null) {
         for(int var13 = 0; var13 < var12.field2233; ++var13) {
            if ((var12.field2234[var13].field2545 & 256) == 256 && var12.field2234[var13].field2536 instanceof class207) {
               class207 var14 = (class207)var12.field2234[var13].field2536;
               var14.method3721();
               if (var14.field2346 > var11) {
                  var11 = var14.field2346;
               }
            }
         }
      }

      var10.field2141 = var11;
      if (this.field2300[var1][var2][var3] == null) {
         this.field2300[var1][var2][var3] = new class197(var1, var2, var3);
      }

      this.field2300[var1][var2][var3].field2227 = var10;
   }

   public void method3505(int var1, int var2, int var3, int var4, class201 var5, class201 var6, int var7, int var8, long var9, int var11) {
      if (var5 != null || var6 != null) {
         class212 var12 = new class212();
         var12.field2516 = var9;
         var12.field2509 = var11;
         var12.field2510 = var2 * 128 + 64;
         var12.field2511 = var3 * 128 + 64;
         var12.field2517 = var4;
         var12.field2514 = var5;
         var12.field2515 = var6;
         var12.field2519 = var7;
         var12.field2513 = var8;

         for(int var13 = var1; var13 >= 0; --var13) {
            if (this.field2300[var13][var2][var3] == null) {
               this.field2300[var13][var2][var3] = new class197(var13, var2, var3);
            }
         }

         this.field2300[var1][var2][var3].field2229 = var12;
      }
   }

   public void method3506(int var1, int var2, int var3, int var4, class201 var5, class201 var6, int var7, int var8, int var9, int var10, long var11, int var13) {
      if (var5 != null) {
         class214 var14 = new class214();
         var14.field2523 = var11;
         var14.field2531 = var13;
         var14.field2521 = var2 * 128 + 64;
         var14.field2522 = var3 * 128 + 64;
         var14.field2525 = var4;
         var14.field2528 = var5;
         var14.field2529 = var6;
         var14.field2530 = var7;
         var14.field2527 = var8;
         var14.field2526 = var9;
         var14.field2524 = var10;

         for(int var15 = var1; var15 >= 0; --var15) {
            if (this.field2300[var15][var2][var3] == null) {
               this.field2300[var15][var2][var3] = new class197(var15, var2, var3);
            }
         }

         this.field2300[var1][var2][var3].field2230 = var14;
      }
   }

   public boolean method3507(int var1, int var2, int var3, int var4, int var5, int var6, class201 var7, int var8, long var9, int var11) {
      if (var7 == null) {
         return true;
      } else {
         int var12 = var2 * 128 + 64 * var5;
         int var13 = var3 * 128 + 64 * var6;
         return this.method3673(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11);
      }
   }

   public boolean method3508(int var1, int var2, int var3, int var4, int var5, class201 var6, int var7, long var8, boolean var10) {
      if (var6 == null) {
         return true;
      } else {
         int var11 = var2 - var5;
         int var12 = var3 - var5;
         int var13 = var2 + var5;
         int var14 = var3 + var5;
         if (var10) {
            if (var7 > 640 && var7 < 1408) {
               var14 += 128;
            }

            if (var7 > 1152 && var7 < 1920) {
               var13 += 128;
            }

            if (var7 > 1664 || var7 < 384) {
               var12 -= 128;
            }

            if (var7 > 128 && var7 < 896) {
               var11 -= 128;
            }
         }

         var11 /= 128;
         var12 /= 128;
         var13 /= 128;
         var14 /= 128;
         return this.method3673(var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0);
      }
   }

   public boolean method3503(int var1, int var2, int var3, int var4, int var5, class201 var6, int var7, long var8, int var10, int var11, int var12, int var13) {
      return var6 == null ? true : this.method3673(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
   }

   boolean method3673(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class201 var9, int var10, boolean var11, long var12, int var14) {
      int var16;
      for(int var15 = var2; var15 < var2 + var4; ++var15) {
         for(var16 = var3; var16 < var3 + var5; ++var16) {
            if (var15 < 0 || var16 < 0 || var15 >= this.field2281 || var16 >= this.field2282) {
               return false;
            }

            class197 var17 = this.field2300[var1][var15][var16];
            if (var17 != null && var17.field2233 >= 5) {
               return false;
            }
         }
      }

      class215 var21 = new class215();
      var21.field2538 = var12;
      var21.field2545 = var14;
      var21.field2541 = var1;
      var21.field2537 = var6;
      var21.field2535 = var7;
      var21.field2533 = var8;
      var21.field2536 = var9;
      var21.field2532 = var10;
      var21.field2544 = var2;
      var21.field2540 = var3;
      var21.field2539 = var2 + var4 - 1;
      var21.field2534 = var3 + var5 - 1;

      for(var16 = var2; var16 < var2 + var4; ++var16) {
         for(int var22 = var3; var22 < var3 + var5; ++var22) {
            int var18 = 0;
            if (var16 > var2) {
               ++var18;
            }

            if (var16 < var2 + var4 - 1) {
               var18 += 4;
            }

            if (var22 > var3) {
               var18 += 8;
            }

            if (var22 < var3 + var5 - 1) {
               var18 += 2;
            }

            for(int var19 = var1; var19 >= 0; --var19) {
               if (this.field2300[var19][var16][var22] == null) {
                  this.field2300[var19][var16][var22] = new class197(var19, var16, var22);
               }
            }

            class197 var23 = this.field2300[var1][var16][var22];
            var23.field2234[var23.field2233] = var21;
            var23.field2242[var23.field2233] = var18;
            var23.field2236 |= var18;
            ++var23.field2233;
         }
      }

      if (var11) {
         this.field2287[this.field2286++] = var21;
      }

      return true;
   }

   public void method3587() {
      for(int var1 = 0; var1 < this.field2286; ++var1) {
         class215 var2 = this.field2287[var1];
         this.method3512(var2);
         this.field2287[var1] = null;
      }

      this.field2286 = 0;
   }

   void method3512(class215 var1) {
      for(int var2 = var1.field2544; var2 <= var1.field2539; ++var2) {
         for(int var3 = var1.field2540; var3 <= var1.field2534; ++var3) {
            class197 var4 = this.field2300[var1.field2541][var2][var3];
            if (var4 != null) {
               int var5;
               for(var5 = 0; var5 < var4.field2233; ++var5) {
                  if (var4.field2234[var5] == var1) {
                     --var4.field2233;

                     for(int var6 = var5; var6 < var4.field2233; ++var6) {
                        var4.field2234[var6] = var4.field2234[var6 + 1];
                        var4.field2242[var6] = var4.field2242[var6 + 1];
                     }

                     var4.field2234[var4.field2233] = null;
                     break;
                  }
               }

               var4.field2236 = 0;

               for(var5 = 0; var5 < var4.field2233; ++var5) {
                  var4.field2236 |= var4.field2242[var5];
               }
            }
         }
      }

   }

   public void method3513(int var1, int var2, int var3, int var4) {
      class197 var5 = this.field2300[var1][var2][var3];
      if (var5 != null) {
         class214 var6 = var5.field2230;
         if (var6 != null) {
            var6.field2526 = var6.field2526 * var4 / 16;
            var6.field2524 = var6.field2524 * var4 / 16;
         }
      }
   }

   public void method3514(int var1, int var2, int var3) {
      class197 var4 = this.field2300[var1][var2][var3];
      if (var4 != null) {
         var4.field2229 = null;
      }
   }

   public void method3515(int var1, int var2, int var3) {
      class197 var4 = this.field2300[var1][var2][var3];
      if (var4 != null) {
         var4.field2230 = null;
      }
   }

   public void method3551(int var1, int var2, int var3) {
      class197 var4 = this.field2300[var1][var2][var3];
      if (var4 != null) {
         for(int var5 = 0; var5 < var4.field2233; ++var5) {
            class215 var6 = var4.field2234[var5];
            if (class203.method3697(var6.field2538) && var6.field2544 == var2 && var6.field2540 == var3) {
               this.method3512(var6);
               return;
            }
         }

      }
   }

   public void method3517(int var1, int var2, int var3) {
      class197 var4 = this.field2300[var1][var2][var3];
      if (var4 != null) {
         var4.field2235 = null;
      }
   }

   public void method3518(int var1, int var2, int var3) {
      class197 var4 = this.field2300[var1][var2][var3];
      if (var4 != null) {
         var4.field2227 = null;
      }
   }

   public class212 method3583(int var1, int var2, int var3) {
      class197 var4 = this.field2300[var1][var2][var3];
      return var4 == null ? null : var4.field2229;
   }

   public class214 method3520(int var1, int var2, int var3) {
      class197 var4 = this.field2300[var1][var2][var3];
      return var4 == null ? null : var4.field2230;
   }

   public class215 method3566(int var1, int var2, int var3) {
      class197 var4 = this.field2300[var1][var2][var3];
      if (var4 == null) {
         return null;
      } else {
         for(int var5 = 0; var5 < var4.field2233; ++var5) {
            class215 var6 = var4.field2234[var5];
            if (class203.method3697(var6.field2538) && var6.field2544 == var2 && var6.field2540 == var3) {
               return var6;
            }
         }

         return null;
      }
   }

   public class194 method3522(int var1, int var2, int var3) {
      class197 var4 = this.field2300[var1][var2][var3];
      return var4 != null && var4.field2235 != null ? var4.field2235 : null;
   }

   public long method3523(int var1, int var2, int var3) {
      class197 var4 = this.field2300[var1][var2][var3];
      return var4 != null && var4.field2229 != null ? var4.field2229.field2516 : 0L;
   }

   public long method3524(int var1, int var2, int var3) {
      class197 var4 = this.field2300[var1][var2][var3];
      return var4 != null && var4.field2230 != null ? var4.field2230.field2523 : 0L;
   }

   public long method3525(int var1, int var2, int var3) {
      class197 var4 = this.field2300[var1][var2][var3];
      if (var4 == null) {
         return 0L;
      } else {
         for(int var5 = 0; var5 < var4.field2233; ++var5) {
            class215 var6 = var4.field2234[var5];
            if (class203.method3697(var6.field2538) && var6.field2544 == var2 && var6.field2540 == var3) {
               return var6.field2538;
            }
         }

         return 0L;
      }
   }

   public long method3628(int var1, int var2, int var3) {
      class197 var4 = this.field2300[var1][var2][var3];
      return var4 != null && var4.field2235 != null ? var4.field2235.field2194 : 0L;
   }

   public int method3527(int var1, int var2, int var3, long var4) {
      class197 var6 = this.field2300[var1][var2][var3];
      if (var6 == null) {
         return -1;
      } else if (var6.field2229 != null && var6.field2229.field2516 == var4) {
         return var6.field2229.field2509 & 255;
      } else if (var6.field2230 != null && var6.field2230.field2523 == var4) {
         return var6.field2230.field2531 & 255;
      } else if (var6.field2235 != null && var6.field2235.field2194 == var4) {
         return var6.field2235.field2193 & 255;
      } else {
         for(int var7 = 0; var7 < var6.field2233; ++var7) {
            if (var6.field2234[var7].field2538 == var4) {
               return var6.field2234[var7].field2545 & 255;
            }
         }

         return -1;
      }
   }

   public void method3528(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field2303; ++var4) {
         for(int var5 = 0; var5 < this.field2281; ++var5) {
            for(int var6 = 0; var6 < this.field2282; ++var6) {
               class197 var7 = this.field2300[var4][var5][var6];
               if (var7 != null) {
                  class212 var8 = var7.field2229;
                  class193 var10;
                  if (var8 != null && var8.field2514 instanceof class193) {
                     class193 var9 = (class193)var8.field2514;
                     this.method3530(var9, var4, var5, var6, 1, 1);
                     if (var8.field2515 instanceof class193) {
                        var10 = (class193)var8.field2515;
                        this.method3530(var10, var4, var5, var6, 1, 1);
                        class193.method3335(var9, var10, 0, 0, 0, false);
                        var8.field2515 = var10.method3336(var10.field2175, var10.field2178, var1, var2, var3);
                     }

                     var8.field2514 = var9.method3336(var9.field2175, var9.field2178, var1, var2, var3);
                  }

                  for(int var12 = 0; var12 < var7.field2233; ++var12) {
                     class215 var14 = var7.field2234[var12];
                     if (var14 != null && var14.field2536 instanceof class193) {
                        class193 var11 = (class193)var14.field2536;
                        this.method3530(var11, var4, var5, var6, var14.field2539 - var14.field2544 + 1, var14.field2534 - var14.field2540 + 1);
                        var14.field2536 = var11.method3336(var11.field2175, var11.field2178, var1, var2, var3);
                     }
                  }

                  class194 var13 = var7.field2235;
                  if (var13 != null && var13.field2195 instanceof class193) {
                     var10 = (class193)var13.field2195;
                     this.method3529(var10, var4, var5, var6);
                     var13.field2195 = var10.method3336(var10.field2175, var10.field2178, var1, var2, var3);
                  }
               }
            }
         }
      }

   }

   void method3529(class193 var1, int var2, int var3, int var4) {
      class197 var5;
      class193 var6;
      if (var3 < this.field2281) {
         var5 = this.field2300[var2][var3 + 1][var4];
         if (var5 != null && var5.field2235 != null && var5.field2235.field2195 instanceof class193) {
            var6 = (class193)var5.field2235.field2195;
            class193.method3335(var1, var6, 128, 0, 0, true);
         }
      }

      if (var4 < this.field2281) {
         var5 = this.field2300[var2][var3][var4 + 1];
         if (var5 != null && var5.field2235 != null && var5.field2235.field2195 instanceof class193) {
            var6 = (class193)var5.field2235.field2195;
            class193.method3335(var1, var6, 0, 0, 128, true);
         }
      }

      if (var3 < this.field2281 && var4 < this.field2282) {
         var5 = this.field2300[var2][var3 + 1][var4 + 1];
         if (var5 != null && var5.field2235 != null && var5.field2235.field2195 instanceof class193) {
            var6 = (class193)var5.field2235.field2195;
            class193.method3335(var1, var6, 128, 0, 128, true);
         }
      }

      if (var3 < this.field2281 && var4 > 0) {
         var5 = this.field2300[var2][var3 + 1][var4 - 1];
         if (var5 != null && var5.field2235 != null && var5.field2235.field2195 instanceof class193) {
            var6 = (class193)var5.field2235.field2195;
            class193.method3335(var1, var6, 128, 0, -128, true);
         }
      }

   }

   void method3530(class193 var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      int var8 = var3;
      int var9 = var3 + var5;
      int var10 = var4 - 1;
      int var11 = var4 + var6;

      for(int var12 = var2; var12 <= var2 + 1; ++var12) {
         if (var12 != this.field2303) {
            for(int var13 = var8; var13 <= var9; ++var13) {
               if (var13 >= 0 && var13 < this.field2281) {
                  for(int var14 = var10; var14 <= var11; ++var14) {
                     if (var14 >= 0 && var14 < this.field2282 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var13 != var3)) {
                        class197 var15 = this.field2300[var12][var13][var14];
                        if (var15 != null) {
                           int var16 = (this.field2298[var12][var13][var14] + this.field2298[var12][var13 + 1][var14] + this.field2298[var12][var13][var14 + 1] + this.field2298[var12][var13 + 1][var14 + 1]) / 4 - (this.field2298[var2][var3][var4] + this.field2298[var2][var3 + 1][var4] + this.field2298[var2][var3][var4 + 1] + this.field2298[var2][var3 + 1][var4 + 1]) / 4;
                           class212 var17 = var15.field2229;
                           if (var17 != null) {
                              class193 var18;
                              if (var17.field2514 instanceof class193) {
                                 var18 = (class193)var17.field2514;
                                 class193.method3335(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }

                              if (var17.field2515 instanceof class193) {
                                 var18 = (class193)var17.field2515;
                                 class193.method3335(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }
                           }

                           for(int var23 = 0; var23 < var15.field2233; ++var23) {
                              class215 var19 = var15.field2234[var23];
                              if (var19 != null && var19.field2536 instanceof class193) {
                                 class193 var20 = (class193)var19.field2536;
                                 int var21 = var19.field2539 - var19.field2544 + 1;
                                 int var22 = var19.field2534 - var19.field2540 + 1;
                                 class193.method3335(var1, var20, (var19.field2544 - var3) * 128 + (var21 - var5) * 64, var16, (var19.field2540 - var4) * 128 + (var22 - var6) * 64, var7);
                              }
                           }
                        }
                     }
                  }
               }
            }

            --var8;
            var7 = false;
         }
      }

   }

   public void method3531(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      class197 var7 = this.field2300[var4][var5][var6];
      if (var7 != null) {
         class210 var8 = var7.field2232;
         int var10;
         if (var8 != null) {
            int var18 = var8.field2505;
            if (var18 != 0) {
               for(var10 = 0; var10 < 4; ++var10) {
                  var1[var2] = var18;
                  var1[var2 + 1] = var18;
                  var1[var2 + 2] = var18;
                  var1[var2 + 3] = var18;
                  var2 += var3;
               }

            }
         } else {
            class206 var9 = var7.field2245;
            if (var9 != null) {
               var10 = var9.field2393;
               int var11 = var9.field2394;
               int var12 = var9.field2395;
               int var13 = var9.field2382;
               int[] var14 = this.field2336[var10];
               int[] var15 = this.field2337[var11];
               int var16 = 0;
               int var17;
               if (var12 != 0) {
                  for(var17 = 0; var17 < 4; ++var17) {
                     var1[var2] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 1] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 2] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 3] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var2 += var3;
                  }
               } else {
                  for(var17 = 0; var17 < 4; ++var17) {
                     if (var14[var15[var16++]] != 0) {
                        var1[var2] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 1] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 2] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 3] = var13;
                     }

                     var2 += var3;
                  }
               }

            }
         }
      }
   }

   public static void method3532(int[] var0, int var1, int var2, int var3, int var4) {
      field2342 = 0;
      field2343 = 0;
      field2344 = var3;
      field2345 = var4;
      field2340 = var3 / 2;
      field2341 = var4 / 2;
      boolean[][][][] var5 = new boolean[var0.length][32][53][53];

      int var6;
      int var7;
      int var8;
      int var9;
      int var11;
      int var12;
      for(var6 = 128; var6 <= 383; var6 += 32) {
         for(var7 = 0; var7 < 2048; var7 += 64) {
            field2327 = Rasterizer3D.sineTable[var6];
            field2306 = Rasterizer3D.cosineTable[var6];
            field2291 = Rasterizer3D.sineTable[var7];
            field2289 = Rasterizer3D.cosineTable[var7];
            var8 = (var6 - 128) / 32;
            var9 = var7 / 64;

            for(int var10 = -26; var10 < 26; ++var10) {
               for(var11 = -26; var11 < 26; ++var11) {
                  var12 = var10 * 128;
                  int var13 = var11 * 128;
                  boolean var14 = false;

                  for(int var15 = -var1; var15 <= var2; var15 += 128) {
                     if (method3664(var12, var0[var8] + var15, var13)) {
                        var14 = true;
                        break;
                     }
                  }

                  var5[var8][var9][var10 + 25 + 1][var11 + 25 + 1] = var14;
               }
            }
         }
      }

      for(var6 = 0; var6 < 8; ++var6) {
         for(var7 = 0; var7 < 32; ++var7) {
            for(var8 = -25; var8 < 25; ++var8) {
               for(var9 = -25; var9 < 25; ++var9) {
                  boolean var16 = false;

                  label76:
                  for(var11 = -1; var11 <= 1; ++var11) {
                     for(var12 = -1; var12 <= 1; ++var12) {
                        if (var5[var6][var7][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                           var16 = true;
                           break label76;
                        }

                        if (var5[var6][(var7 + 1) % 31][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                           var16 = true;
                           break label76;
                        }

                        if (var5[var6 + 1][var7][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                           var16 = true;
                           break label76;
                        }

                        if (var5[var6 + 1][(var7 + 1) % 31][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                           var16 = true;
                           break label76;
                        }
                     }
                  }

                  field2338[var6][var7][var8 + 25][var9 + 25] = var16;
               }
            }
         }
      }

   }

   static boolean method3664(int var0, int var1, int var2) {
      int var3 = var2 * field2291 + var0 * field2289 >> 16;
      int var4 = var2 * field2289 - var0 * field2291 >> 16;
      int var5 = var1 * field2327 + var4 * field2306 >> 16;
      int var6 = var1 * field2306 - var4 * field2327 >> 16;
      if (var5 >= 50 && var5 <= 3500) {
         int var7 = field2340 + var3 * 128 / var5;
         int var8 = field2341 + var6 * 128 / var5;
         return var7 >= field2342 && var7 <= field2344 && var8 >= field2343 && var8 <= field2345;
      } else {
         return false;
      }
   }

   public void method3534(int var1, int var2, int var3, boolean var4) {
      if (!shouldSendWalk() || var4) {
         field2310 = true;
         field2284 = var4;
         field2311 = var1;
         field2312 = var2;
         field2313 = var3;
         selectedX = -1;
         selectedY = -1;
      }
   }

   public void method3678() {
      field2284 = true;
   }

   public static boolean shouldSendWalk() {
      return field2284 && selectedX != -1;
   }

   public static void method3537() {
      selectedX = -1;
      field2284 = false;
   }

   public void method3615(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 < 0) {
         var1 = 0;
      } else if (var1 >= this.field2281 * 128) {
         var1 = this.field2281 * 128 - 1;
      }

      if (var3 < 0) {
         var3 = 0;
      } else if (var3 >= this.field2282 * 128) {
         var3 = this.field2282 * 128 - 1;
      }

      if (var4 < 128) {
         var4 = 128;
      } else if (var4 > 383) {
         var4 = 383;
      }

      ++field2331;
      field2327 = Rasterizer3D.sineTable[var4];
      field2306 = Rasterizer3D.cosineTable[var4];
      field2291 = Rasterizer3D.sineTable[var5];
      field2289 = Rasterizer3D.cosineTable[var5];
      field2283 = field2338[(var4 - 128) / 32][var5 / 64];
      field2302 = var1;
      field2324 = var2;
      field2304 = var3;
      field2308 = var1 / 128;
      field2301 = var3 / 128;
      field2316 = var6;
      field2332 = field2308 - 25;
      if (field2332 < 0) {
         field2332 = 0;
      }

      field2288 = field2301 - 25;
      if (field2288 < 0) {
         field2288 = 0;
      }

      field2297 = field2308 + 25;
      if (field2297 > this.field2281) {
         field2297 = this.field2281;
      }

      field2299 = field2301 + 25;
      if (field2299 > this.field2282) {
         field2299 = this.field2282;
      }

      this.method3544();
      field2293 = 0;

      int var7;
      class197[][] var8;
      int var9;
      int var10;
      for(var7 = this.field2309; var7 < this.field2303; ++var7) {
         var8 = this.field2300[var7];

         for(var9 = field2332; var9 < field2297; ++var9) {
            for(var10 = field2288; var10 < field2299; ++var10) {
               class197 var11 = var8[var9][var10];
               if (var11 != null) {
                  if (var11.field2243 > var6 || !field2283[var9 - field2308 + 25][var10 - field2301 + 25] && this.field2298[var7][var9][var10] - var2 < 2000) {
                     var11.field2238 = false;
                     var11.field2239 = false;
                     var11.field2231 = 0;
                  } else {
                     var11.field2238 = true;
                     var11.field2239 = true;
                     if (var11.field2233 > 0) {
                        var11.field2240 = true;
                     } else {
                        var11.field2240 = false;
                     }

                     ++field2293;
                  }
               }
            }
         }
      }

      int var12;
      int var13;
      int var14;
      class197 var15;
      int var16;
      for(var7 = this.field2309; var7 < this.field2303; ++var7) {
         var8 = this.field2300[var7];

         for(var9 = -25; var9 <= 0; ++var9) {
            var10 = field2308 + var9;
            var16 = field2308 - var9;
            if (var10 >= field2332 || var16 < field2297) {
               for(var12 = -25; var12 <= 0; ++var12) {
                  var13 = field2301 + var12;
                  var14 = field2301 - var12;
                  if (var10 >= field2332) {
                     if (var13 >= field2288) {
                        var15 = var8[var10][var13];
                        if (var15 != null && var15.field2238) {
                           this.method3498(var15, true);
                        }
                     }

                     if (var14 < field2299) {
                        var15 = var8[var10][var14];
                        if (var15 != null && var15.field2238) {
                           this.method3498(var15, true);
                        }
                     }
                  }

                  if (var16 < field2297) {
                     if (var13 >= field2288) {
                        var15 = var8[var16][var13];
                        if (var15 != null && var15.field2238) {
                           this.method3498(var15, true);
                        }
                     }

                     if (var14 < field2299) {
                        var15 = var8[var16][var14];
                        if (var15 != null && var15.field2238) {
                           this.method3498(var15, true);
                        }
                     }
                  }

                  if (field2293 == 0) {
                     field2310 = false;
                     return;
                  }
               }
            }
         }
      }

      for(var7 = this.field2309; var7 < this.field2303; ++var7) {
         var8 = this.field2300[var7];

         for(var9 = -25; var9 <= 0; ++var9) {
            var10 = field2308 + var9;
            var16 = field2308 - var9;
            if (var10 >= field2332 || var16 < field2297) {
               for(var12 = -25; var12 <= 0; ++var12) {
                  var13 = field2301 + var12;
                  var14 = field2301 - var12;
                  if (var10 >= field2332) {
                     if (var13 >= field2288) {
                        var15 = var8[var10][var13];
                        if (var15 != null && var15.field2238) {
                           this.method3498(var15, false);
                        }
                     }

                     if (var14 < field2299) {
                        var15 = var8[var10][var14];
                        if (var15 != null && var15.field2238) {
                           this.method3498(var15, false);
                        }
                     }
                  }

                  if (var16 < field2297) {
                     if (var13 >= field2288) {
                        var15 = var8[var16][var13];
                        if (var15 != null && var15.field2238) {
                           this.method3498(var15, false);
                        }
                     }

                     if (var14 < field2299) {
                        var15 = var8[var16][var14];
                        if (var15 != null && var15.field2238) {
                           this.method3498(var15, false);
                        }
                     }
                  }

                  if (field2293 == 0) {
                     field2310 = false;
                     return;
                  }
               }
            }
         }
      }

      field2310 = false;
   }

   void method3498(class197 var1, boolean var2) {
      field2330.method4672(var1);

      while(true) {
         class197 var3;
         int var4;
         int var5;
         int var6;
         int var7;
         class197[][] var8;
         class197 var9;
         int var11;
         int var14;
         int var15;
         int var16;
         int var24;
         int var26;
         do {
            do {
               do {
                  do {
                     do {
                        do {
                           while(true) {
                              class212 var10;
                              class215 var12;
                              int var17;
                              int var18;
                              int var21;
                              boolean var22;
                              class197 var33;
                              while(true) {
                                 do {
                                    var3 = (class197)field2330.method4699();
                                    if (var3 == null) {
                                       return;
                                    }
                                 } while(!var3.field2239);

                                 var4 = var3.field2224;
                                 var5 = var3.field2225;
                                 var6 = var3.field2237;
                                 var7 = var3.field2226;
                                 var8 = this.field2300[var6];
                                 if (!var3.field2238) {
                                    break;
                                 }

                                 if (var2) {
                                    if (var6 > 0) {
                                       var9 = this.field2300[var6 - 1][var4][var5];
                                       if (var9 != null && var9.field2239) {
                                          continue;
                                       }
                                    }

                                    if (var4 <= field2308 && var4 > field2332) {
                                       var9 = var8[var4 - 1][var5];
                                       if (var9 != null && var9.field2239 && (var9.field2238 || (var3.field2236 & 1) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var4 >= field2308 && var4 < field2297 - 1) {
                                       var9 = var8[var4 + 1][var5];
                                       if (var9 != null && var9.field2239 && (var9.field2238 || (var3.field2236 & 4) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var5 <= field2301 && var5 > field2288) {
                                       var9 = var8[var4][var5 - 1];
                                       if (var9 != null && var9.field2239 && (var9.field2238 || (var3.field2236 & 8) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var5 >= field2301 && var5 < field2299 - 1) {
                                       var9 = var8[var4][var5 + 1];
                                       if (var9 != null && var9.field2239 && (var9.field2238 || (var3.field2236 & 2) == 0)) {
                                          continue;
                                       }
                                    }
                                 } else {
                                    var2 = true;
                                 }

                                 var3.field2238 = false;
                                 if (var3.field2241 != null) {
                                    var9 = var3.field2241;
                                    if (var9.field2232 != null) {
                                       if (!this.method3545(0, var4, var5)) {
                                          this.method3561(var9.field2232, 0, field2327, field2306, field2291, field2289, var4, var5);
                                       }
                                    } else if (var9.field2245 != null && !this.method3545(0, var4, var5)) {
                                       this.method3541(var9.field2245, field2327, field2306, field2291, field2289, var4, var5);
                                    }

                                    var10 = var9.field2229;
                                    if (var10 != null) {
                                       var10.field2514.method3686(0, field2327, field2306, field2291, field2289, var10.field2510 - field2302, var10.field2517 - field2324, var10.field2511 - field2304, var10.field2516);
                                    }

                                    for(var11 = 0; var11 < var9.field2233; ++var11) {
                                       var12 = var9.field2234[var11];
                                       if (var12 != null) {
                                          var12.field2536.method3686(var12.field2532, field2327, field2306, field2291, field2289, var12.field2537 - field2302, var12.field2533 - field2324, var12.field2535 - field2304, var12.field2538);
                                       }
                                    }
                                 }

                                 var22 = false;
                                 if (var3.field2232 != null) {
                                    if (!this.method3545(var7, var4, var5)) {
                                       var22 = true;
                                       if (var3.field2232.field2502 != 12345678 || field2310 && var6 <= field2311) {
                                          this.method3561(var3.field2232, var7, field2327, field2306, field2291, field2289, var4, var5);
                                       }
                                    }
                                 } else if (var3.field2245 != null && !this.method3545(var7, var4, var5)) {
                                    var22 = true;
                                    this.method3541(var3.field2245, field2327, field2306, field2291, field2289, var4, var5);
                                 }

                                 var21 = 0;
                                 var11 = 0;
                                 class212 var23 = var3.field2229;
                                 class214 var13 = var3.field2230;
                                 if (var23 != null || var13 != null) {
                                    if (field2308 == var4) {
                                       ++var21;
                                    } else if (field2308 < var4) {
                                       var21 += 2;
                                    }

                                    if (field2301 == var5) {
                                       var21 += 3;
                                    } else if (field2301 > var5) {
                                       var21 += 6;
                                    }

                                    var11 = field2325[var21];
                                    var3.field2244 = field2329[var21];
                                 }

                                 if (var23 != null) {
                                    if ((var23.field2519 & field2326[var21]) != 0) {
                                       if (var23.field2519 == 16) {
                                          var3.field2231 = 3;
                                          var3.field2223 = field2339[var21];
                                          var3.field2228 = 3 - var3.field2223;
                                       } else if (var23.field2519 == 32) {
                                          var3.field2231 = 6;
                                          var3.field2223 = field2295[var21];
                                          var3.field2228 = 6 - var3.field2223;
                                       } else if (var23.field2519 == 64) {
                                          var3.field2231 = 12;
                                          var3.field2223 = field2328[var21];
                                          var3.field2228 = 12 - var3.field2223;
                                       } else {
                                          var3.field2231 = 9;
                                          var3.field2223 = field2279[var21];
                                          var3.field2228 = 9 - var3.field2223;
                                       }
                                    } else {
                                       var3.field2231 = 0;
                                    }

                                    if ((var23.field2519 & var11) != 0 && !this.method3546(var7, var4, var5, var23.field2519)) {
                                       var23.field2514.method3686(0, field2327, field2306, field2291, field2289, var23.field2510 - field2302, var23.field2517 - field2324, var23.field2511 - field2304, var23.field2516);
                                    }

                                    if ((var23.field2513 & var11) != 0 && !this.method3546(var7, var4, var5, var23.field2513)) {
                                       var23.field2515.method3686(0, field2327, field2306, field2291, field2289, var23.field2510 - field2302, var23.field2517 - field2324, var23.field2511 - field2304, var23.field2516);
                                    }
                                 }

                                 if (var13 != null && !this.method3547(var7, var4, var5, var13.field2528.field2346)) {
                                    if ((var13.field2530 & var11) != 0) {
                                       var13.field2528.method3686(0, field2327, field2306, field2291, field2289, var13.field2521 - field2302 + var13.field2526, var13.field2525 - field2324, var13.field2522 - field2304 + var13.field2524, var13.field2523);
                                    } else if (var13.field2530 == 256) {
                                       var14 = var13.field2521 - field2302;
                                       var15 = var13.field2525 - field2324;
                                       var16 = var13.field2522 - field2304;
                                       var17 = var13.field2527;
                                       if (var17 != 1 && var17 != 2) {
                                          var18 = var14;
                                       } else {
                                          var18 = -var14;
                                       }

                                       int var19;
                                       if (var17 != 2 && var17 != 3) {
                                          var19 = var16;
                                       } else {
                                          var19 = -var16;
                                       }

                                       if (var19 < var18) {
                                          var13.field2528.method3686(0, field2327, field2306, field2291, field2289, var14 + var13.field2526, var15, var16 + var13.field2524, var13.field2523);
                                       } else if (var13.field2529 != null) {
                                          var13.field2529.method3686(0, field2327, field2306, field2291, field2289, var14, var15, var16, var13.field2523);
                                       }
                                    }
                                 }

                                 if (var22) {
                                    class194 var27 = var3.field2235;
                                    if (var27 != null) {
                                       var27.field2195.method3686(0, field2327, field2306, field2291, field2289, var27.field2191 - field2302, var27.field2190 - field2324, var27.field2192 - field2304, var27.field2194);
                                    }

                                    class192 var31 = var3.field2227;
                                    if (var31 != null && var31.field2141 == 0) {
                                       if (var31.field2142 != null) {
                                          var31.field2142.method3686(0, field2327, field2306, field2291, field2289, var31.field2138 - field2302, var31.field2144 - field2324, var31.field2145 - field2304, var31.field2143);
                                       }

                                       if (var31.field2137 != null) {
                                          var31.field2137.method3686(0, field2327, field2306, field2291, field2289, var31.field2138 - field2302, var31.field2144 - field2324, var31.field2145 - field2304, var31.field2143);
                                       }

                                       if (var31.field2140 != null) {
                                          var31.field2140.method3686(0, field2327, field2306, field2291, field2289, var31.field2138 - field2302, var31.field2144 - field2324, var31.field2145 - field2304, var31.field2143);
                                       }
                                    }
                                 }

                                 var14 = var3.field2236;
                                 if (var14 != 0) {
                                    if (var4 < field2308 && (var14 & 4) != 0) {
                                       var33 = var8[var4 + 1][var5];
                                       if (var33 != null && var33.field2239) {
                                          field2330.method4672(var33);
                                       }
                                    }

                                    if (var5 < field2301 && (var14 & 2) != 0) {
                                       var33 = var8[var4][var5 + 1];
                                       if (var33 != null && var33.field2239) {
                                          field2330.method4672(var33);
                                       }
                                    }

                                    if (var4 > field2308 && (var14 & 1) != 0) {
                                       var33 = var8[var4 - 1][var5];
                                       if (var33 != null && var33.field2239) {
                                          field2330.method4672(var33);
                                       }
                                    }

                                    if (var5 > field2301 && (var14 & 8) != 0) {
                                       var33 = var8[var4][var5 - 1];
                                       if (var33 != null && var33.field2239) {
                                          field2330.method4672(var33);
                                       }
                                    }
                                 }
                                 break;
                              }

                              if (var3.field2231 != 0) {
                                 var22 = true;

                                 for(var21 = 0; var21 < var3.field2233; ++var21) {
                                    if (var3.field2234[var21].field2543 != field2331 && (var3.field2242[var21] & var3.field2231) == var3.field2223) {
                                       var22 = false;
                                       break;
                                    }
                                 }

                                 if (var22) {
                                    var10 = var3.field2229;
                                    if (!this.method3546(var7, var4, var5, var10.field2519)) {
                                       var10.field2514.method3686(0, field2327, field2306, field2291, field2289, var10.field2510 - field2302, var10.field2517 - field2324, var10.field2511 - field2304, var10.field2516);
                                    }

                                    var3.field2231 = 0;
                                 }
                              }

                              if (!var3.field2240) {
                                 break;
                              }

                              try {
                                 int var25 = var3.field2233;
                                 var3.field2240 = false;
                                 var21 = 0;

                                 label563:
                                 for(var11 = 0; var11 < var25; ++var11) {
                                    var12 = var3.field2234[var11];
                                    if (var12.field2543 != field2331) {
                                       for(var26 = var12.field2544; var26 <= var12.field2539; ++var26) {
                                          for(var14 = var12.field2540; var14 <= var12.field2534; ++var14) {
                                             var33 = var8[var26][var14];
                                             if (var33.field2238) {
                                                var3.field2240 = true;
                                                continue label563;
                                             }

                                             if (var33.field2231 != 0) {
                                                var16 = 0;
                                                if (var26 > var12.field2544) {
                                                   ++var16;
                                                }

                                                if (var26 < var12.field2539) {
                                                   var16 += 4;
                                                }

                                                if (var14 > var12.field2540) {
                                                   var16 += 8;
                                                }

                                                if (var14 < var12.field2534) {
                                                   var16 += 2;
                                                }

                                                if ((var16 & var33.field2231) == var3.field2228) {
                                                   var3.field2240 = true;
                                                   continue label563;
                                                }
                                             }
                                          }
                                       }

                                       field2280[var21++] = var12;
                                       var26 = field2308 - var12.field2544;
                                       var14 = var12.field2539 - field2308;
                                       if (var14 > var26) {
                                          var26 = var14;
                                       }

                                       var15 = field2301 - var12.field2540;
                                       var16 = var12.field2534 - field2301;
                                       if (var16 > var15) {
                                          var12.field2542 = var26 + var16;
                                       } else {
                                          var12.field2542 = var26 + var15;
                                       }
                                    }
                                 }

                                 while(var21 > 0) {
                                    var11 = -50;
                                    var24 = -1;

                                    for(var26 = 0; var26 < var21; ++var26) {
                                       class215 var34 = field2280[var26];
                                       if (var34.field2543 != field2331) {
                                          if (var34.field2542 > var11) {
                                             var11 = var34.field2542;
                                             var24 = var26;
                                          } else if (var34.field2542 == var11) {
                                             var15 = var34.field2537 - field2302;
                                             var16 = var34.field2535 - field2304;
                                             var17 = field2280[var24].field2537 - field2302;
                                             var18 = field2280[var24].field2535 - field2304;
                                             if (var15 * var15 + var16 * var16 > var17 * var17 + var18 * var18) {
                                                var24 = var26;
                                             }
                                          }
                                       }
                                    }

                                    if (var24 == -1) {
                                       break;
                                    }

                                    class215 var35 = field2280[var24];
                                    var35.field2543 = field2331;
                                    if (!this.method3619(var7, var35.field2544, var35.field2539, var35.field2540, var35.field2534, var35.field2536.field2346)) {
                                       var35.field2536.method3686(var35.field2532, field2327, field2306, field2291, field2289, var35.field2537 - field2302, var35.field2533 - field2324, var35.field2535 - field2304, var35.field2538);
                                    }

                                    for(var14 = var35.field2544; var14 <= var35.field2539; ++var14) {
                                       for(var15 = var35.field2540; var15 <= var35.field2534; ++var15) {
                                          class197 var36 = var8[var14][var15];
                                          if (var36.field2231 != 0) {
                                             field2330.method4672(var36);
                                          } else if ((var14 != var4 || var15 != var5) && var36.field2239) {
                                             field2330.method4672(var36);
                                          }
                                       }
                                    }
                                 }

                                 if (!var3.field2240) {
                                    break;
                                 }
                              } catch (Exception var20) {
                                 var3.field2240 = false;
                                 break;
                              }
                           }
                        } while(!var3.field2239);
                     } while(var3.field2231 != 0);

                     if (var4 > field2308 || var4 <= field2332) {
                        break;
                     }

                     var9 = var8[var4 - 1][var5];
                  } while(var9 != null && var9.field2239);

                  if (var4 < field2308 || var4 >= field2297 - 1) {
                     break;
                  }

                  var9 = var8[var4 + 1][var5];
               } while(var9 != null && var9.field2239);

               if (var5 > field2301 || var5 <= field2288) {
                  break;
               }

               var9 = var8[var4][var5 - 1];
            } while(var9 != null && var9.field2239);

            if (var5 < field2301 || var5 >= field2299 - 1) {
               break;
            }

            var9 = var8[var4][var5 + 1];
         } while(var9 != null && var9.field2239);

         var3.field2239 = false;
         --field2293;
         class192 var29 = var3.field2227;
         if (var29 != null && var29.field2141 != 0) {
            if (var29.field2142 != null) {
               var29.field2142.method3686(0, field2327, field2306, field2291, field2289, var29.field2138 - field2302, var29.field2144 - field2324 - var29.field2141, var29.field2145 - field2304, var29.field2143);
            }

            if (var29.field2137 != null) {
               var29.field2137.method3686(0, field2327, field2306, field2291, field2289, var29.field2138 - field2302, var29.field2144 - field2324 - var29.field2141, var29.field2145 - field2304, var29.field2143);
            }

            if (var29.field2140 != null) {
               var29.field2140.method3686(0, field2327, field2306, field2291, field2289, var29.field2138 - field2302, var29.field2144 - field2324 - var29.field2141, var29.field2145 - field2304, var29.field2143);
            }
         }

         if (var3.field2244 != 0) {
            class214 var30 = var3.field2230;
            if (var30 != null && !this.method3547(var7, var4, var5, var30.field2528.field2346)) {
               if ((var30.field2530 & var3.field2244) != 0) {
                  var30.field2528.method3686(0, field2327, field2306, field2291, field2289, var30.field2521 - field2302 + var30.field2526, var30.field2525 - field2324, var30.field2522 - field2304 + var30.field2524, var30.field2523);
               } else if (var30.field2530 == 256) {
                  var11 = var30.field2521 - field2302;
                  var24 = var30.field2525 - field2324;
                  var26 = var30.field2522 - field2304;
                  var14 = var30.field2527;
                  if (var14 != 1 && var14 != 2) {
                     var15 = var11;
                  } else {
                     var15 = -var11;
                  }

                  if (var14 != 2 && var14 != 3) {
                     var16 = var26;
                  } else {
                     var16 = -var26;
                  }

                  if (var16 >= var15) {
                     var30.field2528.method3686(0, field2327, field2306, field2291, field2289, var11 + var30.field2526, var24, var26 + var30.field2524, var30.field2523);
                  } else if (var30.field2529 != null) {
                     var30.field2529.method3686(0, field2327, field2306, field2291, field2289, var11, var24, var26, var30.field2523);
                  }
               }
            }

            class212 var28 = var3.field2229;
            if (var28 != null) {
               if ((var28.field2513 & var3.field2244) != 0 && !this.method3546(var7, var4, var5, var28.field2513)) {
                  var28.field2515.method3686(0, field2327, field2306, field2291, field2289, var28.field2510 - field2302, var28.field2517 - field2324, var28.field2511 - field2304, var28.field2516);
               }

               if ((var28.field2519 & var3.field2244) != 0 && !this.method3546(var7, var4, var5, var28.field2519)) {
                  var28.field2514.method3686(0, field2327, field2306, field2291, field2289, var28.field2510 - field2302, var28.field2517 - field2324, var28.field2511 - field2304, var28.field2516);
               }
            }
         }

         class197 var32;
         if (var6 < this.field2303 - 1) {
            var32 = this.field2300[var6 + 1][var4][var5];
            if (var32 != null && var32.field2239) {
               field2330.method4672(var32);
            }
         }

         if (var4 < field2308) {
            var32 = var8[var4 + 1][var5];
            if (var32 != null && var32.field2239) {
               field2330.method4672(var32);
            }
         }

         if (var5 < field2301) {
            var32 = var8[var4][var5 + 1];
            if (var32 != null && var32.field2239) {
               field2330.method4672(var32);
            }
         }

         if (var4 > field2308) {
            var32 = var8[var4 - 1][var5];
            if (var32 != null && var32.field2239) {
               field2330.method4672(var32);
            }
         }

         if (var5 > field2301) {
            var32 = var8[var4][var5 - 1];
            if (var32 != null && var32.field2239) {
               field2330.method4672(var32);
            }
         }
      }
   }

   void method3561(class210 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9;
      int var10 = var9 = (var7 << 7) - field2302;
      int var11;
      int var12 = var11 = (var8 << 7) - field2304;
      int var13;
      int var14 = var13 = var10 + 128;
      int var15;
      int var16 = var15 = var12 + 128;
      int var17 = this.field2298[var2][var7][var8] - field2324;
      int var18 = this.field2298[var2][var7 + 1][var8] - field2324;
      int var19 = this.field2298[var2][var7 + 1][var8 + 1] - field2324;
      int var20 = this.field2298[var2][var7][var8 + 1] - field2324;
      int var21 = var12 * var5 + var10 * var6 >> 16;
      var12 = var12 * var6 - var10 * var5 >> 16;
      var10 = var21;
      var21 = var17 * var4 - var12 * var3 >> 16;
      var12 = var17 * var3 + var12 * var4 >> 16;
      var17 = var21;
      if (var12 >= 50) {
         var21 = var11 * var5 + var14 * var6 >> 16;
         var11 = var11 * var6 - var14 * var5 >> 16;
         var14 = var21;
         var21 = var18 * var4 - var11 * var3 >> 16;
         var11 = var18 * var3 + var11 * var4 >> 16;
         var18 = var21;
         if (var11 >= 50) {
            var21 = var16 * var5 + var13 * var6 >> 16;
            var16 = var16 * var6 - var13 * var5 >> 16;
            var13 = var21;
            var21 = var19 * var4 - var16 * var3 >> 16;
            var16 = var19 * var3 + var16 * var4 >> 16;
            var19 = var21;
            if (var16 >= 50) {
               var21 = var15 * var5 + var9 * var6 >> 16;
               var15 = var15 * var6 - var9 * var5 >> 16;
               var9 = var21;
               var21 = var20 * var4 - var15 * var3 >> 16;
               var15 = var20 * var3 + var15 * var4 >> 16;
               if (var15 >= 50) {
                  int var22 = Rasterizer3D.field2259 + var10 * Rasterizer3D.field2262 / var12;
                  int var23 = Rasterizer3D.field2260 + var17 * Rasterizer3D.field2262 / var12;
                  int var24 = Rasterizer3D.field2259 + var14 * Rasterizer3D.field2262 / var11;
                  int var25 = Rasterizer3D.field2260 + var18 * Rasterizer3D.field2262 / var11;
                  int var26 = Rasterizer3D.field2259 + var13 * Rasterizer3D.field2262 / var16;
                  int var27 = Rasterizer3D.field2260 + var19 * Rasterizer3D.field2262 / var16;
                  int var28 = Rasterizer3D.field2259 + var9 * Rasterizer3D.field2262 / var15;
                  int var29 = Rasterizer3D.field2260 + var21 * Rasterizer3D.field2262 / var15;
                  Rasterizer3D.field2258 = 0;
                  int var30;
                  if ((var26 - var28) * (var25 - var29) - (var27 - var29) * (var24 - var28) > 0) {
                     Rasterizer3D.field2252 = false;
                     if (var26 < 0 || var28 < 0 || var24 < 0 || var26 > Rasterizer3D.field2261 || var28 > Rasterizer3D.field2261 || var24 > Rasterizer3D.field2261) {
                        Rasterizer3D.field2252 = true;
                     }

                     if (field2310 && method3543(field2312, field2313, var27, var29, var25, var26, var28, var24)) {
                        selectedX = var7;
                        selectedY = var8;
                     }

                     if (var1.field2504 == -1) {
                        if (var1.field2502 != 12345678) {
                           Rasterizer3D.method3428(var27, var29, var25, var26, var28, var24, var1.field2502, var1.field2503, var1.field2501);
                        }
                     } else if (!field2307) {
                        if (var1.field2500) {
                           Rasterizer3D.method3430(var27, var29, var25, var26, var28, var24, var1.field2502, var1.field2503, var1.field2501, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.field2504);
                        } else {
                           Rasterizer3D.method3430(var27, var29, var25, var26, var28, var24, var1.field2502, var1.field2503, var1.field2501, var13, var9, var14, var19, var21, var18, var16, var15, var11, var1.field2504);
                        }
                     } else {
                        var30 = Rasterizer3D.field2269.method3835(var1.field2504);
                        Rasterizer3D.method3428(var27, var29, var25, var26, var28, var24, method3542(var30, var1.field2502), method3542(var30, var1.field2503), method3542(var30, var1.field2501));
                     }
                  }

                  if ((var22 - var24) * (var29 - var25) - (var23 - var25) * (var28 - var24) > 0) {
                     Rasterizer3D.field2252 = false;
                     if (var22 < 0 || var24 < 0 || var28 < 0 || var22 > Rasterizer3D.field2261 || var24 > Rasterizer3D.field2261 || var28 > Rasterizer3D.field2261) {
                        Rasterizer3D.field2252 = true;
                     }

                     if (field2310 && method3543(field2312, field2313, var23, var25, var29, var22, var24, var28)) {
                        selectedX = var7;
                        selectedY = var8;
                     }

                     if (var1.field2504 == -1) {
                        if (var1.field2506 != 12345678) {
                           Rasterizer3D.method3428(var23, var25, var29, var22, var24, var28, var1.field2506, var1.field2501, var1.field2503);
                        }
                     } else if (!field2307) {
                        Rasterizer3D.method3430(var23, var25, var29, var22, var24, var28, var1.field2506, var1.field2501, var1.field2503, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.field2504);
                     } else {
                        var30 = Rasterizer3D.field2269.method3835(var1.field2504);
                        Rasterizer3D.method3428(var23, var25, var29, var22, var24, var28, method3542(var30, var1.field2506), method3542(var30, var1.field2501), method3542(var30, var1.field2503));
                     }
                  }

               }
            }
         }
      }
   }

   void method3541(class206 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var1.field2390.length;

      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var1.field2390[var9] - field2302;
         var11 = var1.field2383[var9] - field2324;
         var12 = var1.field2402[var9] - field2304;
         var13 = var12 * var4 + var10 * var5 >> 16;
         var12 = var12 * var5 - var10 * var4 >> 16;
         var10 = var13;
         var13 = var11 * var3 - var12 * var2 >> 16;
         var12 = var11 * var2 + var12 * var3 >> 16;
         if (var12 < 50) {
            return;
         }

         if (var1.field2391 != null) {
            class206.field2399[var9] = var10;
            class206.field2400[var9] = var13;
            class206.field2401[var9] = var12;
         }

         class206.field2397[var9] = Rasterizer3D.field2259 + var10 * Rasterizer3D.field2262 / var12;
         class206.field2385[var9] = Rasterizer3D.field2260 + var13 * Rasterizer3D.field2262 / var12;
      }

      Rasterizer3D.field2258 = 0;
      var8 = var1.field2388.length;

      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var1.field2388[var9];
         var11 = var1.field2389[var9];
         var12 = var1.field2396[var9];
         var13 = class206.field2397[var10];
         int var14 = class206.field2397[var11];
         int var15 = class206.field2397[var12];
         int var16 = class206.field2385[var10];
         int var17 = class206.field2385[var11];
         int var18 = class206.field2385[var12];
         if ((var13 - var14) * (var18 - var17) - (var16 - var17) * (var15 - var14) > 0) {
            Rasterizer3D.field2252 = false;
            if (var13 < 0 || var14 < 0 || var15 < 0 || var13 > Rasterizer3D.field2261 || var14 > Rasterizer3D.field2261 || var15 > Rasterizer3D.field2261) {
               Rasterizer3D.field2252 = true;
            }

            if (field2310 && method3543(field2312, field2313, var16, var17, var18, var13, var14, var15)) {
               selectedX = var6;
               selectedY = var7;
            }

            if (var1.field2391 != null && var1.field2391[var9] != -1) {
               if (!field2307) {
                  if (var1.field2386) {
                     Rasterizer3D.method3430(var16, var17, var18, var13, var14, var15, var1.field2384[var9], var1.field2392[var9], var1.field2387[var9], class206.field2399[0], class206.field2399[1], class206.field2399[3], class206.field2400[0], class206.field2400[1], class206.field2400[3], class206.field2401[0], class206.field2401[1], class206.field2401[3], var1.field2391[var9]);
                  } else {
                     Rasterizer3D.method3430(var16, var17, var18, var13, var14, var15, var1.field2384[var9], var1.field2392[var9], var1.field2387[var9], class206.field2399[var10], class206.field2399[var11], class206.field2399[var12], class206.field2400[var10], class206.field2400[var11], class206.field2400[var12], class206.field2401[var10], class206.field2401[var11], class206.field2401[var12], var1.field2391[var9]);
                  }
               } else {
                  int var19 = Rasterizer3D.field2269.method3835(var1.field2391[var9]);
                  Rasterizer3D.method3428(var16, var17, var18, var13, var14, var15, method3542(var19, var1.field2384[var9]), method3542(var19, var1.field2392[var9]), method3542(var19, var1.field2387[var9]));
               }
            } else if (var1.field2384[var9] != 12345678) {
               Rasterizer3D.method3428(var16, var17, var18, var13, var14, var15, var1.field2384[var9], var1.field2392[var9], var1.field2387[var9]);
            }
         }
      }

   }

   static final int method3542(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & '\uff80') + var1;
   }

   static boolean method3543(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var1 < var2 && var1 < var3 && var1 < var4) {
         return false;
      } else if (var1 > var2 && var1 > var3 && var1 > var4) {
         return false;
      } else if (var0 < var5 && var0 < var6 && var0 < var7) {
         return false;
      } else if (var0 > var5 && var0 > var6 && var0 > var7) {
         return false;
      } else {
         int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2);
         int var9 = (var1 - var3) * (var7 - var6) - (var0 - var6) * (var4 - var3);
         int var10 = (var1 - var4) * (var5 - var7) - (var0 - var7) * (var2 - var4);
         if (var8 == 0) {
            if (var9 != 0) {
               return var9 < 0 ? var10 <= 0 : var10 >= 0;
            } else {
               return true;
            }
         } else {
            return var8 < 0 ? var9 <= 0 && var10 <= 0 : var9 >= 0 && var10 >= 0;
         }
      }
   }

   void method3544() {
      int var1 = field2320[field2316];
      class204[] var2 = field2321[field2316];
      field2322 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         class204 var4 = var2[var3];
         int var5;
         int var6;
         int var7;
         int var9;
         boolean var13;
         if (var4.field2359 == 1) {
            var5 = var4.field2361 - field2308 + 25;
            if (var5 >= 0 && var5 <= 50) {
               var6 = var4.field2357 - field2301 + 25;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.field2358 - field2301 + 25;
               if (var7 > 50) {
                  var7 = 50;
               }

               var13 = false;

               while(var6 <= var7) {
                  if (field2283[var5][var6++]) {
                     var13 = true;
                     break;
                  }
               }

               if (var13) {
                  var9 = field2302 - var4.field2365;
                  if (var9 > 32) {
                     var4.field2366 = 1;
                  } else {
                     if (var9 >= -32) {
                        continue;
                     }

                     var4.field2366 = 2;
                     var9 = -var9;
                  }

                  var4.field2369 = (var4.field2355 - field2304 << 8) / var9;
                  var4.field2371 = (var4.field2362 - field2304 << 8) / var9;
                  var4.field2360 = (var4.field2364 - field2324 << 8) / var9;
                  var4.field2372 = (var4.field2363 - field2324 << 8) / var9;
                  field2323[field2322++] = var4;
               }
            }
         } else if (var4.field2359 == 2) {
            var5 = var4.field2357 - field2301 + 25;
            if (var5 >= 0 && var5 <= 50) {
               var6 = var4.field2361 - field2308 + 25;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.field2356 - field2308 + 25;
               if (var7 > 50) {
                  var7 = 50;
               }

               var13 = false;

               while(var6 <= var7) {
                  if (field2283[var6++][var5]) {
                     var13 = true;
                     break;
                  }
               }

               if (var13) {
                  var9 = field2304 - var4.field2355;
                  if (var9 > 32) {
                     var4.field2366 = 3;
                  } else {
                     if (var9 >= -32) {
                        continue;
                     }

                     var4.field2366 = 4;
                     var9 = -var9;
                  }

                  var4.field2367 = (var4.field2365 - field2302 << 8) / var9;
                  var4.field2368 = (var4.field2370 - field2302 << 8) / var9;
                  var4.field2360 = (var4.field2364 - field2324 << 8) / var9;
                  var4.field2372 = (var4.field2363 - field2324 << 8) / var9;
                  field2323[field2322++] = var4;
               }
            }
         } else if (var4.field2359 == 4) {
            var5 = var4.field2364 - field2324;
            if (var5 > 128) {
               var6 = var4.field2357 - field2301 + 25;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.field2358 - field2301 + 25;
               if (var7 > 50) {
                  var7 = 50;
               }

               if (var6 <= var7) {
                  int var8 = var4.field2361 - field2308 + 25;
                  if (var8 < 0) {
                     var8 = 0;
                  }

                  var9 = var4.field2356 - field2308 + 25;
                  if (var9 > 50) {
                     var9 = 50;
                  }

                  boolean var10 = false;

                  label144:
                  for(int var11 = var8; var11 <= var9; ++var11) {
                     for(int var12 = var6; var12 <= var7; ++var12) {
                        if (field2283[var11][var12]) {
                           var10 = true;
                           break label144;
                        }
                     }
                  }

                  if (var10) {
                     var4.field2366 = 5;
                     var4.field2367 = (var4.field2365 - field2302 << 8) / var5;
                     var4.field2368 = (var4.field2370 - field2302 << 8) / var5;
                     var4.field2369 = (var4.field2355 - field2304 << 8) / var5;
                     var4.field2371 = (var4.field2362 - field2304 << 8) / var5;
                     field2323[field2322++] = var4;
                  }
               }
            }
         }
      }

   }

   boolean method3545(int var1, int var2, int var3) {
      int var4 = this.field2296[var1][var2][var3];
      if (var4 == -field2331) {
         return false;
      } else if (var4 == field2331) {
         return true;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         if (this.method3549(var5 + 1, this.field2298[var1][var2][var3], var6 + 1) && this.method3549(var5 + 128 - 1, this.field2298[var1][var2 + 1][var3], var6 + 1) && this.method3549(var5 + 128 - 1, this.field2298[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.method3549(var5 + 1, this.field2298[var1][var2][var3 + 1], var6 + 128 - 1)) {
            this.field2296[var1][var2][var3] = field2331;
            return true;
         } else {
            this.field2296[var1][var2][var3] = -field2331;
            return false;
         }
      }
   }

   boolean method3546(int var1, int var2, int var3, int var4) {
      if (!this.method3545(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         int var7 = this.field2298[var1][var2][var3] - 1;
         int var8 = var7 - 120;
         int var9 = var7 - 230;
         int var10 = var7 - 238;
         if (var4 < 16) {
            if (var4 == 1) {
               if (var5 > field2302) {
                  if (!this.method3549(var5, var7, var6)) {
                     return false;
                  }

                  if (!this.method3549(var5, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.method3549(var5, var8, var6)) {
                     return false;
                  }

                  if (!this.method3549(var5, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.method3549(var5, var9, var6)) {
                  return false;
               }

               if (!this.method3549(var5, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 2) {
               if (var6 < field2304) {
                  if (!this.method3549(var5, var7, var6 + 128)) {
                     return false;
                  }

                  if (!this.method3549(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.method3549(var5, var8, var6 + 128)) {
                     return false;
                  }

                  if (!this.method3549(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.method3549(var5, var9, var6 + 128)) {
                  return false;
               }

               if (!this.method3549(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 4) {
               if (var5 < field2302) {
                  if (!this.method3549(var5 + 128, var7, var6)) {
                     return false;
                  }

                  if (!this.method3549(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.method3549(var5 + 128, var8, var6)) {
                     return false;
                  }

                  if (!this.method3549(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.method3549(var5 + 128, var9, var6)) {
                  return false;
               }

               if (!this.method3549(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 8) {
               if (var6 > field2304) {
                  if (!this.method3549(var5, var7, var6)) {
                     return false;
                  }

                  if (!this.method3549(var5 + 128, var7, var6)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.method3549(var5, var8, var6)) {
                     return false;
                  }

                  if (!this.method3549(var5 + 128, var8, var6)) {
                     return false;
                  }
               }

               if (!this.method3549(var5, var9, var6)) {
                  return false;
               }

               if (!this.method3549(var5 + 128, var9, var6)) {
                  return false;
               }

               return true;
            }
         }

         if (!this.method3549(var5 + 64, var10, var6 + 64)) {
            return false;
         } else if (var4 == 16) {
            return this.method3549(var5, var9, var6 + 128);
         } else if (var4 == 32) {
            return this.method3549(var5 + 128, var9, var6 + 128);
         } else if (var4 == 64) {
            return this.method3549(var5 + 128, var9, var6);
         } else if (var4 == 128) {
            return this.method3549(var5, var9, var6);
         } else {
            return true;
         }
      }
   }

   boolean method3547(int var1, int var2, int var3, int var4) {
      if (!this.method3545(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         return this.method3549(var5 + 1, this.field2298[var1][var2][var3] - var4, var6 + 1) && this.method3549(var5 + 128 - 1, this.field2298[var1][var2 + 1][var3] - var4, var6 + 1) && this.method3549(var5 + 128 - 1, this.field2298[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.method3549(var5 + 1, this.field2298[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
      }
   }

   boolean method3619(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7;
      int var8;
      if (var2 == var3 && var4 == var5) {
         if (!this.method3545(var1, var2, var4)) {
            return false;
         } else {
            var7 = var2 << 7;
            var8 = var4 << 7;
            return this.method3549(var7 + 1, this.field2298[var1][var2][var4] - var6, var8 + 1) && this.method3549(var7 + 128 - 1, this.field2298[var1][var2 + 1][var4] - var6, var8 + 1) && this.method3549(var7 + 128 - 1, this.field2298[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.method3549(var7 + 1, this.field2298[var1][var2][var4 + 1] - var6, var8 + 128 - 1);
         }
      } else {
         for(var7 = var2; var7 <= var3; ++var7) {
            for(var8 = var4; var8 <= var5; ++var8) {
               if (this.field2296[var1][var7][var8] == -field2331) {
                  return false;
               }
            }
         }

         var7 = (var2 << 7) + 1;
         var8 = (var4 << 7) + 2;
         int var9 = this.field2298[var1][var2][var4] - var6;
         if (!this.method3549(var7, var9, var8)) {
            return false;
         } else {
            int var10 = (var3 << 7) - 1;
            if (!this.method3549(var10, var9, var8)) {
               return false;
            } else {
               int var11 = (var5 << 7) - 1;
               if (!this.method3549(var7, var9, var11)) {
                  return false;
               } else if (!this.method3549(var10, var9, var11)) {
                  return false;
               } else {
                  return true;
               }
            }
         }
      }
   }

   boolean method3549(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < field2322; ++var4) {
         class204 var5 = field2323[var4];
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         if (var5.field2366 == 1) {
            var6 = var5.field2365 - var1;
            if (var6 > 0) {
               var7 = var5.field2355 + (var5.field2369 * var6 >> 8);
               var8 = var5.field2362 + (var5.field2371 * var6 >> 8);
               var9 = var5.field2364 + (var5.field2360 * var6 >> 8);
               var10 = var5.field2363 + (var5.field2372 * var6 >> 8);
               if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.field2366 == 2) {
            var6 = var1 - var5.field2365;
            if (var6 > 0) {
               var7 = var5.field2355 + (var5.field2369 * var6 >> 8);
               var8 = var5.field2362 + (var5.field2371 * var6 >> 8);
               var9 = var5.field2364 + (var5.field2360 * var6 >> 8);
               var10 = var5.field2363 + (var5.field2372 * var6 >> 8);
               if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.field2366 == 3) {
            var6 = var5.field2355 - var3;
            if (var6 > 0) {
               var7 = var5.field2365 + (var5.field2367 * var6 >> 8);
               var8 = var5.field2370 + (var5.field2368 * var6 >> 8);
               var9 = var5.field2364 + (var5.field2360 * var6 >> 8);
               var10 = var5.field2363 + (var5.field2372 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.field2366 == 4) {
            var6 = var3 - var5.field2355;
            if (var6 > 0) {
               var7 = var5.field2365 + (var5.field2367 * var6 >> 8);
               var8 = var5.field2370 + (var5.field2368 * var6 >> 8);
               var9 = var5.field2364 + (var5.field2360 * var6 >> 8);
               var10 = var5.field2363 + (var5.field2372 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.field2366 == 5) {
            var6 = var2 - var5.field2364;
            if (var6 > 0) {
               var7 = var5.field2365 + (var5.field2367 * var6 >> 8);
               var8 = var5.field2370 + (var5.field2368 * var6 >> 8);
               var9 = var5.field2355 + (var5.field2369 * var6 >> 8);
               var10 = var5.field2362 + (var5.field2371 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) {
                  return true;
               }
            }
         }
      }

      return false;
   }
}
