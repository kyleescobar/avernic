import java.math.BigInteger;

public class class53 {
   static final BigInteger field773 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
   static final BigInteger field776 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

   public static void method1538() {
      class159.field1861.method3883();
      class159.field1858.method3883();
   }

   static final int method1539(int var0, int var1) {
      if (var0 == -1) {
         return 12345678;
      } else {
         var1 = var1 * (var0 & 127) / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return var1 + (var0 & '\uff80');
      }
   }

   static final void method1540() {
      for(class52 var1 = (class52)client.field539.method4687(); null != var1; var1 = (class52)client.field539.method4678()) {
         if (class285.plane == var1.field760 && !var1.field767) {
            if (client.cycle >= var1.field759) {
               var1.method1531(client.field556);
               if (var1.field767) {
                  var1.remove();
               } else {
                  class166.field1925.method3508(var1.field760, var1.field758, var1.field762, var1.field763, 60, var1, 0, -1L, false);
               }
            }
         } else {
            var1.remove();
         }
      }

   }

   static String method1535(String var0) {
      PlayerType[] var2 = class85.getPlayerTypes();

      for(int var3 = 0; var3 < var2.length; ++var3) {
         PlayerType var4 = var2[var3];
         if (var4.field3543 != -1 && var0.startsWith(class77.method1822(var4.field3543))) {
            var0 = var0.substring(6 + Integer.toString(var4.field3543).length());
            break;
         }
      }

      return var0;
   }
}
