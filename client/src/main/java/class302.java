public final class class302 extends class303 {
   public class302(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
      super(var1, var2, var3, var4, var5, var6, var7);
   }

   public class302(byte[] var1) {
      super(var1);
   }

   final void method4874(byte[] var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var2 + var3 * class394.field4245;
      int var8 = class394.field4245 - var4;
      int var9 = 0;
      int var10 = 0;
      int var11;
      if (var3 < class394.field4247) {
         var11 = class394.field4247 - var3;
         var5 -= var11;
         var3 = class394.field4247;
         var10 += var11 * var4;
         var7 += var11 * class394.field4245;
      }

      if (var3 + var5 > class394.field4244) {
         var5 -= var3 + var5 - class394.field4244;
      }

      if (var2 < class394.field4249) {
         var11 = class394.field4249 - var2;
         var4 -= var11;
         var2 = class394.field4249;
         var10 += var11;
         var7 += var11;
         var9 += var11;
         var8 += var11;
      }

      if (var2 + var4 > class394.field4248) {
         var11 = var2 + var4 - class394.field4248;
         var4 -= var11;
         var9 += var11;
         var8 += var11;
      }

      if (var4 > 0 && var5 > 0) {
         method4869(class394.field4250, var1, var6, var10, var7, var4, var5, var8, var9);
      }
   }

   final void method4845(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var2 + var3 * class394.field4245;
      int var9 = class394.field4245 - var4;
      int var10 = 0;
      int var11 = 0;
      int var12;
      if (var3 < class394.field4247) {
         var12 = class394.field4247 - var3;
         var5 -= var12;
         var3 = class394.field4247;
         var11 += var12 * var4;
         var8 += var12 * class394.field4245;
      }

      if (var3 + var5 > class394.field4244) {
         var5 -= var3 + var5 - class394.field4244;
      }

      if (var2 < class394.field4249) {
         var12 = class394.field4249 - var2;
         var4 -= var12;
         var2 = class394.field4249;
         var11 += var12;
         var8 += var12;
         var10 += var12;
         var9 += var12;
      }

      if (var2 + var4 > class394.field4248) {
         var12 = var2 + var4 - class394.field4248;
         var4 -= var12;
         var10 += var12;
         var9 += var12;
      }

      if (var4 > 0 && var5 > 0) {
         method4871(class394.field4250, var1, var6, var11, var8, var4, var5, var9, var10, var7);
      }
   }
}
