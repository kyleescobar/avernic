public class class266 implements class290 {
   public static final class266 field3206 = new class266("oldscape", "RuneScape 2007", 5);
   static class136 field3214;
   static class398[] field3211;
   static final class266 field3204 = new class266("stellardawn", "Stellar Dawn", 1);
   static final class266 field3205 = new class266("game3", "Game 3", 2);
   static final class266 field3207 = new class266("game5", "Game 5", 4);
   static final class266 field3212 = new class266("game4", "Game 4", 3);
   static final class266 field3213 = new class266("runescape", "RuneScape", 0);
   final int field3210;
   public final String field3208;

   class266(String var1, String var2, int var3) {
      this.field3208 = var1;
      this.field3210 = var3;
   }

   public int method4619() {
      return this.field3210;
   }

   static class398 method4347(int var0, int var1, int var2) {
      return (class398)class169.field1962.method3857(class155.method2626(var0, var1, var2));
   }

   static void getLoginError(int var0) {
      if (-3 == var0) {
         client.method1272(class270.field3434, class270.field3471, class270.field3273);
      } else if (-2 == var0) {
         client.method1272(class270.field3226, class270.field3275, class270.field3276);
      } else if (-1 == var0) {
         client.method1272(class270.field3277, class270.field3278, class270.field3365);
      } else if (3 == var0) {
         class56.field812 = 3;
         class56.field810 = 1;
      } else if (var0 == 4) {
         class56.field812 = 12;
         class56.field805 = 0;
      } else if (5 == var0) {
         class56.field810 = 2;
         client.method1272(class270.field3283, class270.field3284, class270.field3285);
      } else if (68 == var0 || !client.field412 && var0 == 6) {
         client.method1272(class270.field3298, class270.field3287, class270.field3343);
      } else if (var0 == 7) {
         client.method1272(class270.field3250, class270.field3290, class270.field3407);
      } else if (8 == var0) {
         client.method1272(class270.field3295, class270.field3293, class270.field3294);
      } else if (9 == var0) {
         client.method1272(class270.field3384, class270.field3261, class270.field3263);
      } else if (var0 == 10) {
         client.method1272(class270.field3450, class270.field3422, class270.field3300);
      } else if (var0 == 11) {
         client.method1272(class270.field3412, class270.field3302, class270.field3303);
      } else if (12 == var0) {
         client.method1272(class270.field3324, class270.field3305, class270.field3306);
      } else if (var0 == 13) {
         client.method1272(class270.field3307, class270.field3346, class270.field3309);
      } else if (var0 == 14) {
         client.method1272(class270.field3310, class270.field3311, class270.field3312);
      } else if (var0 == 16) {
         client.method1272(class270.field3423, class270.field3314, class270.field3315);
      } else if (17 == var0) {
         client.method1272(class270.field3316, class270.field3498, class270.field3318);
      } else if (18 == var0) {
         class56.field812 = 12;
         class56.field805 = 1;
      } else if (var0 == 19) {
         client.method1272(class270.field3322, class270.field3323, class270.field3286);
      } else if (var0 == 20) {
         client.method1272(class270.field3325, class270.field3505, class270.field3519);
      } else if (var0 == 22) {
         client.method1272(class270.field3296, class270.field3329, class270.field3390);
      } else if (var0 == 23) {
         client.method1272(class270.field3331, class270.field3328, class270.field3333);
      } else if (24 == var0) {
         client.method1272(class270.field3334, class270.field3326, class270.field3358);
      } else if (var0 == 25) {
         client.method1272(class270.field3337, class270.field3338, class270.field3339);
      } else if (26 == var0) {
         client.method1272(class270.field3340, class270.field3341, class270.field3243);
      } else if (var0 == 27) {
         client.method1272(class270.field3291, class270.field3344, class270.field3345);
      } else if (var0 == 31) {
         client.method1272(class270.field3352, class270.field3353, class270.field3279);
      } else if (32 == var0) {
         client.method1272(class270.field3487, class270.field3356, class270.field3357);
      } else if (var0 == 37) {
         client.method1272(class270.field3317, class270.field3359, class270.field3360);
      } else if (var0 == 38) {
         client.method1272(class270.field3414, class270.field3362, class270.field3363);
      } else if (55 == var0) {
         class56.field812 = 8;
      } else {
         if (var0 == 56) {
            client.method1272(class270.field3368, class270.field3369, class270.field3370);
            class17.method128(11);
            return;
         }

         if (57 == var0) {
            client.method1272(class270.field3281, class270.field3255, class270.field3405);
            class17.method128(11);
            return;
         }

         if (var0 == 61) {
            class56.field812 = 7;
         } else {
            client.method1272(class270.field3374, class270.field3271, class270.field3376);
         }
      }

      class17.method128(10);
   }
}
