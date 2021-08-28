public class SpriteMask extends class349 {
   public final int height;
   public final int width;
   public final int[] field2905;
   public final int[] field2908;

   public static int method4149(Buffer var0, String var1) {
      int var3 = var0.offset;
      byte[] var4 = class105.method2094(var1);
      var0.method5946(var4.length);
      var0.offset += class252.field3117.method4289(var4, 0, var4.length, var0.payload, var0.offset);
      return var0.offset - var3;
   }

   static int method4150(int var0) {
      class45 var2 = (class45)class85.field1194.method5716((long)var0);
      if (var2 == null) {
         return -1;
      } else {
         return var2.field3960 == class85.field1195.field3731 ? -1 : ((class45)var2.field3960).field378;
      }
   }

   SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
      this.width = var1;
      this.height = var2;
      this.field2905 = var3;
      this.field2908 = var4;
   }

   public boolean contains(int var1, int var2) {
      if (var2 >= 0 && var2 < this.field2908.length) {
         int var4 = this.field2908[var2];
         if (var1 >= var4 && var1 <= this.field2905[var2] + var4) {
            return true;
         }
      }

      return false;
   }
}
