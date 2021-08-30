public class class69 implements Runnable {
   public static int canvasWidth;
   static class266 field976;
   static class320 field972;
   static int field977;
   boolean field966 = true;
   int field967 = 0;
   int[] field968 = new int[500];
   int[] field969 = new int[500];
   Object field975 = new Object();
   long[] millis = new long[500];

   class69() {
   }

   public void run() {
      for(; this.field966; class210.method3831(50L)) {
         synchronized(this.field975) {
            if (this.field967 < 500) {
               this.field968[this.field967] = MouseHandler.field142;
               this.field969[this.field967] = MouseHandler.field145;
               this.millis[this.field967] = MouseHandler.field144;
               ++this.field967;
            }
         }
      }

   }

   static int method1694(int var0, class59 var1, boolean var2) {
      if (var0 == 6900) {
         class51.field738[++class2.field4 - 1] = "";
         return 1;
      } else if (var0 == 6950) {
         class51.field747[++class51.field746 - 1] = -1;
         return 1;
      } else {
         return 2;
      }
   }
}
