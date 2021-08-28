public class class45 extends class349 {
   static class397[] field386;
   class329 field377;
   class329 field382;
   class406 field381;
   int field378;
   int field379;
   int field389;
   String field380;
   String field385;
   String field388;

   class45(int var1, String var2, String var3, String var4) {
      this.field382 = class329.field3874;
      this.field377 = class329.field3874;
      this.method773(var1, var2, var3, var4);
   }

   void method773(int var1, String var2, String var3, String var4) {
      this.field378 = class304.method4959();
      this.field389 = client.field452;
      this.field379 = var1;
      this.field380 = var2;
      this.method780();
      this.field385 = var3;
      this.field388 = var4;
      this.method781();
      this.method777();
   }

   void method781() {
      this.field382 = class329.field3874;
   }

   final boolean method797() {
      if (this.field382 == class329.field3874) {
         this.method776();
      }

      return class329.field3872 == this.field382;
   }

   void method776() {
      this.field382 = class13.field80.field712.method5210(this.field381) ? class329.field3872 : class329.field3873;
   }

   void method777() {
      this.field377 = class329.field3874;
   }

   final boolean method790() {
      if (class329.field3874 == this.field377) {
         this.method774();
      }

      return this.field377 == class329.field3872;
   }

   void method774() {
      this.field377 = class13.field80.field713.method5210(this.field381) ? class329.field3872 : class329.field3873;
   }

   final void method780() {
      if (null != this.field380) {
         this.field381 = new class406(class53.method1535(this.field380), class52.field761);
      } else {
         this.field381 = null;
      }

   }

   static final void method798(class72 var0) {
      if (var0.field1068 == client.field452 || var0.sequence == -1 || 0 != var0.field1056 || 1 + var0.field1055 > class48.method1312(var0.sequence).field1865[var0.field1054]) {
         int var2 = var0.field1068 - var0.field1074;
         int var3 = client.field452 - var0.field1074;
         int var4 = var0.field1063 * 128 + var0.field1024 * 64;
         int var5 = var0.field1024 * 64 + var0.field1065 * 128;
         int var6 = var0.field1024 * 64 + var0.field1064 * 128;
         int var7 = var0.field1024 * 64 + var0.field1066 * 128;
         var0.x = (var6 * var3 + (var2 - var3) * var4) / var2;
         var0.y = (var3 * var7 + (var2 - var3) * var5) / var2;
      }

      var0.field1079 = 0;
      var0.orientation = var0.field1051;
      var0.field1022 = var0.orientation;
   }

   static boolean method785() {
      return 0 != (client.field427 & 8);
   }

   static void method799(String var0) {
      class150.field1661 = var0;

      try {
         String var2 = class59.field874.getParameter(Integer.toString(18));
         String var3 = class59.field874.getParameter(Integer.toString(13));
         String var4 = var2 + "settings=" + var0 + "; version=1; path=/; domain=" + var3;
         if (var0.length() == 0) {
            var4 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
         } else {
            var4 = var4 + "; Expires=" + class65.method1675(class87.method1989() + 94608000000L) + "; Max-Age=" + 94608000L;
         }

         class15.method112(class59.field874, "document.cookie=\"" + var4 + "\"");
      } catch (Throwable var5) {
      }

   }
}
