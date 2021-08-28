import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class class13 extends Canvas {
   public static class49 field80;
   static class132 field79;
   static Interface field78;
   Component field76;

   class13(Component var1) {
      this.field76 = var1;
   }

   public final void update(Graphics var1) {
      this.field76.update(var1);
   }

   public final void paint(Graphics var1) {
      this.field76.paint(var1);
   }

   static File method110(String var0, String var1, int var2) {
      String var4 = var2 == 0 ? "" : "" + var2;
      class131.field1476 = new File(class235.field2823, "jagex_cl_" + var0 + "_" + var1 + var4 + ".dat");
      String var5 = null;
      String var6 = null;
      boolean var7 = false;
      Buffer var9;
      int var12;
      File var23;
      if (class131.field1476.exists()) {
         try {
            class369 var8 = new class369(class131.field1476, "rw", 10000L);

            int var10;
            for(var9 = new Buffer((int)var8.method5773()); var9.offset < var9.payload.length; var9.offset += var10) {
               var10 = var8.method5779(var9.payload, var9.offset, var9.payload.length - var9.offset);
               if (-1 == var10) {
                  throw new IOException();
               }
            }

            var9.offset = 0;
            var10 = var9.readUnsignedByte();
            if (var10 < 1 || var10 > 3) {
               throw new IOException("" + var10);
            }

            int var11 = 0;
            if (var10 > 1) {
               var11 = var9.readUnsignedByte();
            }

            if (var10 <= 2) {
               var5 = var9.method6094();
               if (1 == var11) {
                  var6 = var9.method6094();
               }
            } else {
               var5 = var9.method5959();
               if (var11 == 1) {
                  var6 = var9.method5959();
               }
            }

            var8.method5776();
         } catch (IOException var20) {
            var20.printStackTrace();
         }

         if (var5 != null) {
            var23 = new File(var5);
            if (!var23.exists()) {
               var5 = null;
            }
         }

         if (null != var5) {
            var23 = new File(var5, "test.dat");

            boolean var25;
            try {
               RandomAccessFile var28 = new RandomAccessFile(var23, "rw");
               var12 = var28.read();
               var28.seek(0L);
               var28.write(var12);
               var28.seek(0L);
               var28.close();
               var23.delete();
               var25 = true;
            } catch (Exception var18) {
               var25 = false;
            }

            if (!var25) {
               var5 = null;
            }
         }
      }

      if (var5 == null && var2 == 0) {
         label152:
         for(int var21 = 0; var21 < class255.field3127.length; ++var21) {
            for(int var24 = 0; var24 < class96.field1254.length; ++var24) {
               File var26 = new File(class96.field1254[var24] + class255.field3127[var21] + File.separatorChar + var0 + File.separatorChar);
               if (var26.exists()) {
                  File var29 = new File(var26, "test.dat");

                  boolean var31;
                  try {
                     RandomAccessFile var13 = new RandomAccessFile(var29, "rw");
                     int var14 = var13.read();
                     var13.seek(0L);
                     var13.write(var14);
                     var13.seek(0L);
                     var13.close();
                     var29.delete();
                     var31 = true;
                  } catch (Exception var17) {
                     var31 = false;
                  }

                  if (var31) {
                     var5 = var26.toString();
                     var7 = true;
                     break label152;
                  }
               }
            }
         }
      }

      if (var5 == null) {
         var5 = class235.field2823 + File.separatorChar + "jagexcache" + var4 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
         var7 = true;
      }

      File var22;
      if (null != var6) {
         var22 = new File(var6);
         var23 = new File(var5);

         try {
            File[] var27 = var22.listFiles();
            File[] var33 = var27;

            for(var12 = 0; var12 < var33.length; ++var12) {
               File var32 = var33[var12];
               File var35 = new File(var23, var32.getName());
               boolean var15 = var32.renameTo(var35);
               if (!var15) {
                  throw new IOException();
               }
            }
         } catch (Exception var19) {
            var19.printStackTrace();
         }

         var7 = true;
      }

      if (var7) {
         var22 = new File(var5);
         var9 = null;

         try {
            class369 var30 = new class369(class131.field1476, "rw", 10000L);
            Buffer var34 = new Buffer(500);
            var34.writeByte(3);
            var34.writeByte(var9 != null ? 1 : 0);
            var34.method5940(var22.getPath());
            if (null != var9) {
               var34.method5940(var22.getPath());
            }

            var30.method5780(var34.payload, 0, var34.offset);
            var30.method5776();
         } catch (IOException var16) {
            var16.printStackTrace();
         }
      }

      return new File(var5);
   }

   static final void method106(class31 var0) {
      var0.field251 = false;
      if (var0.field253 != null) {
         var0.field253.field350 = 0;
      }

      for(class31 var2 = var0.method643(); var2 != null; var2 = var0.method631()) {
         method106(var2);
      }

   }

   static final void method105(int var0, int var1, int var2, int var3, int var4, int var5, int var6, Scene var7, class160 var8) {
      class156 var10 = class124.method2243(var4);
      int var11;
      int var12;
      if (var5 != 1 && 3 != var5) {
         var11 = var10.field1750;
         var12 = var10.field1751;
      } else {
         var11 = var10.field1751;
         var12 = var10.field1750;
      }

      int var13;
      int var14;
      if (var2 + var11 <= 104) {
         var13 = var2 + (var11 >> 1);
         var14 = (var11 + 1 >> 1) + var2;
      } else {
         var13 = var2;
         var14 = var2 + 1;
      }

      int var15;
      int var16;
      if (var3 + var12 <= 104) {
         var15 = var3 + (var12 >> 1);
         var16 = var3 + (var12 + 1 >> 1);
      } else {
         var15 = var3;
         var16 = var3 + 1;
      }

      int[][] var17 = class62.field911[var1];
      int var18 = var17[var14][var16] + var17[var13][var15] + var17[var14][var15] + var17[var13][var16] >> 2;
      int var19 = (var11 << 6) + (var2 << 7);
      int var20 = (var3 << 7) + (var12 << 6);
      long var21 = class172.method3133(var2, var3, 2, var10.field1754 == 0, var4);
      int var23 = var6 + (var5 << 6);
      if (1 == var10.field1775) {
         var23 += 256;
      }

      Object var24;
      if (22 == var6) {
         if (var10.field1758 == -1 && null == var10.field1762) {
            var24 = var10.method2644(22, var5, var17, var19, var18, var20);
         } else {
            var24 = new class60(var4, 22, var5, var1, var2, var3, var10.field1758, var10.field1734, (class201)null);
         }

         var7.method3625(var0, var2, var3, var18, (class201)var24, var21, var23);
         if (var10.field1752 == 1) {
            var8.method2834(var2, var3);
         }

      } else if (10 != var6 && 11 != var6) {
         if (var6 >= 12) {
            if (-1 == var10.field1758 && var10.field1762 == null) {
               var24 = var10.method2644(var6, var5, var17, var19, var18, var20);
            } else {
               var24 = new class60(var4, var6, var5, var1, var2, var3, var10.field1758, var10.field1734, (class201)null);
            }

            var7.method3507(var0, var2, var3, var18, 1, 1, (class201)var24, 0, var21, var23);
            if (var10.field1752 != 0) {
               var8.method2840(var2, var3, var11, var12, var10.field1779);
            }

         } else if (0 == var6) {
            if (var10.field1758 == -1 && null == var10.field1762) {
               var24 = var10.method2644(0, var5, var17, var19, var18, var20);
            } else {
               var24 = new class60(var4, 0, var5, var1, var2, var3, var10.field1758, var10.field1734, (class201)null);
            }

            var7.method3505(var0, var2, var3, var18, (class201)var24, (class201)null, class62.field908[var5], 0, var21, var23);
            if (0 != var10.field1752) {
               var8.method2809(var2, var3, var6, var5, var10.field1779);
            }

         } else if (1 == var6) {
            if (var10.field1758 == -1 && null == var10.field1762) {
               var24 = var10.method2644(1, var5, var17, var19, var18, var20);
            } else {
               var24 = new class60(var4, 1, var5, var1, var2, var3, var10.field1758, var10.field1734, (class201)null);
            }

            var7.method3505(var0, var2, var3, var18, (class201)var24, (class201)null, class62.field909[var5], 0, var21, var23);
            if (var10.field1752 != 0) {
               var8.method2809(var2, var3, var6, var5, var10.field1779);
            }

         } else {
            int var30;
            if (2 == var6) {
               var30 = 1 + var5 & 3;
               Object var26;
               Object var32;
               if (-1 == var10.field1758 && null == var10.field1762) {
                  var32 = var10.method2644(2, 4 + var5, var17, var19, var18, var20);
                  var26 = var10.method2644(2, var30, var17, var19, var18, var20);
               } else {
                  var32 = new class60(var4, 2, 4 + var5, var1, var2, var3, var10.field1758, var10.field1734, (class201)null);
                  var26 = new class60(var4, 2, var30, var1, var2, var3, var10.field1758, var10.field1734, (class201)null);
               }

               var7.method3505(var0, var2, var3, var18, (class201)var32, (class201)var26, class62.field908[var5], class62.field908[var30], var21, var23);
               if (var10.field1752 != 0) {
                  var8.method2809(var2, var3, var6, var5, var10.field1779);
               }

            } else if (var6 == 3) {
               if (var10.field1758 == -1 && var10.field1762 == null) {
                  var24 = var10.method2644(3, var5, var17, var19, var18, var20);
               } else {
                  var24 = new class60(var4, 3, var5, var1, var2, var3, var10.field1758, var10.field1734, (class201)null);
               }

               var7.method3505(var0, var2, var3, var18, (class201)var24, (class201)null, class62.field909[var5], 0, var21, var23);
               if (var10.field1752 != 0) {
                  var8.method2809(var2, var3, var6, var5, var10.field1779);
               }

            } else if (9 == var6) {
               if (-1 == var10.field1758 && null == var10.field1762) {
                  var24 = var10.method2644(var6, var5, var17, var19, var18, var20);
               } else {
                  var24 = new class60(var4, var6, var5, var1, var2, var3, var10.field1758, var10.field1734, (class201)null);
               }

               var7.method3507(var0, var2, var3, var18, 1, 1, (class201)var24, 0, var21, var23);
               if (0 != var10.field1752) {
                  var8.method2840(var2, var3, var11, var12, var10.field1779);
               }

            } else if (var6 == 4) {
               if (var10.field1758 == -1 && var10.field1762 == null) {
                  var24 = var10.method2644(4, var5, var17, var19, var18, var20);
               } else {
                  var24 = new class60(var4, 4, var5, var1, var2, var3, var10.field1758, var10.field1734, (class201)null);
               }

               var7.method3506(var0, var2, var3, var18, (class201)var24, (class201)null, class62.field908[var5], 0, 0, 0, var21, var23);
            } else {
               long var25;
               Object var27;
               if (5 == var6) {
                  var30 = 16;
                  var25 = var7.method3523(var0, var2, var3);
                  if (0L != var25) {
                     var30 = class124.method2243(class79.method1843(var25)).field1745;
                  }

                  if (var10.field1758 == -1 && var10.field1762 == null) {
                     var27 = var10.method2644(4, var5, var17, var19, var18, var20);
                  } else {
                     var27 = new class60(var4, 4, var5, var1, var2, var3, var10.field1758, var10.field1734, (class201)null);
                  }

                  var7.method3506(var0, var2, var3, var18, (class201)var27, (class201)null, class62.field908[var5], 0, var30 * class62.field906[var5], class62.field913[var5] * var30, var21, var23);
               } else if (var6 == 6) {
                  var30 = 8;
                  var25 = var7.method3523(var0, var2, var3);
                  if (0L != var25) {
                     var30 = class124.method2243(class79.method1843(var25)).field1745 / 2;
                  }

                  if (-1 == var10.field1758 && null == var10.field1762) {
                     var27 = var10.method2644(4, 4 + var5, var17, var19, var18, var20);
                  } else {
                     var27 = new class60(var4, 4, 4 + var5, var1, var2, var3, var10.field1758, var10.field1734, (class201)null);
                  }

                  var7.method3506(var0, var2, var3, var18, (class201)var27, (class201)null, 256, var5, var30 * class62.field904[var5], var30 * class62.field915[var5], var21, var23);
               } else if (7 == var6) {
                  int var31 = var5 + 2 & 3;
                  if (var10.field1758 == -1 && null == var10.field1762) {
                     var24 = var10.method2644(4, 4 + var31, var17, var19, var18, var20);
                  } else {
                     var24 = new class60(var4, 4, 4 + var31, var1, var2, var3, var10.field1758, var10.field1734, (class201)null);
                  }

                  var7.method3506(var0, var2, var3, var18, (class201)var24, (class201)null, 256, var31, 0, 0, var21, var23);
               } else if (var6 == 8) {
                  var30 = 8;
                  var25 = var7.method3523(var0, var2, var3);
                  if (var25 != 0L) {
                     var30 = class124.method2243(class79.method1843(var25)).field1745 / 2;
                  }

                  int var29 = var5 + 2 & 3;
                  Object var28;
                  if (var10.field1758 == -1 && var10.field1762 == null) {
                     var27 = var10.method2644(4, var5 + 4, var17, var19, var18, var20);
                     var28 = var10.method2644(4, 4 + var29, var17, var19, var18, var20);
                  } else {
                     var27 = new class60(var4, 4, var5 + 4, var1, var2, var3, var10.field1758, var10.field1734, (class201)null);
                     var28 = new class60(var4, 4, 4 + var29, var1, var2, var3, var10.field1758, var10.field1734, (class201)null);
                  }

                  var7.method3506(var0, var2, var3, var18, (class201)var27, (class201)var28, 256, var5, class62.field904[var5] * var30, var30 * class62.field915[var5], var21, var23);
               }
            }
         }
      } else {
         if (-1 == var10.field1758 && var10.field1762 == null) {
            var24 = var10.method2644(10, var5, var17, var19, var18, var20);
         } else {
            var24 = new class60(var4, 10, var5, var1, var2, var3, var10.field1758, var10.field1734, (class201)null);
         }

         if (null != var24) {
            var7.method3507(var0, var2, var3, var18, var11, var12, (class201)var24, 11 == var6 ? 256 : 0, var21, var23);
         }

         if (var10.field1752 != 0) {
            var8.method2840(var2, var3, var11, var12, var10.field1779);
         }

      }
   }

   public static void method108() {
      Interface.field2952.method3883();
      Interface.field2953.method3883();
      Interface.field2954.method3883();
      Interface.field2999.method3883();
   }

   static int method109(int var0, class59 var1, boolean var2) {
      if (3300 == var0) {
         class51.field747[++class51.field746 - 1] = client.field452;
         return 1;
      } else {
         int var4;
         int var5;
         if (3301 == var0) {
            class51.field746 -= 2;
            var4 = class51.field747[class51.field746];
            var5 = class51.field747[class51.field746 + 1];
            class51.field747[++class51.field746 - 1] = class214.method3849(var4, var5);
            return 1;
         } else if (3302 == var0) {
            class51.field746 -= 2;
            var4 = class51.field747[class51.field746];
            var5 = class51.field747[1 + class51.field746];
            class51.field747[++class51.field746 - 1] = class93.method2039(var4, var5);
            return 1;
         } else if (3303 == var0) {
            class51.field746 -= 2;
            var4 = class51.field747[class51.field746];
            var5 = class51.field747[1 + class51.field746];
            class51.field747[++class51.field746 - 1] = class258.method4326(var4, var5);
            return 1;
         } else if (3304 == var0) {
            var4 = class51.field747[--class51.field746];
            class51.field747[++class51.field746 - 1] = class101.method2078(var4).field1523;
            return 1;
         } else if (3305 == var0) {
            var4 = class51.field747[--class51.field746];
            class51.field747[++class51.field746 - 1] = client.field435[var4];
            return 1;
         } else if (3306 == var0) {
            var4 = class51.field747[--class51.field746];
            class51.field747[++class51.field746 - 1] = client.field541[var4];
            return 1;
         } else if (3307 == var0) {
            var4 = class51.field747[--class51.field746];
            class51.field747[++class51.field746 - 1] = client.field542[var4];
            return 1;
         } else {
            int var6;
            if (var0 == 3308) {
               var4 = class285.plane;
               var5 = class281.baseX + (MouseHandler.localPlayer.x >> 7);
               var6 = class78.baseY + (MouseHandler.localPlayer.y >> 7);
               class51.field747[++class51.field746 - 1] = var6 + (var5 << 14) + (var4 << 28);
               return 1;
            } else if (3309 == var0) {
               var4 = class51.field747[--class51.field746];
               class51.field747[++class51.field746 - 1] = var4 >> 14 & 16383;
               return 1;
            } else if (var0 == 3310) {
               var4 = class51.field747[--class51.field746];
               class51.field747[++class51.field746 - 1] = var4 >> 28;
               return 1;
            } else if (var0 == 3311) {
               var4 = class51.field747[--class51.field746];
               class51.field747[++class51.field746 - 1] = var4 & 16383;
               return 1;
            } else if (3312 == var0) {
               class51.field747[++class51.field746 - 1] = client.field562 ? 1 : 0;
               return 1;
            } else if (var0 == 3313) {
               class51.field746 -= 2;
               var4 = class51.field747[class51.field746] + '\u8000';
               var5 = class51.field747[class51.field746 + 1];
               class51.field747[++class51.field746 - 1] = class214.method3849(var4, var5);
               return 1;
            } else if (3314 == var0) {
               class51.field746 -= 2;
               var4 = '\u8000' + class51.field747[class51.field746];
               var5 = class51.field747[class51.field746 + 1];
               class51.field747[++class51.field746 - 1] = class93.method2039(var4, var5);
               return 1;
            } else if (var0 == 3315) {
               class51.field746 -= 2;
               var4 = '\u8000' + class51.field747[class51.field746];
               var5 = class51.field747[1 + class51.field746];
               class51.field747[++class51.field746 - 1] = class258.method4326(var4, var5);
               return 1;
            } else if (var0 == 3316) {
               if (client.privilegeLevel >= 2) {
                  class51.field747[++class51.field746 - 1] = client.privilegeLevel;
               } else {
                  class51.field747[++class51.field746 - 1] = 0;
               }

               return 1;
            } else if (var0 == 3317) {
               class51.field747[++class51.field746 - 1] = client.field423;
               return 1;
            } else if (3318 == var0) {
               class51.field747[++class51.field746 - 1] = client.field405;
               return 1;
            } else if (3321 == var0) {
               class51.field747[++class51.field746 - 1] = client.field432;
               return 1;
            } else if (3322 == var0) {
               class51.field747[++class51.field746 - 1] = client.field576;
               return 1;
            } else if (var0 == 3323) {
               if (client.isPlayerModerator) {
                  class51.field747[++class51.field746 - 1] = 1;
               } else {
                  class51.field747[++class51.field746 - 1] = 0;
               }

               return 1;
            } else if (3324 == var0) {
               class51.field747[++class51.field746 - 1] = client.field406;
               return 1;
            } else if (3325 == var0) {
               class51.field746 -= 4;
               var4 = class51.field747[class51.field746];
               var5 = class51.field747[class51.field746 + 1];
               var6 = class51.field747[2 + class51.field746];
               int var7 = class51.field747[3 + class51.field746];
               var4 += var5 << 14;
               var4 += var6 << 28;
               var4 += var7;
               class51.field747[++class51.field746 - 1] = var4;
               return 1;
            } else if (3326 == var0) {
               class51.field747[++class51.field746 - 1] = client.field418;
               return 1;
            } else if (3327 == var0) {
               class51.field747[++class51.field746 - 1] = client.field419;
               return 1;
            } else {
               return 2;
            }
         }
      }
   }

   static final void method99(class228 var0) {
      PacketBuffer var2 = client.packetWriter.field1201;
      byte var4;
      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      int var32;
      int var33;
      int var34;
      if (var0 == class228.field2676) {
         var32 = var2.readUnsignedByte();
         var4 = var2.method5935();
         var34 = var2.readUnsignedShortLE();
         var6 = var2.readUnsignedShortADD();
         byte var36 = var2.readByte();
         var8 = var2.readUnsignedByteADD();
         var9 = class292.field3695 + (var8 >> 4 & 7);
         var10 = (var8 & 7) + class58.field859;
         var11 = var2.readUnsignedByteSUB() * 4;
         var12 = var2.readUnsignedByteADD() * 4;
         var13 = var2.method5989();
         var14 = var2.readUnsignedByteNEG();
         var15 = var2.readUnsignedShort();
         var33 = var4 + var9;
         var7 = var36 + var10;
         if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104 && var33 >= 0 && var7 >= 0 && var33 < 104 && var7 < 104 && 65535 != var6) {
            var9 = var9 * 128 + 64;
            var10 = 64 + 128 * var10;
            var33 = var33 * 128 + 64;
            var7 = 128 * var7 + 64;
            class57 var45 = new class57(var6, class285.plane, var9, var10, class123.method2216(var9, var10, class285.plane) - var12, client.field452 + var15, var34 + client.field452, var32, var14, var13, var11);
            var45.method1582(var33, var7, class123.method2216(var33, var7, class285.plane) - var11, client.field452 + var15);
            client.field538.method4672(var45);
         }

      } else {
         if (class228.field2677 == var0) {
            byte var3 = var2.method5981();
            var4 = var2.method5981();
            byte var5 = var2.method5980();
            var6 = var2.readUnsignedShortADD();
            var7 = var2.readUnsignedShort();
            var8 = var2.readUnsignedShortLEADD();
            var9 = var2.readUnsignedByteNEG();
            var10 = var9 >> 2;
            var11 = var9 & 3;
            var12 = client.field468[var10];
            var13 = var2.readUnsignedByteADD();
            var14 = (var13 >> 4 & 7) + class292.field3695;
            var15 = (var13 & 7) + class58.field859;
            byte var16 = var2.method5980();
            int var17 = var2.readUnsignedShortADD();
            Player var18;
            if (var8 == client.localPlayerIndex) {
               var18 = MouseHandler.localPlayer;
            } else {
               var18 = client.localPlayers[var8];
            }

            if (null != var18) {
               class156 var19 = class124.method2243(var7);
               int var20;
               int var21;
               if (1 != var11 && 3 != var11) {
                  var20 = var19.field1750;
                  var21 = var19.field1751;
               } else {
                  var20 = var19.field1751;
                  var21 = var19.field1750;
               }

               int var22 = (var20 >> 1) + var14;
               int var23 = (1 + var20 >> 1) + var14;
               int var24 = var15 + (var21 >> 1);
               int var25 = var15 + (1 + var21 >> 1);
               int[][] var26 = class62.field911[class285.plane];
               int var27 = var26[var23][var25] + var26[var22][var25] + var26[var22][var24] + var26[var23][var24] >> 2;
               int var28 = (var20 << 6) + (var14 << 7);
               int var29 = (var21 << 6) + (var15 << 7);
               class207 var30 = var19.method2644(var10, var11, var26, var28, var27, var29);
               if (var30 != null) {
                  class65.method1665(class285.plane, var14, var15, var12, -1, 0, 0, 1 + var17, var6 + 1);
                  var18.field986 = var17 + client.field452;
                  var18.field987 = var6 + client.field452;
                  var18.field981 = var30;
                  var18.field983 = var14 * 128 + 64 * var20;
                  var18.field990 = var21 * 64 + 128 * var15;
                  var18.field984 = var27;
                  byte var31;
                  if (var3 > var16) {
                     var31 = var3;
                     var3 = var16;
                     var16 = var31;
                  }

                  if (var5 > var4) {
                     var31 = var5;
                     var5 = var4;
                     var4 = var31;
                  }

                  var18.field978 = var14 + var3;
                  var18.field994 = var16 + var14;
                  var18.field993 = var5 + var15;
                  var18.field989 = var15 + var4;
               }
            }
         }

         if (class228.field2683 == var0) {
            var32 = var2.readUnsignedByteADD();
            var33 = class292.field3695 + (var32 >> 4 & 7);
            var34 = class58.field859 + (var32 & 7);
            var6 = var2.readUnsignedByteSUB();
            var7 = var2.readUnsignedShortLEADD();
            var8 = var2.readUnsignedShortLEADD();
            if (var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104) {
               var33 = 64 + 128 * var33;
               var34 = 64 + 128 * var34;
               class52 var39 = new class52(var8, class285.plane, var33, var34, class123.method2216(var33, var34, class285.plane) - var6, var7, client.field452);
               client.field539.method4672(var39);
            }

         } else if (class228.field2684 == var0) {
            var32 = var2.readUnsignedShortLEADD();
            var33 = var2.readUnsignedByteSUB();
            var34 = class292.field3695 + (var33 >> 4 & 7);
            var6 = (var33 & 7) + class58.field859;
            var7 = var2.readUnsignedShortLE();
            var8 = var2.readUnsignedShort();
            if (var34 >= 0 && var6 >= 0 && var34 < 104 && var6 < 104) {
               class296 var38 = client.field536[class285.plane][var34][var6];
               if (null != var38) {
                  for(class82 var40 = (class82)var38.method4687(); null != var40; var40 = (class82)var38.method4678()) {
                     if (var40.field1167 == (var7 & 32767) && var8 == var40.field1164) {
                        var40.field1164 = var32;
                        break;
                     }
                  }

                  class49.method1382(var34, var6);
               }
            }

         } else {
            class82 var37;
            if (class228.field2681 == var0) {
               var32 = var2.readUnsignedByteNEG();
               var33 = class292.field3695 + (var32 >> 4 & 7);
               var34 = class58.field859 + (var32 & 7);
               var6 = var2.readUnsignedShortADD();
               if (var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104) {
                  class296 var35 = client.field536[class285.plane][var33][var34];
                  if (null != var35) {
                     for(var37 = (class82)var35.method4687(); var37 != null; var37 = (class82)var35.method4678()) {
                        if (var37.field1167 == (var6 & 32767)) {
                           var37.remove();
                           break;
                        }
                     }

                     if (var35.method4687() == null) {
                        client.field536[class285.plane][var33][var34] = null;
                     }

                     class49.method1382(var33, var34);
                  }
               }

            } else if (var0 == class228.field2679) {
               var32 = var2.readUnsignedByte();
               var33 = (var32 >> 4 & 7) + class292.field3695;
               var34 = class58.field859 + (var32 & 7);
               var6 = var2.readUnsignedByteNEG();
               var7 = var6 >> 2;
               var8 = var6 & 3;
               var9 = client.field468[var7];
               if (var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104) {
                  class65.method1665(class285.plane, var33, var34, var9, -1, var7, var8, 0, -1);
               }

            } else {
               if (class228.field2682 == var0) {
                  var32 = var2.readUnsignedShort();
                  var33 = var2.readUnsignedByteNEG();
                  var34 = (var33 >> 4 & 7) + class292.field3695;
                  var6 = (var33 & 7) + class58.field859;
                  var7 = var2.readUnsignedByte();
                  var8 = var7 >> 4 & 15;
                  var9 = var7 & 7;
                  var10 = var2.readUnsignedByteNEG();
                  if (var34 >= 0 && var6 >= 0 && var34 < 104 && var6 < 104) {
                     var11 = var8 + 1;
                     if (MouseHandler.localPlayer.pathX[0] >= var34 - var11 && MouseHandler.localPlayer.pathX[0] <= var34 + var11 && MouseHandler.localPlayer.pathY[0] >= var6 - var11 && MouseHandler.localPlayer.pathY[0] <= var6 + var11 && class38.clientPreferences.field1116 != 0 && var9 > 0 && client.field498 < 50) {
                        client.field629[client.field498] = var32;
                        client.field651[client.field498] = var9;
                        client.field652[client.field498] = var10;
                        client.field654[client.field498] = null;
                        client.field653[client.field498] = var8 + (var34 << 16) + (var6 << 8);
                        ++client.field498;
                     }
                  }
               }

               if (class228.field2675 == var0) {
                  var32 = var2.readUnsignedByteNEG();
                  var33 = (var32 >> 4 & 7) + class292.field3695;
                  var34 = class58.field859 + (var32 & 7);
                  var6 = var2.readUnsignedShortLE();
                  var7 = var2.readUnsignedShortLE();
                  if (var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104) {
                     var37 = new class82();
                     var37.field1167 = var6;
                     var37.field1164 = var7;
                     if (client.field536[class285.plane][var33][var34] == null) {
                        client.field536[class285.plane][var33][var34] = new class296();
                     }

                     client.field536[class285.plane][var33][var34].method4672(var37);
                     class49.method1382(var33, var34);
                  }

               } else if (var0 != class228.field2678) {
                  if (var0 == class228.field2680) {
                     var32 = var2.readUnsignedByteNEG();
                     var33 = var32 >> 2;
                     var34 = var32 & 3;
                     var6 = client.field468[var33];
                     var7 = var2.readUnsignedByte();
                     var8 = (var7 >> 4 & 7) + class292.field3695;
                     var9 = class58.field859 + (var7 & 7);
                     var10 = var2.readUnsignedShort();
                     if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
                        class65.method1665(class285.plane, var8, var9, var6, var10, var33, var34, 0, -1);
                     }

                  }
               } else {
                  var32 = var2.readUnsignedByteADD();
                  var33 = class292.field3695 + (var32 >> 4 & 7);
                  var34 = class58.field859 + (var32 & 7);
                  var6 = var2.readUnsignedShortLEADD();
                  var7 = var2.readUnsignedByteSUB();
                  var8 = var7 >> 2;
                  var9 = var7 & 3;
                  var10 = client.field468[var8];
                  if (var33 >= 0 && var34 >= 0 && var33 < 103 && var34 < 103) {
                     if (var10 == 0) {
                        class212 var41 = class166.field1925.method3583(class285.plane, var33, var34);
                        if (var41 != null) {
                           var12 = class79.method1843(var41.field2516);
                           if (2 == var8) {
                              var41.field2514 = new class60(var12, 2, 4 + var9, class285.plane, var33, var34, var6, false, var41.field2514);
                              var41.field2515 = new class60(var12, 2, 1 + var9 & 3, class285.plane, var33, var34, var6, false, var41.field2515);
                           } else {
                              var41.field2514 = new class60(var12, var8, var9, class285.plane, var33, var34, var6, false, var41.field2514);
                           }
                        }
                     }

                     if (1 == var10) {
                        class214 var42 = class166.field1925.method3520(class285.plane, var33, var34);
                        if (null != var42) {
                           var12 = class79.method1843(var42.field2523);
                           if (4 != var8 && var8 != 5) {
                              if (var8 == 6) {
                                 var42.field2528 = new class60(var12, 4, 4 + var9, class285.plane, var33, var34, var6, false, var42.field2528);
                              } else if (var8 == 7) {
                                 var42.field2528 = new class60(var12, 4, 4 + (2 + var9 & 3), class285.plane, var33, var34, var6, false, var42.field2528);
                              } else if (var8 == 8) {
                                 var42.field2528 = new class60(var12, 4, var9 + 4, class285.plane, var33, var34, var6, false, var42.field2528);
                                 var42.field2529 = new class60(var12, 4, 4 + (2 + var9 & 3), class285.plane, var33, var34, var6, false, var42.field2529);
                              }
                           } else {
                              var42.field2528 = new class60(var12, 4, var9, class285.plane, var33, var34, var6, false, var42.field2528);
                           }
                        }
                     }

                     if (var10 == 2) {
                        class215 var43 = class166.field1925.method3566(class285.plane, var33, var34);
                        if (var8 == 11) {
                           var8 = 10;
                        }

                        if (var43 != null) {
                           var43.field2536 = new class60(class79.method1843(var43.field2538), var8, var9, class285.plane, var33, var34, var6, false, var43.field2536);
                        }
                     }

                     if (var10 == 3) {
                        class194 var44 = class166.field1925.method3522(class285.plane, var33, var34);
                        if (var44 != null) {
                           var44.field2195 = new class60(class79.method1843(var44.field2194), 22, var9, class285.plane, var33, var34, var6, false, var44.field2195);
                        }
                     }
                  }

               }
            }
         }
      }
   }
}
