public class Varps {
   public static int[] main;
   public static int[] temp;
   public static short[][] field2915;
   static int[] field2917 = new int[32];
   static String field2918;

   static {
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         field2917[var1] = var0 - 1;
         var0 += var0;
      }

      temp = new int[4000];
      main = new int[4000];
   }
}
