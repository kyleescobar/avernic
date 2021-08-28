public class class346 {
   static final int[] field3942 = new int[16384];
   static final int[] field3946 = new int[16384];

   static {
      double var0 = 3.834951969714103E-4D;

      for(int var2 = 0; var2 < 16384; ++var2) {
         field3942[var2] = (int)(16384.0D * Math.sin((double)var2 * var0));
         field3946[var2] = (int)(16384.0D * Math.cos((double)var2 * var0));
      }

   }

   static final void method5428(Interface var0, int var1, int var2, int var3) {
      SpriteMask var5 = var0.getSpriteMask(false);
      if (var5 != null) {
         if (client.minimapState < 3) {
            class50.field736.method6396(var1, var2, var5.width, var5.height, 25, 25, client.cameraAngleY, 256, var5.field2908, var5.field2905);
         } else {
            class394.method6277(var1, var2, 0, var5.field2908, var5.field2905);
         }

      }
   }
}
