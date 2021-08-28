public class class142 extends class349 {
   public static class277 field1561;
   static class223 field1556 = new class223(64);
   static class25 field1560;
   public boolean field1557 = false;

   class142() {
   }

   void method2400(Buffer var1) {
      while(true) {
         int var3 = var1.readUnsignedByte();
         if (var3 == 0) {
            return;
         }

         this.method2391(var1, var3);
      }
   }

   static void method2389() {
      for(class50 var1 = (class50)class50.field720.method4687(); null != var1; var1 = (class50)class50.field720.method4678()) {
         if (null != var1.field733) {
            var1.method1386();
         }
      }

   }

   void method2391(Buffer var1, int var2) {
      if (var2 == 2) {
         this.field1557 = true;
      }

   }

   static final void method2399(Interface[] var0, int var1) {
      for(int var3 = 0; var3 < var0.length; ++var3) {
         Interface var4 = var0[var3];
         if (var4 != null && var1 == var4.field3001 && (!var4.field2993 || !class151.method2531(var4))) {
            int var6;
            if (0 == var4.field2977) {
               if (!var4.field2993 && class151.method2531(var4) && var4 != class245.field2923) {
                  continue;
               }

               method2399(var0, var4.id);
               if (null != var4.field3061) {
                  method2399(var4.field3061, var4.id);
               }

               InterfaceParent var5 = (InterfaceParent)client.interfaceParents.get((long)var4.id);
               if (null != var5) {
                  var6 = var5.field950;
                  if (class251.method4294(var6)) {
                     method2399(Interface.components[var6], -1);
                  }
               }
            }

            if (6 == var4.field2977) {
               if (-1 != var4.field3005 || var4.field3048 != -1) {
                  boolean var8 = class144.method2447(var4);
                  if (var8) {
                     var6 = var4.field3048;
                  } else {
                     var6 = var4.field3005;
                  }

                  if (var6 != -1) {
                     class159 var7 = class48.method1312(var6);

                     for(var4.field3090 += client.field556; var4.field3090 > var7.field1865[var4.field3094]; class81.invalidateComponent(var4)) {
                        var4.field3090 -= var7.field1865[var4.field3094];
                        ++var4.field3094;
                        if (var4.field3094 >= var7.field1863.length) {
                           var4.field3094 -= var7.field1862;
                           if (var4.field3094 < 0 || var4.field3094 >= var7.field1863.length) {
                              var4.field3094 = 0;
                           }
                        }
                     }
                  }
               }

               if (var4.field3014 != 0 && !var4.field2993) {
                  int var9 = var4.field3014 >> 16;
                  var6 = var4.field3014 << 16 >> 16;
                  var9 *= client.field556;
                  var6 *= client.field556;
                  var4.field3009 = var9 + var4.field3009 & 2047;
                  var4.field3010 = var6 + var4.field3010 & 2047;
                  class81.invalidateComponent(var4);
               }
            }
         }
      }

   }
}
