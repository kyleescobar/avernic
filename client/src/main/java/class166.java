public class class166 extends class186 {
   static Scene field1925;
   class181 field1928;
   int field1927;
   int field1929;
   int field1931;
   final class169 field1926;
   final int field1930;

   class166(class245 var1, class245 var2, int var3, class169 var4) {
      super(var1, var2);
      this.field1930 = var3;
      this.field1926 = var4;
      this.method2874();
   }

   void method2874() {
      this.field1927 = class124.method2243(this.field1930).method2638().field1763;
      this.field1928 = this.field1926.method2989(class73.method1770(this.field1927));
      class141 var2 = class73.method1770(this.method3208());
      class398 var3 = var2.method2368(false);
      if (var3 != null) {
         this.field1929 = var3.field4270;
         this.field1931 = var3.field4271;
      } else {
         this.field1929 = 0;
         this.field1931 = 0;
      }

   }

   public int method3208() {
      return this.field1927;
   }

   class181 method3209() {
      return this.field1928;
   }

   int method3227() {
      return this.field1929;
   }

   static final void method2879(int var0, int var1, int var2, int var3) {
      for(int var5 = var1; var5 <= var1 + var3; ++var5) {
         for(int var6 = var0; var6 <= var2 + var0; ++var6) {
            if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
               class251.field3114[0][var6][var5] = 127;
               if (var6 == var0 && var6 > 0) {
                  class62.field911[0][var6][var5] = class62.field911[0][var6 - 1][var5];
               }

               if (var2 + var0 == var6 && var6 < 103) {
                  class62.field911[0][var6][var5] = class62.field911[0][var6 + 1][var5];
               }

               if (var1 == var5 && var5 > 0) {
                  class62.field911[0][var6][var5] = class62.field911[0][var6][var5 - 1];
               }

               if (var1 + var3 == var5 && var5 < 103) {
                  class62.field911[0][var6][var5] = class62.field911[0][var6][1 + var5];
               }
            }
         }
      }

   }

   int method3211() {
      return this.field1931;
   }

   public static synchronized void method2880(byte[] var0) {
      if (100 == var0.length && class310.field3768 < 1000) {
         class310.field3771[++class310.field3768 - 1] = var0;
      } else if (5000 == var0.length && class310.field3773 < 250) {
         class310.field3772[++class310.field3773 - 1] = var0;
      } else if (30000 == var0.length && class310.field3769 < 50) {
         class310.field3770[++class310.field3769 - 1] = var0;
      } else {
         if (class310.field3775 != null) {
            for(int var2 = 0; var2 < class310.field3774.length; ++var2) {
               if (class310.field3774[var2] == var0.length && class128.field1460[var2] < class310.field3775[var2].length) {
                  class310.field3775[var2][class128.field1460[var2]++] = var0;
                  return;
               }
            }
         }

      }
   }

   public static int method2881(CharSequence var0) {
      int var2 = var0.length();
      int var3 = 0;

      for(int var4 = 0; var4 < var2; ++var4) {
         var3 = (var3 << 5) - var3 + var0.charAt(var4);
      }

      return var3;
   }

   static void method2877() {
      if (client.field563) {
         Interface var1 = class50.method1394(class25.field185, client.field564);
         if (null != var1 && null != var1.field3056) {
            ScriptEvent var2 = new ScriptEvent();
            var2.field961 = var1;
            var2.args = var1.field3056;
            UserComparator10.runScriptEvent(var2);
         }

         client.field565 = -1;
         client.field563 = false;
         class81.invalidateComponent(var1);
      }
   }
}
