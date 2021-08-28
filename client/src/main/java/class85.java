import java.util.HashMap;
import java.util.Map;

public class class85 {
   protected static class137 field1199;
   static class330 js5Socket;
   static int field1200 = 0;
   static final class301 field1195 = new class301();
   static final class363 field1194 = new class363(1024);
   static final Map field1196 = new HashMap();

   public static PlayerType[] getPlayerTypes() {
      return new PlayerType[]{PlayerType.field3545, PlayerType.field3544, PlayerType.field3549, PlayerType.field3540, PlayerType.field3541, PlayerType.field3542, PlayerType.field3539};
   }

   static int method1936(int var0, int var1) {
      if (-2 == var0) {
         return 12345678;
      } else if (-1 == var0) {
         if (var1 < 0) {
            var1 = 0;
         } else if (var1 > 127) {
            var1 = 127;
         }

         var1 = 127 - var1;
         return var1;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return var1 + (var0 & '\uff80');
      }
   }

   static final void method1958(class71 var0) {
      long var2 = 0L;
      int var4 = -1;
      int var5 = 0;
      int var6 = 0;
      if (0 == var0.field1009) {
         var2 = class166.field1925.method3523(var0.field1018, var0.field1016, var0.field1011);
      }

      if (var0.field1009 == 1) {
         var2 = class166.field1925.method3524(var0.field1018, var0.field1016, var0.field1011);
      }

      if (var0.field1009 == 2) {
         var2 = class166.field1925.method3525(var0.field1018, var0.field1016, var0.field1011);
      }

      if (3 == var0.field1009) {
         var2 = class166.field1925.method3628(var0.field1018, var0.field1016, var0.field1011);
      }

      if (0L != var2) {
         int var7 = class166.field1925.method3527(var0.field1018, var0.field1016, var0.field1011, var2);
         var4 = class79.method1843(var2);
         var5 = var7 & 31;
         var6 = var7 >> 6 & 3;
      }

      var0.field1012 = var4;
      var0.field1010 = var5;
      var0.field1013 = var6;
   }
}
