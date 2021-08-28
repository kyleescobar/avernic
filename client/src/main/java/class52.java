import java.io.File;
import java.io.RandomAccessFile;

public final class class52 extends class201 {
   static class367 field761;
   static class397[] field770;
   static int field772;
   boolean field767 = false;
   class159 field764;
   int field758;
   int field759;
   int field760;
   int field762;
   int field763;
   int field766 = 0;
   int field768;
   int field769 = 0;

   class52(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.field768 = var1;
      this.field760 = var2;
      this.field758 = var3;
      this.field762 = var4;
      this.field763 = var5;
      this.field759 = var6 + var7;
      int var8 = class25.method403(this.field768).field1664;
      if (-1 != var8) {
         this.field767 = false;
         this.field764 = class48.method1312(var8);
      } else {
         this.field767 = true;
      }

   }

   final void method1531(int var1) {
      if (!this.field767) {
         this.field766 += var1;

         while(this.field766 > this.field764.field1865[this.field769]) {
            this.field766 -= this.field764.field1865[this.field769];
            ++this.field769;
            if (this.field769 >= this.field764.field1863.length) {
               this.field767 = true;
               break;
            }
         }

      }
   }

   public static class144 method1534(int var0) {
      class144 var2 = (class144)class144.field1580.method3880((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = class12.field72.method4412(33, var0);
         var2 = new class144();
         if (var3 != null) {
            var2.method2439(new Buffer(var3));
         }

         class144.field1580.method3882(var2, (long)var0);
         return var2;
      }
   }

   protected final class207 method3687() {
      class150 var2 = class25.method403(this.field768);
      class207 var3;
      if (!this.field767) {
         var3 = var2.method2498(this.field769);
      } else {
         var3 = var2.method2498(-1);
      }

      return var3 == null ? null : var3;
   }

   static boolean method1532(File var0, boolean var1) {
      try {
         RandomAccessFile var3 = new RandomAccessFile(var0, "rw");
         int var4 = var3.read();
         var3.seek(0L);
         var3.write(var4);
         var3.seek(0L);
         var3.close();
         if (var1) {
            var0.delete();
         }

         return true;
      } catch (Exception var5) {
         return false;
      }
   }

   static final int method1527(int var0, int var1) {
      if (-2 == var0) {
         return 12345678;
      } else if (-1 == var0) {
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return var1;
      } else {
         var1 = var1 * (var0 & 127) / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return var1 + (var0 & '\uff80');
      }
   }

   static void method1533(class302 var0, class302 var1) {
      if (class189.field2127 == null) {
         class189.field2127 = class61.method1618(class271.archive8, "sl_back", "");
      }

      class397[] var3;
      class275 var4;
      int var5;
      int var6;
      if (field770 == null) {
         var4 = class271.archive8;
         var5 = var4.readGroup("sl_flags");
         var6 = var4.method4430(var5, "");
         var3 = class133.method2305(var4, var5, var6);
         field770 = var3;
      }

      if (ApproximateRouteStrategy.field392 == null) {
         var4 = class271.archive8;
         var5 = var4.readGroup("sl_arrows");
         var6 = var4.method4430(var5, "");
         var3 = class133.method2305(var4, var5, var6);
         ApproximateRouteStrategy.field392 = var3;
      }

      if (class61.field897 == null) {
         var4 = class271.archive8;
         var5 = var4.readGroup("sl_stars");
         var6 = var4.method4430(var5, "");
         var3 = class133.method2305(var4, var5, var6);
         class61.field897 = var3;
      }

      if (class138.field1520 == null) {
         class138.field1520 = class118.method2187(class271.archive8, "leftarrow", "");
      }

      if (class96.field1257 == null) {
         class96.field1257 = class118.method2187(class271.archive8, "rightarrow", "");
      }

      class394.method6265(class56.field825, 23, 765, 480, 0);
      class394.method6266(class56.field825, 0, 125, 23, 12425273, 9135624);
      class394.method6266(class56.field825 + 125, 0, 640, 23, 5197647, 2697513);
      var0.method4922(class270.field3518, 62 + class56.field825, 15, 0, -1);
      if (class61.field897 != null) {
         class61.field897[1].method6349(class56.field825 + 140, 1);
         var1.method4853(class270.field3289, class56.field825 + 152, 10, 16777215, -1);
         class61.field897[0].method6349(140 + class56.field825, 12);
         var1.method4853(class270.field3520, 152 + class56.field825, 21, 16777215, -1);
      }

      if (ApproximateRouteStrategy.field392 != null) {
         int var23 = 280 + class56.field825;
         if (0 == class48.field696[0] && class48.field695[0] == 0) {
            ApproximateRouteStrategy.field392[2].method6349(var23, 4);
         } else {
            ApproximateRouteStrategy.field392[0].method6349(var23, 4);
         }

         if (0 == class48.field696[0] && 1 == class48.field695[0]) {
            ApproximateRouteStrategy.field392[3].method6349(var23 + 15, 4);
         } else {
            ApproximateRouteStrategy.field392[1].method6349(15 + var23, 4);
         }

         var0.method4853(class270.field3521, var23 + 32, 17, 16777215, -1);
         int var25 = class56.field825 + 390;
         if (class48.field696[0] == 1 && class48.field695[0] == 0) {
            ApproximateRouteStrategy.field392[2].method6349(var25, 4);
         } else {
            ApproximateRouteStrategy.field392[0].method6349(var25, 4);
         }

         if (1 == class48.field696[0] && 1 == class48.field695[0]) {
            ApproximateRouteStrategy.field392[3].method6349(15 + var25, 4);
         } else {
            ApproximateRouteStrategy.field392[1].method6349(var25 + 15, 4);
         }

         var0.method4853(class270.field3349, 32 + var25, 17, 16777215, -1);
         var5 = class56.field825 + 500;
         if (2 == class48.field696[0] && class48.field695[0] == 0) {
            ApproximateRouteStrategy.field392[2].method6349(var5, 4);
         } else {
            ApproximateRouteStrategy.field392[0].method6349(var5, 4);
         }

         if (2 == class48.field696[0] && class48.field695[0] == 1) {
            ApproximateRouteStrategy.field392[3].method6349(var5 + 15, 4);
         } else {
            ApproximateRouteStrategy.field392[1].method6349(var5 + 15, 4);
         }

         var0.method4853(class270.field3523, 32 + var5, 17, 16777215, -1);
         var6 = 610 + class56.field825;
         if (class48.field696[0] == 3 && class48.field695[0] == 0) {
            ApproximateRouteStrategy.field392[2].method6349(var6, 4);
         } else {
            ApproximateRouteStrategy.field392[0].method6349(var6, 4);
         }

         if (class48.field696[0] == 3 && class48.field695[0] == 1) {
            ApproximateRouteStrategy.field392[3].method6349(var6 + 15, 4);
         } else {
            ApproximateRouteStrategy.field392[1].method6349(15 + var6, 4);
         }

         var0.method4853(class270.field3524, var6 + 32, 17, 16777215, -1);
      }

      class394.method6265(class56.field825 + 708, 4, 50, 16, 0);
      var1.method4922(class270.field3479, 25 + 708 + class56.field825, 16, 16777215, -1);
      class56.field826 = -1;
      if (null != class189.field2127) {
         byte var24 = 88;
         byte var26 = 19;
         var5 = 765 / (1 + var24) - 1;
         var6 = 480 / (1 + var26);

         int var7;
         int var8;
         do {
            var7 = var6;
            var8 = var5;
            if (var6 * (var5 - 1) >= class48.field692) {
               --var5;
            }

            if (var5 * (var6 - 1) >= class48.field692) {
               --var6;
            }

            if ((var6 - 1) * var5 >= class48.field692) {
               --var6;
            }
         } while(var6 != var7 || var5 != var8);

         var7 = (765 - var24 * var5) / (1 + var5);
         if (var7 > 5) {
            var7 = 5;
         }

         var8 = (480 - var26 * var6) / (1 + var6);
         if (var8 > 5) {
            var8 = 5;
         }

         int var9 = (765 - var24 * var5 - (var5 - 1) * var7) / 2;
         int var10 = (480 - var6 * var26 - (var6 - 1) * var8) / 2;
         int var11 = (var6 + class48.field692 - 1) / var6;
         class56.field828 = var11 - var5;
         if (null != class138.field1520 && class56.field827 > 0) {
            class138.field1520.method6349(8, client.canvasHeight / 2 - class138.field1520.field4264 / 2);
         }

         if (null != class96.field1257 && class56.field827 < class56.field828) {
            class96.field1257.method6349(class69.canvasWidth - class96.field1257.field4263 - 8, client.canvasHeight / 2 - class96.field1257.field4264 / 2);
         }

         int var12 = var10 + 23;
         int var13 = var9 + class56.field825;
         int var14 = 0;
         boolean var15 = false;
         int var16 = class56.field827;

         int var17;
         for(var17 = var6 * var16; var17 < class48.field692 && var16 - class56.field827 < var5; ++var17) {
            class48 var18 = class16.field86[var17];
            boolean var19 = true;
            String var20 = Integer.toString(var18.field699);
            if (-1 == var18.field699) {
               var20 = class270.field3270;
               var19 = false;
            } else if (var18.field699 > 1980) {
               var20 = class270.field3526;
               var19 = false;
            }

            int var22 = 0;
            byte var21;
            if (var18.method1290()) {
               if (var18.method1274()) {
                  var21 = 7;
               } else {
                  var21 = 6;
               }
            } else if (var18.method1278()) {
               var22 = 16711680;
               if (var18.method1274()) {
                  var21 = 5;
               } else {
                  var21 = 4;
               }
            } else if (var18.method1297()) {
               if (var18.method1274()) {
                  var21 = 9;
               } else {
                  var21 = 8;
               }
            } else if (var18.method1276()) {
               if (var18.method1274()) {
                  var21 = 3;
               } else {
                  var21 = 2;
               }
            } else if (var18.method1274()) {
               var21 = 1;
            } else {
               var21 = 0;
            }

            if (MouseHandler.field142 >= var13 && MouseHandler.field145 >= var12 && MouseHandler.field142 < var13 + var24 && MouseHandler.field145 < var26 + var12 && var19) {
               class56.field826 = var17;
               class189.field2127[var21].method6383(var13, var12, 128, 16777215);
               var15 = true;
            } else {
               class189.field2127[var21].method6446(var13, var12);
            }

            if (null != field770) {
               field770[(var18.method1274() ? 8 : 0) + var18.field702].method6349(29 + var13, var12);
            }

            var0.method4922(Integer.toString(var18.field697), 15 + var13, 5 + var26 / 2 + var12, var22, -1);
            var1.method4922(var20, 60 + var13, var12 + var26 / 2 + 5, 268435455, -1);
            var12 += var26 + var8;
            ++var14;
            if (var14 >= var6) {
               var12 = var10 + 23;
               var13 += var7 + var24;
               var14 = 0;
               ++var16;
            }
         }

         if (var15) {
            var17 = var1.method4848(class16.field86[class56.field826].field690) + 6;
            int var27 = 8 + var1.field3738;
            int var28 = MouseHandler.field145 + 25;
            if (var27 + var28 > 480) {
               var28 = MouseHandler.field145 - 25 - var27;
            }

            class394.method6265(MouseHandler.field142 - var17 / 2, var28, var17, var27, 16777120);
            class394.method6292(MouseHandler.field142 - var17 / 2, var28, var17, var27, 0);
            var1.method4922(class16.field86[class56.field826].field690, MouseHandler.field142, 4 + var28 + var1.field3738, 0, -1);
         }
      }

      class264.field3194.method6333(0, 0);
   }
}
