public final class class194 {
   int field2190;
   int field2191;
   int field2192;
   int field2193;
   public class201 field2195;
   public long field2194;

   class194() {
   }

   static final void method3400() {
      for(int var1 = 0; var1 < client.field498; ++var1) {
         int var10002 = client.field652[var1]--;
         if (client.field652[var1] >= -10) {
            class22 var11 = client.field654[var1];
            if (var11 == null) {
               class22 var10000 = (class22)null;
               var11 = class22.method357(class139.archive4, client.field629[var1], 0);
               if (null == var11) {
                  continue;
               }

               int[] var14 = client.field652;
               var14[var1] += var11.method361();
               client.field654[var1] = var11;
            }

            if (client.field652[var1] < 0) {
               int var3;
               if (0 != client.field653[var1]) {
                  int var4 = 128 * (client.field653[var1] & 255);
                  int var5 = client.field653[var1] >> 16 & 255;
                  int var6 = 64 + 128 * var5 - MouseHandler.localPlayer.x;
                  if (var6 < 0) {
                     var6 = -var6;
                  }

                  int var7 = client.field653[var1] >> 8 & 255;
                  int var8 = 128 * var7 + 64 - MouseHandler.localPlayer.y;
                  if (var8 < 0) {
                     var8 = -var8;
                  }

                  int var9 = var8 + var6 - 128;
                  if (var9 > var4) {
                     client.field652[var1] = -100;
                     continue;
                  }

                  if (var9 < 0) {
                     var9 = 0;
                  }

                  var3 = (var4 - var9) * class38.clientPreferences.field1116 / var4;
               } else {
                  var3 = class38.clientPreferences.field1121;
               }

               if (var3 > 0) {
                  class23 var12 = var11.method351().method362(class158.field1842);
                  class30 var13 = class30.method537(var12, 100, var3);
                  var13.method566(client.field651[var1] - 1);
                  class82.field1163.method329(var13);
               }

               client.field652[var1] = -100;
            }
         } else {
            --client.field498;

            for(int var2 = var1; var2 < client.field498; ++var2) {
               client.field629[var2] = client.field629[1 + var2];
               client.field654[var2] = client.field654[1 + var2];
               client.field651[var2] = client.field651[var2 + 1];
               client.field652[var2] = client.field652[var2 + 1];
               client.field653[var2] = client.field653[var2 + 1];
            }

            --var1;
         }
      }

      if (client.field648) {
         boolean var10;
         if (class235.field2819 != 0) {
            var10 = true;
         } else {
            var10 = class235.field2816.method3975();
         }

         if (!var10) {
            if (class38.clientPreferences.field1119 != 0 && -1 != client.field640) {
               PlayerList.method1886(class109.archive6, client.field640, 0, class38.clientPreferences.field1119, false);
            }

            client.field648 = false;
         }
      }

   }
}
