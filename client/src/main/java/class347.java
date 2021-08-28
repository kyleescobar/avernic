public class class347 {
   static final int[] field3952 = new int[2048];
   static final int[] field3954 = new int[2048];

   static {
      double var0 = 0.0030679615757712823D;

      for(int var2 = 0; var2 < 2048; ++var2) {
         field3952[var2] = (int)(65536.0D * Math.sin((double)var2 * var0));
         field3954[var2] = (int)(65536.0D * Math.cos((double)var2 * var0));
      }

   }

   static final int method5429(class367 var0) {
      if (null == var0) {
         return 12;
      } else {
         switch(var0.field4114) {
         case 0:
            return 20;
         default:
            return 12;
         }
      }
   }
}
