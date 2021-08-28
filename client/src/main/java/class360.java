import java.util.HashMap;

public class class360 {
   class277 field4081;
   class277 field4082;
   HashMap field4083;

   public class360(class277 var1, class277 var2) {
      this.field4082 = var1;
      this.field4081 = var2;
      this.field4083 = new HashMap();
   }

   public HashMap method5694(class361[] var1) {
      HashMap var3 = new HashMap();
      class361[] var4 = var1;

      for(int var5 = 0; var5 < var4.length; ++var5) {
         class361 var6 = var4[var5];
         if (this.field4083.containsKey(var6)) {
            var3.put(var6, this.field4083.get(var6));
         } else {
            class302 var7 = ServerPacket.method3918(this.field4082, this.field4081, var6.field4090, "");
            if (null != var7) {
               this.field4083.put(var6, var7);
               var3.put(var6, var7);
            }
         }
      }

      return var3;
   }

   static int method5693(int var0, class59 var1, boolean var2) {
      int var4;
      if (var0 == 5504) {
         class51.field746 -= 2;
         var4 = class51.field747[class51.field746];
         int var5 = class51.field747[1 + class51.field746];
         if (!client.field615) {
            client.field476 = var4;
            client.cameraAngleY = var5;
         }

         return 1;
      } else if (5505 == var0) {
         class51.field747[++class51.field746 - 1] = client.field476;
         return 1;
      } else if (var0 == 5506) {
         class51.field747[++class51.field746 - 1] = client.cameraAngleY;
         return 1;
      } else if (5530 == var0) {
         var4 = class51.field747[--class51.field746];
         if (var4 < 0) {
            var4 = 0;
         }

         client.field483 = var4;
         return 1;
      } else if (var0 == 5531) {
         class51.field747[++class51.field746 - 1] = client.field483;
         return 1;
      } else {
         return 2;
      }
   }

   static final void method5698(int var0, int var1, int var2, int var3, int var4) {
      long var6 = class166.field1925.method3523(var0, var1, var2);
      int var8;
      int var9;
      int var10;
      int var11;
      int var15;
      int var24;
      if (var6 != 0L) {
         var8 = class166.field1925.method3527(var0, var1, var2, var6);
         var9 = var8 >> 6 & 3;
         var10 = var8 & 31;
         var11 = var3;
         boolean var13 = 0L != var6;
         if (var13) {
            boolean var14 = 1 == (int)(var6 >>> 16 & 1L);
            var13 = !var14;
         }

         if (var13) {
            var11 = var4;
         }

         int[] var23 = class377.field4167.field4280;
         var24 = 2048 * (103 - var2) + 24624 + 4 * var1;
         var15 = class79.method1843(var6);
         class156 var16 = class124.method2243(var15);
         if (-1 != var16.field1764) {
            class397 var17 = class276.field3575[var16.field1764];
            if (null != var17) {
               int var18 = (var16.field1750 * 4 - var17.field4263) / 2;
               int var19 = (var16.field1751 * 4 - var17.field4264) / 2;
               var17.method6349(4 * var1 + 48 + var18, var19 + 48 + (104 - var2 - var16.field1751) * 4);
            }
         } else {
            if (var10 == 0 || 2 == var10) {
               if (var9 == 0) {
                  var23[var24] = var11;
                  var23[512 + var24] = var11;
                  var23[1024 + var24] = var11;
                  var23[var24 + 1536] = var11;
               } else if (1 == var9) {
                  var23[var24] = var11;
                  var23[var24 + 1] = var11;
                  var23[var24 + 2] = var11;
                  var23[3 + var24] = var11;
               } else if (2 == var9) {
                  var23[3 + var24] = var11;
                  var23[512 + var24 + 3] = var11;
                  var23[1024 + var24 + 3] = var11;
                  var23[1536 + 3 + var24] = var11;
               } else if (var9 == 3) {
                  var23[1536 + var24] = var11;
                  var23[1 + var24 + 1536] = var11;
                  var23[2 + var24 + 1536] = var11;
                  var23[3 + 1536 + var24] = var11;
               }
            }

            if (var10 == 3) {
               if (0 == var9) {
                  var23[var24] = var11;
               } else if (var9 == 1) {
                  var23[3 + var24] = var11;
               } else if (var9 == 2) {
                  var23[1536 + 3 + var24] = var11;
               } else if (var9 == 3) {
                  var23[1536 + var24] = var11;
               }
            }

            if (2 == var10) {
               if (3 == var9) {
                  var23[var24] = var11;
                  var23[var24 + 512] = var11;
                  var23[1024 + var24] = var11;
                  var23[1536 + var24] = var11;
               } else if (0 == var9) {
                  var23[var24] = var11;
                  var23[var24 + 1] = var11;
                  var23[2 + var24] = var11;
                  var23[var24 + 3] = var11;
               } else if (var9 == 1) {
                  var23[var24 + 3] = var11;
                  var23[512 + var24 + 3] = var11;
                  var23[3 + var24 + 1024] = var11;
                  var23[3 + var24 + 1536] = var11;
               } else if (var9 == 2) {
                  var23[var24 + 1536] = var11;
                  var23[1 + 1536 + var24] = var11;
                  var23[2 + 1536 + var24] = var11;
                  var23[3 + var24 + 1536] = var11;
               }
            }
         }
      }

      var6 = class166.field1925.method3525(var0, var1, var2);
      if (var6 != 0L) {
         var8 = class166.field1925.method3527(var0, var1, var2, var6);
         var9 = var8 >> 6 & 3;
         var10 = var8 & 31;
         var11 = class79.method1843(var6);
         class156 var12 = class124.method2243(var11);
         if (-1 != var12.field1764) {
            class397 var25 = class276.field3575[var12.field1764];
            if (var25 != null) {
               var24 = (var12.field1750 * 4 - var25.field4263) / 2;
               var15 = (var12.field1751 * 4 - var25.field4264) / 2;
               var25.method6349(var24 + 48 + 4 * var1, var15 + 4 * (104 - var2 - var12.field1751) + 48);
            }
         } else if (var10 == 9) {
            int var26 = 15658734;
            boolean var27 = 0L != var6;
            if (var27) {
               boolean var28 = 1 == (int)(var6 >>> 16 & 1L);
               var27 = !var28;
            }

            if (var27) {
               var26 = 15597568;
            }

            int[] var29 = class377.field4167.field4280;
            int var30 = 24624 + 4 * var1 + (103 - var2) * 2048;
            if (0 != var9 && var9 != 2) {
               var29[var30] = var26;
               var29[var30 + 512 + 1] = var26;
               var29[2 + var30 + 1024] = var26;
               var29[3 + var30 + 1536] = var26;
            } else {
               var29[var30 + 1536] = var26;
               var29[1 + var30 + 1024] = var26;
               var29[2 + var30 + 512] = var26;
               var29[var30 + 3] = var26;
            }
         }
      }

      var6 = class166.field1925.method3628(var0, var1, var2);
      if (var6 != 0L) {
         var8 = class79.method1843(var6);
         class156 var20 = class124.method2243(var8);
         if (-1 != var20.field1764) {
            class397 var21 = class276.field3575[var20.field1764];
            if (var21 != null) {
               var11 = (var20.field1750 * 4 - var21.field4263) / 2;
               int var22 = (var20.field1751 * 4 - var21.field4264) / 2;
               var21.method6349(var11 + 4 * var1 + 48, var22 + 48 + (104 - var2 - var20.field1751) * 4);
            }
         }
      }

   }
}
