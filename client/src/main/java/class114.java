public class class114 extends class104 {
   int field1357;
   String field1356;
   // $FF: synthetic field
   final class107 this$0;

   public static String method2116(CharSequence var0, class367 var1) {
      if (var0 == null) {
         return null;
      } else {
         int var3 = 0;

         int var4;
         boolean var5;
         char var6;
         for(var4 = var0.length(); var3 < var4; ++var3) {
            var6 = var0.charAt(var3);
            var5 = var6 == 160 || var6 == ' ' || var6 == '_' || '-' == var6;
            if (!var5) {
               break;
            }
         }

         while(var4 > var3) {
            var6 = var0.charAt(var4 - 1);
            var5 = 160 == var6 || var6 == ' ' || '_' == var6 || var6 == '-';
            if (!var5) {
               break;
            }

            --var4;
         }

         int var10 = var4 - var3;
         if (var10 >= 1 && var10 <= class347.method5429(var1)) {
            StringBuilder var11 = new StringBuilder(var10);

            for(int var7 = var3; var7 < var4; ++var7) {
               char var8 = var0.charAt(var7);
               if (class186.method3237(var8)) {
                  char var9 = class12.method97(var8);
                  if (var9 != 0) {
                     var11.append(var9);
                  }
               }
            }

            if (var11.length() == 0) {
               return null;
            } else {
               return var11.toString();
            }
         } else {
            return null;
         }
      }
   }

   class114(class107 var1) {
      this.this$0 = var1;
   }

   void method2083(Buffer var1) {
      this.field1357 = var1.readInt();
      this.field1356 = var1.readStringNullTerminated();
   }

   void method2084(class115 var1) {
      var1.method2139(this.field1357, this.field1356);
   }
}
