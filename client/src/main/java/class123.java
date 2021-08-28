public class class123 extends class104 {
   static int field1426;
   int field1429;
   // $FF: synthetic field
   final class107 this$0;

   class123(class107 var1) {
      this.this$0 = var1;
      this.field1429 = -1;
   }

   void method2083(Buffer var1) {
      this.field1429 = var1.readUnsignedShort();
   }

   void method2084(class115 var1) {
      var1.method2130(this.field1429);
   }

   static int method2217(int var0, class59 var1, boolean var2) {
      if (3200 == var0) {
         class51.field746 -= 3;
         class128.method2256(class51.field747[class51.field746], class51.field747[class51.field746 + 1], class51.field747[2 + class51.field746]);
         return 1;
      } else if (3201 == var0) {
         class42.method764(class51.field747[--class51.field746]);
         return 1;
      } else if (var0 == 3202) {
         class51.field746 -= 2;
         class88.method2000(class51.field747[class51.field746], class51.field747[class51.field746 + 1]);
         return 1;
      } else {
         int var4;
         int var5;
         if (3209 != var0 && 3181 != var0 && 3203 != var0 && 3205 != var0 && var0 != 3207) {
            if (var0 != 3210 && var0 != 3182 && var0 != 3204 && 3206 != var0 && var0 != 3208) {
               return 2;
            } else {
               var4 = 0;
               var5 = 0;
               if (3210 == var0) {
                  var4 = class51.field747[--class51.field746];
               } else if (3182 == var0) {
                  var4 = 6;
               } else if (var0 == 3204) {
                  var4 = 7;
               } else if (3206 == var0) {
                  var4 = 8;
               } else if (3208 == var0) {
                  var4 = 9;
               }

               if (6 == var4) {
                  float var6 = 200.0F * ((float)class38.clientPreferences.field1118 - 0.5F);
                  var5 = 100 - Math.round(var6);
               } else if (var4 == 7) {
                  var5 = Math.round((float)class38.clientPreferences.field1119 / 2.55F);
               } else if (8 == var4) {
                  var5 = Math.round((float)class38.clientPreferences.field1121 / 1.27F);
               } else if (9 == var4) {
                  var5 = Math.round((float)class38.clientPreferences.field1116 / 1.27F);
               }

               class51.field747[++class51.field746 - 1] = var5;
               return 1;
            }
         } else {
            var4 = 0;
            var5 = class51.field747[--class51.field746];
            if (3209 == var0) {
               var4 = class51.field747[--class51.field746];
            } else if (3181 == var0) {
               var4 = 6;
            } else if (3203 == var0) {
               var4 = 7;
            } else if (3205 == var0) {
               var4 = 8;
            } else if (var0 == 3207) {
               var4 = 9;
            }

            if (var4 == 6) {
               var5 = 100 - Math.min(Math.max(var5, 0), 100);
               class96.method2064((double)(0.5F + (float)var5 / 200.0F));
            } else if (7 == var4) {
               var5 = Math.min(Math.max(var5, 0), 100);
               class130.method2259(Math.round((float)var5 * 2.55F));
            } else if (var4 == 8) {
               var5 = Math.min(Math.max(var5, 0), 100);
               class99.method2073(Math.round(1.27F * (float)var5));
            } else if (9 == var4) {
               var5 = Math.min(Math.max(var5, 0), 100);
               class17.method140(Math.round(1.27F * (float)var5));
            }

            return 1;
         }
      }
   }

   static final int method2216(int var0, int var1, int var2) {
      int var4 = var0 >> 7;
      int var5 = var1 >> 7;
      if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
         int var6 = var2;
         if (var2 < 3 && 2 == (class62.field901[1][var4][var5] & 2)) {
            var6 = var2 + 1;
         }

         int var7 = var0 & 127;
         int var8 = var1 & 127;
         int var9 = (128 - var7) * class62.field911[var6][var4][var5] + class62.field911[var6][1 + var4][var5] * var7 >> 7;
         int var10 = class62.field911[var6][var4][var5 + 1] * (128 - var7) + class62.field911[var6][1 + var4][var5 + 1] * var7 >> 7;
         return var8 * var10 + var9 * (128 - var8) >> 7;
      } else {
         return 0;
      }
   }

   static Interface method2215(Interface var0) {
      int var2 = class7.method35(class241.method4140(var0));
      if (0 == var2) {
         return null;
      } else {
         for(int var3 = 0; var3 < var2; ++var3) {
            var0 = class87.getComponent(var0.field3001);
            if (null == var0) {
               return null;
            }
         }

         return var0;
      }
   }
}
