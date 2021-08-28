public class class361 {
   public static final class361 field4085 = new class361("p11_full");
   public static final class361 field4086 = new class361("b12_full");
   public static final class361 field4087 = new class361("verdana_11pt_regular");
   public static final class361 field4088 = new class361("verdana_13pt_regular");
   public static final class361 field4093 = new class361("p12_full");
   public static final class361 field4096 = new class361("verdana_15pt_regular");
   String field4090;

   class361(String var1) {
      this.field4090 = var1;
   }

   public static void method5700(int var0) {
      if (0 != class235.field2819) {
         class147.field1612 = var0;
      } else {
         class235.field2816.method3966(var0);
      }

   }

   static int method5702(int var0, class59 var1, boolean var2) {
      boolean var4 = true;
      Interface var5;
      if (var0 >= 2000) {
         var0 -= 1000;
         var5 = class87.getComponent(class51.field747[--class51.field746]);
         var4 = false;
      } else {
         var5 = var2 ? class286.field3660 : class51.field750;
      }

      int var10;
      if (var0 == 1300) {
         var10 = class51.field747[--class51.field746] - 1;
         if (var10 >= 0 && var10 <= 9) {
            var5.method4228(var10, class51.field738[--class2.field4]);
            return 1;
         } else {
            --class2.field4;
            return 1;
         }
      } else {
         int var11;
         if (1301 == var0) {
            class51.field746 -= 2;
            var10 = class51.field747[class51.field746];
            var11 = class51.field747[1 + class51.field746];
            var5.field3064 = class50.method1394(var10, var11);
            return 1;
         } else if (1302 == var0) {
            var5.field3053 = class51.field747[--class51.field746] == 1;
            return 1;
         } else if (var0 == 1303) {
            var5.field3040 = class51.field747[--class51.field746];
            return 1;
         } else if (var0 == 1304) {
            var5.field2957 = class51.field747[--class51.field746];
            return 1;
         } else if (1305 == var0) {
            var5.field3037 = class51.field738[--class2.field4];
            return 1;
         } else if (var0 == 1306) {
            var5.field3043 = class51.field738[--class2.field4];
            return 1;
         } else if (var0 == 1307) {
            var5.field3038 = null;
            return 1;
         } else if (var0 == 1308) {
            var5.field3104 = class51.field747[--class51.field746] == 1;
            return 1;
         } else if (1309 == var0) {
            --class51.field746;
            return 1;
         } else {
            byte[] var7;
            int var8;
            if (var0 != 1350) {
               byte var9;
               if (var0 == 1351) {
                  class51.field746 -= 2;
                  var9 = 10;
                  var7 = new byte[]{(byte)class51.field747[class51.field746]};
                  byte[] var12 = new byte[]{(byte)class51.field747[class51.field746 + 1]};
                  class157.method2711(var5, var9, var7, var12);
                  return 1;
               } else if (1352 == var0) {
                  class51.field746 -= 3;
                  var10 = class51.field747[class51.field746] - 1;
                  var11 = class51.field747[class51.field746 + 1];
                  var8 = class51.field747[class51.field746 + 2];
                  if (var10 >= 0 && var10 <= 9) {
                     class176.method3148(var5, var10, var11, var8);
                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               } else if (var0 == 1353) {
                  var9 = 10;
                  var11 = class51.field747[--class51.field746];
                  var8 = class51.field747[--class51.field746];
                  class176.method3148(var5, var9, var11, var8);
                  return 1;
               } else if (1354 == var0) {
                  --class51.field746;
                  var10 = class51.field747[class51.field746] - 1;
                  if (var10 >= 0 && var10 <= 9) {
                     class154.method2590(var5, var10);
                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               } else if (var0 == 1355) {
                  var9 = 10;
                  class154.method2590(var5, var9);
                  return 1;
               } else {
                  return 2;
               }
            } else {
               byte[] var6 = null;
               var7 = null;
               if (var4) {
                  class51.field746 -= 10;

                  for(var8 = 0; var8 < 10 && class51.field747[var8 + class51.field746] >= 0; var8 += 2) {
                  }

                  if (var8 > 0) {
                     var6 = new byte[var8 / 2];
                     var7 = new byte[var8 / 2];

                     for(var8 -= 2; var8 >= 0; var8 -= 2) {
                        var6[var8 / 2] = (byte)class51.field747[var8 + class51.field746];
                        var7[var8 / 2] = (byte)class51.field747[1 + class51.field746 + var8];
                     }
                  }
               } else {
                  class51.field746 -= 2;
                  var6 = new byte[]{(byte)class51.field747[class51.field746]};
                  var7 = new byte[]{(byte)class51.field747[class51.field746 + 1]};
               }

               var8 = class51.field747[--class51.field746] - 1;
               if (var8 >= 0 && var8 <= 9) {
                  class157.method2711(var5, var8, var6, var7);
                  return 1;
               } else {
                  throw new RuntimeException();
               }
            }
         }
      }
   }

   static int method5701(int var0, class59 var1, boolean var2) {
      Interface var4 = class87.getComponent(class51.field747[--class51.field746]);
      if (var0 == 2800) {
         class51.field747[++class51.field746 - 1] = class104.method2082(class241.method4140(var4));
         return 1;
      } else if (2801 != var0) {
         if (2802 == var0) {
            if (var4.field3037 == null) {
               class51.field738[++class2.field4 - 1] = "";
            } else {
               class51.field738[++class2.field4 - 1] = var4.field3037;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var5 = class51.field747[--class51.field746];
         --var5;
         if (var4.field3038 != null && var5 < var4.field3038.length && var4.field3038[var5] != null) {
            class51.field738[++class2.field4 - 1] = var4.field3038[var5];
         } else {
            class51.field738[++class2.field4 - 1] = "";
         }

         return 1;
      }
   }
}
