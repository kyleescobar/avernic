public class Rasterizer3D extends class394 {
   public static boolean field2250 = true;
   public static class213 field2269;
   public static int field2262 = 512;
   public static int[] sineTable = new int[2048];
   public static int[] field2268 = new int[65536];
   public static int[] cosineTable = new int[2048];
   static boolean field2249 = false;
   static boolean field2251 = false;
   static boolean field2252 = false;
   static int field2247;
   static int field2248;
   static int field2258 = 0;
   static int field2259;
   static int field2260;
   static int field2261;
   static int field2263;
   static int field2264;
   static int field2265;
   static int[] field2254 = new int[512];
   static int[] field2267 = new int[1024];
   static int[] field2271 = new int[2048];

   static {
      int var0;
      for(var0 = 1; var0 < 512; ++var0) {
         field2254[var0] = '\u8000' / var0;
      }

      for(var0 = 1; var0 < 2048; ++var0) {
         field2271[var0] = 65536 / var0;
      }

      for(var0 = 0; var0 < 2048; ++var0) {
         sineTable[var0] = (int)(65536.0D * Math.sin((double)var0 * 0.0030679615D));
         cosineTable[var0] = (int)(65536.0D * Math.cos((double)var0 * 0.0030679615D));
      }

   }

   public static final void method3415() {
      method3424(class394.field4249, class394.field4247, class394.field4248, class394.field4244);
   }

   static final void method3424(int var0, int var1, int var2, int var3) {
      field2261 = var2 - var0;
      field2247 = var3 - var1;
      method3417();
      if (field2267.length < field2247) {
         field2267 = new int[class27.method470(field2247)];
      }

      int var4 = var1 * class394.field4245 + var0;

      for(int var5 = 0; var5 < field2247; ++var5) {
         field2267[var5] = var4;
         var4 += class394.field4245;
      }

   }

   public static final void method3417() {
      field2259 = field2261 / 2;
      field2260 = field2247 / 2;
      field2263 = -field2259;
      field2264 = field2261 - field2259;
      field2265 = -field2260;
      field2248 = field2247 - field2260;
   }

   public static final void method3418(int var0, int var1) {
      int var2 = field2267[0];
      int var3 = var2 / class394.field4245;
      int var4 = var2 - var3 * class394.field4245;
      field2259 = var0 - var4;
      field2260 = var1 - var3;
      field2263 = -field2259;
      field2264 = field2261 - field2259;
      field2265 = -field2260;
      field2248 = field2247 - field2260;
   }

   public static final void method3419(class213 var0) {
      field2269 = var0;
   }

   public static final void method3420(double var0) {
      method3445(var0, 0, 512);
   }

   static final void method3445(double var0, int var2, int var3) {
      int var4 = var2 * 128;

      for(int var5 = var2; var5 < var3; ++var5) {
         double var6 = (double)(var5 >> 3) / 64.0D + 0.0078125D;
         double var8 = (double)(var5 & 7) / 8.0D + 0.0625D;

         for(int var10 = 0; var10 < 128; ++var10) {
            double var11 = (double)var10 / 128.0D;
            double var13 = var11;
            double var15 = var11;
            double var17 = var11;
            if (var8 != 0.0D) {
               double var19;
               if (var11 < 0.5D) {
                  var19 = var11 * (1.0D + var8);
               } else {
                  var19 = var11 + var8 - var11 * var8;
               }

               double var21 = 2.0D * var11 - var19;
               double var23 = var6 + 0.3333333333333333D;
               if (var23 > 1.0D) {
                  --var23;
               }

               double var27 = var6 - 0.3333333333333333D;
               if (var27 < 0.0D) {
                  ++var27;
               }

               if (6.0D * var23 < 1.0D) {
                  var13 = var21 + (var19 - var21) * 6.0D * var23;
               } else if (2.0D * var23 < 1.0D) {
                  var13 = var19;
               } else if (3.0D * var23 < 2.0D) {
                  var13 = var21 + (var19 - var21) * (0.6666666666666666D - var23) * 6.0D;
               } else {
                  var13 = var21;
               }

               if (6.0D * var6 < 1.0D) {
                  var15 = var21 + (var19 - var21) * 6.0D * var6;
               } else if (2.0D * var6 < 1.0D) {
                  var15 = var19;
               } else if (3.0D * var6 < 2.0D) {
                  var15 = var21 + (var19 - var21) * (0.6666666666666666D - var6) * 6.0D;
               } else {
                  var15 = var21;
               }

               if (6.0D * var27 < 1.0D) {
                  var17 = var21 + (var19 - var21) * 6.0D * var27;
               } else if (2.0D * var27 < 1.0D) {
                  var17 = var19;
               } else if (3.0D * var27 < 2.0D) {
                  var17 = var21 + (var19 - var21) * (0.6666666666666666D - var27) * 6.0D;
               } else {
                  var17 = var21;
               }
            }

            int var30 = (int)(var13 * 256.0D);
            int var20 = (int)(var15 * 256.0D);
            int var29 = (int)(var17 * 256.0D);
            int var22 = (var30 << 16) + (var20 << 8) + var29;
            var22 = method3422(var22, var0);
            if (var22 == 0) {
               var22 = 1;
            }

            field2268[var4++] = var22;
         }
      }

   }

   static int method3422(int var0, double var1) {
      double var3 = (double)(var0 >> 16) / 256.0D;
      double var5 = (double)(var0 >> 8 & 255) / 256.0D;
      double var7 = (double)(var0 & 255) / 256.0D;
      var3 = Math.pow(var3, var1);
      var5 = Math.pow(var5, var1);
      var7 = Math.pow(var7, var1);
      int var9 = (int)(var3 * 256.0D);
      int var10 = (int)(var5 * 256.0D);
      int var11 = (int)(var7 * 256.0D);
      return (var9 << 16) + (var10 << 8) + var11;
   }

   public static void method3423(int var0, int var1, int var2) {
      field2252 = var0 < 0 || var0 > field2261 || var1 < 0 || var1 > field2261 || var2 < 0 || var2 > field2261;
   }

   static final void method3428(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = var4 - var3;
      int var10 = var1 - var0;
      int var11 = var5 - var3;
      int var12 = var2 - var0;
      int var13 = var7 - var6;
      int var14 = var8 - var6;
      int var15;
      if (var2 != var1) {
         var15 = (var5 - var4 << 14) / (var2 - var1);
      } else {
         var15 = 0;
      }

      int var16;
      if (var1 != var0) {
         var16 = (var9 << 14) / var10;
      } else {
         var16 = 0;
      }

      int var17;
      if (var2 != var0) {
         var17 = (var11 << 14) / var12;
      } else {
         var17 = 0;
      }

      int var18 = var9 * var12 - var11 * var10;
      if (var18 != 0) {
         int var19 = (var13 * var12 - var14 * var10 << 8) / var18;
         int var20 = (var14 * var9 - var13 * var11 << 8) / var18;
         if (var0 <= var1 && var0 <= var2) {
            if (var0 < field2247) {
               if (var1 > field2247) {
                  var1 = field2247;
               }

               if (var2 > field2247) {
                  var2 = field2247;
               }

               var6 = (var6 << 8) - var19 * var3 + var19;
               if (var1 < var2) {
                  var5 = var3 <<= 14;
                  if (var0 < 0) {
                     var5 -= var17 * var0;
                     var3 -= var16 * var0;
                     var6 -= var20 * var0;
                     var0 = 0;
                  }

                  var4 <<= 14;
                  if (var1 < 0) {
                     var4 -= var15 * var1;
                     var1 = 0;
                  }

                  if ((var0 == var1 || var17 >= var16) && (var0 != var1 || var17 <= var15)) {
                     var2 -= var1;
                     var1 -= var0;
                     var0 = field2267[var0];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              method3486(class394.field4250, var0, 0, 0, var4 >> 14, var5 >> 14, var6, var19);
                              var5 += var17;
                              var4 += var15;
                              var6 += var20;
                              var0 += class394.field4245;
                           }
                        }

                        method3486(class394.field4250, var0, 0, 0, var3 >> 14, var5 >> 14, var6, var19);
                        var5 += var17;
                        var3 += var16;
                        var6 += var20;
                        var0 += class394.field4245;
                     }
                  } else {
                     var2 -= var1;
                     var1 -= var0;
                     var0 = field2267[var0];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              method3486(class394.field4250, var0, 0, 0, var5 >> 14, var4 >> 14, var6, var19);
                              var5 += var17;
                              var4 += var15;
                              var6 += var20;
                              var0 += class394.field4245;
                           }
                        }

                        method3486(class394.field4250, var0, 0, 0, var5 >> 14, var3 >> 14, var6, var19);
                        var5 += var17;
                        var3 += var16;
                        var6 += var20;
                        var0 += class394.field4245;
                     }
                  }
               } else {
                  var4 = var3 <<= 14;
                  if (var0 < 0) {
                     var4 -= var17 * var0;
                     var3 -= var16 * var0;
                     var6 -= var20 * var0;
                     var0 = 0;
                  }

                  var5 <<= 14;
                  if (var2 < 0) {
                     var5 -= var15 * var2;
                     var2 = 0;
                  }

                  if (var0 != var2 && var17 < var16 || var0 == var2 && var15 > var16) {
                     var1 -= var2;
                     var2 -= var0;
                     var0 = field2267[var0];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              method3486(class394.field4250, var0, 0, 0, var5 >> 14, var3 >> 14, var6, var19);
                              var5 += var15;
                              var3 += var16;
                              var6 += var20;
                              var0 += class394.field4245;
                           }
                        }

                        method3486(class394.field4250, var0, 0, 0, var4 >> 14, var3 >> 14, var6, var19);
                        var4 += var17;
                        var3 += var16;
                        var6 += var20;
                        var0 += class394.field4245;
                     }
                  } else {
                     var1 -= var2;
                     var2 -= var0;
                     var0 = field2267[var0];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              method3486(class394.field4250, var0, 0, 0, var3 >> 14, var5 >> 14, var6, var19);
                              var5 += var15;
                              var3 += var16;
                              var6 += var20;
                              var0 += class394.field4245;
                           }
                        }

                        method3486(class394.field4250, var0, 0, 0, var3 >> 14, var4 >> 14, var6, var19);
                        var4 += var17;
                        var3 += var16;
                        var6 += var20;
                        var0 += class394.field4245;
                     }
                  }
               }
            }
         } else if (var1 <= var2) {
            if (var1 < field2247) {
               if (var2 > field2247) {
                  var2 = field2247;
               }

               if (var0 > field2247) {
                  var0 = field2247;
               }

               var7 = (var7 << 8) - var19 * var4 + var19;
               if (var2 < var0) {
                  var3 = var4 <<= 14;
                  if (var1 < 0) {
                     var3 -= var16 * var1;
                     var4 -= var15 * var1;
                     var7 -= var20 * var1;
                     var1 = 0;
                  }

                  var5 <<= 14;
                  if (var2 < 0) {
                     var5 -= var17 * var2;
                     var2 = 0;
                  }

                  if ((var1 == var2 || var16 >= var15) && (var1 != var2 || var16 <= var17)) {
                     var0 -= var2;
                     var2 -= var1;
                     var1 = field2267[var1];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var0;
                              if (var0 < 0) {
                                 return;
                              }

                              method3486(class394.field4250, var1, 0, 0, var5 >> 14, var3 >> 14, var7, var19);
                              var3 += var16;
                              var5 += var17;
                              var7 += var20;
                              var1 += class394.field4245;
                           }
                        }

                        method3486(class394.field4250, var1, 0, 0, var4 >> 14, var3 >> 14, var7, var19);
                        var3 += var16;
                        var4 += var15;
                        var7 += var20;
                        var1 += class394.field4245;
                     }
                  } else {
                     var0 -= var2;
                     var2 -= var1;
                     var1 = field2267[var1];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var0;
                              if (var0 < 0) {
                                 return;
                              }

                              method3486(class394.field4250, var1, 0, 0, var3 >> 14, var5 >> 14, var7, var19);
                              var3 += var16;
                              var5 += var17;
                              var7 += var20;
                              var1 += class394.field4245;
                           }
                        }

                        method3486(class394.field4250, var1, 0, 0, var3 >> 14, var4 >> 14, var7, var19);
                        var3 += var16;
                        var4 += var15;
                        var7 += var20;
                        var1 += class394.field4245;
                     }
                  }
               } else {
                  var5 = var4 <<= 14;
                  if (var1 < 0) {
                     var5 -= var16 * var1;
                     var4 -= var15 * var1;
                     var7 -= var20 * var1;
                     var1 = 0;
                  }

                  var3 <<= 14;
                  if (var0 < 0) {
                     var3 -= var17 * var0;
                     var0 = 0;
                  }

                  if (var16 < var15) {
                     var2 -= var0;
                     var0 -= var1;
                     var1 = field2267[var1];

                     while(true) {
                        --var0;
                        if (var0 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              method3486(class394.field4250, var1, 0, 0, var3 >> 14, var4 >> 14, var7, var19);
                              var3 += var17;
                              var4 += var15;
                              var7 += var20;
                              var1 += class394.field4245;
                           }
                        }

                        method3486(class394.field4250, var1, 0, 0, var5 >> 14, var4 >> 14, var7, var19);
                        var5 += var16;
                        var4 += var15;
                        var7 += var20;
                        var1 += class394.field4245;
                     }
                  } else {
                     var2 -= var0;
                     var0 -= var1;
                     var1 = field2267[var1];

                     while(true) {
                        --var0;
                        if (var0 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              method3486(class394.field4250, var1, 0, 0, var4 >> 14, var3 >> 14, var7, var19);
                              var3 += var17;
                              var4 += var15;
                              var7 += var20;
                              var1 += class394.field4245;
                           }
                        }

                        method3486(class394.field4250, var1, 0, 0, var4 >> 14, var5 >> 14, var7, var19);
                        var5 += var16;
                        var4 += var15;
                        var7 += var20;
                        var1 += class394.field4245;
                     }
                  }
               }
            }
         } else if (var2 < field2247) {
            if (var0 > field2247) {
               var0 = field2247;
            }

            if (var1 > field2247) {
               var1 = field2247;
            }

            var8 = (var8 << 8) - var19 * var5 + var19;
            if (var0 < var1) {
               var4 = var5 <<= 14;
               if (var2 < 0) {
                  var4 -= var15 * var2;
                  var5 -= var17 * var2;
                  var8 -= var20 * var2;
                  var2 = 0;
               }

               var3 <<= 14;
               if (var0 < 0) {
                  var3 -= var16 * var0;
                  var0 = 0;
               }

               if (var15 < var17) {
                  var1 -= var0;
                  var0 -= var2;
                  var2 = field2267[var2];

                  while(true) {
                     --var0;
                     if (var0 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           method3486(class394.field4250, var2, 0, 0, var4 >> 14, var3 >> 14, var8, var19);
                           var4 += var15;
                           var3 += var16;
                           var8 += var20;
                           var2 += class394.field4245;
                        }
                     }

                     method3486(class394.field4250, var2, 0, 0, var4 >> 14, var5 >> 14, var8, var19);
                     var4 += var15;
                     var5 += var17;
                     var8 += var20;
                     var2 += class394.field4245;
                  }
               } else {
                  var1 -= var0;
                  var0 -= var2;
                  var2 = field2267[var2];

                  while(true) {
                     --var0;
                     if (var0 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           method3486(class394.field4250, var2, 0, 0, var3 >> 14, var4 >> 14, var8, var19);
                           var4 += var15;
                           var3 += var16;
                           var8 += var20;
                           var2 += class394.field4245;
                        }
                     }

                     method3486(class394.field4250, var2, 0, 0, var5 >> 14, var4 >> 14, var8, var19);
                     var4 += var15;
                     var5 += var17;
                     var8 += var20;
                     var2 += class394.field4245;
                  }
               }
            } else {
               var3 = var5 <<= 14;
               if (var2 < 0) {
                  var3 -= var15 * var2;
                  var5 -= var17 * var2;
                  var8 -= var20 * var2;
                  var2 = 0;
               }

               var4 <<= 14;
               if (var1 < 0) {
                  var4 -= var16 * var1;
                  var1 = 0;
               }

               if (var15 < var17) {
                  var0 -= var1;
                  var1 -= var2;
                  var2 = field2267[var2];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var0;
                           if (var0 < 0) {
                              return;
                           }

                           method3486(class394.field4250, var2, 0, 0, var4 >> 14, var5 >> 14, var8, var19);
                           var4 += var16;
                           var5 += var17;
                           var8 += var20;
                           var2 += class394.field4245;
                        }
                     }

                     method3486(class394.field4250, var2, 0, 0, var3 >> 14, var5 >> 14, var8, var19);
                     var3 += var15;
                     var5 += var17;
                     var8 += var20;
                     var2 += class394.field4245;
                  }
               } else {
                  var0 -= var1;
                  var1 -= var2;
                  var2 = field2267[var2];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var0;
                           if (var0 < 0) {
                              return;
                           }

                           method3486(class394.field4250, var2, 0, 0, var5 >> 14, var4 >> 14, var8, var19);
                           var4 += var16;
                           var5 += var17;
                           var8 += var20;
                           var2 += class394.field4245;
                        }
                     }

                     method3486(class394.field4250, var2, 0, 0, var5 >> 14, var3 >> 14, var8, var19);
                     var3 += var15;
                     var5 += var17;
                     var8 += var20;
                     var2 += class394.field4245;
                  }
               }
            }
         }
      }
   }

   static final void method3486(int[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (field2252) {
         if (var5 > field2261) {
            var5 = field2261;
         }

         if (var4 < 0) {
            var4 = 0;
         }
      }

      if (var4 < var5) {
         var1 += var4;
         var6 += var7 * var4;
         int var8;
         int var9;
         int var10;
         if (field2250) {
            var3 = var5 - var4 >> 2;
            var7 <<= 2;
            if (field2258 == 0) {
               if (var3 > 0) {
                  do {
                     var2 = field2268[var6 >> 8];
                     var6 += var7;
                     var0[var1++] = var2;
                     var0[var1++] = var2;
                     var0[var1++] = var2;
                     var0[var1++] = var2;
                     --var3;
                  } while(var3 > 0);
               }

               var3 = var5 - var4 & 3;
               if (var3 > 0) {
                  var2 = field2268[var6 >> 8];

                  do {
                     var0[var1++] = var2;
                     --var3;
                  } while(var3 > 0);
               }
            } else {
               var8 = field2258;
               var9 = 256 - field2258;
               if (var3 > 0) {
                  do {
                     var2 = field2268[var6 >> 8];
                     var6 += var7;
                     var2 = ((var2 & 16711935) * var9 >> 8 & 16711935) + ((var2 & '\uff00') * var9 >> 8 & '\uff00');
                     var10 = var0[var1];
                     var0[var1++] = var2 + ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & '\uff00') * var8 >> 8 & '\uff00');
                     var10 = var0[var1];
                     var0[var1++] = var2 + ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & '\uff00') * var8 >> 8 & '\uff00');
                     var10 = var0[var1];
                     var0[var1++] = var2 + ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & '\uff00') * var8 >> 8 & '\uff00');
                     var10 = var0[var1];
                     var0[var1++] = var2 + ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & '\uff00') * var8 >> 8 & '\uff00');
                     --var3;
                  } while(var3 > 0);
               }

               var3 = var5 - var4 & 3;
               if (var3 > 0) {
                  var2 = field2268[var6 >> 8];
                  var2 = ((var2 & 16711935) * var9 >> 8 & 16711935) + ((var2 & '\uff00') * var9 >> 8 & '\uff00');

                  do {
                     var10 = var0[var1];
                     var0[var1++] = var2 + ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & '\uff00') * var8 >> 8 & '\uff00');
                     --var3;
                  } while(var3 > 0);
               }
            }

         } else {
            var3 = var5 - var4;
            if (field2258 == 0) {
               do {
                  var0[var1++] = field2268[var6 >> 8];
                  var6 += var7;
                  --var3;
               } while(var3 > 0);
            } else {
               var8 = field2258;
               var9 = 256 - field2258;

               do {
                  var2 = field2268[var6 >> 8];
                  var6 += var7;
                  var2 = ((var2 & 16711935) * var9 >> 8 & 16711935) + ((var2 & '\uff00') * var9 >> 8 & '\uff00');
                  var10 = var0[var1];
                  var0[var1++] = var2 + ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & '\uff00') * var8 >> 8 & '\uff00');
                  --var3;
               } while(var3 > 0);
            }

         }
      }
   }

   public static final void method3426(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = 0;
      if (var1 != var0) {
         var7 = (var4 - var3 << 14) / (var1 - var0);
      }

      int var8 = 0;
      if (var2 != var1) {
         var8 = (var5 - var4 << 14) / (var2 - var1);
      }

      int var9 = 0;
      if (var2 != var0) {
         var9 = (var3 - var5 << 14) / (var0 - var2);
      }

      if (var0 <= var1 && var0 <= var2) {
         if (var0 < field2247) {
            if (var1 > field2247) {
               var1 = field2247;
            }

            if (var2 > field2247) {
               var2 = field2247;
            }

            if (var1 < var2) {
               var5 = var3 <<= 14;
               if (var0 < 0) {
                  var5 -= var9 * var0;
                  var3 -= var7 * var0;
                  var0 = 0;
               }

               var4 <<= 14;
               if (var1 < 0) {
                  var4 -= var8 * var1;
                  var1 = 0;
               }

               if (var0 != var1 && var9 < var7 || var0 == var1 && var9 > var8) {
                  var2 -= var1;
                  var1 -= var0;
                  var0 = field2267[var0];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           method3427(class394.field4250, var0, var6, 0, var5 >> 14, var4 >> 14);
                           var5 += var9;
                           var4 += var8;
                           var0 += class394.field4245;
                        }
                     }

                     method3427(class394.field4250, var0, var6, 0, var5 >> 14, var3 >> 14);
                     var5 += var9;
                     var3 += var7;
                     var0 += class394.field4245;
                  }
               } else {
                  var2 -= var1;
                  var1 -= var0;
                  var0 = field2267[var0];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           method3427(class394.field4250, var0, var6, 0, var4 >> 14, var5 >> 14);
                           var5 += var9;
                           var4 += var8;
                           var0 += class394.field4245;
                        }
                     }

                     method3427(class394.field4250, var0, var6, 0, var3 >> 14, var5 >> 14);
                     var5 += var9;
                     var3 += var7;
                     var0 += class394.field4245;
                  }
               }
            } else {
               var4 = var3 <<= 14;
               if (var0 < 0) {
                  var4 -= var9 * var0;
                  var3 -= var7 * var0;
                  var0 = 0;
               }

               var5 <<= 14;
               if (var2 < 0) {
                  var5 -= var8 * var2;
                  var2 = 0;
               }

               if (var0 != var2 && var9 < var7 || var0 == var2 && var8 > var7) {
                  var1 -= var2;
                  var2 -= var0;
                  var0 = field2267[var0];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           method3427(class394.field4250, var0, var6, 0, var5 >> 14, var3 >> 14);
                           var5 += var8;
                           var3 += var7;
                           var0 += class394.field4245;
                        }
                     }

                     method3427(class394.field4250, var0, var6, 0, var4 >> 14, var3 >> 14);
                     var4 += var9;
                     var3 += var7;
                     var0 += class394.field4245;
                  }
               } else {
                  var1 -= var2;
                  var2 -= var0;
                  var0 = field2267[var0];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           method3427(class394.field4250, var0, var6, 0, var3 >> 14, var5 >> 14);
                           var5 += var8;
                           var3 += var7;
                           var0 += class394.field4245;
                        }
                     }

                     method3427(class394.field4250, var0, var6, 0, var3 >> 14, var4 >> 14);
                     var4 += var9;
                     var3 += var7;
                     var0 += class394.field4245;
                  }
               }
            }
         }
      } else if (var1 <= var2) {
         if (var1 < field2247) {
            if (var2 > field2247) {
               var2 = field2247;
            }

            if (var0 > field2247) {
               var0 = field2247;
            }

            if (var2 < var0) {
               var3 = var4 <<= 14;
               if (var1 < 0) {
                  var3 -= var7 * var1;
                  var4 -= var8 * var1;
                  var1 = 0;
               }

               var5 <<= 14;
               if (var2 < 0) {
                  var5 -= var9 * var2;
                  var2 = 0;
               }

               if (var1 != var2 && var7 < var8 || var1 == var2 && var7 > var9) {
                  var0 -= var2;
                  var2 -= var1;
                  var1 = field2267[var1];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var0;
                           if (var0 < 0) {
                              return;
                           }

                           method3427(class394.field4250, var1, var6, 0, var3 >> 14, var5 >> 14);
                           var3 += var7;
                           var5 += var9;
                           var1 += class394.field4245;
                        }
                     }

                     method3427(class394.field4250, var1, var6, 0, var3 >> 14, var4 >> 14);
                     var3 += var7;
                     var4 += var8;
                     var1 += class394.field4245;
                  }
               } else {
                  var0 -= var2;
                  var2 -= var1;
                  var1 = field2267[var1];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var0;
                           if (var0 < 0) {
                              return;
                           }

                           method3427(class394.field4250, var1, var6, 0, var5 >> 14, var3 >> 14);
                           var3 += var7;
                           var5 += var9;
                           var1 += class394.field4245;
                        }
                     }

                     method3427(class394.field4250, var1, var6, 0, var4 >> 14, var3 >> 14);
                     var3 += var7;
                     var4 += var8;
                     var1 += class394.field4245;
                  }
               }
            } else {
               var5 = var4 <<= 14;
               if (var1 < 0) {
                  var5 -= var7 * var1;
                  var4 -= var8 * var1;
                  var1 = 0;
               }

               var3 <<= 14;
               if (var0 < 0) {
                  var3 -= var9 * var0;
                  var0 = 0;
               }

               if (var7 < var8) {
                  var2 -= var0;
                  var0 -= var1;
                  var1 = field2267[var1];

                  while(true) {
                     --var0;
                     if (var0 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           method3427(class394.field4250, var1, var6, 0, var3 >> 14, var4 >> 14);
                           var3 += var9;
                           var4 += var8;
                           var1 += class394.field4245;
                        }
                     }

                     method3427(class394.field4250, var1, var6, 0, var5 >> 14, var4 >> 14);
                     var5 += var7;
                     var4 += var8;
                     var1 += class394.field4245;
                  }
               } else {
                  var2 -= var0;
                  var0 -= var1;
                  var1 = field2267[var1];

                  while(true) {
                     --var0;
                     if (var0 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           method3427(class394.field4250, var1, var6, 0, var4 >> 14, var3 >> 14);
                           var3 += var9;
                           var4 += var8;
                           var1 += class394.field4245;
                        }
                     }

                     method3427(class394.field4250, var1, var6, 0, var4 >> 14, var5 >> 14);
                     var5 += var7;
                     var4 += var8;
                     var1 += class394.field4245;
                  }
               }
            }
         }
      } else if (var2 < field2247) {
         if (var0 > field2247) {
            var0 = field2247;
         }

         if (var1 > field2247) {
            var1 = field2247;
         }

         if (var0 < var1) {
            var4 = var5 <<= 14;
            if (var2 < 0) {
               var4 -= var8 * var2;
               var5 -= var9 * var2;
               var2 = 0;
            }

            var3 <<= 14;
            if (var0 < 0) {
               var3 -= var7 * var0;
               var0 = 0;
            }

            if (var8 < var9) {
               var1 -= var0;
               var0 -= var2;
               var2 = field2267[var2];

               while(true) {
                  --var0;
                  if (var0 < 0) {
                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           return;
                        }

                        method3427(class394.field4250, var2, var6, 0, var4 >> 14, var3 >> 14);
                        var4 += var8;
                        var3 += var7;
                        var2 += class394.field4245;
                     }
                  }

                  method3427(class394.field4250, var2, var6, 0, var4 >> 14, var5 >> 14);
                  var4 += var8;
                  var5 += var9;
                  var2 += class394.field4245;
               }
            } else {
               var1 -= var0;
               var0 -= var2;
               var2 = field2267[var2];

               while(true) {
                  --var0;
                  if (var0 < 0) {
                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           return;
                        }

                        method3427(class394.field4250, var2, var6, 0, var3 >> 14, var4 >> 14);
                        var4 += var8;
                        var3 += var7;
                        var2 += class394.field4245;
                     }
                  }

                  method3427(class394.field4250, var2, var6, 0, var5 >> 14, var4 >> 14);
                  var4 += var8;
                  var5 += var9;
                  var2 += class394.field4245;
               }
            }
         } else {
            var3 = var5 <<= 14;
            if (var2 < 0) {
               var3 -= var8 * var2;
               var5 -= var9 * var2;
               var2 = 0;
            }

            var4 <<= 14;
            if (var1 < 0) {
               var4 -= var7 * var1;
               var1 = 0;
            }

            if (var8 < var9) {
               var0 -= var1;
               var1 -= var2;
               var2 = field2267[var2];

               while(true) {
                  --var1;
                  if (var1 < 0) {
                     while(true) {
                        --var0;
                        if (var0 < 0) {
                           return;
                        }

                        method3427(class394.field4250, var2, var6, 0, var4 >> 14, var5 >> 14);
                        var4 += var7;
                        var5 += var9;
                        var2 += class394.field4245;
                     }
                  }

                  method3427(class394.field4250, var2, var6, 0, var3 >> 14, var5 >> 14);
                  var3 += var8;
                  var5 += var9;
                  var2 += class394.field4245;
               }
            } else {
               var0 -= var1;
               var1 -= var2;
               var2 = field2267[var2];

               while(true) {
                  --var1;
                  if (var1 < 0) {
                     while(true) {
                        --var0;
                        if (var0 < 0) {
                           return;
                        }

                        method3427(class394.field4250, var2, var6, 0, var5 >> 14, var4 >> 14);
                        var4 += var7;
                        var5 += var9;
                        var2 += class394.field4245;
                     }
                  }

                  method3427(class394.field4250, var2, var6, 0, var5 >> 14, var3 >> 14);
                  var3 += var8;
                  var5 += var9;
                  var2 += class394.field4245;
               }
            }
         }
      }
   }

   static final void method3427(int[] var0, int var1, int var2, int var3, int var4, int var5) {
      if (field2252) {
         if (var5 > field2261) {
            var5 = field2261;
         }

         if (var4 < 0) {
            var4 = 0;
         }
      }

      if (var4 < var5) {
         var1 += var4;
         var3 = var5 - var4 >> 2;
         if (field2258 != 0) {
            if (field2258 == 254) {
               while(true) {
                  --var3;
                  if (var3 < 0) {
                     var3 = var5 - var4 & 3;

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           return;
                        }

                        var0[var1++] = var0[var1];
                     }
                  }

                  var0[var1++] = var0[var1];
                  var0[var1++] = var0[var1];
                  var0[var1++] = var0[var1];
                  var0[var1++] = var0[var1];
               }
            } else {
               int var6 = field2258;
               int var7 = 256 - field2258;
               var2 = ((var2 & 16711935) * var7 >> 8 & 16711935) + ((var2 & '\uff00') * var7 >> 8 & '\uff00');

               while(true) {
                  --var3;
                  int var8;
                  if (var3 < 0) {
                     var3 = var5 - var4 & 3;

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           return;
                        }

                        var8 = var0[var1];
                        var0[var1++] = var2 + ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & '\uff00') * var6 >> 8 & '\uff00');
                     }
                  }

                  var8 = var0[var1];
                  var0[var1++] = var2 + ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & '\uff00') * var6 >> 8 & '\uff00');
                  var8 = var0[var1];
                  var0[var1++] = var2 + ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & '\uff00') * var6 >> 8 & '\uff00');
                  var8 = var0[var1];
                  var0[var1++] = var2 + ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & '\uff00') * var6 >> 8 & '\uff00');
                  var8 = var0[var1];
                  var0[var1++] = var2 + ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & '\uff00') * var6 >> 8 & '\uff00');
               }
            }
         } else {
            while(true) {
               --var3;
               if (var3 < 0) {
                  var3 = var5 - var4 & 3;

                  while(true) {
                     --var3;
                     if (var3 < 0) {
                        return;
                     }

                     var0[var1++] = var2;
                  }
               }

               var0[var1++] = var2;
               var0[var1++] = var2;
               var0[var1++] = var2;
               var0[var1++] = var2;
            }
         }
      }
   }

   static final void method3462(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18) {
      int[] var19 = field2269.method3844(var18);
      int var20;
      if (var19 == null) {
         var20 = field2269.method3835(var18);
         method3428(var0, var1, var2, var3, var4, var5, method3432(var20, var6), method3432(var20, var7), method3432(var20, var8));
      } else {
         field2251 = field2269.method3834(var18);
         field2249 = field2269.method3841(var18);
         var20 = var4 - var3;
         int var21 = var1 - var0;
         int var22 = var5 - var3;
         int var23 = var2 - var0;
         int var24 = var7 - var6;
         int var25 = var8 - var6;
         int var26 = 0;
         if (var1 != var0) {
            var26 = (var4 - var3 << 14) / (var1 - var0);
         }

         int var27 = 0;
         if (var2 != var1) {
            var27 = (var5 - var4 << 14) / (var2 - var1);
         }

         int var28 = 0;
         if (var2 != var0) {
            var28 = (var3 - var5 << 14) / (var0 - var2);
         }

         int var29 = var20 * var23 - var22 * var21;
         if (var29 != 0) {
            int var30 = (var24 * var23 - var25 * var21 << 9) / var29;
            int var31 = (var25 * var20 - var24 * var22 << 9) / var29;
            var10 = var9 - var10;
            var13 = var12 - var13;
            var16 = var15 - var16;
            var11 -= var9;
            var14 -= var12;
            var17 -= var15;
            int var32 = var11 * var12 - var14 * var9 << 14;
            int var33 = (int)(((long)(var14 * var15 - var17 * var12) << 3 << 14) / (long)field2262);
            int var34 = (int)(((long)(var17 * var9 - var11 * var15) << 14) / (long)field2262);
            int var35 = var10 * var12 - var13 * var9 << 14;
            int var36 = (int)(((long)(var13 * var15 - var16 * var12) << 3 << 14) / (long)field2262);
            int var37 = (int)(((long)(var16 * var9 - var10 * var15) << 14) / (long)field2262);
            int var38 = var13 * var11 - var10 * var14 << 14;
            int var39 = (int)(((long)(var16 * var14 - var13 * var17) << 3 << 14) / (long)field2262);
            int var40 = (int)(((long)(var10 * var17 - var16 * var11) << 14) / (long)field2262);
            int var41;
            if (var0 <= var1 && var0 <= var2) {
               if (var0 < field2247) {
                  if (var1 > field2247) {
                     var1 = field2247;
                  }

                  if (var2 > field2247) {
                     var2 = field2247;
                  }

                  var6 = (var6 << 9) - var30 * var3 + var30;
                  if (var1 < var2) {
                     var5 = var3 <<= 14;
                     if (var0 < 0) {
                        var5 -= var28 * var0;
                        var3 -= var26 * var0;
                        var6 -= var31 * var0;
                        var0 = 0;
                     }

                     var4 <<= 14;
                     if (var1 < 0) {
                        var4 -= var27 * var1;
                        var1 = 0;
                     }

                     var41 = var0 - field2260;
                     var32 += var34 * var41;
                     var35 += var37 * var41;
                     var38 += var40 * var41;
                     if (var0 != var1 && var28 < var26 || var0 == var1 && var28 > var27) {
                        var2 -= var1;
                        var1 -= var0;
                        var0 = field2267[var0];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 method3473(class394.field4250, var19, 0, 0, var0, var5 >> 14, var4 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
                                 var5 += var28;
                                 var4 += var27;
                                 var6 += var31;
                                 var0 += class394.field4245;
                                 var32 += var34;
                                 var35 += var37;
                                 var38 += var40;
                              }
                           }

                           method3473(class394.field4250, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
                           var5 += var28;
                           var3 += var26;
                           var6 += var31;
                           var0 += class394.field4245;
                           var32 += var34;
                           var35 += var37;
                           var38 += var40;
                        }
                     } else {
                        var2 -= var1;
                        var1 -= var0;
                        var0 = field2267[var0];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 method3473(class394.field4250, var19, 0, 0, var0, var4 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
                                 var5 += var28;
                                 var4 += var27;
                                 var6 += var31;
                                 var0 += class394.field4245;
                                 var32 += var34;
                                 var35 += var37;
                                 var38 += var40;
                              }
                           }

                           method3473(class394.field4250, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
                           var5 += var28;
                           var3 += var26;
                           var6 += var31;
                           var0 += class394.field4245;
                           var32 += var34;
                           var35 += var37;
                           var38 += var40;
                        }
                     }
                  } else {
                     var4 = var3 <<= 14;
                     if (var0 < 0) {
                        var4 -= var28 * var0;
                        var3 -= var26 * var0;
                        var6 -= var31 * var0;
                        var0 = 0;
                     }

                     var5 <<= 14;
                     if (var2 < 0) {
                        var5 -= var27 * var2;
                        var2 = 0;
                     }

                     var41 = var0 - field2260;
                     var32 += var34 * var41;
                     var35 += var37 * var41;
                     var38 += var40 * var41;
                     if ((var0 == var2 || var28 >= var26) && (var0 != var2 || var27 <= var26)) {
                        var1 -= var2;
                        var2 -= var0;
                        var0 = field2267[var0];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var1;
                                 if (var1 < 0) {
                                    return;
                                 }

                                 method3473(class394.field4250, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
                                 var5 += var27;
                                 var3 += var26;
                                 var6 += var31;
                                 var0 += class394.field4245;
                                 var32 += var34;
                                 var35 += var37;
                                 var38 += var40;
                              }
                           }

                           method3473(class394.field4250, var19, 0, 0, var0, var3 >> 14, var4 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
                           var4 += var28;
                           var3 += var26;
                           var6 += var31;
                           var0 += class394.field4245;
                           var32 += var34;
                           var35 += var37;
                           var38 += var40;
                        }
                     } else {
                        var1 -= var2;
                        var2 -= var0;
                        var0 = field2267[var0];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var1;
                                 if (var1 < 0) {
                                    return;
                                 }

                                 method3473(class394.field4250, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
                                 var5 += var27;
                                 var3 += var26;
                                 var6 += var31;
                                 var0 += class394.field4245;
                                 var32 += var34;
                                 var35 += var37;
                                 var38 += var40;
                              }
                           }

                           method3473(class394.field4250, var19, 0, 0, var0, var4 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
                           var4 += var28;
                           var3 += var26;
                           var6 += var31;
                           var0 += class394.field4245;
                           var32 += var34;
                           var35 += var37;
                           var38 += var40;
                        }
                     }
                  }
               }
            } else if (var1 <= var2) {
               if (var1 < field2247) {
                  if (var2 > field2247) {
                     var2 = field2247;
                  }

                  if (var0 > field2247) {
                     var0 = field2247;
                  }

                  var7 = (var7 << 9) - var30 * var4 + var30;
                  if (var2 < var0) {
                     var3 = var4 <<= 14;
                     if (var1 < 0) {
                        var3 -= var26 * var1;
                        var4 -= var27 * var1;
                        var7 -= var31 * var1;
                        var1 = 0;
                     }

                     var5 <<= 14;
                     if (var2 < 0) {
                        var5 -= var28 * var2;
                        var2 = 0;
                     }

                     var41 = var1 - field2260;
                     var32 += var34 * var41;
                     var35 += var37 * var41;
                     var38 += var40 * var41;
                     if (var1 != var2 && var26 < var27 || var1 == var2 && var26 > var28) {
                        var0 -= var2;
                        var2 -= var1;
                        var1 = field2267[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var0;
                                 if (var0 < 0) {
                                    return;
                                 }

                                 method3473(class394.field4250, var19, 0, 0, var1, var3 >> 14, var5 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
                                 var3 += var26;
                                 var5 += var28;
                                 var7 += var31;
                                 var1 += class394.field4245;
                                 var32 += var34;
                                 var35 += var37;
                                 var38 += var40;
                              }
                           }

                           method3473(class394.field4250, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
                           var3 += var26;
                           var4 += var27;
                           var7 += var31;
                           var1 += class394.field4245;
                           var32 += var34;
                           var35 += var37;
                           var38 += var40;
                        }
                     } else {
                        var0 -= var2;
                        var2 -= var1;
                        var1 = field2267[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var0;
                                 if (var0 < 0) {
                                    return;
                                 }

                                 method3473(class394.field4250, var19, 0, 0, var1, var5 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
                                 var3 += var26;
                                 var5 += var28;
                                 var7 += var31;
                                 var1 += class394.field4245;
                                 var32 += var34;
                                 var35 += var37;
                                 var38 += var40;
                              }
                           }

                           method3473(class394.field4250, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
                           var3 += var26;
                           var4 += var27;
                           var7 += var31;
                           var1 += class394.field4245;
                           var32 += var34;
                           var35 += var37;
                           var38 += var40;
                        }
                     }
                  } else {
                     var5 = var4 <<= 14;
                     if (var1 < 0) {
                        var5 -= var26 * var1;
                        var4 -= var27 * var1;
                        var7 -= var31 * var1;
                        var1 = 0;
                     }

                     var3 <<= 14;
                     if (var0 < 0) {
                        var3 -= var28 * var0;
                        var0 = 0;
                     }

                     var41 = var1 - field2260;
                     var32 += var34 * var41;
                     var35 += var37 * var41;
                     var38 += var40 * var41;
                     if (var26 < var27) {
                        var2 -= var0;
                        var0 -= var1;
                        var1 = field2267[var1];

                        while(true) {
                           --var0;
                           if (var0 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 method3473(class394.field4250, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
                                 var3 += var28;
                                 var4 += var27;
                                 var7 += var31;
                                 var1 += class394.field4245;
                                 var32 += var34;
                                 var35 += var37;
                                 var38 += var40;
                              }
                           }

                           method3473(class394.field4250, var19, 0, 0, var1, var5 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
                           var5 += var26;
                           var4 += var27;
                           var7 += var31;
                           var1 += class394.field4245;
                           var32 += var34;
                           var35 += var37;
                           var38 += var40;
                        }
                     } else {
                        var2 -= var0;
                        var0 -= var1;
                        var1 = field2267[var1];

                        while(true) {
                           --var0;
                           if (var0 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 method3473(class394.field4250, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
                                 var3 += var28;
                                 var4 += var27;
                                 var7 += var31;
                                 var1 += class394.field4245;
                                 var32 += var34;
                                 var35 += var37;
                                 var38 += var40;
                              }
                           }

                           method3473(class394.field4250, var19, 0, 0, var1, var4 >> 14, var5 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
                           var5 += var26;
                           var4 += var27;
                           var7 += var31;
                           var1 += class394.field4245;
                           var32 += var34;
                           var35 += var37;
                           var38 += var40;
                        }
                     }
                  }
               }
            } else if (var2 < field2247) {
               if (var0 > field2247) {
                  var0 = field2247;
               }

               if (var1 > field2247) {
                  var1 = field2247;
               }

               var8 = (var8 << 9) - var30 * var5 + var30;
               if (var0 < var1) {
                  var4 = var5 <<= 14;
                  if (var2 < 0) {
                     var4 -= var27 * var2;
                     var5 -= var28 * var2;
                     var8 -= var31 * var2;
                     var2 = 0;
                  }

                  var3 <<= 14;
                  if (var0 < 0) {
                     var3 -= var26 * var0;
                     var0 = 0;
                  }

                  var41 = var2 - field2260;
                  var32 += var34 * var41;
                  var35 += var37 * var41;
                  var38 += var40 * var41;
                  if (var27 < var28) {
                     var1 -= var0;
                     var0 -= var2;
                     var2 = field2267[var2];

                     while(true) {
                        --var0;
                        if (var0 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              method3473(class394.field4250, var19, 0, 0, var2, var4 >> 14, var3 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
                              var4 += var27;
                              var3 += var26;
                              var8 += var31;
                              var2 += class394.field4245;
                              var32 += var34;
                              var35 += var37;
                              var38 += var40;
                           }
                        }

                        method3473(class394.field4250, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
                        var4 += var27;
                        var5 += var28;
                        var8 += var31;
                        var2 += class394.field4245;
                        var32 += var34;
                        var35 += var37;
                        var38 += var40;
                     }
                  } else {
                     var1 -= var0;
                     var0 -= var2;
                     var2 = field2267[var2];

                     while(true) {
                        --var0;
                        if (var0 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              method3473(class394.field4250, var19, 0, 0, var2, var3 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
                              var4 += var27;
                              var3 += var26;
                              var8 += var31;
                              var2 += class394.field4245;
                              var32 += var34;
                              var35 += var37;
                              var38 += var40;
                           }
                        }

                        method3473(class394.field4250, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
                        var4 += var27;
                        var5 += var28;
                        var8 += var31;
                        var2 += class394.field4245;
                        var32 += var34;
                        var35 += var37;
                        var38 += var40;
                     }
                  }
               } else {
                  var3 = var5 <<= 14;
                  if (var2 < 0) {
                     var3 -= var27 * var2;
                     var5 -= var28 * var2;
                     var8 -= var31 * var2;
                     var2 = 0;
                  }

                  var4 <<= 14;
                  if (var1 < 0) {
                     var4 -= var26 * var1;
                     var1 = 0;
                  }

                  var41 = var2 - field2260;
                  var32 += var34 * var41;
                  var35 += var37 * var41;
                  var38 += var40 * var41;
                  if (var27 < var28) {
                     var0 -= var1;
                     var1 -= var2;
                     var2 = field2267[var2];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var0;
                              if (var0 < 0) {
                                 return;
                              }

                              method3473(class394.field4250, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
                              var4 += var26;
                              var5 += var28;
                              var8 += var31;
                              var2 += class394.field4245;
                              var32 += var34;
                              var35 += var37;
                              var38 += var40;
                           }
                        }

                        method3473(class394.field4250, var19, 0, 0, var2, var3 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
                        var3 += var27;
                        var5 += var28;
                        var8 += var31;
                        var2 += class394.field4245;
                        var32 += var34;
                        var35 += var37;
                        var38 += var40;
                     }
                  } else {
                     var0 -= var1;
                     var1 -= var2;
                     var2 = field2267[var2];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var0;
                              if (var0 < 0) {
                                 return;
                              }

                              method3473(class394.field4250, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
                              var4 += var26;
                              var5 += var28;
                              var8 += var31;
                              var2 += class394.field4245;
                              var32 += var34;
                              var35 += var37;
                              var38 += var40;
                           }
                        }

                        method3473(class394.field4250, var19, 0, 0, var2, var5 >> 14, var3 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
                        var3 += var27;
                        var5 += var28;
                        var8 += var31;
                        var2 += class394.field4245;
                        var32 += var34;
                        var35 += var37;
                        var38 += var40;
                     }
                  }
               }
            }
         }
      }
   }

   static final void method3473(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14) {
      if (field2252) {
         if (var6 > field2261) {
            var6 = field2261;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var4 += var5;
         var7 += var8 * var5;
         int var17 = var6 - var5;
         int var15;
         int var16;
         int var10000;
         int var18;
         int var19;
         int var20;
         int var21;
         int var22;
         int var23;
         if (field2251) {
            var23 = var5 - field2259;
            var9 += (var12 >> 3) * var23;
            var10 += (var13 >> 3) * var23;
            var11 += (var14 >> 3) * var23;
            var22 = var11 >> 12;
            if (var22 != 0) {
               var18 = var9 / var22;
               var19 = var10 / var22;
               if (var18 < 0) {
                  var18 = 0;
               } else if (var18 > 4032) {
                  var18 = 4032;
               }
            } else {
               var18 = 0;
               var19 = 0;
            }

            var9 += var12;
            var10 += var13;
            var11 += var14;
            var22 = var11 >> 12;
            if (var22 != 0) {
               var20 = var9 / var22;
               var21 = var10 / var22;
               if (var20 < 0) {
                  var20 = 0;
               } else if (var20 > 4032) {
                  var20 = 4032;
               }
            } else {
               var20 = 0;
               var21 = 0;
            }

            var2 = (var18 << 20) + var19;
            var16 = (var20 - var18 >> 3 << 20) + (var21 - var19 >> 3);
            var17 >>= 3;
            var8 <<= 3;
            var15 = var7 >> 8;
            if (field2249) {
               if (var17 > 0) {
                  do {
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     var2 += var16;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     var2 += var16;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     var2 += var16;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     var2 += var16;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     var2 += var16;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     var2 += var16;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     var2 += var16;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     var10000 = var2 + var16;
                     var18 = var20;
                     var19 = var21;
                     var9 += var12;
                     var10 += var13;
                     var11 += var14;
                     var22 = var11 >> 12;
                     if (var22 != 0) {
                        var20 = var9 / var22;
                        var21 = var10 / var22;
                        if (var20 < 0) {
                           var20 = 0;
                        } else if (var20 > 4032) {
                           var20 = 4032;
                        }
                     } else {
                        var20 = 0;
                        var21 = 0;
                     }

                     var2 = (var18 << 20) + var19;
                     var16 = (var20 - var18 >> 3 << 20) + (var21 - var19 >> 3);
                     var7 += var8;
                     var15 = var7 >> 8;
                     --var17;
                  } while(var17 > 0);
               }

               var17 = var6 - var5 & 7;
               if (var17 > 0) {
                  do {
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     var2 += var16;
                     --var17;
                  } while(var17 > 0);
               }
            } else {
               if (var17 > 0) {
                  do {
                     if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var16;
                     if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var16;
                     if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var16;
                     if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var16;
                     if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var16;
                     if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var16;
                     if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var16;
                     if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     }

                     ++var4;
                     var10000 = var2 + var16;
                     var18 = var20;
                     var19 = var21;
                     var9 += var12;
                     var10 += var13;
                     var11 += var14;
                     var22 = var11 >> 12;
                     if (var22 != 0) {
                        var20 = var9 / var22;
                        var21 = var10 / var22;
                        if (var20 < 0) {
                           var20 = 0;
                        } else if (var20 > 4032) {
                           var20 = 4032;
                        }
                     } else {
                        var20 = 0;
                        var21 = 0;
                     }

                     var2 = (var18 << 20) + var19;
                     var16 = (var20 - var18 >> 3 << 20) + (var21 - var19 >> 3);
                     var7 += var8;
                     var15 = var7 >> 8;
                     --var17;
                  } while(var17 > 0);
               }

               var17 = var6 - var5 & 7;
               if (var17 > 0) {
                  do {
                     if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var16;
                     --var17;
                  } while(var17 > 0);
               }
            }
         } else {
            var23 = var5 - field2259;
            var9 += (var12 >> 3) * var23;
            var10 += (var13 >> 3) * var23;
            var11 += (var14 >> 3) * var23;
            var22 = var11 >> 14;
            if (var22 != 0) {
               var18 = var9 / var22;
               var19 = var10 / var22;
               if (var18 < 0) {
                  var18 = 0;
               } else if (var18 > 16256) {
                  var18 = 16256;
               }
            } else {
               var18 = 0;
               var19 = 0;
            }

            var9 += var12;
            var10 += var13;
            var11 += var14;
            var22 = var11 >> 14;
            if (var22 != 0) {
               var20 = var9 / var22;
               var21 = var10 / var22;
               if (var20 < 0) {
                  var20 = 0;
               } else if (var20 > 16256) {
                  var20 = 16256;
               }
            } else {
               var20 = 0;
               var21 = 0;
            }

            var2 = (var18 << 18) + var19;
            var16 = (var20 - var18 >> 3 << 18) + (var21 - var19 >> 3);
            var17 >>= 3;
            var8 <<= 3;
            var15 = var7 >> 8;
            if (field2249) {
               if (var17 > 0) {
                  do {
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     var2 += var16;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     var2 += var16;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     var2 += var16;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     var2 += var16;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     var2 += var16;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     var2 += var16;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     var2 += var16;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     var10000 = var2 + var16;
                     var18 = var20;
                     var19 = var21;
                     var9 += var12;
                     var10 += var13;
                     var11 += var14;
                     var22 = var11 >> 14;
                     if (var22 != 0) {
                        var20 = var9 / var22;
                        var21 = var10 / var22;
                        if (var20 < 0) {
                           var20 = 0;
                        } else if (var20 > 16256) {
                           var20 = 16256;
                        }
                     } else {
                        var20 = 0;
                        var21 = 0;
                     }

                     var2 = (var18 << 18) + var19;
                     var16 = (var20 - var18 >> 3 << 18) + (var21 - var19 >> 3);
                     var7 += var8;
                     var15 = var7 >> 8;
                     --var17;
                  } while(var17 > 0);
               }

               var17 = var6 - var5 & 7;
               if (var17 > 0) {
                  do {
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     var2 += var16;
                     --var17;
                  } while(var17 > 0);
               }
            } else {
               if (var17 > 0) {
                  do {
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var16;
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var16;
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var16;
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var16;
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var16;
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var16;
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var16;
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     }

                     ++var4;
                     var10000 = var2 + var16;
                     var18 = var20;
                     var19 = var21;
                     var9 += var12;
                     var10 += var13;
                     var11 += var14;
                     var22 = var11 >> 14;
                     if (var22 != 0) {
                        var20 = var9 / var22;
                        var21 = var10 / var22;
                        if (var20 < 0) {
                           var20 = 0;
                        } else if (var20 > 16256) {
                           var20 = 16256;
                        }
                     } else {
                        var20 = 0;
                        var21 = 0;
                     }

                     var2 = (var18 << 18) + var19;
                     var16 = (var20 - var18 >> 3 << 18) + (var21 - var19 >> 3);
                     var7 += var8;
                     var15 = var7 >> 8;
                     --var17;
                  } while(var17 > 0);
               }

               var17 = var6 - var5 & 7;
               if (var17 > 0) {
                  do {
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var16;
                     --var17;
                  } while(var17 > 0);
               }
            }
         }

      }
   }

   static final void method3430(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18) {
      int[] var19 = field2269.method3844(var18);
      int var20;
      if (var19 == null) {
         var20 = field2269.method3835(var18);
         method3428(var0, var1, var2, var3, var4, var5, method3432(var20, var6), method3432(var20, var7), method3432(var20, var8));
      } else {
         field2251 = field2269.method3834(var18);
         field2249 = field2269.method3841(var18);
         var20 = var4 - var3;
         int var21 = var1 - var0;
         int var22 = var5 - var3;
         int var23 = var2 - var0;
         int var24 = var7 - var6;
         int var25 = var8 - var6;
         int var26 = 0;
         if (var1 != var0) {
            var26 = (var4 - var3 << 14) / (var1 - var0);
         }

         int var27 = 0;
         if (var2 != var1) {
            var27 = (var5 - var4 << 14) / (var2 - var1);
         }

         int var28 = 0;
         if (var2 != var0) {
            var28 = (var3 - var5 << 14) / (var0 - var2);
         }

         int var29 = var20 * var23 - var22 * var21;
         if (var29 != 0) {
            int var30 = (var24 * var23 - var25 * var21 << 9) / var29;
            int var31 = (var25 * var20 - var24 * var22 << 9) / var29;
            var10 = var9 - var10;
            var13 = var12 - var13;
            var16 = var15 - var16;
            var11 -= var9;
            var14 -= var12;
            var17 -= var15;
            int var32 = var11 * var12 - var14 * var9 << 14;
            int var33 = (int)(((long)(var14 * var15 - var17 * var12) << 14) / (long)field2262);
            int var34 = (int)(((long)(var17 * var9 - var11 * var15) << 14) / (long)field2262);
            int var35 = var10 * var12 - var13 * var9 << 14;
            int var36 = (int)(((long)(var13 * var15 - var16 * var12) << 14) / (long)field2262);
            int var37 = (int)(((long)(var16 * var9 - var10 * var15) << 14) / (long)field2262);
            int var38 = var13 * var11 - var10 * var14 << 14;
            int var39 = (int)(((long)(var16 * var14 - var13 * var17) << 14) / (long)field2262);
            int var40 = (int)(((long)(var10 * var17 - var16 * var11) << 14) / (long)field2262);
            int var41;
            if (var0 <= var1 && var0 <= var2) {
               if (var0 < field2247) {
                  if (var1 > field2247) {
                     var1 = field2247;
                  }

                  if (var2 > field2247) {
                     var2 = field2247;
                  }

                  var6 = (var6 << 9) - var30 * var3 + var30;
                  if (var1 < var2) {
                     var5 = var3 <<= 14;
                     if (var0 < 0) {
                        var5 -= var28 * var0;
                        var3 -= var26 * var0;
                        var6 -= var31 * var0;
                        var0 = 0;
                     }

                     var4 <<= 14;
                     if (var1 < 0) {
                        var4 -= var27 * var1;
                        var1 = 0;
                     }

                     var41 = var0 - field2260;
                     var32 += var34 * var41;
                     var35 += var37 * var41;
                     var38 += var40 * var41;
                     if (var0 != var1 && var28 < var26 || var0 == var1 && var28 > var27) {
                        var2 -= var1;
                        var1 -= var0;
                        var0 = field2267[var0];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 method3466(class394.field4250, var19, 0, 0, var0, var5 >> 14, var4 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
                                 var5 += var28;
                                 var4 += var27;
                                 var6 += var31;
                                 var0 += class394.field4245;
                                 var32 += var34;
                                 var35 += var37;
                                 var38 += var40;
                              }
                           }

                           method3466(class394.field4250, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
                           var5 += var28;
                           var3 += var26;
                           var6 += var31;
                           var0 += class394.field4245;
                           var32 += var34;
                           var35 += var37;
                           var38 += var40;
                        }
                     } else {
                        var2 -= var1;
                        var1 -= var0;
                        var0 = field2267[var0];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 method3466(class394.field4250, var19, 0, 0, var0, var4 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
                                 var5 += var28;
                                 var4 += var27;
                                 var6 += var31;
                                 var0 += class394.field4245;
                                 var32 += var34;
                                 var35 += var37;
                                 var38 += var40;
                              }
                           }

                           method3466(class394.field4250, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
                           var5 += var28;
                           var3 += var26;
                           var6 += var31;
                           var0 += class394.field4245;
                           var32 += var34;
                           var35 += var37;
                           var38 += var40;
                        }
                     }
                  } else {
                     var4 = var3 <<= 14;
                     if (var0 < 0) {
                        var4 -= var28 * var0;
                        var3 -= var26 * var0;
                        var6 -= var31 * var0;
                        var0 = 0;
                     }

                     var5 <<= 14;
                     if (var2 < 0) {
                        var5 -= var27 * var2;
                        var2 = 0;
                     }

                     var41 = var0 - field2260;
                     var32 += var34 * var41;
                     var35 += var37 * var41;
                     var38 += var40 * var41;
                     if ((var0 == var2 || var28 >= var26) && (var0 != var2 || var27 <= var26)) {
                        var1 -= var2;
                        var2 -= var0;
                        var0 = field2267[var0];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var1;
                                 if (var1 < 0) {
                                    return;
                                 }

                                 method3466(class394.field4250, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
                                 var5 += var27;
                                 var3 += var26;
                                 var6 += var31;
                                 var0 += class394.field4245;
                                 var32 += var34;
                                 var35 += var37;
                                 var38 += var40;
                              }
                           }

                           method3466(class394.field4250, var19, 0, 0, var0, var3 >> 14, var4 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
                           var4 += var28;
                           var3 += var26;
                           var6 += var31;
                           var0 += class394.field4245;
                           var32 += var34;
                           var35 += var37;
                           var38 += var40;
                        }
                     } else {
                        var1 -= var2;
                        var2 -= var0;
                        var0 = field2267[var0];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var1;
                                 if (var1 < 0) {
                                    return;
                                 }

                                 method3466(class394.field4250, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
                                 var5 += var27;
                                 var3 += var26;
                                 var6 += var31;
                                 var0 += class394.field4245;
                                 var32 += var34;
                                 var35 += var37;
                                 var38 += var40;
                              }
                           }

                           method3466(class394.field4250, var19, 0, 0, var0, var4 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
                           var4 += var28;
                           var3 += var26;
                           var6 += var31;
                           var0 += class394.field4245;
                           var32 += var34;
                           var35 += var37;
                           var38 += var40;
                        }
                     }
                  }
               }
            } else if (var1 <= var2) {
               if (var1 < field2247) {
                  if (var2 > field2247) {
                     var2 = field2247;
                  }

                  if (var0 > field2247) {
                     var0 = field2247;
                  }

                  var7 = (var7 << 9) - var30 * var4 + var30;
                  if (var2 < var0) {
                     var3 = var4 <<= 14;
                     if (var1 < 0) {
                        var3 -= var26 * var1;
                        var4 -= var27 * var1;
                        var7 -= var31 * var1;
                        var1 = 0;
                     }

                     var5 <<= 14;
                     if (var2 < 0) {
                        var5 -= var28 * var2;
                        var2 = 0;
                     }

                     var41 = var1 - field2260;
                     var32 += var34 * var41;
                     var35 += var37 * var41;
                     var38 += var40 * var41;
                     if (var1 != var2 && var26 < var27 || var1 == var2 && var26 > var28) {
                        var0 -= var2;
                        var2 -= var1;
                        var1 = field2267[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var0;
                                 if (var0 < 0) {
                                    return;
                                 }

                                 method3466(class394.field4250, var19, 0, 0, var1, var3 >> 14, var5 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
                                 var3 += var26;
                                 var5 += var28;
                                 var7 += var31;
                                 var1 += class394.field4245;
                                 var32 += var34;
                                 var35 += var37;
                                 var38 += var40;
                              }
                           }

                           method3466(class394.field4250, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
                           var3 += var26;
                           var4 += var27;
                           var7 += var31;
                           var1 += class394.field4245;
                           var32 += var34;
                           var35 += var37;
                           var38 += var40;
                        }
                     } else {
                        var0 -= var2;
                        var2 -= var1;
                        var1 = field2267[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var0;
                                 if (var0 < 0) {
                                    return;
                                 }

                                 method3466(class394.field4250, var19, 0, 0, var1, var5 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
                                 var3 += var26;
                                 var5 += var28;
                                 var7 += var31;
                                 var1 += class394.field4245;
                                 var32 += var34;
                                 var35 += var37;
                                 var38 += var40;
                              }
                           }

                           method3466(class394.field4250, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
                           var3 += var26;
                           var4 += var27;
                           var7 += var31;
                           var1 += class394.field4245;
                           var32 += var34;
                           var35 += var37;
                           var38 += var40;
                        }
                     }
                  } else {
                     var5 = var4 <<= 14;
                     if (var1 < 0) {
                        var5 -= var26 * var1;
                        var4 -= var27 * var1;
                        var7 -= var31 * var1;
                        var1 = 0;
                     }

                     var3 <<= 14;
                     if (var0 < 0) {
                        var3 -= var28 * var0;
                        var0 = 0;
                     }

                     var41 = var1 - field2260;
                     var32 += var34 * var41;
                     var35 += var37 * var41;
                     var38 += var40 * var41;
                     if (var26 < var27) {
                        var2 -= var0;
                        var0 -= var1;
                        var1 = field2267[var1];

                        while(true) {
                           --var0;
                           if (var0 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 method3466(class394.field4250, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
                                 var3 += var28;
                                 var4 += var27;
                                 var7 += var31;
                                 var1 += class394.field4245;
                                 var32 += var34;
                                 var35 += var37;
                                 var38 += var40;
                              }
                           }

                           method3466(class394.field4250, var19, 0, 0, var1, var5 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
                           var5 += var26;
                           var4 += var27;
                           var7 += var31;
                           var1 += class394.field4245;
                           var32 += var34;
                           var35 += var37;
                           var38 += var40;
                        }
                     } else {
                        var2 -= var0;
                        var0 -= var1;
                        var1 = field2267[var1];

                        while(true) {
                           --var0;
                           if (var0 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 method3466(class394.field4250, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
                                 var3 += var28;
                                 var4 += var27;
                                 var7 += var31;
                                 var1 += class394.field4245;
                                 var32 += var34;
                                 var35 += var37;
                                 var38 += var40;
                              }
                           }

                           method3466(class394.field4250, var19, 0, 0, var1, var4 >> 14, var5 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
                           var5 += var26;
                           var4 += var27;
                           var7 += var31;
                           var1 += class394.field4245;
                           var32 += var34;
                           var35 += var37;
                           var38 += var40;
                        }
                     }
                  }
               }
            } else if (var2 < field2247) {
               if (var0 > field2247) {
                  var0 = field2247;
               }

               if (var1 > field2247) {
                  var1 = field2247;
               }

               var8 = (var8 << 9) - var30 * var5 + var30;
               if (var0 < var1) {
                  var4 = var5 <<= 14;
                  if (var2 < 0) {
                     var4 -= var27 * var2;
                     var5 -= var28 * var2;
                     var8 -= var31 * var2;
                     var2 = 0;
                  }

                  var3 <<= 14;
                  if (var0 < 0) {
                     var3 -= var26 * var0;
                     var0 = 0;
                  }

                  var41 = var2 - field2260;
                  var32 += var34 * var41;
                  var35 += var37 * var41;
                  var38 += var40 * var41;
                  if (var27 < var28) {
                     var1 -= var0;
                     var0 -= var2;
                     var2 = field2267[var2];

                     while(true) {
                        --var0;
                        if (var0 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              method3466(class394.field4250, var19, 0, 0, var2, var4 >> 14, var3 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
                              var4 += var27;
                              var3 += var26;
                              var8 += var31;
                              var2 += class394.field4245;
                              var32 += var34;
                              var35 += var37;
                              var38 += var40;
                           }
                        }

                        method3466(class394.field4250, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
                        var4 += var27;
                        var5 += var28;
                        var8 += var31;
                        var2 += class394.field4245;
                        var32 += var34;
                        var35 += var37;
                        var38 += var40;
                     }
                  } else {
                     var1 -= var0;
                     var0 -= var2;
                     var2 = field2267[var2];

                     while(true) {
                        --var0;
                        if (var0 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              method3466(class394.field4250, var19, 0, 0, var2, var3 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
                              var4 += var27;
                              var3 += var26;
                              var8 += var31;
                              var2 += class394.field4245;
                              var32 += var34;
                              var35 += var37;
                              var38 += var40;
                           }
                        }

                        method3466(class394.field4250, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
                        var4 += var27;
                        var5 += var28;
                        var8 += var31;
                        var2 += class394.field4245;
                        var32 += var34;
                        var35 += var37;
                        var38 += var40;
                     }
                  }
               } else {
                  var3 = var5 <<= 14;
                  if (var2 < 0) {
                     var3 -= var27 * var2;
                     var5 -= var28 * var2;
                     var8 -= var31 * var2;
                     var2 = 0;
                  }

                  var4 <<= 14;
                  if (var1 < 0) {
                     var4 -= var26 * var1;
                     var1 = 0;
                  }

                  var41 = var2 - field2260;
                  var32 += var34 * var41;
                  var35 += var37 * var41;
                  var38 += var40 * var41;
                  if (var27 < var28) {
                     var0 -= var1;
                     var1 -= var2;
                     var2 = field2267[var2];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var0;
                              if (var0 < 0) {
                                 return;
                              }

                              method3466(class394.field4250, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
                              var4 += var26;
                              var5 += var28;
                              var8 += var31;
                              var2 += class394.field4245;
                              var32 += var34;
                              var35 += var37;
                              var38 += var40;
                           }
                        }

                        method3466(class394.field4250, var19, 0, 0, var2, var3 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
                        var3 += var27;
                        var5 += var28;
                        var8 += var31;
                        var2 += class394.field4245;
                        var32 += var34;
                        var35 += var37;
                        var38 += var40;
                     }
                  } else {
                     var0 -= var1;
                     var1 -= var2;
                     var2 = field2267[var2];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var0;
                              if (var0 < 0) {
                                 return;
                              }

                              method3466(class394.field4250, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
                              var4 += var26;
                              var5 += var28;
                              var8 += var31;
                              var2 += class394.field4245;
                              var32 += var34;
                              var35 += var37;
                              var38 += var40;
                           }
                        }

                        method3466(class394.field4250, var19, 0, 0, var2, var5 >> 14, var3 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
                        var3 += var27;
                        var5 += var28;
                        var8 += var31;
                        var2 += class394.field4245;
                        var32 += var34;
                        var35 += var37;
                        var38 += var40;
                     }
                  }
               }
            }
         }
      }
   }

   static final void method3466(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14) {
      if (field2252) {
         if (var6 > field2261) {
            var6 = field2261;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var4 += var5;
         var7 += var8 * var5;
         int var17 = var6 - var5;
         int var15;
         int var16;
         int var18;
         int var19;
         int var20;
         int var21;
         int var22;
         int var23;
         if (field2251) {
            var23 = var5 - field2259;
            var9 += var12 * var23;
            var10 += var13 * var23;
            var11 += var14 * var23;
            var22 = var11 >> 12;
            if (var22 != 0) {
               var18 = var9 / var22;
               var19 = var10 / var22;
            } else {
               var18 = 0;
               var19 = 0;
            }

            var9 += var12 * var17;
            var10 += var13 * var17;
            var11 += var14 * var17;
            var22 = var11 >> 12;
            if (var22 != 0) {
               var20 = var9 / var22;
               var21 = var10 / var22;
            } else {
               var20 = 0;
               var21 = 0;
            }

            var2 = (var18 << 20) + var19;
            var16 = ((var20 - var18) / var17 << 20) + (var21 - var19) / var17;
            var17 >>= 3;
            var8 <<= 3;
            var15 = var7 >> 8;
            if (field2249) {
               if (var17 > 0) {
                  do {
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     var2 += var16;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     var2 += var16;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     var2 += var16;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     var2 += var16;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     var2 += var16;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     var2 += var16;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     var2 += var16;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     var2 += var16;
                     var7 += var8;
                     var15 = var7 >> 8;
                     --var17;
                  } while(var17 > 0);
               }

               var17 = var6 - var5 & 7;
               if (var17 > 0) {
                  do {
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     var2 += var16;
                     --var17;
                  } while(var17 > 0);
               }
            } else {
               if (var17 > 0) {
                  do {
                     if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var16;
                     if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var16;
                     if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var16;
                     if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var16;
                     if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var16;
                     if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var16;
                     if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var16;
                     if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var16;
                     var7 += var8;
                     var15 = var7 >> 8;
                     --var17;
                  } while(var17 > 0);
               }

               var17 = var6 - var5 & 7;
               if (var17 > 0) {
                  do {
                     if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var16;
                     --var17;
                  } while(var17 > 0);
               }
            }
         } else {
            var23 = var5 - field2259;
            var9 += var12 * var23;
            var10 += var13 * var23;
            var11 += var14 * var23;
            var22 = var11 >> 14;
            if (var22 != 0) {
               var18 = var9 / var22;
               var19 = var10 / var22;
            } else {
               var18 = 0;
               var19 = 0;
            }

            var9 += var12 * var17;
            var10 += var13 * var17;
            var11 += var14 * var17;
            var22 = var11 >> 14;
            if (var22 != 0) {
               var20 = var9 / var22;
               var21 = var10 / var22;
            } else {
               var20 = 0;
               var21 = 0;
            }

            var2 = (var18 << 18) + var19;
            var16 = ((var20 - var18) / var17 << 18) + (var21 - var19) / var17;
            var17 >>= 3;
            var8 <<= 3;
            var15 = var7 >> 8;
            if (field2249) {
               if (var17 > 0) {
                  do {
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     var2 += var16;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     var2 += var16;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     var2 += var16;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     var2 += var16;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     var2 += var16;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     var2 += var16;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     var2 += var16;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     var2 += var16;
                     var7 += var8;
                     var15 = var7 >> 8;
                     --var17;
                  } while(var17 > 0);
               }

               var17 = var6 - var5 & 7;
               if (var17 > 0) {
                  do {
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     var2 += var16;
                     --var17;
                  } while(var17 > 0);
               }
            } else {
               if (var17 > 0) {
                  do {
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var16;
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var16;
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var16;
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var16;
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var16;
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var16;
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var16;
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var16;
                     var7 += var8;
                     var15 = var7 >> 8;
                     --var17;
                  } while(var17 > 0);
               }

               var17 = var6 - var5 & 7;
               if (var17 > 0) {
                  do {
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var16;
                     --var17;
                  } while(var17 > 0);
               }
            }
         }

      }
   }

   static final int method3432(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & '\uff80') + var1;
   }

   static final int method3433(int var0, int var1, int var2, int var3) {
      return var0 * var2 + var1 * var3 >> 16;
   }

   static final int method3414(int var0, int var1, int var2, int var3) {
      return var1 * var2 - var0 * var3 >> 16;
   }

   static final int method3465(int var0, int var1, int var2, int var3) {
      return var0 * var2 - var1 * var3 >> 16;
   }

   static final int method3436(int var0, int var1, int var2, int var3) {
      return var0 * var3 + var1 * var2 >> 16;
   }

   static final int method3453(int var0, int var1, int var2, int var3) {
      return var0 * var2 + var1 * var3 >> 16;
   }

   static final int method3438(int var0, int var1, int var2, int var3) {
      return var1 * var2 - var0 * var3 >> 16;
   }
}
