public class class251 {
   static byte[][][] field3114;
   static int[] regionMapArchiveIds;
   byte[] field3109;
   int[] field3111;
   int[] field3112;

   public class251(byte[] var1) {
      int var2 = var1.length;
      this.field3111 = new int[var2];
      this.field3109 = var1;
      int[] var3 = new int[33];
      this.field3112 = new int[8];
      int var4 = 0;

      for(int var5 = 0; var5 < var2; ++var5) {
         byte var6 = var1[var5];
         if (0 != var6) {
            int var7 = 1 << 32 - var6;
            int var8 = var3[var6];
            this.field3111[var5] = var8;
            int var9;
            int var10;
            int var11;
            int var12;
            if ((var8 & var7) != 0) {
               var9 = var3[var6 - 1];
            } else {
               var9 = var8 | var7;

               for(var10 = var6 - 1; var10 >= 1; --var10) {
                  var11 = var3[var10];
                  if (var11 != var8) {
                     break;
                  }

                  var12 = 1 << 32 - var10;
                  if (0 != (var11 & var12)) {
                     var3[var10] = var3[var10 - 1];
                     break;
                  }

                  var3[var10] = var11 | var12;
               }
            }

            var3[var6] = var9;

            for(var10 = 1 + var6; var10 <= 32; ++var10) {
               if (var3[var10] == var8) {
                  var3[var10] = var9;
               }
            }

            var10 = 0;

            for(var11 = 0; var11 < var6; ++var11) {
               var12 = Integer.MIN_VALUE >>> var11;
               if ((var8 & var12) != 0) {
                  if (this.field3112[var10] == 0) {
                     this.field3112[var10] = var4;
                  }

                  var10 = this.field3112[var10];
               } else {
                  ++var10;
               }

               if (var10 >= this.field3112.length) {
                  int[] var13 = new int[this.field3112.length * 2];

                  for(int var14 = 0; var14 < this.field3112.length; ++var14) {
                     var13[var14] = this.field3112[var14];
                  }

                  this.field3112 = var13;
               }

               var12 >>>= 1;
            }

            this.field3112[var10] = ~var5;
            if (var10 >= var4) {
               var4 = 1 + var10;
            }
         }
      }

   }

   public static class290 enumeratedValueOf(class290[] var0, int var1) {
      class290[] var3 = var0;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         class290 var5 = var3[var4];
         if (var1 == var5.method4619()) {
            return var5;
         }
      }

      return null;
   }

   int method4289(byte[] var1, int var2, int var3, byte[] var4, int var5) {
      int var7 = 0;
      int var8 = var5 << 3;

      for(var3 += var2; var2 < var3; ++var2) {
         int var9 = var1[var2] & 255;
         int var10 = this.field3111[var9];
         byte var11 = this.field3109[var9];
         if (var11 == 0) {
            throw new RuntimeException("" + var9);
         }

         int var12 = var8 >> 3;
         int var13 = var8 & 7;
         var7 &= -var13 >> 31;
         int var14 = (var11 + var13 - 1 >> 3) + var12;
         var13 += 24;
         var4[var12] = (byte)(var7 |= var10 >>> var13);
         if (var12 < var14) {
            ++var12;
            var13 -= 8;
            var4[var12] = (byte)(var7 = var10 >>> var13);
            if (var12 < var14) {
               ++var12;
               var13 -= 8;
               var4[var12] = (byte)(var7 = var10 >>> var13);
               if (var12 < var14) {
                  ++var12;
                  var13 -= 8;
                  var4[var12] = (byte)(var7 = var10 >>> var13);
                  if (var12 < var14) {
                     ++var12;
                     var13 -= 8;
                     var4[var12] = (byte)(var7 = var10 << -var13);
                  }
               }
            }
         }

         var8 += var11;
      }

      return (var8 + 7 >> 3) - var5;
   }

   int method4288(byte[] var1, int var2, byte[] var3, int var4, int var5) {
      if (0 == var5) {
         return 0;
      } else {
         int var7 = 0;
         var5 += var4;
         int var8 = var2;

         while(true) {
            byte var9 = var1[var8];
            if (var9 < 0) {
               var7 = this.field3112[var7];
            } else {
               ++var7;
            }

            int var10;
            if ((var10 = this.field3112[var7]) < 0) {
               var3[var4++] = (byte)(~var10);
               if (var4 >= var5) {
                  break;
               }

               var7 = 0;
            }

            if ((var9 & 64) != 0) {
               var7 = this.field3112[var7];
            } else {
               ++var7;
            }

            if ((var10 = this.field3112[var7]) < 0) {
               var3[var4++] = (byte)(~var10);
               if (var4 >= var5) {
                  break;
               }

               var7 = 0;
            }

            if (0 != (var9 & 32)) {
               var7 = this.field3112[var7];
            } else {
               ++var7;
            }

            if ((var10 = this.field3112[var7]) < 0) {
               var3[var4++] = (byte)(~var10);
               if (var4 >= var5) {
                  break;
               }

               var7 = 0;
            }

            if (0 != (var9 & 16)) {
               var7 = this.field3112[var7];
            } else {
               ++var7;
            }

            if ((var10 = this.field3112[var7]) < 0) {
               var3[var4++] = (byte)(~var10);
               if (var4 >= var5) {
                  break;
               }

               var7 = 0;
            }

            if ((var9 & 8) != 0) {
               var7 = this.field3112[var7];
            } else {
               ++var7;
            }

            if ((var10 = this.field3112[var7]) < 0) {
               var3[var4++] = (byte)(~var10);
               if (var4 >= var5) {
                  break;
               }

               var7 = 0;
            }

            if ((var9 & 4) != 0) {
               var7 = this.field3112[var7];
            } else {
               ++var7;
            }

            if ((var10 = this.field3112[var7]) < 0) {
               var3[var4++] = (byte)(~var10);
               if (var4 >= var5) {
                  break;
               }

               var7 = 0;
            }

            if ((var9 & 2) != 0) {
               var7 = this.field3112[var7];
            } else {
               ++var7;
            }

            if ((var10 = this.field3112[var7]) < 0) {
               var3[var4++] = (byte)(~var10);
               if (var4 >= var5) {
                  break;
               }

               var7 = 0;
            }

            if ((var9 & 1) != 0) {
               var7 = this.field3112[var7];
            } else {
               ++var7;
            }

            if ((var10 = this.field3112[var7]) < 0) {
               var3[var4++] = (byte)(~var10);
               if (var4 >= var5) {
                  break;
               }

               var7 = 0;
            }

            ++var8;
         }

         return 1 + var8 - var2;
      }
   }

   public static boolean method4294(int var0) {
      if (class101.field1282[var0]) {
         return true;
      } else if (!Interface.field2951.method4416(var0)) {
         return false;
      } else {
         int var2 = Interface.field2951.method4438(var0);
         if (var2 == 0) {
            class101.field1282[var0] = true;
            return true;
         } else {
            if (Interface.components[var0] == null) {
               Interface.components[var0] = new Interface[var2];
            }

            for(int var3 = 0; var3 < var2; ++var3) {
               if (null == Interface.components[var0][var3]) {
                  byte[] var4 = Interface.field2951.method4412(var0, var3);
                  if (var4 != null) {
                     Interface.components[var0][var3] = new Interface();
                     Interface.components[var0][var3].id = var3 + (var0 << 16);
                     if (var4[0] == -1) {
                        Interface.components[var0][var3].method4219(new Buffer(var4));
                     } else {
                        Interface.components[var0][var3].method4218(new Buffer(var4));
                     }
                  }
               }
            }

            class101.field1282[var0] = true;
            return true;
         }
      }
   }

   static final void method4293() {
      Scene.field2307 = false;
      client.isLowDetailMode = false;
   }
}
