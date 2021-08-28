public abstract class class137 {
   class137() {
   }

   public static String method2328(CharSequence var0) {
      int var2 = var0.length();
      StringBuilder var3 = new StringBuilder(var2);

      for(int var4 = 0; var4 < var2; ++var4) {
         char var5 = var0.charAt(var4);
         if ((var5 < 'a' || var5 > 'z') && (var5 < 'A' || var5 > 'Z') && (var5 < '0' || var5 > '9') && '.' != var5 && var5 != '-' && '*' != var5 && '_' != var5) {
            if (var5 == ' ') {
               var3.append('+');
            } else {
               byte var6 = class274.method4376(var5);
               var3.append('%');
               int var7 = var6 >> 4 & 15;
               if (var7 >= 10) {
                  var3.append((char)(var7 + 55));
               } else {
                  var3.append((char)(var7 + 48));
               }

               var7 = var6 & 15;
               if (var7 >= 10) {
                  var3.append((char)(55 + var7));
               } else {
                  var3.append((char)(var7 + 48));
               }
            }
         } else {
            var3.append(var5);
         }
      }

      return var3.toString();
   }

   static char method2327(char var0) {
      return 181 != var0 && var0 != 402 ? Character.toTitleCase(var0) : var0;
   }

   static void method2321(int var0, int var1) {
      long var3 = (long)(var1 + (var0 << 16));
      class276 var5 = (class276)class278.field3615.get(var3);
      if (null != var5) {
         class278.field3602.method4660(var5);
      }
   }

   public static int[] method2330() {
      int[] var1 = new int[KeyHandler.field36];

      for(int var2 = 0; var2 < KeyHandler.field36; ++var2) {
         var1[var2] = KeyHandler.field54[var2];
      }

      return var1;
   }

   public abstract void method2322();

   public abstract int method2329(int var1, int var2);
}
