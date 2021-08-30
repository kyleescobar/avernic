public final class class5 {
   static int field7;

   static VerticalAlignment[] method17() {
      return new VerticalAlignment[]{VerticalAlignment.field1654, VerticalAlignment.field1653, VerticalAlignment.field1655};
   }

   public static void method16(int var0) {
      if (-1 != var0) {
         if (class101.field1282[var0]) {
            Interface.field2951.method4470(var0);
            if (Interface.components[var0] != null) {
               boolean var2 = true;

               for(int var3 = 0; var3 < Interface.components[var0].length; ++var3) {
                  if (null != Interface.components[var0][var3]) {
                     if (Interface.components[var0][var3].field2977 != 2) {
                        Interface.components[var0][var3] = null;
                     } else {
                        var2 = false;
                     }
                  }
               }

               if (var2) {
                  Interface.components[var0] = null;
               }

               class101.field1282[var0] = false;
            }
         }
      }
   }
}
