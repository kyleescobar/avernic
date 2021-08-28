public class class244 {
   public static int[] field2911;
   public static int[] field2912;
   public static short[][] field2915;
   static int[] field2917 = new int[32];
   static String field2918;

   static {
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         field2917[var1] = var0 - 1;
         var0 += var0;
      }

      field2912 = new int[4000];
      field2911 = new int[4000];
   }
}
