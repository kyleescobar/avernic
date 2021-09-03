import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class class124 extends class354 {
   public static int field1439;
   static class275 archive13;
   boolean field1432;
   boolean field1435 = true;
   int[] field1433;
   long field1434;
   public byte field1431;
   public byte field1437;
   public String field1430 = null;
   public List field1436;

   public static int method2218(int var0, int var1, int var2, class161 var3, class160 var4, boolean var5, int[] var6, int[] var7) {
      int var10;
      for(int var9 = 0; var9 < 128; ++var9) {
         for(var10 = 0; var10 < 128; ++var10) {
            class162.field1899[var9][var10] = 0;
            class162.field1900[var9][var10] = 99999999;
         }
      }

      int var11;
      int var12;
      byte var14;
      int var15;
      int var16;
      int var18;
      int var20;
      int var21;
      int var22;
      int var23;
      boolean var28;
      int var30;
      int var31;
      int var33;
      if (1 == var2) {
         var28 = class140.method2363(var0, var1, var3, var4);
      } else if (var2 == 2) {
         var28 = KeyHandler.method95(var0, var1, var3, var4);
      } else {
         var11 = var0;
         var12 = var1;
         byte var13 = 64;
         var14 = 64;
         var15 = var0 - var13;
         var16 = var1 - var14;
         class162.field1899[var13][var14] = 99;
         class162.field1900[var13][var14] = 0;
         byte var17 = 0;
         var18 = 0;
         class162.field1902[var17] = var0;
         var33 = var17 + 1;
         class162.field1905[var17] = var1;
         int[][] var19 = var4.field1889;

         boolean var29;
         label458:
         while(true) {
            label456:
            while(true) {
               do {
                  do {
                     do {
                        label433:
                        do {
                           if (var33 == var18) {
                              class27.field220 = var11;
                              class162.field1897 = var12;
                              var29 = false;
                              break label458;
                           }

                           var11 = class162.field1902[var18];
                           var12 = class162.field1905[var18];
                           var18 = 1 + var18 & 4095;
                           var30 = var11 - var15;
                           var31 = var12 - var16;
                           var20 = var11 - var4.field1885;
                           var21 = var12 - var4.field1888;
                           if (var3.method2844(var2, var11, var12, var4)) {
                              class27.field220 = var11;
                              class162.field1897 = var12;
                              var29 = true;
                              break label458;
                           }

                           var22 = 1 + class162.field1900[var30][var31];
                           if (var30 > 0 && 0 == class162.field1899[var30 - 1][var31] && 0 == (var19[var20 - 1][var21] & 19136782) && 0 == (var19[var20 - 1][var2 + var21 - 1] & 19136824)) {
                              var23 = 1;

                              while(true) {
                                 if (var23 >= var2 - 1) {
                                    class162.field1902[var33] = var11 - 1;
                                    class162.field1905[var33] = var12;
                                    var33 = 1 + var33 & 4095;
                                    class162.field1899[var30 - 1][var31] = 2;
                                    class162.field1900[var30 - 1][var31] = var22;
                                    break;
                                 }

                                 if ((var19[var20 - 1][var21 + var23] & 19136830) != 0) {
                                    break;
                                 }

                                 ++var23;
                              }
                           }

                           if (var30 < 128 - var2 && class162.field1899[var30 + 1][var31] == 0 && 0 == (var19[var20 + var2][var21] & 19136899) && (var19[var20 + var2][var2 + var21 - 1] & 19136992) == 0) {
                              var23 = 1;

                              while(true) {
                                 if (var23 >= var2 - 1) {
                                    class162.field1902[var33] = 1 + var11;
                                    class162.field1905[var33] = var12;
                                    var33 = 1 + var33 & 4095;
                                    class162.field1899[1 + var30][var31] = 8;
                                    class162.field1900[1 + var30][var31] = var22;
                                    break;
                                 }

                                 if ((var19[var2 + var20][var21 + var23] & 19136995) != 0) {
                                    break;
                                 }

                                 ++var23;
                              }
                           }

                           if (var31 > 0 && 0 == class162.field1899[var30][var31 - 1] && 0 == (var19[var20][var21 - 1] & 19136782) && (var19[var20 + var2 - 1][var21 - 1] & 19136899) == 0) {
                              var23 = 1;

                              while(true) {
                                 if (var23 >= var2 - 1) {
                                    class162.field1902[var33] = var11;
                                    class162.field1905[var33] = var12 - 1;
                                    var33 = var33 + 1 & 4095;
                                    class162.field1899[var30][var31 - 1] = 1;
                                    class162.field1900[var30][var31 - 1] = var22;
                                    break;
                                 }

                                 if (0 != (var19[var23 + var20][var21 - 1] & 19136911)) {
                                    break;
                                 }

                                 ++var23;
                              }
                           }

                           if (var31 < 128 - var2 && class162.field1899[var30][var31 + 1] == 0 && 0 == (var19[var20][var21 + var2] & 19136824) && 0 == (var19[var2 + var20 - 1][var21 + var2] & 19136992)) {
                              var23 = 1;

                              while(true) {
                                 if (var23 >= var2 - 1) {
                                    class162.field1902[var33] = var11;
                                    class162.field1905[var33] = var12 + 1;
                                    var33 = 1 + var33 & 4095;
                                    class162.field1899[var30][1 + var31] = 4;
                                    class162.field1900[var30][var31 + 1] = var22;
                                    break;
                                 }

                                 if ((var19[var20 + var23][var2 + var21] & 19137016) != 0) {
                                    break;
                                 }

                                 ++var23;
                              }
                           }

                           if (var30 > 0 && var31 > 0 && 0 == class162.field1899[var30 - 1][var31 - 1] && (var19[var20 - 1][var21 - 1] & 19136782) == 0) {
                              var23 = 1;

                              while(true) {
                                 if (var23 >= var2) {
                                    class162.field1902[var33] = var11 - 1;
                                    class162.field1905[var33] = var12 - 1;
                                    var33 = 1 + var33 & 4095;
                                    class162.field1899[var30 - 1][var31 - 1] = 3;
                                    class162.field1900[var30 - 1][var31 - 1] = var22;
                                    break;
                                 }

                                 if (0 != (var19[var20 - 1][var21 - 1 + var23] & 19136830) || (var19[var20 - 1 + var23][var21 - 1] & 19136911) != 0) {
                                    break;
                                 }

                                 ++var23;
                              }
                           }

                           if (var30 < 128 - var2 && var31 > 0 && 0 == class162.field1899[1 + var30][var31 - 1] && (var19[var20 + var2][var21 - 1] & 19136899) == 0) {
                              var23 = 1;

                              while(true) {
                                 if (var23 >= var2) {
                                    class162.field1902[var33] = 1 + var11;
                                    class162.field1905[var33] = var12 - 1;
                                    var33 = 1 + var33 & 4095;
                                    class162.field1899[1 + var30][var31 - 1] = 9;
                                    class162.field1900[var30 + 1][var31 - 1] = var22;
                                    break;
                                 }

                                 if (0 != (var19[var2 + var20][var21 - 1 + var23] & 19136995) || (var19[var20 + var23][var21 - 1] & 19136911) != 0) {
                                    break;
                                 }

                                 ++var23;
                              }
                           }

                           if (var30 > 0 && var31 < 128 - var2 && 0 == class162.field1899[var30 - 1][1 + var31] && (var19[var20 - 1][var21 + var2] & 19136824) == 0) {
                              for(var23 = 1; var23 < var2; ++var23) {
                                 if ((var19[var20 - 1][var23 + var21] & 19136830) != 0 || 0 != (var19[var20 - 1 + var23][var21 + var2] & 19137016)) {
                                    continue label433;
                                 }
                              }

                              class162.field1902[var33] = var11 - 1;
                              class162.field1905[var33] = 1 + var12;
                              var33 = var33 + 1 & 4095;
                              class162.field1899[var30 - 1][1 + var31] = 6;
                              class162.field1900[var30 - 1][var31 + 1] = var22;
                           }
                        } while(var30 >= 128 - var2);
                     } while(var31 >= 128 - var2);
                  } while(class162.field1899[1 + var30][var31 + 1] != 0);
               } while(0 != (var19[var20 + var2][var21 + var2] & 19136992));

               for(var23 = 1; var23 < var2; ++var23) {
                  if ((var19[var23 + var20][var21 + var2] & 19137016) != 0 || (var19[var2 + var20][var21 + var23] & 19136995) != 0) {
                     continue label456;
                  }
               }

               class162.field1902[var33] = var11 + 1;
               class162.field1905[var33] = var12 + 1;
               var33 = var33 + 1 & 4095;
               class162.field1899[1 + var30][var31 + 1] = 12;
               class162.field1900[1 + var30][var31 + 1] = var22;
            }
         }

         var28 = var29;
      }

      var10 = var0 - 64;
      var11 = var1 - 64;
      var12 = class27.field220;
      var30 = class162.field1897;
      if (!var28) {
         if (!var5) {
            return -1;
         }

         var31 = Integer.MAX_VALUE;
         var15 = Integer.MAX_VALUE;
         byte var32 = 10;
         var33 = var3.field1894;
         var18 = var3.field1892;
         int var34 = var3.field1893;
         var20 = var3.field1891;

         for(var21 = var33 - var32; var21 <= var32 + var33; ++var21) {
            for(var22 = var18 - var32; var22 <= var18 + var32; ++var22) {
               var23 = var21 - var10;
               int var24 = var22 - var11;
               if (var23 >= 0 && var24 >= 0 && var23 < 128 && var24 < 128 && class162.field1900[var23][var24] < 100) {
                  int var25 = 0;
                  if (var21 < var33) {
                     var25 = var33 - var21;
                  } else if (var21 > var34 + var33 - 1) {
                     var25 = var21 - (var34 + var33 - 1);
                  }

                  int var26 = 0;
                  if (var22 < var18) {
                     var26 = var18 - var22;
                  } else if (var22 > var18 + var20 - 1) {
                     var26 = var22 - (var20 + var18 - 1);
                  }

                  int var27 = var26 * var26 + var25 * var25;
                  if (var27 < var31 || var27 == var31 && class162.field1900[var23][var24] < var15) {
                     var31 = var27;
                     var15 = class162.field1900[var23][var24];
                     var12 = var21;
                     var30 = var22;
                  }
               }
            }
         }

         if (Integer.MAX_VALUE == var31) {
            return -1;
         }
      }

      if (var12 == var0 && var1 == var30) {
         return 0;
      } else {
         var14 = 0;
         class162.field1902[var14] = var12;
         var31 = var14 + 1;
         class162.field1905[var14] = var30;

         for(var15 = var16 = class162.field1899[var12 - var10][var30 - var11]; var0 != var12 || var30 != var1; var15 = class162.field1899[var12 - var10][var30 - var11]) {
            if (var15 != var16) {
               var16 = var15;
               class162.field1902[var31] = var12;
               class162.field1905[var31++] = var30;
            }

            if (0 != (var15 & 2)) {
               ++var12;
            } else if ((var15 & 8) != 0) {
               --var12;
            }

            if (0 != (var15 & 1)) {
               ++var30;
            } else if ((var15 & 4) != 0) {
               --var30;
            }
         }

         var33 = 0;

         while(var31-- > 0) {
            var6[var33] = class162.field1902[var31];
            var7[var33++] = class162.field1905[var31];
            if (var33 >= var6.length) {
               break;
            }
         }

         return var33;
      }
   }

   static {
      new BitSet(65536);
   }

   public class124(Buffer var1) {
      this.method2224(var1);
   }

   public int[] method2223() {
      if (null == this.field1433) {
         String[] var2 = new String[this.field1436.size()];
         this.field1433 = new int[this.field1436.size()];

         for(int var3 = 0; var3 < this.field1436.size(); this.field1433[var3] = var3++) {
            var2[var3] = ((class106)this.field1436.get(var3)).field1303.method6522();
         }

         class283.method4547(var2, this.field1433);
      }

      return this.field1433;
   }

   void method2229(class106 var1) {
      this.field1436.add(var1);
      this.field1433 = null;
   }

   void method2220(int var1) {
      this.field1436.remove(var1);
      this.field1433 = null;
   }

   public int method2230() {
      return this.field1436.size();
   }

   public int method2222(String var1) {
      if (!this.field1435) {
         throw new RuntimeException("Displaynames not available");
      } else {
         for(int var3 = 0; var3 < this.field1436.size(); ++var3) {
            if (((class106)this.field1436.get(var3)).field1303.getName().equalsIgnoreCase(var1)) {
               return var3;
            }
         }

         return -1;
      }
   }

   void method2224(Buffer var1) {
      int var3 = var1.readUnsignedByte();
      if (0 != (var3 & 1)) {
         this.field1432 = true;
      }

      if ((var3 & 2) != 0) {
         this.field1435 = true;
      }

      int var4 = 2;
      if (0 != (var3 & 4)) {
         var4 = var1.readUnsignedByte();
      }

      super.field3966 = var1.method5954();
      this.field1434 = var1.method5954();
      this.field1430 = var1.readStringNullTerminated();
      var1.method6178();
      this.field1437 = var1.readByte();
      this.field1431 = var1.readByte();
      int var5 = var1.readUnsignedShort();
      if (var5 > 0) {
         this.field1436 = new ArrayList(var5);

         for(int var6 = 0; var6 < var5; ++var6) {
            class106 var7 = new class106();
            if (this.field1432) {
               var1.method5954();
            }

            if (this.field1435) {
               var7.field1303 = new class406(var1.readStringNullTerminated());
            }

            var7.field1306 = var1.readByte();
            var7.field1302 = var1.readUnsignedShort();
            if (var4 >= 3) {
               var1.method6178();
            }

            this.field1436.add(var6, var7);
         }
      }

   }

   public static class156 method2243(int var0) {
      class156 var2 = (class156)class156.field1784.method3880((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = class156.field1735.method4412(6, var0);
         var2 = new class156();
         var2.field1753 = var0;
         if (var3 != null) {
            var2.method2637(new Buffer(var3));
         }

         var2.method2628();
         if (var2.field1785) {
            var2.field1752 = 0;
            var2.field1779 = false;
         }

         class156.field1784.method3882(var2, (long)var0);
         return var2;
      }
   }

   static final void method2242(boolean var0) {
      for(int var2 = 0; var2 < client.npcCount; ++var2) {
         Npc var3 = client.npcs[client.npcIndexes[var2]];
         if (null != var3 && var3.method1748() && var3.definition.field1641 == var0 && var3.definition.method2472()) {
            int var4 = var3.x >> 7;
            int var5 = var3.y >> 7;
            if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
               if (var3.size == 1 && 64 == (var3.x & 127) && 64 == (var3.y & 127)) {
                  if (client.field505 == client.field502[var4][var5]) {
                     continue;
                  }

                  client.field502[var4][var5] = client.field505;
               }

               long var6 = class172.method3133(0, 0, 1, !var3.definition.field1649, client.npcIndexes[var2]);
               var3.field1025 = client.cycle;
               class166.field1925.method3508(class285.plane, var3.x, var3.y, class123.method2216(var3.size * 64 - 64 + var3.x, var3.size * 64 - 64 + var3.y, class285.plane), 60 + (var3.size * 64 - 64), var3, var3.movementDirection, var6, var3.field1023);
            }
         }
      }

   }
}
