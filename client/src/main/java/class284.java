import java.util.Comparator;

final class class284 implements Comparator {
   static class292 field3644;

   public static String method4555(byte[] var0, int var1, int var2) {
      char[] var4 = new char[var2];
      int var5 = 0;
      int var6 = var1;

      int var9;
      for(int var7 = var2 + var1; var6 < var7; var4[var5++] = (char)var9) {
         int var8 = var0[var6++] & 255;
         if (var8 < 128) {
            if (var8 == 0) {
               var9 = 65533;
            } else {
               var9 = var8;
            }
         } else if (var8 < 192) {
            var9 = 65533;
         } else if (var8 < 224) {
            if (var6 < var7 && 128 == (var0[var6] & 192)) {
               var9 = (var8 & 31) << 6 | var0[var6++] & 63;
               if (var9 < 128) {
                  var9 = 65533;
               }
            } else {
               var9 = 65533;
            }
         } else if (var8 < 240) {
            if (1 + var6 < var7 && (var0[var6] & 192) == 128 && (var0[var6 + 1] & 192) == 128) {
               var9 = (var8 & 15) << 12 | (var0[var6++] & 63) << 6 | var0[var6++] & 63;
               if (var9 < 2048) {
                  var9 = 65533;
               }
            } else {
               var9 = 65533;
            }
         } else if (var8 < 248) {
            if (var6 + 2 < var7 && 128 == (var0[var6] & 192) && 128 == (var0[1 + var6] & 192) && 128 == (var0[var6 + 2] & 192)) {
               var9 = (var8 & 7) << 18 | (var0[var6++] & 63) << 12 | (var0[var6++] & 63) << 6 | var0[var6++] & 63;
               if (var9 >= 65536 && var9 <= 1114111) {
                  var9 = 65533;
               } else {
                  var9 = 65533;
               }
            } else {
               var9 = 65533;
            }
         } else {
            var9 = 65533;
         }
      }

      return new String(var4, 0, var5);
   }

   int method4549(class285 var1, class285 var2) {
      return var1.field3648 < var2.field3648 ? -1 : (var2.field3648 == var1.field3648 ? 0 : 1);
   }

   public int compare(Object var1, Object var2) {
      return this.method4549((class285)var1, (class285)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
