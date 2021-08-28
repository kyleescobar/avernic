public class class92 extends class325 {
   static class397 field1240;
   final boolean field1238;

   public class92(boolean var1) {
      this.field1238 = var1;
   }

   int method2027(class328 var1, class328 var2) {
      if (var1.field3865 != 0) {
         if (0 == var2.field3865) {
            return this.field1238 ? -1 : 1;
         }
      } else if (0 != var2.field3865) {
         return this.field1238 ? 1 : -1;
      }

      return this.method5180(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method2027((class328)var1, (class328)var2);
   }

   public static void method2026(int var0, class277 var1, int var2, int var3, int var4, boolean var5) {
      class235.field2819 = 1;
      class235.field2820 = var1;
      class235.field2822 = var2;
      class97.field1264 = var3;
      class147.field1612 = var4;
      class146.field1598 = var5;
      class124.field1439 = var0;
   }

   static class275 method2035(int var0, boolean var1, boolean var2, boolean var3) {
      class334 var5 = null;
      if (class131.field1477 != null) {
         var5 = new class334(var0, class131.field1477, class320.field3840[var0], 1000000);
      }

      return new class275(var5, class308.field3766, var0, var1, var2, var3);
   }

   static String method2031(String var0, boolean var1) {
      String var3 = var1 ? "https://" : "http://";
      if (1 == client.field407) {
         var0 = var0 + "-wtrc";
      } else if (client.field407 == 2) {
         var0 = var0 + "-wtqa";
      } else if (client.field407 == 3) {
         var0 = var0 + "-wtwip";
      } else if (5 == client.field407) {
         var0 = var0 + "-wti";
      } else if (4 == client.field407) {
         var0 = "local";
      }

      String var4 = "";
      if (null != class150.field1661) {
         var4 = "/p=" + class150.field1661;
      }

      String var5 = "runescape.com";
      return var3 + var0 + "." + var5 + "/l=" + class284.field3644 + "/a=" + class408.field4314 + var4 + "/";
   }
}
