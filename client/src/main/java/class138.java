public class class138 {
   static class397 field1520;
   public short[] field1516;
   public short[] field1519;

   public class138(int var1) {
      class157 var2 = KeyHandler.method93(var1);
      if (var2.method2702()) {
         this.field1516 = new short[var2.field1797.length];
         System.arraycopy(var2.field1797, 0, this.field1516, 0, this.field1516.length);
      }

      if (var2.method2703()) {
         this.field1519 = new short[var2.field1799.length];
         System.arraycopy(var2.field1799, 0, this.field1519, 0, this.field1519.length);
      }

   }

   public static void method2334(class277 var0, class277 var1, class277 var2, class277 var3) {
      Interface.field2951 = var0;
      class93.field1242 = var1;
      class27.field218 = var2;
      class56.field831 = var3;
      Interface.components = new Interface[Interface.field2951.method4424()][];
      class101.field1282 = new boolean[Interface.field2951.method4424()];
   }

   static int method2333(class48 var0, class48 var1, int var2, boolean var3) {
      if (1 == var2) {
         int var5 = var0.field699;
         int var6 = var1.field699;
         if (!var3) {
            if (-1 == var5) {
               var5 = 2001;
            }

            if (-1 == var6) {
               var6 = 2001;
            }
         }

         return var5 - var6;
      } else if (2 == var2) {
         return var0.field702 - var1.field702;
      } else if (var2 == 3) {
         if (var0.field690.equals("-")) {
            if (var1.field690.equals("-")) {
               return 0;
            } else {
               return var3 ? -1 : 1;
            }
         } else if (var1.field690.equals("-")) {
            return var3 ? 1 : -1;
         } else {
            return var0.field690.compareTo(var1.field690);
         }
      } else if (var2 == 4) {
         return var0.method1277() ? (var1.method1277() ? 0 : 1) : (var1.method1277() ? -1 : 0);
      } else if (5 == var2) {
         return var0.method1275() ? (var1.method1275() ? 0 : 1) : (var1.method1275() ? -1 : 0);
      } else if (6 == var2) {
         return var0.method1276() ? (var1.method1276() ? 0 : 1) : (var1.method1276() ? -1 : 0);
      } else if (var2 == 7) {
         return var0.method1274() ? (var1.method1274() ? 0 : 1) : (var1.method1274() ? -1 : 0);
      } else {
         return var0.field697 - var1.field697;
      }
   }

   static final void method2332(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, class160[] var9) {
      Buffer var11 = new Buffer(var0);
      int var12 = -1;

      while(true) {
         int var13 = var11.method6171();
         if (var13 == 0) {
            return;
         }

         var12 += var13;
         int var14 = 0;

         while(true) {
            int var15 = var11.method5962();
            if (0 == var15) {
               break;
            }

            var14 += var15 - 1;
            int var16 = var14 & 63;
            int var17 = var14 >> 6 & 63;
            int var18 = var14 >> 12;
            int var19 = var11.readUnsignedByte();
            int var20 = var19 >> 2;
            int var21 = var19 & 3;
            if (var4 == var18 && var17 >= var5 && var17 < var5 + 8 && var16 >= var6 && var16 < 8 + var6) {
               class156 var22 = class124.method2243(var12);
               int var25 = var17 & 7;
               int var26 = var16 & 7;
               int var28 = var22.field1750;
               int var29 = var22.field1751;
               int var30;
               if (1 == (var21 & 1)) {
                  var30 = var28;
                  var28 = var29;
                  var29 = var30;
               }

               int var27 = var7 & 3;
               int var24;
               if (var27 == 0) {
                  var24 = var25;
               } else if (1 == var27) {
                  var24 = var26;
               } else if (2 == var27) {
                  var24 = 7 - var25 - (var28 - 1);
               } else {
                  var24 = 7 - var26 - (var29 - 1);
               }

               var30 = var2 + var24;
               int var31 = var3 + class169.method3053(var17 & 7, var16 & 7, var7, var22.field1750, var22.field1751, var21);
               if (var30 > 0 && var31 > 0 && var30 < 103 && var31 < 103) {
                  int var32 = var1;
                  if ((class62.field901[1][var30][var31] & 2) == 2) {
                     var32 = var1 - 1;
                  }

                  class160 var33 = null;
                  if (var32 >= 0) {
                     var33 = var9[var32];
                  }

                  client.method1271(var1, var30, var31, var12, var21 + var7 & 3, var20, var8, var33);
               }
            }
         }
      }
   }
}
