public final class class215 {
   int field2532;
   int field2533;
   int field2534;
   int field2535;
   int field2537;
   int field2539;
   int field2540;
   int field2541;
   int field2542;
   int field2543;
   int field2544;
   int field2545 = 0;
   public class201 field2536;
   public long field2538 = 0L;

   public static class228[] method3851() {
      return new class228[]{class228.field2680, class228.field2676, class228.field2679, class228.field2677, class228.field2678, class228.field2681, class228.field2675, class228.field2684, class228.field2682, class228.field2683};
   }

   class215() {
   }

   static int method3850(int var0, class59 var1, boolean var2) {
      Interface var4;
      if (1927 != var0 && 2927 != var0) {
         int var9;
         if (var0 == 1928) {
            var4 = var2 ? class286.field3660 : class51.field750;
            var9 = class51.field747[--class51.field746];
            if (var9 >= 1 && var9 <= 10) {
               class80 var10 = new class80(var9, var4.id, var4.field3031, var4.field3088);
               class51.field755.add(var10);
               return 1;
            } else {
               throw new RuntimeException();
            }
         } else if (var0 == 2928) {
            class51.field746 -= 3;
            int var8 = class51.field747[class51.field746];
            var9 = class51.field747[class51.field746 + 1];
            int var6 = class51.field747[2 + class51.field746];
            if (var6 >= 1 && var6 <= 10) {
               class80 var7 = new class80(var6, var8, var9, class87.getComponent(var8).field3088);
               class51.field755.add(var7);
               return 1;
            } else {
               throw new RuntimeException();
            }
         } else {
            return 2;
         }
      } else if (class51.field743 >= 10) {
         throw new RuntimeException();
      } else {
         if (var0 >= 2000) {
            var4 = class87.getComponent(class51.field747[--class51.field746]);
         } else {
            var4 = var2 ? class286.field3660 : class51.field750;
         }

         if (null == var4.field3072) {
            return 0;
         } else {
            ScriptEvent var5 = new ScriptEvent();
            var5.field961 = var4;
            var5.args = var4.field3072;
            var5.field962 = 1 + class51.field743;
            client.field611.method4672(var5);
            return 1;
         }
      }
   }
}
