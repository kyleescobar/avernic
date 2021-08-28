public final class class178 {
   static long field2067;
   int field2063;
   int field2064;
   int field2065;
   int field2066;
   // $FF: synthetic field
   final class170 this$0;

   public static int method3183(int var0, int var1) {
      int var3;
      if (var1 > var0) {
         var3 = var0;
         var0 = var1;
         var1 = var3;
      }

      while(0 != var1) {
         var3 = var0 % var1;
         var0 = var1;
         var1 = var3;
      }

      return var0;
   }

   class178(class170 var1) {
      this.this$0 = var1;
   }

   static boolean method3182(char var0) {
      for(int var2 = 0; var2 < class56.field811.length(); ++var2) {
         if (var0 == class56.field811.charAt(var2)) {
            return true;
         }
      }

      return false;
   }

   static int method3184(int var0, class59 var1, boolean var2) {
      if (7100 == var0) {
         ++class51.field746;
         return 1;
      } else if (var0 == 7101) {
         class2.field4 += 2;
         return 1;
      } else if (7102 != var0 && 7103 != var0 && 7104 != var0 && var0 != 7105 && 7109 != var0) {
         if (var0 == 7106) {
            ++class51.field746;
            return 1;
         } else if (7107 == var0) {
            ++class51.field746;
            return 1;
         } else if (var0 == 7108) {
            class51.field747[++class51.field746 - 1] = class293.method4656() ? 1 : 0;
            return 1;
         } else if (var0 == 7110) {
            class51.field747[++class51.field746 - 1] = 0;
            return 1;
         } else if (var0 == 7120) {
            --class51.field746;
            class51.field747[++class51.field746 - 1] = 0;
            return 1;
         } else if (7121 == var0) {
            class51.field746 -= 2;
            class51.field747[++class51.field746 - 1] = -1;
            return 1;
         } else if (var0 == 7122) {
            class51.field746 -= 2;
            class51.field747[++class51.field746 - 1] = 0;
            return 1;
         } else {
            return 2;
         }
      } else {
         ++class51.field746;
         return 1;
      }
   }

   static void method3185(int var0) {
      client.field482 = var0;
   }
}
