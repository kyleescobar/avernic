public class class235 {
   public static class236 field2816;
   public static class277 field2815;
   public static class277 field2817;
   public static class277 field2818;
   public static class277 field2820;
   public static int field2819 = 0;
   public static int field2822;
   static int[] regionIds;
   static String field2823;

   static int method3956(int var0, class59 var1, boolean var2) {
      int var4;
      int var5;
      if (4000 == var0) {
         class51.field746 -= 2;
         var4 = class51.field747[class51.field746];
         var5 = class51.field747[class51.field746 + 1];
         class51.field747[++class51.field746 - 1] = var5 + var4;
         return 1;
      } else if (var0 == 4001) {
         class51.field746 -= 2;
         var4 = class51.field747[class51.field746];
         var5 = class51.field747[1 + class51.field746];
         class51.field747[++class51.field746 - 1] = var4 - var5;
         return 1;
      } else if (4002 == var0) {
         class51.field746 -= 2;
         var4 = class51.field747[class51.field746];
         var5 = class51.field747[1 + class51.field746];
         class51.field747[++class51.field746 - 1] = var5 * var4;
         return 1;
      } else if (var0 == 4003) {
         class51.field746 -= 2;
         var4 = class51.field747[class51.field746];
         var5 = class51.field747[1 + class51.field746];
         class51.field747[++class51.field746 - 1] = var4 / var5;
         return 1;
      } else if (var0 == 4004) {
         var4 = class51.field747[--class51.field746];
         class51.field747[++class51.field746 - 1] = (int)(Math.random() * (double)var4);
         return 1;
      } else if (4005 == var0) {
         var4 = class51.field747[--class51.field746];
         class51.field747[++class51.field746 - 1] = (int)(Math.random() * (double)(var4 + 1));
         return 1;
      } else {
         int var6;
         int var7;
         int var8;
         if (4006 == var0) {
            class51.field746 -= 5;
            var4 = class51.field747[class51.field746];
            var5 = class51.field747[class51.field746 + 1];
            var6 = class51.field747[class51.field746 + 2];
            var7 = class51.field747[3 + class51.field746];
            var8 = class51.field747[4 + class51.field746];
            class51.field747[++class51.field746 - 1] = var4 + (var8 - var6) * (var5 - var4) / (var7 - var6);
            return 1;
         } else if (var0 == 4007) {
            class51.field746 -= 2;
            var4 = class51.field747[class51.field746];
            var5 = class51.field747[class51.field746 + 1];
            class51.field747[++class51.field746 - 1] = var4 * var5 / 100 + var4;
            return 1;
         } else if (var0 == 4008) {
            class51.field746 -= 2;
            var4 = class51.field747[class51.field746];
            var5 = class51.field747[1 + class51.field746];
            class51.field747[++class51.field746 - 1] = var4 | 1 << var5;
            return 1;
         } else if (4009 == var0) {
            class51.field746 -= 2;
            var4 = class51.field747[class51.field746];
            var5 = class51.field747[1 + class51.field746];
            class51.field747[++class51.field746 - 1] = var4 & -1 - (1 << var5);
            return 1;
         } else if (var0 == 4010) {
            class51.field746 -= 2;
            var4 = class51.field747[class51.field746];
            var5 = class51.field747[class51.field746 + 1];
            class51.field747[++class51.field746 - 1] = (var4 & 1 << var5) != 0 ? 1 : 0;
            return 1;
         } else if (4011 == var0) {
            class51.field746 -= 2;
            var4 = class51.field747[class51.field746];
            var5 = class51.field747[1 + class51.field746];
            class51.field747[++class51.field746 - 1] = var4 % var5;
            return 1;
         } else if (var0 == 4012) {
            class51.field746 -= 2;
            var4 = class51.field747[class51.field746];
            var5 = class51.field747[class51.field746 + 1];
            if (0 == var4) {
               class51.field747[++class51.field746 - 1] = 0;
            } else {
               class51.field747[++class51.field746 - 1] = (int)Math.pow((double)var4, (double)var5);
            }

            return 1;
         } else if (var0 == 4013) {
            class51.field746 -= 2;
            var4 = class51.field747[class51.field746];
            var5 = class51.field747[class51.field746 + 1];
            if (0 == var4) {
               class51.field747[++class51.field746 - 1] = 0;
               return 1;
            } else {
               switch(var5) {
               case 0:
                  class51.field747[++class51.field746 - 1] = Integer.MAX_VALUE;
                  break;
               case 1:
                  class51.field747[++class51.field746 - 1] = var4;
                  break;
               case 2:
                  class51.field747[++class51.field746 - 1] = (int)Math.sqrt((double)var4);
                  break;
               case 3:
                  class51.field747[++class51.field746 - 1] = (int)Math.cbrt((double)var4);
                  break;
               case 4:
                  class51.field747[++class51.field746 - 1] = (int)Math.sqrt(Math.sqrt((double)var4));
                  break;
               default:
                  class51.field747[++class51.field746 - 1] = (int)Math.pow((double)var4, 1.0D / (double)var5);
               }

               return 1;
            }
         } else if (4014 == var0) {
            class51.field746 -= 2;
            var4 = class51.field747[class51.field746];
            var5 = class51.field747[class51.field746 + 1];
            class51.field747[++class51.field746 - 1] = var4 & var5;
            return 1;
         } else if (var0 == 4015) {
            class51.field746 -= 2;
            var4 = class51.field747[class51.field746];
            var5 = class51.field747[1 + class51.field746];
            class51.field747[++class51.field746 - 1] = var4 | var5;
            return 1;
         } else if (4018 == var0) {
            class51.field746 -= 3;
            long var10 = (long)class51.field747[class51.field746];
            long var11 = (long)class51.field747[class51.field746 + 1];
            long var12 = (long)class51.field747[2 + class51.field746];
            class51.field747[++class51.field746 - 1] = (int)(var10 * var12 / var11);
            return 1;
         } else if (4025 == var0) {
            var4 = class125.method2245(class51.field747[--class51.field746]);
            class51.field747[++class51.field746 - 1] = var4;
            return 1;
         } else if (var0 == 4026) {
            class51.field746 -= 2;
            var4 = class51.field747[class51.field746];
            var5 = class51.field747[1 + class51.field746];
            class51.field747[++class51.field746 - 1] = var4 ^ 1 << var5;
            return 1;
         } else if (4027 == var0) {
            class51.field746 -= 3;
            var4 = class51.field747[class51.field746];
            var5 = class51.field747[1 + class51.field746];
            var6 = class51.field747[class51.field746 + 2];
            class51.field747[++class51.field746 - 1] = class73.method1771(var4, var5, var6);
            return 1;
         } else if (var0 == 4028) {
            class51.field746 -= 3;
            var4 = class51.field747[class51.field746];
            var5 = class51.field747[class51.field746 + 1];
            var6 = class51.field747[class51.field746 + 2];
            class51.field747[++class51.field746 - 1] = class125.method2244(var4, var5, var6);
            return 1;
         } else if (var0 == 4029) {
            class51.field746 -= 3;
            var4 = class51.field747[class51.field746];
            var5 = class51.field747[1 + class51.field746];
            var6 = class51.field747[class51.field746 + 2];
            var7 = 31 - var6;
            class51.field747[++class51.field746 - 1] = var4 << var7 >>> var7 + var5;
            return 1;
         } else if (var0 == 4030) {
            class51.field746 -= 4;
            var4 = class51.field747[class51.field746];
            var5 = class51.field747[1 + class51.field746];
            var6 = class51.field747[class51.field746 + 2];
            var7 = class51.field747[3 + class51.field746];
            var4 = class125.method2244(var4, var6, var7);
            var8 = class119.method2189(1 + (var7 - var6));
            if (var5 > var8) {
               var5 = var8;
            }

            class51.field747[++class51.field746 - 1] = var4 | var5 << var6;
            return 1;
         } else if (var0 == 4032) {
            class51.field747[class51.field746 - 1] = class81.method1872(class51.field747[class51.field746 - 1]);
            return 1;
         } else if (4033 == var0) {
            class51.field747[class51.field746 - 1] = class86.method1981(class51.field747[class51.field746 - 1]);
            return 1;
         } else if (4034 == var0) {
            class51.field746 -= 2;
            var4 = class51.field747[class51.field746];
            var5 = class51.field747[class51.field746 + 1];
            var6 = class246.method4175(var4, var5);
            class51.field747[++class51.field746 - 1] = var6;
            return 1;
         } else if (4035 == var0) {
            class51.field747[class51.field746 - 1] = Math.abs(class51.field747[class51.field746 - 1]);
            return 1;
         } else {
            return 2;
         }
      }
   }
}
